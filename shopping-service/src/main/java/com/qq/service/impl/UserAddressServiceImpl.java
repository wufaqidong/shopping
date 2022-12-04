package com.qq.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.qq.mapper.UserAddressMapper;
import com.qq.pojo.UserAddress;
import com.qq.service.UserAddressService;
import org.springframework.stereotype.Service;

/**
* @author 51361
* @description 针对表【user_address(用户地址表 )】的数据库操作Service实现
* @createDate 2022-12-04 19:45:53
*/
@Service
public class UserAddressServiceImpl extends ServiceImpl<UserAddressMapper, UserAddress>
    implements UserAddressService {

}




