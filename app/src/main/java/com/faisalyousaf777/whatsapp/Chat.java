package com.faisalyousaf777.whatsapp;

import java.time.LocalDate;
import java.util.Objects;

public class Chat {
    private int chatId;
    private String name;
    private String message;
    private LocalDate date;

    public Chat(String name, String message, LocalDate date) {
        this.name = name;
        this.message = message;
        this.date = date;
    }

    public Chat(int chatId, String name, String message, LocalDate date) {
        this.chatId = chatId;
        this.name = name;
        this.message = message;
        this.date = date;
    }

    public int getChatId() {
        return chatId;
    }

    public void setChatId(int chatId) {
        this.chatId = chatId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Chat chat = (Chat) o;

        if (chatId != chat.chatId) return false;
        if (!Objects.equals(name, chat.name)) return false;
        if (!Objects.equals(message, chat.message)) return false;
        return Objects.equals(date, chat.date);
    }

}
