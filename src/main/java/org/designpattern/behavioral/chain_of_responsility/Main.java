package org.designpattern.behavioral.chain_of_responsility;

import org.designpattern.behavioral.chain_of_responsility.handlers.*;

public class Main {
    public static void main(String[] args) {
        SupportHandler techSupport = new TechnicalSupportHandler();
        SupportHandler paymentSupport = new PaymentSupportHandler();
        SupportHandler accountSupport = new AccountSupportHandler();
        SupportHandler errorSupport = new ErrorSupportHandler();

        // Thứ tự các handler Tech -> Payment -> Account -> Error
        techSupport.setNextHandler(paymentSupport);
        paymentSupport.setNextHandler(accountSupport);
        accountSupport.setNextHandler(errorSupport);

        System.out.println("---Yêu cầu 1---");
        techSupport.handleRequest("Hỗ trợ kỹ thuật");
        System.out.println("\n---Yêu cầu 2---");
        techSupport.handleRequest("Hỗ trợ thanh toán");
        System.out.println("\n---Yêu cầu 3---");
        techSupport.handleRequest("Hỗ trợ tài khoản");
        System.out.println("\n---Yêu cầu 4---");
        techSupport.handleRequest("Yêu cầu không xác định");
    }

}
