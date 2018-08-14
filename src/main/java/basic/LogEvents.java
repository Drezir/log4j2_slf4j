package basic;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogEvents {

    private static final Logger LOG = LoggerFactory.getLogger(LogEvents.class);


    public static void main(String[] args) {
        LOG.info("Hello World");
        LOG.debug("Hello World");
        LOG.warn("Fuck World");
        LOG.error("Hello World");
    }
}
