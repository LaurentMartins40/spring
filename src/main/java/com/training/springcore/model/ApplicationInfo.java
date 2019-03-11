package com.training.springcore.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;

import java.util.Set;

public class ApplicationInfo {

    @Value("${bigcorp.name}")
    private String name;
    @Value("${bigcorp.version}")
    private Integer version;
    @Value("${bigcorp.emails}")
    private Set<String> emails;
    @Value("${bigcorp.webSiteUrl}")
    private String webSiteUrl;

    public String getName() {
        return name;
    }

    public Integer getVersion() {
        return version;
    }

    public Set<String> getEmails() {
        return emails;
    }

    public String getWebSiteUrl() {
        return webSiteUrl;
    }
}
