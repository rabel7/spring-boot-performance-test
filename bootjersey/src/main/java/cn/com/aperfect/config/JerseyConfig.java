package cn.com.aperfect.config;

import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.server.internal.process.Endpoint;
import org.glassfish.jersey.server.spring.scope.RequestContextFilter;

/**
 * Created by daive on 2017/7/26.
 */
public class JerseyConfig extends ResourceConfig {

    public JerseyConfig() {
        register(RequestContextFilter.class);
        //配置restful package.
        packages("cn.com.aperfect.controller");
        register(Endpoint.class);
    }
}
