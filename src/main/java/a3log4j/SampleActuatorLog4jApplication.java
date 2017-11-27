package a3log4j;

import a3logback.SampleLogbackApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

/**
 * Created with IntelliJ IDEA.
 * User: chin
 * Date: 11/27/17
 * Time: 1:56 PM
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@SpringBootApplication
public class SampleActuatorLog4jApplication {

    @Bean
    public InMemoryUserDetailsManager inMemoryUserDetailsManager() {
        //return new InMemoryUserDetailsManager(User.withDefaultPasswordEncoder()
          //      .username("user").password("password").roles("USER").build());
        return null;
    }

    public static void main(String[] args) {
        SpringApplication.run(SampleLogbackApplication.class,args);
    }
}
