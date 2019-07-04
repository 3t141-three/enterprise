package com.szxs.service.analyze.impl;

import com.szxs.entity.File;
import com.szxs.mapper.analyze.ana_FileMapper;
import com.szxs.service.analyze.AnaFileService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class AnaFileServiceImpl implements AnaFileService {

    @Resource
    private ana_FileMapper anaFileMapper;

    @Override
    public List<File> queryAllFile(File file) {
        return anaFileMapper.queryAllFile(file);
    }

    @Override
    public List<File> countByYearAndRecord() {
        return anaFileMapper.countByYearAndRecord();
    }


}
