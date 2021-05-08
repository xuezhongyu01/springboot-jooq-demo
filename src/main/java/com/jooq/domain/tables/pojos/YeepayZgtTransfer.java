/*
 * This file is generated by jOOQ.
*/
package com.jooq.domain.tables.pojos;


import com.jooq.domain.enums.YeepayZgtTransferPayStatus;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.annotation.Generated;


/**
 * 易宝掌柜通转账表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class YeepayZgtTransfer implements Serializable {

    private static final long serialVersionUID = 139242756;

    private Long                       id;
    private String                     customernumber;
    private String                     requestid;
    private String                     ledgerno;
    private String                     amount;
    private String                     remark;
    private Timestamp                  createAt;
    private Timestamp                  updateAt;
    private Long                       version;
    private Boolean                    delFlag;
    private YeepayZgtTransferPayStatus payStatus;
    private String                     orderId;
    private String                     couponId;

    public YeepayZgtTransfer() {}

    public YeepayZgtTransfer(YeepayZgtTransfer value) {
        this.id = value.id;
        this.customernumber = value.customernumber;
        this.requestid = value.requestid;
        this.ledgerno = value.ledgerno;
        this.amount = value.amount;
        this.remark = value.remark;
        this.createAt = value.createAt;
        this.updateAt = value.updateAt;
        this.version = value.version;
        this.delFlag = value.delFlag;
        this.payStatus = value.payStatus;
        this.orderId = value.orderId;
        this.couponId = value.couponId;
    }

    public YeepayZgtTransfer(
        Long                       id,
        String                     customernumber,
        String                     requestid,
        String                     ledgerno,
        String                     amount,
        String                     remark,
        Timestamp                  createAt,
        Timestamp                  updateAt,
        Long                       version,
        Boolean                    delFlag,
        YeepayZgtTransferPayStatus payStatus,
        String                     orderId,
        String                     couponId
    ) {
        this.id = id;
        this.customernumber = customernumber;
        this.requestid = requestid;
        this.ledgerno = ledgerno;
        this.amount = amount;
        this.remark = remark;
        this.createAt = createAt;
        this.updateAt = updateAt;
        this.version = version;
        this.delFlag = delFlag;
        this.payStatus = payStatus;
        this.orderId = orderId;
        this.couponId = couponId;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCustomernumber() {
        return this.customernumber;
    }

    public void setCustomernumber(String customernumber) {
        this.customernumber = customernumber;
    }

    public String getRequestid() {
        return this.requestid;
    }

    public void setRequestid(String requestid) {
        this.requestid = requestid;
    }

    public String getLedgerno() {
        return this.ledgerno;
    }

    public void setLedgerno(String ledgerno) {
        this.ledgerno = ledgerno;
    }

    public String getAmount() {
        return this.amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getRemark() {
        return this.remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Timestamp getCreateAt() {
        return this.createAt;
    }

    public void setCreateAt(Timestamp createAt) {
        this.createAt = createAt;
    }

    public Timestamp getUpdateAt() {
        return this.updateAt;
    }

    public void setUpdateAt(Timestamp updateAt) {
        this.updateAt = updateAt;
    }

    public Long getVersion() {
        return this.version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }

    public Boolean getDelFlag() {
        return this.delFlag;
    }

    public void setDelFlag(Boolean delFlag) {
        this.delFlag = delFlag;
    }

    public YeepayZgtTransferPayStatus getPayStatus() {
        return this.payStatus;
    }

    public void setPayStatus(YeepayZgtTransferPayStatus payStatus) {
        this.payStatus = payStatus;
    }

    public String getOrderId() {
        return this.orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getCouponId() {
        return this.couponId;
    }

    public void setCouponId(String couponId) {
        this.couponId = couponId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("YeepayZgtTransfer (");

        sb.append(id);
        sb.append(", ").append(customernumber);
        sb.append(", ").append(requestid);
        sb.append(", ").append(ledgerno);
        sb.append(", ").append(amount);
        sb.append(", ").append(remark);
        sb.append(", ").append(createAt);
        sb.append(", ").append(updateAt);
        sb.append(", ").append(version);
        sb.append(", ").append(delFlag);
        sb.append(", ").append(payStatus);
        sb.append(", ").append(orderId);
        sb.append(", ").append(couponId);

        sb.append(")");
        return sb.toString();
    }
}
