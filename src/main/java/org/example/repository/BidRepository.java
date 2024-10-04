package org.example.repository;

import org.example.models.Bid;

import java.util.*;
public class BidRepository {

    List<Bid> bidList = new ArrayList<>();

    public void saveBid(Bid bid){
        bidList.add(bid);
        System.out.println("BID SUBMITTED");
    }
}
