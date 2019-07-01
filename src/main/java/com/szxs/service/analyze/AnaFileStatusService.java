package com.szxs.service.analyze;

import com.szxs.entity.FileStatus;

import java.util.List;

public interface AnaFileStatusService {

    /**
     * 查询所有档案状态
     * @return
     */
    List<FileStatus> queryAllFileStatus();

}
