package com.lueng.springboot.cors.starter.autoconfig;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author J.M.Lueng
 * @since 2019/10/1
 */
@ConfigurationProperties(prefix = "cors")
public class CorsProperties {

    private Boolean enabled;
    private String pathPattern = "/**";
    private String[] allowedOrigins = {"*"};
    private String[] allowedMethods;
    private String[] allowedHeaders = {"*"};
    private String[] exposedHeaders;
    private Long maxAge = 1800L;
    private Boolean allowCredentials = true;

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public String getPathPattern() {
        return pathPattern;
    }

    public void setPathPattern(String pathPattern) {
        this.pathPattern = pathPattern;
    }

    public String[] getAllowedOrigins() {
        return allowedOrigins;
    }

    public void setAllowedOrigins(String[] allowedOrigins) {
        this.allowedOrigins = allowedOrigins;
    }

    public String[] getAllowedMethods() {
        return allowedMethods;
    }

    public void setAllowedMethods(String[] allowedMethods) {
        this.allowedMethods = allowedMethods;
    }

    public String[] getAllowedHeaders() {
        return allowedHeaders;
    }

    public void setAllowedHeaders(String[] allowedHeaders) {
        this.allowedHeaders = allowedHeaders;
    }

    public String[] getExposedHeaders() {
        return exposedHeaders;
    }

    public void setExposedHeaders(String[] exposedHeaders) {
        this.exposedHeaders = exposedHeaders;
    }

    public Long getMaxAge() {
        return maxAge;
    }

    public void setMaxAge(Long maxAge) {
        this.maxAge = maxAge;
    }

    public Boolean getAllowCredentials() {
        return allowCredentials;
    }

    public void setAllowCredentials(Boolean allowCredentials) {
        this.allowCredentials = allowCredentials;
    }
}
