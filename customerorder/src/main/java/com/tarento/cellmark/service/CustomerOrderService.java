package com.tarento.cellmark.service;

import com.tarento.cellmark.mapper.CustomerOrderMapper;
import com.tarento.cellmark.model.CustomerOrderSearchModel;
import com.tarento.cellmark.model.SampleResultSet;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class CustomerOrderService {

    @Autowired
    private CustomerOrderMapper customerOrderMapper;
    public SampleResultSet searchOrders(final CustomerOrderSearchModel customerOrderSearchModel) {
        return customerOrderMapper.searchOrders(customerOrderSearchModel.getValue1(), customerOrderSearchModel.getValue2());
    }
}
