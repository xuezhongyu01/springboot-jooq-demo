/*
 * This file is generated by jOOQ.
*/
package com.jooq.domain.tables;


import com.jooq.domain.Indexes;
import com.jooq.domain.Keys;
import com.jooq.domain.Xbkj;
import com.jooq.domain.tables.records.FdProviderHourCountsRecord;

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
public class FdProviderHourCounts extends TableImpl<FdProviderHourCountsRecord> {

    private static final long serialVersionUID = -562032403;

    /**
     * The reference instance of <code>xbkj.fd_provider_hour_counts</code>
     */
    public static final FdProviderHourCounts FD_PROVIDER_HOUR_COUNTS = new FdProviderHourCounts();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<FdProviderHourCountsRecord> getRecordType() {
        return FdProviderHourCountsRecord.class;
    }

    /**
     * The column <code>xbkj.fd_provider_hour_counts.id</code>. 主键
     */
    public final TableField<FdProviderHourCountsRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).identity(true), this, "主键");

    /**
     * The column <code>xbkj.fd_provider_hour_counts.account_id</code>. 账户id
     */
    public final TableField<FdProviderHourCountsRecord, Long> ACCOUNT_ID = createField("account_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "账户id");

    /**
     * The column <code>xbkj.fd_provider_hour_counts.count</code>. 次数
     */
    public final TableField<FdProviderHourCountsRecord, Long> COUNT = createField("count", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "次数");

    /**
     * The column <code>xbkj.fd_provider_hour_counts.create_at</code>. 创建时间
     */
    public final TableField<FdProviderHourCountsRecord, Timestamp> CREATE_AT = createField("create_at", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "创建时间");

    /**
     * The column <code>xbkj.fd_provider_hour_counts.update_at</code>. 更新时间
     */
    public final TableField<FdProviderHourCountsRecord, Timestamp> UPDATE_AT = createField("update_at", org.jooq.impl.SQLDataType.TIMESTAMP, this, "更新时间");

    /**
     * The column <code>xbkj.fd_provider_hour_counts.del_flag</code>. 删除标志
     */
    public final TableField<FdProviderHourCountsRecord, Boolean> DEL_FLAG = createField("del_flag", org.jooq.impl.SQLDataType.BIT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("b'0'", org.jooq.impl.SQLDataType.BIT)), this, "删除标志");

    /**
     * The column <code>xbkj.fd_provider_hour_counts.version</code>.
     */
    public final TableField<FdProviderHourCountsRecord, Long> VERSION = createField("version", org.jooq.impl.SQLDataType.BIGINT.defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * Create a <code>xbkj.fd_provider_hour_counts</code> table reference
     */
    public FdProviderHourCounts() {
        this(DSL.name("fd_provider_hour_counts"), null);
    }

    /**
     * Create an aliased <code>xbkj.fd_provider_hour_counts</code> table reference
     */
    public FdProviderHourCounts(String alias) {
        this(DSL.name(alias), FD_PROVIDER_HOUR_COUNTS);
    }

    /**
     * Create an aliased <code>xbkj.fd_provider_hour_counts</code> table reference
     */
    public FdProviderHourCounts(Name alias) {
        this(alias, FD_PROVIDER_HOUR_COUNTS);
    }

    private FdProviderHourCounts(Name alias, Table<FdProviderHourCountsRecord> aliased) {
        this(alias, aliased, null);
    }

    private FdProviderHourCounts(Name alias, Table<FdProviderHourCountsRecord> aliased, Field<?>[] parameters) {
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
        return Arrays.<Index>asList(Indexes.FD_PROVIDER_HOUR_COUNTS_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<FdProviderHourCountsRecord, Long> getIdentity() {
        return Keys.IDENTITY_FD_PROVIDER_HOUR_COUNTS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<FdProviderHourCountsRecord> getPrimaryKey() {
        return Keys.KEY_FD_PROVIDER_HOUR_COUNTS_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<FdProviderHourCountsRecord>> getKeys() {
        return Arrays.<UniqueKey<FdProviderHourCountsRecord>>asList(Keys.KEY_FD_PROVIDER_HOUR_COUNTS_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FdProviderHourCounts as(String alias) {
        return new FdProviderHourCounts(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FdProviderHourCounts as(Name alias) {
        return new FdProviderHourCounts(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public FdProviderHourCounts rename(String name) {
        return new FdProviderHourCounts(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public FdProviderHourCounts rename(Name name) {
        return new FdProviderHourCounts(name, null);
    }
}
