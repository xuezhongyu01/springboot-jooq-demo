/*
 * This file is generated by jOOQ.
*/
package com.jooq.domain.tables.pojos;


import com.jooq.domain.enums.UcFamilyIdcardSex;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Timestamp;

import javax.annotation.Generated;


/**
 * 配偶身份证表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UcFamilyIdcard implements Serializable {

    private static final long serialVersionUID = 23006339;

    private Long              id;
    private Long              memberId;
    private String            nation;
    private UcFamilyIdcardSex sex;
    private String            permanentAddress;
    private Date              birthday;
    private String            trueName;
    private Date              identityDateend;
    private Date              identityDatestart;
    private String            identitySingorgan;
    private String            identityBackimgurl;
    private String            identityNumber;
    private String            identityHeadimgurl;
    private String            identityFrontimgurl;
    private Timestamp         createAt;
    private Timestamp         updateAt;
    private Boolean           delFlag;
    private Long              version;

    public UcFamilyIdcard() {}

    public UcFamilyIdcard(UcFamilyIdcard value) {
        this.id = value.id;
        this.memberId = value.memberId;
        this.nation = value.nation;
        this.sex = value.sex;
        this.permanentAddress = value.permanentAddress;
        this.birthday = value.birthday;
        this.trueName = value.trueName;
        this.identityDateend = value.identityDateend;
        this.identityDatestart = value.identityDatestart;
        this.identitySingorgan = value.identitySingorgan;
        this.identityBackimgurl = value.identityBackimgurl;
        this.identityNumber = value.identityNumber;
        this.identityHeadimgurl = value.identityHeadimgurl;
        this.identityFrontimgurl = value.identityFrontimgurl;
        this.createAt = value.createAt;
        this.updateAt = value.updateAt;
        this.delFlag = value.delFlag;
        this.version = value.version;
    }

    public UcFamilyIdcard(
        Long              id,
        Long              memberId,
        String            nation,
        UcFamilyIdcardSex sex,
        String            permanentAddress,
        Date              birthday,
        String            trueName,
        Date              identityDateend,
        Date              identityDatestart,
        String            identitySingorgan,
        String            identityBackimgurl,
        String            identityNumber,
        String            identityHeadimgurl,
        String            identityFrontimgurl,
        Timestamp         createAt,
        Timestamp         updateAt,
        Boolean           delFlag,
        Long              version
    ) {
        this.id = id;
        this.memberId = memberId;
        this.nation = nation;
        this.sex = sex;
        this.permanentAddress = permanentAddress;
        this.birthday = birthday;
        this.trueName = trueName;
        this.identityDateend = identityDateend;
        this.identityDatestart = identityDatestart;
        this.identitySingorgan = identitySingorgan;
        this.identityBackimgurl = identityBackimgurl;
        this.identityNumber = identityNumber;
        this.identityHeadimgurl = identityHeadimgurl;
        this.identityFrontimgurl = identityFrontimgurl;
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

    public String getNation() {
        return this.nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public UcFamilyIdcardSex getSex() {
        return this.sex;
    }

    public void setSex(UcFamilyIdcardSex sex) {
        this.sex = sex;
    }

    public String getPermanentAddress() {
        return this.permanentAddress;
    }

    public void setPermanentAddress(String permanentAddress) {
        this.permanentAddress = permanentAddress;
    }

    public Date getBirthday() {
        return this.birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getTrueName() {
        return this.trueName;
    }

    public void setTrueName(String trueName) {
        this.trueName = trueName;
    }

    public Date getIdentityDateend() {
        return this.identityDateend;
    }

    public void setIdentityDateend(Date identityDateend) {
        this.identityDateend = identityDateend;
    }

    public Date getIdentityDatestart() {
        return this.identityDatestart;
    }

    public void setIdentityDatestart(Date identityDatestart) {
        this.identityDatestart = identityDatestart;
    }

    public String getIdentitySingorgan() {
        return this.identitySingorgan;
    }

    public void setIdentitySingorgan(String identitySingorgan) {
        this.identitySingorgan = identitySingorgan;
    }

    public String getIdentityBackimgurl() {
        return this.identityBackimgurl;
    }

    public void setIdentityBackimgurl(String identityBackimgurl) {
        this.identityBackimgurl = identityBackimgurl;
    }

    public String getIdentityNumber() {
        return this.identityNumber;
    }

    public void setIdentityNumber(String identityNumber) {
        this.identityNumber = identityNumber;
    }

    public String getIdentityHeadimgurl() {
        return this.identityHeadimgurl;
    }

    public void setIdentityHeadimgurl(String identityHeadimgurl) {
        this.identityHeadimgurl = identityHeadimgurl;
    }

    public String getIdentityFrontimgurl() {
        return this.identityFrontimgurl;
    }

    public void setIdentityFrontimgurl(String identityFrontimgurl) {
        this.identityFrontimgurl = identityFrontimgurl;
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
        StringBuilder sb = new StringBuilder("UcFamilyIdcard (");

        sb.append(id);
        sb.append(", ").append(memberId);
        sb.append(", ").append(nation);
        sb.append(", ").append(sex);
        sb.append(", ").append(permanentAddress);
        sb.append(", ").append(birthday);
        sb.append(", ").append(trueName);
        sb.append(", ").append(identityDateend);
        sb.append(", ").append(identityDatestart);
        sb.append(", ").append(identitySingorgan);
        sb.append(", ").append(identityBackimgurl);
        sb.append(", ").append(identityNumber);
        sb.append(", ").append(identityHeadimgurl);
        sb.append(", ").append(identityFrontimgurl);
        sb.append(", ").append(createAt);
        sb.append(", ").append(updateAt);
        sb.append(", ").append(delFlag);
        sb.append(", ").append(version);

        sb.append(")");
        return sb.toString();
    }
}
