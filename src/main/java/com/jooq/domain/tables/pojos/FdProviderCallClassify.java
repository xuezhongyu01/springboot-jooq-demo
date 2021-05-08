/*
 * This file is generated by jOOQ.
*/
package com.jooq.domain.tables.pojos;


import java.io.Serializable;
import java.sql.Timestamp;

import javax.annotation.Generated;


/**
 * 被叫对方号码归属地分布表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class FdProviderCallClassify implements Serializable {

    private static final long serialVersionUID = -860230391;

    private Long      id;
    private Long      accountId;
    private String    name;
    private String    count;
    private String    num;
    private String    rate;
    private String    time;
    private String    timeRate;
    private Timestamp createAt;
    private Timestamp updateAt;
    private Boolean   delFlag;
    private Long      version;

    public FdProviderCallClassify() {}

    public FdProviderCallClassify(FdProviderCallClassify value) {
        this.id = value.id;
        this.accountId = value.accountId;
        this.name = value.name;
        this.count = value.count;
        this.num = value.num;
        this.rate = value.rate;
        this.time = value.time;
        this.timeRate = value.timeRate;
        this.createAt = value.createAt;
        this.updateAt = value.updateAt;
        this.delFlag = value.delFlag;
        this.version = value.version;
    }

    public FdProviderCallClassify(
        Long      id,
        Long      accountId,
        String    name,
        String    count,
        String    num,
        String    rate,
        String    time,
        String    timeRate,
        Timestamp createAt,
        Timestamp updateAt,
        Boolean   delFlag,
        Long      version
    ) {
        this.id = id;
        this.accountId = accountId;
        this.name = name;
        this.count = count;
        this.num = num;
        this.rate = rate;
        this.time = time;
        this.timeRate = timeRate;
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

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCount() {
        return this.count;
    }

    public void setCount(String count) {
        this.count = count;
    }

    public String getNum() {
        return this.num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getRate() {
        return this.rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }

    public String getTime() {
        return this.time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getTimeRate() {
        return this.timeRate;
    }

    public void setTimeRate(String timeRate) {
        this.timeRate = timeRate;
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
        StringBuilder sb = new StringBuilder("FdProviderCallClassify (");

        sb.append(id);
        sb.append(", ").append(accountId);
        sb.append(", ").append(name);
        sb.append(", ").append(count);
        sb.append(", ").append(num);
        sb.append(", ").append(rate);
        sb.append(", ").append(time);
        sb.append(", ").append(timeRate);
        sb.append(", ").append(createAt);
        sb.append(", ").append(updateAt);
        sb.append(", ").append(delFlag);
        sb.append(", ").append(version);

        sb.append(")");
        return sb.toString();
    }
}