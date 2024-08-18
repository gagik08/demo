package com.task11.dto;

import lombok.*;

@Builder
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Table {
    private int id;
    private int number;
    private int places;
    private boolean isVip;
    private Integer minOrder;

}