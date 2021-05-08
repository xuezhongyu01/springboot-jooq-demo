/*
 * This file is generated by jOOQ.
*/
package com.jooq.domain.tables;


import com.jooq.domain.Indexes;
import com.jooq.domain.Keys;
import com.jooq.domain.Xbkj;
import com.jooq.domain.enums.OauthClientDetailsGrantTypes;
import com.jooq.domain.enums.OauthClientDetailsLoginSource;
import com.jooq.domain.tables.records.OauthClientDetailsRecord;

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
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class OauthClientDetails extends TableImpl<OauthClientDetailsRecord> {

    private static final long serialVersionUID = 993582420;

    /**
     * The reference instance of <code>xbkj.oauth_client_details</code>
     */
    public static final OauthClientDetails OAUTH_CLIENT_DETAILS = new OauthClientDetails();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<OauthClientDetailsRecord> getRecordType() {
        return OauthClientDetailsRecord.class;
    }

    /**
     * The column <code>xbkj.oauth_client_details.id</code>. 编号
     */
    public final TableField<OauthClientDetailsRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).identity(true), this, "编号");

    /**
     * The column <code>xbkj.oauth_client_details.client_id</code>. 客户端ID
     */
    public final TableField<OauthClientDetailsRecord, String> CLIENT_ID = createField("client_id", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "客户端ID");

    /**
     * The column <code>xbkj.oauth_client_details.client_secret</code>. 客户端秘钥
     */
    public final TableField<OauthClientDetailsRecord, String> CLIENT_SECRET = createField("client_secret", org.jooq.impl.SQLDataType.VARCHAR(255), this, "客户端秘钥");

    /**
     * The column <code>xbkj.oauth_client_details.client_name</code>. 客户端名称
     */
    public final TableField<OauthClientDetailsRecord, String> CLIENT_NAME = createField("client_name", org.jooq.impl.SQLDataType.VARCHAR(255), this, "客户端名称");

    /**
     * The column <code>xbkj.oauth_client_details.client_uri</code>. 客户端跳转地址
     */
    public final TableField<OauthClientDetailsRecord, String> CLIENT_URI = createField("client_uri", org.jooq.impl.SQLDataType.VARCHAR(255), this, "客户端跳转地址");

    /**
     * The column <code>xbkj.oauth_client_details.client_icon_uri</code>. 客户端图标URL
     */
    public final TableField<OauthClientDetailsRecord, String> CLIENT_ICON_URI = createField("client_icon_uri", org.jooq.impl.SQLDataType.VARCHAR(255), this, "客户端图标URL");

    /**
     * The column <code>xbkj.oauth_client_details.resource_ids</code>. 客户端能访问的资源ID
     */
    public final TableField<OauthClientDetailsRecord, String> RESOURCE_IDS = createField("resource_ids", org.jooq.impl.SQLDataType.VARCHAR(255), this, "客户端能访问的资源ID");

    /**
     * The column <code>xbkj.oauth_client_details.scope</code>. 客户端权限范围
     */
    public final TableField<OauthClientDetailsRecord, String> SCOPE = createField("scope", org.jooq.impl.SQLDataType.VARCHAR(255), this, "客户端权限范围");

    /**
     * The column <code>xbkj.oauth_client_details.grant_types</code>. 授权模式
     */
    public final TableField<OauthClientDetailsRecord, OauthClientDetailsGrantTypes> GRANT_TYPES = createField("grant_types", org.jooq.impl.SQLDataType.VARCHAR(18).defaultValue(org.jooq.impl.DSL.inline("password", org.jooq.impl.SQLDataType.VARCHAR)).asEnumDataType(com.jooq.domain.enums.OauthClientDetailsGrantTypes.class), this, "授权模式");

    /**
     * The column <code>xbkj.oauth_client_details.redirect_uri</code>. 回调地址
     */
    public final TableField<OauthClientDetailsRecord, String> REDIRECT_URI = createField("redirect_uri", org.jooq.impl.SQLDataType.VARCHAR(255), this, "回调地址");

    /**
     * The column <code>xbkj.oauth_client_details.roles</code>. 角色
     */
    public final TableField<OauthClientDetailsRecord, String> ROLES = createField("roles", org.jooq.impl.SQLDataType.VARCHAR(255), this, "角色");

    /**
     * The column <code>xbkj.oauth_client_details.access_token_validity</code>.
     */
    public final TableField<OauthClientDetailsRecord, Integer> ACCESS_TOKEN_VALIDITY = createField("access_token_validity", org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.inline("-1", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>xbkj.oauth_client_details.refresh_token_validity</code>.
     */
    public final TableField<OauthClientDetailsRecord, Integer> REFRESH_TOKEN_VALIDITY = createField("refresh_token_validity", org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.inline("-1", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>xbkj.oauth_client_details.description</code>.
     */
    public final TableField<OauthClientDetailsRecord, String> DESCRIPTION = createField("description", org.jooq.impl.SQLDataType.VARCHAR(4096), this, "");

    /**
     * The column <code>xbkj.oauth_client_details.archived</code>. 是否激活
     */
    public final TableField<OauthClientDetailsRecord, Boolean> ARCHIVED = createField("archived", org.jooq.impl.SQLDataType.BIT.defaultValue(org.jooq.impl.DSL.inline("b'1'", org.jooq.impl.SQLDataType.BIT)), this, "是否激活");

    /**
     * The column <code>xbkj.oauth_client_details.login_source</code>.
     */
    public final TableField<OauthClientDetailsRecord, OauthClientDetailsLoginSource> LOGIN_SOURCE = createField("login_source", org.jooq.impl.SQLDataType.VARCHAR(7).asEnumDataType(com.jooq.domain.enums.OauthClientDetailsLoginSource.class), this, "");

    /**
     * The column <code>xbkj.oauth_client_details.create_at</code>. 创建时间
     */
    public final TableField<OauthClientDetailsRecord, Timestamp> CREATE_AT = createField("create_at", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "创建时间");

    /**
     * The column <code>xbkj.oauth_client_details.update_at</code>. 更新时间
     */
    public final TableField<OauthClientDetailsRecord, Timestamp> UPDATE_AT = createField("update_at", org.jooq.impl.SQLDataType.TIMESTAMP, this, "更新时间");

    /**
     * The column <code>xbkj.oauth_client_details.remarks</code>. 备注信息
     */
    public final TableField<OauthClientDetailsRecord, String> REMARKS = createField("remarks", org.jooq.impl.SQLDataType.VARCHAR(255), this, "备注信息");

    /**
     * The column <code>xbkj.oauth_client_details.del_flag</code>. 删除标记
     */
    public final TableField<OauthClientDetailsRecord, Boolean> DEL_FLAG = createField("del_flag", org.jooq.impl.SQLDataType.BIT.nullable(false), this, "删除标记");

    /**
     * The column <code>xbkj.oauth_client_details.version</code>.
     */
    public final TableField<OauthClientDetailsRecord, Long> VERSION = createField("version", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * Create a <code>xbkj.oauth_client_details</code> table reference
     */
    public OauthClientDetails() {
        this(DSL.name("oauth_client_details"), null);
    }

    /**
     * Create an aliased <code>xbkj.oauth_client_details</code> table reference
     */
    public OauthClientDetails(String alias) {
        this(DSL.name(alias), OAUTH_CLIENT_DETAILS);
    }

    /**
     * Create an aliased <code>xbkj.oauth_client_details</code> table reference
     */
    public OauthClientDetails(Name alias) {
        this(alias, OAUTH_CLIENT_DETAILS);
    }

    private OauthClientDetails(Name alias, Table<OauthClientDetailsRecord> aliased) {
        this(alias, aliased, null);
    }

    private OauthClientDetails(Name alias, Table<OauthClientDetailsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
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
        return Arrays.<Index>asList(Indexes.OAUTH_CLIENT_DETAILS_PRIMARY, Indexes.OAUTH_CLIENT_DETAILS_UNIQUE_CLIENTID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<OauthClientDetailsRecord, Long> getIdentity() {
        return Keys.IDENTITY_OAUTH_CLIENT_DETAILS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<OauthClientDetailsRecord> getPrimaryKey() {
        return Keys.KEY_OAUTH_CLIENT_DETAILS_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<OauthClientDetailsRecord>> getKeys() {
        return Arrays.<UniqueKey<OauthClientDetailsRecord>>asList(Keys.KEY_OAUTH_CLIENT_DETAILS_PRIMARY, Keys.KEY_OAUTH_CLIENT_DETAILS_UNIQUE_CLIENTID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OauthClientDetails as(String alias) {
        return new OauthClientDetails(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OauthClientDetails as(Name alias) {
        return new OauthClientDetails(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public OauthClientDetails rename(String name) {
        return new OauthClientDetails(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public OauthClientDetails rename(Name name) {
        return new OauthClientDetails(name, null);
    }
}
