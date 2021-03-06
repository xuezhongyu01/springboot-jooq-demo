/*
 * This file is generated by jOOQ.
*/
package com.jooq.domain.tables;


import com.jooq.domain.Indexes;
import com.jooq.domain.Keys;
import com.jooq.domain.Xbkj;
import com.jooq.domain.enums.BscFileStorageWay;
import com.jooq.domain.tables.records.BscFileRecord;

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
 * 文件表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class BscFile extends TableImpl<BscFileRecord> {

    private static final long serialVersionUID = 1352866413;

    /**
     * The reference instance of <code>xbkj.bsc_file</code>
     */
    public static final BscFile BSC_FILE = new BscFile();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<BscFileRecord> getRecordType() {
        return BscFileRecord.class;
    }

    /**
     * The column <code>xbkj.bsc_file.id</code>.
     */
    public final TableField<BscFileRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>xbkj.bsc_file.file_name</code>. 文件名字
     */
    public final TableField<BscFileRecord, String> FILE_NAME = createField("file_name", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "文件名字");

    /**
     * The column <code>xbkj.bsc_file.file_url</code>. 文件url
     */
    public final TableField<BscFileRecord, String> FILE_URL = createField("file_url", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "文件url");

    /**
     * The column <code>xbkj.bsc_file.file_size</code>. 文件大小
     */
    public final TableField<BscFileRecord, Long> FILE_SIZE = createField("file_size", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "文件大小");

    /**
     * The column <code>xbkj.bsc_file.file_ext</code>. 文件后缀名
     */
    public final TableField<BscFileRecord, String> FILE_EXT = createField("file_ext", org.jooq.impl.SQLDataType.VARCHAR(10), this, "文件后缀名");

    /**
     * The column <code>xbkj.bsc_file.upload_time</code>. 上传时间
     */
    public final TableField<BscFileRecord, Timestamp> UPLOAD_TIME = createField("upload_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "上传时间");

    /**
     * The column <code>xbkj.bsc_file.file_desc</code>.
     */
    public final TableField<BscFileRecord, String> FILE_DESC = createField("file_desc", org.jooq.impl.SQLDataType.VARCHAR(45), this, "");

    /**
     * The column <code>xbkj.bsc_file.storage_way</code>. 存储方式
     */
    public final TableField<BscFileRecord, BscFileStorageWay> STORAGE_WAY = createField("storage_way", org.jooq.impl.SQLDataType.VARCHAR(6).defaultValue(org.jooq.impl.DSL.inline("qiniu", org.jooq.impl.SQLDataType.VARCHAR)).asEnumDataType(com.jooq.domain.enums.BscFileStorageWay.class), this, "存储方式");

    /**
     * The column <code>xbkj.bsc_file.create_at</code>. 创建时间
     */
    public final TableField<BscFileRecord, Timestamp> CREATE_AT = createField("create_at", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "创建时间");

    /**
     * The column <code>xbkj.bsc_file.update_at</code>. 更新时间
     */
    public final TableField<BscFileRecord, Timestamp> UPDATE_AT = createField("update_at", org.jooq.impl.SQLDataType.TIMESTAMP, this, "更新时间");

    /**
     * The column <code>xbkj.bsc_file.remarks</code>. 备注信息
     */
    public final TableField<BscFileRecord, String> REMARKS = createField("remarks", org.jooq.impl.SQLDataType.VARCHAR(255), this, "备注信息");

    /**
     * The column <code>xbkj.bsc_file.del_flag</code>. 删除标志
     */
    public final TableField<BscFileRecord, Boolean> DEL_FLAG = createField("del_flag", org.jooq.impl.SQLDataType.BIT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("b'0'", org.jooq.impl.SQLDataType.BIT)), this, "删除标志");

    /**
     * Create a <code>xbkj.bsc_file</code> table reference
     */
    public BscFile() {
        this(DSL.name("bsc_file"), null);
    }

    /**
     * Create an aliased <code>xbkj.bsc_file</code> table reference
     */
    public BscFile(String alias) {
        this(DSL.name(alias), BSC_FILE);
    }

    /**
     * Create an aliased <code>xbkj.bsc_file</code> table reference
     */
    public BscFile(Name alias) {
        this(alias, BSC_FILE);
    }

    private BscFile(Name alias, Table<BscFileRecord> aliased) {
        this(alias, aliased, null);
    }

    private BscFile(Name alias, Table<BscFileRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "文件表");
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
        return Arrays.<Index>asList(Indexes.BSC_FILE_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<BscFileRecord, Long> getIdentity() {
        return Keys.IDENTITY_BSC_FILE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<BscFileRecord> getPrimaryKey() {
        return Keys.KEY_BSC_FILE_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<BscFileRecord>> getKeys() {
        return Arrays.<UniqueKey<BscFileRecord>>asList(Keys.KEY_BSC_FILE_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BscFile as(String alias) {
        return new BscFile(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BscFile as(Name alias) {
        return new BscFile(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public BscFile rename(String name) {
        return new BscFile(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public BscFile rename(Name name) {
        return new BscFile(name, null);
    }
}
