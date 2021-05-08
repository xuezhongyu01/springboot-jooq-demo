/*
 * This file is generated by jOOQ.
*/
package com.jooq.domain.tables;


import com.jooq.domain.Indexes;
import com.jooq.domain.Keys;
import com.jooq.domain.Xbkj;
import com.jooq.domain.tables.records.FdProviderConsumeRecordsRecord;

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
 * 月消费记录表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class FdProviderConsumeRecords extends TableImpl<FdProviderConsumeRecordsRecord> {

    private static final long serialVersionUID = 1500038862;

    /**
     * The reference instance of <code>xbkj.fd_provider_consume_records</code>
     */
    public static final FdProviderConsumeRecords FD_PROVIDER_CONSUME_RECORDS = new FdProviderConsumeRecords();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<FdProviderConsumeRecordsRecord> getRecordType() {
        return FdProviderConsumeRecordsRecord.class;
    }

    /**
     * The column <code>xbkj.fd_provider_consume_records.id</code>. 主键
     */
    public final TableField<FdProviderConsumeRecordsRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).identity(true), this, "主键");

    /**
     * The column <code>xbkj.fd_provider_consume_records.account_id</code>. 账户id
     */
    public final TableField<FdProviderConsumeRecordsRecord, Long> ACCOUNT_ID = createField("account_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "账户id");

    /**
     * The column <code>xbkj.fd_provider_consume_records.month</code>. 月份("YYYY-MM")
     */
    public final TableField<FdProviderConsumeRecordsRecord, Timestamp> MONTH = createField("month", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "月份(\"YYYY-MM\")");

    /**
     * The column <code>xbkj.fd_provider_consume_records.amount</code>. 金额(分)
     */
    public final TableField<FdProviderConsumeRecordsRecord, Long> AMOUNT = createField("amount", org.jooq.impl.SQLDataType.BIGINT, this, "金额(分)");

    /**
     * The column <code>xbkj.fd_provider_consume_records.is_exceed_plan</code>. 是否超出套餐
     */
    public final TableField<FdProviderConsumeRecordsRecord, String> IS_EXCEED_PLAN = createField("is_exceed_plan", org.jooq.impl.SQLDataType.VARCHAR(32), this, "是否超出套餐");

    /**
     * The column <code>xbkj.fd_provider_consume_records.exceed_plan_rate</code>. 超出金额占比
     */
    public final TableField<FdProviderConsumeRecordsRecord, String> EXCEED_PLAN_RATE = createField("exceed_plan_rate", org.jooq.impl.SQLDataType.VARCHAR(32), this, "超出金额占比");

    /**
     * The column <code>xbkj.fd_provider_consume_records.is_remission</code>. 是否费用减免
     */
    public final TableField<FdProviderConsumeRecordsRecord, String> IS_REMISSION = createField("is_remission", org.jooq.impl.SQLDataType.VARCHAR(32), this, "是否费用减免");

    /**
     * The column <code>xbkj.fd_provider_consume_records.remission_rate</code>. 费用减免金额占比
     */
    public final TableField<FdProviderConsumeRecordsRecord, String> REMISSION_RATE = createField("remission_rate", org.jooq.impl.SQLDataType.VARCHAR(32), this, "费用减免金额占比");

    /**
     * The column <code>xbkj.fd_provider_consume_records.create_at</code>. 创建时间
     */
    public final TableField<FdProviderConsumeRecordsRecord, Timestamp> CREATE_AT = createField("create_at", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "创建时间");

    /**
     * The column <code>xbkj.fd_provider_consume_records.update_at</code>. 更新时间
     */
    public final TableField<FdProviderConsumeRecordsRecord, Timestamp> UPDATE_AT = createField("update_at", org.jooq.impl.SQLDataType.TIMESTAMP, this, "更新时间");

    /**
     * The column <code>xbkj.fd_provider_consume_records.del_flag</code>. 删除标志
     */
    public final TableField<FdProviderConsumeRecordsRecord, Boolean> DEL_FLAG = createField("del_flag", org.jooq.impl.SQLDataType.BIT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("b'0'", org.jooq.impl.SQLDataType.BIT)), this, "删除标志");

    /**
     * The column <code>xbkj.fd_provider_consume_records.version</code>.
     */
    public final TableField<FdProviderConsumeRecordsRecord, Long> VERSION = createField("version", org.jooq.impl.SQLDataType.BIGINT.defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * Create a <code>xbkj.fd_provider_consume_records</code> table reference
     */
    public FdProviderConsumeRecords() {
        this(DSL.name("fd_provider_consume_records"), null);
    }

    /**
     * Create an aliased <code>xbkj.fd_provider_consume_records</code> table reference
     */
    public FdProviderConsumeRecords(String alias) {
        this(DSL.name(alias), FD_PROVIDER_CONSUME_RECORDS);
    }

    /**
     * Create an aliased <code>xbkj.fd_provider_consume_records</code> table reference
     */
    public FdProviderConsumeRecords(Name alias) {
        this(alias, FD_PROVIDER_CONSUME_RECORDS);
    }

    private FdProviderConsumeRecords(Name alias, Table<FdProviderConsumeRecordsRecord> aliased) {
        this(alias, aliased, null);
    }

    private FdProviderConsumeRecords(Name alias, Table<FdProviderConsumeRecordsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "月消费记录表");
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
        return Arrays.<Index>asList(Indexes.FD_PROVIDER_CONSUME_RECORDS_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<FdProviderConsumeRecordsRecord, Long> getIdentity() {
        return Keys.IDENTITY_FD_PROVIDER_CONSUME_RECORDS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<FdProviderConsumeRecordsRecord> getPrimaryKey() {
        return Keys.KEY_FD_PROVIDER_CONSUME_RECORDS_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<FdProviderConsumeRecordsRecord>> getKeys() {
        return Arrays.<UniqueKey<FdProviderConsumeRecordsRecord>>asList(Keys.KEY_FD_PROVIDER_CONSUME_RECORDS_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FdProviderConsumeRecords as(String alias) {
        return new FdProviderConsumeRecords(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FdProviderConsumeRecords as(Name alias) {
        return new FdProviderConsumeRecords(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public FdProviderConsumeRecords rename(String name) {
        return new FdProviderConsumeRecords(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public FdProviderConsumeRecords rename(Name name) {
        return new FdProviderConsumeRecords(name, null);
    }
}