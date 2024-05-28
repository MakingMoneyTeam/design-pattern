package org.designpattern.behavioral.chain_of_responsility.handlers;

public class PaymentSupportHandler extends SupportHandler {
    public void handleRequest(String request) {
        if (request.equals("Hỗ trợ thanh toán")) {
            System.out.println("PaymentSupportHandler xử lý yêu cầu - " + request);
        } else if (nextHandler != null) {
            System.out.println("PaymentSupportHandler next");
            nextHandler.handleRequest(request);
        }
    }
}