package com.zqh.usequartz.repository.entity;

import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;

public class Order {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Long id;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String orderId;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Date createTime;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private BigDecimal amount;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Byte orderStatus;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Long getId() {
        return id;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setId(Long id) {
        this.id = id;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getOrderId() {
        return orderId;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setOrderId(String orderId) {
        this.orderId = orderId == null ? null : orderId.trim();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Date getCreateTime() {
        return createTime;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public BigDecimal getAmount() {
        return amount;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Byte getOrderStatus() {
        return orderStatus;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setOrderStatus(Byte orderStatus) {
        this.orderStatus = orderStatus;
    }
}