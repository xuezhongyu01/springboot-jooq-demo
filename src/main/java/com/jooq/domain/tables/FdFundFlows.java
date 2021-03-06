/*
 * This file is generated by jOOQ.
*/
package com.jooq.domain.tables;


import com.jooq.domain.Indexes;
import com.jooq.domain.Keys;
import com.jooq.domain.Xbkj;
import com.jooq.domain.tables.records.FdFundFlowsRecord;

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
 * 公积金缴存流水
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class FdFundFlows extends TableImpl<FdFundFlowsRecord> {

    private static final long serialVersionUID = -363987463;

    /**
     * The reference instance of <code>xbkj.fd_fund_flows</code>
     */
    public static final FdFundFlows FD_FUND_FLOWS = new FdFundFlows();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<FdFundFlowsRecord> getRecordType() {
        return FdFundFlowsRecord.class;
    }

    /**
     * The column <code>xbkj.fd_fund_flows.id</code>.
     */
    public final TableField<FdFundFlowsRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>xbkj.fd_fund_flows.account_id</code>. 账户 ID
     */
    public final TableField<FdFundFlowsRecord, Long> ACCOUNT_ID = createField("account_id", org.jooq.impl.SQLDataType.BIGINT, this, "账户 ID");

    /**
     * The column <code>xbkj.fd_fund_flows.company</code>. 公司名称
     */
    public final TableField<FdFundFlowsRecord, String> COMPANY = createField("company", org.jooq.impl.SQLDataType.VARCHAR(64), this, "公司名称");

    /**
     * The column <code>xbkj.fd_fund_flows.record_date</code>. 操作日期
     */
    public final TableField<FdFundFlowsRecord, Timestamp> RECORD_DATE = createField("record_date", org.jooq.impl.SQLDataType.TIMESTAMP, this, "操作日期");

    /**
     * The column <code>xbkj.fd_fund_flows.type</code>. 操作类型
     */
    public final TableField<FdFundFlowsRecord, String> TYPE = createField("type", org.jooq.impl.SQLDataType.VARCHAR(64), this, "操作类型");

    /**
     * The column <code>xbkj.fd_fund_flows.record_month</code>. 缴纳月份
     */
    public final TableField<FdFundFlowsRecord, String> RECORD_MONTH = createField("record_month", org.jooq.impl.SQLDataType.VARCHAR(16), this, "缴纳月份");

    /**
     * The column <code>xbkj.fd_fund_flows.amount</code>. 发生金额
     */
    public final TableField<FdFundFlowsRecord, String> AMOUNT = createField("amount", org.jooq.impl.SQLDataType.VARCHAR(20), this, "发生金额");

    /**
     * The column <code>xbkj.fd_fund_flows.balance</code>. 余额
     */
    public final TableField<FdFundFlowsRecord, String> BALANCE = createField("balance", org.jooq.impl.SQLDataType.VARCHAR(20), this, "余额");

    /**
     * The column <code>xbkj.fd_fund_flows.fund_type</code>. 缴存类型(公积金 0,住房补贴 1)
     */
    public final TableField<FdFundFlowsRecord, Boolean> FUND_TYPE = createField("fund_type", org.jooq.impl.SQLDataType.BIT, this, "缴存类型(公积金 0,住房补贴 1)");

    /**
     * The column <code>xbkj.fd_fund_flows.create_at</code>. 创建时间
     */
    public final TableField<FdFundFlowsRecord, Timestamp> CREATE_AT = createField("create_at", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "创建时间");

    /**
     * The column <code>xbkj.fd_fund_flows.update_at</code>. 更新时间
     */
    public final TableField<FdFundFlowsRecord, Timestamp> UPDATE_AT = createField("update_at", org.jooq.impl.SQLDataType.TIMESTAMP, this, "更新时间");

    /**
     * The column <code>xbkj.fd_fund_flows.del_flag</code>. 删除标志
     */
    public final TableField<FdFundFlowsRecord, Boolean> DEL_FLAG = createField("del_flag", org.jooq.impl.SQLDataType.BIT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("b'0'", org.jooq.impl.SQLDataType.BIT)), this, "删除标志");

    /**
     * The column <code>xbkj.fd_fund_flows.version</code>.
     */
    public final TableField<FdFundFlowsRecord, Long> VERSION = createField("version", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * Create a <code>xbkj.fd_fund_flows</code> table reference
     */
    public FdFundFlows() {
        this(DSL.name("fd_fund_flows"), null);
    }

    /**
     * Create an aliased <code>xbkj.fd_fund_flows</code> table reference
     */
    public FdFundFlows(String alias) {
        this(DSL.name(alias), FD_FUND_FLOWS);
    }

    /**
     * Create an aliased <code>xbkj.fd_fund_flows</code> table reference
     */
    public FdFundFlows(Name alias) {
        this(alias, FD_FUND_FLOWS);
    }

    private FdFundFlows(Name alias, Table<FdFundFlowsRecord> aliased) {
        this(alias, aliased, null);
    }

    private FdFundFlows(Name alias, Table<FdFundFlowsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "公积金缴存流水");
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
        return Arrays.<Index>asList(Indexes.FD_FUND_FLOWS_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<FdFundFlowsRecord, Long> getIdentity() {
        return Keys.IDENTITY_FD_FUND_FLOWS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<FdFundFlowsRecord> getPrimaryKey() {
        return Keys.KEY_FD_FUND_FLOWS_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<FdFundFlowsRecord>> getKeys() {
        return Arrays.<UniqueKey<FdFundFlowsRecord>>asList(Keys.KEY_FD_FUND_FLOWS_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FdFundFlows as(String alias) {
        return new FdFundFlows(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FdFundFlows as(Name alias) {
        return new FdFundFlows(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public FdFundFlows rename(String name) {
        return new FdFundFlows(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public FdFundFlows rename(Name name) {
        return new FdFundFlows(name, null);
    }
}
