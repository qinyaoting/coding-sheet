package a1simple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import a1simple.service.HelloWorldService;

/**
 * Created with IntelliJ IDEA.
 * User: chin
 * Date: 11/22/17
 * Time: 6:22 PM
 * To change this template use File | Settings | File Templates.
 * Description:
 */
/////@SpringBootApplication
public class SampleSimpleApplication implements CommandLineRunner {


    @Autowired      //1.3
    private HelloWorldService helloWorldService;

    @Override
    public void run(String... args) throws Exception {
        System.out.println(this.helloWorldService.getHelloMessage());
        if (args.length > 0&&args[0].equals("exitcode")) {
            throw new ExitException();
        }
        System.out.println(this.properties.getName());//2.3
    }

    public static void main(String[] args) {
        SpringApplication.run(SampleSimpleApplication.class,args);
    }



    @Autowired
    private SampleConfigurationProperties properties;
}
