package a1.properties;

import a1.properties.service.DBSettings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created with IntelliJ IDEA.
 * User: chin
 * Date: 11/22/17
 * Time: 4:40 PM
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@Controller
//////////@SpringBootApplication
public class SampleController {

    @Value("${name}")
    private String name;        //@Value从配置文件中读取参数

    @RequestMapping("/")
    @ResponseBody
    String home() {
        //return "Hello world!";
        //return String.format("Hello %s!", name);
        return String.format("db setting %s!", dbSettings.toString());
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(SampleController.class,args);
    }

    @Autowired
    private DBSettings dbSettings;






}
