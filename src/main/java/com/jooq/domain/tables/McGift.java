/*
 * This file is generated by jOOQ.
*/
package com.jooq.domain.tables;


import com.jooq.domain.Indexes;
import com.jooq.domain.Keys;
import com.jooq.domain.Xbkj;
import com.jooq.domain.enums.McGiftDeliver;
import com.jooq.domain.enums.McGiftDrawCondition;
import com.jooq.domain.enums.McGiftSender;
import com.jooq.domain.enums.McGiftStatus;
import com.jooq.domain.tables.records.McGiftRecord;

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
 * 礼品记录
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class McGift extends TableImpl<McGiftRecord> {

    private static final long serialVersionUID = -488695570;

    /**
     * The reference instance of <code>xbkj.mc_gift</code>
     */
    public static final McGift MC_GIFT = new McGift();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<McGiftRecord> getRecordType() {
        return McGiftRecord.class;
    }

    /**
     * The column <code>xbkj.mc_gift.id</code>.
     */
    public final TableField<McGiftRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>xbkj.mc_gift.member_id</code>. 持有人id
     */
    public final TableField<McGiftRecord, Long> MEMBER_ID = createField("member_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "持有人id");

    /**
     * The column <code>xbkj.mc_gift.gift_template_id</code>. 优惠券模板id
     */
    public final TableField<McGiftRecord, Long> GIFT_TEMPLATE_ID = createField("gift_template_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.BIGINT)), this, "优惠券模板id");

    /**
     * The column <code>xbkj.mc_gift.amount</code>. 面额(抵价券，打折券=价格打折,贴息券则表示折扣率，免息券则表示利率=0)
     */
    public final TableField<McGiftRecord, BigDecimal> AMOUNT = createField("amount", org.jooq.impl.SQLDataType.DECIMAL(20, 2).nullable(false).defaultValue(org.jooq.impl.DSL.inline("0.00", org.jooq.impl.SQLDataType.DECIMAL)), this, "面额(抵价券，打折券=价格打折,贴息券则表示折扣率，免息券则表示利率=0)");

    /**
     * The column <code>xbkj.mc_gift.status</code>. 状态：未使用，已使用，使用中，过期，禁用
     */
    public final TableField<McGiftRecord, McGiftStatus> STATUS = createField("status", org.jooq.impl.SQLDataType.VARCHAR(10).nullable(false).defaultValue(org.jooq.impl.DSL.inline("un_receive", org.jooq.impl.SQLDataType.VARCHAR)).asEnumDataType(com.jooq.domain.enums.McGiftStatus.class), this, "状态：未使用，已使用，使用中，过期，禁用");

    /**
     * The column <code>xbkj.mc_gift.draw_condition</code>. 发送渠道，任意消费，单笔消费大于等于,报名试听课,首次消费
     */
    public final TableField<McGiftRecord, McGiftDrawCondition> DRAW_CONDITION = createField("draw_condition", org.jooq.impl.SQLDataType.VARCHAR(14).asEnumDataType(com.jooq.domain.enums.McGiftDrawCondition.class), this, "发送渠道，任意消费，单笔消费大于等于,报名试听课,首次消费");

    /**
     * The column <code>xbkj.mc_gift.source_id</code>. 发送渠道是消费， 记录订单id，如果是试听课，记录试听课id
     */
    public final TableField<McGiftRecord, Long> SOURCE_ID = createField("source_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "发送渠道是消费， 记录订单id，如果是试听课，记录试听课id");

    /**
     * The column <code>xbkj.mc_gift.receive_time</code>. 领取时间
     */
    public final TableField<McGiftRecord, Timestamp> RECEIVE_TIME = createField("receive_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "领取时间");

    /**
     * The column <code>xbkj.mc_gift.remarks</code>. 备注
     */
    public final TableField<McGiftRecord, String> REMARKS = createField("remarks", org.jooq.impl.SQLDataType.VARCHAR(255), this, "备注");

    /**
     * The column <code>xbkj.mc_gift.sender</code>. 发放人 培训机构、单店、平台 
     */
    public final TableField<McGiftRecord, McGiftSender> SENDER = createField("sender", org.jooq.impl.SQLDataType.VARCHAR(12).asEnumDataType(com.jooq.domain.enums.McGiftSender.class), this, "发放人 培训机构、单店、平台 ");

    /**
     * The column <code>xbkj.mc_gift.sender_id</code>. send_id 针对机构，门店，课程发放的id
     */
    public final TableField<McGiftRecord, Long> SENDER_ID = createField("sender_id", org.jooq.impl.SQLDataType.BIGINT.defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.BIGINT)), this, "send_id 针对机构，门店，课程发放的id");

    /**
     * The column <code>xbkj.mc_gift.deliver</code>. 发货:已发货，未发货
     */
    public final TableField<McGiftRecord, McGiftDeliver> DELIVER = createField("deliver", org.jooq.impl.SQLDataType.VARCHAR(10).asEnumDataType(com.jooq.domain.enums.McGiftDeliver.class), this, "发货:已发货，未发货");

    /**
     * The column <code>xbkj.mc_gift.draw_Amount</code>. 领取条件，消费金额
     */
    public final TableField<McGiftRecord, BigDecimal> DRAW_AMOUNT = createField("draw_Amount", org.jooq.impl.SQLDataType.DECIMAL(20, 2).defaultValue(org.jooq.impl.DSL.inline("0.00", org.jooq.impl.SQLDataType.DECIMAL)), this, "领取条件，消费金额");

    /**
     * The column <code>xbkj.mc_gift.create_at</code>. 创建时间
     */
    public final TableField<McGiftRecord, Timestamp> CREATE_AT = createField("create_at", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "创建时间");

    /**
     * The column <code>xbkj.mc_gift.update_at</code>. 更新时间
     */
    public final TableField<McGiftRecord, Timestamp> UPDATE_AT = createField("update_at", org.jooq.impl.SQLDataType.TIMESTAMP, this, "更新时间");

    /**
     * The column <code>xbkj.mc_gift.del_flag</code>. 删除标志
     */
    public final TableField<McGiftRecord, Boolean> DEL_FLAG = createField("del_flag", org.jooq.impl.SQLDataType.BIT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("b'0'", org.jooq.impl.SQLDataType.BIT)), this, "删除标志");

    /**
     * The column <code>xbkj.mc_gift.version</code>.
     */
    public final TableField<McGiftRecord, Long> VERSION = createField("version", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * Create a <code>xbkj.mc_gift</code> table reference
     */
    public McGift() {
        this(DSL.name("mc_gift"), null);
    }

    /**
     * Create an aliased <code>xbkj.mc_gift</code> table reference
     */
    public McGift(String alias) {
        this(DSL.name(alias), MC_GIFT);
    }

    /**
     * Create an aliased <code>xbkj.mc_gift</code> table reference
     */
    public McGift(Name alias) {
        this(alias, MC_GIFT);
    }

    private McGift(Name alias, Table<McGiftRecord> aliased) {
        this(alias, aliased, null);
    }

    private McGift(Name alias, Table<McGiftRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "礼品记录");
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
        return Arrays.<Index>asList(Indexes.MC_GIFT_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<McGiftRecord, Long> getIdentity() {
        return Keys.IDENTITY_MC_GIFT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<McGiftRecord> getPrimaryKey() {
        return Keys.KEY_MC_GIFT_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<McGiftRecord>> getKeys() {
        return Arrays.<UniqueKey<McGiftRecord>>asList(Keys.KEY_MC_GIFT_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public McGift as(String alias) {
        return new McGift(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public McGift as(Name alias) {
        return new McGift(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public McGift rename(String name) {
        return new McGift(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public McGift rename(Name name) {
        return new McGift(name, null);
    }
}