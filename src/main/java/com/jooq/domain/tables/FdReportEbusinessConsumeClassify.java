/*
 * This file is generated by jOOQ.
*/
package com.jooq.domain.tables;


import com.jooq.domain.Indexes;
import com.jooq.domain.Keys;
import com.jooq.domain.Xbkj;
import com.jooq.domain.tables.records.FdReportEbusinessConsumeClassifyRecord;

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
 * 电商数据报告消费分类
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class FdReportEbusinessConsumeClassify extends TableImpl<FdReportEbusinessConsumeClassifyRecord> {

    private static final long serialVersionUID = -317191802;

    /**
     * The reference instance of <code>xbkj.fd_report_ebusiness_consume_classify</code>
     */
    public static final FdReportEbusinessConsumeClassify FD_REPORT_EBUSINESS_CONSUME_CLASSIFY = new FdReportEbusinessConsumeClassify();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<FdReportEbusinessConsumeClassifyRecord> getRecordType() {
        return FdReportEbusinessConsumeClassifyRecord.class;
    }

    /**
     * The column <code>xbkj.fd_report_ebusiness_consume_classify.id</code>.
     */
    public final TableField<FdReportEbusinessConsumeClassifyRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>xbkj.fd_report_ebusiness_consume_classify.report_ebusiness_id</code>.
     */
    public final TableField<FdReportEbusinessConsumeClassifyRecord, Long> REPORT_EBUSINESS_ID = createField("report_ebusiness_id", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>xbkj.fd_report_ebusiness_consume_classify.classify_name</code>. 分类名称
     */
    public final TableField<FdReportEbusinessConsumeClassifyRecord, String> CLASSIFY_NAME = createField("classify_name", org.jooq.impl.SQLDataType.VARCHAR(128), this, "分类名称");

    /**
     * The column <code>xbkj.fd_report_ebusiness_consume_classify.amount</code>. 消费总金额(分)
     */
    public final TableField<FdReportEbusinessConsumeClassifyRecord, BigDecimal> AMOUNT = createField("amount", org.jooq.impl.SQLDataType.DECIMAL(20, 2), this, "消费总金额(分)");

    /**
     * The column <code>xbkj.fd_report_ebusiness_consume_classify.count</code>. 消费总笔数
     */
    public final TableField<FdReportEbusinessConsumeClassifyRecord, Long> COUNT = createField("count", org.jooq.impl.SQLDataType.BIGINT, this, "消费总笔数");

    /**
     * The column <code>xbkj.fd_report_ebusiness_consume_classify.create_at</code>. 创建时间
     */
    public final TableField<FdReportEbusinessConsumeClassifyRecord, Timestamp> CREATE_AT = createField("create_at", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "创建时间");

    /**
     * The column <code>xbkj.fd_report_ebusiness_consume_classify.update_at</code>. 更新时间
     */
    public final TableField<FdReportEbusinessConsumeClassifyRecord, Timestamp> UPDATE_AT = createField("update_at", org.jooq.impl.SQLDataType.TIMESTAMP, this, "更新时间");

    /**
     * The column <code>xbkj.fd_report_ebusiness_consume_classify.del_flag</code>. 删除标志
     */
    public final TableField<FdReportEbusinessConsumeClassifyRecord, Boolean> DEL_FLAG = createField("del_flag", org.jooq.impl.SQLDataType.BIT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("b'0'", org.jooq.impl.SQLDataType.BIT)), this, "删除标志");

    /**
     * The column <code>xbkj.fd_report_ebusiness_consume_classify.version</code>.
     */
    public final TableField<FdReportEbusinessConsumeClassifyRecord, Long> VERSION = createField("version", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * Create a <code>xbkj.fd_report_ebusiness_consume_classify</code> table reference
     */
    public FdReportEbusinessConsumeClassify() {
        this(DSL.name("fd_report_ebusiness_consume_classify"), null);
    }

    /**
     * Create an aliased <code>xbkj.fd_report_ebusiness_consume_classify</code> table reference
     */
    public FdReportEbusinessConsumeClassify(String alias) {
        this(DSL.name(alias), FD_REPORT_EBUSINESS_CONSUME_CLASSIFY);
    }

    /**
     * Create an aliased <code>xbkj.fd_report_ebusiness_consume_classify</code> table reference
     */
    public FdReportEbusinessConsumeClassify(Name alias) {
        this(alias, FD_REPORT_EBUSINESS_CONSUME_CLASSIFY);
    }

    private FdReportEbusinessConsumeClassify(Name alias, Table<FdReportEbusinessConsumeClassifyRecord> aliased) {
        this(alias, aliased, null);
    }

    private FdReportEbusinessConsumeClassify(Name alias, Table<FdReportEbusinessConsumeClassifyRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "电商数据报告消费分类");
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
        return Arrays.<Index>asList(Indexes.FD_REPORT_EBUSINESS_CONSUME_CLASSIFY_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<FdReportEbusinessConsumeClassifyRecord, Long> getIdentity() {
        return Keys.IDENTITY_FD_REPORT_EBUSINESS_CONSUME_CLASSIFY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<FdReportEbusinessConsumeClassifyRecord> getPrimaryKey() {
        return Keys.KEY_FD_REPORT_EBUSINESS_CONSUME_CLASSIFY_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<FdReportEbusinessConsumeClassifyRecord>> getKeys() {
        return Arrays.<UniqueKey<FdReportEbusinessConsumeClassifyRecord>>asList(Keys.KEY_FD_REPORT_EBUSINESS_CONSUME_CLASSIFY_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FdReportEbusinessConsumeClassify as(String alias) {
        return new FdReportEbusinessConsumeClassify(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FdReportEbusinessConsumeClassify as(Name alias) {
        return new FdReportEbusinessConsumeClassify(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public FdReportEbusinessConsumeClassify rename(String name) {
        return new FdReportEbusinessConsumeClassify(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public FdReportEbusinessConsumeClassify rename(Name name) {
        return new FdReportEbusinessConsumeClassify(name, null);
    }
}
