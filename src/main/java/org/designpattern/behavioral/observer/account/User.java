package org.designpattern.behavioral.observer.account;

public class User {
    private String email;
    private String ip;
    private LoginStatus status;

    public User(String email, String ip) {
        this.email = email;
        this.ip = ip;
        this.status = LoginStatus.INVALID;
    }

    public String getEmail() {
        return email;
    }

    public String getIp() {
        return ip;
    }

    public LoginStatus getStatus() {
        return status;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setStatus(LoginStatus status) {
        this.status = status;
    }
}
