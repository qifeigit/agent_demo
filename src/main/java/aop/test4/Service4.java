package aop.test4;

import org.springframework.stereotype.Component;

@Component
public class Service4 {
    public String say(String name) {
        return "你好：" + name;
    }
}
