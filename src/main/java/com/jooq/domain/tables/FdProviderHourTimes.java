/*
 * This file is generated by jOOQ.
*/
package com.jooq.domain.tables;


import com.jooq.domain.Indexes;
import com.jooq.domain.Keys;
import com.jooq.domain.Xbkj;
import com.jooq.domain.tables.records.FdProviderHourTimesRecord;

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
 * 24小时通话时长分布(整数数组)表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class FdProviderHourTimes extends TableImpl<FdProviderHourTimesRecord> {

    private static final long serialVersionUID = 1095210021;

    /**
     * The reference instance of <code>xbkj.fd_provider_hour_times</code>
     */
    public static final FdProviderHourTimes FD_PROVIDER_HOUR_TIMES = new FdProviderHourTimes();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<FdProviderHourTimesRecord> getRecordType() {
        return FdProviderHourTimesRecord.class;
    }

    /**
     * The column <code>xbkj.fd_provider_hour_times.id</code>. 主键
     */
    public final TableField<FdProviderHourTimesRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).identity(true), this, "主键");

    /**
     * The column <code>xbkj.fd_provider_hour_times.account_id</code>. 账户id
     */
    public final TableField<FdProviderHourTimesRecord, Long> ACCOUNT_ID = createField("account_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "账户id");

    /**
     * The column <code>xbkj.fd_provider_hour_times.seconds</code>. 时间
     */
    public final TableField<FdProviderHourTimesRecord, Long> SECONDS = createField("seconds", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "时间");

    /**
     * The column <code>xbkj.fd_provider_hour_times.create_at</code>. 创建时间
     */
    public final TableField<FdProviderHourTimesRecord, Timestamp> CREATE_AT = createField("create_at", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "创建时间");

    /**
     * The column <code>xbkj.fd_provider_hour_times.update_at</code>. 更新时间
     */
    public final TableField<FdProviderHourTimesRecord, Timestamp> UPDATE_AT = createField("update_at", org.jooq.impl.SQLDataType.TIMESTAMP, this, "更新时间");

    /**
     * The column <code>xbkj.fd_provider_hour_times.del_flag</code>. 删除标志
     */
    public final TableField<FdProviderHourTimesRecord, Boolean> DEL_FLAG = createField("del_flag", org.jooq.impl.SQLDataType.BIT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("b'0'", org.jooq.impl.SQLDataType.BIT)), this, "删除标志");

    /**
     * The column <code>xbkj.fd_provider_hour_times.version</code>.
     */
    public final TableField<FdProviderHourTimesRecord, Long> VERSION = createField("version", org.jooq.impl.SQLDataType.BIGINT.defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * Create a <code>xbkj.fd_provider_hour_times</code> table reference
     */
    public FdProviderHourTimes() {
        this(DSL.name("fd_provider_hour_times"), null);
    }

    /**
     * Create an aliased <code>xbkj.fd_provider_hour_times</code> table reference
     */
    public FdProviderHourTimes(String alias) {
        this(DSL.name(alias), FD_PROVIDER_HOUR_TIMES);
    }

    /**
     * Create an aliased <code>xbkj.fd_provider_hour_times</code> table reference
     */
    public FdProviderHourTimes(Name alias) {
        this(alias, FD_PROVIDER_HOUR_TIMES);
    }

    private FdProviderHourTimes(Name alias, Table<FdProviderHourTimesRecord> aliased) {
        this(alias, aliased, null);
    }

    private FdProviderHourTimes(Name alias, Table<FdProviderHourTimesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "24小时通话时长分布(整数数组)表");
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
        return Arrays.<Index>asList(Indexes.FD_PROVIDER_HOUR_TIMES_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<FdProviderHourTimesRecord, Long> getIdentity() {
        return Keys.IDENTITY_FD_PROVIDER_HOUR_TIMES;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<FdProviderHourTimesRecord> getPrimaryKey() {
        return Keys.KEY_FD_PROVIDER_HOUR_TIMES_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<FdProviderHourTimesRecord>> getKeys() {
        return Arrays.<UniqueKey<FdProviderHourTimesRecord>>asList(Keys.KEY_FD_PROVIDER_HOUR_TIMES_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FdProviderHourTimes as(String alias) {
        return new FdProviderHourTimes(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FdProviderHourTimes as(Name alias) {
        return new FdProviderHourTimes(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public FdProviderHourTimes rename(String name) {
        return new FdProviderHourTimes(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public FdProviderHourTimes rename(Name name) {
        return new FdProviderHourTimes(name, null);
    }
}
