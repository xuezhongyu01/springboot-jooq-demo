/*
 * This file is generated by jOOQ.
*/
package com.jooq.domain.tables;


import com.jooq.domain.Indexes;
import com.jooq.domain.Keys;
import com.jooq.domain.Xbkj;
import com.jooq.domain.tables.records.FdEbusinessFlowsRecord;

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
 * 电商流水
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class FdEbusinessFlows extends TableImpl<FdEbusinessFlowsRecord> {

    private static final long serialVersionUID = 1845739064;

    /**
     * The reference instance of <code>xbkj.fd_ebusiness_flows</code>
     */
    public static final FdEbusinessFlows FD_EBUSINESS_FLOWS = new FdEbusinessFlows();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<FdEbusinessFlowsRecord> getRecordType() {
        return FdEbusinessFlowsRecord.class;
    }

    /**
     * The column <code>xbkj.fd_ebusiness_flows.id</code>.
     */
    public final TableField<FdEbusinessFlowsRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>xbkj.fd_ebusiness_flows.account_id</code>. 账户ID
     */
    public final TableField<FdEbusinessFlowsRecord, Long> ACCOUNT_ID = createField("account_id", org.jooq.impl.SQLDataType.BIGINT, this, "账户ID");

    /**
     * The column <code>xbkj.fd_ebusiness_flows.order_num</code>. 订单编号
     */
    public final TableField<FdEbusinessFlowsRecord, String> ORDER_NUM = createField("order_num", org.jooq.impl.SQLDataType.VARCHAR(128), this, "订单编号");

    /**
     * The column <code>xbkj.fd_ebusiness_flows.settle_date</code>. 交易时间
     */
    public final TableField<FdEbusinessFlowsRecord, Timestamp> SETTLE_DATE = createField("settle_date", org.jooq.impl.SQLDataType.TIMESTAMP, this, "交易时间");

    /**
     * The column <code>xbkj.fd_ebusiness_flows.settle_amount</code>. 交易额
     */
    public final TableField<FdEbusinessFlowsRecord, Long> SETTLE_AMOUNT = createField("settle_amount", org.jooq.impl.SQLDataType.BIGINT, this, "交易额");

    /**
     * The column <code>xbkj.fd_ebusiness_flows.shop_name</code>. 商户名称
     */
    public final TableField<FdEbusinessFlowsRecord, String> SHOP_NAME = createField("shop_name", org.jooq.impl.SQLDataType.VARCHAR(128), this, "商户名称");

    /**
     * The column <code>xbkj.fd_ebusiness_flows.status</code>. 订单状态
     */
    public final TableField<FdEbusinessFlowsRecord, String> STATUS = createField("status", org.jooq.impl.SQLDataType.VARCHAR(64), this, "订单状态");

    /**
     * The column <code>xbkj.fd_ebusiness_flows.trade_description</code>. 交易描述
     */
    public final TableField<FdEbusinessFlowsRecord, String> TRADE_DESCRIPTION = createField("trade_description", org.jooq.impl.SQLDataType.VARCHAR(256), this, "交易描述");

    /**
     * The column <code>xbkj.fd_ebusiness_flows.name</code>. 收货人姓名
     */
    public final TableField<FdEbusinessFlowsRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR(32), this, "收货人姓名");

    /**
     * The column <code>xbkj.fd_ebusiness_flows.phone</code>. 收货人电话
     */
    public final TableField<FdEbusinessFlowsRecord, String> PHONE = createField("phone", org.jooq.impl.SQLDataType.VARCHAR(32), this, "收货人电话");

    /**
     * The column <code>xbkj.fd_ebusiness_flows.address_area</code>. 所在区域
     */
    public final TableField<FdEbusinessFlowsRecord, String> ADDRESS_AREA = createField("address_area", org.jooq.impl.SQLDataType.VARCHAR(64), this, "所在区域");

    /**
     * The column <code>xbkj.fd_ebusiness_flows.address_detail</code>. 详细地址
     */
    public final TableField<FdEbusinessFlowsRecord, String> ADDRESS_DETAIL = createField("address_detail", org.jooq.impl.SQLDataType.VARCHAR(64), this, "详细地址");

    /**
     * The column <code>xbkj.fd_ebusiness_flows.postcode</code>. 邮编
     */
    public final TableField<FdEbusinessFlowsRecord, String> POSTCODE = createField("postcode", org.jooq.impl.SQLDataType.VARCHAR(16), this, "邮编");

    /**
     * The column <code>xbkj.fd_ebusiness_flows.payment_mode</code>. 支付方式
     */
    public final TableField<FdEbusinessFlowsRecord, String> PAYMENT_MODE = createField("payment_mode", org.jooq.impl.SQLDataType.VARCHAR(32), this, "支付方式");

    /**
     * The column <code>xbkj.fd_ebusiness_flows.create_at</code>. 创建时间
     */
    public final TableField<FdEbusinessFlowsRecord, Timestamp> CREATE_AT = createField("create_at", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "创建时间");

    /**
     * The column <code>xbkj.fd_ebusiness_flows.update_at</code>. 更新时间
     */
    public final TableField<FdEbusinessFlowsRecord, Timestamp> UPDATE_AT = createField("update_at", org.jooq.impl.SQLDataType.TIMESTAMP, this, "更新时间");

    /**
     * The column <code>xbkj.fd_ebusiness_flows.del_flag</code>. 删除标志
     */
    public final TableField<FdEbusinessFlowsRecord, Boolean> DEL_FLAG = createField("del_flag", org.jooq.impl.SQLDataType.BIT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("b'0'", org.jooq.impl.SQLDataType.BIT)), this, "删除标志");

    /**
     * The column <code>xbkj.fd_ebusiness_flows.version</code>.
     */
    public final TableField<FdEbusinessFlowsRecord, Long> VERSION = createField("version", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * Create a <code>xbkj.fd_ebusiness_flows</code> table reference
     */
    public FdEbusinessFlows() {
        this(DSL.name("fd_ebusiness_flows"), null);
    }

    /**
     * Create an aliased <code>xbkj.fd_ebusiness_flows</code> table reference
     */
    public FdEbusinessFlows(String alias) {
        this(DSL.name(alias), FD_EBUSINESS_FLOWS);
    }

    /**
     * Create an aliased <code>xbkj.fd_ebusiness_flows</code> table reference
     */
    public FdEbusinessFlows(Name alias) {
        this(alias, FD_EBUSINESS_FLOWS);
    }

    private FdEbusinessFlows(Name alias, Table<FdEbusinessFlowsRecord> aliased) {
        this(alias, aliased, null);
    }

    private FdEbusinessFlows(Name alias, Table<FdEbusinessFlowsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "电商流水");
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
        return Arrays.<Index>asList(Indexes.FD_EBUSINESS_FLOWS_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<FdEbusinessFlowsRecord, Long> getIdentity() {
        return Keys.IDENTITY_FD_EBUSINESS_FLOWS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<FdEbusinessFlowsRecord> getPrimaryKey() {
        return Keys.KEY_FD_EBUSINESS_FLOWS_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<FdEbusinessFlowsRecord>> getKeys() {
        return Arrays.<UniqueKey<FdEbusinessFlowsRecord>>asList(Keys.KEY_FD_EBUSINESS_FLOWS_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FdEbusinessFlows as(String alias) {
        return new FdEbusinessFlows(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FdEbusinessFlows as(Name alias) {
        return new FdEbusinessFlows(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public FdEbusinessFlows rename(String name) {
        return new FdEbusinessFlows(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public FdEbusinessFlows rename(Name name) {
        return new FdEbusinessFlows(name, null);
    }
}