/*
 * This file is generated by jOOQ.
*/
package com.jooq.domain.tables.pojos;


import java.io.Serializable;
import java.sql.Timestamp;

import javax.annotation.Generated;


/**
 * 每月被叫时长
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class FdProviderCalledTimes implements Serializable {

    private static final long serialVersionUID = 1840347335;

    private Long      id;
    private Long      accountId;
    private Timestamp month;
    private String    seconds;
    private Timestamp createAt;
    private Timestamp updateAt;
    private Boolean   delFlag;
    private Long      version;

    public FdProviderCalledTimes() {}

    public FdProviderCalledTimes(FdProviderCalledTimes value) {
        this.id = value.id;
        this.accountId = value.accountId;
        this.month = value.month;
        this.seconds = value.seconds;
        this.createAt = value.createAt;
        this.updateAt = value.updateAt;
        this.delFlag = value.delFlag;
        this.version = value.version;
    }

    public FdProviderCalledTimes(
        Long      id,
        Long      accountId,
        Timestamp month,
        String    seconds,
        Timestamp createAt,
        Timestamp updateAt,
        Boolean   delFlag,
        Long      version
    ) {
        this.id = id;
        this.accountId = accountId;
        this.month = month;
        this.seconds = seconds;
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

    public String getSeconds() {
        return this.seconds;
    }

    public void setSeconds(String seconds) {
        this.seconds = seconds;
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
        StringBuilder sb = new StringBuilder("FdProviderCalledTimes (");

        sb.append(id);
        sb.append(", ").append(accountId);
        sb.append(", ").append(month);
        sb.append(", ").append(seconds);
        sb.append(", ").append(createAt);
        sb.append(", ").append(updateAt);
        sb.append(", ").append(delFlag);
        sb.append(", ").append(version);

        sb.append(")");
        return sb.toString();
    }
}