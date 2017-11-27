package a3aop;

import org.junit.*;
import org.springframework.boot.test.rule.OutputCapture;
import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created with IntelliJ IDEA.
 * User: chin
 * Date: 11/27/17
 * Time: 2:47 PM
 * To change this template use File | Settings | File Templates.
 * Description:
 */
public class SampleAopApplicationTests {

    @Rule
    public OutputCapture outputCapture = new OutputCapture();

    private String profiles;

    @Before
    public void init() {
        this.profiles = System.getProperty("spring.profiles.active");
    }

    @After
    public void after() {
        if (this.profiles != null)
            System.setProperty("spring.profiles.active",this.profiles);
        else
            System.clearProperty("spring.profiles.active");
    }

    @Test
    public void testDefaultSettings() throws Exception {
        SampleAopApplication.main(new String[0]);
        String output = this.outputCapture.toString();
        assertThat(output).contains("Hello tom");
    }

    @Test
    public void testCommandLineOverrides() throws Exception {
        SampleAopApplication.main(new String[]{"--name=Jack"});
        String output = this.outputCapture.toString();
        assertThat(output).contains("Hello Jack");

    }
}
