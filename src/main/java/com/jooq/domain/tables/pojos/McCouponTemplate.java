/*
 * This file is generated by jOOQ.
*/
package com.jooq.domain.tables.pojos;


import com.jooq.domain.enums.McCouponTemplateCouponType;
import com.jooq.domain.enums.McCouponTemplateDrawCondition;
import com.jooq.domain.enums.McCouponTemplateDrawConditionAreatype;
import com.jooq.domain.enums.McCouponTemplateSender;
import com.jooq.domain.enums.McCouponTemplateStatus;
import com.jooq.domain.enums.McCouponTemplateUseConditionArea;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.annotation.Generated;


/**
 * 优惠券模板
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class McCouponTemplate implements Serializable {

    private static final long serialVersionUID = -1193196358;

    private Long                                  id;
    private String                                name;
    private McCouponTemplateCouponType            couponType;
    private BigDecimal                            useGreaterAmount;
    private BigDecimal                            useConditionAmount;
    private BigDecimal                            amount;
    private McCouponTemplateSender                sender;
    private Long                                  sendId;
    private Timestamp                             startDate;
    private Timestamp                             endDate;
    private Boolean                               limitCount;
    private Integer                               freeInstallmentNum;
    private Integer                               sendCount;
    private Integer                               drawCount;
    private Integer                               useCount;
    private McCouponTemplateUseConditionArea      useConditionArea;
    private String                                useCondition;
    private String                                useNote;
    private String                                remark;
    private McCouponTemplateStatus                status;
    private McCouponTemplateDrawCondition         drawCondition;
    private BigDecimal                            drawAmount;
    private Timestamp                             createAt;
    private Timestamp                             updateAt;
    private Boolean                               delFlag;
    private Long                                  version;
    private Long                                  createBy;
    private String                                drawConditionArea;
    private McCouponTemplateDrawConditionAreatype drawConditionAreatype;

    public McCouponTemplate() {}

    public McCouponTemplate(McCouponTemplate value) {
        this.id = value.id;
        this.name = value.name;
        this.couponType = value.couponType;
        this.useGreaterAmount = value.useGreaterAmount;
        this.useConditionAmount = value.useConditionAmount;
        this.amount = value.amount;
        this.sender = value.sender;
        this.sendId = value.sendId;
        this.startDate = value.startDate;
        this.endDate = value.endDate;
        this.limitCount = value.limitCount;
        this.freeInstallmentNum = value.freeInstallmentNum;
        this.sendCount = value.sendCount;
        this.drawCount = value.drawCount;
        this.useCount = value.useCount;
        this.useConditionArea = value.useConditionArea;
        this.useCondition = value.useCondition;
        this.useNote = value.useNote;
        this.remark = value.remark;
        this.status = value.status;
        this.drawCondition = value.drawCondition;
        this.drawAmount = value.drawAmount;
        this.createAt = value.createAt;
        this.updateAt = value.updateAt;
        this.delFlag = value.delFlag;
        this.version = value.version;
        this.createBy = value.createBy;
        this.drawConditionArea = value.drawConditionArea;
        this.drawConditionAreatype = value.drawConditionAreatype;
    }

    public McCouponTemplate(
        Long                                  id,
        String                                name,
        McCouponTemplateCouponType            couponType,
        BigDecimal                            useGreaterAmount,
        BigDecimal                            useConditionAmount,
        BigDecimal                            amount,
        McCouponTemplateSender                sender,
        Long                                  sendId,
        Timestamp                             startDate,
        Timestamp                             endDate,
        Boolean                               limitCount,
        Integer                               freeInstallmentNum,
        Integer                               sendCount,
        Integer                               drawCount,
        Integer                               useCount,
        McCouponTemplateUseConditionArea      useConditionArea,
        String                                useCondition,
        String                                useNote,
        String                                remark,
        McCouponTemplateStatus                status,
        McCouponTemplateDrawCondition         drawCondition,
        BigDecimal                            drawAmount,
        Timestamp                             createAt,
        Timestamp                             updateAt,
        Boolean                               delFlag,
        Long                                  version,
        Long                                  createBy,
        String                                drawConditionArea,
        McCouponTemplateDrawConditionAreatype drawConditionAreatype
    ) {
        this.id = id;
        this.name = name;
        this.couponType = couponType;
        this.useGreaterAmount = useGreaterAmount;
        this.useConditionAmount = useConditionAmount;
        this.amount = amount;
        this.sender = sender;
        this.sendId = sendId;
        this.startDate = startDate;
        this.endDate = endDate;
        this.limitCount = limitCount;
        this.freeInstallmentNum = freeInstallmentNum;
        this.sendCount = sendCount;
        this.drawCount = drawCount;
        this.useCount = useCount;
        this.useConditionArea = useConditionArea;
        this.useCondition = useCondition;
        this.useNote = useNote;
        this.remark = remark;
        this.status = status;
        this.drawCondition = drawCondition;
        this.drawAmount = drawAmount;
        this.createAt = createAt;
        this.updateAt = updateAt;
        this.delFlag = delFlag;
        this.version = version;
        this.createBy = createBy;
        this.drawConditionArea = drawConditionArea;
        this.drawConditionAreatype = drawConditionAreatype;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public McCouponTemplateCouponType getCouponType() {
        return this.couponType;
    }

    public void setCouponType(McCouponTemplateCouponType couponType) {
        this.couponType = couponType;
    }

    public BigDecimal getUseGreaterAmount() {
        return this.useGreaterAmount;
    }

    public void setUseGreaterAmount(BigDecimal useGreaterAmount) {
        this.useGreaterAmount = useGreaterAmount;
    }

    public BigDecimal getUseConditionAmount() {
        return this.useConditionAmount;
    }

    public void setUseConditionAmount(BigDecimal useConditionAmount) {
        this.useConditionAmount = useConditionAmount;
    }

    public BigDecimal getAmount() {
        return this.amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public McCouponTemplateSender getSender() {
        return this.sender;
    }

    public void setSender(McCouponTemplateSender sender) {
        this.sender = sender;
    }

    public Long getSendId() {
        return this.sendId;
    }

    public void setSendId(Long sendId) {
        this.sendId = sendId;
    }

    public Timestamp getStartDate() {
        return this.startDate;
    }

    public void setStartDate(Timestamp startDate) {
        this.startDate = startDate;
    }

    public Timestamp getEndDate() {
        return this.endDate;
    }

    public void setEndDate(Timestamp endDate) {
        this.endDate = endDate;
    }

    public Boolean getLimitCount() {
        return this.limitCount;
    }

    public void setLimitCount(Boolean limitCount) {
        this.limitCount = limitCount;
    }

    public Integer getFreeInstallmentNum() {
        return this.freeInstallmentNum;
    }

    public void setFreeInstallmentNum(Integer freeInstallmentNum) {
        this.freeInstallmentNum = freeInstallmentNum;
    }

    public Integer getSendCount() {
        return this.sendCount;
    }

    public void setSendCount(Integer sendCount) {
        this.sendCount = sendCount;
    }

    public Integer getDrawCount() {
        return this.drawCount;
    }

    public void setDrawCount(Integer drawCount) {
        this.drawCount = drawCount;
    }

    public Integer getUseCount() {
        return this.useCount;
    }

    public void setUseCount(Integer useCount) {
        this.useCount = useCount;
    }

    public McCouponTemplateUseConditionArea getUseConditionArea() {
        return this.useConditionArea;
    }

    public void setUseConditionArea(McCouponTemplateUseConditionArea useConditionArea) {
        this.useConditionArea = useConditionArea;
    }

    public String getUseCondition() {
        return this.useCondition;
    }

    public void setUseCondition(String useCondition) {
        this.useCondition = useCondition;
    }

    public String getUseNote() {
        return this.useNote;
    }

    public void setUseNote(String useNote) {
        this.useNote = useNote;
    }

    public String getRemark() {
        return this.remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public McCouponTemplateStatus getStatus() {
        return this.status;
    }

    public void setStatus(McCouponTemplateStatus status) {
        this.status = status;
    }

    public McCouponTemplateDrawCondition getDrawCondition() {
        return this.drawCondition;
    }

    public void setDrawCondition(McCouponTemplateDrawCondition drawCondition) {
        this.drawCondition = drawCondition;
    }

    public BigDecimal getDrawAmount() {
        return this.drawAmount;
    }

    public void setDrawAmount(BigDecimal drawAmount) {
        this.drawAmount = drawAmount;
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

    public Long getCreateBy() {
        return this.createBy;
    }

    public void setCreateBy(Long createBy) {
        this.createBy = createBy;
    }

    public String getDrawConditionArea() {
        return this.drawConditionArea;
    }

    public void setDrawConditionArea(String drawConditionArea) {
        this.drawConditionArea = drawConditionArea;
    }

    public McCouponTemplateDrawConditionAreatype getDrawConditionAreatype() {
        return this.drawConditionAreatype;
    }

    public void setDrawConditionAreatype(McCouponTemplateDrawConditionAreatype drawConditionAreatype) {
        this.drawConditionAreatype = drawConditionAreatype;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("McCouponTemplate (");

        sb.append(id);
        sb.append(", ").append(name);
        sb.append(", ").append(couponType);
        sb.append(", ").append(useGreaterAmount);
        sb.append(", ").append(useConditionAmount);
        sb.append(", ").append(amount);
        sb.append(", ").append(sender);
        sb.append(", ").append(sendId);
        sb.append(", ").append(startDate);
        sb.append(", ").append(endDate);
        sb.append(", ").append(limitCount);
        sb.append(", ").append(freeInstallmentNum);
        sb.append(", ").append(sendCount);
        sb.append(", ").append(drawCount);
        sb.append(", ").append(useCount);
        sb.append(", ").append(useConditionArea);
        sb.append(", ").append(useCondition);
        sb.append(", ").append(useNote);
        sb.append(", ").append(remark);
        sb.append(", ").append(status);
        sb.append(", ").append(drawCondition);
        sb.append(", ").append(drawAmount);
        sb.append(", ").append(createAt);
        sb.append(", ").append(updateAt);
        sb.append(", ").append(delFlag);
        sb.append(", ").append(version);
        sb.append(", ").append(createBy);
        sb.append(", ").append(drawConditionArea);
        sb.append(", ").append(drawConditionAreatype);

        sb.append(")");
        return sb.toString();
    }
}
