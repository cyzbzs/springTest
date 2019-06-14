package com.spring.provider.controller;

import com.spring.provider.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jifeng
 * @create 2019-06-12 17:32
 */
@RestController
public class MessageController {

    @Autowired
    private MessageService messageService;

    @RequestMapping("/getMessage")
    public String getMessage(){
        return "provider提供信息：" + messageService.getMessage();
    }
}
