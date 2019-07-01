package com.szxs.mapper.analyze;

import com.szxs.entity.Organization;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface OrganizationMapper {
    /**
     * 查询所有部门
     * @return
     */
    List<Organization> queryAllOrganization();
}
