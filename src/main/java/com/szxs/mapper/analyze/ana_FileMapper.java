package com.szxs.mapper.analyze;


import com.szxs.entity.File;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ana_FileMapper {

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
