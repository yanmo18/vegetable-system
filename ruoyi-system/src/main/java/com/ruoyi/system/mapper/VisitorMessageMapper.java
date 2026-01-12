package com.ruoyi.system.mapper;

import com.ruoyi.system.domain.VisitorMessage;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface VisitorMessageMapper {
    List<VisitorMessage> selectMessageList(VisitorMessage message);
    int insertMessage(VisitorMessage message);
    // 其他方法
}