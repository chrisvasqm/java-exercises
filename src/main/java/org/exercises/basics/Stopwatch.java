package org.exercises.basics;

public class Stopwatch {
    private boolean hasStarted;

    public void start() {
        if (hasStarted) {
            System.out.println("Stopwatch has already started");
        }
        else {
            System.out.println("Stopwatch started");
            hasStarted = true;
        }
    }

    public void stop() {
        if (!hasStarted) {
            System.out.println("Stopwatch has already stopped");
        } else {
            System.out.println("Stopwatch stopped");
            hasStarted = false;
        }
    }
}
