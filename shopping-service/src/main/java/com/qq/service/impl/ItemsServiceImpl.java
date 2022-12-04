package com.qq.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.qq.mapper.ItemsMapper;
import com.qq.pojo.Items;
import com.qq.service.ItemsService;
import org.springframework.stereotype.Service;

/**
* @author 51361
* @description 针对表【items(商品表 商品信息相关表：分类表，商品图片表，商品规格表，商品参数表)】的数据库操作Service实现
* @createDate 2022-12-04 19:45:52
*/
@Service
public class ItemsServiceImpl extends ServiceImpl<ItemsMapper, Items>
    implements ItemsService {

}




