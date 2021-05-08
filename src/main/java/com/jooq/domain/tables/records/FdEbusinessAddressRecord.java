/*
 * This file is generated by jOOQ.
*/
package com.jooq.domain.tables.records;


import com.jooq.domain.tables.FdEbusinessAddress;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record12;
import org.jooq.Row12;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * 电商地址信息
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class FdEbusinessAddressRecord extends UpdatableRecordImpl<FdEbusinessAddressRecord> implements Record12<Long, Long, String, String, String, String, String, String, Timestamp, Timestamp, Boolean, Long> {

    private static final long serialVersionUID = -133299540;

    /**
     * Setter for <code>xbkj.fd_ebusiness_address.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>xbkj.fd_ebusiness_address.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>xbkj.fd_ebusiness_address.account_id</code>. 账户ID
     */
    public void setAccountId(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>xbkj.fd_ebusiness_address.account_id</code>. 账户ID
     */
    public Long getAccountId() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>xbkj.fd_ebusiness_address.name</code>. 收货人姓名
     */
    public void setName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>xbkj.fd_ebusiness_address.name</code>. 收货人姓名
     */
    public String getName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>xbkj.fd_ebusiness_address.phone</code>. 收货人电话
     */
    public void setPhone(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>xbkj.fd_ebusiness_address.phone</code>. 收货人电话
     */
    public String getPhone() {
        return (String) get(3);
    }

    /**
     * Setter for <code>xbkj.fd_ebusiness_address.address_area</code>. 所在区域
     */
    public void setAddressArea(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>xbkj.fd_ebusiness_address.address_area</code>. 所在区域
     */
    public String getAddressArea() {
        return (String) get(4);
    }

    /**
     * Setter for <code>xbkj.fd_ebusiness_address.address_detail</code>. 详细地址
     */
    public void setAddressDetail(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>xbkj.fd_ebusiness_address.address_detail</code>. 详细地址
     */
    public String getAddressDetail() {
        return (String) get(5);
    }

    /**
     * Setter for <code>xbkj.fd_ebusiness_address.postcode</code>. 邮编
     */
    public void setPostcode(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>xbkj.fd_ebusiness_address.postcode</code>. 邮编
     */
    public String getPostcode() {
        return (String) get(6);
    }

    /**
     * Setter for <code>xbkj.fd_ebusiness_address.is_default</code>. 是否默认地址
     */
    public void setIsDefault(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>xbkj.fd_ebusiness_address.is_default</code>. 是否默认地址
     */
    public String getIsDefault() {
        return (String) get(7);
    }

    /**
     * Setter for <code>xbkj.fd_ebusiness_address.create_at</code>. 创建时间
     */
    public void setCreateAt(Timestamp value) {
        set(8, value);
    }

    /**
     * Getter for <code>xbkj.fd_ebusiness_address.create_at</code>. 创建时间
     */
    public Timestamp getCreateAt() {
        return (Timestamp) get(8);
    }

    /**
     * Setter for <code>xbkj.fd_ebusiness_address.update_at</code>. 更新时间
     */
    public void setUpdateAt(Timestamp value) {
        set(9, value);
    }

    /**
     * Getter for <code>xbkj.fd_ebusiness_address.update_at</code>. 更新时间
     */
    public Timestamp getUpdateAt() {
        return (Timestamp) get(9);
    }

    /**
     * Setter for <code>xbkj.fd_ebusiness_address.del_flag</code>. 删除标志
     */
    public void setDelFlag(Boolean value) {
        set(10, value);
    }

    /**
     * Getter for <code>xbkj.fd_ebusiness_address.del_flag</code>. 删除标志
     */
    public Boolean getDelFlag() {
        return (Boolean) get(10);
    }

    /**
     * Setter for <code>xbkj.fd_ebusiness_address.version</code>.
     */
    public void setVersion(Long value) {
        set(11, value);
    }

    /**
     * Getter for <code>xbkj.fd_ebusiness_address.version</code>.
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
    public Row12<Long, Long, String, String, String, String, String, String, Timestamp, Timestamp, Boolean, Long> fieldsRow() {
        return (Row12) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row12<Long, Long, String, String, String, String, String, String, Timestamp, Timestamp, Boolean, Long> valuesRow() {
        return (Row12) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return FdEbusinessAddress.FD_EBUSINESS_ADDRESS.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field2() {
        return FdEbusinessAddress.FD_EBUSINESS_ADDRESS.ACCOUNT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return FdEbusinessAddress.FD_EBUSINESS_ADDRESS.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return FdEbusinessAddress.FD_EBUSINESS_ADDRESS.PHONE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return FdEbusinessAddress.FD_EBUSINESS_ADDRESS.ADDRESS_AREA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return FdEbusinessAddress.FD_EBUSINESS_ADDRESS.ADDRESS_DETAIL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return FdEbusinessAddress.FD_EBUSINESS_ADDRESS.POSTCODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return FdEbusinessAddress.FD_EBUSINESS_ADDRESS.IS_DEFAULT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field9() {
        return FdEbusinessAddress.FD_EBUSINESS_ADDRESS.CREATE_AT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field10() {
        return FdEbusinessAddress.FD_EBUSINESS_ADDRESS.UPDATE_AT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field11() {
        return FdEbusinessAddress.FD_EBUSINESS_ADDRESS.DEL_FLAG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field12() {
        return FdEbusinessAddress.FD_EBUSINESS_ADDRESS.VERSION;
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
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getPhone();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getAddressArea();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getAddressDetail();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getPostcode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component8() {
        return getIsDefault();
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
        return getAccountId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getPhone();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getAddressArea();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getAddressDetail();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getPostcode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getIsDefault();
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
    public FdEbusinessAddressRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FdEbusinessAddressRecord value2(Long value) {
        setAccountId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FdEbusinessAddressRecord value3(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FdEbusinessAddressRecord value4(String value) {
        setPhone(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FdEbusinessAddressRecord value5(String value) {
        setAddressArea(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FdEbusinessAddressRecord value6(String value) {
        setAddressDetail(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FdEbusinessAddressRecord value7(String value) {
        setPostcode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FdEbusinessAddressRecord value8(String value) {
        setIsDefault(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FdEbusinessAddressRecord value9(Timestamp value) {
        setCreateAt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FdEbusinessAddressRecord value10(Timestamp value) {
        setUpdateAt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FdEbusinessAddressRecord value11(Boolean value) {
        setDelFlag(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FdEbusinessAddressRecord value12(Long value) {
        setVersion(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FdEbusinessAddressRecord values(Long value1, Long value2, String value3, String value4, String value5, String value6, String value7, String value8, Timestamp value9, Timestamp value10, Boolean value11, Long value12) {
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
     * Create a detached FdEbusinessAddressRecord
     */
    public FdEbusinessAddressRecord() {
        super(FdEbusinessAddress.FD_EBUSINESS_ADDRESS);
    }

    /**
     * Create a detached, initialised FdEbusinessAddressRecord
     */
    public FdEbusinessAddressRecord(Long id, Long accountId, String name, String phone, String addressArea, String addressDetail, String postcode, String isDefault, Timestamp createAt, Timestamp updateAt, Boolean delFlag, Long version) {
        super(FdEbusinessAddress.FD_EBUSINESS_ADDRESS);

        set(0, id);
        set(1, accountId);
        set(2, name);
        set(3, phone);
        set(4, addressArea);
        set(5, addressDetail);
        set(6, postcode);
        set(7, isDefault);
        set(8, createAt);
        set(9, updateAt);
        set(10, delFlag);
        set(11, version);
    }
}
