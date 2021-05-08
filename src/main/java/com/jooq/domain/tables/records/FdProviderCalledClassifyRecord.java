/*
 * This file is generated by jOOQ.
*/
package com.jooq.domain.tables.records;


import com.jooq.domain.tables.FdProviderCalledClassify;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record12;
import org.jooq.Row12;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * 被叫对方号码归属地分布表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class FdProviderCalledClassifyRecord extends UpdatableRecordImpl<FdProviderCalledClassifyRecord> implements Record12<Long, Long, String, String, String, String, String, String, Timestamp, Timestamp, Boolean, Long> {

    private static final long serialVersionUID = 903835184;

    /**
     * Setter for <code>xbkj.fd_provider_called_classify.id</code>. 主键
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>xbkj.fd_provider_called_classify.id</code>. 主键
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>xbkj.fd_provider_called_classify.account_id</code>. 账户id
     */
    public void setAccountId(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>xbkj.fd_provider_called_classify.account_id</code>. 账户id
     */
    public Long getAccountId() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>xbkj.fd_provider_called_classify.name</code>. 分类名称
     */
    public void setName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>xbkj.fd_provider_called_classify.name</code>. 分类名称
     */
    public String getName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>xbkj.fd_provider_called_classify.count</code>. 不同号码数量
     */
    public void setCount(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>xbkj.fd_provider_called_classify.count</code>. 不同号码数量
     */
    public String getCount() {
        return (String) get(3);
    }

    /**
     * Setter for <code>xbkj.fd_provider_called_classify.num</code>. 总通话次数
     */
    public void setNum(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>xbkj.fd_provider_called_classify.num</code>. 总通话次数
     */
    public String getNum() {
        return (String) get(4);
    }

    /**
     * Setter for <code>xbkj.fd_provider_called_classify.rate</code>. 通话占比
     */
    public void setRate(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>xbkj.fd_provider_called_classify.rate</code>. 通话占比
     */
    public String getRate() {
        return (String) get(5);
    }

    /**
     * Setter for <code>xbkj.fd_provider_called_classify.time</code>. 总通话时长
     */
    public void setTime(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>xbkj.fd_provider_called_classify.time</code>. 总通话时长
     */
    public String getTime() {
        return (String) get(6);
    }

    /**
     * Setter for <code>xbkj.fd_provider_called_classify.time_rate</code>. 通话时长占比
     */
    public void setTimeRate(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>xbkj.fd_provider_called_classify.time_rate</code>. 通话时长占比
     */
    public String getTimeRate() {
        return (String) get(7);
    }

    /**
     * Setter for <code>xbkj.fd_provider_called_classify.create_at</code>. 创建时间
     */
    public void setCreateAt(Timestamp value) {
        set(8, value);
    }

    /**
     * Getter for <code>xbkj.fd_provider_called_classify.create_at</code>. 创建时间
     */
    public Timestamp getCreateAt() {
        return (Timestamp) get(8);
    }

    /**
     * Setter for <code>xbkj.fd_provider_called_classify.update_at</code>. 更新时间
     */
    public void setUpdateAt(Timestamp value) {
        set(9, value);
    }

    /**
     * Getter for <code>xbkj.fd_provider_called_classify.update_at</code>. 更新时间
     */
    public Timestamp getUpdateAt() {
        return (Timestamp) get(9);
    }

    /**
     * Setter for <code>xbkj.fd_provider_called_classify.del_flag</code>. 删除标志
     */
    public void setDelFlag(Boolean value) {
        set(10, value);
    }

    /**
     * Getter for <code>xbkj.fd_provider_called_classify.del_flag</code>. 删除标志
     */
    public Boolean getDelFlag() {
        return (Boolean) get(10);
    }

    /**
     * Setter for <code>xbkj.fd_provider_called_classify.version</code>.
     */
    public void setVersion(Long value) {
        set(11, value);
    }

    /**
     * Getter for <code>xbkj.fd_provider_called_classify.version</code>.
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
        return FdProviderCalledClassify.FD_PROVIDER_CALLED_CLASSIFY.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field2() {
        return FdProviderCalledClassify.FD_PROVIDER_CALLED_CLASSIFY.ACCOUNT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return FdProviderCalledClassify.FD_PROVIDER_CALLED_CLASSIFY.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return FdProviderCalledClassify.FD_PROVIDER_CALLED_CLASSIFY.COUNT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return FdProviderCalledClassify.FD_PROVIDER_CALLED_CLASSIFY.NUM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return FdProviderCalledClassify.FD_PROVIDER_CALLED_CLASSIFY.RATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return FdProviderCalledClassify.FD_PROVIDER_CALLED_CLASSIFY.TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return FdProviderCalledClassify.FD_PROVIDER_CALLED_CLASSIFY.TIME_RATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field9() {
        return FdProviderCalledClassify.FD_PROVIDER_CALLED_CLASSIFY.CREATE_AT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field10() {
        return FdProviderCalledClassify.FD_PROVIDER_CALLED_CLASSIFY.UPDATE_AT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field11() {
        return FdProviderCalledClassify.FD_PROVIDER_CALLED_CLASSIFY.DEL_FLAG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field12() {
        return FdProviderCalledClassify.FD_PROVIDER_CALLED_CLASSIFY.VERSION;
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
        return getCount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getNum();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getRate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component8() {
        return getTimeRate();
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
        return getCount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getNum();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getRate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getTimeRate();
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
    public FdProviderCalledClassifyRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FdProviderCalledClassifyRecord value2(Long value) {
        setAccountId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FdProviderCalledClassifyRecord value3(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FdProviderCalledClassifyRecord value4(String value) {
        setCount(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FdProviderCalledClassifyRecord value5(String value) {
        setNum(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FdProviderCalledClassifyRecord value6(String value) {
        setRate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FdProviderCalledClassifyRecord value7(String value) {
        setTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FdProviderCalledClassifyRecord value8(String value) {
        setTimeRate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FdProviderCalledClassifyRecord value9(Timestamp value) {
        setCreateAt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FdProviderCalledClassifyRecord value10(Timestamp value) {
        setUpdateAt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FdProviderCalledClassifyRecord value11(Boolean value) {
        setDelFlag(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FdProviderCalledClassifyRecord value12(Long value) {
        setVersion(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FdProviderCalledClassifyRecord values(Long value1, Long value2, String value3, String value4, String value5, String value6, String value7, String value8, Timestamp value9, Timestamp value10, Boolean value11, Long value12) {
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
     * Create a detached FdProviderCalledClassifyRecord
     */
    public FdProviderCalledClassifyRecord() {
        super(FdProviderCalledClassify.FD_PROVIDER_CALLED_CLASSIFY);
    }

    /**
     * Create a detached, initialised FdProviderCalledClassifyRecord
     */
    public FdProviderCalledClassifyRecord(Long id, Long accountId, String name, String count, String num, String rate, String time, String timeRate, Timestamp createAt, Timestamp updateAt, Boolean delFlag, Long version) {
        super(FdProviderCalledClassify.FD_PROVIDER_CALLED_CLASSIFY);

        set(0, id);
        set(1, accountId);
        set(2, name);
        set(3, count);
        set(4, num);
        set(5, rate);
        set(6, time);
        set(7, timeRate);
        set(8, createAt);
        set(9, updateAt);
        set(10, delFlag);
        set(11, version);
    }
}