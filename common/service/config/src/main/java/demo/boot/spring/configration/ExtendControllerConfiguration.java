package demo.boot.spring.configration;

import demo.boot.spring.configration.support.ExtendControllerProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * Created by guwei on 2017/7/27.
 */
@Configuration
@EnableConfigurationProperties({ExtendControllerProperties.class})
public class ExtendControllerConfiguration {

}

