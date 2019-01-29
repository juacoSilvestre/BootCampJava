package log4j;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
public class log4j {
    private static final Logger log = Logger.getLogger(log4j.class);
    //static Logger log = Logger.getLogger(log4j.class);


    public static void main(String[] args) {
        DOMConfigurator.configure("log4j.xml");
        log.debug("Its working?");
        log.error("Error");


    }
}
