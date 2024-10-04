package org.example.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;


@Data
public class User {

    int userId;
    String name;
    String email;

    public User(int userId, String name, String email) {
        this.userId = userId;
        this.name = name;
        this.email = email;
    }
}
