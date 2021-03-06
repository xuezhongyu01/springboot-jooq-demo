/*
 * This file is generated by jOOQ.
*/
package com.jooq.domain.tables.records;


import com.jooq.domain.enums.BscAuditHistoryAuditType;
import com.jooq.domain.tables.BscAuditHistory;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record12;
import org.jooq.Row12;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * 审核历史表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class BscAuditHistoryRecord extends UpdatableRecordImpl<BscAuditHistoryRecord> implements Record12<Long, Long, BscAuditHistoryAuditType, String, Timestamp, String, String, Long, Timestamp, Timestamp, Boolean, Long> {

    private static final long serialVersionUID = -876961493;

    /**
     * Setter for <code>xbkj.bsc_audit_history.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>xbkj.bsc_audit_history.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>xbkj.bsc_audit_history.sysuer_id</code>. 流程发起人
     */
    public void setSysuerId(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>xbkj.bsc_audit_history.sysuer_id</code>. 流程发起人
     */
    public Long getSysuerId() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>xbkj.bsc_audit_history.audit_type</code>. 优惠券，消息模版，发送消息,机构,门店，会员，课程，教师,门店活动,礼品
     */
    public void setAuditType(BscAuditHistoryAuditType value) {
        set(2, value);
    }

    /**
     * Getter for <code>xbkj.bsc_audit_history.audit_type</code>. 优惠券，消息模版，发送消息,机构,门店，会员，课程，教师,门店活动,礼品
     */
    public BscAuditHistoryAuditType getAuditType() {
        return (BscAuditHistoryAuditType) get(2);
    }

    /**
     * Setter for <code>xbkj.bsc_audit_history.audit_result</code>. 审核结果
     */
    public void setAuditResult(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>xbkj.bsc_audit_history.audit_result</code>. 审核结果
     */
    public String getAuditResult() {
        return (String) get(3);
    }

    /**
     * Setter for <code>xbkj.bsc_audit_history.audit_at</code>. 流程时间
     */
    public void setAuditAt(Timestamp value) {
        set(4, value);
    }

    /**
     * Getter for <code>xbkj.bsc_audit_history.audit_at</code>. 流程时间
     */
    public Timestamp getAuditAt() {
        return (Timestamp) get(4);
    }

    /**
     * Setter for <code>xbkj.bsc_audit_history.audit_advice</code>. 审核意见
     */
    public void setAuditAdvice(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>xbkj.bsc_audit_history.audit_advice</code>. 审核意见
     */
    public String getAuditAdvice() {
        return (String) get(5);
    }

    /**
     * Setter for <code>xbkj.bsc_audit_history.audit_desc</code>. 流程备注
     */
    public void setAuditDesc(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>xbkj.bsc_audit_history.audit_desc</code>. 流程备注
     */
    public String getAuditDesc() {
        return (String) get(6);
    }

    /**
     * Setter for <code>xbkj.bsc_audit_history.source_id</code>. 来源id(优惠券模板id，消息模版id，发送消息id，机构id，门店id)
     */
    public void setSourceId(Long value) {
        set(7, value);
    }

    /**
     * Getter for <code>xbkj.bsc_audit_history.source_id</code>. 来源id(优惠券模板id，消息模版id，发送消息id，机构id，门店id)
     */
    public Long getSourceId() {
        return (Long) get(7);
    }

    /**
     * Setter for <code>xbkj.bsc_audit_history.create_at</code>. 创建时间
     */
    public void setCreateAt(Timestamp value) {
        set(8, value);
    }

    /**
     * Getter for <code>xbkj.bsc_audit_history.create_at</code>. 创建时间
     */
    public Timestamp getCreateAt() {
        return (Timestamp) get(8);
    }

    /**
     * Setter for <code>xbkj.bsc_audit_history.update_at</code>. 更新时间
     */
    public void setUpdateAt(Timestamp value) {
        set(9, value);
    }

    /**
     * Getter for <code>xbkj.bsc_audit_history.update_at</code>. 更新时间
     */
    public Timestamp getUpdateAt() {
        return (Timestamp) get(9);
    }

    /**
     * Setter for <code>xbkj.bsc_audit_history.del_flag</code>. 删除标志
     */
    public void setDelFlag(Boolean value) {
        set(10, value);
    }

    /**
     * Getter for <code>xbkj.bsc_audit_history.del_flag</code>. 删除标志
     */
    public Boolean getDelFlag() {
        return (Boolean) get(10);
    }

    /**
     * Setter for <code>xbkj.bsc_audit_history.version</code>.
     */
    public void setVersion(Long value) {
        set(11, value);
    }

    /**
     * Getter for <code>xbkj.bsc_audit_history.version</code>.
     */
    public Long getVersion() {
        return (Long) get(11);
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
    // Record12 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row12<Long, Long, BscAuditHistoryAuditType, String, Timestamp, String, String, Long, Timestamp, Timestamp, Boolean, Long> fieldsRow() {
        return (Row12) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row12<Long, Long, BscAuditHistoryAuditType, String, Timestamp, String, String, Long, Timestamp, Timestamp, Boolean, Long> valuesRow() {
        return (Row12) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return BscAuditHistory.BSC_AUDIT_HISTORY.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field2() {
        return BscAuditHistory.BSC_AUDIT_HISTORY.SYSUER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BscAuditHistoryAuditType> field3() {
        return BscAuditHistory.BSC_AUDIT_HISTORY.AUDIT_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return BscAuditHistory.BSC_AUDIT_HISTORY.AUDIT_RESULT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field5() {
        return BscAuditHistory.BSC_AUDIT_HISTORY.AUDIT_AT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return BscAuditHistory.BSC_AUDIT_HISTORY.AUDIT_ADVICE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return BscAuditHistory.BSC_AUDIT_HISTORY.AUDIT_DESC;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field8() {
        return BscAuditHistory.BSC_AUDIT_HISTORY.SOURCE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field9() {
        return BscAuditHistory.BSC_AUDIT_HISTORY.CREATE_AT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field10() {
        return BscAuditHistory.BSC_AUDIT_HISTORY.UPDATE_AT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field11() {
        return BscAuditHistory.BSC_AUDIT_HISTORY.DEL_FLAG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field12() {
        return BscAuditHistory.BSC_AUDIT_HISTORY.VERSION;
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
        return getSysuerId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BscAuditHistoryAuditType component3() {
        return getAuditType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getAuditResult();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component5() {
        return getAuditAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getAuditAdvice();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getAuditDesc();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component8() {
        return getSourceId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component9() {
        return getCreateAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component10() {
        return getUpdateAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component11() {
        return getDelFlag();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component12() {
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
        return getSysuerId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BscAuditHistoryAuditType value3() {
        return getAuditType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getAuditResult();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value5() {
        return getAuditAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getAuditAdvice();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getAuditDesc();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value8() {
        return getSourceId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value9() {
        return getCreateAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value10() {
        return getUpdateAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value11() {
        return getDelFlag();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value12() {
        return getVersion();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BscAuditHistoryRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BscAuditHistoryRecord value2(Long value) {
        setSysuerId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BscAuditHistoryRecord value3(BscAuditHistoryAuditType value) {
        setAuditType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BscAuditHistoryRecord value4(String value) {
        setAuditResult(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BscAuditHistoryRecord value5(Timestamp value) {
        setAuditAt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BscAuditHistoryRecord value6(String value) {
        setAuditAdvice(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BscAuditHistoryRecord value7(String value) {
        setAuditDesc(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BscAuditHistoryRecord value8(Long value) {
        setSourceId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BscAuditHistoryRecord value9(Timestamp value) {
        setCreateAt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BscAuditHistoryRecord value10(Timestamp value) {
        setUpdateAt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BscAuditHistoryRecord value11(Boolean value) {
        setDelFlag(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BscAuditHistoryRecord value12(Long value) {
        setVersion(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BscAuditHistoryRecord values(Long value1, Long value2, BscAuditHistoryAuditType value3, String value4, Timestamp value5, String value6, String value7, Long value8, Timestamp value9, Timestamp value10, Boolean value11, Long value12) {
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
        value11(value11);
        value12(value12);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached BscAuditHistoryRecord
     */
    public BscAuditHistoryRecord() {
        super(BscAuditHistory.BSC_AUDIT_HISTORY);
    }

    /**
     * Create a detached, initialised BscAuditHistoryRecord
     */
    public BscAuditHistoryRecord(Long id, Long sysuerId, BscAuditHistoryAuditType auditType, String auditResult, Timestamp auditAt, String auditAdvice, String auditDesc, Long sourceId, Timestamp createAt, Timestamp updateAt, Boolean delFlag, Long version) {
        super(BscAuditHistory.BSC_AUDIT_HISTORY);

        set(0, id);
        set(1, sysuerId);
        set(2, auditType);
        set(3, auditResult);
        set(4, auditAt);
        set(5, auditAdvice);
        set(6, auditDesc);
        set(7, sourceId);
        set(8, createAt);
        set(9, updateAt);
        set(10, delFlag);
        set(11, version);
    }
}
