/*
 * This file is generated by jOOQ.
*/
package com.jooq.domain.tables;


import com.jooq.domain.Indexes;
import com.jooq.domain.Keys;
import com.jooq.domain.Xbkj;
import com.jooq.domain.tables.records.FdEbusinessPositionFixedRecord;

import java.math.BigDecimal;
import java.sql.Date;
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
 * 电商泛金融定期持仓
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class FdEbusinessPositionFixed extends TableImpl<FdEbusinessPositionFixedRecord> {

    private static final long serialVersionUID = -409317379;

    /**
     * The reference instance of <code>xbkj.fd_ebusiness_position_fixed</code>
     */
    public static final FdEbusinessPositionFixed FD_EBUSINESS_POSITION_FIXED = new FdEbusinessPositionFixed();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<FdEbusinessPositionFixedRecord> getRecordType() {
        return FdEbusinessPositionFixedRecord.class;
    }

    /**
     * The column <code>xbkj.fd_ebusiness_position_fixed.id</code>.
     */
    public final TableField<FdEbusinessPositionFixedRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>xbkj.fd_ebusiness_position_fixed.account_id</code>. 账户ID
     */
    public final TableField<FdEbusinessPositionFixedRecord, Long> ACCOUNT_ID = createField("account_id", org.jooq.impl.SQLDataType.BIGINT, this, "账户ID");

    /**
     * The column <code>xbkj.fd_ebusiness_position_fixed.code</code>. 产品代码
     */
    public final TableField<FdEbusinessPositionFixedRecord, String> CODE = createField("code", org.jooq.impl.SQLDataType.VARCHAR(64), this, "产品代码");

    /**
     * The column <code>xbkj.fd_ebusiness_position_fixed.name</code>. 产品名称
     */
    public final TableField<FdEbusinessPositionFixedRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR(32), this, "产品名称");

    /**
     * The column <code>xbkj.fd_ebusiness_position_fixed.status</code>. 状态
     */
    public final TableField<FdEbusinessPositionFixedRecord, String> STATUS = createField("status", org.jooq.impl.SQLDataType.VARCHAR(64), this, "状态");

    /**
     * The column <code>xbkj.fd_ebusiness_position_fixed.currency</code>. 币种
     */
    public final TableField<FdEbusinessPositionFixedRecord, String> CURRENCY = createField("currency", org.jooq.impl.SQLDataType.VARCHAR(16), this, "币种");

    /**
     * The column <code>xbkj.fd_ebusiness_position_fixed.start_date</code>. 开始日期
     */
    public final TableField<FdEbusinessPositionFixedRecord, Date> START_DATE = createField("start_date", org.jooq.impl.SQLDataType.DATE, this, "开始日期");

    /**
     * The column <code>xbkj.fd_ebusiness_position_fixed.end_date</code>. 到期日期
     */
    public final TableField<FdEbusinessPositionFixedRecord, Date> END_DATE = createField("end_date", org.jooq.impl.SQLDataType.DATE, this, "到期日期");

    /**
     * The column <code>xbkj.fd_ebusiness_position_fixed.capital</code>. 本金
     */
    public final TableField<FdEbusinessPositionFixedRecord, Long> CAPITAL = createField("capital", org.jooq.impl.SQLDataType.BIGINT, this, "本金");

    /**
     * The column <code>xbkj.fd_ebusiness_position_fixed.interest</code>. 利息
     */
    public final TableField<FdEbusinessPositionFixedRecord, Long> INTEREST = createField("interest", org.jooq.impl.SQLDataType.BIGINT, this, "利息");

    /**
     * The column <code>xbkj.fd_ebusiness_position_fixed.amount</code>. 本息总额
     */
    public final TableField<FdEbusinessPositionFixedRecord, Long> AMOUNT = createField("amount", org.jooq.impl.SQLDataType.BIGINT, this, "本息总额");

    /**
     * The column <code>xbkj.fd_ebusiness_position_fixed.interest_rate</code>. 利率
     */
    public final TableField<FdEbusinessPositionFixedRecord, BigDecimal> INTEREST_RATE = createField("interest_rate", org.jooq.impl.SQLDataType.DECIMAL(20, 2), this, "利率");

    /**
     * The column <code>xbkj.fd_ebusiness_position_fixed.term</code>. 存期
     */
    public final TableField<FdEbusinessPositionFixedRecord, String> TERM = createField("term", org.jooq.impl.SQLDataType.VARCHAR(32), this, "存期");

    /**
     * The column <code>xbkj.fd_ebusiness_position_fixed.automatic_redeposit</code>. 自动转存
     */
    public final TableField<FdEbusinessPositionFixedRecord, String> AUTOMATIC_REDEPOSIT = createField("automatic_redeposit", org.jooq.impl.SQLDataType.VARCHAR(32), this, "自动转存");

    /**
     * The column <code>xbkj.fd_ebusiness_position_fixed.create_at</code>. 创建时间
     */
    public final TableField<FdEbusinessPositionFixedRecord, Timestamp> CREATE_AT = createField("create_at", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "创建时间");

    /**
     * The column <code>xbkj.fd_ebusiness_position_fixed.update_at</code>. 更新时间
     */
    public final TableField<FdEbusinessPositionFixedRecord, Timestamp> UPDATE_AT = createField("update_at", org.jooq.impl.SQLDataType.TIMESTAMP, this, "更新时间");

    /**
     * The column <code>xbkj.fd_ebusiness_position_fixed.del_flag</code>. 删除标志
     */
    public final TableField<FdEbusinessPositionFixedRecord, Boolean> DEL_FLAG = createField("del_flag", org.jooq.impl.SQLDataType.BIT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("b'0'", org.jooq.impl.SQLDataType.BIT)), this, "删除标志");

    /**
     * The column <code>xbkj.fd_ebusiness_position_fixed.version</code>.
     */
    public final TableField<FdEbusinessPositionFixedRecord, Long> VERSION = createField("version", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * Create a <code>xbkj.fd_ebusiness_position_fixed</code> table reference
     */
    public FdEbusinessPositionFixed() {
        this(DSL.name("fd_ebusiness_position_fixed"), null);
    }

    /**
     * Create an aliased <code>xbkj.fd_ebusiness_position_fixed</code> table reference
     */
    public FdEbusinessPositionFixed(String alias) {
        this(DSL.name(alias), FD_EBUSINESS_POSITION_FIXED);
    }

    /**
     * Create an aliased <code>xbkj.fd_ebusiness_position_fixed</code> table reference
     */
    public FdEbusinessPositionFixed(Name alias) {
        this(alias, FD_EBUSINESS_POSITION_FIXED);
    }

    private FdEbusinessPositionFixed(Name alias, Table<FdEbusinessPositionFixedRecord> aliased) {
        this(alias, aliased, null);
    }

    private FdEbusinessPositionFixed(Name alias, Table<FdEbusinessPositionFixedRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "电商泛金融定期持仓");
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
        return Arrays.<Index>asList(Indexes.FD_EBUSINESS_POSITION_FIXED_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<FdEbusinessPositionFixedRecord, Long> getIdentity() {
        return Keys.IDENTITY_FD_EBUSINESS_POSITION_FIXED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<FdEbusinessPositionFixedRecord> getPrimaryKey() {
        return Keys.KEY_FD_EBUSINESS_POSITION_FIXED_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<FdEbusinessPositionFixedRecord>> getKeys() {
        return Arrays.<UniqueKey<FdEbusinessPositionFixedRecord>>asList(Keys.KEY_FD_EBUSINESS_POSITION_FIXED_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FdEbusinessPositionFixed as(String alias) {
        return new FdEbusinessPositionFixed(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FdEbusinessPositionFixed as(Name alias) {
        return new FdEbusinessPositionFixed(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public FdEbusinessPositionFixed rename(String name) {
        return new FdEbusinessPositionFixed(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public FdEbusinessPositionFixed rename(Name name) {
        return new FdEbusinessPositionFixed(name, null);
    }
}
