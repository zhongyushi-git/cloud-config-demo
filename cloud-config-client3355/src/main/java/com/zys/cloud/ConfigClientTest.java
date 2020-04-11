package com.zys.cloud;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class ConfigClientTest {

    @Value("${spring.application.name}")
    private String applicationName;


    @Value("${server.port}")
    private String serverPort;

    @Value("${config.info}")
    private String info;

    @GetMapping("/config")
    public String test(){
        String str="applicationName: "+applicationName+"\t"+"serverPort:"+serverPort;
        return str;
    }

    @GetMapping("/config2")
    public String test2(){
        String str="info: "+info;
        return str;
    }

}
