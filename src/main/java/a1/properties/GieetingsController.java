package a1.properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.metrics.CounterService;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IntelliJ IDEA.
 * User: chin
 * Date: 11/22/17
 * Time: 6:07 PM
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@RestController
@Component
public class GieetingsController {

    @Autowired
    private CounterService counterService;

    @RequestMapping("/greet")
    public String greet(){
        counterService.increment("myapp.greet.count");
        return "Hello!";
    }
}
