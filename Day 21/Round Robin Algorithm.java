import java.util.LinkedList;
import java.util.Queue;

class Process {
    String name;
    int burstTime;

    Process(String name, int burstTime) {
        this.name = name;
        this.burstTime = burstTime;
    }
}

public class RoundRobin {
    public static void main(String[] args) {
        // Create processes with their burst times
        Process p1 = new Process("P1", 10);
        Process p2 = new Process("P2", 5);
        Process p3 = new Process("P3", 8);

        // Set the time quantum
        int timeQuantum = 2;

        // Create a queue to store processes
        Queue<Process> processQueue = new LinkedList<>();

        // Add processes to the queue
        processQueue.add(p1);
        processQueue.add(p2);
        processQueue.add(p3);

        // Execute processes using Round Robin
        executeRoundRobin(processQueue, timeQuantum);
    }

    public static void executeRoundRobin(Queue<Process> processQueue, int timeQuantum) {
        while (!processQueue.isEmpty()) {
            // Get the next process from the front of the queue
            Process currentProcess = processQueue.poll();

            // Execute the process for the time quantum or until it finishes
            int remainingTime = Math.max(0, currentProcess.burstTime - timeQuantum);
            System.out.println("Executing " + currentProcess.name + " for " + timeQuantum + " units of time.");

            // If the process is not finished, add it back to the queue
            if (remainingTime > 0) {
                currentProcess.burstTime = remainingTime;
                processQueue.add(currentProcess);
            } else {
                System.out.println(currentProcess.name + " has finished execution.");
            }
        }
    }
}
