package com.udacity.jwdnd.c1.review.model;

public class ChatMessage {

    private String username;
    private String messageText;
    private Integer messageId;

    public String getUsername() {
        return username;
    }

    public Integer getMessageId() {
        return messageId;
    }

    public void setMessageId(Integer messageId) {
        this.messageId = messageId;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getMessageText() {
        return messageText;
    }

    public void setMessageText(String messageText) {
        this.messageText = messageText;
    }
}
