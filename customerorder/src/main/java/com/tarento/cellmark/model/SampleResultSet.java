package com.tarento.cellmark.model;

import lombok.*;
import lombok.extern.slf4j.Slf4j;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
@Slf4j
public class SampleResultSet {
    private String CO_NUMBER;
    private String ORDER_DATE;
    private String LOCATION_NAME;
    private String CUSTOMER_NUMBER;
    private String SHIPPER_NAME;
}
