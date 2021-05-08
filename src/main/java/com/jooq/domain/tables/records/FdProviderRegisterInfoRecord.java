/*
 * This file is generated by jOOQ.
*/
package com.jooq.domain.tables.records;


import com.jooq.domain.tables.FdProviderRegisterInfo;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record9;
import org.jooq.Row9;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * 注册信息表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class FdProviderRegisterInfoRecord extends UpdatableRecordImpl<FdProviderRegisterInfoRecord> implements Record9<Long, Long, String, String, String, Timestamp, Timestamp, Boolean, Long> {

    private static final long serialVersionUID = -1225900823;

    /**
     * Setter for <code>xbkj.fd_provider_register_info.id</code>. 主键
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>xbkj.fd_provider_register_info.id</code>. 主键
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>xbkj.fd_provider_register_info.account_id</code>. 账户id
     */
    public void setAccountId(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>xbkj.fd_provider_register_info.account_id</code>. 账户id
     */
    public Long getAccountId() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>xbkj.fd_provider_register_info.phone</code>. 手机号
     */
    public void setPhone(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>xbkj.fd_provider_register_info.phone</code>. 手机号
     */
    public String getPhone() {
        return (String) get(2);
    }

    /**
     * Setter for <code>xbkj.fd_provider_register_info.code</code>. 机构代码
     */
    public void setCode(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>xbkj.fd_provider_register_info.code</code>. 机构代码
     */
    public String getCode() {
        return (String) get(3);
    }

    /**
     * Setter for <code>xbkj.fd_provider_register_info.type</code>. 机构贷种
     */
    public void setType(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>xbkj.fd_provider_register_info.type</code>. 机构贷种
     */
    public String getType() {
        return (String) get(4);
    }

    /**
     * Setter for <code>xbkj.fd_provider_register_info.create_at</code>. 创建时间
     */
    public void setCreateAt(Timestamp value) {
        set(5, value);
    }

    /**
     * Getter for <code>xbkj.fd_provider_register_info.create_at</code>. 创建时间
     */
    public Timestamp getCreateAt() {
        return (Timestamp) get(5);
    }

    /**
     * Setter for <code>xbkj.fd_provider_register_info.update_at</code>. 更新时间
     */
    public void setUpdateAt(Timestamp value) {
        set(6, value);
    }

    /**
     * Getter for <code>xbkj.fd_provider_register_info.update_at</code>. 更新时间
     */
    public Timestamp getUpdateAt() {
        return (Timestamp) get(6);
    }

    /**
     * Setter for <code>xbkj.fd_provider_register_info.del_flag</code>. 删除标志
     */
    public void setDelFlag(Boolean value) {
        set(7, value);
    }

    /**
     * Getter for <code>xbkj.fd_provider_register_info.del_flag</code>. 删除标志
     */
    public Boolean getDelFlag() {
        return (Boolean) get(7);
    }

    /**
     * Setter for <code>xbkj.fd_provider_register_info.version</code>.
     */
    public void setVersion(Long value) {
        set(8, value);
    }

    /**
     * Getter for <code>xbkj.fd_provider_register_info.version</code>.
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
    public Row9<Long, Long, String, String, String, Timestamp, Timestamp, Boolean, Long> fieldsRow() {
        return (Row9) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row9<Long, Long, String, String, String, Timestamp, Timestamp, Boolean, Long> valuesRow() {
        return (Row9) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return FdProviderRegisterInfo.FD_PROVIDER_REGISTER_INFO.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field2() {
        return FdProviderRegisterInfo.FD_PROVIDER_REGISTER_INFO.ACCOUNT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return FdProviderRegisterInfo.FD_PROVIDER_REGISTER_INFO.PHONE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return FdProviderRegisterInfo.FD_PROVIDER_REGISTER_INFO.CODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return FdProviderRegisterInfo.FD_PROVIDER_REGISTER_INFO.TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field6() {
        return FdProviderRegisterInfo.FD_PROVIDER_REGISTER_INFO.CREATE_AT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field7() {
        return FdProviderRegisterInfo.FD_PROVIDER_REGISTER_INFO.UPDATE_AT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field8() {
        return FdProviderRegisterInfo.FD_PROVIDER_REGISTER_INFO.DEL_FLAG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field9() {
        return FdProviderRegisterInfo.FD_PROVIDER_REGISTER_INFO.VERSION;
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
        return getPhone();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getType();
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
        return getAccountId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getPhone();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getType();
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
    public FdProviderRegisterInfoRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FdProviderRegisterInfoRecord value2(Long value) {
        setAccountId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FdProviderRegisterInfoRecord value3(String value) {
        setPhone(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FdProviderRegisterInfoRecord value4(String value) {
        setCode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FdProviderRegisterInfoRecord value5(String value) {
        setType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FdProviderRegisterInfoRecord value6(Timestamp value) {
        setCreateAt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FdProviderRegisterInfoRecord value7(Timestamp value) {
        setUpdateAt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FdProviderRegisterInfoRecord value8(Boolean value) {
        setDelFlag(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FdProviderRegisterInfoRecord value9(Long value) {
        setVersion(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FdProviderRegisterInfoRecord values(Long value1, Long value2, String value3, String value4, String value5, Timestamp value6, Timestamp value7, Boolean value8, Long value9) {
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
     * Create a detached FdProviderRegisterInfoRecord
     */
    public FdProviderRegisterInfoRecord() {
        super(FdProviderRegisterInfo.FD_PROVIDER_REGISTER_INFO);
    }

    /**
     * Create a detached, initialised FdProviderRegisterInfoRecord
     */
    public FdProviderRegisterInfoRecord(Long id, Long accountId, String phone, String code, String type, Timestamp createAt, Timestamp updateAt, Boolean delFlag, Long version) {
        super(FdProviderRegisterInfo.FD_PROVIDER_REGISTER_INFO);

        set(0, id);
        set(1, accountId);
        set(2, phone);
        set(3, code);
        set(4, type);
        set(5, createAt);
        set(6, updateAt);
        set(7, delFlag);
        set(8, version);
    }
}
