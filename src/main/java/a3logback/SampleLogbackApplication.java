package a3logback;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

/**
 * Created with IntelliJ IDEA.
 * User: chin
 * Date: 11/27/17
 * Time: 11:29 AM
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@SpringBootApplication
public class SampleLogbackApplication {

    private static final Logger loger = LoggerFactory
            .getLogger(SampleLogbackApplication.class);


    @PostConstruct
    public void logSomething() {
        loger.debug("Sample Debug Message");
        loger.trace("Sample Trace Message");
    }

    public static void main(String[] args) {
        SpringApplication.run(SampleLogbackApplication.class, args).close();
    }
}
