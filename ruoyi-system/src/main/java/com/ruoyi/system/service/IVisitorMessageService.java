package com.ruoyi.system.service;

import com.ruoyi.system.domain.VisitorMessage;
import java.util.List;

public interface IVisitorMessageService {
    List<VisitorMessage> selectMessageList(VisitorMessage message);
    int insertMessage(VisitorMessage message);
}