package org.designpattern.behavioral.chain_of_responsility.handlers;

public class AccountSupportHandler extends SupportHandler {
    public void handleRequest(String request) {
        if (request.equals("Hỗ trợ tài khoản")) {
            System.out.println("AccountSupportHandler xử lý yêu cầu - " + request);
        } else if (nextHandler != null) {
            System.out.println("AccountSupportHandler next");
            nextHandler.handleRequest(request);
        }
    }
}