/*
 * This file is generated by jOOQ.
*/
package com.jooq.domain.tables.records;


import com.jooq.domain.tables.FdBankPositionFund;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record19;
import org.jooq.Row19;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * 基金持仓(数组)
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class FdBankPositionFundRecord extends UpdatableRecordImpl<FdBankPositionFundRecord> implements Record19<Long, Long, String, String, String, String, String, String, String, String, String, String, String, String, String, Timestamp, Timestamp, Boolean, Long> {

    private static final long serialVersionUID = 1130927686;

    /**
     * Setter for <code>xbkj.fd_bank_position_fund.id</code>. 主键
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>xbkj.fd_bank_position_fund.id</code>. 主键
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>xbkj.fd_bank_position_fund.account_id</code>. 账户ID(关联字段)
     */
    public void setAccountId(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>xbkj.fd_bank_position_fund.account_id</code>. 账户ID(关联字段)
     */
    public Long getAccountId() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>xbkj.fd_bank_position_fund.code</code>. 产品代码
     */
    public void setCode(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>xbkj.fd_bank_position_fund.code</code>. 产品代码
     */
    public String getCode() {
        return (String) get(2);
    }

    /**
     * Setter for <code>xbkj.fd_bank_position_fund.name</code>. 产品名称
     */
    public void setName(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>xbkj.fd_bank_position_fund.name</code>. 产品名称
     */
    public String getName() {
        return (String) get(3);
    }

    /**
     * Setter for <code>xbkj.fd_bank_position_fund.currency</code>. 币种(中文，参见币种字典)
     */
    public void setCurrency(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>xbkj.fd_bank_position_fund.currency</code>. 币种(中文，参见币种字典)
     */
    public String getCurrency() {
        return (String) get(4);
    }

    /**
     * Setter for <code>xbkj.fd_bank_position_fund.capital</code>. 本金(单位：分)
     */
    public void setCapital(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>xbkj.fd_bank_position_fund.capital</code>. 本金(单位：分)
     */
    public String getCapital() {
        return (String) get(5);
    }

    /**
     * Setter for <code>xbkj.fd_bank_position_fund.share</code>. 当前份额(单位：分)
     */
    public void setShare(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>xbkj.fd_bank_position_fund.share</code>. 当前份额(单位：分)
     */
    public String getShare() {
        return (String) get(6);
    }

    /**
     * Setter for <code>xbkj.fd_bank_position_fund.usable_share</code>. 可用份额(单位：分)
     */
    public void setUsableShare(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>xbkj.fd_bank_position_fund.usable_share</code>. 可用份额(单位：分)
     */
    public String getUsableShare() {
        return (String) get(7);
    }

    /**
     * Setter for <code>xbkj.fd_bank_position_fund.dividend_type</code>. 分红方式(现金分红／红利再投资)
     */
    public void setDividendType(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>xbkj.fd_bank_position_fund.dividend_type</code>. 分红方式(现金分红／红利再投资)
     */
    public String getDividendType() {
        return (String) get(8);
    }

    /**
     * Setter for <code>xbkj.fd_bank_position_fund.net_value</code>. 当前净值(单位：分)
     */
    public void setNetValue(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>xbkj.fd_bank_position_fund.net_value</code>. 当前净值(单位：分)
     */
    public String getNetValue() {
        return (String) get(9);
    }

    /**
     * Setter for <code>xbkj.fd_bank_position_fund.net_value_date</code>. 净值日期
     */
    public void setNetValueDate(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>xbkj.fd_bank_position_fund.net_value_date</code>. 净值日期
     */
    public String getNetValueDate() {
        return (String) get(10);
    }

    /**
     * Setter for <code>xbkj.fd_bank_position_fund.market_value</code>. 当前市值
     */
    public void setMarketValue(String value) {
        set(11, value);
    }

    /**
     * Getter for <code>xbkj.fd_bank_position_fund.market_value</code>. 当前市值
     */
    public String getMarketValue() {
        return (String) get(11);
    }

    /**
     * Setter for <code>xbkj.fd_bank_position_fund.floating_pl</code>. 浮动盈亏(单位：分)
     */
    public void setFloatingPl(String value) {
        set(12, value);
    }

    /**
     * Getter for <code>xbkj.fd_bank_position_fund.floating_pl</code>. 浮动盈亏(单位：分)
     */
    public String getFloatingPl() {
        return (String) get(12);
    }

    /**
     * Setter for <code>xbkj.fd_bank_position_fund.yield</code>. 收益率(单位：百分比)
     */
    public void setYield(String value) {
        set(13, value);
    }

    /**
     * Getter for <code>xbkj.fd_bank_position_fund.yield</code>. 收益率(单位：百分比)
     */
    public String getYield() {
        return (String) get(13);
    }

    /**
     * Setter for <code>xbkj.fd_bank_position_fund.income_yesterday</code>. 昨日收益(单位：分)
     */
    public void setIncomeYesterday(String value) {
        set(14, value);
    }

    /**
     * Getter for <code>xbkj.fd_bank_position_fund.income_yesterday</code>. 昨日收益(单位：分)
     */
    public String getIncomeYesterday() {
        return (String) get(14);
    }

    /**
     * Setter for <code>xbkj.fd_bank_position_fund.create_at</code>. 创建时间
     */
    public void setCreateAt(Timestamp value) {
        set(15, value);
    }

    /**
     * Getter for <code>xbkj.fd_bank_position_fund.create_at</code>. 创建时间
     */
    public Timestamp getCreateAt() {
        return (Timestamp) get(15);
    }

    /**
     * Setter for <code>xbkj.fd_bank_position_fund.update_at</code>. 更新时间
     */
    public void setUpdateAt(Timestamp value) {
        set(16, value);
    }

    /**
     * Getter for <code>xbkj.fd_bank_position_fund.update_at</code>. 更新时间
     */
    public Timestamp getUpdateAt() {
        return (Timestamp) get(16);
    }

    /**
     * Setter for <code>xbkj.fd_bank_position_fund.del_flag</code>. 删除标志
     */
    public void setDelFlag(Boolean value) {
        set(17, value);
    }

    /**
     * Getter for <code>xbkj.fd_bank_position_fund.del_flag</code>. 删除标志
     */
    public Boolean getDelFlag() {
        return (Boolean) get(17);
    }

    /**
     * Setter for <code>xbkj.fd_bank_position_fund.version</code>.
     */
    public void setVersion(Long value) {
        set(18, value);
    }

    /**
     * Getter for <code>xbkj.fd_bank_position_fund.version</code>.
     */
    public Long getVersion() {
        return (Long) get(18);
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
    // Record19 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row19<Long, Long, String, String, String, String, String, String, String, String, String, String, String, String, String, Timestamp, Timestamp, Boolean, Long> fieldsRow() {
        return (Row19) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row19<Long, Long, String, String, String, String, String, String, String, String, String, String, String, String, String, Timestamp, Timestamp, Boolean, Long> valuesRow() {
        return (Row19) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return FdBankPositionFund.FD_BANK_POSITION_FUND.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field2() {
        return FdBankPositionFund.FD_BANK_POSITION_FUND.ACCOUNT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return FdBankPositionFund.FD_BANK_POSITION_FUND.CODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return FdBankPositionFund.FD_BANK_POSITION_FUND.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return FdBankPositionFund.FD_BANK_POSITION_FUND.CURRENCY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return FdBankPositionFund.FD_BANK_POSITION_FUND.CAPITAL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return FdBankPositionFund.FD_BANK_POSITION_FUND.SHARE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return FdBankPositionFund.FD_BANK_POSITION_FUND.USABLE_SHARE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return FdBankPositionFund.FD_BANK_POSITION_FUND.DIVIDEND_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field10() {
        return FdBankPositionFund.FD_BANK_POSITION_FUND.NET_VALUE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field11() {
        return FdBankPositionFund.FD_BANK_POSITION_FUND.NET_VALUE_DATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field12() {
        return FdBankPositionFund.FD_BANK_POSITION_FUND.MARKET_VALUE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field13() {
        return FdBankPositionFund.FD_BANK_POSITION_FUND.FLOATING_PL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field14() {
        return FdBankPositionFund.FD_BANK_POSITION_FUND.YIELD;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field15() {
        return FdBankPositionFund.FD_BANK_POSITION_FUND.INCOME_YESTERDAY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field16() {
        return FdBankPositionFund.FD_BANK_POSITION_FUND.CREATE_AT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field17() {
        return FdBankPositionFund.FD_BANK_POSITION_FUND.UPDATE_AT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field18() {
        return FdBankPositionFund.FD_BANK_POSITION_FUND.DEL_FLAG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field19() {
        return FdBankPositionFund.FD_BANK_POSITION_FUND.VERSION;
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
        return getAccountId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getCurrency();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getCapital();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getShare();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component8() {
        return getUsableShare();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component9() {
        return getDividendType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component10() {
        return getNetValue();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component11() {
        return getNetValueDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component12() {
        return getMarketValue();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component13() {
        return getFloatingPl();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component14() {
        return getYield();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component15() {
        return getIncomeYesterday();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component16() {
        return getCreateAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component17() {
        return getUpdateAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component18() {
        return getDelFlag();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component19() {
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
        return getAccountId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getCurrency();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getCapital();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getShare();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getUsableShare();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getDividendType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value10() {
        return getNetValue();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value11() {
        return getNetValueDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value12() {
        return getMarketValue();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value13() {
        return getFloatingPl();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value14() {
        return getYield();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value15() {
        return getIncomeYesterday();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value16() {
        return getCreateAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value17() {
        return getUpdateAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value18() {
        return getDelFlag();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value19() {
        return getVersion();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FdBankPositionFundRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FdBankPositionFundRecord value2(Long value) {
        setAccountId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FdBankPositionFundRecord value3(String value) {
        setCode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FdBankPositionFundRecord value4(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FdBankPositionFundRecord value5(String value) {
        setCurrency(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FdBankPositionFundRecord value6(String value) {
        setCapital(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FdBankPositionFundRecord value7(String value) {
        setShare(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FdBankPositionFundRecord value8(String value) {
        setUsableShare(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FdBankPositionFundRecord value9(String value) {
        setDividendType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FdBankPositionFundRecord value10(String value) {
        setNetValue(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FdBankPositionFundRecord value11(String value) {
        setNetValueDate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FdBankPositionFundRecord value12(String value) {
        setMarketValue(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FdBankPositionFundRecord value13(String value) {
        setFloatingPl(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FdBankPositionFundRecord value14(String value) {
        setYield(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FdBankPositionFundRecord value15(String value) {
        setIncomeYesterday(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FdBankPositionFundRecord value16(Timestamp value) {
        setCreateAt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FdBankPositionFundRecord value17(Timestamp value) {
        setUpdateAt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FdBankPositionFundRecord value18(Boolean value) {
        setDelFlag(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FdBankPositionFundRecord value19(Long value) {
        setVersion(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FdBankPositionFundRecord values(Long value1, Long value2, String value3, String value4, String value5, String value6, String value7, String value8, String value9, String value10, String value11, String value12, String value13, String value14, String value15, Timestamp value16, Timestamp value17, Boolean value18, Long value19) {
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
        value13(value13);
        value14(value14);
        value15(value15);
        value16(value16);
        value17(value17);
        value18(value18);
        value19(value19);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached FdBankPositionFundRecord
     */
    public FdBankPositionFundRecord() {
        super(FdBankPositionFund.FD_BANK_POSITION_FUND);
    }

    /**
     * Create a detached, initialised FdBankPositionFundRecord
     */
    public FdBankPositionFundRecord(Long id, Long accountId, String code, String name, String currency, String capital, String share, String usableShare, String dividendType, String netValue, String netValueDate, String marketValue, String floatingPl, String yield, String incomeYesterday, Timestamp createAt, Timestamp updateAt, Boolean delFlag, Long version) {
        super(FdBankPositionFund.FD_BANK_POSITION_FUND);

        set(0, id);
        set(1, accountId);
        set(2, code);
        set(3, name);
        set(4, currency);
        set(5, capital);
        set(6, share);
        set(7, usableShare);
        set(8, dividendType);
        set(9, netValue);
        set(10, netValueDate);
        set(11, marketValue);
        set(12, floatingPl);
        set(13, yield);
        set(14, incomeYesterday);
        set(15, createAt);
        set(16, updateAt);
        set(17, delFlag);
        set(18, version);
    }
}