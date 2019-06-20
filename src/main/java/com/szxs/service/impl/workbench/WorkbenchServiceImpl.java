package com.szxs.service.impl.workbench;

import com.szxs.entity.Task;
import com.szxs.entity.Tasktype;
import com.szxs.entity.User;
import com.szxs.mapper.workbench.WorkbenchMapper;
import com.szxs.service.workbench.WorkbenchService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class WorkbenchServiceImpl implements WorkbenchService {
    @Resource
    private WorkbenchMapper workbenchMapper;

    @Override
    public User login(String code, String password) {


        return workbenchMapper.login(code,password);
    }

    @Override
    public List<Tasktype> queryTasktype() {
        return workbenchMapper.queryTasktype();
    }

    @Override
    public List<Task> queryTask(Task task) {
        return workbenchMapper.queryTask(task);
    }

}
