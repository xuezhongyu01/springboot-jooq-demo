/*
 * This file is generated by jOOQ.
*/
package com.jooq.domain.tables.records;


import com.jooq.domain.tables.FdBankAccounts;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record21;
import org.jooq.Row21;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * 网银数据表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class FdBankAccountsRecord extends UpdatableRecordImpl<FdBankAccountsRecord> implements Record21<Long, Long, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, Timestamp, Timestamp, Boolean, Long> {

    private static final long serialVersionUID = 809545742;

    /**
     * Setter for <code>xbkj.fd_bank_accounts.id</code>. 主键
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>xbkj.fd_bank_accounts.id</code>. 主键
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>xbkj.fd_bank_accounts.member_id</code>. 用户id
     */
    public void setMemberId(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>xbkj.fd_bank_accounts.member_id</code>. 用户id
     */
    public Long getMemberId() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>xbkj.fd_bank_accounts.type</code>. 账户类型账户类型：储蓄卡，信用卡，未知的卡
     */
    public void setType(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>xbkj.fd_bank_accounts.type</code>. 账户类型账户类型：储蓄卡，信用卡，未知的卡
     */
    public String getType() {
        return (String) get(2);
    }

    /**
     * Setter for <code>xbkj.fd_bank_accounts.card</code>. 卡号：可空，是否脱敏取决于官网
     */
    public void setCard(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>xbkj.fd_bank_accounts.card</code>. 卡号：可空，是否脱敏取决于官网
     */
    public String getCard() {
        return (String) get(3);
    }

    /**
     * Setter for <code>xbkj.fd_bank_accounts.main_vice_flag</code>. 主副卡标志，0（主卡），1（副卡）
     */
    public void setMainViceFlag(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>xbkj.fd_bank_accounts.main_vice_flag</code>. 主副卡标志，0（主卡），1（副卡）
     */
    public String getMainViceFlag() {
        return (String) get(4);
    }

    /**
     * Setter for <code>xbkj.fd_bank_accounts.holder</code>. 持卡人姓名
     */
    public void setHolder(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>xbkj.fd_bank_accounts.holder</code>. 持卡人姓名
     */
    public String getHolder() {
        return (String) get(5);
    }

    /**
     * Setter for <code>xbkj.fd_bank_accounts.idcard</code>. 证件号码
     */
    public void setIdcard(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>xbkj.fd_bank_accounts.idcard</code>. 证件号码
     */
    public String getIdcard() {
        return (String) get(6);
    }

    /**
     * Setter for <code>xbkj.fd_bank_accounts.status</code>. 状态(中文) 字符串输出，根据原始爬虫结果进行输出
     */
    public void setStatus(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>xbkj.fd_bank_accounts.status</code>. 状态(中文) 字符串输出，根据原始爬虫结果进行输出
     */
    public String getStatus() {
        return (String) get(7);
    }

    /**
     * Setter for <code>xbkj.fd_bank_accounts.open_date</code>. 开卡时间
     */
    public void setOpenDate(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>xbkj.fd_bank_accounts.open_date</code>. 开卡时间
     */
    public String getOpenDate() {
        return (String) get(8);
    }

    /**
     * Setter for <code>xbkj.fd_bank_accounts.balance</code>. 当前余额(储蓄卡特有，单位：分)
     */
    public void setBalance(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>xbkj.fd_bank_accounts.balance</code>. 当前余额(储蓄卡特有，单位：分)
     */
    public String getBalance() {
        return (String) get(9);
    }

    /**
     * Setter for <code>xbkj.fd_bank_accounts.bill_day</code>. 账单日(信用卡特有)
     */
    public void setBillDay(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>xbkj.fd_bank_accounts.bill_day</code>. 账单日(信用卡特有)
     */
    public String getBillDay() {
        return (String) get(10);
    }

    /**
     * Setter for <code>xbkj.fd_bank_accounts.repay_day</code>. 还款日(信用卡特有)
     */
    public void setRepayDay(String value) {
        set(11, value);
    }

    /**
     * Getter for <code>xbkj.fd_bank_accounts.repay_day</code>. 还款日(信用卡特有)
     */
    public String getRepayDay() {
        return (String) get(11);
    }

    /**
     * Setter for <code>xbkj.fd_bank_accounts.points</code>. 积分
     */
    public void setPoints(String value) {
        set(12, value);
    }

    /**
     * Getter for <code>xbkj.fd_bank_accounts.points</code>. 积分
     */
    public String getPoints() {
        return (String) get(12);
    }

    /**
     * Setter for <code>xbkj.fd_bank_accounts.card_name</code>. 卡产品名称
     */
    public void setCardName(String value) {
        set(13, value);
    }

    /**
     * Getter for <code>xbkj.fd_bank_accounts.card_name</code>. 卡产品名称
     */
    public String getCardName() {
        return (String) get(13);
    }

    /**
     * Setter for <code>xbkj.fd_bank_accounts.current_arrears</code>. 当前剩余欠款(单位：分)
     */
    public void setCurrentArrears(String value) {
        set(14, value);
    }

    /**
     * Getter for <code>xbkj.fd_bank_accounts.current_arrears</code>. 当前剩余欠款(单位：分)
     */
    public String getCurrentArrears() {
        return (String) get(14);
    }

    /**
     * Setter for <code>xbkj.fd_bank_accounts.current_payed_amount</code>. 本期已还
     */
    public void setCurrentPayedAmount(String value) {
        set(15, value);
    }

    /**
     * Getter for <code>xbkj.fd_bank_accounts.current_payed_amount</code>. 本期已还
     */
    public String getCurrentPayedAmount() {
        return (String) get(15);
    }

    /**
     * Setter for <code>xbkj.fd_bank_accounts.current_credited_amount</code>. 未出账单已入账金额
     */
    public void setCurrentCreditedAmount(String value) {
        set(16, value);
    }

    /**
     * Getter for <code>xbkj.fd_bank_accounts.current_credited_amount</code>. 未出账单已入账金额
     */
    public String getCurrentCreditedAmount() {
        return (String) get(16);
    }

    /**
     * Setter for <code>xbkj.fd_bank_accounts.create_at</code>. 创建时间
     */
    public void setCreateAt(Timestamp value) {
        set(17, value);
    }

    /**
     * Getter for <code>xbkj.fd_bank_accounts.create_at</code>. 创建时间
     */
    public Timestamp getCreateAt() {
        return (Timestamp) get(17);
    }

    /**
     * Setter for <code>xbkj.fd_bank_accounts.update_at</code>. 更新时间
     */
    public void setUpdateAt(Timestamp value) {
        set(18, value);
    }

    /**
     * Getter for <code>xbkj.fd_bank_accounts.update_at</code>. 更新时间
     */
    public Timestamp getUpdateAt() {
        return (Timestamp) get(18);
    }

    /**
     * Setter for <code>xbkj.fd_bank_accounts.del_flag</code>. 删除标志
     */
    public void setDelFlag(Boolean value) {
        set(19, value);
    }

    /**
     * Getter for <code>xbkj.fd_bank_accounts.del_flag</code>. 删除标志
     */
    public Boolean getDelFlag() {
        return (Boolean) get(19);
    }

    /**
     * Setter for <code>xbkj.fd_bank_accounts.version</code>.
     */
    public void setVersion(Long value) {
        set(20, value);
    }

    /**
     * Getter for <code>xbkj.fd_bank_accounts.version</code>.
     */
    public Long getVersion() {
        return (Long) get(20);
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
    // Record21 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row21<Long, Long, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, Timestamp, Timestamp, Boolean, Long> fieldsRow() {
        return (Row21) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row21<Long, Long, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, Timestamp, Timestamp, Boolean, Long> valuesRow() {
        return (Row21) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return FdBankAccounts.FD_BANK_ACCOUNTS.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field2() {
        return FdBankAccounts.FD_BANK_ACCOUNTS.MEMBER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return FdBankAccounts.FD_BANK_ACCOUNTS.TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return FdBankAccounts.FD_BANK_ACCOUNTS.CARD;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return FdBankAccounts.FD_BANK_ACCOUNTS.MAIN_VICE_FLAG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return FdBankAccounts.FD_BANK_ACCOUNTS.HOLDER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return FdBankAccounts.FD_BANK_ACCOUNTS.IDCARD;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return FdBankAccounts.FD_BANK_ACCOUNTS.STATUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return FdBankAccounts.FD_BANK_ACCOUNTS.OPEN_DATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field10() {
        return FdBankAccounts.FD_BANK_ACCOUNTS.BALANCE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field11() {
        return FdBankAccounts.FD_BANK_ACCOUNTS.BILL_DAY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field12() {
        return FdBankAccounts.FD_BANK_ACCOUNTS.REPAY_DAY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field13() {
        return FdBankAccounts.FD_BANK_ACCOUNTS.POINTS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field14() {
        return FdBankAccounts.FD_BANK_ACCOUNTS.CARD_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field15() {
        return FdBankAccounts.FD_BANK_ACCOUNTS.CURRENT_ARREARS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field16() {
        return FdBankAccounts.FD_BANK_ACCOUNTS.CURRENT_PAYED_AMOUNT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field17() {
        return FdBankAccounts.FD_BANK_ACCOUNTS.CURRENT_CREDITED_AMOUNT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field18() {
        return FdBankAccounts.FD_BANK_ACCOUNTS.CREATE_AT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field19() {
        return FdBankAccounts.FD_BANK_ACCOUNTS.UPDATE_AT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field20() {
        return FdBankAccounts.FD_BANK_ACCOUNTS.DEL_FLAG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field21() {
        return FdBankAccounts.FD_BANK_ACCOUNTS.VERSION;
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
    public String component3() {
        return getType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getCard();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getMainViceFlag();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getHolder();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getIdcard();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component8() {
        return getStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component9() {
        return getOpenDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component10() {
        return getBalance();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component11() {
        return getBillDay();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component12() {
        return getRepayDay();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component13() {
        return getPoints();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component14() {
        return getCardName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component15() {
        return getCurrentArrears();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component16() {
        return getCurrentPayedAmount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component17() {
        return getCurrentCreditedAmount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component18() {
        return getCreateAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component19() {
        return getUpdateAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component20() {
        return getDelFlag();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component21() {
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
    public String value3() {
        return getType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getCard();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getMainViceFlag();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getHolder();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getIdcard();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getOpenDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value10() {
        return getBalance();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value11() {
        return getBillDay();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value12() {
        return getRepayDay();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value13() {
        return getPoints();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value14() {
        return getCardName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value15() {
        return getCurrentArrears();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value16() {
        return getCurrentPayedAmount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value17() {
        return getCurrentCreditedAmount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value18() {
        return getCreateAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value19() {
        return getUpdateAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value20() {
        return getDelFlag();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value21() {
        return getVersion();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FdBankAccountsRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FdBankAccountsRecord value2(Long value) {
        setMemberId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FdBankAccountsRecord value3(String value) {
        setType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FdBankAccountsRecord value4(String value) {
        setCard(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FdBankAccountsRecord value5(String value) {
        setMainViceFlag(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FdBankAccountsRecord value6(String value) {
        setHolder(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FdBankAccountsRecord value7(String value) {
        setIdcard(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FdBankAccountsRecord value8(String value) {
        setStatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FdBankAccountsRecord value9(String value) {
        setOpenDate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FdBankAccountsRecord value10(String value) {
        setBalance(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FdBankAccountsRecord value11(String value) {
        setBillDay(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FdBankAccountsRecord value12(String value) {
        setRepayDay(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FdBankAccountsRecord value13(String value) {
        setPoints(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FdBankAccountsRecord value14(String value) {
        setCardName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FdBankAccountsRecord value15(String value) {
        setCurrentArrears(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FdBankAccountsRecord value16(String value) {
        setCurrentPayedAmount(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FdBankAccountsRecord value17(String value) {
        setCurrentCreditedAmount(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FdBankAccountsRecord value18(Timestamp value) {
        setCreateAt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FdBankAccountsRecord value19(Timestamp value) {
        setUpdateAt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FdBankAccountsRecord value20(Boolean value) {
        setDelFlag(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FdBankAccountsRecord value21(Long value) {
        setVersion(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FdBankAccountsRecord values(Long value1, Long value2, String value3, String value4, String value5, String value6, String value7, String value8, String value9, String value10, String value11, String value12, String value13, String value14, String value15, String value16, String value17, Timestamp value18, Timestamp value19, Boolean value20, Long value21) {
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
        value20(value20);
        value21(value21);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached FdBankAccountsRecord
     */
    public FdBankAccountsRecord() {
        super(FdBankAccounts.FD_BANK_ACCOUNTS);
    }

    /**
     * Create a detached, initialised FdBankAccountsRecord
     */
    public FdBankAccountsRecord(Long id, Long memberId, String type, String card, String mainViceFlag, String holder, String idcard, String status, String openDate, String balance, String billDay, String repayDay, String points, String cardName, String currentArrears, String currentPayedAmount, String currentCreditedAmount, Timestamp createAt, Timestamp updateAt, Boolean delFlag, Long version) {
        super(FdBankAccounts.FD_BANK_ACCOUNTS);

        set(0, id);
        set(1, memberId);
        set(2, type);
        set(3, card);
        set(4, mainViceFlag);
        set(5, holder);
        set(6, idcard);
        set(7, status);
        set(8, openDate);
        set(9, balance);
        set(10, billDay);
        set(11, repayDay);
        set(12, points);
        set(13, cardName);
        set(14, currentArrears);
        set(15, currentPayedAmount);
        set(16, currentCreditedAmount);
        set(17, createAt);
        set(18, updateAt);
        set(19, delFlag);
        set(20, version);
    }
}