package mymaven;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by sang on 2018/7/4.
 */
@RestController
public class HelloController {
    @GetMapping("/sayhello")
    public String hello() {
        return "梁景普 内蒙古乌兰察布市!";
    }
}
