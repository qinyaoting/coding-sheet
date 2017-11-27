package a1simple;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotNull;

/**
 * Created with IntelliJ IDEA.
 * User: chin
 * Date: 11/22/17
 * Time: 6:37 PM
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@Validated
@Component
@ConfigurationProperties(prefix = "sample")//2.1
public class SampleConfigurationProperties {

    @NotNull
    private String name;//2.2

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
