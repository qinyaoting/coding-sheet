package a2redis;

import org.assertj.core.api.Assertions;
import org.junit.Rule;
import org.junit.Test;
import org.springframework.boot.test.rule.OutputCapture;
import org.springframework.data.redis.RedisConnectionFailureException;

/**
 * Created with IntelliJ IDEA.
 * User: chin
 * Date: 11/24/17
 * Time: 10:46 AM
 * To change this template use File | Settings | File Templates.
 * Description:
 */
public class SampleRedisApplicationTest {

    @Rule
    public OutputCapture outputCapture = new OutputCapture();

    @Test
    public void testDefaultSettings() throws Exception {
        try {
            SampleRedisApplication.main(new String[0]);
        } catch (Exception e) {
            if (!redisServerRunning(e))
                return;
        }
        String output = this.outputCapture.toString();
        Assertions.assertThat(output).contains("Found key:spring.boot.redis.test");
    }

    private boolean redisServerRunning(Throwable ex) {
        System.out.println(ex.getMessage());
        if (ex instanceof RedisConnectionFailureException)
            return false;
        return (ex.getCause()==null || redisServerRunning(ex.getCause()));
    }
}
