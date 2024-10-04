package org.example.service;

import org.example.models.Buyer;
import org.example.models.Seller;
import org.example.repository.UserRepository;

public class UserServiceImpl implements UserService {

    UserRepository userRepository = new UserRepository();
    @Override
    public void addBuyer(Buyer buyer) {
        userRepository.addBuyer(buyer);
    }

    @Override
    public void addSeller(Seller seller) {
       userRepository.addSeller(seller);
    }
}
