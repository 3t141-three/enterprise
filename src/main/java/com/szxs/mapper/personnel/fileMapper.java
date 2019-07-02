package com.szxs.mapper.personnel;

import com.szxs.entity.Cultivate;
import com.szxs.entity.File;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

@Mapper
public interface fileMapper {
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
     * 根据档案编码 审核状态 档案状态 登记时间(全部模糊查询)
     * @param fileCode
     * @param checks
     * @param fileStatus
     * @param build
     * @return
     */
    List<File> getFileByWhere(@Param("fileCode") String fileCode,
                              @Param("checks") String checks,
                              @Param("fileStatus") String fileStatus,
                              @Param("’build") Date build);

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
}
