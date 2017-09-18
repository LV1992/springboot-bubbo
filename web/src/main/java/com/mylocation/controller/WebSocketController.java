package com.mylocation.controller;

import com.mylocation.api.LocationService;
import com.mylocation.common.Response;
import com.mylocation.dto.LocationResult;
import com.mylocation.dto.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

/**
 * Created by lenovo on 2017/8/30.
 */
@RestController
public class WebSocketController {

    @Autowired
    private SimpMessagingTemplate messagingTemplate;

    @MessageMapping("/chat")
    //在springmvc 中可以直接获得principal,principal 中包含当前用户的信息
    public void handleChat(Principal principal, Message message) {

        /**
         * 此处是一段硬编码。如果发送人是a 则发送给 b 如果发送人是b 就发送给 a。
         */
        if (principal.getName().equals("a")) {
            //通过convertAndSendToUser 向用户发送信息,
            // 第一个参数是接收消息的用户,第二个参数是浏览器订阅的地址,第三个参数是消息本身

            messagingTemplate.convertAndSendToUser("b",
                    "/queue/notifications", principal.getName() + "-send:"
                            + message.getName());
        } else {
            messagingTemplate.convertAndSendToUser("a",
                    "/queue/notifications", principal.getName() + "-send:"
                            + message.getName());
        }
    }
}
