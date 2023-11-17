package com.tarento.cellmark.model;

import lombok.*;
import lombok.extern.slf4j.Slf4j;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
@Slf4j
public class CustomerOrderModel {
    private String CO_NUMBER;
    private Date ORDER_DATE;
    private String LOCATION_NAME;
    private String CUSTOMER_NUMBER;
    private String SHIPPER_NAME;
    private String GENERATED_CO_NUMBER_SHIPPER_NAME;
    private String CUSTOMER_REF;
    private String AGENT_REF;
    private String TRADE_INSTRUCTIONS;
    private String SHIPPING_INSTRUCTIONS;
    private String ACCOUNT_INSTRUCTIONS;
    private String COMMENTS;
    private String AR_PMT_TERM_CODE;
    private String SALESPERSON_UNAME;
    private String CURRENCY_CODE;
    private String AGENT_VENDOR_NUMBER;
    private String PLACED_BY_UNAME;
    private String BILL_TO_CUSTOMER_NUMBER;
    private String BILL_TO_COUNTRY_CODE;
    private String BILL_TO_ADDR_LINE1;
    private String BILL_TO_ADDR_LINE2;
    private String BILL_TO_ADDR_CITY;
    private String BILL_TO_ADDR_STATE_ABBREV;
    private String BILL_TO_ADDR_POSTAL_CODE;
    private String ORDERED_BY;
    private String LOCKED_BY_UNAME;
    private Date LOCKED_TIME_STAMP;
    private String DOMESTIC_FLAG;
    private String HOLD_FLAG;
    private String SALESPERSON_ALERT_FLAG;
    private String CREDIT_ALERT_FLAG;
}
