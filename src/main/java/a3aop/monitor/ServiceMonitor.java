package a3aop.monitor;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * Created with IntelliJ IDEA.
 * User: chin
 * Date: 11/27/17
 * Time: 2:38 PM
 * To change this template use File | Settings | File Templates.
 * Description:
 */

@Aspect
@Component
public class ServiceMonitor {

    @AfterReturning("execution(* a3aop.service.*Service.*(..))")//  拦截HelloWorldService, 添加日志功能
    public void logServiceAccess(JoinPoint joinPoint) {
        System.out.println("Completed:"+joinPoint);
    }

}
