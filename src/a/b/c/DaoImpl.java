package a.b.c;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class DaoImpl {

    private static final Logger log = LogManager.getLogger(DaoImpl.class);

    public void init() {
        log.info("Dao INIT");
        log.debug("Dao DEBUG");
    }

}
