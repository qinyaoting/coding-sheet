package a1simple;

import org.springframework.boot.ExitCodeGenerator;

/**
 * Created with IntelliJ IDEA.
 * User: chin
 * Date: 11/22/17
 * Time: 6:36 PM
 * To change this template use File | Settings | File Templates.
 * Description:
 */
public class ExitException extends RuntimeException implements ExitCodeGenerator {

    @Override
    public int getExitCode() {
        return 10;
    }
}
