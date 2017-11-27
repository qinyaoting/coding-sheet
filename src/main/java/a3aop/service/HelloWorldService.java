package a3aop.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created with IntelliJ IDEA.
 * User: chin
 * Date: 11/27/17
 * Time: 2:37 PM
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@Component
public class HelloWorldService {

    @Value("${name:World}")
    private String name;

    public String getHelloMessage() {
        return "Hello " + this.name;
    }
}
