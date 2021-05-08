/*
 * This file is generated by jOOQ.
*/
package com.jooq.domain.tables;


import com.jooq.domain.Indexes;
import com.jooq.domain.Keys;
import com.jooq.domain.Xbkj;
import com.jooq.domain.enums.YeepayPayOrderPayStatus;
import com.jooq.domain.enums.YeepayPayOrderPayType;
import com.jooq.domain.tables.records.YeepayPayOrderRecord;

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
 * 易宝支付表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class YeepayPayOrder extends TableImpl<YeepayPayOrderRecord> {

    private static final long serialVersionUID = -96724382;

    /**
     * The reference instance of <code>xbkj.yeepay_pay_order</code>
     */
    public static final YeepayPayOrder YEEPAY_PAY_ORDER = new YeepayPayOrder();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<YeepayPayOrderRecord> getRecordType() {
        return YeepayPayOrderRecord.class;
    }

    /**
     * The column <code>xbkj.yeepay_pay_order.id</code>.
     */
    public final TableField<YeepayPayOrderRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>xbkj.yeepay_pay_order.identityid</code>. 用户标识
     */
    public final TableField<YeepayPayOrderRecord, String> IDENTITYID = createField("identityid", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "用户标识");

    /**
     * The column <code>xbkj.yeepay_pay_order.uc_member_id</code>.
     */
    public final TableField<YeepayPayOrderRecord, Long> UC_MEMBER_ID = createField("uc_member_id", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>xbkj.yeepay_pay_order.requestno</code>. 还款请求号
     */
    public final TableField<YeepayPayOrderRecord, String> REQUESTNO = createField("requestno", org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "还款请求号");

    /**
     * The column <code>xbkj.yeepay_pay_order.h5directpaytype</code>. 支付直连类型
     */
    public final TableField<YeepayPayOrderRecord, String> H5DIRECTPAYTYPE = createField("h5directpaytype", org.jooq.impl.SQLDataType.VARCHAR(255), this, "支付直连类型");

    /**
     * The column <code>xbkj.yeepay_pay_order.uc_bank_id</code>. 银行卡ID
     */
    public final TableField<YeepayPayOrderRecord, Long> UC_BANK_ID = createField("uc_bank_id", org.jooq.impl.SQLDataType.BIGINT, this, "银行卡ID");

    /**
     * The column <code>xbkj.yeepay_pay_order.productname</code>.
     */
    public final TableField<YeepayPayOrderRecord, String> PRODUCTNAME = createField("productname", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>xbkj.yeepay_pay_order.amount</code>. 还款金额
     */
    public final TableField<YeepayPayOrderRecord, String> AMOUNT = createField("amount", org.jooq.impl.SQLDataType.VARCHAR(255), this, "还款金额");

    /**
     * The column <code>xbkj.yeepay_pay_order.dividejstr</code>. 分账信息
     */
    public final TableField<YeepayPayOrderRecord, String> DIVIDEJSTR = createField("dividejstr", org.jooq.impl.SQLDataType.VARCHAR(255), this, "分账信息");

    /**
     * The column <code>xbkj.yeepay_pay_order.pay_type</code>. 待还的本息ids
     */
    public final TableField<YeepayPayOrderRecord, YeepayPayOrderPayType> PAY_TYPE = createField("pay_type", org.jooq.impl.SQLDataType.VARCHAR(8).asEnumDataType(com.jooq.domain.enums.YeepayPayOrderPayType.class), this, "待还的本息ids");

    /**
     * The column <code>xbkj.yeepay_pay_order.pay_status</code>. 未付，支付中，已经支付
     */
    public final TableField<YeepayPayOrderRecord, YeepayPayOrderPayStatus> PAY_STATUS = createField("pay_status", org.jooq.impl.SQLDataType.VARCHAR(6).nullable(false).defaultValue(org.jooq.impl.DSL.inline("unpay", org.jooq.impl.SQLDataType.VARCHAR)).asEnumDataType(com.jooq.domain.enums.YeepayPayOrderPayStatus.class), this, "未付，支付中，已经支付");

    /**
     * The column <code>xbkj.yeepay_pay_order.sourceIds</code>. 待还的本息ids
     */
    public final TableField<YeepayPayOrderRecord, String> SOURCEIDS = createField("sourceIds", org.jooq.impl.SQLDataType.VARCHAR(5000), this, "待还的本息ids");

    /**
     * The column <code>xbkj.yeepay_pay_order.extinfos</code>. 扩展信息
     */
    public final TableField<YeepayPayOrderRecord, String> EXTINFOS = createField("extinfos", org.jooq.impl.SQLDataType.VARCHAR(5000), this, "扩展信息");

    /**
     * The column <code>xbkj.yeepay_pay_order.remark</code>. 备注
     */
    public final TableField<YeepayPayOrderRecord, String> REMARK = createField("remark", org.jooq.impl.SQLDataType.VARCHAR(5000), this, "备注");

    /**
     * The column <code>xbkj.yeepay_pay_order.create_at</code>. 创建时间
     */
    public final TableField<YeepayPayOrderRecord, Timestamp> CREATE_AT = createField("create_at", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "创建时间");

    /**
     * The column <code>xbkj.yeepay_pay_order.update_at</code>. 更新时间
     */
    public final TableField<YeepayPayOrderRecord, Timestamp> UPDATE_AT = createField("update_at", org.jooq.impl.SQLDataType.TIMESTAMP, this, "更新时间");

    /**
     * The column <code>xbkj.yeepay_pay_order.del_flag</code>. 删除标志
     */
    public final TableField<YeepayPayOrderRecord, Boolean> DEL_FLAG = createField("del_flag", org.jooq.impl.SQLDataType.BIT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("b'0'", org.jooq.impl.SQLDataType.BIT)), this, "删除标志");

    /**
     * The column <code>xbkj.yeepay_pay_order.version</code>.
     */
    public final TableField<YeepayPayOrderRecord, Long> VERSION = createField("version", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * Create a <code>xbkj.yeepay_pay_order</code> table reference
     */
    public YeepayPayOrder() {
        this(DSL.name("yeepay_pay_order"), null);
    }

    /**
     * Create an aliased <code>xbkj.yeepay_pay_order</code> table reference
     */
    public YeepayPayOrder(String alias) {
        this(DSL.name(alias), YEEPAY_PAY_ORDER);
    }

    /**
     * Create an aliased <code>xbkj.yeepay_pay_order</code> table reference
     */
    public YeepayPayOrder(Name alias) {
        this(alias, YEEPAY_PAY_ORDER);
    }

    private YeepayPayOrder(Name alias, Table<YeepayPayOrderRecord> aliased) {
        this(alias, aliased, null);
    }

    private YeepayPayOrder(Name alias, Table<YeepayPayOrderRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "易宝支付表");
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
        return Arrays.<Index>asList(Indexes.YEEPAY_PAY_ORDER_PRIMARY, Indexes.YEEPAY_PAY_ORDER_UNIQUE_NO);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<YeepayPayOrderRecord, Long> getIdentity() {
        return Keys.IDENTITY_YEEPAY_PAY_ORDER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<YeepayPayOrderRecord> getPrimaryKey() {
        return Keys.KEY_YEEPAY_PAY_ORDER_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<YeepayPayOrderRecord>> getKeys() {
        return Arrays.<UniqueKey<YeepayPayOrderRecord>>asList(Keys.KEY_YEEPAY_PAY_ORDER_PRIMARY, Keys.KEY_YEEPAY_PAY_ORDER_UNIQUE_NO);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public YeepayPayOrder as(String alias) {
        return new YeepayPayOrder(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public YeepayPayOrder as(Name alias) {
        return new YeepayPayOrder(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public YeepayPayOrder rename(String name) {
        return new YeepayPayOrder(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public YeepayPayOrder rename(Name name) {
        return new YeepayPayOrder(name, null);
    }
}