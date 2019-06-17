package com.szxs.mapper.workbench;

import com.szxs.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface LoginMapper {

    /**
     * 登录
     * @param code
     * @param password
     * @return
     */
    User login(String code, String password);
}
