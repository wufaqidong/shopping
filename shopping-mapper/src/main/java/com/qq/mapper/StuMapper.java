package com.qq.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.qq.pojo.Stu;
import org.apache.ibatis.annotations.Mapper;

/**
* @author 51361
* @description 针对表【stu】的数据库操作Mapper
* @createDate 2022-12-04 19:45:53
* @Entity com.qq.pojo.Stu
*/
@Mapper
public interface StuMapper extends BaseMapper<Stu> {

    Stu selectByPrimaryKey(int id);
}




