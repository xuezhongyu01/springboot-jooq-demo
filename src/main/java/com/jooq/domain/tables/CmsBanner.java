/*
 * This file is generated by jOOQ.
*/
package com.jooq.domain.tables;


import com.jooq.domain.Indexes;
import com.jooq.domain.Keys;
import com.jooq.domain.Xbkj;
import com.jooq.domain.enums.CmsBannerLocation;
import com.jooq.domain.enums.CmsBannerStatus;
import com.jooq.domain.tables.records.CmsBannerRecord;

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
 * banner管理
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CmsBanner extends TableImpl<CmsBannerRecord> {

    private static final long serialVersionUID = 1672168263;

    /**
     * The reference instance of <code>xbkj.cms_banner</code>
     */
    public static final CmsBanner CMS_BANNER = new CmsBanner();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CmsBannerRecord> getRecordType() {
        return CmsBannerRecord.class;
    }

    /**
     * The column <code>xbkj.cms_banner.id</code>. 主键
     */
    public final TableField<CmsBannerRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).identity(true), this, "主键");

    /**
     * The column <code>xbkj.cms_banner.name</code>.
     */
    public final TableField<CmsBannerRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>xbkj.cms_banner.location</code>. 启动/闪屏页(APP);首页活动;弹出框活动；首页(APP/PC);
     */
    public final TableField<CmsBannerRecord, CmsBannerLocation> LOCATION = createField("location", org.jooq.impl.SQLDataType.VARCHAR(13).asEnumDataType(com.jooq.domain.enums.CmsBannerLocation.class), this, "启动/闪屏页(APP);首页活动;弹出框活动；首页(APP/PC);");

    /**
     * The column <code>xbkj.cms_banner.image</code>. banner图片(jpg、png)
     */
    public final TableField<CmsBannerRecord, String> IMAGE = createField("image", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "banner图片(jpg、png)");

    /**
     * The column <code>xbkj.cms_banner.image_bg</code>. 动态banner的底图
     */
    public final TableField<CmsBannerRecord, String> IMAGE_BG = createField("image_bg", org.jooq.impl.SQLDataType.VARCHAR(255), this, "动态banner的底图");

    /**
     * The column <code>xbkj.cms_banner.href</code>. 链接
     */
    public final TableField<CmsBannerRecord, String> HREF = createField("href", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "链接");

    /**
     * The column <code>xbkj.cms_banner.status</code>. online表示上线,saved表示保存, offline表示下线
     */
    public final TableField<CmsBannerRecord, CmsBannerStatus> STATUS = createField("status", org.jooq.impl.SQLDataType.VARCHAR(7).nullable(false).defaultValue(org.jooq.impl.DSL.inline("saved", org.jooq.impl.SQLDataType.VARCHAR)).asEnumDataType(com.jooq.domain.enums.CmsBannerStatus.class), this, "online表示上线,saved表示保存, offline表示下线");

    /**
     * The column <code>xbkj.cms_banner.priority</code>. 展示优先级
     */
    public final TableField<CmsBannerRecord, Integer> PRIORITY = createField("priority", org.jooq.impl.SQLDataType.INTEGER, this, "展示优先级");

    /**
     * The column <code>xbkj.cms_banner.jump_type</code>. 跳转类型
     */
    public final TableField<CmsBannerRecord, String> JUMP_TYPE = createField("jump_type", org.jooq.impl.SQLDataType.VARCHAR(255), this, "跳转类型");

    /**
     * The column <code>xbkj.cms_banner.start_time</code>. 开始时间
     */
    public final TableField<CmsBannerRecord, Timestamp> START_TIME = createField("start_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "开始时间");

    /**
     * The column <code>xbkj.cms_banner.end_time</code>. 结束时间
     */
    public final TableField<CmsBannerRecord, Timestamp> END_TIME = createField("end_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "结束时间");

    /**
     * The column <code>xbkj.cms_banner.target_blank</code>. 新窗口打开（0:否 1:是），默认否
     */
    public final TableField<CmsBannerRecord, Boolean> TARGET_BLANK = createField("target_blank", org.jooq.impl.SQLDataType.BIT.defaultValue(org.jooq.impl.DSL.inline("b'0'", org.jooq.impl.SQLDataType.BIT)), this, "新窗口打开（0:否 1:是），默认否");

    /**
     * The column <code>xbkj.cms_banner.share_flag</code>. 是否分享标记
     */
    public final TableField<CmsBannerRecord, Boolean> SHARE_FLAG = createField("share_flag", org.jooq.impl.SQLDataType.BIT.defaultValue(org.jooq.impl.DSL.inline("b'0'", org.jooq.impl.SQLDataType.BIT)), this, "是否分享标记");

    /**
     * The column <code>xbkj.cms_banner.share_title</code>. 分享标题
     */
    public final TableField<CmsBannerRecord, String> SHARE_TITLE = createField("share_title", org.jooq.impl.SQLDataType.VARCHAR(255), this, "分享标题");

    /**
     * The column <code>xbkj.cms_banner.share_word</code>. 分享文案
     */
    public final TableField<CmsBannerRecord, String> SHARE_WORD = createField("share_word", org.jooq.impl.SQLDataType.VARCHAR(255), this, "分享文案");

    /**
     * The column <code>xbkj.cms_banner.pc_view</code>. pc端显示（0-不显示 1-显示）
     */
    public final TableField<CmsBannerRecord, Boolean> PC_VIEW = createField("pc_view", org.jooq.impl.SQLDataType.BIT.defaultValue(org.jooq.impl.DSL.inline("b'0'", org.jooq.impl.SQLDataType.BIT)), this, "pc端显示（0-不显示 1-显示）");

    /**
     * The column <code>xbkj.cms_banner.app_view</code>. app端显示（0-不显示 1-显示）
     */
    public final TableField<CmsBannerRecord, Boolean> APP_VIEW = createField("app_view", org.jooq.impl.SQLDataType.BIT.defaultValue(org.jooq.impl.DSL.inline("b'0'", org.jooq.impl.SQLDataType.BIT)), this, "app端显示（0-不显示 1-显示）");

    /**
     * The column <code>xbkj.cms_banner.create_at</code>. 创建时间
     */
    public final TableField<CmsBannerRecord, Timestamp> CREATE_AT = createField("create_at", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "创建时间");

    /**
     * The column <code>xbkj.cms_banner.update_at</code>. 更新时间
     */
    public final TableField<CmsBannerRecord, Timestamp> UPDATE_AT = createField("update_at", org.jooq.impl.SQLDataType.TIMESTAMP, this, "更新时间");

    /**
     * The column <code>xbkj.cms_banner.del_flag</code>. 删除标志
     */
    public final TableField<CmsBannerRecord, Boolean> DEL_FLAG = createField("del_flag", org.jooq.impl.SQLDataType.BIT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("b'0'", org.jooq.impl.SQLDataType.BIT)), this, "删除标志");

    /**
     * The column <code>xbkj.cms_banner.version</code>.
     */
    public final TableField<CmsBannerRecord, Long> VERSION = createField("version", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>xbkj.cms_banner.banner_type</code>. 是否金融类的活动，默认非金融类
     */
    public final TableField<CmsBannerRecord, Boolean> BANNER_TYPE = createField("banner_type", org.jooq.impl.SQLDataType.BIT.defaultValue(org.jooq.impl.DSL.inline("b'0'", org.jooq.impl.SQLDataType.BIT)), this, "是否金融类的活动，默认非金融类");

    /**
     * The column <code>xbkj.cms_banner.extend_field</code>. 扩展字段
     */
    public final TableField<CmsBannerRecord, String> EXTEND_FIELD = createField("extend_field", org.jooq.impl.SQLDataType.VARCHAR(3000), this, "扩展字段");

    /**
     * The column <code>xbkj.cms_banner.special</code>. 是否专题的活动，默认非专题
     */
    public final TableField<CmsBannerRecord, Boolean> SPECIAL = createField("special", org.jooq.impl.SQLDataType.BIT.defaultValue(org.jooq.impl.DSL.inline("b'0'", org.jooq.impl.SQLDataType.BIT)), this, "是否专题的活动，默认非专题");

    /**
     * Create a <code>xbkj.cms_banner</code> table reference
     */
    public CmsBanner() {
        this(DSL.name("cms_banner"), null);
    }

    /**
     * Create an aliased <code>xbkj.cms_banner</code> table reference
     */
    public CmsBanner(String alias) {
        this(DSL.name(alias), CMS_BANNER);
    }

    /**
     * Create an aliased <code>xbkj.cms_banner</code> table reference
     */
    public CmsBanner(Name alias) {
        this(alias, CMS_BANNER);
    }

    private CmsBanner(Name alias, Table<CmsBannerRecord> aliased) {
        this(alias, aliased, null);
    }

    private CmsBanner(Name alias, Table<CmsBannerRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "banner管理");
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
        return Arrays.<Index>asList(Indexes.CMS_BANNER_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<CmsBannerRecord, Long> getIdentity() {
        return Keys.IDENTITY_CMS_BANNER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<CmsBannerRecord> getPrimaryKey() {
        return Keys.KEY_CMS_BANNER_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<CmsBannerRecord>> getKeys() {
        return Arrays.<UniqueKey<CmsBannerRecord>>asList(Keys.KEY_CMS_BANNER_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CmsBanner as(String alias) {
        return new CmsBanner(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CmsBanner as(Name alias) {
        return new CmsBanner(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public CmsBanner rename(String name) {
        return new CmsBanner(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public CmsBanner rename(Name name) {
        return new CmsBanner(name, null);
    }
}
