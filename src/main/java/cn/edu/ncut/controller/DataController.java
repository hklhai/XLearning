package cn.edu.ncut.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Ocean lin on 2017/7/1.
 */

@RestController
public class DataController {
    @RequestMapping("/demo")
    public String demo() {
        return "Live and Learn!";
    }

}
