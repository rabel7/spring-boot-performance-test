package cn.com.aperfect.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.HashMap;
import java.util.Map;

@Path("/")
@Component
public class JersyTestController {

//    /**
//     * http://127.0.0.1:port/rest/hello
//     * @return
//     */
//    @GET
//    @Produces(MediaType.APPLICATION_JSON)
//    @Path("/hello")
//    public Map<String, Object> hello() {
//        Map<String, Object> map = new HashMap<>();
//        map.put("code", "1");
//        map.put("codeMsg", "success");
//        return map;
//    }

    @GET
    @Path("/1kString")
    public String test1kString(@RequestBody String str) {
        return str;
    }

}
