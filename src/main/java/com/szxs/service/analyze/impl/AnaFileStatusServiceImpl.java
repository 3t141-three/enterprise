package com.szxs.service.analyze.impl;

import com.szxs.entity.FileStatus;
import com.szxs.mapper.analyze.FileStatusMapper;
import com.szxs.service.analyze.AnaFileStatusService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class AnaFileStatusServiceImpl implements AnaFileStatusService {

    @Resource
    private FileStatusMapper fileStatusMapper;

    /**
     * 加载部门列表
     * @return
     */
    @Override
    public List<FileStatus> queryAllFileStatus() {
        return fileStatusMapper.queryAllFileStatus();
    }
}
