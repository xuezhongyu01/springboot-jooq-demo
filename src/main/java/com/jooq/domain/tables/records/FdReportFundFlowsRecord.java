/*
 * This file is generated by jOOQ.
*/
package com.jooq.domain.tables.records;


import com.jooq.domain.tables.FdReportFundFlows;

import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record12;
import org.jooq.Row12;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * 公积金数据报告账户流水
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class FdReportFundFlowsRecord extends UpdatableRecordImpl<FdReportFundFlowsRecord> implements Record12<Long, Long, String, Timestamp, String, String, BigDecimal, BigDecimal, Timestamp, Timestamp, Boolean, Long> {

    private static final long serialVersionUID = 1586772338;

    /**
     * Setter for <code>xbkj.fd_report_fund_flows.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>xbkj.fd_report_fund_flows.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>xbkj.fd_report_fund_flows.report_fund_id</code>.
     */
    public void setReportFundId(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>xbkj.fd_report_fund_flows.report_fund_id</code>.
     */
    public Long getReportFundId() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>xbkj.fd_report_fund_flows.company</code>. 公司名称
     */
    public void setCompany(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>xbkj.fd_report_fund_flows.company</code>. 公司名称
     */
    public String getCompany() {
        return (String) get(2);
    }

    /**
     * Setter for <code>xbkj.fd_report_fund_flows.operation_date</code>. 操作日期(
     */
    public void setOperationDate(Timestamp value) {
        set(3, value);
    }

    /**
     * Getter for <code>xbkj.fd_report_fund_flows.operation_date</code>. 操作日期(
     */
    public Timestamp getOperationDate() {
        return (Timestamp) get(3);
    }

    /**
     * Setter for <code>xbkj.fd_report_fund_flows.operation_type</code>. 操作类型
     */
    public void setOperationType(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>xbkj.fd_report_fund_flows.operation_type</code>. 操作类型
     */
    public String getOperationType() {
        return (String) get(4);
    }

    /**
     * Setter for <code>xbkj.fd_report_fund_flows.record_month</code>. 缴纳月份
     */
    public void setRecordMonth(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>xbkj.fd_report_fund_flows.record_month</code>. 缴纳月份
     */
    public String getRecordMonth() {
        return (String) get(5);
    }

    /**
     * Setter for <code>xbkj.fd_report_fund_flows.amount</code>.  金额(分)
     */
    public void setAmount(BigDecimal value) {
        set(6, value);
    }

    /**
     * Getter for <code>xbkj.fd_report_fund_flows.amount</code>.  金额(分)
     */
    public BigDecimal getAmount() {
        return (BigDecimal) get(6);
    }

    /**
     * Setter for <code>xbkj.fd_report_fund_flows.balance</code>.  余额(分)
     */
    public void setBalance(BigDecimal value) {
        set(7, value);
    }

    /**
     * Getter for <code>xbkj.fd_report_fund_flows.balance</code>.  余额(分)
     */
    public BigDecimal getBalance() {
        return (BigDecimal) get(7);
    }

    /**
     * Setter for <code>xbkj.fd_report_fund_flows.create_at</code>. 创建时间
     */
    public void setCreateAt(Timestamp value) {
        set(8, value);
    }

    /**
     * Getter for <code>xbkj.fd_report_fund_flows.create_at</code>. 创建时间
     */
    public Timestamp getCreateAt() {
        return (Timestamp) get(8);
    }

    /**
     * Setter for <code>xbkj.fd_report_fund_flows.update_at</code>. 更新时间
     */
    public void setUpdateAt(Timestamp value) {
        set(9, value);
    }

    /**
     * Getter for <code>xbkj.fd_report_fund_flows.update_at</code>. 更新时间
     */
    public Timestamp getUpdateAt() {
        return (Timestamp) get(9);
    }

    /**
     * Setter for <code>xbkj.fd_report_fund_flows.del_flag</code>. 删除标志
     */
    public void setDelFlag(Boolean value) {
        set(10, value);
    }

    /**
     * Getter for <code>xbkj.fd_report_fund_flows.del_flag</code>. 删除标志
     */
    public Boolean getDelFlag() {
        return (Boolean) get(10);
    }

    /**
     * Setter for <code>xbkj.fd_report_fund_flows.version</code>.
     */
    public void setVersion(Long value) {
        set(11, value);
    }

    /**
     * Getter for <code>xbkj.fd_report_fund_flows.version</code>.
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
    public Row12<Long, Long, String, Timestamp, String, String, BigDecimal, BigDecimal, Timestamp, Timestamp, Boolean, Long> fieldsRow() {
        return (Row12) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row12<Long, Long, String, Timestamp, String, String, BigDecimal, BigDecimal, Timestamp, Timestamp, Boolean, Long> valuesRow() {
        return (Row12) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return FdReportFundFlows.FD_REPORT_FUND_FLOWS.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field2() {
        return FdReportFundFlows.FD_REPORT_FUND_FLOWS.REPORT_FUND_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return FdReportFundFlows.FD_REPORT_FUND_FLOWS.COMPANY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field4() {
        return FdReportFundFlows.FD_REPORT_FUND_FLOWS.OPERATION_DATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return FdReportFundFlows.FD_REPORT_FUND_FLOWS.OPERATION_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return FdReportFundFlows.FD_REPORT_FUND_FLOWS.RECORD_MONTH;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field7() {
        return FdReportFundFlows.FD_REPORT_FUND_FLOWS.AMOUNT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field8() {
        return FdReportFundFlows.FD_REPORT_FUND_FLOWS.BALANCE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field9() {
        return FdReportFundFlows.FD_REPORT_FUND_FLOWS.CREATE_AT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field10() {
        return FdReportFundFlows.FD_REPORT_FUND_FLOWS.UPDATE_AT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field11() {
        return FdReportFundFlows.FD_REPORT_FUND_FLOWS.DEL_FLAG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field12() {
        return FdReportFundFlows.FD_REPORT_FUND_FLOWS.VERSION;
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
        return getReportFundId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getCompany();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component4() {
        return getOperationDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getOperationType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getRecordMonth();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component7() {
        return getAmount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component8() {
        return getBalance();
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
        return getReportFundId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getCompany();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value4() {
        return getOperationDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getOperationType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getRecordMonth();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value7() {
        return getAmount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value8() {
        return getBalance();
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
    public FdReportFundFlowsRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FdReportFundFlowsRecord value2(Long value) {
        setReportFundId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FdReportFundFlowsRecord value3(String value) {
        setCompany(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FdReportFundFlowsRecord value4(Timestamp value) {
        setOperationDate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FdReportFundFlowsRecord value5(String value) {
        setOperationType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FdReportFundFlowsRecord value6(String value) {
        setRecordMonth(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FdReportFundFlowsRecord value7(BigDecimal value) {
        setAmount(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FdReportFundFlowsRecord value8(BigDecimal value) {
        setBalance(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FdReportFundFlowsRecord value9(Timestamp value) {
        setCreateAt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FdReportFundFlowsRecord value10(Timestamp value) {
        setUpdateAt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FdReportFundFlowsRecord value11(Boolean value) {
        setDelFlag(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FdReportFundFlowsRecord value12(Long value) {
        setVersion(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FdReportFundFlowsRecord values(Long value1, Long value2, String value3, Timestamp value4, String value5, String value6, BigDecimal value7, BigDecimal value8, Timestamp value9, Timestamp value10, Boolean value11, Long value12) {
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
     * Create a detached FdReportFundFlowsRecord
     */
    public FdReportFundFlowsRecord() {
        super(FdReportFundFlows.FD_REPORT_FUND_FLOWS);
    }

    /**
     * Create a detached, initialised FdReportFundFlowsRecord
     */
    public FdReportFundFlowsRecord(Long id, Long reportFundId, String company, Timestamp operationDate, String operationType, String recordMonth, BigDecimal amount, BigDecimal balance, Timestamp createAt, Timestamp updateAt, Boolean delFlag, Long version) {
        super(FdReportFundFlows.FD_REPORT_FUND_FLOWS);

        set(0, id);
        set(1, reportFundId);
        set(2, company);
        set(3, operationDate);
        set(4, operationType);
        set(5, recordMonth);
        set(6, amount);
        set(7, balance);
        set(8, createAt);
        set(9, updateAt);
        set(10, delFlag);
        set(11, version);
    }
}
