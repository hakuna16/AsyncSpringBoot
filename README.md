# Async Spring Boot Application

We can achieve asynchronous behavior in spring boot application using two annotations like :

1) @EnableAsync 
2) @Async.

What is @EnableAsync ?
------------------------------------------------------------------------------------------------------------
This annotation and can be applied on application classes for asynchronous behavior. This annotation will look for methods marked with @Async annotation and run in background thread pools.

What is @Async ? 
------------------------------------------------------------------------------------------------------------
The @Async annotated methods can return CompletableFuture to hold the result of an asynchronous computation.

What is CompletableFuture ?
------------------------------------------------------------------------------------------------------------
CompletableFuture is used for asynchronous programming in Java. Asynchronous programming means writing non-blocking code by running a task on a separate thread than the main application thread and notifying the main thread about its progress, completion or failure.

It runs a task on a separate thread than the main application thread and notifies the main thread about its progress, completion or failure.

In this way, the main thread does not block or wait for the completion of the task. Other tasks execute in parallel. Parallelism improves the performance of the program.

Having this kind of parallelism greatly improves the performance of your programs.

A CompletableFuture is a class in Java. It belongs to java.util.cocurrent package. It implements CompletionStage and Future interface.