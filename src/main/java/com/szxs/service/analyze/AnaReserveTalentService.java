package com.szxs.service.analyze;


import com.szxs.entity.ReserveTalent;

import java.util.List;

public interface AnaReserveTalentService {


    /**
     * 查询储备人才表的所有信息
     */
    List<ReserveTalent>  queryAll(ReserveTalent reserveTalent);
}
