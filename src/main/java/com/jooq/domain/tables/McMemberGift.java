/*
 * This file is generated by jOOQ.
*/
package com.jooq.domain.tables;


import com.jooq.domain.Indexes;
import com.jooq.domain.Keys;
import com.jooq.domain.Xbkj;
import com.jooq.domain.tables.records.McMemberGiftRecord;

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
 * 用户领取礼品唯一索引表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class McMemberGift extends TableImpl<McMemberGiftRecord> {

    private static final long serialVersionUID = 617183963;

    /**
     * The reference instance of <code>xbkj.mc_member_gift</code>
     */
    public static final McMemberGift MC_MEMBER_GIFT = new McMemberGift();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<McMemberGiftRecord> getRecordType() {
        return McMemberGiftRecord.class;
    }

    /**
     * The column <code>xbkj.mc_member_gift.id</code>.
     */
    public final TableField<McMemberGiftRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>xbkj.mc_member_gift.member_id</code>. 用户表主键
     */
    public final TableField<McMemberGiftRecord, Long> MEMBER_ID = createField("member_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "用户表主键");

    /**
     * The column <code>xbkj.mc_member_gift.gift_template_id</code>. 礼品模版主键
     */
    public final TableField<McMemberGiftRecord, Long> GIFT_TEMPLATE_ID = createField("gift_template_id", org.jooq.impl.SQLDataType.BIGINT.defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.BIGINT)), this, "礼品模版主键");

    /**
     * The column <code>xbkj.mc_member_gift.create_at</code>. 创建时间
     */
    public final TableField<McMemberGiftRecord, Timestamp> CREATE_AT = createField("create_at", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "创建时间");

    /**
     * The column <code>xbkj.mc_member_gift.update_at</code>. 更新时间
     */
    public final TableField<McMemberGiftRecord, Timestamp> UPDATE_AT = createField("update_at", org.jooq.impl.SQLDataType.TIMESTAMP, this, "更新时间");

    /**
     * The column <code>xbkj.mc_member_gift.del_flag</code>. 删除标志
     */
    public final TableField<McMemberGiftRecord, Boolean> DEL_FLAG = createField("del_flag", org.jooq.impl.SQLDataType.BIT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("b'0'", org.jooq.impl.SQLDataType.BIT)), this, "删除标志");

    /**
     * The column <code>xbkj.mc_member_gift.version</code>.
     */
    public final TableField<McMemberGiftRecord, Long> VERSION = createField("version", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>xbkj.mc_member_gift.unique_id</code>. 唯一索引 = member_id+gift_template_id+isgiven+gift_id
     */
    public final TableField<McMemberGiftRecord, String> UNIQUE_ID = createField("unique_id", org.jooq.impl.SQLDataType.VARCHAR(100).nullable(false), this, "唯一索引 = member_id+gift_template_id+isgiven+gift_id");

    /**
     * Create a <code>xbkj.mc_member_gift</code> table reference
     */
    public McMemberGift() {
        this(DSL.name("mc_member_gift"), null);
    }

    /**
     * Create an aliased <code>xbkj.mc_member_gift</code> table reference
     */
    public McMemberGift(String alias) {
        this(DSL.name(alias), MC_MEMBER_GIFT);
    }

    /**
     * Create an aliased <code>xbkj.mc_member_gift</code> table reference
     */
    public McMemberGift(Name alias) {
        this(alias, MC_MEMBER_GIFT);
    }

    private McMemberGift(Name alias, Table<McMemberGiftRecord> aliased) {
        this(alias, aliased, null);
    }

    private McMemberGift(Name alias, Table<McMemberGiftRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "用户领取礼品唯一索引表");
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
        return Arrays.<Index>asList(Indexes.MC_MEMBER_GIFT_PRIMARY, Indexes.MC_MEMBER_GIFT_UNIQUE_GIFTID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<McMemberGiftRecord, Long> getIdentity() {
        return Keys.IDENTITY_MC_MEMBER_GIFT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<McMemberGiftRecord> getPrimaryKey() {
        return Keys.KEY_MC_MEMBER_GIFT_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<McMemberGiftRecord>> getKeys() {
        return Arrays.<UniqueKey<McMemberGiftRecord>>asList(Keys.KEY_MC_MEMBER_GIFT_PRIMARY, Keys.KEY_MC_MEMBER_GIFT_UNIQUE_GIFTID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public McMemberGift as(String alias) {
        return new McMemberGift(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public McMemberGift as(Name alias) {
        return new McMemberGift(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public McMemberGift rename(String name) {
        return new McMemberGift(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public McMemberGift rename(Name name) {
        return new McMemberGift(name, null);
    }
}
