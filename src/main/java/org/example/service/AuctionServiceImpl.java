package org.example.service;

import org.example.models.Auction;
import org.example.repository.AuctionRepository;

public class AuctionServiceImpl implements AuctionService{

    AuctionRepository auctionRepository = new AuctionRepository();
    @Override
    public void saveAuction(Auction auction) {
        auctionRepository.saveAction(auction);
    }

    @Override
    public void updateAuction() {

    }

    @Override
    public void closeAuction() {

    }
}
