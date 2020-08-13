CREATE TABLE IF NOT EXISTS `t_order`
(
    id           BIGINT UNSIGNED PRIMARY KEY COMMENT '主键',
    order_id     VARCHAR(64)    NOT NULL COMMENT '订单ID',
    create_time  DATETIME       NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    amount       DECIMAL(10, 2) NOT NULL DEFAULT 0 COMMENT '金额',
    order_status TINYINT        NOT NULL DEFAULT 0 COMMENT '订单状态',
    UNIQUE uniq_order_id (`order_id`)
) COMMENT '订单表';