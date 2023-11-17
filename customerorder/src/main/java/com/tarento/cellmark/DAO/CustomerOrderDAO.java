package com.tarento.cellmark.DAO;

import com.tarento.cellmark.mapper.CustomerOrderMapper;
import com.tarento.cellmark.model.SampleResultSet;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class CustomerOrderDAO {

    private SqlSession session;

    public SampleResultSet searchOrders(final String value1, final String value2){
        CustomerOrderMapper mapper = session.getMapper(CustomerOrderMapper.class);
        return mapper.searchOrders(value1, value2);
    }
}
