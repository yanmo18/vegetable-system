package com.ruoyi.system.controller;

import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.system.domain.VisitorMessage;
import com.ruoyi.system.service.IVisitorMessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/system/message")
public class VisitorMessageController extends BaseController {
    @Autowired
    private IVisitorMessageService messageService;

    @PostMapping("/add")
    public AjaxResult add(@RequestBody VisitorMessage message) {
        return toAjax(messageService.insertMessage(message));
    }

    @GetMapping("/list")
    public List<VisitorMessage> list(VisitorMessage message) {
        return messageService.selectMessageList(message);
    }
}