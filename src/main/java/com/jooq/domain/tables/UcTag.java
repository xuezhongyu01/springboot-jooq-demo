/*
 * This file is generated by jOOQ.
*/
package com.jooq.domain.tables;


import com.jooq.domain.Indexes;
import com.jooq.domain.Keys;
import com.jooq.domain.Xbkj;
import com.jooq.domain.enums.UcTagType;
import com.jooq.domain.tables.records.UcTagRecord;

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
 * 标签表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UcTag extends TableImpl<UcTagRecord> {

    private static final long serialVersionUID = -425680447;

    /**
     * The reference instance of <code>xbkj.uc_tag</code>
     */
    public static final UcTag UC_TAG = new UcTag();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<UcTagRecord> getRecordType() {
        return UcTagRecord.class;
    }

    /**
     * The column <code>xbkj.uc_tag.id</code>.
     */
    public final TableField<UcTagRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>xbkj.uc_tag.type</code>. 类型：机构，门店，课程
     */
    public final TableField<UcTagRecord, UcTagType> TYPE = createField("type", org.jooq.impl.SQLDataType.VARCHAR(13).nullable(false).defaultValue(org.jooq.impl.DSL.inline("organ", org.jooq.impl.SQLDataType.VARCHAR)).asEnumDataType(com.jooq.domain.enums.UcTagType.class), this, "类型：机构，门店，课程");

    /**
     * The column <code>xbkj.uc_tag.name</code>. 标签
     */
    public final TableField<UcTagRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR(255), this, "标签");

    /**
     * The column <code>xbkj.uc_tag.create_at</code>. 创建时间
     */
    public final TableField<UcTagRecord, Timestamp> CREATE_AT = createField("create_at", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "创建时间");

    /**
     * The column <code>xbkj.uc_tag.update_at</code>. 更新时间
     */
    public final TableField<UcTagRecord, Timestamp> UPDATE_AT = createField("update_at", org.jooq.impl.SQLDataType.TIMESTAMP, this, "更新时间");

    /**
     * The column <code>xbkj.uc_tag.del_flag</code>. 删除标志
     */
    public final TableField<UcTagRecord, Boolean> DEL_FLAG = createField("del_flag", org.jooq.impl.SQLDataType.BIT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("b'0'", org.jooq.impl.SQLDataType.BIT)), this, "删除标志");

    /**
     * The column <code>xbkj.uc_tag.version</code>.
     */
    public final TableField<UcTagRecord, Long> VERSION = createField("version", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * Create a <code>xbkj.uc_tag</code> table reference
     */
    public UcTag() {
        this(DSL.name("uc_tag"), null);
    }

    /**
     * Create an aliased <code>xbkj.uc_tag</code> table reference
     */
    public UcTag(String alias) {
        this(DSL.name(alias), UC_TAG);
    }

    /**
     * Create an aliased <code>xbkj.uc_tag</code> table reference
     */
    public UcTag(Name alias) {
        this(alias, UC_TAG);
    }

    private UcTag(Name alias, Table<UcTagRecord> aliased) {
        this(alias, aliased, null);
    }

    private UcTag(Name alias, Table<UcTagRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "标签表");
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
        return Arrays.<Index>asList(Indexes.UC_TAG_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<UcTagRecord, Long> getIdentity() {
        return Keys.IDENTITY_UC_TAG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<UcTagRecord> getPrimaryKey() {
        return Keys.KEY_UC_TAG_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<UcTagRecord>> getKeys() {
        return Arrays.<UniqueKey<UcTagRecord>>asList(Keys.KEY_UC_TAG_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UcTag as(String alias) {
        return new UcTag(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UcTag as(Name alias) {
        return new UcTag(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public UcTag rename(String name) {
        return new UcTag(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public UcTag rename(Name name) {
        return new UcTag(name, null);
    }
}
