/*
 * This file is generated by jOOQ.
*/
package com.jooq.domain.tables;


import com.jooq.domain.Indexes;
import com.jooq.domain.Keys;
import com.jooq.domain.Xbkj;
import com.jooq.domain.enums.McCouponCouponType;
import com.jooq.domain.enums.McCouponSender;
import com.jooq.domain.enums.McCouponSourceType;
import com.jooq.domain.enums.McCouponStatus;
import com.jooq.domain.enums.McCouponUseConditionArea;
import com.jooq.domain.tables.records.McCouponRecord;

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
 * 优惠券
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class McCoupon extends TableImpl<McCouponRecord> {

    private static final long serialVersionUID = 227562574;

    /**
     * The reference instance of <code>xbkj.mc_coupon</code>
     */
    public static final McCoupon MC_COUPON = new McCoupon();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<McCouponRecord> getRecordType() {
        return McCouponRecord.class;
    }

    /**
     * The column <code>xbkj.mc_coupon.id</code>.
     */
    public final TableField<McCouponRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>xbkj.mc_coupon.member_id</code>. 持有人id
     */
    public final TableField<McCouponRecord, Long> MEMBER_ID = createField("member_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "持有人id");

    /**
     * The column <code>xbkj.mc_coupon.order_id</code>. 订单ID
     */
    public final TableField<McCouponRecord, Long> ORDER_ID = createField("order_id", org.jooq.impl.SQLDataType.BIGINT.defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.BIGINT)), this, "订单ID");

    /**
     * The column <code>xbkj.mc_coupon.coupon_code</code>. 优惠券编码
     */
    public final TableField<McCouponRecord, String> COUPON_CODE = createField("coupon_code", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "优惠券编码");

    /**
     * The column <code>xbkj.mc_coupon.name</code>. 优惠券名称
     */
    public final TableField<McCouponRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "优惠券名称");

    /**
     * The column <code>xbkj.mc_coupon.coupon_template_id</code>. 优惠券模板id
     */
    public final TableField<McCouponRecord, Long> COUPON_TEMPLATE_ID = createField("coupon_template_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.BIGINT)), this, "优惠券模板id");

    /**
     * The column <code>xbkj.mc_coupon.coupon_type</code>. 优惠券类型 1-抵价券 2-打折券 3-满减券 4-贴息券 5-免息券
     */
    public final TableField<McCouponRecord, McCouponCouponType> COUPON_TYPE = createField("coupon_type", org.jooq.impl.SQLDataType.VARCHAR(8).asEnumDataType(com.jooq.domain.enums.McCouponCouponType.class), this, "优惠券类型 1-抵价券 2-打折券 3-满减券 4-贴息券 5-免息券");

    /**
     * The column <code>xbkj.mc_coupon.use_greater_amount</code>. 使用条件大于金额
     */
    public final TableField<McCouponRecord, BigDecimal> USE_GREATER_AMOUNT = createField("use_greater_amount", org.jooq.impl.SQLDataType.DECIMAL(20, 2).nullable(false).defaultValue(org.jooq.impl.DSL.inline("0.00", org.jooq.impl.SQLDataType.DECIMAL)), this, "使用条件大于金额");

    /**
     * The column <code>xbkj.mc_coupon.use_condition_amount</code>. 满减劵-消费满的金额
     */
    public final TableField<McCouponRecord, BigDecimal> USE_CONDITION_AMOUNT = createField("use_condition_amount", org.jooq.impl.SQLDataType.DECIMAL(20, 2).nullable(false).defaultValue(org.jooq.impl.DSL.inline("0.00", org.jooq.impl.SQLDataType.DECIMAL)), this, "满减劵-消费满的金额");

    /**
     * The column <code>xbkj.mc_coupon.free_installment_num</code>. 免息分期期数
     */
    public final TableField<McCouponRecord, Integer> FREE_INSTALLMENT_NUM = createField("free_installment_num", org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "免息分期期数");

    /**
     * The column <code>xbkj.mc_coupon.amount</code>. 面额(抵价券，打折券=价格打折,贴息券则表示折扣率，免息券则表示利率=0)
     */
    public final TableField<McCouponRecord, BigDecimal> AMOUNT = createField("amount", org.jooq.impl.SQLDataType.DECIMAL(20, 2).nullable(false).defaultValue(org.jooq.impl.DSL.inline("0.00", org.jooq.impl.SQLDataType.DECIMAL)), this, "面额(抵价券，打折券=价格打折,贴息券则表示折扣率，免息券则表示利率=0)");

    /**
     * The column <code>xbkj.mc_coupon.start_date</code>. 券有效开始时间
     */
    public final TableField<McCouponRecord, Timestamp> START_DATE = createField("start_date", org.jooq.impl.SQLDataType.TIMESTAMP, this, "券有效开始时间");

    /**
     * The column <code>xbkj.mc_coupon.end_date</code>. 券有效结束时间
     */
    public final TableField<McCouponRecord, Timestamp> END_DATE = createField("end_date", org.jooq.impl.SQLDataType.TIMESTAMP, this, "券有效结束时间");

    /**
     * The column <code>xbkj.mc_coupon.use_condition_area</code>. 使用范围 培训机构、单店、课程 平台
     */
    public final TableField<McCouponRecord, McCouponUseConditionArea> USE_CONDITION_AREA = createField("use_condition_area", org.jooq.impl.SQLDataType.VARCHAR(12).asEnumDataType(com.jooq.domain.enums.McCouponUseConditionArea.class), this, "使用范围 培训机构、单店、课程 平台");

    /**
     * The column <code>xbkj.mc_coupon.use_condition</code>. 使用范围，培训机构ID数组，以英文逗号分隔, 单店ID数组，课程ID数组
     */
    public final TableField<McCouponRecord, String> USE_CONDITION = createField("use_condition", org.jooq.impl.SQLDataType.VARCHAR(5000), this, "使用范围，培训机构ID数组，以英文逗号分隔, 单店ID数组，课程ID数组");

    /**
     * The column <code>xbkj.mc_coupon.status</code>. 状态：未使用，已使用，使用中，过期，禁用
     */
    public final TableField<McCouponRecord, McCouponStatus> STATUS = createField("status", org.jooq.impl.SQLDataType.VARCHAR(10).nullable(false).asEnumDataType(com.jooq.domain.enums.McCouponStatus.class), this, "状态：未使用，已使用，使用中，过期，禁用");

    /**
     * The column <code>xbkj.mc_coupon.receive_time</code>. 领取时间
     */
    public final TableField<McCouponRecord, Timestamp> RECEIVE_TIME = createField("receive_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "领取时间");

    /**
     * The column <code>xbkj.mc_coupon.used_time</code>. 使用时间
     */
    public final TableField<McCouponRecord, Timestamp> USED_TIME = createField("used_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "使用时间");

    /**
     * The column <code>xbkj.mc_coupon.remarks</code>. 备注
     */
    public final TableField<McCouponRecord, String> REMARKS = createField("remarks", org.jooq.impl.SQLDataType.VARCHAR(255), this, "备注");

    /**
     * The column <code>xbkj.mc_coupon.sender</code>. 发放人 培训机构、单店、平台 
     */
    public final TableField<McCouponRecord, McCouponSender> SENDER = createField("sender", org.jooq.impl.SQLDataType.VARCHAR(12).asEnumDataType(com.jooq.domain.enums.McCouponSender.class), this, "发放人 培训机构、单店、平台 ");

    /**
     * The column <code>xbkj.mc_coupon.sender_id</code>. send_id 针对机构，门店，课程发放的id
     */
    public final TableField<McCouponRecord, Long> SENDER_ID = createField("sender_id", org.jooq.impl.SQLDataType.BIGINT.defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.BIGINT)), this, "send_id 针对机构，门店，课程发放的id");

    /**
     * The column <code>xbkj.mc_coupon.given_id</code>. 被分享人id
     */
    public final TableField<McCouponRecord, Long> GIVEN_ID = createField("given_id", org.jooq.impl.SQLDataType.BIGINT, this, "被分享人id");

    /**
     * The column <code>xbkj.mc_coupon.create_at</code>. 创建时间
     */
    public final TableField<McCouponRecord, Timestamp> CREATE_AT = createField("create_at", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "创建时间");

    /**
     * The column <code>xbkj.mc_coupon.update_at</code>. 更新时间
     */
    public final TableField<McCouponRecord, Timestamp> UPDATE_AT = createField("update_at", org.jooq.impl.SQLDataType.TIMESTAMP, this, "更新时间");

    /**
     * The column <code>xbkj.mc_coupon.del_flag</code>. 删除标志
     */
    public final TableField<McCouponRecord, Boolean> DEL_FLAG = createField("del_flag", org.jooq.impl.SQLDataType.BIT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("b'0'", org.jooq.impl.SQLDataType.BIT)), this, "删除标志");

    /**
     * The column <code>xbkj.mc_coupon.version</code>.
     */
    public final TableField<McCouponRecord, Long> VERSION = createField("version", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>xbkj.mc_coupon.can_shared</code>. 是否可分享,默认可分享
     */
    public final TableField<McCouponRecord, Boolean> CAN_SHARED = createField("can_shared", org.jooq.impl.SQLDataType.BIT.defaultValue(org.jooq.impl.DSL.inline("b'1'", org.jooq.impl.SQLDataType.BIT)), this, "是否可分享,默认可分享");

    /**
     * The column <code>xbkj.mc_coupon.source_type</code>. 优惠卷来源类型:下订单，试听课
     */
    public final TableField<McCouponRecord, McCouponSourceType> SOURCE_TYPE = createField("source_type", org.jooq.impl.SQLDataType.VARCHAR(8).asEnumDataType(com.jooq.domain.enums.McCouponSourceType.class), this, "优惠卷来源类型:下订单，试听课");

    /**
     * The column <code>xbkj.mc_coupon.source_id</code>. 来源id
     */
    public final TableField<McCouponRecord, Long> SOURCE_ID = createField("source_id", org.jooq.impl.SQLDataType.BIGINT.defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.BIGINT)), this, "来源id");

    /**
     * Create a <code>xbkj.mc_coupon</code> table reference
     */
    public McCoupon() {
        this(DSL.name("mc_coupon"), null);
    }

    /**
     * Create an aliased <code>xbkj.mc_coupon</code> table reference
     */
    public McCoupon(String alias) {
        this(DSL.name(alias), MC_COUPON);
    }

    /**
     * Create an aliased <code>xbkj.mc_coupon</code> table reference
     */
    public McCoupon(Name alias) {
        this(alias, MC_COUPON);
    }

    private McCoupon(Name alias, Table<McCouponRecord> aliased) {
        this(alias, aliased, null);
    }

    private McCoupon(Name alias, Table<McCouponRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "优惠券");
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
        return Arrays.<Index>asList(Indexes.MC_COUPON_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<McCouponRecord, Long> getIdentity() {
        return Keys.IDENTITY_MC_COUPON;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<McCouponRecord> getPrimaryKey() {
        return Keys.KEY_MC_COUPON_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<McCouponRecord>> getKeys() {
        return Arrays.<UniqueKey<McCouponRecord>>asList(Keys.KEY_MC_COUPON_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public McCoupon as(String alias) {
        return new McCoupon(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public McCoupon as(Name alias) {
        return new McCoupon(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public McCoupon rename(String name) {
        return new McCoupon(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public McCoupon rename(Name name) {
        return new McCoupon(name, null);
    }
}
