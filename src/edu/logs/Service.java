package edu.logs;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Service {

    private static final Logger log = LogManager.getLogger(Service.class);

    public String greeting(String name) {
        log.debug("Name for greeting '{}'", name);
        return "Hello " + name;
    }

}
