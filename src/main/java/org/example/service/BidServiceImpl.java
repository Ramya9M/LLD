package org.example.service;

import org.example.models.Auction;
import org.example.models.Bid;
import org.example.repository.AuctionRepository;
import org.example.repository.BidRepository;

public class BidServiceImpl implements BidService {

    BidRepository bidRepository = new BidRepository();

    @Override
    public void validateBid(Bid bid) {

        if(isAuctionExist(bid.getAuctionId()) && isValidBidAmt(bid)){
            this.saveBid(bid);
        }
        System.out.println("bid cannot be created. Reason : Auction not exist or in valid amount");

    }
    @Override
    public void saveBid(Bid bid) {
       bidRepository.saveBid(bid);
    }

    private boolean isValidBidAmt(Bid bid) {

        Auction auction1 = AuctionRepository.auctionList.stream()
                .filter(auction -> auction.getAuctionId() == bid.getAuctionId())
                .findAny().get();

        return (auction1.getRange().getLowestBidAmt()<=bid.getBidAmt())
                && (bid.getBidAmt()<=auction1.getRange().getHighestBidAmt());
    }

    private boolean isAuctionExist(int id) {

        return AuctionRepository.auctionList.stream()
                .filter(auction -> auction.getAuctionId()==id)
                .findAny().isPresent();
    }


}
