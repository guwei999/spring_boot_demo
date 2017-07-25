package demo.boot.spring.web.web.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by guwei on 2017/7/26.
 */
@RestController
public class Demo {

    @RequestMapping("/")
    public String index() {
        return "hello spring boot";
    }

}
