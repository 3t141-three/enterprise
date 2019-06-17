package com.szxs.service.impl.workbench;

import com.szxs.entity.User;
import com.szxs.mapper.workbench.LoginMapper;
import com.szxs.service.workbench.LoginService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class LoginServiceImpl implements LoginService {
    @Resource
    private LoginMapper loginMapper;

    @Override
    public User login(String code, String password) {


        return loginMapper.login(code,password);
    }
}
