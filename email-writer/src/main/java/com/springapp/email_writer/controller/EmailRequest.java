package com.springapp.email_writer.controller;

import lombok.Data;

@Data
public class EmailRequest {
    private String emailContent;
    private String tone;

    public String getEmailContent() {
        return emailContent;
    }

    public String getTone() {
        return tone;
    }
}
