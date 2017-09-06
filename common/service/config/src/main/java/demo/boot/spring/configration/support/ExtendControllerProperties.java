package demo.boot.spring.configration.support;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Created by guwei on 2017/7/27.
 */
@ConfigurationProperties(prefix = "extend.controller")
public class ExtendControllerProperties implements InitializingBean {

    public static ExtendControllerProperties properties = new ExtendControllerProperties();

    @Override
    public void afterPropertiesSet() throws Exception {
        properties = this;
    }

}
