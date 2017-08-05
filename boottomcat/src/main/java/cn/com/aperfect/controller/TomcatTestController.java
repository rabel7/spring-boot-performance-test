package cn.com.aperfect.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.ThreadLocalRandom;

@RestController
public class TomcatTestController {

    /**
     * 不能包含{}
     * @param str
     * @return
     */
    @RequestMapping("/1kString")
    public String test1kString(@RequestBody String str) {
        return str;
    }

    public static void main(String[] args) {
        System.out.println(initString(25));
    }

    /**
     * 根据size初始化字符串
     *
     * @param size size为1表示1kb的字符串
     */
    private static String initString(int size) {
        int length = 1024 * size;
        StringBuilder builder = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            builder.append((char) (ThreadLocalRandom.current().nextInt(33, 128)));
        }

        return builder.toString();
    }



}
