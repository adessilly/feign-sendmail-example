package com.example.testmail.dto;

import java.util.List;

public class Mail {

    private MailUser sender;
    private List<MailUser> to;
    private String subject;
    private String htmlContent;

    public MailUser getSender() {
        return sender;
    }

    public void setSender(MailUser sender) {
        this.sender = sender;
    }

    public List<MailUser> getTo() {
        return to;
    }

    public void setTo(List<MailUser> to) {
        this.to = to;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getHtmlContent() {
        return htmlContent;
    }

    public void setHtmlContent(String htmlContent) {
        this.htmlContent = htmlContent;
    }
}
