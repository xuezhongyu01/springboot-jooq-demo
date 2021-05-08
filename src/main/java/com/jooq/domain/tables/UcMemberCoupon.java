/*
 * This file is generated by jOOQ.
*/
package com.jooq.domain.tables;


import com.jooq.domain.Indexes;
import com.jooq.domain.Keys;
import com.jooq.domain.Xbkj;
import com.jooq.domain.tables.records.UcMemberCouponRecord;

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
 * 会员表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UcMemberCoupon extends TableImpl<UcMemberCouponRecord> {

    private static final long serialVersionUID = -1820031809;

    /**
     * The reference instance of <code>xbkj.uc_member_coupon</code>
     */
    public static final UcMemberCoupon UC_MEMBER_COUPON = new UcMemberCoupon();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<UcMemberCouponRecord> getRecordType() {
        return UcMemberCouponRecord.class;
    }

    /**
     * The column <code>xbkj.uc_member_coupon.id</code>.
     */
    public final TableField<UcMemberCouponRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>xbkj.uc_member_coupon.member_id</code>. 用户表主键
     */
    public final TableField<UcMemberCouponRecord, Long> MEMBER_ID = createField("member_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "用户表主键");

    /**
     * The column <code>xbkj.uc_member_coupon.coupon_template_id</code>. 优惠券模版主键
     */
    public final TableField<UcMemberCouponRecord, Long> COUPON_TEMPLATE_ID = createField("coupon_template_id", org.jooq.impl.SQLDataType.BIGINT.defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.BIGINT)), this, "优惠券模版主键");

    /**
     * The column <code>xbkj.uc_member_coupon.create_at</code>. 创建时间
     */
    public final TableField<UcMemberCouponRecord, Timestamp> CREATE_AT = createField("create_at", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "创建时间");

    /**
     * The column <code>xbkj.uc_member_coupon.update_at</code>. 更新时间
     */
    public final TableField<UcMemberCouponRecord, Timestamp> UPDATE_AT = createField("update_at", org.jooq.impl.SQLDataType.TIMESTAMP, this, "更新时间");

    /**
     * The column <code>xbkj.uc_member_coupon.del_flag</code>. 删除标志
     */
    public final TableField<UcMemberCouponRecord, Boolean> DEL_FLAG = createField("del_flag", org.jooq.impl.SQLDataType.BIT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("b'0'", org.jooq.impl.SQLDataType.BIT)), this, "删除标志");

    /**
     * The column <code>xbkj.uc_member_coupon.version</code>.
     */
    public final TableField<UcMemberCouponRecord, Long> VERSION = createField("version", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>xbkj.uc_member_coupon.unique_id</code>. 唯一索引 = member_id+couponTemp_id+isgiven+coupon_id
     */
    public final TableField<UcMemberCouponRecord, String> UNIQUE_ID = createField("unique_id", org.jooq.impl.SQLDataType.VARCHAR(100).nullable(false), this, "唯一索引 = member_id+couponTemp_id+isgiven+coupon_id");

    /**
     * Create a <code>xbkj.uc_member_coupon</code> table reference
     */
    public UcMemberCoupon() {
        this(DSL.name("uc_member_coupon"), null);
    }

    /**
     * Create an aliased <code>xbkj.uc_member_coupon</code> table reference
     */
    public UcMemberCoupon(String alias) {
        this(DSL.name(alias), UC_MEMBER_COUPON);
    }

    /**
     * Create an aliased <code>xbkj.uc_member_coupon</code> table reference
     */
    public UcMemberCoupon(Name alias) {
        this(alias, UC_MEMBER_COUPON);
    }

    private UcMemberCoupon(Name alias, Table<UcMemberCouponRecord> aliased) {
        this(alias, aliased, null);
    }

    private UcMemberCoupon(Name alias, Table<UcMemberCouponRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "会员表");
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
        return Arrays.<Index>asList(Indexes.UC_MEMBER_COUPON_PRIMARY, Indexes.UC_MEMBER_COUPON_UNIQUE_ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<UcMemberCouponRecord, Long> getIdentity() {
        return Keys.IDENTITY_UC_MEMBER_COUPON;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<UcMemberCouponRecord> getPrimaryKey() {
        return Keys.KEY_UC_MEMBER_COUPON_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<UcMemberCouponRecord>> getKeys() {
        return Arrays.<UniqueKey<UcMemberCouponRecord>>asList(Keys.KEY_UC_MEMBER_COUPON_PRIMARY, Keys.KEY_UC_MEMBER_COUPON_UNIQUE_ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UcMemberCoupon as(String alias) {
        return new UcMemberCoupon(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UcMemberCoupon as(Name alias) {
        return new UcMemberCoupon(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public UcMemberCoupon rename(String name) {
        return new UcMemberCoupon(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public UcMemberCoupon rename(Name name) {
        return new UcMemberCoupon(name, null);
    }
}