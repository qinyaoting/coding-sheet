package a1simple;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;
import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created with IntelliJ IDEA.
 * User: chin
 * Date: 11/22/17
 * Time: 7:08 PM
 * To change this template use File | Settings | File Templates.
 * Description:
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringTestSampleSimpleApplicationTests {

    @Autowired
    ApplicationContext ctx;

    @Test
    public void testContextLoads() throws Exception {
        assertThat(this.ctx).isNotNull();
        assertThat(this.ctx.containsBean("helloWorldService")).isTrue();
        assertThat(this.ctx.containsBean("sampleSimpleApplication")).isTrue();
    }
}
