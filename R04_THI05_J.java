// ─── Rule 4: THI05-J (Thread APIs) - Do not use Thread.stop() to terminate threads ───
// Non-Compliant: Thread.stop() is deprecated, releases all locks abruptly, corrupts shared state
// public void stopWorker() {
//     workerThread.stop(); // unsafe, can leave objects in inconsistent state
// }

private volatile boolean running = true;

public void stopWorker() {
    running = false; // signal the thread to stop gracefully
}

public void run() {
    while (running) {
        // do work
    }
    // clean up resources safely here
}
