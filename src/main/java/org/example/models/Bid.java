package org.example.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import org.example.service.BidService;
import org.example.service.BidServiceImpl;

@AllArgsConstructor
@Data
public class Bid {
    public Bid(int bidId, Buyer buyer, int auctionId, BidAction bidAction, double bidAmt) {
        this.bidId = bidId;
        this.buyer = buyer;
        this.auctionId = auctionId;
        this.bidAction = bidAction;
        this.bidAmt = bidAmt;
        this.validateAndSaveBid();
    }

    int bidId;
    Buyer buyer;
    int auctionId;
    BidAction bidAction;
    double bidAmt;

    BidService bidService = new BidServiceImpl();
    public void validateAndSaveBid(){
        bidService.validateBid(this);
    }
}
