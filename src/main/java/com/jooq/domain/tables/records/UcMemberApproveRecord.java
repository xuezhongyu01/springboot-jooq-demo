/*
 * This file is generated by jOOQ.
*/
package com.jooq.domain.tables.records;


import com.jooq.domain.enums.UcMemberApproveApproveStatus;
import com.jooq.domain.enums.UcMemberApproveApproveType;
import com.jooq.domain.tables.UcMemberApprove;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record10;
import org.jooq.Row10;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * 用户认证表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UcMemberApproveRecord extends UpdatableRecordImpl<UcMemberApproveRecord> implements Record10<Long, Long, UcMemberApproveApproveType, UcMemberApproveApproveStatus, Timestamp, String, Timestamp, Timestamp, Boolean, Long> {

    private static final long serialVersionUID = -713079565;

    /**
     * Setter for <code>xbkj.uc_member_approve.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>xbkj.uc_member_approve.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>xbkj.uc_member_approve.member_id</code>. 用户id
     */
    public void setMemberId(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>xbkj.uc_member_approve.member_id</code>. 用户id
     */
    public Long getMemberId() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>xbkj.uc_member_approve.approve_type</code>. 认证类型:基本信息,身份证,运营商,社保，电商,公积金，人脸认证,芝麻认证，信用卡认证,学历认证,京东认证，淘宝认证，储蓄卡认证
     */
    public void setApproveType(UcMemberApproveApproveType value) {
        set(2, value);
    }

    /**
     * Getter for <code>xbkj.uc_member_approve.approve_type</code>. 认证类型:基本信息,身份证,运营商,社保，电商,公积金，人脸认证,芝麻认证，信用卡认证,学历认证,京东认证，淘宝认证，储蓄卡认证
     */
    public UcMemberApproveApproveType getApproveType() {
        return (UcMemberApproveApproveType) get(2);
    }

    /**
     * Setter for <code>xbkj.uc_member_approve.approve_status</code>. 认证状态,未认证，认证中，成功， 失败
     */
    public void setApproveStatus(UcMemberApproveApproveStatus value) {
        set(3, value);
    }

    /**
     * Getter for <code>xbkj.uc_member_approve.approve_status</code>. 认证状态,未认证，认证中，成功， 失败
     */
    public UcMemberApproveApproveStatus getApproveStatus() {
        return (UcMemberApproveApproveStatus) get(3);
    }

    /**
     * Setter for <code>xbkj.uc_member_approve.approve_time</code>. 认证通过时间
     */
    public void setApproveTime(Timestamp value) {
        set(4, value);
    }

    /**
     * Getter for <code>xbkj.uc_member_approve.approve_time</code>. 认证通过时间
     */
    public Timestamp getApproveTime() {
        return (Timestamp) get(4);
    }

    /**
     * Setter for <code>xbkj.uc_member_approve.third_service_no</code>. 第三方公司关联
     */
    public void setThirdServiceNo(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>xbkj.uc_member_approve.third_service_no</code>. 第三方公司关联
     */
    public String getThirdServiceNo() {
        return (String) get(5);
    }

    /**
     * Setter for <code>xbkj.uc_member_approve.create_at</code>. 创建时间
     */
    public void setCreateAt(Timestamp value) {
        set(6, value);
    }

    /**
     * Getter for <code>xbkj.uc_member_approve.create_at</code>. 创建时间
     */
    public Timestamp getCreateAt() {
        return (Timestamp) get(6);
    }

    /**
     * Setter for <code>xbkj.uc_member_approve.update_at</code>. 更新时间
     */
    public void setUpdateAt(Timestamp value) {
        set(7, value);
    }

    /**
     * Getter for <code>xbkj.uc_member_approve.update_at</code>. 更新时间
     */
    public Timestamp getUpdateAt() {
        return (Timestamp) get(7);
    }

    /**
     * Setter for <code>xbkj.uc_member_approve.del_flag</code>. 删除标志
     */
    public void setDelFlag(Boolean value) {
        set(8, value);
    }

    /**
     * Getter for <code>xbkj.uc_member_approve.del_flag</code>. 删除标志
     */
    public Boolean getDelFlag() {
        return (Boolean) get(8);
    }

    /**
     * Setter for <code>xbkj.uc_member_approve.version</code>.
     */
    public void setVersion(Long value) {
        set(9, value);
    }

    /**
     * Getter for <code>xbkj.uc_member_approve.version</code>.
     */
    public Long getVersion() {
        return (Long) get(9);
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
    // Record10 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row10<Long, Long, UcMemberApproveApproveType, UcMemberApproveApproveStatus, Timestamp, String, Timestamp, Timestamp, Boolean, Long> fieldsRow() {
        return (Row10) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row10<Long, Long, UcMemberApproveApproveType, UcMemberApproveApproveStatus, Timestamp, String, Timestamp, Timestamp, Boolean, Long> valuesRow() {
        return (Row10) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return UcMemberApprove.UC_MEMBER_APPROVE.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field2() {
        return UcMemberApprove.UC_MEMBER_APPROVE.MEMBER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UcMemberApproveApproveType> field3() {
        return UcMemberApprove.UC_MEMBER_APPROVE.APPROVE_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UcMemberApproveApproveStatus> field4() {
        return UcMemberApprove.UC_MEMBER_APPROVE.APPROVE_STATUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field5() {
        return UcMemberApprove.UC_MEMBER_APPROVE.APPROVE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return UcMemberApprove.UC_MEMBER_APPROVE.THIRD_SERVICE_NO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field7() {
        return UcMemberApprove.UC_MEMBER_APPROVE.CREATE_AT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field8() {
        return UcMemberApprove.UC_MEMBER_APPROVE.UPDATE_AT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field9() {
        return UcMemberApprove.UC_MEMBER_APPROVE.DEL_FLAG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field10() {
        return UcMemberApprove.UC_MEMBER_APPROVE.VERSION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component2() {
        return getMemberId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UcMemberApproveApproveType component3() {
        return getApproveType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UcMemberApproveApproveStatus component4() {
        return getApproveStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component5() {
        return getApproveTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getThirdServiceNo();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component7() {
        return getCreateAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component8() {
        return getUpdateAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component9() {
        return getDelFlag();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component10() {
        return getVersion();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value2() {
        return getMemberId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UcMemberApproveApproveType value3() {
        return getApproveType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UcMemberApproveApproveStatus value4() {
        return getApproveStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value5() {
        return getApproveTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getThirdServiceNo();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value7() {
        return getCreateAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value8() {
        return getUpdateAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value9() {
        return getDelFlag();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value10() {
        return getVersion();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UcMemberApproveRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UcMemberApproveRecord value2(Long value) {
        setMemberId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UcMemberApproveRecord value3(UcMemberApproveApproveType value) {
        setApproveType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UcMemberApproveRecord value4(UcMemberApproveApproveStatus value) {
        setApproveStatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UcMemberApproveRecord value5(Timestamp value) {
        setApproveTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UcMemberApproveRecord value6(String value) {
        setThirdServiceNo(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UcMemberApproveRecord value7(Timestamp value) {
        setCreateAt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UcMemberApproveRecord value8(Timestamp value) {
        setUpdateAt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UcMemberApproveRecord value9(Boolean value) {
        setDelFlag(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UcMemberApproveRecord value10(Long value) {
        setVersion(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UcMemberApproveRecord values(Long value1, Long value2, UcMemberApproveApproveType value3, UcMemberApproveApproveStatus value4, Timestamp value5, String value6, Timestamp value7, Timestamp value8, Boolean value9, Long value10) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached UcMemberApproveRecord
     */
    public UcMemberApproveRecord() {
        super(UcMemberApprove.UC_MEMBER_APPROVE);
    }

    /**
     * Create a detached, initialised UcMemberApproveRecord
     */
    public UcMemberApproveRecord(Long id, Long memberId, UcMemberApproveApproveType approveType, UcMemberApproveApproveStatus approveStatus, Timestamp approveTime, String thirdServiceNo, Timestamp createAt, Timestamp updateAt, Boolean delFlag, Long version) {
        super(UcMemberApprove.UC_MEMBER_APPROVE);

        set(0, id);
        set(1, memberId);
        set(2, approveType);
        set(3, approveStatus);
        set(4, approveTime);
        set(5, thirdServiceNo);
        set(6, createAt);
        set(7, updateAt);
        set(8, delFlag);
        set(9, version);
    }
}
