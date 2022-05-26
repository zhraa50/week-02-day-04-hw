package com.example.car.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.*;
import java.util.ArrayList;

@Data
public class User {
    @NotEmpty(message = "id is required")
    private String id;
    @NotEmpty(message = "username is required")
    @Size(min = 3)
    private String username;
    @NotEmpty(message = "password is required")
    @Size(min = 6)
    private String password;
    @NotNull(message = "balance is required")
    @Positive(message = "balance have to be positive")
    private Integer balance;
    private ArrayList<Car> carsOwned;

    public User(String id, String username, String password, Integer balance, ArrayList<Car> carsOwned) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.balance = balance;
        this.carsOwned = new ArrayList<>();
    }

}
