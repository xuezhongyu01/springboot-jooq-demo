/*
 * This file is generated by jOOQ.
*/
package com.jooq.domain.tables;


import com.jooq.domain.Indexes;
import com.jooq.domain.Keys;
import com.jooq.domain.Xbkj;
import com.jooq.domain.tables.records.FdReportEbusinessUnusualTransRecord;

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
 * 电商数据报告异常交易
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class FdReportEbusinessUnusualTrans extends TableImpl<FdReportEbusinessUnusualTransRecord> {

    private static final long serialVersionUID = 1667944190;

    /**
     * The reference instance of <code>xbkj.fd_report_ebusiness_unusual_trans</code>
     */
    public static final FdReportEbusinessUnusualTrans FD_REPORT_EBUSINESS_UNUSUAL_TRANS = new FdReportEbusinessUnusualTrans();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<FdReportEbusinessUnusualTransRecord> getRecordType() {
        return FdReportEbusinessUnusualTransRecord.class;
    }

    /**
     * The column <code>xbkj.fd_report_ebusiness_unusual_trans.id</code>.
     */
    public final TableField<FdReportEbusinessUnusualTransRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>xbkj.fd_report_ebusiness_unusual_trans.report_ebusiness_id</code>.
     */
    public final TableField<FdReportEbusinessUnusualTransRecord, Long> REPORT_EBUSINESS_ID = createField("report_ebusiness_id", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>xbkj.fd_report_ebusiness_unusual_trans.classify_name</code>. 消费分类
     */
    public final TableField<FdReportEbusinessUnusualTransRecord, String> CLASSIFY_NAME = createField("classify_name", org.jooq.impl.SQLDataType.VARCHAR(64), this, "消费分类");

    /**
     * The column <code>xbkj.fd_report_ebusiness_unusual_trans.trans_date</code>. 交易时间(YYYY-MM-DD hh:mm:ss)
     */
    public final TableField<FdReportEbusinessUnusualTransRecord, Timestamp> TRANS_DATE = createField("trans_date", org.jooq.impl.SQLDataType.TIMESTAMP, this, "交易时间(YYYY-MM-DD hh:mm:ss)");

    /**
     * The column <code>xbkj.fd_report_ebusiness_unusual_trans.trans_amount</code>. 交易金额(分)
     */
    public final TableField<FdReportEbusinessUnusualTransRecord, BigDecimal> TRANS_AMOUNT = createField("trans_amount", org.jooq.impl.SQLDataType.DECIMAL(20, 2), this, "交易金额(分)");

    /**
     * The column <code>xbkj.fd_report_ebusiness_unusual_trans.trans_detail</code>. 交易描述
     */
    public final TableField<FdReportEbusinessUnusualTransRecord, String> TRANS_DETAIL = createField("trans_detail", org.jooq.impl.SQLDataType.VARCHAR(128), this, "交易描述");

    /**
     * The column <code>xbkj.fd_report_ebusiness_unusual_trans.create_at</code>. 创建时间
     */
    public final TableField<FdReportEbusinessUnusualTransRecord, Timestamp> CREATE_AT = createField("create_at", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "创建时间");

    /**
     * The column <code>xbkj.fd_report_ebusiness_unusual_trans.update_at</code>. 更新时间
     */
    public final TableField<FdReportEbusinessUnusualTransRecord, Timestamp> UPDATE_AT = createField("update_at", org.jooq.impl.SQLDataType.TIMESTAMP, this, "更新时间");

    /**
     * The column <code>xbkj.fd_report_ebusiness_unusual_trans.del_flag</code>. 删除标志
     */
    public final TableField<FdReportEbusinessUnusualTransRecord, Boolean> DEL_FLAG = createField("del_flag", org.jooq.impl.SQLDataType.BIT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("b'0'", org.jooq.impl.SQLDataType.BIT)), this, "删除标志");

    /**
     * The column <code>xbkj.fd_report_ebusiness_unusual_trans.version</code>.
     */
    public final TableField<FdReportEbusinessUnusualTransRecord, Long> VERSION = createField("version", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * Create a <code>xbkj.fd_report_ebusiness_unusual_trans</code> table reference
     */
    public FdReportEbusinessUnusualTrans() {
        this(DSL.name("fd_report_ebusiness_unusual_trans"), null);
    }

    /**
     * Create an aliased <code>xbkj.fd_report_ebusiness_unusual_trans</code> table reference
     */
    public FdReportEbusinessUnusualTrans(String alias) {
        this(DSL.name(alias), FD_REPORT_EBUSINESS_UNUSUAL_TRANS);
    }

    /**
     * Create an aliased <code>xbkj.fd_report_ebusiness_unusual_trans</code> table reference
     */
    public FdReportEbusinessUnusualTrans(Name alias) {
        this(alias, FD_REPORT_EBUSINESS_UNUSUAL_TRANS);
    }

    private FdReportEbusinessUnusualTrans(Name alias, Table<FdReportEbusinessUnusualTransRecord> aliased) {
        this(alias, aliased, null);
    }

    private FdReportEbusinessUnusualTrans(Name alias, Table<FdReportEbusinessUnusualTransRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "电商数据报告异常交易");
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
        return Arrays.<Index>asList(Indexes.FD_REPORT_EBUSINESS_UNUSUAL_TRANS_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<FdReportEbusinessUnusualTransRecord, Long> getIdentity() {
        return Keys.IDENTITY_FD_REPORT_EBUSINESS_UNUSUAL_TRANS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<FdReportEbusinessUnusualTransRecord> getPrimaryKey() {
        return Keys.KEY_FD_REPORT_EBUSINESS_UNUSUAL_TRANS_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<FdReportEbusinessUnusualTransRecord>> getKeys() {
        return Arrays.<UniqueKey<FdReportEbusinessUnusualTransRecord>>asList(Keys.KEY_FD_REPORT_EBUSINESS_UNUSUAL_TRANS_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FdReportEbusinessUnusualTrans as(String alias) {
        return new FdReportEbusinessUnusualTrans(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FdReportEbusinessUnusualTrans as(Name alias) {
        return new FdReportEbusinessUnusualTrans(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public FdReportEbusinessUnusualTrans rename(String name) {
        return new FdReportEbusinessUnusualTrans(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public FdReportEbusinessUnusualTrans rename(Name name) {
        return new FdReportEbusinessUnusualTrans(name, null);
    }
}
