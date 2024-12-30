package ir.omidashouri.twodatabase.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.Collection;

/**
 * @author Omid Ashouri on 12/30/24 2:03 PM
 */
@Component
@Aspect
@Slf4j
public class LoggingAspect {


    @Pointcut("@annotation(Loggable)")
    public void executeLogging() {

    }

/*    @Before("executeLogging()")
    public void logMethodCall(JoinPoint joinPoint) {
        StringBuilder message = new StringBuilder("Method=");
        message.append(joinPoint.getSignature().getName());
        Object[] args = joinPoint.getArgs();
        if (null != args && args.length > 0) {
            message.append(" | args=[ ");
            Arrays.asList(args).forEach(arg -> message.append(arg).append(" | "));
        }
        message.append("]");
        log.info(message.toString().replace("| ]", "]"));
    }*/

    @AfterReturning(pointcut = "executeLogging()", returning = "returnValue")
    public void logMethodCallAfterReturning(JoinPoint joinPoint, Object returnValue) {
        StringBuilder message = new StringBuilder("Method=");
        message.append(joinPoint.getSignature().getName());
        Object[] args = joinPoint.getArgs();
        if (null != args && args.length > 0) {
            message.append(" | args=[ ");
            Arrays.asList(args).forEach(arg -> message.append(arg).append(" | "));
        }
        message.append("]");

        if(returnValue instanceof Collection<?>) {
          message.append(" returning: ").append((((Collection<?>) returnValue).size())).append("instances");
        }else {
          message.append(", returning: ").append(returnValue.toString());
        }
        log.info(message.toString().replace("| ]", "]"));
    }
}
