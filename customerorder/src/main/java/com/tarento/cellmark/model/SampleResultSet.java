package com.tarento.cellmark.model;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class SampleResultSet {
    private String CO_NUMBER;
    private String ORDER_DATE;
    private String LOCATION_NAME;
    private String CUSTOMER_NUMBER;
    private String SHIPPER_NAME;
}
