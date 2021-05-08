/*
 * This file is generated by jOOQ.
*/
package com.jooq.domain.tables.pojos;


import java.io.Serializable;
import java.sql.Timestamp;

import javax.annotation.Generated;


/**
 * 紧急联系人表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UcMemberEmergencyContact implements Serializable {

    private static final long serialVersionUID = -2136768127;

    private Long      id;
    private Long      memberId;
    private String    emergencyContact;
    private String    emergencyPhone;
    private String    emergencyContactRelationship;
    private Timestamp createAt;
    private Timestamp updateAt;
    private Boolean   delFlag;
    private Long      version;

    public UcMemberEmergencyContact() {}

    public UcMemberEmergencyContact(UcMemberEmergencyContact value) {
        this.id = value.id;
        this.memberId = value.memberId;
        this.emergencyContact = value.emergencyContact;
        this.emergencyPhone = value.emergencyPhone;
        this.emergencyContactRelationship = value.emergencyContactRelationship;
        this.createAt = value.createAt;
        this.updateAt = value.updateAt;
        this.delFlag = value.delFlag;
        this.version = value.version;
    }

    public UcMemberEmergencyContact(
        Long      id,
        Long      memberId,
        String    emergencyContact,
        String    emergencyPhone,
        String    emergencyContactRelationship,
        Timestamp createAt,
        Timestamp updateAt,
        Boolean   delFlag,
        Long      version
    ) {
        this.id = id;
        this.memberId = memberId;
        this.emergencyContact = emergencyContact;
        this.emergencyPhone = emergencyPhone;
        this.emergencyContactRelationship = emergencyContactRelationship;
        this.createAt = createAt;
        this.updateAt = updateAt;
        this.delFlag = delFlag;
        this.version = version;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getMemberId() {
        return this.memberId;
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    public String getEmergencyContact() {
        return this.emergencyContact;
    }

    public void setEmergencyContact(String emergencyContact) {
        this.emergencyContact = emergencyContact;
    }

    public String getEmergencyPhone() {
        return this.emergencyPhone;
    }

    public void setEmergencyPhone(String emergencyPhone) {
        this.emergencyPhone = emergencyPhone;
    }

    public String getEmergencyContactRelationship() {
        return this.emergencyContactRelationship;
    }

    public void setEmergencyContactRelationship(String emergencyContactRelationship) {
        this.emergencyContactRelationship = emergencyContactRelationship;
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

    public Boolean getDelFlag() {
        return this.delFlag;
    }

    public void setDelFlag(Boolean delFlag) {
        this.delFlag = delFlag;
    }

    public Long getVersion() {
        return this.version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("UcMemberEmergencyContact (");

        sb.append(id);
        sb.append(", ").append(memberId);
        sb.append(", ").append(emergencyContact);
        sb.append(", ").append(emergencyPhone);
        sb.append(", ").append(emergencyContactRelationship);
        sb.append(", ").append(createAt);
        sb.append(", ").append(updateAt);
        sb.append(", ").append(delFlag);
        sb.append(", ").append(version);

        sb.append(")");
        return sb.toString();
    }
}