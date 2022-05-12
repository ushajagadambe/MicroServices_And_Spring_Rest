package com.microserice.project_03_BillingService_Producer;

import org.springframework.stereotype.Component;

import java.io.Serializable;

@Component
public class Billing implements Serializable {

    private String bill_id;

    public void setBill_id(String bill_id) {
        this.bill_id = bill_id;
    }

    public String getBill_id() {
        return bill_id;
    }

    public Billing() {
    }
}
