package a1simple.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created with IntelliJ IDEA.
 * User: chin
 * Date: 11/22/17
 * Time: 6:24 PM
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@Component  //1.1
public class HelloWorldService {
    @Value("${name:World}")     //1.2
    private String name;

    public String getHelloMessage() {
        return "Hello " + this.name;
    }

}
