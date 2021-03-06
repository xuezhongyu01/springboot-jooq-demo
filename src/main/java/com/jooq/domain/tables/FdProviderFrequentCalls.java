/*
 * This file is generated by jOOQ.
*/
package com.jooq.domain.tables;


import com.jooq.domain.Indexes;
import com.jooq.domain.Keys;
import com.jooq.domain.Xbkj;
import com.jooq.domain.tables.records.FdProviderFrequentCallsRecord;

import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


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
public class FdProviderFrequentCalls extends TableImpl<FdProviderFrequentCallsRecord> {

    private static final long serialVersionUID = 528513950;

    /**
     * The reference instance of <code>xbkj.fd_provider_frequent_calls</code>
     */
    public static final FdProviderFrequentCalls FD_PROVIDER_FREQUENT_CALLS = new FdProviderFrequentCalls();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<FdProviderFrequentCallsRecord> getRecordType() {
        return FdProviderFrequentCallsRecord.class;
    }

    /**
     * The column <code>xbkj.fd_provider_frequent_calls.id</code>. 主键
     */
    public final TableField<FdProviderFrequentCallsRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).identity(true), this, "主键");

    /**
     * The column <code>xbkj.fd_provider_frequent_calls.account_id</code>. 账户id
     */
    public final TableField<FdProviderFrequentCallsRecord, Long> ACCOUNT_ID = createField("account_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "账户id");

    /**
     * The column <code>xbkj.fd_provider_frequent_calls.phone</code>. 对方号码
     */
    public final TableField<FdProviderFrequentCallsRecord, String> PHONE = createField("phone", org.jooq.impl.SQLDataType.VARCHAR(32), this, "对方号码");

    /**
     * The column <code>xbkj.fd_provider_frequent_calls.location</code>. 对方号码归属地
     */
    public final TableField<FdProviderFrequentCallsRecord, String> LOCATION = createField("location", org.jooq.impl.SQLDataType.VARCHAR(32), this, "对方号码归属地");

    /**
     * The column <code>xbkj.fd_provider_frequent_calls.classify</code>. 号码分类
     */
    public final TableField<FdProviderFrequentCallsRecord, String> CLASSIFY = createField("classify", org.jooq.impl.SQLDataType.VARCHAR(32), this, "号码分类");

    /**
     * The column <code>xbkj.fd_provider_frequent_calls.name</code>. 名称
     */
    public final TableField<FdProviderFrequentCallsRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR(32), this, "名称");

    /**
     * The column <code>xbkj.fd_provider_frequent_calls.count</code>. 通话总次数
     */
    public final TableField<FdProviderFrequentCallsRecord, String> COUNT = createField("count", org.jooq.impl.SQLDataType.VARCHAR(32), this, "通话总次数");

    /**
     * The column <code>xbkj.fd_provider_frequent_calls.time</code>. 通话总时长
     */
    public final TableField<FdProviderFrequentCallsRecord, String> TIME = createField("time", org.jooq.impl.SQLDataType.VARCHAR(32), this, "通话总时长");

    /**
     * The column <code>xbkj.fd_provider_frequent_calls.call_count</code>. 主叫次数
     */
    public final TableField<FdProviderFrequentCallsRecord, String> CALL_COUNT = createField("call_count", org.jooq.impl.SQLDataType.VARCHAR(32), this, "主叫次数");

    /**
     * The column <code>xbkj.fd_provider_frequent_calls.call_time</code>. 主叫总时长
     */
    public final TableField<FdProviderFrequentCallsRecord, String> CALL_TIME = createField("call_time", org.jooq.impl.SQLDataType.VARCHAR(32), this, "主叫总时长");

    /**
     * The column <code>xbkj.fd_provider_frequent_calls.called_count</code>. 被叫次数
     */
    public final TableField<FdProviderFrequentCallsRecord, String> CALLED_COUNT = createField("called_count", org.jooq.impl.SQLDataType.VARCHAR(32), this, "被叫次数");

    /**
     * The column <code>xbkj.fd_provider_frequent_calls.called_time</code>. 被叫总时长
     */
    public final TableField<FdProviderFrequentCallsRecord, String> CALLED_TIME = createField("called_time", org.jooq.impl.SQLDataType.VARCHAR(32), this, "被叫总时长");

    /**
     * The column <code>xbkj.fd_provider_frequent_calls.morning_count</code>. 凌晨通话次数(00-06)
     */
    public final TableField<FdProviderFrequentCallsRecord, String> MORNING_COUNT = createField("morning_count", org.jooq.impl.SQLDataType.VARCHAR(32), this, "凌晨通话次数(00-06)");

    /**
     * The column <code>xbkj.fd_provider_frequent_calls.day_count</code>. 白天通话次数(06-18)
     */
    public final TableField<FdProviderFrequentCallsRecord, String> DAY_COUNT = createField("day_count", org.jooq.impl.SQLDataType.VARCHAR(32), this, "白天通话次数(06-18)");

    /**
     * The column <code>xbkj.fd_provider_frequent_calls.night_count</code>. 夜间通话次数(18-24)
     */
    public final TableField<FdProviderFrequentCallsRecord, String> NIGHT_COUNT = createField("night_count", org.jooq.impl.SQLDataType.VARCHAR(32), this, "夜间通话次数(18-24)");

    /**
     * The column <code>xbkj.fd_provider_frequent_calls.call_count_l1m</code>. 近1个月通话总次数
     */
    public final TableField<FdProviderFrequentCallsRecord, String> CALL_COUNT_L1M = createField("call_count_l1m", org.jooq.impl.SQLDataType.VARCHAR(32), this, "近1个月通话总次数");

    /**
     * The column <code>xbkj.fd_provider_frequent_calls.call_count_l3m</code>. 近3个月通话总次数
     */
    public final TableField<FdProviderFrequentCallsRecord, String> CALL_COUNT_L3M = createField("call_count_l3m", org.jooq.impl.SQLDataType.VARCHAR(32), this, "近3个月通话总次数");

    /**
     * The column <code>xbkj.fd_provider_frequent_calls.call_count_l6m</code>. 近6个月通话总次数
     */
    public final TableField<FdProviderFrequentCallsRecord, String> CALL_COUNT_L6M = createField("call_count_l6m", org.jooq.impl.SQLDataType.VARCHAR(32), this, "近6个月通话总次数");

    /**
     * The column <code>xbkj.fd_provider_frequent_calls.create_at</code>. 创建时间
     */
    public final TableField<FdProviderFrequentCallsRecord, Timestamp> CREATE_AT = createField("create_at", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "创建时间");

    /**
     * The column <code>xbkj.fd_provider_frequent_calls.update_at</code>. 更新时间
     */
    public final TableField<FdProviderFrequentCallsRecord, Timestamp> UPDATE_AT = createField("update_at", org.jooq.impl.SQLDataType.TIMESTAMP, this, "更新时间");

    /**
     * The column <code>xbkj.fd_provider_frequent_calls.del_flag</code>. 删除标志
     */
    public final TableField<FdProviderFrequentCallsRecord, Boolean> DEL_FLAG = createField("del_flag", org.jooq.impl.SQLDataType.BIT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("b'0'", org.jooq.impl.SQLDataType.BIT)), this, "删除标志");

    /**
     * The column <code>xbkj.fd_provider_frequent_calls.version</code>.
     */
    public final TableField<FdProviderFrequentCallsRecord, Long> VERSION = createField("version", org.jooq.impl.SQLDataType.BIGINT.defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * Create a <code>xbkj.fd_provider_frequent_calls</code> table reference
     */
    public FdProviderFrequentCalls() {
        this(DSL.name("fd_provider_frequent_calls"), null);
    }

    /**
     * Create an aliased <code>xbkj.fd_provider_frequent_calls</code> table reference
     */
    public FdProviderFrequentCalls(String alias) {
        this(DSL.name(alias), FD_PROVIDER_FREQUENT_CALLS);
    }

    /**
     * Create an aliased <code>xbkj.fd_provider_frequent_calls</code> table reference
     */
    public FdProviderFrequentCalls(Name alias) {
        this(alias, FD_PROVIDER_FREQUENT_CALLS);
    }

    private FdProviderFrequentCalls(Name alias, Table<FdProviderFrequentCallsRecord> aliased) {
        this(alias, aliased, null);
    }

    private FdProviderFrequentCalls(Name alias, Table<FdProviderFrequentCallsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "被叫对方号码行业分类分布表");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Xbkj.XBKJ;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.FD_PROVIDER_FREQUENT_CALLS_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<FdProviderFrequentCallsRecord, Long> getIdentity() {
        return Keys.IDENTITY_FD_PROVIDER_FREQUENT_CALLS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<FdProviderFrequentCallsRecord> getPrimaryKey() {
        return Keys.KEY_FD_PROVIDER_FREQUENT_CALLS_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<FdProviderFrequentCallsRecord>> getKeys() {
        return Arrays.<UniqueKey<FdProviderFrequentCallsRecord>>asList(Keys.KEY_FD_PROVIDER_FREQUENT_CALLS_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FdProviderFrequentCalls as(String alias) {
        return new FdProviderFrequentCalls(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FdProviderFrequentCalls as(Name alias) {
        return new FdProviderFrequentCalls(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public FdProviderFrequentCalls rename(String name) {
        return new FdProviderFrequentCalls(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public FdProviderFrequentCalls rename(Name name) {
        return new FdProviderFrequentCalls(name, null);
    }
}
