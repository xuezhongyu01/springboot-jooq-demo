/*
 * This file is generated by jOOQ.
*/
package com.jooq.domain.tables;


import com.jooq.domain.Indexes;
import com.jooq.domain.Keys;
import com.jooq.domain.Xbkj;
import com.jooq.domain.enums.UcTagLinkType;
import com.jooq.domain.tables.records.UcTagLinkRecord;

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
 * 标签对应表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UcTagLink extends TableImpl<UcTagLinkRecord> {

    private static final long serialVersionUID = 2046323710;

    /**
     * The reference instance of <code>xbkj.uc_tag_link</code>
     */
    public static final UcTagLink UC_TAG_LINK = new UcTagLink();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<UcTagLinkRecord> getRecordType() {
        return UcTagLinkRecord.class;
    }

    /**
     * The column <code>xbkj.uc_tag_link.id</code>.
     */
    public final TableField<UcTagLinkRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>xbkj.uc_tag_link.type</code>. 类型：机构，门店，课程
     */
    public final TableField<UcTagLinkRecord, UcTagLinkType> TYPE = createField("type", org.jooq.impl.SQLDataType.VARCHAR(13).nullable(false).defaultValue(org.jooq.impl.DSL.inline("organ", org.jooq.impl.SQLDataType.VARCHAR)).asEnumDataType(com.jooq.domain.enums.UcTagLinkType.class), this, "类型：机构，门店，课程");

    /**
     * The column <code>xbkj.uc_tag_link.tag_id</code>. 标签id
     */
    public final TableField<UcTagLinkRecord, Long> TAG_ID = createField("tag_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "标签id");

    /**
     * The column <code>xbkj.uc_tag_link.source_id</code>. 相对于类型的id
     */
    public final TableField<UcTagLinkRecord, Long> SOURCE_ID = createField("source_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "相对于类型的id");

    /**
     * The column <code>xbkj.uc_tag_link.create_at</code>. 创建时间
     */
    public final TableField<UcTagLinkRecord, Timestamp> CREATE_AT = createField("create_at", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "创建时间");

    /**
     * The column <code>xbkj.uc_tag_link.update_at</code>. 更新时间
     */
    public final TableField<UcTagLinkRecord, Timestamp> UPDATE_AT = createField("update_at", org.jooq.impl.SQLDataType.TIMESTAMP, this, "更新时间");

    /**
     * The column <code>xbkj.uc_tag_link.del_flag</code>. 删除标志
     */
    public final TableField<UcTagLinkRecord, Boolean> DEL_FLAG = createField("del_flag", org.jooq.impl.SQLDataType.BIT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("b'0'", org.jooq.impl.SQLDataType.BIT)), this, "删除标志");

    /**
     * The column <code>xbkj.uc_tag_link.version</code>.
     */
    public final TableField<UcTagLinkRecord, Long> VERSION = createField("version", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * Create a <code>xbkj.uc_tag_link</code> table reference
     */
    public UcTagLink() {
        this(DSL.name("uc_tag_link"), null);
    }

    /**
     * Create an aliased <code>xbkj.uc_tag_link</code> table reference
     */
    public UcTagLink(String alias) {
        this(DSL.name(alias), UC_TAG_LINK);
    }

    /**
     * Create an aliased <code>xbkj.uc_tag_link</code> table reference
     */
    public UcTagLink(Name alias) {
        this(alias, UC_TAG_LINK);
    }

    private UcTagLink(Name alias, Table<UcTagLinkRecord> aliased) {
        this(alias, aliased, null);
    }

    private UcTagLink(Name alias, Table<UcTagLinkRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "标签对应表");
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
        return Arrays.<Index>asList(Indexes.UC_TAG_LINK_INDEX_SOURCE_ID, Indexes.UC_TAG_LINK_INDEX_TAG_ID, Indexes.UC_TAG_LINK_PRIMARY, Indexes.UC_TAG_LINK_TYPE);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<UcTagLinkRecord, Long> getIdentity() {
        return Keys.IDENTITY_UC_TAG_LINK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<UcTagLinkRecord> getPrimaryKey() {
        return Keys.KEY_UC_TAG_LINK_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<UcTagLinkRecord>> getKeys() {
        return Arrays.<UniqueKey<UcTagLinkRecord>>asList(Keys.KEY_UC_TAG_LINK_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UcTagLink as(String alias) {
        return new UcTagLink(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UcTagLink as(Name alias) {
        return new UcTagLink(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public UcTagLink rename(String name) {
        return new UcTagLink(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public UcTagLink rename(Name name) {
        return new UcTagLink(name, null);
    }
}
