package ADVANCED_JAVA.MULTI_THREADING;


// Creating a user-defined thread by extending the Thread class
class test extends Thread {

    // The run() method contains the task of the child thread
    // This method is executed ONLY when start() is called
    public void run() {

        // This statement is executed by the CHILD THREAD
        // It confirms that a separate thread is running
        System.out.println("Inside test Thread");
    }
}

public class MULTI_THERADING_INTRO {
// Main class

    // main() method is executed by the MAIN THREAD (created by JVM)
    public static void main(String[] args) {

        // Creating an object of the thread class
        // At this stage, the thread is in NEW state
        test t = new test();

        // start() creates a new thread and internally calls run()
        // This is the MOST IMPORTANT rule of multithreading
        // start() → New thread
        t.start();

        // This statement is executed by the MAIN THREAD
        // Main thread and child thread run concurrently
        System.out.println("Inside the main method");
    }

}

