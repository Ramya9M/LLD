package org.example.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;


@Data
public class BidRange {

    double lowestBidAmt;

    public BidRange(double lowestBidAmt, double highestBidAmt) {
        this.lowestBidAmt = lowestBidAmt;
        this.highestBidAmt = highestBidAmt;
    }

    double highestBidAmt;
}
