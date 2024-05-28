package org.designpattern.behavioral.chain_of_responsility.handlers;

public class ErrorSupportHandler extends SupportHandler {
    public void handleRequest(String request) {
        System.out.println("Không thể xử lý - " + request);
    }
}
