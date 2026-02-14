package com.chatInternet.appmodified.controller;

//import com.chat.app.model.ChatMessage;
import com.chatInternet.appmodified.model.ChatMessage;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ChatController {

    // Receives from: /app/sendMessage
    // Sends to: /topic/messages
    @MessageMapping("/sendMessage")
    @SendTo("/topic/messages")
    public ChatMessage sendMessage(ChatMessage message) {
        return message;
    }

    // Loads chat page
    @GetMapping("/chat")
    public String chat() {
        return "chat";
    }
}
