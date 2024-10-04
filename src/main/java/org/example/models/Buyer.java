package org.example.models;

import lombok.Builder;
import lombok.Data;


@Builder
public class Buyer extends User{

    public double budget;

    public Buyer(int userId, String name, String email, double budget) {
        super(userId, name, email);
        this.budget = budget;
    }
}
