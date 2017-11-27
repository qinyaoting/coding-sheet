package a1.properties.service;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

/**
 * Created with IntelliJ IDEA.
 * User: chin
 * Date: 11/22/17
 * Time: 6:03 PM
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@Component
public class AppHealthIndicator implements HealthIndicator {
    @Override
    public Health health() {
        return Health.up().build();
    }
}
