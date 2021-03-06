/*
 * This file is generated by jOOQ.
*/
package com.jooq.domain.tables.pojos;


import java.io.Serializable;
import java.sql.Timestamp;

import javax.annotation.Generated;


/**
 * 电商流水
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class FdEbusinessFlows implements Serializable {

    private static final long serialVersionUID = 563423838;

    private Long      id;
    private Long      accountId;
    private String    orderNum;
    private Timestamp settleDate;
    private Long      settleAmount;
    private String    shopName;
    private String    status;
    private String    tradeDescription;
    private String    name;
    private String    phone;
    private String    addressArea;
    private String    addressDetail;
    private String    postcode;
    private String    paymentMode;
    private Timestamp createAt;
    private Timestamp updateAt;
    private Boolean   delFlag;
    private Long      version;

    public FdEbusinessFlows() {}

    public FdEbusinessFlows(FdEbusinessFlows value) {
        this.id = value.id;
        this.accountId = value.accountId;
        this.orderNum = value.orderNum;
        this.settleDate = value.settleDate;
        this.settleAmount = value.settleAmount;
        this.shopName = value.shopName;
        this.status = value.status;
        this.tradeDescription = value.tradeDescription;
        this.name = value.name;
        this.phone = value.phone;
        this.addressArea = value.addressArea;
        this.addressDetail = value.addressDetail;
        this.postcode = value.postcode;
        this.paymentMode = value.paymentMode;
        this.createAt = value.createAt;
        this.updateAt = value.updateAt;
        this.delFlag = value.delFlag;
        this.version = value.version;
    }

    public FdEbusinessFlows(
        Long      id,
        Long      accountId,
        String    orderNum,
        Timestamp settleDate,
        Long      settleAmount,
        String    shopName,
        String    status,
        String    tradeDescription,
        String    name,
        String    phone,
        String    addressArea,
        String    addressDetail,
        String    postcode,
        String    paymentMode,
        Timestamp createAt,
        Timestamp updateAt,
        Boolean   delFlag,
        Long      version
    ) {
        this.id = id;
        this.accountId = accountId;
        this.orderNum = orderNum;
        this.settleDate = settleDate;
        this.settleAmount = settleAmount;
        this.shopName = shopName;
        this.status = status;
        this.tradeDescription = tradeDescription;
        this.name = name;
        this.phone = phone;
        this.addressArea = addressArea;
        this.addressDetail = addressDetail;
        this.postcode = postcode;
        this.paymentMode = paymentMode;
        this.createAt = createAt;
        this.updateAt = updateAt;
        this.delFlag = delFlag;
        this.version = version;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getAccountId() {
        return this.accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public String getOrderNum() {
        return this.orderNum;
    }

    public void setOrderNum(String orderNum) {
        this.orderNum = orderNum;
    }

    public Timestamp getSettleDate() {
        return this.settleDate;
    }

    public void setSettleDate(Timestamp settleDate) {
        this.settleDate = settleDate;
    }

    public Long getSettleAmount() {
        return this.settleAmount;
    }

    public void setSettleAmount(Long settleAmount) {
        this.settleAmount = settleAmount;
    }

    public String getShopName() {
        return this.shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTradeDescription() {
        return this.tradeDescription;
    }

    public void setTradeDescription(String tradeDescription) {
        this.tradeDescription = tradeDescription;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddressArea() {
        return this.addressArea;
    }

    public void setAddressArea(String addressArea) {
        this.addressArea = addressArea;
    }

    public String getAddressDetail() {
        return this.addressDetail;
    }

    public void setAddressDetail(String addressDetail) {
        this.addressDetail = addressDetail;
    }

    public String getPostcode() {
        return this.postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public String getPaymentMode() {
        return this.paymentMode;
    }

    public void setPaymentMode(String paymentMode) {
        this.paymentMode = paymentMode;
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

    public Boolean getDelFlag() {
        return this.delFlag;
    }

    public void setDelFlag(Boolean delFlag) {
        this.delFlag = delFlag;
    }

    public Long getVersion() {
        return this.version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("FdEbusinessFlows (");

        sb.append(id);
        sb.append(", ").append(accountId);
        sb.append(", ").append(orderNum);
        sb.append(", ").append(settleDate);
        sb.append(", ").append(settleAmount);
        sb.append(", ").append(shopName);
        sb.append(", ").append(status);
        sb.append(", ").append(tradeDescription);
        sb.append(", ").append(name);
        sb.append(", ").append(phone);
        sb.append(", ").append(addressArea);
        sb.append(", ").append(addressDetail);
        sb.append(", ").append(postcode);
        sb.append(", ").append(paymentMode);
        sb.append(", ").append(createAt);
        sb.append(", ").append(updateAt);
        sb.append(", ").append(delFlag);
        sb.append(", ").append(version);

        sb.append(")");
        return sb.toString();
    }
}
