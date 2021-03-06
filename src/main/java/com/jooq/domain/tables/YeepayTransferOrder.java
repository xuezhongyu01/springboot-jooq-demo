/*
 * This file is generated by jOOQ.
*/
package com.jooq.domain.tables;


import com.jooq.domain.Indexes;
import com.jooq.domain.Keys;
import com.jooq.domain.Xbkj;
import com.jooq.domain.enums.YeepayTransferOrderPayStatus;
import com.jooq.domain.tables.records.YeepayTransferOrderRecord;

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
public class YeepayTransferOrder extends TableImpl<YeepayTransferOrderRecord> {

    private static final long serialVersionUID = 137948885;

    /**
     * The reference instance of <code>xbkj.yeepay_transfer_order</code>
     */
    public static final YeepayTransferOrder YEEPAY_TRANSFER_ORDER = new YeepayTransferOrder();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<YeepayTransferOrderRecord> getRecordType() {
        return YeepayTransferOrderRecord.class;
    }

    /**
     * The column <code>xbkj.yeepay_transfer_order.id</code>.
     */
    public final TableField<YeepayTransferOrderRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>xbkj.yeepay_transfer_order.mer_id</code>. 交易商户编号
     */
    public final TableField<YeepayTransferOrderRecord, String> MER_ID = createField("mer_id", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "交易商户编号");

    /**
     * The column <code>xbkj.yeepay_transfer_order.batch_no</code>. 打款批次号
     */
    public final TableField<YeepayTransferOrderRecord, String> BATCH_NO = createField("batch_no", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "打款批次号");

    /**
     * The column <code>xbkj.yeepay_transfer_order.order_id</code>. 订单号
     */
    public final TableField<YeepayTransferOrderRecord, String> ORDER_ID = createField("order_id", org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "订单号");

    /**
     * The column <code>xbkj.yeepay_transfer_order.bank_code</code>. 收款银行编 号
     */
    public final TableField<YeepayTransferOrderRecord, String> BANK_CODE = createField("bank_code", org.jooq.impl.SQLDataType.VARCHAR(255), this, "收款银行编 号");

    /**
     * The column <code>xbkj.yeepay_transfer_order.cnaps</code>. 联行号
     */
    public final TableField<YeepayTransferOrderRecord, String> CNAPS = createField("cnaps", org.jooq.impl.SQLDataType.VARCHAR(255), this, "联行号");

    /**
     * The column <code>xbkj.yeepay_transfer_order.bank_name</code>. 收款银行全 称
     */
    public final TableField<YeepayTransferOrderRecord, String> BANK_NAME = createField("bank_name", org.jooq.impl.SQLDataType.VARCHAR(255), this, "收款银行全 称");

    /**
     * The column <code>xbkj.yeepay_transfer_order.amount</code>. 金额
     */
    public final TableField<YeepayTransferOrderRecord, String> AMOUNT = createField("amount", org.jooq.impl.SQLDataType.VARCHAR(255), this, "金额");

    /**
     * The column <code>xbkj.yeepay_transfer_order.account_name</code>. 帐户名称
     */
    public final TableField<YeepayTransferOrderRecord, String> ACCOUNT_NAME = createField("account_name", org.jooq.impl.SQLDataType.VARCHAR(255), this, "帐户名称");

    /**
     * The column <code>xbkj.yeepay_transfer_order.account_number</code>. 帐户号
     */
    public final TableField<YeepayTransferOrderRecord, String> ACCOUNT_NUMBER = createField("account_number", org.jooq.impl.SQLDataType.VARCHAR(255), this, "帐户号");

    /**
     * The column <code>xbkj.yeepay_transfer_order.fee_type</code>. 手续费收取 方式  取值:“SOURCE” 商户承担 “TARGET”用户承担
     */
    public final TableField<YeepayTransferOrderRecord, String> FEE_TYPE = createField("fee_type", org.jooq.impl.SQLDataType.VARCHAR(255), this, "手续费收取 方式  取值:“SOURCE” 商户承担 “TARGET”用户承担");

    /**
     * The column <code>xbkj.yeepay_transfer_order.payee_mobile</code>. 收款人手机 号
     */
    public final TableField<YeepayTransferOrderRecord, String> PAYEE_MOBILE = createField("payee_mobile", org.jooq.impl.SQLDataType.VARCHAR(255), this, "收款人手机 号");

    /**
     * The column <code>xbkj.yeepay_transfer_order.abstract_info</code>. 摘要
     */
    public final TableField<YeepayTransferOrderRecord, String> ABSTRACT_INFO = createField("abstract_info", org.jooq.impl.SQLDataType.VARCHAR(255), this, "摘要");

    /**
     * The column <code>xbkj.yeepay_transfer_order.remarks_info</code>. 备注
     */
    public final TableField<YeepayTransferOrderRecord, String> REMARKS_INFO = createField("remarks_info", org.jooq.impl.SQLDataType.VARCHAR(255), this, "备注");

    /**
     * The column <code>xbkj.yeepay_transfer_order.leave_word</code>. 留言
     */
    public final TableField<YeepayTransferOrderRecord, String> LEAVE_WORD = createField("leave_word", org.jooq.impl.SQLDataType.VARCHAR(255), this, "留言");

    /**
     * The column <code>xbkj.yeepay_transfer_order.urgency</code>. 加急
     */
    public final TableField<YeepayTransferOrderRecord, String> URGENCY = createField("urgency", org.jooq.impl.SQLDataType.VARCHAR(255), this, "加急");

    /**
     * The column <code>xbkj.yeepay_transfer_order.remark</code>. 备注
     */
    public final TableField<YeepayTransferOrderRecord, String> REMARK = createField("remark", org.jooq.impl.SQLDataType.VARCHAR(255), this, "备注");

    /**
     * The column <code>xbkj.yeepay_transfer_order.create_at</code>. 创建时间
     */
    public final TableField<YeepayTransferOrderRecord, Timestamp> CREATE_AT = createField("create_at", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "创建时间");

    /**
     * The column <code>xbkj.yeepay_transfer_order.update_at</code>. 更新时间
     */
    public final TableField<YeepayTransferOrderRecord, Timestamp> UPDATE_AT = createField("update_at", org.jooq.impl.SQLDataType.TIMESTAMP, this, "更新时间");

    /**
     * The column <code>xbkj.yeepay_transfer_order.version</code>.
     */
    public final TableField<YeepayTransferOrderRecord, Long> VERSION = createField("version", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>xbkj.yeepay_transfer_order.del_flag</code>.
     */
    public final TableField<YeepayTransferOrderRecord, Boolean> DEL_FLAG = createField("del_flag", org.jooq.impl.SQLDataType.BIT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("b'0'", org.jooq.impl.SQLDataType.BIT)), this, "");

    /**
     * The column <code>xbkj.yeepay_transfer_order.plat_form_flag</code>. 是否平台
     */
    public final TableField<YeepayTransferOrderRecord, Boolean> PLAT_FORM_FLAG = createField("plat_form_flag", org.jooq.impl.SQLDataType.BIT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("b'0'", org.jooq.impl.SQLDataType.BIT)), this, "是否平台");

    /**
     * The column <code>xbkj.yeepay_transfer_order.pay_status</code>.
     */
    public final TableField<YeepayTransferOrderRecord, YeepayTransferOrderPayStatus> PAY_STATUS = createField("pay_status", org.jooq.impl.SQLDataType.VARCHAR(6).nullable(false).defaultValue(org.jooq.impl.DSL.inline("unpay", org.jooq.impl.SQLDataType.VARCHAR)).asEnumDataType(com.jooq.domain.enums.YeepayTransferOrderPayStatus.class), this, "");

    /**
     * The column <code>xbkj.yeepay_transfer_order.tc_order_ids</code>. 订单ID
     */
    public final TableField<YeepayTransferOrderRecord, String> TC_ORDER_IDS = createField("tc_order_ids", org.jooq.impl.SQLDataType.CLOB, this, "订单ID");

    /**
     * The column <code>xbkj.yeepay_transfer_order.tc_order_interest_ids</code>. 订单本息ids
     */
    public final TableField<YeepayTransferOrderRecord, String> TC_ORDER_INTEREST_IDS = createField("tc_order_interest_ids", org.jooq.impl.SQLDataType.CLOB, this, "订单本息ids");

    /**
     * Create a <code>xbkj.yeepay_transfer_order</code> table reference
     */
    public YeepayTransferOrder() {
        this(DSL.name("yeepay_transfer_order"), null);
    }

    /**
     * Create an aliased <code>xbkj.yeepay_transfer_order</code> table reference
     */
    public YeepayTransferOrder(String alias) {
        this(DSL.name(alias), YEEPAY_TRANSFER_ORDER);
    }

    /**
     * Create an aliased <code>xbkj.yeepay_transfer_order</code> table reference
     */
    public YeepayTransferOrder(Name alias) {
        this(alias, YEEPAY_TRANSFER_ORDER);
    }

    private YeepayTransferOrder(Name alias, Table<YeepayTransferOrderRecord> aliased) {
        this(alias, aliased, null);
    }

    private YeepayTransferOrder(Name alias, Table<YeepayTransferOrderRecord> aliased, Field<?>[] parameters) {
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
        return Arrays.<Index>asList(Indexes.YEEPAY_TRANSFER_ORDER_PRIMARY, Indexes.YEEPAY_TRANSFER_ORDER_UNIQUE_NO);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<YeepayTransferOrderRecord, Long> getIdentity() {
        return Keys.IDENTITY_YEEPAY_TRANSFER_ORDER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<YeepayTransferOrderRecord> getPrimaryKey() {
        return Keys.KEY_YEEPAY_TRANSFER_ORDER_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<YeepayTransferOrderRecord>> getKeys() {
        return Arrays.<UniqueKey<YeepayTransferOrderRecord>>asList(Keys.KEY_YEEPAY_TRANSFER_ORDER_PRIMARY, Keys.KEY_YEEPAY_TRANSFER_ORDER_UNIQUE_NO);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public YeepayTransferOrder as(String alias) {
        return new YeepayTransferOrder(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public YeepayTransferOrder as(Name alias) {
        return new YeepayTransferOrder(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public YeepayTransferOrder rename(String name) {
        return new YeepayTransferOrder(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public YeepayTransferOrder rename(Name name) {
        return new YeepayTransferOrder(name, null);
    }
}
