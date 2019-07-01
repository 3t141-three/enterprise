package com.szxs.service.analyze.impl;

import com.szxs.entity.ReserveTalent;
import com.szxs.mapper.analyze.ReserveTalentMapper;
import com.szxs.service.analyze.AnaReserveTalentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class AnaReserveTalentServiceImpl implements AnaReserveTalentService {

    @Resource
    private ReserveTalentMapper reserveTalentMapper;

    @Override
    public List<ReserveTalent> queryAll(ReserveTalent reserveTalent) {
        return reserveTalentMapper.queryAll(reserveTalent);
    }
}
