package com.szxs.service.personnel;

import com.szxs.entity.Cultivate;
import com.szxs.entity.File;

import java.util.List;

public interface fileService {
    /**
     * 查询档案信息
     * @return
     */
    List<File> queryArchives();


    /**
     * 根据id查询档案
     * @param id
     * @return
     */
    File queryFileByid(Integer id);

    /**
     * 变更页面查询
     * @param fileStatus
     * @return
     */
    List<File> queryFileStatus(String fileStatus);

    /**
     * 复核页面查询
     * @param checks
     * @return
     */
    List<File> queryChecks(String checks);

    /**
     * 修改审核状态为审核通过
     * @param checks
     * @return
     */
        int updateChecks(String checks);

    /**
     * 根据查询复核信息
     * @return
     */
    List<Cultivate> queryCultivate();

    /**
     * 根据id刪除档案
     * @param id
     * @return
     */
    int deleteFile(Integer id);





    /**
     * 新增档案
     * @param file
     * @return
     */
    int insertfile(File file);

    void dsada(Integer id);
}
