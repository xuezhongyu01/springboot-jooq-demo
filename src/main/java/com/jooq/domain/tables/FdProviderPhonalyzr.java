/*
 * This file is generated by jOOQ.
*/
package com.jooq.domain.tables;


import com.jooq.domain.Indexes;
import com.jooq.domain.Keys;
import com.jooq.domain.Xbkj;
import com.jooq.domain.tables.records.FdProviderPhonalyzrRecord;

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
 * 通话分析表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class FdProviderPhonalyzr extends TableImpl<FdProviderPhonalyzrRecord> {

    private static final long serialVersionUID = 1464063666;

    /**
     * The reference instance of <code>xbkj.fd_provider_phonalyzr</code>
     */
    public static final FdProviderPhonalyzr FD_PROVIDER_PHONALYZR = new FdProviderPhonalyzr();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<FdProviderPhonalyzrRecord> getRecordType() {
        return FdProviderPhonalyzrRecord.class;
    }

    /**
     * The column <code>xbkj.fd_provider_phonalyzr.id</code>. 主键
     */
    public final TableField<FdProviderPhonalyzrRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).identity(true), this, "主键");

    /**
     * The column <code>xbkj.fd_provider_phonalyzr.account_id</code>. 账户id
     */
    public final TableField<FdProviderPhonalyzrRecord, Long> ACCOUNT_ID = createField("account_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "账户id");

    /**
     * The column <code>xbkj.fd_provider_phonalyzr.period</code>. 时间范围（1个月/3个月/6个月）
     */
    public final TableField<FdProviderPhonalyzrRecord, String> PERIOD = createField("period", org.jooq.impl.SQLDataType.VARCHAR(32), this, "时间范围（1个月/3个月/6个月）");

    /**
     * The column <code>xbkj.fd_provider_phonalyzr.call_number</code>. 对方号码数
     */
    public final TableField<FdProviderPhonalyzrRecord, String> CALL_NUMBER = createField("call_number", org.jooq.impl.SQLDataType.VARCHAR(32), this, "对方号码数");

    /**
     * The column <code>xbkj.fd_provider_phonalyzr.interphone_count</code>. 互通电话号码数
     */
    public final TableField<FdProviderPhonalyzrRecord, String> INTERPHONE_COUNT = createField("interphone_count", org.jooq.impl.SQLDataType.VARCHAR(32), this, "互通电话号码数");

    /**
     * The column <code>xbkj.fd_provider_phonalyzr.interphone_rate</code>. 互通电话号码占比
     */
    public final TableField<FdProviderPhonalyzrRecord, String> INTERPHONE_RATE = createField("interphone_rate", org.jooq.impl.SQLDataType.VARCHAR(32), this, "互通电话号码占比");

    /**
     * The column <code>xbkj.fd_provider_phonalyzr.calling_count</code>. 主叫对方号码数
     */
    public final TableField<FdProviderPhonalyzrRecord, String> CALLING_COUNT = createField("calling_count", org.jooq.impl.SQLDataType.VARCHAR(32), this, "主叫对方号码数");

    /**
     * The column <code>xbkj.fd_provider_phonalyzr.calling_rate</code>. 主叫对方号码占比
     */
    public final TableField<FdProviderPhonalyzrRecord, String> CALLING_RATE = createField("calling_rate", org.jooq.impl.SQLDataType.VARCHAR(32), this, "主叫对方号码占比");

    /**
     * The column <code>xbkj.fd_provider_phonalyzr.called_count</code>. 被叫对方号码数
     */
    public final TableField<FdProviderPhonalyzrRecord, String> CALLED_COUNT = createField("called_count", org.jooq.impl.SQLDataType.VARCHAR(32), this, "被叫对方号码数");

    /**
     * The column <code>xbkj.fd_provider_phonalyzr.called_rate</code>. 被叫对方号码占比
     */
    public final TableField<FdProviderPhonalyzrRecord, String> CALLED_RATE = createField("called_rate", org.jooq.impl.SQLDataType.VARCHAR(32), this, "被叫对方号码占比");

    /**
     * The column <code>xbkj.fd_provider_phonalyzr.count</code>. 通话总次数
     */
    public final TableField<FdProviderPhonalyzrRecord, String> COUNT = createField("count", org.jooq.impl.SQLDataType.VARCHAR(32), this, "通话总次数");

    /**
     * The column <code>xbkj.fd_provider_phonalyzr.morning_count</code>. 凌晨通话次数(00-06)
     */
    public final TableField<FdProviderPhonalyzrRecord, String> MORNING_COUNT = createField("morning_count", org.jooq.impl.SQLDataType.VARCHAR(32), this, "凌晨通话次数(00-06)");

    /**
     * The column <code>xbkj.fd_provider_phonalyzr.morning_call_rate</code>. 凌晨通话次数占比
     */
    public final TableField<FdProviderPhonalyzrRecord, String> MORNING_CALL_RATE = createField("morning_call_rate", org.jooq.impl.SQLDataType.VARCHAR(32), this, "凌晨通话次数占比");

    /**
     * The column <code>xbkj.fd_provider_phonalyzr.create_at</code>. 创建时间
     */
    public final TableField<FdProviderPhonalyzrRecord, Timestamp> CREATE_AT = createField("create_at", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "创建时间");

    /**
     * The column <code>xbkj.fd_provider_phonalyzr.update_at</code>. 更新时间
     */
    public final TableField<FdProviderPhonalyzrRecord, Timestamp> UPDATE_AT = createField("update_at", org.jooq.impl.SQLDataType.TIMESTAMP, this, "更新时间");

    /**
     * The column <code>xbkj.fd_provider_phonalyzr.del_flag</code>. 删除标志
     */
    public final TableField<FdProviderPhonalyzrRecord, Boolean> DEL_FLAG = createField("del_flag", org.jooq.impl.SQLDataType.BIT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("b'0'", org.jooq.impl.SQLDataType.BIT)), this, "删除标志");

    /**
     * The column <code>xbkj.fd_provider_phonalyzr.version</code>.
     */
    public final TableField<FdProviderPhonalyzrRecord, Long> VERSION = createField("version", org.jooq.impl.SQLDataType.BIGINT.defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * Create a <code>xbkj.fd_provider_phonalyzr</code> table reference
     */
    public FdProviderPhonalyzr() {
        this(DSL.name("fd_provider_phonalyzr"), null);
    }

    /**
     * Create an aliased <code>xbkj.fd_provider_phonalyzr</code> table reference
     */
    public FdProviderPhonalyzr(String alias) {
        this(DSL.name(alias), FD_PROVIDER_PHONALYZR);
    }

    /**
     * Create an aliased <code>xbkj.fd_provider_phonalyzr</code> table reference
     */
    public FdProviderPhonalyzr(Name alias) {
        this(alias, FD_PROVIDER_PHONALYZR);
    }

    private FdProviderPhonalyzr(Name alias, Table<FdProviderPhonalyzrRecord> aliased) {
        this(alias, aliased, null);
    }

    private FdProviderPhonalyzr(Name alias, Table<FdProviderPhonalyzrRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "通话分析表");
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
        return Arrays.<Index>asList(Indexes.FD_PROVIDER_PHONALYZR_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<FdProviderPhonalyzrRecord, Long> getIdentity() {
        return Keys.IDENTITY_FD_PROVIDER_PHONALYZR;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<FdProviderPhonalyzrRecord> getPrimaryKey() {
        return Keys.KEY_FD_PROVIDER_PHONALYZR_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<FdProviderPhonalyzrRecord>> getKeys() {
        return Arrays.<UniqueKey<FdProviderPhonalyzrRecord>>asList(Keys.KEY_FD_PROVIDER_PHONALYZR_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FdProviderPhonalyzr as(String alias) {
        return new FdProviderPhonalyzr(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FdProviderPhonalyzr as(Name alias) {
        return new FdProviderPhonalyzr(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public FdProviderPhonalyzr rename(String name) {
        return new FdProviderPhonalyzr(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public FdProviderPhonalyzr rename(Name name) {
        return new FdProviderPhonalyzr(name, null);
    }
}