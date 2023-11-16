package com.tarento.cellmark.mapper;

import com.tarento.cellmark.model.SampleResultSet;
import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CustomerOrderMapper {

    @MapKey("CO_NUMBER")
    public SampleResultSet searchOrders(final String value1, final String value2);

}
