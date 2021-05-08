/*
 * This file is generated by jOOQ.
*/
package com.jooq.domain.tables;


import com.jooq.domain.Indexes;
import com.jooq.domain.Keys;
import com.jooq.domain.Xbkj;
import com.jooq.domain.tables.records.FdEbusinessAddressRecord;

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
 * 电商地址信息
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class FdEbusinessAddress extends TableImpl<FdEbusinessAddressRecord> {

    private static final long serialVersionUID = 987632368;

    /**
     * The reference instance of <code>xbkj.fd_ebusiness_address</code>
     */
    public static final FdEbusinessAddress FD_EBUSINESS_ADDRESS = new FdEbusinessAddress();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<FdEbusinessAddressRecord> getRecordType() {
        return FdEbusinessAddressRecord.class;
    }

    /**
     * The column <code>xbkj.fd_ebusiness_address.id</code>.
     */
    public final TableField<FdEbusinessAddressRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>xbkj.fd_ebusiness_address.account_id</code>. 账户ID
     */
    public final TableField<FdEbusinessAddressRecord, Long> ACCOUNT_ID = createField("account_id", org.jooq.impl.SQLDataType.BIGINT, this, "账户ID");

    /**
     * The column <code>xbkj.fd_ebusiness_address.name</code>. 收货人姓名
     */
    public final TableField<FdEbusinessAddressRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR(32), this, "收货人姓名");

    /**
     * The column <code>xbkj.fd_ebusiness_address.phone</code>. 收货人电话
     */
    public final TableField<FdEbusinessAddressRecord, String> PHONE = createField("phone", org.jooq.impl.SQLDataType.VARCHAR(128), this, "收货人电话");

    /**
     * The column <code>xbkj.fd_ebusiness_address.address_area</code>. 所在区域
     */
    public final TableField<FdEbusinessAddressRecord, String> ADDRESS_AREA = createField("address_area", org.jooq.impl.SQLDataType.VARCHAR(128), this, "所在区域");

    /**
     * The column <code>xbkj.fd_ebusiness_address.address_detail</code>. 详细地址
     */
    public final TableField<FdEbusinessAddressRecord, String> ADDRESS_DETAIL = createField("address_detail", org.jooq.impl.SQLDataType.VARCHAR(128), this, "详细地址");

    /**
     * The column <code>xbkj.fd_ebusiness_address.postcode</code>. 邮编
     */
    public final TableField<FdEbusinessAddressRecord, String> POSTCODE = createField("postcode", org.jooq.impl.SQLDataType.VARCHAR(16), this, "邮编");

    /**
     * The column <code>xbkj.fd_ebusiness_address.is_default</code>. 是否默认地址
     */
    public final TableField<FdEbusinessAddressRecord, String> IS_DEFAULT = createField("is_default", org.jooq.impl.SQLDataType.VARCHAR(32), this, "是否默认地址");

    /**
     * The column <code>xbkj.fd_ebusiness_address.create_at</code>. 创建时间
     */
    public final TableField<FdEbusinessAddressRecord, Timestamp> CREATE_AT = createField("create_at", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "创建时间");

    /**
     * The column <code>xbkj.fd_ebusiness_address.update_at</code>. 更新时间
     */
    public final TableField<FdEbusinessAddressRecord, Timestamp> UPDATE_AT = createField("update_at", org.jooq.impl.SQLDataType.TIMESTAMP, this, "更新时间");

    /**
     * The column <code>xbkj.fd_ebusiness_address.del_flag</code>. 删除标志
     */
    public final TableField<FdEbusinessAddressRecord, Boolean> DEL_FLAG = createField("del_flag", org.jooq.impl.SQLDataType.BIT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("b'0'", org.jooq.impl.SQLDataType.BIT)), this, "删除标志");

    /**
     * The column <code>xbkj.fd_ebusiness_address.version</code>.
     */
    public final TableField<FdEbusinessAddressRecord, Long> VERSION = createField("version", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * Create a <code>xbkj.fd_ebusiness_address</code> table reference
     */
    public FdEbusinessAddress() {
        this(DSL.name("fd_ebusiness_address"), null);
    }

    /**
     * Create an aliased <code>xbkj.fd_ebusiness_address</code> table reference
     */
    public FdEbusinessAddress(String alias) {
        this(DSL.name(alias), FD_EBUSINESS_ADDRESS);
    }

    /**
     * Create an aliased <code>xbkj.fd_ebusiness_address</code> table reference
     */
    public FdEbusinessAddress(Name alias) {
        this(alias, FD_EBUSINESS_ADDRESS);
    }

    private FdEbusinessAddress(Name alias, Table<FdEbusinessAddressRecord> aliased) {
        this(alias, aliased, null);
    }

    private FdEbusinessAddress(Name alias, Table<FdEbusinessAddressRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "电商地址信息");
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
        return Arrays.<Index>asList(Indexes.FD_EBUSINESS_ADDRESS_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<FdEbusinessAddressRecord, Long> getIdentity() {
        return Keys.IDENTITY_FD_EBUSINESS_ADDRESS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<FdEbusinessAddressRecord> getPrimaryKey() {
        return Keys.KEY_FD_EBUSINESS_ADDRESS_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<FdEbusinessAddressRecord>> getKeys() {
        return Arrays.<UniqueKey<FdEbusinessAddressRecord>>asList(Keys.KEY_FD_EBUSINESS_ADDRESS_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FdEbusinessAddress as(String alias) {
        return new FdEbusinessAddress(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FdEbusinessAddress as(Name alias) {
        return new FdEbusinessAddress(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public FdEbusinessAddress rename(String name) {
        return new FdEbusinessAddress(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public FdEbusinessAddress rename(Name name) {
        return new FdEbusinessAddress(name, null);
    }
}