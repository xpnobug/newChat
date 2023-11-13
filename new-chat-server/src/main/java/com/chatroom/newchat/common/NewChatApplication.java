package com.chatroom.newchat.common;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author zhongzb
 * @date 2021/05/27
 */
@SpringBootApplication(scanBasePackages = {"com.chatroom.newchat"})
public class NewChatApplication {

    public static void main(String[] args) {
        SpringApplication.run(NewChatApplication.class,args);
    }

}