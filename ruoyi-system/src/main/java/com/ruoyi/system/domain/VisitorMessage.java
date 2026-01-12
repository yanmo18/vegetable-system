package com.ruoyi.system.domain;

import com.ruoyi.common.core.domain.BaseEntity;
import lombok.Data;

@Data
public class VisitorMessage extends BaseEntity {
    private Long messageId;
    private String visitorName;
    private String visitorEmail;
    private String content;
    private String replyContent;
    private String status;
    // getter/setter
}