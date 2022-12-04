package com.qq.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.qq.mapper.OrderItemsMapper;
import com.qq.pojo.OrderItems;
import com.qq.service.OrderItemsService;
import org.springframework.stereotype.Service;

/**
* @author 51361
* @description 针对表【order_items(订单商品关联表 )】的数据库操作Service实现
* @createDate 2022-12-04 19:45:52
*/
@Service
public class OrderItemsServiceImpl extends ServiceImpl<OrderItemsMapper, OrderItems>
    implements OrderItemsService {

}




