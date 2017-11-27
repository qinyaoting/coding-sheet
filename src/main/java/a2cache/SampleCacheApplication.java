package a2cache;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.scheduling.annotation.EnableScheduling;
import a1simple.SampleSimpleApplication;

/**
 * Created with IntelliJ IDEA.
 * User: chin
 * Date: 11/23/17
 * Time: 11:14 AM
 * To change this template use File | Settings | File Templates.
 * Description:
 */
///@EnableCaching//1.1
///@EnableScheduling
///@SpringBootApplication
public class SampleCacheApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder().sources(SampleCacheApplication.class)
                .profiles("app").run(args);//1.2
    }
}
