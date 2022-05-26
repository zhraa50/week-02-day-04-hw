package com.example.car.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;

@Data
public class Log {
    private String id;
    private String message;
    private LocalDate localDate;

    public Log(String id, String message) {
        this.id = id;
        this.message = message;
        this.localDate = LocalDate.now();
    }
}
