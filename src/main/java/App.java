import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {
    static Logger log = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {
        try {
            throw new RuntimeException("Nereala kluda");
        } catch (RuntimeException e) {
            log.error("Java7 Maven project", e);
        }

        log.info("Java7 Maven project");
        log.trace("Java7 Maven project");
        log.debug("Java7 Maven project");
        log.warn("Java7 Maven project");
        log.error("Java7 Maven project");

    }
}
