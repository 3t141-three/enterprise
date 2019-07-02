package com.szxs.service.impl.personnel;

import com.szxs.entity.Cultivate;
import com.szxs.entity.File;
import com.szxs.mapper.personnel.fileMapper;
import com.szxs.service.personnel.fileService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class fileServiceImpl implements fileService {


    @Resource
    private fileMapper fileMapper;
    public List<File> queryArchives() {
        return fileMapper.queryArchives();
    }

    @Override
    public File queryFileByid(Integer id) {
        return fileMapper.queryFileByid(id);
    }

    @Override
    public List<File> queryFileStatus(String fileStatus) {
        return fileMapper.queryFileStatus(fileStatus);
    }

    @Override
    public List<File> queryChecks(String checks) {
        return fileMapper.queryChecks(checks);
    }

    @Override
    public int updateChecks(String checks) {
        return fileMapper.updateChecks(checks);
    }

    @Override
    public List<Cultivate> queryCultivate() {
        return fileMapper.queryCultivate();
    }

    @Override
    public int deleteFile(Integer id) {
        return fileMapper.deleteFile(id);
    }

    @Override
    public int insertfile(File file) {
        return fileMapper.insertfile(file);
    }

    @Override
    public void dsada(Integer id) {

    }


//    @Override
//    public int insertfile(File file) {
//        return fileMapper.insertfile(file);
//    }
}
