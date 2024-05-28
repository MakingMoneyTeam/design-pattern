package org.designpattern.behavioral.chain_of_responsility.handlers;

public class TechnicalSupportHandler extends SupportHandler {
    public void handleRequest(String request) {
        if (request.equals("Hỗ trợ kỹ thuật")) {
            System.out.println("TechnicalSupportHandler xử lý yêu cầu - " + request);
        } else if (nextHandler != null) {
            System.out.println("TechnicalSupportHandler next");
            nextHandler.handleRequest(request);
        }
    }
}