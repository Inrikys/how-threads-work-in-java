Reasons to terminate a thread
- thread consume resources
   - memory and kernel resources
   - cpu cycles and cache memory 
- if a thread finished its work, but the application is still running,
we want to clean up the thread's resources
- if a thread is misbehaving, we want to stop it

Daemon threads
- Background tasks, that should not block our
application from terminanting  
**Example**: File saving thread in a Text Editor
- Code in a worker thread is not under out control, and we do
not want it to block our application from terminanting  
**Example**: Worker thread that uses an external library

Conteúdo retirado do curso https://www.udemy.com/course/java-multithreading-concurrency-performance-optimization

informações sobre o autor abaixo.

Code examples for the online
course [Java Multithreading, Concurrency & Performance Optimization](https://www.udemy.com/java-multithreading-concurrency-performance-optimization)

Author : Michael Pogrebinsky
