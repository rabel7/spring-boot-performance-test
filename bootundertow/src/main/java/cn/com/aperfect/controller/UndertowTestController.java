package cn.com.aperfect.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UndertowTestController {

    /**
     * 不能包含{}
     * @param str
     * @return
     */
    @RequestMapping("/1kString")
    public String test1kString(@RequestBody String str) {
        return str;
    }

}
