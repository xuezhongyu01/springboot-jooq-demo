/*
 * This file is generated by jOOQ.
*/
package com.jooq.domain.tables.pojos;


import java.io.Serializable;
import java.sql.Timestamp;

import javax.annotation.Generated;


/**
 * 授权码模式
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class OauthCode implements Serializable {

    private static final long serialVersionUID = 277166895;

    private Long      id;
    private String    code;
    private Long      memeberId;
    private Long      oauthClientId;
    private Timestamp createAt;
    private Timestamp updateAt;

    public OauthCode() {}

    public OauthCode(OauthCode value) {
        this.id = value.id;
        this.code = value.code;
        this.memeberId = value.memeberId;
        this.oauthClientId = value.oauthClientId;
        this.createAt = value.createAt;
        this.updateAt = value.updateAt;
    }

    public OauthCode(
        Long      id,
        String    code,
        Long      memeberId,
        Long      oauthClientId,
        Timestamp createAt,
        Timestamp updateAt
    ) {
        this.id = id;
        this.code = code;
        this.memeberId = memeberId;
        this.oauthClientId = oauthClientId;
        this.createAt = createAt;
        this.updateAt = updateAt;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Long getMemeberId() {
        return this.memeberId;
    }

    public void setMemeberId(Long memeberId) {
        this.memeberId = memeberId;
    }

    public Long getOauthClientId() {
        return this.oauthClientId;
    }

    public void setOauthClientId(Long oauthClientId) {
        this.oauthClientId = oauthClientId;
    }

    public Timestamp getCreateAt() {
        return this.createAt;
    }

    public void setCreateAt(Timestamp createAt) {
        this.createAt = createAt;
    }

    public Timestamp getUpdateAt() {
        return this.updateAt;
    }

    public void setUpdateAt(Timestamp updateAt) {
        this.updateAt = updateAt;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("OauthCode (");

        sb.append(id);
        sb.append(", ").append(code);
        sb.append(", ").append(memeberId);
        sb.append(", ").append(oauthClientId);
        sb.append(", ").append(createAt);
        sb.append(", ").append(updateAt);

        sb.append(")");
        return sb.toString();
    }
}
