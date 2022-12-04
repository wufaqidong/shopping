package com.qq.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.qq.mapper.StuMapper;
import com.qq.pojo.Stu;
import com.qq.service.StuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author 51361
 * @description 针对表【stu】的数据库操作Service实现
 * @createDate 2022-12-04 19:45:53
 */
@Service
public class StuServiceImpl extends ServiceImpl<StuMapper, Stu>
        implements StuService {

    @Autowired
    private StuMapper stuMapper;

    @Override
    public com.qq.pojo.Stu getStuInfo(int id) {
        return stuMapper.selectByPrimaryKey(id);
    }
}




