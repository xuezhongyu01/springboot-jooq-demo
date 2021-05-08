/*
 * This file is generated by jOOQ.
*/
package com.jooq.domain.tables.records;


import com.jooq.domain.enums.McCouponCouponType;
import com.jooq.domain.enums.McCouponSender;
import com.jooq.domain.enums.McCouponSourceType;
import com.jooq.domain.enums.McCouponStatus;
import com.jooq.domain.enums.McCouponUseConditionArea;
import com.jooq.domain.tables.McCoupon;

import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Record1;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * 优惠券
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class McCouponRecord extends UpdatableRecordImpl<McCouponRecord> {

    private static final long serialVersionUID = -1049489601;

    /**
     * Setter for <code>xbkj.mc_coupon.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>xbkj.mc_coupon.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>xbkj.mc_coupon.member_id</code>. 持有人id
     */
    public void setMemberId(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>xbkj.mc_coupon.member_id</code>. 持有人id
     */
    public Long getMemberId() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>xbkj.mc_coupon.order_id</code>. 订单ID
     */
    public void setOrderId(Long value) {
        set(2, value);
    }

    /**
     * Getter for <code>xbkj.mc_coupon.order_id</code>. 订单ID
     */
    public Long getOrderId() {
        return (Long) get(2);
    }

    /**
     * Setter for <code>xbkj.mc_coupon.coupon_code</code>. 优惠券编码
     */
    public void setCouponCode(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>xbkj.mc_coupon.coupon_code</code>. 优惠券编码
     */
    public String getCouponCode() {
        return (String) get(3);
    }

    /**
     * Setter for <code>xbkj.mc_coupon.name</code>. 优惠券名称
     */
    public void setName(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>xbkj.mc_coupon.name</code>. 优惠券名称
     */
    public String getName() {
        return (String) get(4);
    }

    /**
     * Setter for <code>xbkj.mc_coupon.coupon_template_id</code>. 优惠券模板id
     */
    public void setCouponTemplateId(Long value) {
        set(5, value);
    }

    /**
     * Getter for <code>xbkj.mc_coupon.coupon_template_id</code>. 优惠券模板id
     */
    public Long getCouponTemplateId() {
        return (Long) get(5);
    }

    /**
     * Setter for <code>xbkj.mc_coupon.coupon_type</code>. 优惠券类型 1-抵价券 2-打折券 3-满减券 4-贴息券 5-免息券
     */
    public void setCouponType(McCouponCouponType value) {
        set(6, value);
    }

    /**
     * Getter for <code>xbkj.mc_coupon.coupon_type</code>. 优惠券类型 1-抵价券 2-打折券 3-满减券 4-贴息券 5-免息券
     */
    public McCouponCouponType getCouponType() {
        return (McCouponCouponType) get(6);
    }

    /**
     * Setter for <code>xbkj.mc_coupon.use_greater_amount</code>. 使用条件大于金额
     */
    public void setUseGreaterAmount(BigDecimal value) {
        set(7, value);
    }

    /**
     * Getter for <code>xbkj.mc_coupon.use_greater_amount</code>. 使用条件大于金额
     */
    public BigDecimal getUseGreaterAmount() {
        return (BigDecimal) get(7);
    }

    /**
     * Setter for <code>xbkj.mc_coupon.use_condition_amount</code>. 满减劵-消费满的金额
     */
    public void setUseConditionAmount(BigDecimal value) {
        set(8, value);
    }

    /**
     * Getter for <code>xbkj.mc_coupon.use_condition_amount</code>. 满减劵-消费满的金额
     */
    public BigDecimal getUseConditionAmount() {
        return (BigDecimal) get(8);
    }

    /**
     * Setter for <code>xbkj.mc_coupon.free_installment_num</code>. 免息分期期数
     */
    public void setFreeInstallmentNum(Integer value) {
        set(9, value);
    }

    /**
     * Getter for <code>xbkj.mc_coupon.free_installment_num</code>. 免息分期期数
     */
    public Integer getFreeInstallmentNum() {
        return (Integer) get(9);
    }

    /**
     * Setter for <code>xbkj.mc_coupon.amount</code>. 面额(抵价券，打折券=价格打折,贴息券则表示折扣率，免息券则表示利率=0)
     */
    public void setAmount(BigDecimal value) {
        set(10, value);
    }

    /**
     * Getter for <code>xbkj.mc_coupon.amount</code>. 面额(抵价券，打折券=价格打折,贴息券则表示折扣率，免息券则表示利率=0)
     */
    public BigDecimal getAmount() {
        return (BigDecimal) get(10);
    }

    /**
     * Setter for <code>xbkj.mc_coupon.start_date</code>. 券有效开始时间
     */
    public void setStartDate(Timestamp value) {
        set(11, value);
    }

    /**
     * Getter for <code>xbkj.mc_coupon.start_date</code>. 券有效开始时间
     */
    public Timestamp getStartDate() {
        return (Timestamp) get(11);
    }

    /**
     * Setter for <code>xbkj.mc_coupon.end_date</code>. 券有效结束时间
     */
    public void setEndDate(Timestamp value) {
        set(12, value);
    }

    /**
     * Getter for <code>xbkj.mc_coupon.end_date</code>. 券有效结束时间
     */
    public Timestamp getEndDate() {
        return (Timestamp) get(12);
    }

    /**
     * Setter for <code>xbkj.mc_coupon.use_condition_area</code>. 使用范围 培训机构、单店、课程 平台
     */
    public void setUseConditionArea(McCouponUseConditionArea value) {
        set(13, value);
    }

    /**
     * Getter for <code>xbkj.mc_coupon.use_condition_area</code>. 使用范围 培训机构、单店、课程 平台
     */
    public McCouponUseConditionArea getUseConditionArea() {
        return (McCouponUseConditionArea) get(13);
    }

    /**
     * Setter for <code>xbkj.mc_coupon.use_condition</code>. 使用范围，培训机构ID数组，以英文逗号分隔, 单店ID数组，课程ID数组
     */
    public void setUseCondition(String value) {
        set(14, value);
    }

    /**
     * Getter for <code>xbkj.mc_coupon.use_condition</code>. 使用范围，培训机构ID数组，以英文逗号分隔, 单店ID数组，课程ID数组
     */
    public String getUseCondition() {
        return (String) get(14);
    }

    /**
     * Setter for <code>xbkj.mc_coupon.status</code>. 状态：未使用，已使用，使用中，过期，禁用
     */
    public void setStatus(McCouponStatus value) {
        set(15, value);
    }

    /**
     * Getter for <code>xbkj.mc_coupon.status</code>. 状态：未使用，已使用，使用中，过期，禁用
     */
    public McCouponStatus getStatus() {
        return (McCouponStatus) get(15);
    }

    /**
     * Setter for <code>xbkj.mc_coupon.receive_time</code>. 领取时间
     */
    public void setReceiveTime(Timestamp value) {
        set(16, value);
    }

    /**
     * Getter for <code>xbkj.mc_coupon.receive_time</code>. 领取时间
     */
    public Timestamp getReceiveTime() {
        return (Timestamp) get(16);
    }

    /**
     * Setter for <code>xbkj.mc_coupon.used_time</code>. 使用时间
     */
    public void setUsedTime(Timestamp value) {
        set(17, value);
    }

    /**
     * Getter for <code>xbkj.mc_coupon.used_time</code>. 使用时间
     */
    public Timestamp getUsedTime() {
        return (Timestamp) get(17);
    }

    /**
     * Setter for <code>xbkj.mc_coupon.remarks</code>. 备注
     */
    public void setRemarks(String value) {
        set(18, value);
    }

    /**
     * Getter for <code>xbkj.mc_coupon.remarks</code>. 备注
     */
    public String getRemarks() {
        return (String) get(18);
    }

    /**
     * Setter for <code>xbkj.mc_coupon.sender</code>. 发放人 培训机构、单店、平台 
     */
    public void setSender(McCouponSender value) {
        set(19, value);
    }

    /**
     * Getter for <code>xbkj.mc_coupon.sender</code>. 发放人 培训机构、单店、平台 
     */
    public McCouponSender getSender() {
        return (McCouponSender) get(19);
    }

    /**
     * Setter for <code>xbkj.mc_coupon.sender_id</code>. send_id 针对机构，门店，课程发放的id
     */
    public void setSenderId(Long value) {
        set(20, value);
    }

    /**
     * Getter for <code>xbkj.mc_coupon.sender_id</code>. send_id 针对机构，门店，课程发放的id
     */
    public Long getSenderId() {
        return (Long) get(20);
    }

    /**
     * Setter for <code>xbkj.mc_coupon.given_id</code>. 被分享人id
     */
    public void setGivenId(Long value) {
        set(21, value);
    }

    /**
     * Getter for <code>xbkj.mc_coupon.given_id</code>. 被分享人id
     */
    public Long getGivenId() {
        return (Long) get(21);
    }

    /**
     * Setter for <code>xbkj.mc_coupon.create_at</code>. 创建时间
     */
    public void setCreateAt(Timestamp value) {
        set(22, value);
    }

    /**
     * Getter for <code>xbkj.mc_coupon.create_at</code>. 创建时间
     */
    public Timestamp getCreateAt() {
        return (Timestamp) get(22);
    }

    /**
     * Setter for <code>xbkj.mc_coupon.update_at</code>. 更新时间
     */
    public void setUpdateAt(Timestamp value) {
        set(23, value);
    }

    /**
     * Getter for <code>xbkj.mc_coupon.update_at</code>. 更新时间
     */
    public Timestamp getUpdateAt() {
        return (Timestamp) get(23);
    }

    /**
     * Setter for <code>xbkj.mc_coupon.del_flag</code>. 删除标志
     */
    public void setDelFlag(Boolean value) {
        set(24, value);
    }

    /**
     * Getter for <code>xbkj.mc_coupon.del_flag</code>. 删除标志
     */
    public Boolean getDelFlag() {
        return (Boolean) get(24);
    }

    /**
     * Setter for <code>xbkj.mc_coupon.version</code>.
     */
    public void setVersion(Long value) {
        set(25, value);
    }

    /**
     * Getter for <code>xbkj.mc_coupon.version</code>.
     */
    public Long getVersion() {
        return (Long) get(25);
    }

    /**
     * Setter for <code>xbkj.mc_coupon.can_shared</code>. 是否可分享,默认可分享
     */
    public void setCanShared(Boolean value) {
        set(26, value);
    }

    /**
     * Getter for <code>xbkj.mc_coupon.can_shared</code>. 是否可分享,默认可分享
     */
    public Boolean getCanShared() {
        return (Boolean) get(26);
    }

    /**
     * Setter for <code>xbkj.mc_coupon.source_type</code>. 优惠卷来源类型:下订单，试听课
     */
    public void setSourceType(McCouponSourceType value) {
        set(27, value);
    }

    /**
     * Getter for <code>xbkj.mc_coupon.source_type</code>. 优惠卷来源类型:下订单，试听课
     */
    public McCouponSourceType getSourceType() {
        return (McCouponSourceType) get(27);
    }

    /**
     * Setter for <code>xbkj.mc_coupon.source_id</code>. 来源id
     */
    public void setSourceId(Long value) {
        set(28, value);
    }

    /**
     * Getter for <code>xbkj.mc_coupon.source_id</code>. 来源id
     */
    public Long getSourceId() {
        return (Long) get(28);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached McCouponRecord
     */
    public McCouponRecord() {
        super(McCoupon.MC_COUPON);
    }

    /**
     * Create a detached, initialised McCouponRecord
     */
    public McCouponRecord(Long id, Long memberId, Long orderId, String couponCode, String name, Long couponTemplateId, McCouponCouponType couponType, BigDecimal useGreaterAmount, BigDecimal useConditionAmount, Integer freeInstallmentNum, BigDecimal amount, Timestamp startDate, Timestamp endDate, McCouponUseConditionArea useConditionArea, String useCondition, McCouponStatus status, Timestamp receiveTime, Timestamp usedTime, String remarks, McCouponSender sender, Long senderId, Long givenId, Timestamp createAt, Timestamp updateAt, Boolean delFlag, Long version, Boolean canShared, McCouponSourceType sourceType, Long sourceId) {
        super(McCoupon.MC_COUPON);

        set(0, id);
        set(1, memberId);
        set(2, orderId);
        set(3, couponCode);
        set(4, name);
        set(5, couponTemplateId);
        set(6, couponType);
        set(7, useGreaterAmount);
        set(8, useConditionAmount);
        set(9, freeInstallmentNum);
        set(10, amount);
        set(11, startDate);
        set(12, endDate);
        set(13, useConditionArea);
        set(14, useCondition);
        set(15, status);
        set(16, receiveTime);
        set(17, usedTime);
        set(18, remarks);
        set(19, sender);
        set(20, senderId);
        set(21, givenId);
        set(22, createAt);
        set(23, updateAt);
        set(24, delFlag);
        set(25, version);
        set(26, canShared);
        set(27, sourceType);
        set(28, sourceId);
    }
}
