package com.ruoyi.system.service.impl;

import com.ruoyi.system.domain.VisitorMessage;
import com.ruoyi.system.mapper.VisitorMessageMapper;
import com.ruoyi.system.service.IVisitorMessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VisitorMessageServiceImpl implements IVisitorMessageService {
    @Autowired
    private VisitorMessageMapper messageMapper;

    @Override
    public List<VisitorMessage> selectMessageList(VisitorMessage message) {
        return messageMapper.selectMessageList(message);
    }

    @Override
    public int insertMessage(VisitorMessage message) {
        return messageMapper.insertMessage(message);
    }
}