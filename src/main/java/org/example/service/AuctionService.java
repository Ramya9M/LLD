package org.example.service;

import org.example.models.Auction;

public interface AuctionService {

    void saveAuction(Auction auction);

    void updateAuction();
    void closeAuction();
}
