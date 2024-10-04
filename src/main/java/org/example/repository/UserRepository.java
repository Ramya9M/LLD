package org.example.repository;

import org.example.models.Buyer;
import org.example.models.Seller;

import java.util.*;

public class UserRepository {

    List<Buyer> buyerList = new ArrayList<>();
    List<Seller> sellerList = new ArrayList<>();

    public void addBuyer(Buyer buyer){
        buyerList.add(buyer);
        System.out.println("BUYER CREATED");
    }

    public void addSeller(Seller seller){
        sellerList.add(seller);
        System.out.println("SELLER CREATED");
    }
}
