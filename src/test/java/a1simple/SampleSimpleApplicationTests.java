package a1simple;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.springframework.boot.test.rule.OutputCapture;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created with IntelliJ IDEA.
 * User: chin
 * Date: 11/22/17
 * Time: 6:51 PM
 * To change this template use File | Settings | File Templates.
 * Description:
 */
public class SampleSimpleApplicationTests {

    @Rule
    public OutputCapture outputCapture = new OutputCapture();

    private String profiles;

    @Before
    public void init() {
        this.profiles = System.getProperty("spring.profiles.active");
    }

    @After
    public void after() {
        if (this.profiles != null) {
            System.setProperty("spring.profiles.active", this.profiles);
        }else {
            System.clearProperty("spring.profiles.active");
        }
    }


    @Test
    public void testDefaultSettings() throws Exception {
        SampleSimpleApplication.main(new String[0]);
        String output = this.outputCapture.toString();
        assertThat(output).contains("Hello tom");
    }

    @Test
    public void testCommandLineOverrides() throws Exception {
        SampleSimpleApplication.main(new String[]{"--name=Gordon"});
        String output = this.outputCapture.toString();
        assertThat(output).contains("Hello Gordon");
    }






















}
