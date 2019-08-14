package com.liy.cloud.controller;

import com.liy.cloud.enttiy.SystemRole;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RequestMapping("/consumer/system")
@RestController
public class SystemRoleContrller {

    @Autowired
    private RestTemplate restTemplate;

    private static final String  SERVICE_PROVIDER_URL="http://localhost:8081";

    @PostMapping("/save")
    public SystemRole saveObject(SystemRole role){
        String url = SERVICE_PROVIDER_URL+"/provider/system/save";
        return restTemplate.postForObject(url,role,SystemRole.class);
    }

    @PostMapping("/getById/{id}")
    public SystemRole getSystemRoleById(@PathVariable("id") Long id){
        return restTemplate.getForObject(SERVICE_PROVIDER_URL+"/provider/system/findById/"+id,SystemRole.class);

    }

    @PostMapping("/getAll")
    public List<SystemRole> getAll(){

        return restTemplate.getForObject(SERVICE_PROVIDER_URL+"/provider/system/getAll",List.class);
    }
}
