/*
 * This file is generated by jOOQ.
*/
package com.jooq.domain.tables;


import com.jooq.domain.Indexes;
import com.jooq.domain.Keys;
import com.jooq.domain.Xbkj;
import com.jooq.domain.tables.records.FdProviderCalledClassifyRecord;

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
public class FdProviderCalledClassify extends TableImpl<FdProviderCalledClassifyRecord> {

    private static final long serialVersionUID = -448725201;

    /**
     * The reference instance of <code>xbkj.fd_provider_called_classify</code>
     */
    public static final FdProviderCalledClassify FD_PROVIDER_CALLED_CLASSIFY = new FdProviderCalledClassify();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<FdProviderCalledClassifyRecord> getRecordType() {
        return FdProviderCalledClassifyRecord.class;
    }

    /**
     * The column <code>xbkj.fd_provider_called_classify.id</code>. 主键
     */
    public final TableField<FdProviderCalledClassifyRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).identity(true), this, "主键");

    /**
     * The column <code>xbkj.fd_provider_called_classify.account_id</code>. 账户id
     */
    public final TableField<FdProviderCalledClassifyRecord, Long> ACCOUNT_ID = createField("account_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "账户id");

    /**
     * The column <code>xbkj.fd_provider_called_classify.name</code>. 分类名称
     */
    public final TableField<FdProviderCalledClassifyRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR(32), this, "分类名称");

    /**
     * The column <code>xbkj.fd_provider_called_classify.count</code>. 不同号码数量
     */
    public final TableField<FdProviderCalledClassifyRecord, String> COUNT = createField("count", org.jooq.impl.SQLDataType.VARCHAR(32), this, "不同号码数量");

    /**
     * The column <code>xbkj.fd_provider_called_classify.num</code>. 总通话次数
     */
    public final TableField<FdProviderCalledClassifyRecord, String> NUM = createField("num", org.jooq.impl.SQLDataType.VARCHAR(32), this, "总通话次数");

    /**
     * The column <code>xbkj.fd_provider_called_classify.rate</code>. 通话占比
     */
    public final TableField<FdProviderCalledClassifyRecord, String> RATE = createField("rate", org.jooq.impl.SQLDataType.VARCHAR(32), this, "通话占比");

    /**
     * The column <code>xbkj.fd_provider_called_classify.time</code>. 总通话时长
     */
    public final TableField<FdProviderCalledClassifyRecord, String> TIME = createField("time", org.jooq.impl.SQLDataType.VARCHAR(32), this, "总通话时长");

    /**
     * The column <code>xbkj.fd_provider_called_classify.time_rate</code>. 通话时长占比
     */
    public final TableField<FdProviderCalledClassifyRecord, String> TIME_RATE = createField("time_rate", org.jooq.impl.SQLDataType.VARCHAR(32), this, "通话时长占比");

    /**
     * The column <code>xbkj.fd_provider_called_classify.create_at</code>. 创建时间
     */
    public final TableField<FdProviderCalledClassifyRecord, Timestamp> CREATE_AT = createField("create_at", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "创建时间");

    /**
     * The column <code>xbkj.fd_provider_called_classify.update_at</code>. 更新时间
     */
    public final TableField<FdProviderCalledClassifyRecord, Timestamp> UPDATE_AT = createField("update_at", org.jooq.impl.SQLDataType.TIMESTAMP, this, "更新时间");

    /**
     * The column <code>xbkj.fd_provider_called_classify.del_flag</code>. 删除标志
     */
    public final TableField<FdProviderCalledClassifyRecord, Boolean> DEL_FLAG = createField("del_flag", org.jooq.impl.SQLDataType.BIT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("b'0'", org.jooq.impl.SQLDataType.BIT)), this, "删除标志");

    /**
     * The column <code>xbkj.fd_provider_called_classify.version</code>.
     */
    public final TableField<FdProviderCalledClassifyRecord, Long> VERSION = createField("version", org.jooq.impl.SQLDataType.BIGINT.defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * Create a <code>xbkj.fd_provider_called_classify</code> table reference
     */
    public FdProviderCalledClassify() {
        this(DSL.name("fd_provider_called_classify"), null);
    }

    /**
     * Create an aliased <code>xbkj.fd_provider_called_classify</code> table reference
     */
    public FdProviderCalledClassify(String alias) {
        this(DSL.name(alias), FD_PROVIDER_CALLED_CLASSIFY);
    }

    /**
     * Create an aliased <code>xbkj.fd_provider_called_classify</code> table reference
     */
    public FdProviderCalledClassify(Name alias) {
        this(alias, FD_PROVIDER_CALLED_CLASSIFY);
    }

    private FdProviderCalledClassify(Name alias, Table<FdProviderCalledClassifyRecord> aliased) {
        this(alias, aliased, null);
    }

    private FdProviderCalledClassify(Name alias, Table<FdProviderCalledClassifyRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "被叫对方号码归属地分布表");
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
        return Arrays.<Index>asList(Indexes.FD_PROVIDER_CALLED_CLASSIFY_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<FdProviderCalledClassifyRecord, Long> getIdentity() {
        return Keys.IDENTITY_FD_PROVIDER_CALLED_CLASSIFY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<FdProviderCalledClassifyRecord> getPrimaryKey() {
        return Keys.KEY_FD_PROVIDER_CALLED_CLASSIFY_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<FdProviderCalledClassifyRecord>> getKeys() {
        return Arrays.<UniqueKey<FdProviderCalledClassifyRecord>>asList(Keys.KEY_FD_PROVIDER_CALLED_CLASSIFY_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FdProviderCalledClassify as(String alias) {
        return new FdProviderCalledClassify(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FdProviderCalledClassify as(Name alias) {
        return new FdProviderCalledClassify(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public FdProviderCalledClassify rename(String name) {
        return new FdProviderCalledClassify(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public FdProviderCalledClassify rename(Name name) {
        return new FdProviderCalledClassify(name, null);
    }
}
