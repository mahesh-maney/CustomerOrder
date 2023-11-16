package com.tarento.cellmark.controller;

import com.tarento.cellmark.handler.CustomerOrderHandler;
import com.tarento.cellmark.model.CustomerOrderSearchModel;
import com.tarento.cellmark.model.SampleResultSet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/v1/customerorder")
public class CustomerOrderController {

    @Autowired
    private CustomerOrderHandler customerOrderHandler;

    @PostMapping(value = "/search", consumes = "application/json", produces = "application/json")
    public SampleResultSet searchOrders(@RequestBody final CustomerOrderSearchModel customerOrderSearchModel){
        return customerOrderHandler.searchOrders(customerOrderSearchModel);
    }
}
