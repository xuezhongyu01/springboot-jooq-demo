/*
 * This file is generated by jOOQ.
*/
package com.jooq.domain.tables;


import com.jooq.domain.Indexes;
import com.jooq.domain.Keys;
import com.jooq.domain.Xbkj;
import com.jooq.domain.enums.BscFileBelongToOwnerOwnerType;
import com.jooq.domain.tables.records.BscFileBelongToOwnerRecord;

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
 * 文件所属关系表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class BscFileBelongToOwner extends TableImpl<BscFileBelongToOwnerRecord> {

    private static final long serialVersionUID = -898246179;

    /**
     * The reference instance of <code>xbkj.bsc_file_belong_to_owner</code>
     */
    public static final BscFileBelongToOwner BSC_FILE_BELONG_TO_OWNER = new BscFileBelongToOwner();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<BscFileBelongToOwnerRecord> getRecordType() {
        return BscFileBelongToOwnerRecord.class;
    }

    /**
     * The column <code>xbkj.bsc_file_belong_to_owner.id</code>. id
     */
    public final TableField<BscFileBelongToOwnerRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).identity(true), this, "id");

    /**
     * The column <code>xbkj.bsc_file_belong_to_owner.bsc_file_id</code>. 文件表id
     */
    public final TableField<BscFileBelongToOwnerRecord, Long> BSC_FILE_ID = createField("bsc_file_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "文件表id");

    /**
     * The column <code>xbkj.bsc_file_belong_to_owner.owner_id</code>. 此文件拥有者ID
     */
    public final TableField<BscFileBelongToOwnerRecord, String> OWNER_ID = createField("owner_id", org.jooq.impl.SQLDataType.VARCHAR(45).nullable(false), this, "此文件拥有者ID");

    /**
     * The column <code>xbkj.bsc_file_belong_to_owner.owner_type</code>. 拥有者类型
     */
    public final TableField<BscFileBelongToOwnerRecord, BscFileBelongToOwnerOwnerType> OWNER_TYPE = createField("owner_type", org.jooq.impl.SQLDataType.VARCHAR(7).nullable(false).asEnumDataType(com.jooq.domain.enums.BscFileBelongToOwnerOwnerType.class), this, "拥有者类型");

    /**
     * The column <code>xbkj.bsc_file_belong_to_owner.create_at</code>. 创建时间
     */
    public final TableField<BscFileBelongToOwnerRecord, Timestamp> CREATE_AT = createField("create_at", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "创建时间");

    /**
     * The column <code>xbkj.bsc_file_belong_to_owner.update_at</code>. 更新时间
     */
    public final TableField<BscFileBelongToOwnerRecord, Timestamp> UPDATE_AT = createField("update_at", org.jooq.impl.SQLDataType.TIMESTAMP, this, "更新时间");

    /**
     * The column <code>xbkj.bsc_file_belong_to_owner.del_flag</code>. 删除标志
     */
    public final TableField<BscFileBelongToOwnerRecord, Boolean> DEL_FLAG = createField("del_flag", org.jooq.impl.SQLDataType.BIT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("b'0'", org.jooq.impl.SQLDataType.BIT)), this, "删除标志");

    /**
     * Create a <code>xbkj.bsc_file_belong_to_owner</code> table reference
     */
    public BscFileBelongToOwner() {
        this(DSL.name("bsc_file_belong_to_owner"), null);
    }

    /**
     * Create an aliased <code>xbkj.bsc_file_belong_to_owner</code> table reference
     */
    public BscFileBelongToOwner(String alias) {
        this(DSL.name(alias), BSC_FILE_BELONG_TO_OWNER);
    }

    /**
     * Create an aliased <code>xbkj.bsc_file_belong_to_owner</code> table reference
     */
    public BscFileBelongToOwner(Name alias) {
        this(alias, BSC_FILE_BELONG_TO_OWNER);
    }

    private BscFileBelongToOwner(Name alias, Table<BscFileBelongToOwnerRecord> aliased) {
        this(alias, aliased, null);
    }

    private BscFileBelongToOwner(Name alias, Table<BscFileBelongToOwnerRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "文件所属关系表");
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
        return Arrays.<Index>asList(Indexes.BSC_FILE_BELONG_TO_OWNER_INDEX_ATTACHMENT_KEY, Indexes.BSC_FILE_BELONG_TO_OWNER_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<BscFileBelongToOwnerRecord, Long> getIdentity() {
        return Keys.IDENTITY_BSC_FILE_BELONG_TO_OWNER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<BscFileBelongToOwnerRecord> getPrimaryKey() {
        return Keys.KEY_BSC_FILE_BELONG_TO_OWNER_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<BscFileBelongToOwnerRecord>> getKeys() {
        return Arrays.<UniqueKey<BscFileBelongToOwnerRecord>>asList(Keys.KEY_BSC_FILE_BELONG_TO_OWNER_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BscFileBelongToOwner as(String alias) {
        return new BscFileBelongToOwner(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BscFileBelongToOwner as(Name alias) {
        return new BscFileBelongToOwner(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public BscFileBelongToOwner rename(String name) {
        return new BscFileBelongToOwner(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public BscFileBelongToOwner rename(Name name) {
        return new BscFileBelongToOwner(name, null);
    }
}
