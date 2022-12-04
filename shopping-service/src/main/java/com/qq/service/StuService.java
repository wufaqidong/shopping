package com.qq.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.qq.pojo.Stu;

/**
* @author 51361
* @description 针对表【stu】的数据库操作Service
* @createDate 2022-12-04 19:45:53
*/
public interface StuService extends IService<Stu> {

    com.qq.pojo.Stu getStuInfo(int id);
}
