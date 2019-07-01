package com.szxs.mapper.analyze;

import com.szxs.entity.JobScheduling;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface JobSchedulingMapper {

    List<JobScheduling> queryAllJobScheduling();
}
