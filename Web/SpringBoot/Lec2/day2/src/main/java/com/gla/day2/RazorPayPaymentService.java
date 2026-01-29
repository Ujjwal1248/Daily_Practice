package com.gla.day2;


import org.springframework.stereotype.Component;

@Component
public class RazorPayPaymentService {
    public String pay(){
        String payment = "RazorPay";
        System.out.println("Payment done From: "+ payment);
        return payment;
    }
}
