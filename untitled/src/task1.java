import java.time.Duration;
import java.time.Instant;

public class task1 {
    public static void main(String[] args) {
        Thread timeThread = new Thread(() -> {
            Instant start = Instant.now();
            while (true) {
                Instant current = Instant.now();
                Duration duration = Duration.between(start, current);
                System.out.println("Пройшло " + duration.getSeconds() + " секунд");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        timeThread.start();

        Thread messageThread = new Thread(() -> {
            while (true) {
                System.out.println("Пройшло 5 секунд");
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        messageThread.start();
    }
}

