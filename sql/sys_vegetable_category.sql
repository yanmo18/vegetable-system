CREATE TABLE `sys_vegetable_category` (
                                          `category_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '分类ID',
                                          `category_name` varchar(50) NOT NULL COMMENT '分类名称',
                                          `parent_id` bigint(20) DEFAULT 0 COMMENT '父分类ID',
                                          `order_num` int(4) DEFAULT 0 COMMENT '显示顺序',
                                          `icon` varchar(100) DEFAULT NULL COMMENT '分类图标',
                                          `status` char(1) DEFAULT '0' COMMENT '状态（0正常 1停用）',
                                          `create_by` varchar(64) DEFAULT '' COMMENT '创建者',
                                          `create_time` datetime DEFAULT NULL COMMENT '创建时间',
                                          `update_by` varchar(64) DEFAULT '' COMMENT '更新者',
                                          `update_time` datetime DEFAULT NULL COMMENT '更新时间',
                                          `remark` varchar(500) DEFAULT NULL COMMENT '备注',
                                          PRIMARY KEY (`category_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='有机蔬菜分类表';
