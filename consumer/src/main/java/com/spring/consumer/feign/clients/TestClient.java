package com.spring.consumer.feign.clients;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author jifeng
 * @create 2019-06-13 11:31
 */
@FeignClient(name="provider-message")
public interface TestClient {

    @RequestMapping("/getMessage")
    String getMsg();
}
