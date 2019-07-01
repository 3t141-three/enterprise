package com.szxs.service.analyze.impl;

import com.szxs.entity.Organization;
import com.szxs.mapper.analyze.OrganizationMapper;
import com.szxs.service.analyze.AnaOrganizationService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class AnaOrganizationServiceImpl implements AnaOrganizationService {

    @Resource
    private OrganizationMapper anaOrganizationMapper;

    /**
     * 加载部门列表
     * @return
     */
    @Override
    public List<Organization> queryAllOrganization() {
        return anaOrganizationMapper.queryAllOrganization();
    }
}
