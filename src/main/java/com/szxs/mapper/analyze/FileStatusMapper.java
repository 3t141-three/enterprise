package com.szxs.mapper.analyze;

import com.szxs.entity.FileStatus;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface FileStatusMapper {

    /**
     * 查询所有档案状态
     * @return
     */
    List<FileStatus> queryAllFileStatus();
}
