package org.example.repository;

import org.example.models.Auction;
import java.util.*;

public class AuctionRepository {

    public static List<Auction> auctionList = new ArrayList<>();

    public void saveAction(Auction auction){
        auctionList.add(auction);
        System.out.println("AUCTION CREATED");
    }


}
