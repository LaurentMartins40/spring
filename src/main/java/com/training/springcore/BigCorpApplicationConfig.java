package com.training.springcore;

import com.training.springcore.model.ApplicationInfo;
import com.training.springcore.service.CaptorServiceImpl;
        import com.training.springcore.service.SiteServiceImpl;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;

@ComponentScan
@Configuration
@PropertySource("classpath:application.properties")
public class BigCorpApplicationConfig {
        @Bean
        public ApplicationInfo applicationInfo() {
                return new ApplicationInfo();
        }
}