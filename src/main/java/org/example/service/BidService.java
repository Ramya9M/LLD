package org.example.service;

import org.example.models.Bid;

public interface BidService {

    public void validateBid(Bid bid);

    public void saveBid(Bid bid);


}
