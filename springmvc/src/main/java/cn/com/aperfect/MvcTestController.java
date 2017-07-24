package cn.com.aperfect;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by daive on 2017/7/24.
 */
@RestController
public class MvcTestController {

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
