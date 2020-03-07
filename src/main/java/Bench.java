import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Bench {
    static Logger log = LoggerFactory.getLogger(Bench.class);
    private int availableSeats;

    public Bench(int availableSeats) {
        this.availableSeats = availableSeats;
    }

    public synchronized void takeASeat() {
        if (availableSeats > 0) {
            log.info("Taking a seat.");
            availableSeats--;
            log.info("Free seats left " + availableSeats);
        } else {
            log.info("There are no available seats. :(");
        }
    }
}