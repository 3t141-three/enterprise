package com.szxs.service.workbench;

import com.szxs.entity.Task;
import com.szxs.entity.Tasktype;
import com.szxs.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

public interface WorkbenchService {

    /**
     * 登录
     * @param code
     * @param password
     * @return
     */
    User login(String code, String password);

    /**
     * 查询所有分类
     * @return
     */
    List<Tasktype> queryTasktype();

    /**
     * 查询所有任务
     * @return
     */
    List<Task> queryTask(Task task);

    /**
     * 修改用户密码
     * @param user
     * @return
     */
    int updateUser(User user);
}
