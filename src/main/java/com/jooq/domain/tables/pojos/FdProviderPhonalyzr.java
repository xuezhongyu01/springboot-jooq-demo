/*
 * This file is generated by jOOQ.
*/
package com.jooq.domain.tables.pojos;


import java.io.Serializable;
import java.sql.Timestamp;

import javax.annotation.Generated;


/**
 * 通话分析表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class FdProviderPhonalyzr implements Serializable {

    private static final long serialVersionUID = -767832994;

    private Long      id;
    private Long      accountId;
    private String    period;
    private String    callNumber;
    private String    interphoneCount;
    private String    interphoneRate;
    private String    callingCount;
    private String    callingRate;
    private String    calledCount;
    private String    calledRate;
    private String    count;
    private String    morningCount;
    private String    morningCallRate;
    private Timestamp createAt;
    private Timestamp updateAt;
    private Boolean   delFlag;
    private Long      version;

    public FdProviderPhonalyzr() {}

    public FdProviderPhonalyzr(FdProviderPhonalyzr value) {
        this.id = value.id;
        this.accountId = value.accountId;
        this.period = value.period;
        this.callNumber = value.callNumber;
        this.interphoneCount = value.interphoneCount;
        this.interphoneRate = value.interphoneRate;
        this.callingCount = value.callingCount;
        this.callingRate = value.callingRate;
        this.calledCount = value.calledCount;
        this.calledRate = value.calledRate;
        this.count = value.count;
        this.morningCount = value.morningCount;
        this.morningCallRate = value.morningCallRate;
        this.createAt = value.createAt;
        this.updateAt = value.updateAt;
        this.delFlag = value.delFlag;
        this.version = value.version;
    }

    public FdProviderPhonalyzr(
        Long      id,
        Long      accountId,
        String    period,
        String    callNumber,
        String    interphoneCount,
        String    interphoneRate,
        String    callingCount,
        String    callingRate,
        String    calledCount,
        String    calledRate,
        String    count,
        String    morningCount,
        String    morningCallRate,
        Timestamp createAt,
        Timestamp updateAt,
        Boolean   delFlag,
        Long      version
    ) {
        this.id = id;
        this.accountId = accountId;
        this.period = period;
        this.callNumber = callNumber;
        this.interphoneCount = interphoneCount;
        this.interphoneRate = interphoneRate;
        this.callingCount = callingCount;
        this.callingRate = callingRate;
        this.calledCount = calledCount;
        this.calledRate = calledRate;
        this.count = count;
        this.morningCount = morningCount;
        this.morningCallRate = morningCallRate;
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

    public String getPeriod() {
        return this.period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    public String getCallNumber() {
        return this.callNumber;
    }

    public void setCallNumber(String callNumber) {
        this.callNumber = callNumber;
    }

    public String getInterphoneCount() {
        return this.interphoneCount;
    }

    public void setInterphoneCount(String interphoneCount) {
        this.interphoneCount = interphoneCount;
    }

    public String getInterphoneRate() {
        return this.interphoneRate;
    }

    public void setInterphoneRate(String interphoneRate) {
        this.interphoneRate = interphoneRate;
    }

    public String getCallingCount() {
        return this.callingCount;
    }

    public void setCallingCount(String callingCount) {
        this.callingCount = callingCount;
    }

    public String getCallingRate() {
        return this.callingRate;
    }

    public void setCallingRate(String callingRate) {
        this.callingRate = callingRate;
    }

    public String getCalledCount() {
        return this.calledCount;
    }

    public void setCalledCount(String calledCount) {
        this.calledCount = calledCount;
    }

    public String getCalledRate() {
        return this.calledRate;
    }

    public void setCalledRate(String calledRate) {
        this.calledRate = calledRate;
    }

    public String getCount() {
        return this.count;
    }

    public void setCount(String count) {
        this.count = count;
    }

    public String getMorningCount() {
        return this.morningCount;
    }

    public void setMorningCount(String morningCount) {
        this.morningCount = morningCount;
    }

    public String getMorningCallRate() {
        return this.morningCallRate;
    }

    public void setMorningCallRate(String morningCallRate) {
        this.morningCallRate = morningCallRate;
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
        StringBuilder sb = new StringBuilder("FdProviderPhonalyzr (");

        sb.append(id);
        sb.append(", ").append(accountId);
        sb.append(", ").append(period);
        sb.append(", ").append(callNumber);
        sb.append(", ").append(interphoneCount);
        sb.append(", ").append(interphoneRate);
        sb.append(", ").append(callingCount);
        sb.append(", ").append(callingRate);
        sb.append(", ").append(calledCount);
        sb.append(", ").append(calledRate);
        sb.append(", ").append(count);
        sb.append(", ").append(morningCount);
        sb.append(", ").append(morningCallRate);
        sb.append(", ").append(createAt);
        sb.append(", ").append(updateAt);
        sb.append(", ").append(delFlag);
        sb.append(", ").append(version);

        sb.append(")");
        return sb.toString();
    }
}