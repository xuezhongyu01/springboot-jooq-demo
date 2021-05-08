/*
 * This file is generated by jOOQ.
*/
package com.jooq.domain.tables;


import com.jooq.domain.Indexes;
import com.jooq.domain.Keys;
import com.jooq.domain.Xbkj;
import com.jooq.domain.enums.UcShopActivityStatus;
import com.jooq.domain.tables.records.UcShopActivityRecord;

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
 * 门店活动表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UcShopActivity extends TableImpl<UcShopActivityRecord> {

    private static final long serialVersionUID = -1918074998;

    /**
     * The reference instance of <code>xbkj.uc_shop_activity</code>
     */
    public static final UcShopActivity UC_SHOP_ACTIVITY = new UcShopActivity();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<UcShopActivityRecord> getRecordType() {
        return UcShopActivityRecord.class;
    }

    /**
     * The column <code>xbkj.uc_shop_activity.id</code>. 主键
     */
    public final TableField<UcShopActivityRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).identity(true), this, "主键");

    /**
     * The column <code>xbkj.uc_shop_activity.shop_id</code>. 门店id
     */
    public final TableField<UcShopActivityRecord, Long> SHOP_ID = createField("shop_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "门店id");

    /**
     * The column <code>xbkj.uc_shop_activity.activity_name</code>. 门店活动名称
     */
    public final TableField<UcShopActivityRecord, String> ACTIVITY_NAME = createField("activity_name", org.jooq.impl.SQLDataType.VARCHAR(255), this, "门店活动名称");

    /**
     * The column <code>xbkj.uc_shop_activity.activity_brief</code>. 活动简介
     */
    public final TableField<UcShopActivityRecord, String> ACTIVITY_BRIEF = createField("activity_brief", org.jooq.impl.SQLDataType.VARCHAR(255), this, "活动简介");

    /**
     * The column <code>xbkj.uc_shop_activity.image</code>. banner图片(jpg、png)
     */
    public final TableField<UcShopActivityRecord, String> IMAGE = createField("image", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "banner图片(jpg、png)");

    /**
     * The column <code>xbkj.uc_shop_activity.href</code>. 链接
     */
    public final TableField<UcShopActivityRecord, String> HREF = createField("href", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "链接");

    /**
     * The column <code>xbkj.uc_shop_activity.status</code>. 状态：保存，审核中，正常，上线,下线，禁用，其他，审核失败，提交中
     */
    public final TableField<UcShopActivityRecord, UcShopActivityStatus> STATUS = createField("status", org.jooq.impl.SQLDataType.VARCHAR(10).nullable(false).asEnumDataType(com.jooq.domain.enums.UcShopActivityStatus.class), this, "状态：保存，审核中，正常，上线,下线，禁用，其他，审核失败，提交中");

    /**
     * The column <code>xbkj.uc_shop_activity.start_time</code>. 开始时间
     */
    public final TableField<UcShopActivityRecord, Timestamp> START_TIME = createField("start_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "开始时间");

    /**
     * The column <code>xbkj.uc_shop_activity.end_time</code>. 结束时间
     */
    public final TableField<UcShopActivityRecord, Timestamp> END_TIME = createField("end_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "结束时间");

    /**
     * The column <code>xbkj.uc_shop_activity.activity_detail</code>. 活动详情
     */
    public final TableField<UcShopActivityRecord, String> ACTIVITY_DETAIL = createField("activity_detail", org.jooq.impl.SQLDataType.CLOB, this, "活动详情");

    /**
     * The column <code>xbkj.uc_shop_activity.create_at</code>. 创建时间
     */
    public final TableField<UcShopActivityRecord, Timestamp> CREATE_AT = createField("create_at", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "创建时间");

    /**
     * The column <code>xbkj.uc_shop_activity.update_at</code>. 更新时间
     */
    public final TableField<UcShopActivityRecord, Timestamp> UPDATE_AT = createField("update_at", org.jooq.impl.SQLDataType.TIMESTAMP, this, "更新时间");

    /**
     * The column <code>xbkj.uc_shop_activity.del_flag</code>. 删除标志
     */
    public final TableField<UcShopActivityRecord, Boolean> DEL_FLAG = createField("del_flag", org.jooq.impl.SQLDataType.BIT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("b'0'", org.jooq.impl.SQLDataType.BIT)), this, "删除标志");

    /**
     * The column <code>xbkj.uc_shop_activity.version</code>.
     */
    public final TableField<UcShopActivityRecord, Long> VERSION = createField("version", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * Create a <code>xbkj.uc_shop_activity</code> table reference
     */
    public UcShopActivity() {
        this(DSL.name("uc_shop_activity"), null);
    }

    /**
     * Create an aliased <code>xbkj.uc_shop_activity</code> table reference
     */
    public UcShopActivity(String alias) {
        this(DSL.name(alias), UC_SHOP_ACTIVITY);
    }

    /**
     * Create an aliased <code>xbkj.uc_shop_activity</code> table reference
     */
    public UcShopActivity(Name alias) {
        this(alias, UC_SHOP_ACTIVITY);
    }

    private UcShopActivity(Name alias, Table<UcShopActivityRecord> aliased) {
        this(alias, aliased, null);
    }

    private UcShopActivity(Name alias, Table<UcShopActivityRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "门店活动表");
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
        return Arrays.<Index>asList(Indexes.UC_SHOP_ACTIVITY_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<UcShopActivityRecord, Long> getIdentity() {
        return Keys.IDENTITY_UC_SHOP_ACTIVITY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<UcShopActivityRecord> getPrimaryKey() {
        return Keys.KEY_UC_SHOP_ACTIVITY_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<UcShopActivityRecord>> getKeys() {
        return Arrays.<UniqueKey<UcShopActivityRecord>>asList(Keys.KEY_UC_SHOP_ACTIVITY_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UcShopActivity as(String alias) {
        return new UcShopActivity(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UcShopActivity as(Name alias) {
        return new UcShopActivity(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public UcShopActivity rename(String name) {
        return new UcShopActivity(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public UcShopActivity rename(Name name) {
        return new UcShopActivity(name, null);
    }
}
