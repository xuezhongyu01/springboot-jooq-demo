/*
 * This file is generated by jOOQ.
*/
package com.jooq.domain.tables.pojos;


import java.io.Serializable;
import java.sql.Timestamp;

import javax.annotation.Generated;


/**
 * 月消费记录表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class FdProviderConsumeRecords implements Serializable {

    private static final long serialVersionUID = 1646210288;

    private Long      id;
    private Long      accountId;
    private Timestamp month;
    private Long      amount;
    private String    isExceedPlan;
    private String    exceedPlanRate;
    private String    isRemission;
    private String    remissionRate;
    private Timestamp createAt;
    private Timestamp updateAt;
    private Boolean   delFlag;
    private Long      version;

    public FdProviderConsumeRecords() {}

    public FdProviderConsumeRecords(FdProviderConsumeRecords value) {
        this.id = value.id;
        this.accountId = value.accountId;
        this.month = value.month;
        this.amount = value.amount;
        this.isExceedPlan = value.isExceedPlan;
        this.exceedPlanRate = value.exceedPlanRate;
        this.isRemission = value.isRemission;
        this.remissionRate = value.remissionRate;
        this.createAt = value.createAt;
        this.updateAt = value.updateAt;
        this.delFlag = value.delFlag;
        this.version = value.version;
    }

    public FdProviderConsumeRecords(
        Long      id,
        Long      accountId,
        Timestamp month,
        Long      amount,
        String    isExceedPlan,
        String    exceedPlanRate,
        String    isRemission,
        String    remissionRate,
        Timestamp createAt,
        Timestamp updateAt,
        Boolean   delFlag,
        Long      version
    ) {
        this.id = id;
        this.accountId = accountId;
        this.month = month;
        this.amount = amount;
        this.isExceedPlan = isExceedPlan;
        this.exceedPlanRate = exceedPlanRate;
        this.isRemission = isRemission;
        this.remissionRate = remissionRate;
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

    public Timestamp getMonth() {
        return this.month;
    }

    public void setMonth(Timestamp month) {
        this.month = month;
    }

    public Long getAmount() {
        return this.amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }

    public String getIsExceedPlan() {
        return this.isExceedPlan;
    }

    public void setIsExceedPlan(String isExceedPlan) {
        this.isExceedPlan = isExceedPlan;
    }

    public String getExceedPlanRate() {
        return this.exceedPlanRate;
    }

    public void setExceedPlanRate(String exceedPlanRate) {
        this.exceedPlanRate = exceedPlanRate;
    }

    public String getIsRemission() {
        return this.isRemission;
    }

    public void setIsRemission(String isRemission) {
        this.isRemission = isRemission;
    }

    public String getRemissionRate() {
        return this.remissionRate;
    }

    public void setRemissionRate(String remissionRate) {
        this.remissionRate = remissionRate;
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
        StringBuilder sb = new StringBuilder("FdProviderConsumeRecords (");

        sb.append(id);
        sb.append(", ").append(accountId);
        sb.append(", ").append(month);
        sb.append(", ").append(amount);
        sb.append(", ").append(isExceedPlan);
        sb.append(", ").append(exceedPlanRate);
        sb.append(", ").append(isRemission);
        sb.append(", ").append(remissionRate);
        sb.append(", ").append(createAt);
        sb.append(", ").append(updateAt);
        sb.append(", ").append(delFlag);
        sb.append(", ").append(version);

        sb.append(")");
        return sb.toString();
    }
}