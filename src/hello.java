import java.util.logging.Logger;

public class LoggingExample {

    // Create a logger instance
    private static final Logger logger = Logger.getLogger(LoggingExample.class.getName());

    public static void main(String[] args) {
        // Using the logger to log information instead of Sysout
        logger.info("Application started.");

        // Application logic
        int sum = addNumbers(10, 20);
        logger.info("The sum is: " + sum);

        // End of the application
        logger.info("Application finished.");
    }

    public static int addNumbers(int a, int b) {
        return a + b;
    }
}
