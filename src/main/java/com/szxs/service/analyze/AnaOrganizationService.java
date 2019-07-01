package com.szxs.service.analyze;

import com.szxs.entity.Organization;

import java.util.List;

public interface AnaOrganizationService {

    /**
     * 查询所有部门
     * @return
     */
    List<Organization> queryAllOrganization();

}
