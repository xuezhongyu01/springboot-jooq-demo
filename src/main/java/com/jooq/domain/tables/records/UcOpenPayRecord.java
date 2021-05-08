/*
 * This file is generated by jOOQ.
*/
package com.jooq.domain.tables.records;


import com.jooq.domain.enums.UcOpenPayCardType;
import com.jooq.domain.enums.UcOpenPayType;
import com.jooq.domain.tables.UcOpenPay;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record13;
import org.jooq.Row13;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * 机构或者门店 开通线下支付需要资料
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UcOpenPayRecord extends UpdatableRecordImpl<UcOpenPayRecord> implements Record13<Long, UcOpenPayType, Long, String, String, String, String, String, UcOpenPayCardType, Timestamp, Timestamp, Boolean, Long> {

    private static final long serialVersionUID = -2071191011;

    /**
     * Setter for <code>xbkj.uc_open_pay.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>xbkj.uc_open_pay.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>xbkj.uc_open_pay.type</code>. 会员，机构，单店,资产方uc_id=0
     */
    public void setType(UcOpenPayType value) {
        set(1, value);
    }

    /**
     * Getter for <code>xbkj.uc_open_pay.type</code>. 会员，机构，单店,资产方uc_id=0
     */
    public UcOpenPayType getType() {
        return (UcOpenPayType) get(1);
    }

    /**
     * Setter for <code>xbkj.uc_open_pay.source_id</code>. 来源id
     */
    public void setSourceId(Long value) {
        set(2, value);
    }

    /**
     * Getter for <code>xbkj.uc_open_pay.source_id</code>. 来源id
     */
    public Long getSourceId() {
        return (Long) get(2);
    }

    /**
     * Setter for <code>xbkj.uc_open_pay.id_card</code>. 身份证号
     */
    public void setIdCard(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>xbkj.uc_open_pay.id_card</code>. 身份证号
     */
    public String getIdCard() {
        return (String) get(3);
    }

    /**
     * Setter for <code>xbkj.uc_open_pay.business_licence</code>. 营业执照号码
     */
    public void setBusinessLicence(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>xbkj.uc_open_pay.business_licence</code>. 营业执照号码
     */
    public String getBusinessLicence() {
        return (String) get(4);
    }

    /**
     * Setter for <code>xbkj.uc_open_pay.legal_person</code>. 法人姓名
     */
    public void setLegalPerson(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>xbkj.uc_open_pay.legal_person</code>. 法人姓名
     */
    public String getLegalPerson() {
        return (String) get(5);
    }

    /**
     * Setter for <code>xbkj.uc_open_pay.account_name</code>. 户名
     */
    public void setAccountName(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>xbkj.uc_open_pay.account_name</code>. 户名
     */
    public String getAccountName() {
        return (String) get(6);
    }

    /**
     * Setter for <code>xbkj.uc_open_pay.linkman</code>. 联系人姓名
     */
    public void setLinkman(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>xbkj.uc_open_pay.linkman</code>. 联系人姓名
     */
    public String getLinkman() {
        return (String) get(7);
    }

    /**
     * Setter for <code>xbkj.uc_open_pay.card_type</code>. 对公，对私
     */
    public void setCardType(UcOpenPayCardType value) {
        set(8, value);
    }

    /**
     * Getter for <code>xbkj.uc_open_pay.card_type</code>. 对公，对私
     */
    public UcOpenPayCardType getCardType() {
        return (UcOpenPayCardType) get(8);
    }

    /**
     * Setter for <code>xbkj.uc_open_pay.create_at</code>. 创建时间
     */
    public void setCreateAt(Timestamp value) {
        set(9, value);
    }

    /**
     * Getter for <code>xbkj.uc_open_pay.create_at</code>. 创建时间
     */
    public Timestamp getCreateAt() {
        return (Timestamp) get(9);
    }

    /**
     * Setter for <code>xbkj.uc_open_pay.update_at</code>. 更新时间
     */
    public void setUpdateAt(Timestamp value) {
        set(10, value);
    }

    /**
     * Getter for <code>xbkj.uc_open_pay.update_at</code>. 更新时间
     */
    public Timestamp getUpdateAt() {
        return (Timestamp) get(10);
    }

    /**
     * Setter for <code>xbkj.uc_open_pay.del_flag</code>. 删除标志
     */
    public void setDelFlag(Boolean value) {
        set(11, value);
    }

    /**
     * Getter for <code>xbkj.uc_open_pay.del_flag</code>. 删除标志
     */
    public Boolean getDelFlag() {
        return (Boolean) get(11);
    }

    /**
     * Setter for <code>xbkj.uc_open_pay.version</code>.
     */
    public void setVersion(Long value) {
        set(12, value);
    }

    /**
     * Getter for <code>xbkj.uc_open_pay.version</code>.
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
    public Row13<Long, UcOpenPayType, Long, String, String, String, String, String, UcOpenPayCardType, Timestamp, Timestamp, Boolean, Long> fieldsRow() {
        return (Row13) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row13<Long, UcOpenPayType, Long, String, String, String, String, String, UcOpenPayCardType, Timestamp, Timestamp, Boolean, Long> valuesRow() {
        return (Row13) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return UcOpenPay.UC_OPEN_PAY.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UcOpenPayType> field2() {
        return UcOpenPay.UC_OPEN_PAY.TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field3() {
        return UcOpenPay.UC_OPEN_PAY.SOURCE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return UcOpenPay.UC_OPEN_PAY.ID_CARD;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return UcOpenPay.UC_OPEN_PAY.BUSINESS_LICENCE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return UcOpenPay.UC_OPEN_PAY.LEGAL_PERSON;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return UcOpenPay.UC_OPEN_PAY.ACCOUNT_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return UcOpenPay.UC_OPEN_PAY.LINKMAN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UcOpenPayCardType> field9() {
        return UcOpenPay.UC_OPEN_PAY.CARD_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field10() {
        return UcOpenPay.UC_OPEN_PAY.CREATE_AT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field11() {
        return UcOpenPay.UC_OPEN_PAY.UPDATE_AT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field12() {
        return UcOpenPay.UC_OPEN_PAY.DEL_FLAG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field13() {
        return UcOpenPay.UC_OPEN_PAY.VERSION;
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
    public UcOpenPayType component2() {
        return getType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component3() {
        return getSourceId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getIdCard();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getBusinessLicence();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getLegalPerson();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getAccountName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component8() {
        return getLinkman();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UcOpenPayCardType component9() {
        return getCardType();
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
    public UcOpenPayType value2() {
        return getType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value3() {
        return getSourceId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getIdCard();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getBusinessLicence();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getLegalPerson();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getAccountName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getLinkman();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UcOpenPayCardType value9() {
        return getCardType();
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
    public UcOpenPayRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UcOpenPayRecord value2(UcOpenPayType value) {
        setType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UcOpenPayRecord value3(Long value) {
        setSourceId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UcOpenPayRecord value4(String value) {
        setIdCard(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UcOpenPayRecord value5(String value) {
        setBusinessLicence(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UcOpenPayRecord value6(String value) {
        setLegalPerson(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UcOpenPayRecord value7(String value) {
        setAccountName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UcOpenPayRecord value8(String value) {
        setLinkman(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UcOpenPayRecord value9(UcOpenPayCardType value) {
        setCardType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UcOpenPayRecord value10(Timestamp value) {
        setCreateAt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UcOpenPayRecord value11(Timestamp value) {
        setUpdateAt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UcOpenPayRecord value12(Boolean value) {
        setDelFlag(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UcOpenPayRecord value13(Long value) {
        setVersion(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UcOpenPayRecord values(Long value1, UcOpenPayType value2, Long value3, String value4, String value5, String value6, String value7, String value8, UcOpenPayCardType value9, Timestamp value10, Timestamp value11, Boolean value12, Long value13) {
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
     * Create a detached UcOpenPayRecord
     */
    public UcOpenPayRecord() {
        super(UcOpenPay.UC_OPEN_PAY);
    }

    /**
     * Create a detached, initialised UcOpenPayRecord
     */
    public UcOpenPayRecord(Long id, UcOpenPayType type, Long sourceId, String idCard, String businessLicence, String legalPerson, String accountName, String linkman, UcOpenPayCardType cardType, Timestamp createAt, Timestamp updateAt, Boolean delFlag, Long version) {
        super(UcOpenPay.UC_OPEN_PAY);

        set(0, id);
        set(1, type);
        set(2, sourceId);
        set(3, idCard);
        set(4, businessLicence);
        set(5, legalPerson);
        set(6, accountName);
        set(7, linkman);
        set(8, cardType);
        set(9, createAt);
        set(10, updateAt);
        set(11, delFlag);
        set(12, version);
    }
}
