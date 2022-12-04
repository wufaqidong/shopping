package com.qq.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.qq.mapper.CategoryMapper;
import com.qq.pojo.Category;
import com.qq.service.CategoryService;
import org.springframework.stereotype.Service;

/**
* @author 51361
* @description 针对表【category(商品分类 )】的数据库操作Service实现
* @createDate 2022-12-04 19:45:52
*/
@Service
public class CategoryServiceImpl extends ServiceImpl<CategoryMapper, Category>
    implements CategoryService {

}




