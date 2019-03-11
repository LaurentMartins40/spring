package com.training.springcore;

import com.training.springcore.model.ApplicationInfo;
import com.training.springcore.service.CaptorServiceImpl;
import com.training.springcore.service.SiteServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;
import org.springframework.core.env.Environment;

import java.util.Set;

@ComponentScan
@Configuration
@PropertySource("classpath:application.properties")
@EnableAspectJAutoProxy
public class BigCorpApplicationConfig {
        @Autowired
        Environment environment;
        @Bean
        public ApplicationInfo applicationInfo(){
                String name = environment.getProperty("bigcorp.name");
                Integer version = environment.getProperty("bigcorp.version",Integer.class);
                Set<String> emails= environment.getProperty("bigcorp.emails",Set.class);
                String webSiteUrl = environment.getProperty("bigcorp.webSiteUrl");
                return new ApplicationInfo(name,version,emails,webSiteUrl);
        }
}