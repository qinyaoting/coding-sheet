package a3aop;

import a3aop.service.HelloWorldService;
import a3logback.SampleLogbackApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created with IntelliJ IDEA.
 * User: chin
 * Date: 11/27/17
 * Time: 2:41 PM
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@SpringBootApplication
public class SampleAopApplication implements CommandLineRunner {


    @Autowired
    private HelloWorldService helloWorldService;

    @Override
    public void run(String... strings) throws Exception {
        System.out.println(this.helloWorldService.getHelloMessage());
    }

    public static void main(String[] args) {
        SpringApplication.run(SampleAopApplication.class,args);
    }
}
