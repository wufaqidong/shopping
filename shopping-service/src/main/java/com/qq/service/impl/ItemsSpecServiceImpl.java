package com.qq.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.qq.mapper.ItemsSpecMapper;
import com.qq.pojo.ItemsSpec;
import com.qq.service.ItemsSpecService;
import org.springframework.stereotype.Service;

/**
* @author 51361
* @description 针对表【items_spec(商品规格 每一件商品都有不同的规格，不同的规格又有不同的价格和优惠力度，规格表为此设计)】的数据库操作Service实现
* @createDate 2022-12-04 19:45:52
*/
@Service
public class ItemsSpecServiceImpl extends ServiceImpl<ItemsSpecMapper, ItemsSpec>
    implements ItemsSpecService {

}




