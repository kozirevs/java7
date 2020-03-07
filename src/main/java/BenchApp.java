import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BenchApp {
    static Logger log = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {
        Bench bench = new Bench(1);
        log.info("Created bench on main thread");
        SeatTakerThread seatTakerThread1 = new SeatTakerThread(bench);
        SeatTakerThread seatTakerThread2 = new SeatTakerThread(bench);
        seatTakerThread1.start();
        seatTakerThread2.start();
        log.info("Finished work on main thread");
    }
}
