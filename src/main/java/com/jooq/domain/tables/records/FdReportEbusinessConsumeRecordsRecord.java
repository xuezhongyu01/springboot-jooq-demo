/*
 * This file is generated by jOOQ.
*/
package com.jooq.domain.tables.records;


import com.jooq.domain.tables.FdReportEbusinessConsumeRecords;

import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record9;
import org.jooq.Row9;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * 电商数据报告消费情况
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class FdReportEbusinessConsumeRecordsRecord extends UpdatableRecordImpl<FdReportEbusinessConsumeRecordsRecord> implements Record9<Long, Long, String, Long, BigDecimal, Timestamp, Timestamp, Boolean, Long> {

    private static final long serialVersionUID = -303053182;

    /**
     * Setter for <code>xbkj.fd_report_ebusiness_consume_records.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>xbkj.fd_report_ebusiness_consume_records.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>xbkj.fd_report_ebusiness_consume_records.report_ebusiness_id</code>.
     */
    public void setReportEbusinessId(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>xbkj.fd_report_ebusiness_consume_records.report_ebusiness_id</code>.
     */
    public Long getReportEbusinessId() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>xbkj.fd_report_ebusiness_consume_records.month</code>. 月份("YYYY-MM")
     */
    public void setMonth(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>xbkj.fd_report_ebusiness_consume_records.month</code>. 月份("YYYY-MM")
     */
    public String getMonth() {
        return (String) get(2);
    }

    /**
     * Setter for <code>xbkj.fd_report_ebusiness_consume_records.count</code>. 笔数
     */
    public void setCount(Long value) {
        set(3, value);
    }

    /**
     * Getter for <code>xbkj.fd_report_ebusiness_consume_records.count</code>. 笔数
     */
    public Long getCount() {
        return (Long) get(3);
    }

    /**
     * Setter for <code>xbkj.fd_report_ebusiness_consume_records.amount</code>. 金额(分)
     */
    public void setAmount(BigDecimal value) {
        set(4, value);
    }

    /**
     * Getter for <code>xbkj.fd_report_ebusiness_consume_records.amount</code>. 金额(分)
     */
    public BigDecimal getAmount() {
        return (BigDecimal) get(4);
    }

    /**
     * Setter for <code>xbkj.fd_report_ebusiness_consume_records.create_at</code>. 创建时间
     */
    public void setCreateAt(Timestamp value) {
        set(5, value);
    }

    /**
     * Getter for <code>xbkj.fd_report_ebusiness_consume_records.create_at</code>. 创建时间
     */
    public Timestamp getCreateAt() {
        return (Timestamp) get(5);
    }

    /**
     * Setter for <code>xbkj.fd_report_ebusiness_consume_records.update_at</code>. 更新时间
     */
    public void setUpdateAt(Timestamp value) {
        set(6, value);
    }

    /**
     * Getter for <code>xbkj.fd_report_ebusiness_consume_records.update_at</code>. 更新时间
     */
    public Timestamp getUpdateAt() {
        return (Timestamp) get(6);
    }

    /**
     * Setter for <code>xbkj.fd_report_ebusiness_consume_records.del_flag</code>. 删除标志
     */
    public void setDelFlag(Boolean value) {
        set(7, value);
    }

    /**
     * Getter for <code>xbkj.fd_report_ebusiness_consume_records.del_flag</code>. 删除标志
     */
    public Boolean getDelFlag() {
        return (Boolean) get(7);
    }

    /**
     * Setter for <code>xbkj.fd_report_ebusiness_consume_records.version</code>.
     */
    public void setVersion(Long value) {
        set(8, value);
    }

    /**
     * Getter for <code>xbkj.fd_report_ebusiness_consume_records.version</code>.
     */
    public Long getVersion() {
        return (Long) get(8);
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
    // Record9 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row9<Long, Long, String, Long, BigDecimal, Timestamp, Timestamp, Boolean, Long> fieldsRow() {
        return (Row9) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row9<Long, Long, String, Long, BigDecimal, Timestamp, Timestamp, Boolean, Long> valuesRow() {
        return (Row9) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return FdReportEbusinessConsumeRecords.FD_REPORT_EBUSINESS_CONSUME_RECORDS.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field2() {
        return FdReportEbusinessConsumeRecords.FD_REPORT_EBUSINESS_CONSUME_RECORDS.REPORT_EBUSINESS_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return FdReportEbusinessConsumeRecords.FD_REPORT_EBUSINESS_CONSUME_RECORDS.MONTH;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field4() {
        return FdReportEbusinessConsumeRecords.FD_REPORT_EBUSINESS_CONSUME_RECORDS.COUNT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field5() {
        return FdReportEbusinessConsumeRecords.FD_REPORT_EBUSINESS_CONSUME_RECORDS.AMOUNT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field6() {
        return FdReportEbusinessConsumeRecords.FD_REPORT_EBUSINESS_CONSUME_RECORDS.CREATE_AT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field7() {
        return FdReportEbusinessConsumeRecords.FD_REPORT_EBUSINESS_CONSUME_RECORDS.UPDATE_AT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field8() {
        return FdReportEbusinessConsumeRecords.FD_REPORT_EBUSINESS_CONSUME_RECORDS.DEL_FLAG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field9() {
        return FdReportEbusinessConsumeRecords.FD_REPORT_EBUSINESS_CONSUME_RECORDS.VERSION;
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
        return getReportEbusinessId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getMonth();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component4() {
        return getCount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component5() {
        return getAmount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component6() {
        return getCreateAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component7() {
        return getUpdateAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component8() {
        return getDelFlag();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component9() {
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
        return getReportEbusinessId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getMonth();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value4() {
        return getCount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value5() {
        return getAmount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value6() {
        return getCreateAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value7() {
        return getUpdateAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value8() {
        return getDelFlag();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value9() {
        return getVersion();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FdReportEbusinessConsumeRecordsRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FdReportEbusinessConsumeRecordsRecord value2(Long value) {
        setReportEbusinessId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FdReportEbusinessConsumeRecordsRecord value3(String value) {
        setMonth(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FdReportEbusinessConsumeRecordsRecord value4(Long value) {
        setCount(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FdReportEbusinessConsumeRecordsRecord value5(BigDecimal value) {
        setAmount(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FdReportEbusinessConsumeRecordsRecord value6(Timestamp value) {
        setCreateAt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FdReportEbusinessConsumeRecordsRecord value7(Timestamp value) {
        setUpdateAt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FdReportEbusinessConsumeRecordsRecord value8(Boolean value) {
        setDelFlag(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FdReportEbusinessConsumeRecordsRecord value9(Long value) {
        setVersion(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FdReportEbusinessConsumeRecordsRecord values(Long value1, Long value2, String value3, Long value4, BigDecimal value5, Timestamp value6, Timestamp value7, Boolean value8, Long value9) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached FdReportEbusinessConsumeRecordsRecord
     */
    public FdReportEbusinessConsumeRecordsRecord() {
        super(FdReportEbusinessConsumeRecords.FD_REPORT_EBUSINESS_CONSUME_RECORDS);
    }

    /**
     * Create a detached, initialised FdReportEbusinessConsumeRecordsRecord
     */
    public FdReportEbusinessConsumeRecordsRecord(Long id, Long reportEbusinessId, String month, Long count, BigDecimal amount, Timestamp createAt, Timestamp updateAt, Boolean delFlag, Long version) {
        super(FdReportEbusinessConsumeRecords.FD_REPORT_EBUSINESS_CONSUME_RECORDS);

        set(0, id);
        set(1, reportEbusinessId);
        set(2, month);
        set(3, count);
        set(4, amount);
        set(5, createAt);
        set(6, updateAt);
        set(7, delFlag);
        set(8, version);
    }
}
