package com.szxs.mapper.analyze;

import com.szxs.entity.ReserveTalent;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
/**
 * 查询储备人才表的所有信息
 */
public interface ReserveTalentMapper {

    List<ReserveTalent>  queryAll(ReserveTalent reserveTalent);
}
