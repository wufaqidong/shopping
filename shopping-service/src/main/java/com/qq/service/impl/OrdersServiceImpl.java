package com.qq.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.qq.mapper.OrdersMapper;
import com.qq.pojo.Orders;
import com.qq.service.OrdersService;
import org.springframework.stereotype.Service;

/**
* @author 51361
* @description 针对表【orders(订单表;)】的数据库操作Service实现
* @createDate 2022-12-04 19:45:53
*/
@Service
public class OrdersServiceImpl extends ServiceImpl<OrdersMapper, Orders>
    implements OrdersService {

}




