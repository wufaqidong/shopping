package com.qq.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.qq.mapper.UsersMapper;
import com.qq.pojo.Users;
import com.qq.service.UsersService;
import org.springframework.stereotype.Service;

/**
* @author 51361
* @description 针对表【users(用户表 )】的数据库操作Service实现
* @createDate 2022-12-04 19:45:53
*/
@Service
public class UsersServiceImpl extends ServiceImpl<UsersMapper, Users>
    implements UsersService {

}




