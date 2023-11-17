package com.tarento.cellmark.handler;

import com.tarento.cellmark.model.CustomerOrderSearchModel;
import com.tarento.cellmark.model.SampleResultSet;
import com.tarento.cellmark.service.CustomerOrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class CustomerOrderHandler {

    @Autowired
    private CustomerOrderService customerOrderService;

    public SampleResultSet searchOrders(final CustomerOrderSearchModel customerOrderSearchModel) {
        return customerOrderService.searchOrders(customerOrderSearchModel);
    }
}
