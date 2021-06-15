package aop.test4;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class Aspect4 {
    @Pointcut("execution(* aop.test4.Service4.*(..))")
    public void pc() {
    }


    @Around("pc()")
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("@Around通知start");
        long startTime = System.currentTimeMillis();

        Object result = joinPoint.proceed();
        long endTime = System.currentTimeMillis();
        System.out.println("@Around绕通知end");
        System.out.println("法耗时 " + (endTime - startTime));
        return result;
    }

}
