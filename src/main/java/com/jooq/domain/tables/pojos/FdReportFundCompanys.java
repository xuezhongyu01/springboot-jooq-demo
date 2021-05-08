/*
 * This file is generated by jOOQ.
*/
package com.jooq.domain.tables.pojos;


import java.io.Serializable;
import java.sql.Timestamp;

import javax.annotation.Generated;


/**
 * 公积金数据报告工作信息
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class FdReportFundCompanys implements Serializable {

    private static final long serialVersionUID = -514926197;

    private Long      id;
    private Long      reportFundId;
    private String    name;
    private String    type;
    private Timestamp beginDate;
    private Timestamp endDate;
    private Timestamp createAt;
    private Timestamp updateAt;
    private Boolean   delFlag;
    private Long      version;

    public FdReportFundCompanys() {}

    public FdReportFundCompanys(FdReportFundCompanys value) {
        this.id = value.id;
        this.reportFundId = value.reportFundId;
        this.name = value.name;
        this.type = value.type;
        this.beginDate = value.beginDate;
        this.endDate = value.endDate;
        this.createAt = value.createAt;
        this.updateAt = value.updateAt;
        this.delFlag = value.delFlag;
        this.version = value.version;
    }

    public FdReportFundCompanys(
        Long      id,
        Long      reportFundId,
        String    name,
        String    type,
        Timestamp beginDate,
        Timestamp endDate,
        Timestamp createAt,
        Timestamp updateAt,
        Boolean   delFlag,
        Long      version
    ) {
        this.id = id;
        this.reportFundId = reportFundId;
        this.name = name;
        this.type = type;
        this.beginDate = beginDate;
        this.endDate = endDate;
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

    public Long getReportFundId() {
        return this.reportFundId;
    }

    public void setReportFundId(Long reportFundId) {
        this.reportFundId = reportFundId;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Timestamp getBeginDate() {
        return this.beginDate;
    }

    public void setBeginDate(Timestamp beginDate) {
        this.beginDate = beginDate;
    }

    public Timestamp getEndDate() {
        return this.endDate;
    }

    public void setEndDate(Timestamp endDate) {
        this.endDate = endDate;
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
        StringBuilder sb = new StringBuilder("FdReportFundCompanys (");

        sb.append(id);
        sb.append(", ").append(reportFundId);
        sb.append(", ").append(name);
        sb.append(", ").append(type);
        sb.append(", ").append(beginDate);
        sb.append(", ").append(endDate);
        sb.append(", ").append(createAt);
        sb.append(", ").append(updateAt);
        sb.append(", ").append(delFlag);
        sb.append(", ").append(version);

        sb.append(")");
        return sb.toString();
    }
}
