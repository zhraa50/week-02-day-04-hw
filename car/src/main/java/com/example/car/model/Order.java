package com.example.car.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Positive;

@AllArgsConstructor @Data
public class Order {
    @NotEmpty(message = "id is required")
    private String id;
    @NotEmpty(message = "userid is required")
    private String userid;
    @NotEmpty(message = "carid is required")
    private String carid;

}
