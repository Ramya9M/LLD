package org.example.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import org.example.service.AuctionService;
import org.example.service.AuctionServiceImpl;
import org.example.service.UserService;

import java.util.*;

@AllArgsConstructor
@Data
public class Auction {



    public Auction(int auctionId,Seller auctionOwner, List<Bid> bids,List<Buyer> auctionParticipants, AuctionStatus status, BidRange range) {
        this.auctionId = auctionId;
        this.bids = bids;
        this.auctionParticipants = auctionParticipants;
        this.status = status;
        this.range = range;
        this.auctionOwner = auctionOwner;
        saveAuction();
    }

    int auctionId;
    List<Bid> bids;
    Seller auctionOwner;
    List<Buyer> auctionParticipants;
    AuctionStatus status;
    BidRange range;

    AuctionService auctionService = new AuctionServiceImpl();

    public void saveAuction(){
        auctionService.saveAuction(this);
    }

}
