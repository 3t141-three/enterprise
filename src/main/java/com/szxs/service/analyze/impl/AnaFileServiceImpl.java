package com.szxs.service.analyze.impl;

import com.szxs.entity.File;
import com.szxs.mapper.analyze.FileMapper;
import com.szxs.service.analyze.AnaFileService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class AnaFileServiceImpl implements AnaFileService {

    @Resource
    private FileMapper fileMapper;

    @Override
    public List<File> queryAllFile(File file) {
        return fileMapper.queryAllFile(file);
    }

    @Override
    public List<File> countByYearAndRecord() {
        return fileMapper.countByYearAndRecord();
    }


}
