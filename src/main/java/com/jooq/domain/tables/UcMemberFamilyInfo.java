/*
 * This file is generated by jOOQ.
*/
package com.jooq.domain.tables;


import com.jooq.domain.Indexes;
import com.jooq.domain.Keys;
import com.jooq.domain.Xbkj;
import com.jooq.domain.enums.UcMemberFamilyInfoMaritalStatus;
import com.jooq.domain.tables.records.UcMemberFamilyInfoRecord;

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
 * 家庭资料表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UcMemberFamilyInfo extends TableImpl<UcMemberFamilyInfoRecord> {

    private static final long serialVersionUID = 1702857711;

    /**
     * The reference instance of <code>xbkj.uc_member_family_info</code>
     */
    public static final UcMemberFamilyInfo UC_MEMBER_FAMILY_INFO = new UcMemberFamilyInfo();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<UcMemberFamilyInfoRecord> getRecordType() {
        return UcMemberFamilyInfoRecord.class;
    }

    /**
     * The column <code>xbkj.uc_member_family_info.id</code>.
     */
    public final TableField<UcMemberFamilyInfoRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>xbkj.uc_member_family_info.member_id</code>. 用户id
     */
    public final TableField<UcMemberFamilyInfoRecord, Long> MEMBER_ID = createField("member_id", org.jooq.impl.SQLDataType.BIGINT, this, "用户id");

    /**
     * The column <code>xbkj.uc_member_family_info.marital_status</code>. 婚姻状态(已婚，离异，单身)
     */
    public final TableField<UcMemberFamilyInfoRecord, UcMemberFamilyInfoMaritalStatus> MARITAL_STATUS = createField("marital_status", org.jooq.impl.SQLDataType.VARCHAR(8).asEnumDataType(com.jooq.domain.enums.UcMemberFamilyInfoMaritalStatus.class), this, "婚姻状态(已婚，离异，单身)");

    /**
     * The column <code>xbkj.uc_member_family_info.address_city</code>. 家庭城市
     */
    public final TableField<UcMemberFamilyInfoRecord, String> ADDRESS_CITY = createField("address_city", org.jooq.impl.SQLDataType.VARCHAR(64), this, "家庭城市");

    /**
     * The column <code>xbkj.uc_member_family_info.address</code>. 家庭详细住址
     */
    public final TableField<UcMemberFamilyInfoRecord, String> ADDRESS = createField("address", org.jooq.impl.SQLDataType.VARCHAR(128), this, "家庭详细住址");

    /**
     * The column <code>xbkj.uc_member_family_info.latitude</code>.
     */
    public final TableField<UcMemberFamilyInfoRecord, Double> LATITUDE = createField("latitude", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>xbkj.uc_member_family_info.longitude</code>.
     */
    public final TableField<UcMemberFamilyInfoRecord, Double> LONGITUDE = createField("longitude", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>xbkj.uc_member_family_info.create_at</code>. 创建时间
     */
    public final TableField<UcMemberFamilyInfoRecord, Timestamp> CREATE_AT = createField("create_at", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "创建时间");

    /**
     * The column <code>xbkj.uc_member_family_info.update_at</code>. 更新时间
     */
    public final TableField<UcMemberFamilyInfoRecord, Timestamp> UPDATE_AT = createField("update_at", org.jooq.impl.SQLDataType.TIMESTAMP, this, "更新时间");

    /**
     * The column <code>xbkj.uc_member_family_info.del_flag</code>. 删除标志
     */
    public final TableField<UcMemberFamilyInfoRecord, Boolean> DEL_FLAG = createField("del_flag", org.jooq.impl.SQLDataType.BIT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("b'0'", org.jooq.impl.SQLDataType.BIT)), this, "删除标志");

    /**
     * The column <code>xbkj.uc_member_family_info.version</code>.
     */
    public final TableField<UcMemberFamilyInfoRecord, Long> VERSION = createField("version", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>xbkj.uc_member_family_info.province</code>. 所在省份
     */
    public final TableField<UcMemberFamilyInfoRecord, String> PROVINCE = createField("province", org.jooq.impl.SQLDataType.VARCHAR(16), this, "所在省份");

    /**
     * The column <code>xbkj.uc_member_family_info.city</code>. 所在城市
     */
    public final TableField<UcMemberFamilyInfoRecord, String> CITY = createField("city", org.jooq.impl.SQLDataType.VARCHAR(16), this, "所在城市");

    /**
     * The column <code>xbkj.uc_member_family_info.area</code>. 区域
     */
    public final TableField<UcMemberFamilyInfoRecord, String> AREA = createField("area", org.jooq.impl.SQLDataType.VARCHAR(255), this, "区域");

    /**
     * Create a <code>xbkj.uc_member_family_info</code> table reference
     */
    public UcMemberFamilyInfo() {
        this(DSL.name("uc_member_family_info"), null);
    }

    /**
     * Create an aliased <code>xbkj.uc_member_family_info</code> table reference
     */
    public UcMemberFamilyInfo(String alias) {
        this(DSL.name(alias), UC_MEMBER_FAMILY_INFO);
    }

    /**
     * Create an aliased <code>xbkj.uc_member_family_info</code> table reference
     */
    public UcMemberFamilyInfo(Name alias) {
        this(alias, UC_MEMBER_FAMILY_INFO);
    }

    private UcMemberFamilyInfo(Name alias, Table<UcMemberFamilyInfoRecord> aliased) {
        this(alias, aliased, null);
    }

    private UcMemberFamilyInfo(Name alias, Table<UcMemberFamilyInfoRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "家庭资料表");
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
        return Arrays.<Index>asList(Indexes.UC_MEMBER_FAMILY_INFO_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<UcMemberFamilyInfoRecord, Long> getIdentity() {
        return Keys.IDENTITY_UC_MEMBER_FAMILY_INFO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<UcMemberFamilyInfoRecord> getPrimaryKey() {
        return Keys.KEY_UC_MEMBER_FAMILY_INFO_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<UcMemberFamilyInfoRecord>> getKeys() {
        return Arrays.<UniqueKey<UcMemberFamilyInfoRecord>>asList(Keys.KEY_UC_MEMBER_FAMILY_INFO_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UcMemberFamilyInfo as(String alias) {
        return new UcMemberFamilyInfo(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UcMemberFamilyInfo as(Name alias) {
        return new UcMemberFamilyInfo(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public UcMemberFamilyInfo rename(String name) {
        return new UcMemberFamilyInfo(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public UcMemberFamilyInfo rename(Name name) {
        return new UcMemberFamilyInfo(name, null);
    }
}
