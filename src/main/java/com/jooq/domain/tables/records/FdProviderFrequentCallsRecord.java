/*
 * This file is generated by jOOQ.
*/
package com.jooq.domain.tables.records;


import com.jooq.domain.tables.FdProviderFrequentCalls;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record22;
import org.jooq.Row22;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * 被叫对方号码行业分类分布表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class FdProviderFrequentCallsRecord extends UpdatableRecordImpl<FdProviderFrequentCallsRecord> implements Record22<Long, Long, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, Timestamp, Timestamp, Boolean, Long> {

    private static final long serialVersionUID = -331334152;

    /**
     * Setter for <code>xbkj.fd_provider_frequent_calls.id</code>. 主键
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>xbkj.fd_provider_frequent_calls.id</code>. 主键
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>xbkj.fd_provider_frequent_calls.account_id</code>. 账户id
     */
    public void setAccountId(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>xbkj.fd_provider_frequent_calls.account_id</code>. 账户id
     */
    public Long getAccountId() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>xbkj.fd_provider_frequent_calls.phone</code>. 对方号码
     */
    public void setPhone(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>xbkj.fd_provider_frequent_calls.phone</code>. 对方号码
     */
    public String getPhone() {
        return (String) get(2);
    }

    /**
     * Setter for <code>xbkj.fd_provider_frequent_calls.location</code>. 对方号码归属地
     */
    public void setLocation(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>xbkj.fd_provider_frequent_calls.location</code>. 对方号码归属地
     */
    public String getLocation() {
        return (String) get(3);
    }

    /**
     * Setter for <code>xbkj.fd_provider_frequent_calls.classify</code>. 号码分类
     */
    public void setClassify(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>xbkj.fd_provider_frequent_calls.classify</code>. 号码分类
     */
    public String getClassify() {
        return (String) get(4);
    }

    /**
     * Setter for <code>xbkj.fd_provider_frequent_calls.name</code>. 名称
     */
    public void setName(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>xbkj.fd_provider_frequent_calls.name</code>. 名称
     */
    public String getName() {
        return (String) get(5);
    }

    /**
     * Setter for <code>xbkj.fd_provider_frequent_calls.count</code>. 通话总次数
     */
    public void setCount(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>xbkj.fd_provider_frequent_calls.count</code>. 通话总次数
     */
    public String getCount() {
        return (String) get(6);
    }

    /**
     * Setter for <code>xbkj.fd_provider_frequent_calls.time</code>. 通话总时长
     */
    public void setTime(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>xbkj.fd_provider_frequent_calls.time</code>. 通话总时长
     */
    public String getTime() {
        return (String) get(7);
    }

    /**
     * Setter for <code>xbkj.fd_provider_frequent_calls.call_count</code>. 主叫次数
     */
    public void setCallCount(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>xbkj.fd_provider_frequent_calls.call_count</code>. 主叫次数
     */
    public String getCallCount() {
        return (String) get(8);
    }

    /**
     * Setter for <code>xbkj.fd_provider_frequent_calls.call_time</code>. 主叫总时长
     */
    public void setCallTime(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>xbkj.fd_provider_frequent_calls.call_time</code>. 主叫总时长
     */
    public String getCallTime() {
        return (String) get(9);
    }

    /**
     * Setter for <code>xbkj.fd_provider_frequent_calls.called_count</code>. 被叫次数
     */
    public void setCalledCount(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>xbkj.fd_provider_frequent_calls.called_count</code>. 被叫次数
     */
    public String getCalledCount() {
        return (String) get(10);
    }

    /**
     * Setter for <code>xbkj.fd_provider_frequent_calls.called_time</code>. 被叫总时长
     */
    public void setCalledTime(String value) {
        set(11, value);
    }

    /**
     * Getter for <code>xbkj.fd_provider_frequent_calls.called_time</code>. 被叫总时长
     */
    public String getCalledTime() {
        return (String) get(11);
    }

    /**
     * Setter for <code>xbkj.fd_provider_frequent_calls.morning_count</code>. 凌晨通话次数(00-06)
     */
    public void setMorningCount(String value) {
        set(12, value);
    }

    /**
     * Getter for <code>xbkj.fd_provider_frequent_calls.morning_count</code>. 凌晨通话次数(00-06)
     */
    public String getMorningCount() {
        return (String) get(12);
    }

    /**
     * Setter for <code>xbkj.fd_provider_frequent_calls.day_count</code>. 白天通话次数(06-18)
     */
    public void setDayCount(String value) {
        set(13, value);
    }

    /**
     * Getter for <code>xbkj.fd_provider_frequent_calls.day_count</code>. 白天通话次数(06-18)
     */
    public String getDayCount() {
        return (String) get(13);
    }

    /**
     * Setter for <code>xbkj.fd_provider_frequent_calls.night_count</code>. 夜间通话次数(18-24)
     */
    public void setNightCount(String value) {
        set(14, value);
    }

    /**
     * Getter for <code>xbkj.fd_provider_frequent_calls.night_count</code>. 夜间通话次数(18-24)
     */
    public String getNightCount() {
        return (String) get(14);
    }

    /**
     * Setter for <code>xbkj.fd_provider_frequent_calls.call_count_l1m</code>. 近1个月通话总次数
     */
    public void setCallCountL1m(String value) {
        set(15, value);
    }

    /**
     * Getter for <code>xbkj.fd_provider_frequent_calls.call_count_l1m</code>. 近1个月通话总次数
     */
    public String getCallCountL1m() {
        return (String) get(15);
    }

    /**
     * Setter for <code>xbkj.fd_provider_frequent_calls.call_count_l3m</code>. 近3个月通话总次数
     */
    public void setCallCountL3m(String value) {
        set(16, value);
    }

    /**
     * Getter for <code>xbkj.fd_provider_frequent_calls.call_count_l3m</code>. 近3个月通话总次数
     */
    public String getCallCountL3m() {
        return (String) get(16);
    }

    /**
     * Setter for <code>xbkj.fd_provider_frequent_calls.call_count_l6m</code>. 近6个月通话总次数
     */
    public void setCallCountL6m(String value) {
        set(17, value);
    }

    /**
     * Getter for <code>xbkj.fd_provider_frequent_calls.call_count_l6m</code>. 近6个月通话总次数
     */
    public String getCallCountL6m() {
        return (String) get(17);
    }

    /**
     * Setter for <code>xbkj.fd_provider_frequent_calls.create_at</code>. 创建时间
     */
    public void setCreateAt(Timestamp value) {
        set(18, value);
    }

    /**
     * Getter for <code>xbkj.fd_provider_frequent_calls.create_at</code>. 创建时间
     */
    public Timestamp getCreateAt() {
        return (Timestamp) get(18);
    }

    /**
     * Setter for <code>xbkj.fd_provider_frequent_calls.update_at</code>. 更新时间
     */
    public void setUpdateAt(Timestamp value) {
        set(19, value);
    }

    /**
     * Getter for <code>xbkj.fd_provider_frequent_calls.update_at</code>. 更新时间
     */
    public Timestamp getUpdateAt() {
        return (Timestamp) get(19);
    }

    /**
     * Setter for <code>xbkj.fd_provider_frequent_calls.del_flag</code>. 删除标志
     */
    public void setDelFlag(Boolean value) {
        set(20, value);
    }

    /**
     * Getter for <code>xbkj.fd_provider_frequent_calls.del_flag</code>. 删除标志
     */
    public Boolean getDelFlag() {
        return (Boolean) get(20);
    }

    /**
     * Setter for <code>xbkj.fd_provider_frequent_calls.version</code>.
     */
    public void setVersion(Long value) {
        set(21, value);
    }

    /**
     * Getter for <code>xbkj.fd_provider_frequent_calls.version</code>.
     */
    public Long getVersion() {
        return (Long) get(21);
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
    // Record22 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row22<Long, Long, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, Timestamp, Timestamp, Boolean, Long> fieldsRow() {
        return (Row22) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row22<Long, Long, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, Timestamp, Timestamp, Boolean, Long> valuesRow() {
        return (Row22) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return FdProviderFrequentCalls.FD_PROVIDER_FREQUENT_CALLS.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field2() {
        return FdProviderFrequentCalls.FD_PROVIDER_FREQUENT_CALLS.ACCOUNT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return FdProviderFrequentCalls.FD_PROVIDER_FREQUENT_CALLS.PHONE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return FdProviderFrequentCalls.FD_PROVIDER_FREQUENT_CALLS.LOCATION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return FdProviderFrequentCalls.FD_PROVIDER_FREQUENT_CALLS.CLASSIFY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return FdProviderFrequentCalls.FD_PROVIDER_FREQUENT_CALLS.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return FdProviderFrequentCalls.FD_PROVIDER_FREQUENT_CALLS.COUNT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return FdProviderFrequentCalls.FD_PROVIDER_FREQUENT_CALLS.TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return FdProviderFrequentCalls.FD_PROVIDER_FREQUENT_CALLS.CALL_COUNT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field10() {
        return FdProviderFrequentCalls.FD_PROVIDER_FREQUENT_CALLS.CALL_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field11() {
        return FdProviderFrequentCalls.FD_PROVIDER_FREQUENT_CALLS.CALLED_COUNT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field12() {
        return FdProviderFrequentCalls.FD_PROVIDER_FREQUENT_CALLS.CALLED_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field13() {
        return FdProviderFrequentCalls.FD_PROVIDER_FREQUENT_CALLS.MORNING_COUNT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field14() {
        return FdProviderFrequentCalls.FD_PROVIDER_FREQUENT_CALLS.DAY_COUNT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field15() {
        return FdProviderFrequentCalls.FD_PROVIDER_FREQUENT_CALLS.NIGHT_COUNT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field16() {
        return FdProviderFrequentCalls.FD_PROVIDER_FREQUENT_CALLS.CALL_COUNT_L1M;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field17() {
        return FdProviderFrequentCalls.FD_PROVIDER_FREQUENT_CALLS.CALL_COUNT_L3M;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field18() {
        return FdProviderFrequentCalls.FD_PROVIDER_FREQUENT_CALLS.CALL_COUNT_L6M;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field19() {
        return FdProviderFrequentCalls.FD_PROVIDER_FREQUENT_CALLS.CREATE_AT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field20() {
        return FdProviderFrequentCalls.FD_PROVIDER_FREQUENT_CALLS.UPDATE_AT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field21() {
        return FdProviderFrequentCalls.FD_PROVIDER_FREQUENT_CALLS.DEL_FLAG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field22() {
        return FdProviderFrequentCalls.FD_PROVIDER_FREQUENT_CALLS.VERSION;
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
        return getLocation();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getClassify();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getCount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component8() {
        return getTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component9() {
        return getCallCount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component10() {
        return getCallTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component11() {
        return getCalledCount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component12() {
        return getCalledTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component13() {
        return getMorningCount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component14() {
        return getDayCount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component15() {
        return getNightCount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component16() {
        return getCallCountL1m();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component17() {
        return getCallCountL3m();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component18() {
        return getCallCountL6m();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component19() {
        return getCreateAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component20() {
        return getUpdateAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component21() {
        return getDelFlag();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component22() {
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
        return getLocation();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getClassify();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getCount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getCallCount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value10() {
        return getCallTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value11() {
        return getCalledCount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value12() {
        return getCalledTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value13() {
        return getMorningCount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value14() {
        return getDayCount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value15() {
        return getNightCount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value16() {
        return getCallCountL1m();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value17() {
        return getCallCountL3m();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value18() {
        return getCallCountL6m();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value19() {
        return getCreateAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value20() {
        return getUpdateAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value21() {
        return getDelFlag();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value22() {
        return getVersion();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FdProviderFrequentCallsRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FdProviderFrequentCallsRecord value2(Long value) {
        setAccountId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FdProviderFrequentCallsRecord value3(String value) {
        setPhone(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FdProviderFrequentCallsRecord value4(String value) {
        setLocation(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FdProviderFrequentCallsRecord value5(String value) {
        setClassify(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FdProviderFrequentCallsRecord value6(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FdProviderFrequentCallsRecord value7(String value) {
        setCount(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FdProviderFrequentCallsRecord value8(String value) {
        setTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FdProviderFrequentCallsRecord value9(String value) {
        setCallCount(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FdProviderFrequentCallsRecord value10(String value) {
        setCallTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FdProviderFrequentCallsRecord value11(String value) {
        setCalledCount(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FdProviderFrequentCallsRecord value12(String value) {
        setCalledTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FdProviderFrequentCallsRecord value13(String value) {
        setMorningCount(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FdProviderFrequentCallsRecord value14(String value) {
        setDayCount(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FdProviderFrequentCallsRecord value15(String value) {
        setNightCount(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FdProviderFrequentCallsRecord value16(String value) {
        setCallCountL1m(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FdProviderFrequentCallsRecord value17(String value) {
        setCallCountL3m(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FdProviderFrequentCallsRecord value18(String value) {
        setCallCountL6m(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FdProviderFrequentCallsRecord value19(Timestamp value) {
        setCreateAt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FdProviderFrequentCallsRecord value20(Timestamp value) {
        setUpdateAt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FdProviderFrequentCallsRecord value21(Boolean value) {
        setDelFlag(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FdProviderFrequentCallsRecord value22(Long value) {
        setVersion(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FdProviderFrequentCallsRecord values(Long value1, Long value2, String value3, String value4, String value5, String value6, String value7, String value8, String value9, String value10, String value11, String value12, String value13, String value14, String value15, String value16, String value17, String value18, Timestamp value19, Timestamp value20, Boolean value21, Long value22) {
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
        value22(value22);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached FdProviderFrequentCallsRecord
     */
    public FdProviderFrequentCallsRecord() {
        super(FdProviderFrequentCalls.FD_PROVIDER_FREQUENT_CALLS);
    }

    /**
     * Create a detached, initialised FdProviderFrequentCallsRecord
     */
    public FdProviderFrequentCallsRecord(Long id, Long accountId, String phone, String location, String classify, String name, String count, String time, String callCount, String callTime, String calledCount, String calledTime, String morningCount, String dayCount, String nightCount, String callCountL1m, String callCountL3m, String callCountL6m, Timestamp createAt, Timestamp updateAt, Boolean delFlag, Long version) {
        super(FdProviderFrequentCalls.FD_PROVIDER_FREQUENT_CALLS);

        set(0, id);
        set(1, accountId);
        set(2, phone);
        set(3, location);
        set(4, classify);
        set(5, name);
        set(6, count);
        set(7, time);
        set(8, callCount);
        set(9, callTime);
        set(10, calledCount);
        set(11, calledTime);
        set(12, morningCount);
        set(13, dayCount);
        set(14, nightCount);
        set(15, callCountL1m);
        set(16, callCountL3m);
        set(17, callCountL6m);
        set(18, createAt);
        set(19, updateAt);
        set(20, delFlag);
        set(21, version);
    }
}