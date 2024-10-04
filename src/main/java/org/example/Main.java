package org.example;

import org.example.models.*;
import org.example.service.UserService;
import org.example.service.UserServiceImpl;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        UserService userService = new UserServiceImpl();

        //Add buyer
        Buyer buyer1 = new Buyer(1,"ramya","abc@gmail.com",120000.00);
        Buyer buyer2 = new Buyer(2,"kishan","def@gmail.com",180000.00);

        userService.addBuyer(buyer1);
        userService.addBuyer(buyer2);

        //Add seller
        Seller seller1 = new Seller(1,"xyz","xyz@gmail.com",Arrays.asList());

        userService.addSeller(seller1);

        //create auction
        Auction auction1 = new Auction(1,seller1,Arrays.asList(),Arrays.asList(), AuctionStatus.OPEN, new BidRange(1000.00, 100000.00));

        //create/update bid
        Bid bid1 = new Bid(1,buyer2,auction1.getAuctionId(),BidAction.CREATE,17);



        //withdraw bid
        //close auction
        //update budget
    }
}