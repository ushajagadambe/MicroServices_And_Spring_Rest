package com.microserice.project_03_ShoppingService_Consumer;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.io.Serializable;

@Component
@Data
public class Billing implements Serializable {
    private String bill_id;
    public Billing(String bill_id) {
        this.bill_id = bill_id;
    }

    @Override
    public String toString() {
        return "Billing{" +
                "bill_id='" + bill_id + '\'' +
                '}';
    }

    public Billing() {
    }
}
