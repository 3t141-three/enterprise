package com.szxs.service.analyze;

import com.szxs.entity.File;

import java.util.List;

public interface AnaFileService {

    /**
     * 查询所有的职员信息
     * @param file
     * @return
     */
    List<File> queryAllFile(File file);


    /**
     * 查询file表的数据总行数 根据年份和学历
     * @return
     */
    List<File> countByYearAndRecord();
}
