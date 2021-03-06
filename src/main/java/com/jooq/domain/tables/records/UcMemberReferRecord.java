/*
 * This file is generated by jOOQ.
*/
package com.jooq.domain.tables.records;


import com.jooq.domain.tables.UcMemberRefer;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record8;
import org.jooq.Row8;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * 用户推荐表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UcMemberReferRecord extends UpdatableRecordImpl<UcMemberReferRecord> implements Record8<Long, Long, Long, String, Timestamp, Timestamp, Boolean, Long> {

    private static final long serialVersionUID = -592246391;

    /**
     * Setter for <code>xbkj.uc_member_refer.id</code>. id
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>xbkj.uc_member_refer.id</code>. id
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>xbkj.uc_member_refer.referral</code>. 推荐人
     */
    public void setReferral(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>xbkj.uc_member_refer.referral</code>. 推荐人
     */
    public Long getReferral() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>xbkj.uc_member_refer.referred</code>. 被推荐人
     */
    public void setReferred(Long value) {
        set(2, value);
    }

    /**
     * Getter for <code>xbkj.uc_member_refer.referred</code>. 被推荐人
     */
    public Long getReferred() {
        return (Long) get(2);
    }

    /**
     * Setter for <code>xbkj.uc_member_refer.remarks</code>. 备注
     */
    public void setRemarks(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>xbkj.uc_member_refer.remarks</code>. 备注
     */
    public String getRemarks() {
        return (String) get(3);
    }

    /**
     * Setter for <code>xbkj.uc_member_refer.create_at</code>. 创建时间
     */
    public void setCreateAt(Timestamp value) {
        set(4, value);
    }

    /**
     * Getter for <code>xbkj.uc_member_refer.create_at</code>. 创建时间
     */
    public Timestamp getCreateAt() {
        return (Timestamp) get(4);
    }

    /**
     * Setter for <code>xbkj.uc_member_refer.update_at</code>. 更新时间
     */
    public void setUpdateAt(Timestamp value) {
        set(5, value);
    }

    /**
     * Getter for <code>xbkj.uc_member_refer.update_at</code>. 更新时间
     */
    public Timestamp getUpdateAt() {
        return (Timestamp) get(5);
    }

    /**
     * Setter for <code>xbkj.uc_member_refer.del_flag</code>. 删除标志
     */
    public void setDelFlag(Boolean value) {
        set(6, value);
    }

    /**
     * Getter for <code>xbkj.uc_member_refer.del_flag</code>. 删除标志
     */
    public Boolean getDelFlag() {
        return (Boolean) get(6);
    }

    /**
     * Setter for <code>xbkj.uc_member_refer.version</code>.
     */
    public void setVersion(Long value) {
        set(7, value);
    }

    /**
     * Getter for <code>xbkj.uc_member_refer.version</code>.
     */
    public Long getVersion() {
        return (Long) get(7);
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
    // Record8 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<Long, Long, Long, String, Timestamp, Timestamp, Boolean, Long> fieldsRow() {
        return (Row8) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<Long, Long, Long, String, Timestamp, Timestamp, Boolean, Long> valuesRow() {
        return (Row8) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return UcMemberRefer.UC_MEMBER_REFER.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field2() {
        return UcMemberRefer.UC_MEMBER_REFER.REFERRAL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field3() {
        return UcMemberRefer.UC_MEMBER_REFER.REFERRED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return UcMemberRefer.UC_MEMBER_REFER.REMARKS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field5() {
        return UcMemberRefer.UC_MEMBER_REFER.CREATE_AT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field6() {
        return UcMemberRefer.UC_MEMBER_REFER.UPDATE_AT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field7() {
        return UcMemberRefer.UC_MEMBER_REFER.DEL_FLAG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field8() {
        return UcMemberRefer.UC_MEMBER_REFER.VERSION;
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
        return getReferral();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component3() {
        return getReferred();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getRemarks();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component5() {
        return getCreateAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component6() {
        return getUpdateAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component7() {
        return getDelFlag();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component8() {
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
        return getReferral();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value3() {
        return getReferred();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getRemarks();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value5() {
        return getCreateAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value6() {
        return getUpdateAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value7() {
        return getDelFlag();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value8() {
        return getVersion();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UcMemberReferRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UcMemberReferRecord value2(Long value) {
        setReferral(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UcMemberReferRecord value3(Long value) {
        setReferred(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UcMemberReferRecord value4(String value) {
        setRemarks(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UcMemberReferRecord value5(Timestamp value) {
        setCreateAt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UcMemberReferRecord value6(Timestamp value) {
        setUpdateAt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UcMemberReferRecord value7(Boolean value) {
        setDelFlag(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UcMemberReferRecord value8(Long value) {
        setVersion(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UcMemberReferRecord values(Long value1, Long value2, Long value3, String value4, Timestamp value5, Timestamp value6, Boolean value7, Long value8) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached UcMemberReferRecord
     */
    public UcMemberReferRecord() {
        super(UcMemberRefer.UC_MEMBER_REFER);
    }

    /**
     * Create a detached, initialised UcMemberReferRecord
     */
    public UcMemberReferRecord(Long id, Long referral, Long referred, String remarks, Timestamp createAt, Timestamp updateAt, Boolean delFlag, Long version) {
        super(UcMemberRefer.UC_MEMBER_REFER);

        set(0, id);
        set(1, referral);
        set(2, referred);
        set(3, remarks);
        set(4, createAt);
        set(5, updateAt);
        set(6, delFlag);
        set(7, version);
    }
}
