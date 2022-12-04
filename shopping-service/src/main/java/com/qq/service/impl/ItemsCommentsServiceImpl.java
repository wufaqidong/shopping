package com.qq.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.qq.mapper.ItemsCommentsMapper;
import com.qq.pojo.ItemsComments;
import com.qq.service.ItemsCommentsService;
import org.springframework.stereotype.Service;

/**
* @author 51361
* @description 针对表【items_comments(商品评价表 )】的数据库操作Service实现
* @createDate 2022-12-04 19:45:52
*/
@Service
public class ItemsCommentsServiceImpl extends ServiceImpl<ItemsCommentsMapper, ItemsComments>
    implements ItemsCommentsService {

}




