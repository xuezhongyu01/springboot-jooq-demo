/*
 * This file is generated by jOOQ.
*/
package com.jooq.domain.tables.records;


import com.jooq.domain.enums.OauthClientDetailsGrantTypes;
import com.jooq.domain.enums.OauthClientDetailsLoginSource;
import com.jooq.domain.tables.OauthClientDetails;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record21;
import org.jooq.Row21;
import org.jooq.impl.UpdatableRecordImpl;


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
public class OauthClientDetailsRecord extends UpdatableRecordImpl<OauthClientDetailsRecord> implements Record21<Long, String, String, String, String, String, String, String, OauthClientDetailsGrantTypes, String, String, Integer, Integer, String, Boolean, OauthClientDetailsLoginSource, Timestamp, Timestamp, String, Boolean, Long> {

    private static final long serialVersionUID = -2113940127;

    /**
     * Setter for <code>xbkj.oauth_client_details.id</code>. 编号
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>xbkj.oauth_client_details.id</code>. 编号
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>xbkj.oauth_client_details.client_id</code>. 客户端ID
     */
    public void setClientId(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>xbkj.oauth_client_details.client_id</code>. 客户端ID
     */
    public String getClientId() {
        return (String) get(1);
    }

    /**
     * Setter for <code>xbkj.oauth_client_details.client_secret</code>. 客户端秘钥
     */
    public void setClientSecret(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>xbkj.oauth_client_details.client_secret</code>. 客户端秘钥
     */
    public String getClientSecret() {
        return (String) get(2);
    }

    /**
     * Setter for <code>xbkj.oauth_client_details.client_name</code>. 客户端名称
     */
    public void setClientName(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>xbkj.oauth_client_details.client_name</code>. 客户端名称
     */
    public String getClientName() {
        return (String) get(3);
    }

    /**
     * Setter for <code>xbkj.oauth_client_details.client_uri</code>. 客户端跳转地址
     */
    public void setClientUri(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>xbkj.oauth_client_details.client_uri</code>. 客户端跳转地址
     */
    public String getClientUri() {
        return (String) get(4);
    }

    /**
     * Setter for <code>xbkj.oauth_client_details.client_icon_uri</code>. 客户端图标URL
     */
    public void setClientIconUri(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>xbkj.oauth_client_details.client_icon_uri</code>. 客户端图标URL
     */
    public String getClientIconUri() {
        return (String) get(5);
    }

    /**
     * Setter for <code>xbkj.oauth_client_details.resource_ids</code>. 客户端能访问的资源ID
     */
    public void setResourceIds(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>xbkj.oauth_client_details.resource_ids</code>. 客户端能访问的资源ID
     */
    public String getResourceIds() {
        return (String) get(6);
    }

    /**
     * Setter for <code>xbkj.oauth_client_details.scope</code>. 客户端权限范围
     */
    public void setScope(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>xbkj.oauth_client_details.scope</code>. 客户端权限范围
     */
    public String getScope() {
        return (String) get(7);
    }

    /**
     * Setter for <code>xbkj.oauth_client_details.grant_types</code>. 授权模式
     */
    public void setGrantTypes(OauthClientDetailsGrantTypes value) {
        set(8, value);
    }

    /**
     * Getter for <code>xbkj.oauth_client_details.grant_types</code>. 授权模式
     */
    public OauthClientDetailsGrantTypes getGrantTypes() {
        return (OauthClientDetailsGrantTypes) get(8);
    }

    /**
     * Setter for <code>xbkj.oauth_client_details.redirect_uri</code>. 回调地址
     */
    public void setRedirectUri(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>xbkj.oauth_client_details.redirect_uri</code>. 回调地址
     */
    public String getRedirectUri() {
        return (String) get(9);
    }

    /**
     * Setter for <code>xbkj.oauth_client_details.roles</code>. 角色
     */
    public void setRoles(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>xbkj.oauth_client_details.roles</code>. 角色
     */
    public String getRoles() {
        return (String) get(10);
    }

    /**
     * Setter for <code>xbkj.oauth_client_details.access_token_validity</code>.
     */
    public void setAccessTokenValidity(Integer value) {
        set(11, value);
    }

    /**
     * Getter for <code>xbkj.oauth_client_details.access_token_validity</code>.
     */
    public Integer getAccessTokenValidity() {
        return (Integer) get(11);
    }

    /**
     * Setter for <code>xbkj.oauth_client_details.refresh_token_validity</code>.
     */
    public void setRefreshTokenValidity(Integer value) {
        set(12, value);
    }

    /**
     * Getter for <code>xbkj.oauth_client_details.refresh_token_validity</code>.
     */
    public Integer getRefreshTokenValidity() {
        return (Integer) get(12);
    }

    /**
     * Setter for <code>xbkj.oauth_client_details.description</code>.
     */
    public void setDescription(String value) {
        set(13, value);
    }

    /**
     * Getter for <code>xbkj.oauth_client_details.description</code>.
     */
    public String getDescription() {
        return (String) get(13);
    }

    /**
     * Setter for <code>xbkj.oauth_client_details.archived</code>. 是否激活
     */
    public void setArchived(Boolean value) {
        set(14, value);
    }

    /**
     * Getter for <code>xbkj.oauth_client_details.archived</code>. 是否激活
     */
    public Boolean getArchived() {
        return (Boolean) get(14);
    }

    /**
     * Setter for <code>xbkj.oauth_client_details.login_source</code>.
     */
    public void setLoginSource(OauthClientDetailsLoginSource value) {
        set(15, value);
    }

    /**
     * Getter for <code>xbkj.oauth_client_details.login_source</code>.
     */
    public OauthClientDetailsLoginSource getLoginSource() {
        return (OauthClientDetailsLoginSource) get(15);
    }

    /**
     * Setter for <code>xbkj.oauth_client_details.create_at</code>. 创建时间
     */
    public void setCreateAt(Timestamp value) {
        set(16, value);
    }

    /**
     * Getter for <code>xbkj.oauth_client_details.create_at</code>. 创建时间
     */
    public Timestamp getCreateAt() {
        return (Timestamp) get(16);
    }

    /**
     * Setter for <code>xbkj.oauth_client_details.update_at</code>. 更新时间
     */
    public void setUpdateAt(Timestamp value) {
        set(17, value);
    }

    /**
     * Getter for <code>xbkj.oauth_client_details.update_at</code>. 更新时间
     */
    public Timestamp getUpdateAt() {
        return (Timestamp) get(17);
    }

    /**
     * Setter for <code>xbkj.oauth_client_details.remarks</code>. 备注信息
     */
    public void setRemarks(String value) {
        set(18, value);
    }

    /**
     * Getter for <code>xbkj.oauth_client_details.remarks</code>. 备注信息
     */
    public String getRemarks() {
        return (String) get(18);
    }

    /**
     * Setter for <code>xbkj.oauth_client_details.del_flag</code>. 删除标记
     */
    public void setDelFlag(Boolean value) {
        set(19, value);
    }

    /**
     * Getter for <code>xbkj.oauth_client_details.del_flag</code>. 删除标记
     */
    public Boolean getDelFlag() {
        return (Boolean) get(19);
    }

    /**
     * Setter for <code>xbkj.oauth_client_details.version</code>.
     */
    public void setVersion(Long value) {
        set(20, value);
    }

    /**
     * Getter for <code>xbkj.oauth_client_details.version</code>.
     */
    public Long getVersion() {
        return (Long) get(20);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record21 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row21<Long, String, String, String, String, String, String, String, OauthClientDetailsGrantTypes, String, String, Integer, Integer, String, Boolean, OauthClientDetailsLoginSource, Timestamp, Timestamp, String, Boolean, Long> fieldsRow() {
        return (Row21) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row21<Long, String, String, String, String, String, String, String, OauthClientDetailsGrantTypes, String, String, Integer, Integer, String, Boolean, OauthClientDetailsLoginSource, Timestamp, Timestamp, String, Boolean, Long> valuesRow() {
        return (Row21) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return OauthClientDetails.OAUTH_CLIENT_DETAILS.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return OauthClientDetails.OAUTH_CLIENT_DETAILS.CLIENT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return OauthClientDetails.OAUTH_CLIENT_DETAILS.CLIENT_SECRET;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return OauthClientDetails.OAUTH_CLIENT_DETAILS.CLIENT_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return OauthClientDetails.OAUTH_CLIENT_DETAILS.CLIENT_URI;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return OauthClientDetails.OAUTH_CLIENT_DETAILS.CLIENT_ICON_URI;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return OauthClientDetails.OAUTH_CLIENT_DETAILS.RESOURCE_IDS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return OauthClientDetails.OAUTH_CLIENT_DETAILS.SCOPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<OauthClientDetailsGrantTypes> field9() {
        return OauthClientDetails.OAUTH_CLIENT_DETAILS.GRANT_TYPES;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field10() {
        return OauthClientDetails.OAUTH_CLIENT_DETAILS.REDIRECT_URI;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field11() {
        return OauthClientDetails.OAUTH_CLIENT_DETAILS.ROLES;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field12() {
        return OauthClientDetails.OAUTH_CLIENT_DETAILS.ACCESS_TOKEN_VALIDITY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field13() {
        return OauthClientDetails.OAUTH_CLIENT_DETAILS.REFRESH_TOKEN_VALIDITY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field14() {
        return OauthClientDetails.OAUTH_CLIENT_DETAILS.DESCRIPTION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field15() {
        return OauthClientDetails.OAUTH_CLIENT_DETAILS.ARCHIVED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<OauthClientDetailsLoginSource> field16() {
        return OauthClientDetails.OAUTH_CLIENT_DETAILS.LOGIN_SOURCE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field17() {
        return OauthClientDetails.OAUTH_CLIENT_DETAILS.CREATE_AT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field18() {
        return OauthClientDetails.OAUTH_CLIENT_DETAILS.UPDATE_AT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field19() {
        return OauthClientDetails.OAUTH_CLIENT_DETAILS.REMARKS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field20() {
        return OauthClientDetails.OAUTH_CLIENT_DETAILS.DEL_FLAG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field21() {
        return OauthClientDetails.OAUTH_CLIENT_DETAILS.VERSION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getClientId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getClientSecret();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getClientName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getClientUri();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getClientIconUri();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getResourceIds();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component8() {
        return getScope();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OauthClientDetailsGrantTypes component9() {
        return getGrantTypes();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component10() {
        return getRedirectUri();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component11() {
        return getRoles();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component12() {
        return getAccessTokenValidity();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component13() {
        return getRefreshTokenValidity();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component14() {
        return getDescription();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component15() {
        return getArchived();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OauthClientDetailsLoginSource component16() {
        return getLoginSource();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component17() {
        return getCreateAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component18() {
        return getUpdateAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component19() {
        return getRemarks();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component20() {
        return getDelFlag();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component21() {
        return getVersion();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getClientId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getClientSecret();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getClientName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getClientUri();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getClientIconUri();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getResourceIds();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getScope();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OauthClientDetailsGrantTypes value9() {
        return getGrantTypes();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value10() {
        return getRedirectUri();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value11() {
        return getRoles();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value12() {
        return getAccessTokenValidity();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value13() {
        return getRefreshTokenValidity();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value14() {
        return getDescription();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value15() {
        return getArchived();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OauthClientDetailsLoginSource value16() {
        return getLoginSource();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value17() {
        return getCreateAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value18() {
        return getUpdateAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value19() {
        return getRemarks();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value20() {
        return getDelFlag();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value21() {
        return getVersion();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OauthClientDetailsRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OauthClientDetailsRecord value2(String value) {
        setClientId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OauthClientDetailsRecord value3(String value) {
        setClientSecret(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OauthClientDetailsRecord value4(String value) {
        setClientName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OauthClientDetailsRecord value5(String value) {
        setClientUri(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OauthClientDetailsRecord value6(String value) {
        setClientIconUri(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OauthClientDetailsRecord value7(String value) {
        setResourceIds(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OauthClientDetailsRecord value8(String value) {
        setScope(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OauthClientDetailsRecord value9(OauthClientDetailsGrantTypes value) {
        setGrantTypes(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OauthClientDetailsRecord value10(String value) {
        setRedirectUri(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OauthClientDetailsRecord value11(String value) {
        setRoles(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OauthClientDetailsRecord value12(Integer value) {
        setAccessTokenValidity(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OauthClientDetailsRecord value13(Integer value) {
        setRefreshTokenValidity(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OauthClientDetailsRecord value14(String value) {
        setDescription(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OauthClientDetailsRecord value15(Boolean value) {
        setArchived(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OauthClientDetailsRecord value16(OauthClientDetailsLoginSource value) {
        setLoginSource(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OauthClientDetailsRecord value17(Timestamp value) {
        setCreateAt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OauthClientDetailsRecord value18(Timestamp value) {
        setUpdateAt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OauthClientDetailsRecord value19(String value) {
        setRemarks(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OauthClientDetailsRecord value20(Boolean value) {
        setDelFlag(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OauthClientDetailsRecord value21(Long value) {
        setVersion(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OauthClientDetailsRecord values(Long value1, String value2, String value3, String value4, String value5, String value6, String value7, String value8, OauthClientDetailsGrantTypes value9, String value10, String value11, Integer value12, Integer value13, String value14, Boolean value15, OauthClientDetailsLoginSource value16, Timestamp value17, Timestamp value18, String value19, Boolean value20, Long value21) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        value12(value12);
        value13(value13);
        value14(value14);
        value15(value15);
        value16(value16);
        value17(value17);
        value18(value18);
        value19(value19);
        value20(value20);
        value21(value21);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached OauthClientDetailsRecord
     */
    public OauthClientDetailsRecord() {
        super(OauthClientDetails.OAUTH_CLIENT_DETAILS);
    }

    /**
     * Create a detached, initialised OauthClientDetailsRecord
     */
    public OauthClientDetailsRecord(Long id, String clientId, String clientSecret, String clientName, String clientUri, String clientIconUri, String resourceIds, String scope, OauthClientDetailsGrantTypes grantTypes, String redirectUri, String roles, Integer accessTokenValidity, Integer refreshTokenValidity, String description, Boolean archived, OauthClientDetailsLoginSource loginSource, Timestamp createAt, Timestamp updateAt, String remarks, Boolean delFlag, Long version) {
        super(OauthClientDetails.OAUTH_CLIENT_DETAILS);

        set(0, id);
        set(1, clientId);
        set(2, clientSecret);
        set(3, clientName);
        set(4, clientUri);
        set(5, clientIconUri);
        set(6, resourceIds);
        set(7, scope);
        set(8, grantTypes);
        set(9, redirectUri);
        set(10, roles);
        set(11, accessTokenValidity);
        set(12, refreshTokenValidity);
        set(13, description);
        set(14, archived);
        set(15, loginSource);
        set(16, createAt);
        set(17, updateAt);
        set(18, remarks);
        set(19, delFlag);
        set(20, version);
    }
}
