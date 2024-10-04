package org.example.models;

import lombok.Builder;

import java.util.*;

@Builder
public class Seller extends User{
    public Seller(int userId, String name, String email, List<Auction> createdAuctions) {
        super(userId, name, email);
        this.createdAuctions = createdAuctions;
    }

    List<Auction> createdAuctions;
}
