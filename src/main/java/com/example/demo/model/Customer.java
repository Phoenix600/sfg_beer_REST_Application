package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Customer {
    private String customerName;
    private UUID id;
    private Integer version;
    private LocalDateTime createdTime;
    private LocalDateTime lastModified;

}
