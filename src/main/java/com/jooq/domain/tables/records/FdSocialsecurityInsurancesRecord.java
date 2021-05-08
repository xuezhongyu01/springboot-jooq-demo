/*
 * This file is generated by jOOQ.
*/
package com.jooq.domain.tables.records;


import com.jooq.domain.tables.FdSocialsecurityInsurances;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record16;
import org.jooq.Row16;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * 险种信息表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class FdSocialsecurityInsurancesRecord extends UpdatableRecordImpl<FdSocialsecurityInsurancesRecord> implements Record16<Long, Long, String, String, String, String, String, String, String, String, String, String, Timestamp, Timestamp, Boolean, Long> {

    private static final long serialVersionUID = -1012998670;

    /**
     * Setter for <code>xbkj.fd_socialsecurity_insurances.id</code>. 主键
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>xbkj.fd_socialsecurity_insurances.id</code>. 主键
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>xbkj.fd_socialsecurity_insurances.account_id</code>.  账户 ID(关联字段)
     */
    public void setAccountId(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>xbkj.fd_socialsecurity_insurances.account_id</code>.  账户 ID(关联字段)
     */
    public Long getAccountId() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>xbkj.fd_socialsecurity_insurances.standard_name</code>. 险种标准名称(医疗/失业/养老/工伤/生育/其他)
     */
    public void setStandardName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>xbkj.fd_socialsecurity_insurances.standard_name</code>. 险种标准名称(医疗/失业/养老/工伤/生育/其他)
     */
    public String getStandardName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>xbkj.fd_socialsecurity_insurances.origin_name</code>. 险种名称
     */
    public void setOriginName(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>xbkj.fd_socialsecurity_insurances.origin_name</code>. 险种名称
     */
    public String getOriginName() {
        return (String) get(3);
    }

    /**
     * Setter for <code>xbkj.fd_socialsecurity_insurances.base</code>. 缴费基数(单位：分)
     */
    public void setBase(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>xbkj.fd_socialsecurity_insurances.base</code>. 缴费基数(单位：分)
     */
    public String getBase() {
        return (String) get(4);
    }

    /**
     * Setter for <code>xbkj.fd_socialsecurity_insurances.insured_status</code>. 参保状态
     */
    public void setInsuredStatus(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>xbkj.fd_socialsecurity_insurances.insured_status</code>. 参保状态
     */
    public String getInsuredStatus() {
        return (String) get(5);
    }

    /**
     * Setter for <code>xbkj.fd_socialsecurity_insurances.payment_status</code>. 缴费状态
     */
    public void setPaymentStatus(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>xbkj.fd_socialsecurity_insurances.payment_status</code>. 缴费状态
     */
    public String getPaymentStatus() {
        return (String) get(6);
    }

    /**
     * Setter for <code>xbkj.fd_socialsecurity_insurances.person_rate</code>. 个人缴费比例(单位：％)
     */
    public void setPersonRate(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>xbkj.fd_socialsecurity_insurances.person_rate</code>. 个人缴费比例(单位：％)
     */
    public String getPersonRate() {
        return (String) get(7);
    }

    /**
     * Setter for <code>xbkj.fd_socialsecurity_insurances.company_rate</code>. 单位缴存比例(单位：％)
     */
    public void setCompanyRate(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>xbkj.fd_socialsecurity_insurances.company_rate</code>. 单位缴存比例(单位：％)
     */
    public String getCompanyRate() {
        return (String) get(8);
    }

    /**
     * Setter for <code>xbkj.fd_socialsecurity_insurances.company</code>. 参保单位
     */
    public void setCompany(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>xbkj.fd_socialsecurity_insurances.company</code>. 参保单位
     */
    public String getCompany() {
        return (String) get(9);
    }

    /**
     * Setter for <code>xbkj.fd_socialsecurity_insurances.current_insured_month</code>. 本次参保年月("YYYY-MM-DD")
     */
    public void setCurrentInsuredMonth(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>xbkj.fd_socialsecurity_insurances.current_insured_month</code>. 本次参保年月("YYYY-MM-DD")
     */
    public String getCurrentInsuredMonth() {
        return (String) get(10);
    }

    /**
     * Setter for <code>xbkj.fd_socialsecurity_insurances.first_insured_month</code>. 首次参保年月("YYYY-MM-DD")
     */
    public void setFirstInsuredMonth(String value) {
        set(11, value);
    }

    /**
     * Getter for <code>xbkj.fd_socialsecurity_insurances.first_insured_month</code>. 首次参保年月("YYYY-MM-DD")
     */
    public String getFirstInsuredMonth() {
        return (String) get(11);
    }

    /**
     * Setter for <code>xbkj.fd_socialsecurity_insurances.create_at</code>. 创建时间
     */
    public void setCreateAt(Timestamp value) {
        set(12, value);
    }

    /**
     * Getter for <code>xbkj.fd_socialsecurity_insurances.create_at</code>. 创建时间
     */
    public Timestamp getCreateAt() {
        return (Timestamp) get(12);
    }

    /**
     * Setter for <code>xbkj.fd_socialsecurity_insurances.update_at</code>. 更新时间
     */
    public void setUpdateAt(Timestamp value) {
        set(13, value);
    }

    /**
     * Getter for <code>xbkj.fd_socialsecurity_insurances.update_at</code>. 更新时间
     */
    public Timestamp getUpdateAt() {
        return (Timestamp) get(13);
    }

    /**
     * Setter for <code>xbkj.fd_socialsecurity_insurances.del_flag</code>. 删除标志
     */
    public void setDelFlag(Boolean value) {
        set(14, value);
    }

    /**
     * Getter for <code>xbkj.fd_socialsecurity_insurances.del_flag</code>. 删除标志
     */
    public Boolean getDelFlag() {
        return (Boolean) get(14);
    }

    /**
     * Setter for <code>xbkj.fd_socialsecurity_insurances.version</code>.
     */
    public void setVersion(Long value) {
        set(15, value);
    }

    /**
     * Getter for <code>xbkj.fd_socialsecurity_insurances.version</code>.
     */
    public Long getVersion() {
        return (Long) get(15);
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
    // Record16 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row16<Long, Long, String, String, String, String, String, String, String, String, String, String, Timestamp, Timestamp, Boolean, Long> fieldsRow() {
        return (Row16) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row16<Long, Long, String, String, String, String, String, String, String, String, String, String, Timestamp, Timestamp, Boolean, Long> valuesRow() {
        return (Row16) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return FdSocialsecurityInsurances.FD_SOCIALSECURITY_INSURANCES.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field2() {
        return FdSocialsecurityInsurances.FD_SOCIALSECURITY_INSURANCES.ACCOUNT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return FdSocialsecurityInsurances.FD_SOCIALSECURITY_INSURANCES.STANDARD_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return FdSocialsecurityInsurances.FD_SOCIALSECURITY_INSURANCES.ORIGIN_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return FdSocialsecurityInsurances.FD_SOCIALSECURITY_INSURANCES.BASE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return FdSocialsecurityInsurances.FD_SOCIALSECURITY_INSURANCES.INSURED_STATUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return FdSocialsecurityInsurances.FD_SOCIALSECURITY_INSURANCES.PAYMENT_STATUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return FdSocialsecurityInsurances.FD_SOCIALSECURITY_INSURANCES.PERSON_RATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return FdSocialsecurityInsurances.FD_SOCIALSECURITY_INSURANCES.COMPANY_RATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field10() {
        return FdSocialsecurityInsurances.FD_SOCIALSECURITY_INSURANCES.COMPANY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field11() {
        return FdSocialsecurityInsurances.FD_SOCIALSECURITY_INSURANCES.CURRENT_INSURED_MONTH;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field12() {
        return FdSocialsecurityInsurances.FD_SOCIALSECURITY_INSURANCES.FIRST_INSURED_MONTH;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field13() {
        return FdSocialsecurityInsurances.FD_SOCIALSECURITY_INSURANCES.CREATE_AT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field14() {
        return FdSocialsecurityInsurances.FD_SOCIALSECURITY_INSURANCES.UPDATE_AT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field15() {
        return FdSocialsecurityInsurances.FD_SOCIALSECURITY_INSURANCES.DEL_FLAG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field16() {
        return FdSocialsecurityInsurances.FD_SOCIALSECURITY_INSURANCES.VERSION;
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
        return getStandardName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getOriginName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getBase();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getInsuredStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getPaymentStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component8() {
        return getPersonRate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component9() {
        return getCompanyRate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component10() {
        return getCompany();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component11() {
        return getCurrentInsuredMonth();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component12() {
        return getFirstInsuredMonth();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component13() {
        return getCreateAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component14() {
        return getUpdateAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component15() {
        return getDelFlag();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component16() {
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
        return getStandardName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getOriginName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getBase();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getInsuredStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getPaymentStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getPersonRate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getCompanyRate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value10() {
        return getCompany();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value11() {
        return getCurrentInsuredMonth();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value12() {
        return getFirstInsuredMonth();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value13() {
        return getCreateAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value14() {
        return getUpdateAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value15() {
        return getDelFlag();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value16() {
        return getVersion();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FdSocialsecurityInsurancesRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FdSocialsecurityInsurancesRecord value2(Long value) {
        setAccountId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FdSocialsecurityInsurancesRecord value3(String value) {
        setStandardName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FdSocialsecurityInsurancesRecord value4(String value) {
        setOriginName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FdSocialsecurityInsurancesRecord value5(String value) {
        setBase(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FdSocialsecurityInsurancesRecord value6(String value) {
        setInsuredStatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FdSocialsecurityInsurancesRecord value7(String value) {
        setPaymentStatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FdSocialsecurityInsurancesRecord value8(String value) {
        setPersonRate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FdSocialsecurityInsurancesRecord value9(String value) {
        setCompanyRate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FdSocialsecurityInsurancesRecord value10(String value) {
        setCompany(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FdSocialsecurityInsurancesRecord value11(String value) {
        setCurrentInsuredMonth(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FdSocialsecurityInsurancesRecord value12(String value) {
        setFirstInsuredMonth(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FdSocialsecurityInsurancesRecord value13(Timestamp value) {
        setCreateAt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FdSocialsecurityInsurancesRecord value14(Timestamp value) {
        setUpdateAt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FdSocialsecurityInsurancesRecord value15(Boolean value) {
        setDelFlag(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FdSocialsecurityInsurancesRecord value16(Long value) {
        setVersion(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FdSocialsecurityInsurancesRecord values(Long value1, Long value2, String value3, String value4, String value5, String value6, String value7, String value8, String value9, String value10, String value11, String value12, Timestamp value13, Timestamp value14, Boolean value15, Long value16) {
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
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached FdSocialsecurityInsurancesRecord
     */
    public FdSocialsecurityInsurancesRecord() {
        super(FdSocialsecurityInsurances.FD_SOCIALSECURITY_INSURANCES);
    }

    /**
     * Create a detached, initialised FdSocialsecurityInsurancesRecord
     */
    public FdSocialsecurityInsurancesRecord(Long id, Long accountId, String standardName, String originName, String base, String insuredStatus, String paymentStatus, String personRate, String companyRate, String company, String currentInsuredMonth, String firstInsuredMonth, Timestamp createAt, Timestamp updateAt, Boolean delFlag, Long version) {
        super(FdSocialsecurityInsurances.FD_SOCIALSECURITY_INSURANCES);

        set(0, id);
        set(1, accountId);
        set(2, standardName);
        set(3, originName);
        set(4, base);
        set(5, insuredStatus);
        set(6, paymentStatus);
        set(7, personRate);
        set(8, companyRate);
        set(9, company);
        set(10, currentInsuredMonth);
        set(11, firstInsuredMonth);
        set(12, createAt);
        set(13, updateAt);
        set(14, delFlag);
        set(15, version);
    }
}