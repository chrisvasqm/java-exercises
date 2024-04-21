package org.exercises.basics;

public class Stopwatch {
    private boolean hasStarted;

    public void start() {
        if (hasStarted) {
            System.out.println("Stopwatch already started");
        } else {
            hasStarted = true;
            System.out.println("Stopwatch started");
        }
    }

    public void stop() {
        if (!hasStarted) {
            System.out.println("Stopwatch already stopped");
        } else {
            hasStarted = false;
            System.out.println("Stopwatch stopped");
        }
    }
}
