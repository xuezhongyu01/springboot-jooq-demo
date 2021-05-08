/*
 * This file is generated by jOOQ.
*/
package com.jooq.domain.tables.pojos;


import com.jooq.domain.enums.UcShopActivityStatus;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.annotation.Generated;


/**
 * 门店活动表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UcShopActivity implements Serializable {

    private static final long serialVersionUID = 1086660410;

    private Long                 id;
    private Long                 shopId;
    private String               activityName;
    private String               activityBrief;
    private String               image;
    private String               href;
    private UcShopActivityStatus status;
    private Timestamp            startTime;
    private Timestamp            endTime;
    private String               activityDetail;
    private Timestamp            createAt;
    private Timestamp            updateAt;
    private Boolean              delFlag;
    private Long                 version;

    public UcShopActivity() {}

    public UcShopActivity(UcShopActivity value) {
        this.id = value.id;
        this.shopId = value.shopId;
        this.activityName = value.activityName;
        this.activityBrief = value.activityBrief;
        this.image = value.image;
        this.href = value.href;
        this.status = value.status;
        this.startTime = value.startTime;
        this.endTime = value.endTime;
        this.activityDetail = value.activityDetail;
        this.createAt = value.createAt;
        this.updateAt = value.updateAt;
        this.delFlag = value.delFlag;
        this.version = value.version;
    }

    public UcShopActivity(
        Long                 id,
        Long                 shopId,
        String               activityName,
        String               activityBrief,
        String               image,
        String               href,
        UcShopActivityStatus status,
        Timestamp            startTime,
        Timestamp            endTime,
        String               activityDetail,
        Timestamp            createAt,
        Timestamp            updateAt,
        Boolean              delFlag,
        Long                 version
    ) {
        this.id = id;
        this.shopId = shopId;
        this.activityName = activityName;
        this.activityBrief = activityBrief;
        this.image = image;
        this.href = href;
        this.status = status;
        this.startTime = startTime;
        this.endTime = endTime;
        this.activityDetail = activityDetail;
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

    public Long getShopId() {
        return this.shopId;
    }

    public void setShopId(Long shopId) {
        this.shopId = shopId;
    }

    public String getActivityName() {
        return this.activityName;
    }

    public void setActivityName(String activityName) {
        this.activityName = activityName;
    }

    public String getActivityBrief() {
        return this.activityBrief;
    }

    public void setActivityBrief(String activityBrief) {
        this.activityBrief = activityBrief;
    }

    public String getImage() {
        return this.image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getHref() {
        return this.href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public UcShopActivityStatus getStatus() {
        return this.status;
    }

    public void setStatus(UcShopActivityStatus status) {
        this.status = status;
    }

    public Timestamp getStartTime() {
        return this.startTime;
    }

    public void setStartTime(Timestamp startTime) {
        this.startTime = startTime;
    }

    public Timestamp getEndTime() {
        return this.endTime;
    }

    public void setEndTime(Timestamp endTime) {
        this.endTime = endTime;
    }

    public String getActivityDetail() {
        return this.activityDetail;
    }

    public void setActivityDetail(String activityDetail) {
        this.activityDetail = activityDetail;
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
        StringBuilder sb = new StringBuilder("UcShopActivity (");

        sb.append(id);
        sb.append(", ").append(shopId);
        sb.append(", ").append(activityName);
        sb.append(", ").append(activityBrief);
        sb.append(", ").append(image);
        sb.append(", ").append(href);
        sb.append(", ").append(status);
        sb.append(", ").append(startTime);
        sb.append(", ").append(endTime);
        sb.append(", ").append(activityDetail);
        sb.append(", ").append(createAt);
        sb.append(", ").append(updateAt);
        sb.append(", ").append(delFlag);
        sb.append(", ").append(version);

        sb.append(")");
        return sb.toString();
    }
}
