/*
 * This file is generated by jOOQ.
*/
package com.jooq.domain.tables;


import com.jooq.domain.Indexes;
import com.jooq.domain.Keys;
import com.jooq.domain.Xbkj;
import com.jooq.domain.tables.records.FdReportEbusinessConsumeRecordsRecord;

import java.math.BigDecimal;
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
 * 电商数据报告消费情况
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class FdReportEbusinessConsumeRecords extends TableImpl<FdReportEbusinessConsumeRecordsRecord> {

    private static final long serialVersionUID = 1925781835;

    /**
     * The reference instance of <code>xbkj.fd_report_ebusiness_consume_records</code>
     */
    public static final FdReportEbusinessConsumeRecords FD_REPORT_EBUSINESS_CONSUME_RECORDS = new FdReportEbusinessConsumeRecords();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<FdReportEbusinessConsumeRecordsRecord> getRecordType() {
        return FdReportEbusinessConsumeRecordsRecord.class;
    }

    /**
     * The column <code>xbkj.fd_report_ebusiness_consume_records.id</code>.
     */
    public final TableField<FdReportEbusinessConsumeRecordsRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>xbkj.fd_report_ebusiness_consume_records.report_ebusiness_id</code>.
     */
    public final TableField<FdReportEbusinessConsumeRecordsRecord, Long> REPORT_EBUSINESS_ID = createField("report_ebusiness_id", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>xbkj.fd_report_ebusiness_consume_records.month</code>. 月份("YYYY-MM")
     */
    public final TableField<FdReportEbusinessConsumeRecordsRecord, String> MONTH = createField("month", org.jooq.impl.SQLDataType.VARCHAR(128).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "月份(\"YYYY-MM\")");

    /**
     * The column <code>xbkj.fd_report_ebusiness_consume_records.count</code>. 笔数
     */
    public final TableField<FdReportEbusinessConsumeRecordsRecord, Long> COUNT = createField("count", org.jooq.impl.SQLDataType.BIGINT, this, "笔数");

    /**
     * The column <code>xbkj.fd_report_ebusiness_consume_records.amount</code>. 金额(分)
     */
    public final TableField<FdReportEbusinessConsumeRecordsRecord, BigDecimal> AMOUNT = createField("amount", org.jooq.impl.SQLDataType.DECIMAL(20, 2), this, "金额(分)");

    /**
     * The column <code>xbkj.fd_report_ebusiness_consume_records.create_at</code>. 创建时间
     */
    public final TableField<FdReportEbusinessConsumeRecordsRecord, Timestamp> CREATE_AT = createField("create_at", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "创建时间");

    /**
     * The column <code>xbkj.fd_report_ebusiness_consume_records.update_at</code>. 更新时间
     */
    public final TableField<FdReportEbusinessConsumeRecordsRecord, Timestamp> UPDATE_AT = createField("update_at", org.jooq.impl.SQLDataType.TIMESTAMP, this, "更新时间");

    /**
     * The column <code>xbkj.fd_report_ebusiness_consume_records.del_flag</code>. 删除标志
     */
    public final TableField<FdReportEbusinessConsumeRecordsRecord, Boolean> DEL_FLAG = createField("del_flag", org.jooq.impl.SQLDataType.BIT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("b'0'", org.jooq.impl.SQLDataType.BIT)), this, "删除标志");

    /**
     * The column <code>xbkj.fd_report_ebusiness_consume_records.version</code>.
     */
    public final TableField<FdReportEbusinessConsumeRecordsRecord, Long> VERSION = createField("version", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * Create a <code>xbkj.fd_report_ebusiness_consume_records</code> table reference
     */
    public FdReportEbusinessConsumeRecords() {
        this(DSL.name("fd_report_ebusiness_consume_records"), null);
    }

    /**
     * Create an aliased <code>xbkj.fd_report_ebusiness_consume_records</code> table reference
     */
    public FdReportEbusinessConsumeRecords(String alias) {
        this(DSL.name(alias), FD_REPORT_EBUSINESS_CONSUME_RECORDS);
    }

    /**
     * Create an aliased <code>xbkj.fd_report_ebusiness_consume_records</code> table reference
     */
    public FdReportEbusinessConsumeRecords(Name alias) {
        this(alias, FD_REPORT_EBUSINESS_CONSUME_RECORDS);
    }

    private FdReportEbusinessConsumeRecords(Name alias, Table<FdReportEbusinessConsumeRecordsRecord> aliased) {
        this(alias, aliased, null);
    }

    private FdReportEbusinessConsumeRecords(Name alias, Table<FdReportEbusinessConsumeRecordsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "电商数据报告消费情况");
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
        return Arrays.<Index>asList(Indexes.FD_REPORT_EBUSINESS_CONSUME_RECORDS_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<FdReportEbusinessConsumeRecordsRecord, Long> getIdentity() {
        return Keys.IDENTITY_FD_REPORT_EBUSINESS_CONSUME_RECORDS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<FdReportEbusinessConsumeRecordsRecord> getPrimaryKey() {
        return Keys.KEY_FD_REPORT_EBUSINESS_CONSUME_RECORDS_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<FdReportEbusinessConsumeRecordsRecord>> getKeys() {
        return Arrays.<UniqueKey<FdReportEbusinessConsumeRecordsRecord>>asList(Keys.KEY_FD_REPORT_EBUSINESS_CONSUME_RECORDS_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FdReportEbusinessConsumeRecords as(String alias) {
        return new FdReportEbusinessConsumeRecords(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FdReportEbusinessConsumeRecords as(Name alias) {
        return new FdReportEbusinessConsumeRecords(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public FdReportEbusinessConsumeRecords rename(String name) {
        return new FdReportEbusinessConsumeRecords(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public FdReportEbusinessConsumeRecords rename(Name name) {
        return new FdReportEbusinessConsumeRecords(name, null);
    }
}
