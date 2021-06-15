package aop.test4;


import org.junit.Test;
import org.springframework.aop.Advisor;
import org.springframework.aop.aspectj.AbstractAspectJAdvice;
import org.springframework.aop.aspectj.InstantiationModelAwarePointcutAdvisor;
import org.springframework.aop.framework.Advised;
import org.springframework.aop.framework.ProxyFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AspectTest11 {

    @Test
    public void test4() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(MainConfig4.class);
        context.refresh();
        Service4 service4 = context.getBean(Service4.class);
        System.out.println(service4.say("路人"));
    }

}


