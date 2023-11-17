package com.tarento.cellmark.model;

import lombok.*;
import lombok.extern.slf4j.Slf4j;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
@Slf4j
public class CustomerOrderSearchModel {
    private String value1;
    private String value2;
}
