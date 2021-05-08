/*
 * This file is generated by jOOQ.
*/
package com.jooq.domain.tables.pojos;


import com.jooq.domain.enums.UcCourseShopCollectSourceType;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.annotation.Generated;


/**
 * 收藏门店、课程关系表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UcCourseShopCollect implements Serializable {

    private static final long serialVersionUID = 165665828;

    private Long                          id;
    private Long                          ucmemberId;
    private Long                          sourceId;
    private UcCourseShopCollectSourceType sourceType;
    private Timestamp                     createAt;
    private Timestamp                     updateAt;
    private Boolean                       delFlag;
    private Long                          version;

    public UcCourseShopCollect() {}

    public UcCourseShopCollect(UcCourseShopCollect value) {
        this.id = value.id;
        this.ucmemberId = value.ucmemberId;
        this.sourceId = value.sourceId;
        this.sourceType = value.sourceType;
        this.createAt = value.createAt;
        this.updateAt = value.updateAt;
        this.delFlag = value.delFlag;
        this.version = value.version;
    }

    public UcCourseShopCollect(
        Long                          id,
        Long                          ucmemberId,
        Long                          sourceId,
        UcCourseShopCollectSourceType sourceType,
        Timestamp                     createAt,
        Timestamp                     updateAt,
        Boolean                       delFlag,
        Long                          version
    ) {
        this.id = id;
        this.ucmemberId = ucmemberId;
        this.sourceId = sourceId;
        this.sourceType = sourceType;
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

    public Long getUcmemberId() {
        return this.ucmemberId;
    }

    public void setUcmemberId(Long ucmemberId) {
        this.ucmemberId = ucmemberId;
    }

    public Long getSourceId() {
        return this.sourceId;
    }

    public void setSourceId(Long sourceId) {
        this.sourceId = sourceId;
    }

    public UcCourseShopCollectSourceType getSourceType() {
        return this.sourceType;
    }

    public void setSourceType(UcCourseShopCollectSourceType sourceType) {
        this.sourceType = sourceType;
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
        StringBuilder sb = new StringBuilder("UcCourseShopCollect (");

        sb.append(id);
        sb.append(", ").append(ucmemberId);
        sb.append(", ").append(sourceId);
        sb.append(", ").append(sourceType);
        sb.append(", ").append(createAt);
        sb.append(", ").append(updateAt);
        sb.append(", ").append(delFlag);
        sb.append(", ").append(version);

        sb.append(")");
        return sb.toString();
    }
}
