/*
 * This file is generated by jOOQ.
*/
package com.jooq.domain.tables;


import com.jooq.domain.Indexes;
import com.jooq.domain.Keys;
import com.jooq.domain.Xbkj;
import com.jooq.domain.enums.McCouponTemplateCouponType;
import com.jooq.domain.enums.McCouponTemplateDrawCondition;
import com.jooq.domain.enums.McCouponTemplateDrawConditionAreatype;
import com.jooq.domain.enums.McCouponTemplateSender;
import com.jooq.domain.enums.McCouponTemplateStatus;
import com.jooq.domain.enums.McCouponTemplateUseConditionArea;
import com.jooq.domain.tables.records.McCouponTemplateRecord;

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
 * 优惠券模板
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class McCouponTemplate extends TableImpl<McCouponTemplateRecord> {

    private static final long serialVersionUID = 155741900;

    /**
     * The reference instance of <code>xbkj.mc_coupon_template</code>
     */
    public static final McCouponTemplate MC_COUPON_TEMPLATE = new McCouponTemplate();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<McCouponTemplateRecord> getRecordType() {
        return McCouponTemplateRecord.class;
    }

    /**
     * The column <code>xbkj.mc_coupon_template.id</code>.
     */
    public final TableField<McCouponTemplateRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>xbkj.mc_coupon_template.name</code>. 模板名称
     */
    public final TableField<McCouponTemplateRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "模板名称");

    /**
     * The column <code>xbkj.mc_coupon_template.coupon_type</code>. 优惠券类型 1-抵价券 2-打折券 3-满减券 4-贴息券 5-免息券
     */
    public final TableField<McCouponTemplateRecord, McCouponTemplateCouponType> COUPON_TYPE = createField("coupon_type", org.jooq.impl.SQLDataType.VARCHAR(8).asEnumDataType(com.jooq.domain.enums.McCouponTemplateCouponType.class), this, "优惠券类型 1-抵价券 2-打折券 3-满减券 4-贴息券 5-免息券");

    /**
     * The column <code>xbkj.mc_coupon_template.use_greater_amount</code>. 使用条件大于金额
     */
    public final TableField<McCouponTemplateRecord, BigDecimal> USE_GREATER_AMOUNT = createField("use_greater_amount", org.jooq.impl.SQLDataType.DECIMAL(20, 2).defaultValue(org.jooq.impl.DSL.inline("0.00", org.jooq.impl.SQLDataType.DECIMAL)), this, "使用条件大于金额");

    /**
     * The column <code>xbkj.mc_coupon_template.use_condition_amount</code>. 满减劵-消费满的金额
     */
    public final TableField<McCouponTemplateRecord, BigDecimal> USE_CONDITION_AMOUNT = createField("use_condition_amount", org.jooq.impl.SQLDataType.DECIMAL(20, 2).nullable(false).defaultValue(org.jooq.impl.DSL.inline("0.00", org.jooq.impl.SQLDataType.DECIMAL)), this, "满减劵-消费满的金额");

    /**
     * The column <code>xbkj.mc_coupon_template.amount</code>. 面额(抵价券，打折券=价格打折,贴息券则表示折扣率，免息券则表示利率=0)
     */
    public final TableField<McCouponTemplateRecord, BigDecimal> AMOUNT = createField("amount", org.jooq.impl.SQLDataType.DECIMAL(20, 2).nullable(false).defaultValue(org.jooq.impl.DSL.inline("0.00", org.jooq.impl.SQLDataType.DECIMAL)), this, "面额(抵价券，打折券=价格打折,贴息券则表示折扣率，免息券则表示利率=0)");

    /**
     * The column <code>xbkj.mc_coupon_template.sender</code>. 发放人 培训机构、单店、平台 
     */
    public final TableField<McCouponTemplateRecord, McCouponTemplateSender> SENDER = createField("sender", org.jooq.impl.SQLDataType.VARCHAR(12).nullable(false).defaultValue(org.jooq.impl.DSL.inline("organization", org.jooq.impl.SQLDataType.VARCHAR)).asEnumDataType(com.jooq.domain.enums.McCouponTemplateSender.class), this, "发放人 培训机构、单店、平台 ");

    /**
     * The column <code>xbkj.mc_coupon_template.send_id</code>. send_id 针对机构，门店，课程发放的id
     */
    public final TableField<McCouponTemplateRecord, Long> SEND_ID = createField("send_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.BIGINT)), this, "send_id 针对机构，门店，课程发放的id");

    /**
     * The column <code>xbkj.mc_coupon_template.start_date</code>. 券有效开始时间
     */
    public final TableField<McCouponTemplateRecord, Timestamp> START_DATE = createField("start_date", org.jooq.impl.SQLDataType.TIMESTAMP, this, "券有效开始时间");

    /**
     * The column <code>xbkj.mc_coupon_template.end_date</code>. 券有效结束时间
     */
    public final TableField<McCouponTemplateRecord, Timestamp> END_DATE = createField("end_date", org.jooq.impl.SQLDataType.TIMESTAMP, this, "券有效结束时间");

    /**
     * The column <code>xbkj.mc_coupon_template.limit_count</code>. 是否限制数量
     */
    public final TableField<McCouponTemplateRecord, Boolean> LIMIT_COUNT = createField("limit_count", org.jooq.impl.SQLDataType.BIT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("b'0'", org.jooq.impl.SQLDataType.BIT)), this, "是否限制数量");

    /**
     * The column <code>xbkj.mc_coupon_template.free_installment_num</code>. 免息分期期数
     */
    public final TableField<McCouponTemplateRecord, Integer> FREE_INSTALLMENT_NUM = createField("free_installment_num", org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "免息分期期数");

    /**
     * The column <code>xbkj.mc_coupon_template.send_count</code>. 发放数量
     */
    public final TableField<McCouponTemplateRecord, Integer> SEND_COUNT = createField("send_count", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "发放数量");

    /**
     * The column <code>xbkj.mc_coupon_template.draw_count</code>. 已领取此模板的统计
     */
    public final TableField<McCouponTemplateRecord, Integer> DRAW_COUNT = createField("draw_count", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "已领取此模板的统计");

    /**
     * The column <code>xbkj.mc_coupon_template.use_count</code>. 已使用此模板的统计
     */
    public final TableField<McCouponTemplateRecord, Integer> USE_COUNT = createField("use_count", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "已使用此模板的统计");

    /**
     * The column <code>xbkj.mc_coupon_template.use_condition_area</code>. 使用范围 培训机构、单店、课程 平台
     */
    public final TableField<McCouponTemplateRecord, McCouponTemplateUseConditionArea> USE_CONDITION_AREA = createField("use_condition_area", org.jooq.impl.SQLDataType.VARCHAR(12).asEnumDataType(com.jooq.domain.enums.McCouponTemplateUseConditionArea.class), this, "使用范围 培训机构、单店、课程 平台");

    /**
     * The column <code>xbkj.mc_coupon_template.use_condition</code>. 使用范围，培训机构ID数组，以英文逗号分隔, 单店ID数组，课程ID数组
     */
    public final TableField<McCouponTemplateRecord, String> USE_CONDITION = createField("use_condition", org.jooq.impl.SQLDataType.VARCHAR(5000), this, "使用范围，培训机构ID数组，以英文逗号分隔, 单店ID数组，课程ID数组");

    /**
     * The column <code>xbkj.mc_coupon_template.use_note</code>. 使用须知
     */
    public final TableField<McCouponTemplateRecord, String> USE_NOTE = createField("use_note", org.jooq.impl.SQLDataType.VARCHAR(5000), this, "使用须知");

    /**
     * The column <code>xbkj.mc_coupon_template.remark</code>. 备注
     */
    public final TableField<McCouponTemplateRecord, String> REMARK = createField("remark", org.jooq.impl.SQLDataType.VARCHAR(255), this, "备注");

    /**
     * The column <code>xbkj.mc_coupon_template.status</code>. 状态,保存，禁用，启用
     */
    public final TableField<McCouponTemplateRecord, McCouponTemplateStatus> STATUS = createField("status", org.jooq.impl.SQLDataType.VARCHAR(8).nullable(false).asEnumDataType(com.jooq.domain.enums.McCouponTemplateStatus.class), this, "状态,保存，禁用，启用");

    /**
     * The column <code>xbkj.mc_coupon_template.draw_condition</code>. 领取条件:消费满多少，累计消费满多少,登录领取,用户手动领取,试听课报名,分期消费满多少
     */
    public final TableField<McCouponTemplateRecord, McCouponTemplateDrawCondition> DRAW_CONDITION = createField("draw_condition", org.jooq.impl.SQLDataType.VARCHAR(17).asEnumDataType(com.jooq.domain.enums.McCouponTemplateDrawCondition.class), this, "领取条件:消费满多少，累计消费满多少,登录领取,用户手动领取,试听课报名,分期消费满多少");

    /**
     * The column <code>xbkj.mc_coupon_template.draw_amount</code>. 领取条件，消费金额
     */
    public final TableField<McCouponTemplateRecord, BigDecimal> DRAW_AMOUNT = createField("draw_amount", org.jooq.impl.SQLDataType.DECIMAL(20, 2).nullable(false).defaultValue(org.jooq.impl.DSL.inline("0.00", org.jooq.impl.SQLDataType.DECIMAL)), this, "领取条件，消费金额");

    /**
     * The column <code>xbkj.mc_coupon_template.create_at</code>. 创建时间
     */
    public final TableField<McCouponTemplateRecord, Timestamp> CREATE_AT = createField("create_at", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "创建时间");

    /**
     * The column <code>xbkj.mc_coupon_template.update_at</code>. 更新时间
     */
    public final TableField<McCouponTemplateRecord, Timestamp> UPDATE_AT = createField("update_at", org.jooq.impl.SQLDataType.TIMESTAMP, this, "更新时间");

    /**
     * The column <code>xbkj.mc_coupon_template.del_flag</code>. 删除标志
     */
    public final TableField<McCouponTemplateRecord, Boolean> DEL_FLAG = createField("del_flag", org.jooq.impl.SQLDataType.BIT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("b'0'", org.jooq.impl.SQLDataType.BIT)), this, "删除标志");

    /**
     * The column <code>xbkj.mc_coupon_template.version</code>.
     */
    public final TableField<McCouponTemplateRecord, Long> VERSION = createField("version", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>xbkj.mc_coupon_template.create_by</code>. 创建者
     */
    public final TableField<McCouponTemplateRecord, Long> CREATE_BY = createField("create_by", org.jooq.impl.SQLDataType.BIGINT, this, "创建者");

    /**
     * The column <code>xbkj.mc_coupon_template.draw_condition_area</code>. 领取条件为试听课领取时的试听课程或全店:单店ID，课程ID数组,以英文逗号分隔
     */
    public final TableField<McCouponTemplateRecord, String> DRAW_CONDITION_AREA = createField("draw_condition_area", org.jooq.impl.SQLDataType.VARCHAR(5000), this, "领取条件为试听课领取时的试听课程或全店:单店ID，课程ID数组,以英文逗号分隔");

    /**
     * The column <code>xbkj.mc_coupon_template.draw_condition_areaType</code>. 领取条件为试听课领取时的类型(门店或课程):单店、课程
     */
    public final TableField<McCouponTemplateRecord, McCouponTemplateDrawConditionAreatype> DRAW_CONDITION_AREATYPE = createField("draw_condition_areaType", org.jooq.impl.SQLDataType.VARCHAR(6).asEnumDataType(com.jooq.domain.enums.McCouponTemplateDrawConditionAreatype.class), this, "领取条件为试听课领取时的类型(门店或课程):单店、课程");

    /**
     * Create a <code>xbkj.mc_coupon_template</code> table reference
     */
    public McCouponTemplate() {
        this(DSL.name("mc_coupon_template"), null);
    }

    /**
     * Create an aliased <code>xbkj.mc_coupon_template</code> table reference
     */
    public McCouponTemplate(String alias) {
        this(DSL.name(alias), MC_COUPON_TEMPLATE);
    }

    /**
     * Create an aliased <code>xbkj.mc_coupon_template</code> table reference
     */
    public McCouponTemplate(Name alias) {
        this(alias, MC_COUPON_TEMPLATE);
    }

    private McCouponTemplate(Name alias, Table<McCouponTemplateRecord> aliased) {
        this(alias, aliased, null);
    }

    private McCouponTemplate(Name alias, Table<McCouponTemplateRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "优惠券模板");
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
        return Arrays.<Index>asList(Indexes.MC_COUPON_TEMPLATE_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<McCouponTemplateRecord, Long> getIdentity() {
        return Keys.IDENTITY_MC_COUPON_TEMPLATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<McCouponTemplateRecord> getPrimaryKey() {
        return Keys.KEY_MC_COUPON_TEMPLATE_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<McCouponTemplateRecord>> getKeys() {
        return Arrays.<UniqueKey<McCouponTemplateRecord>>asList(Keys.KEY_MC_COUPON_TEMPLATE_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public McCouponTemplate as(String alias) {
        return new McCouponTemplate(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public McCouponTemplate as(Name alias) {
        return new McCouponTemplate(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public McCouponTemplate rename(String name) {
        return new McCouponTemplate(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public McCouponTemplate rename(Name name) {
        return new McCouponTemplate(name, null);
    }
}
