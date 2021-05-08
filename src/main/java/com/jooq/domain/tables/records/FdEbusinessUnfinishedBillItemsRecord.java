/*
 * This file is generated by jOOQ.
*/
package com.jooq.domain.tables.records;


import com.jooq.domain.tables.FdEbusinessUnfinishedBillItems;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record13;
import org.jooq.Row13;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * 电商未入账单流 信息(数组)(花呗)
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class FdEbusinessUnfinishedBillItemsRecord extends UpdatableRecordImpl<FdEbusinessUnfinishedBillItemsRecord> implements Record13<Long, Long, String, String, String, String, String, String, String, Timestamp, Timestamp, Boolean, Long> {

    private static final long serialVersionUID = 991144148;

    /**
     * Setter for <code>xbkj.fd_ebusiness_unfinished_bill_items.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>xbkj.fd_ebusiness_unfinished_bill_items.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>xbkj.fd_ebusiness_unfinished_bill_items.account_id</code>. 账户ID
     */
    public void setAccountId(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>xbkj.fd_ebusiness_unfinished_bill_items.account_id</code>. 账户ID
     */
    public Long getAccountId() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>xbkj.fd_ebusiness_unfinished_bill_items.bill_id</code>. 账单ID
     */
    public void setBillId(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>xbkj.fd_ebusiness_unfinished_bill_items.bill_id</code>. 账单ID
     */
    public String getBillId() {
        return (String) get(2);
    }

    /**
     * Setter for <code>xbkj.fd_ebusiness_unfinished_bill_items.name</code>. 商品说明
     */
    public void setName(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>xbkj.fd_ebusiness_unfinished_bill_items.name</code>. 商品说明
     */
    public String getName() {
        return (String) get(3);
    }

    /**
     * Setter for <code>xbkj.fd_ebusiness_unfinished_bill_items.alipayTradeNo</code>. 交易号
     */
    public void setAlipaytradeno(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>xbkj.fd_ebusiness_unfinished_bill_items.alipayTradeNo</code>. 交易号
     */
    public String getAlipaytradeno() {
        return (String) get(4);
    }

    /**
     * Setter for <code>xbkj.fd_ebusiness_unfinished_bill_items.bizDate</code>. 交易日期
     */
    public void setBizdate(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>xbkj.fd_ebusiness_unfinished_bill_items.bizDate</code>. 交易日期
     */
    public String getBizdate() {
        return (String) get(5);
    }

    /**
     * Setter for <code>xbkj.fd_ebusiness_unfinished_bill_items.amount</code>. 交易金额
     */
    public void setAmount(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>xbkj.fd_ebusiness_unfinished_bill_items.amount</code>. 交易金额
     */
    public String getAmount() {
        return (String) get(6);
    }

    /**
     * Setter for <code>xbkj.fd_ebusiness_unfinished_bill_items.currencyCode</code>. 币种
     */
    public void setCurrencycode(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>xbkj.fd_ebusiness_unfinished_bill_items.currencyCode</code>. 币种
     */
    public String getCurrencycode() {
        return (String) get(7);
    }

    /**
     * Setter for <code>xbkj.fd_ebusiness_unfinished_bill_items.trade_describe</code>. 交易描述
     */
    public void setTradeDescribe(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>xbkj.fd_ebusiness_unfinished_bill_items.trade_describe</code>. 交易描述
     */
    public String getTradeDescribe() {
        return (String) get(8);
    }

    /**
     * Setter for <code>xbkj.fd_ebusiness_unfinished_bill_items.create_at</code>. 创建时间
     */
    public void setCreateAt(Timestamp value) {
        set(9, value);
    }

    /**
     * Getter for <code>xbkj.fd_ebusiness_unfinished_bill_items.create_at</code>. 创建时间
     */
    public Timestamp getCreateAt() {
        return (Timestamp) get(9);
    }

    /**
     * Setter for <code>xbkj.fd_ebusiness_unfinished_bill_items.update_at</code>. 更新时间
     */
    public void setUpdateAt(Timestamp value) {
        set(10, value);
    }

    /**
     * Getter for <code>xbkj.fd_ebusiness_unfinished_bill_items.update_at</code>. 更新时间
     */
    public Timestamp getUpdateAt() {
        return (Timestamp) get(10);
    }

    /**
     * Setter for <code>xbkj.fd_ebusiness_unfinished_bill_items.del_flag</code>. 删除标志
     */
    public void setDelFlag(Boolean value) {
        set(11, value);
    }

    /**
     * Getter for <code>xbkj.fd_ebusiness_unfinished_bill_items.del_flag</code>. 删除标志
     */
    public Boolean getDelFlag() {
        return (Boolean) get(11);
    }

    /**
     * Setter for <code>xbkj.fd_ebusiness_unfinished_bill_items.version</code>.
     */
    public void setVersion(Long value) {
        set(12, value);
    }

    /**
     * Getter for <code>xbkj.fd_ebusiness_unfinished_bill_items.version</code>.
     */
    public Long getVersion() {
        return (Long) get(12);
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
    // Record13 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row13<Long, Long, String, String, String, String, String, String, String, Timestamp, Timestamp, Boolean, Long> fieldsRow() {
        return (Row13) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row13<Long, Long, String, String, String, String, String, String, String, Timestamp, Timestamp, Boolean, Long> valuesRow() {
        return (Row13) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return FdEbusinessUnfinishedBillItems.FD_EBUSINESS_UNFINISHED_BILL_ITEMS.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field2() {
        return FdEbusinessUnfinishedBillItems.FD_EBUSINESS_UNFINISHED_BILL_ITEMS.ACCOUNT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return FdEbusinessUnfinishedBillItems.FD_EBUSINESS_UNFINISHED_BILL_ITEMS.BILL_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return FdEbusinessUnfinishedBillItems.FD_EBUSINESS_UNFINISHED_BILL_ITEMS.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return FdEbusinessUnfinishedBillItems.FD_EBUSINESS_UNFINISHED_BILL_ITEMS.ALIPAYTRADENO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return FdEbusinessUnfinishedBillItems.FD_EBUSINESS_UNFINISHED_BILL_ITEMS.BIZDATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return FdEbusinessUnfinishedBillItems.FD_EBUSINESS_UNFINISHED_BILL_ITEMS.AMOUNT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return FdEbusinessUnfinishedBillItems.FD_EBUSINESS_UNFINISHED_BILL_ITEMS.CURRENCYCODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return FdEbusinessUnfinishedBillItems.FD_EBUSINESS_UNFINISHED_BILL_ITEMS.TRADE_DESCRIBE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field10() {
        return FdEbusinessUnfinishedBillItems.FD_EBUSINESS_UNFINISHED_BILL_ITEMS.CREATE_AT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field11() {
        return FdEbusinessUnfinishedBillItems.FD_EBUSINESS_UNFINISHED_BILL_ITEMS.UPDATE_AT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field12() {
        return FdEbusinessUnfinishedBillItems.FD_EBUSINESS_UNFINISHED_BILL_ITEMS.DEL_FLAG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field13() {
        return FdEbusinessUnfinishedBillItems.FD_EBUSINESS_UNFINISHED_BILL_ITEMS.VERSION;
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
        return getBillId();
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
        return getAlipaytradeno();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getBizdate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getAmount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component8() {
        return getCurrencycode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component9() {
        return getTradeDescribe();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component10() {
        return getCreateAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component11() {
        return getUpdateAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component12() {
        return getDelFlag();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component13() {
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
        return getBillId();
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
        return getAlipaytradeno();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getBizdate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getAmount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getCurrencycode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getTradeDescribe();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value10() {
        return getCreateAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value11() {
        return getUpdateAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value12() {
        return getDelFlag();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value13() {
        return getVersion();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FdEbusinessUnfinishedBillItemsRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FdEbusinessUnfinishedBillItemsRecord value2(Long value) {
        setAccountId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FdEbusinessUnfinishedBillItemsRecord value3(String value) {
        setBillId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FdEbusinessUnfinishedBillItemsRecord value4(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FdEbusinessUnfinishedBillItemsRecord value5(String value) {
        setAlipaytradeno(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FdEbusinessUnfinishedBillItemsRecord value6(String value) {
        setBizdate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FdEbusinessUnfinishedBillItemsRecord value7(String value) {
        setAmount(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FdEbusinessUnfinishedBillItemsRecord value8(String value) {
        setCurrencycode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FdEbusinessUnfinishedBillItemsRecord value9(String value) {
        setTradeDescribe(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FdEbusinessUnfinishedBillItemsRecord value10(Timestamp value) {
        setCreateAt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FdEbusinessUnfinishedBillItemsRecord value11(Timestamp value) {
        setUpdateAt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FdEbusinessUnfinishedBillItemsRecord value12(Boolean value) {
        setDelFlag(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FdEbusinessUnfinishedBillItemsRecord value13(Long value) {
        setVersion(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FdEbusinessUnfinishedBillItemsRecord values(Long value1, Long value2, String value3, String value4, String value5, String value6, String value7, String value8, String value9, Timestamp value10, Timestamp value11, Boolean value12, Long value13) {
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
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached FdEbusinessUnfinishedBillItemsRecord
     */
    public FdEbusinessUnfinishedBillItemsRecord() {
        super(FdEbusinessUnfinishedBillItems.FD_EBUSINESS_UNFINISHED_BILL_ITEMS);
    }

    /**
     * Create a detached, initialised FdEbusinessUnfinishedBillItemsRecord
     */
    public FdEbusinessUnfinishedBillItemsRecord(Long id, Long accountId, String billId, String name, String alipaytradeno, String bizdate, String amount, String currencycode, String tradeDescribe, Timestamp createAt, Timestamp updateAt, Boolean delFlag, Long version) {
        super(FdEbusinessUnfinishedBillItems.FD_EBUSINESS_UNFINISHED_BILL_ITEMS);

        set(0, id);
        set(1, accountId);
        set(2, billId);
        set(3, name);
        set(4, alipaytradeno);
        set(5, bizdate);
        set(6, amount);
        set(7, currencycode);
        set(8, tradeDescribe);
        set(9, createAt);
        set(10, updateAt);
        set(11, delFlag);
        set(12, version);
    }
}