package edu.logs;

import a.b.c.DaoImpl;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class Main {

    /*
    *
    *
    * fatal
    * error
    * warn
    * info
    * debug
    * trace
    *
    *
    * */


    private static final Logger log = LogManager.getLogger(Main.class);

    public static void main(String[] args) {

        log.fatal("Hello from fatal");
        log.error("Hello from error");
        log.warn("Hello from warn");
        log.info("Hello from info");
        log.debug("Hello from debug");
        log.trace("Hello from trace");

        Service service = new Service();
        service.greeting("Jane");

        DaoImpl dao = new DaoImpl();
        dao.init();

    }
}
