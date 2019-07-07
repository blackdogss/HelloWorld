package com.test.booleanjava.helloRS.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.test.booleanjava.helloRS.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author booleanjava
 * @since 2019-07-07
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

}
