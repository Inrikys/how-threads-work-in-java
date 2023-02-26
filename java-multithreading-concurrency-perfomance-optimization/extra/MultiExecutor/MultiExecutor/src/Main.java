import java.util.List;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        List<Runnable> tasks = new ArrayList<>();

        Runnable bomDia = () -> {
            System.out.println("Bom dia from: " + Thread.currentThread().getName());
        };

        Runnable boaTarde = () -> {
            System.out.println("Boa tarde from: " + Thread.currentThread().getName());
        };

        Runnable boaNoite = () -> {
            System.out.println("Boa noite from: " + Thread.currentThread().getName());
        };

        tasks.addAll(List.of(bomDia, boaTarde, boaNoite));

        MultiExecutor multiExecutor = new MultiExecutor(tasks);

        // There is no way to know which thread will run first,
        // but they will run in parallel
        multiExecutor.executeAll();

    }

    public static class MultiExecutor {

        // Add any necessary member variables here
        private List<Thread> threads = new ArrayList<>();

        /*
         * @param tasks to executed concurrently
         */
        public MultiExecutor(List<Runnable> tasks) {
            // Complete your code here
            for (Runnable task : tasks) {
                this.threads.add(new Thread(task));
            }
        }

        /**
         * Starts and executes all the tasks concurrently
         */
        public void executeAll() {
            // complete your code here
            for (Thread thread : threads) {
                thread.start();
            }
        }
    }
}

