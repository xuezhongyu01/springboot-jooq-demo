/*
 * This file is generated by jOOQ.
*/
package com.jooq.domain.tables.pojos;


import com.jooq.domain.enums.UcMemberInfoMarriage;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Timestamp;

import javax.annotation.Generated;


/**
 * 会员信息表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UcMemberInfo implements Serializable {

    private static final long serialVersionUID = 1119830764;

    private Long                 id;
    private Long                 memberId;
    private Date                 birthday;
    private String               province;
    private String               area;
    private String               city;
    private String               address;
    private String               email;
    private String               nation;
    private String               receivingAddress;
    private String               permanentAddress;
    private Date                 identityDateend;
    private Date                 identityDatestart;
    private String               identitySingorgan;
    private String               identityFrontimgurl;
    private String               identityBackimgurl;
    private String               faceImgurl;
    private String               identityHeadimgurl;
    private UcMemberInfoMarriage marriage;
    private Double               latitude;
    private Double               longitude;
    private Timestamp            createAt;
    private Timestamp            updateAt;
    private Boolean              delFlag;
    private Long                 version;

    public UcMemberInfo() {}

    public UcMemberInfo(UcMemberInfo value) {
        this.id = value.id;
        this.memberId = value.memberId;
        this.birthday = value.birthday;
        this.province = value.province;
        this.area = value.area;
        this.city = value.city;
        this.address = value.address;
        this.email = value.email;
        this.nation = value.nation;
        this.receivingAddress = value.receivingAddress;
        this.permanentAddress = value.permanentAddress;
        this.identityDateend = value.identityDateend;
        this.identityDatestart = value.identityDatestart;
        this.identitySingorgan = value.identitySingorgan;
        this.identityFrontimgurl = value.identityFrontimgurl;
        this.identityBackimgurl = value.identityBackimgurl;
        this.faceImgurl = value.faceImgurl;
        this.identityHeadimgurl = value.identityHeadimgurl;
        this.marriage = value.marriage;
        this.latitude = value.latitude;
        this.longitude = value.longitude;
        this.createAt = value.createAt;
        this.updateAt = value.updateAt;
        this.delFlag = value.delFlag;
        this.version = value.version;
    }

    public UcMemberInfo(
        Long                 id,
        Long                 memberId,
        Date                 birthday,
        String               province,
        String               area,
        String               city,
        String               address,
        String               email,
        String               nation,
        String               receivingAddress,
        String               permanentAddress,
        Date                 identityDateend,
        Date                 identityDatestart,
        String               identitySingorgan,
        String               identityFrontimgurl,
        String               identityBackimgurl,
        String               faceImgurl,
        String               identityHeadimgurl,
        UcMemberInfoMarriage marriage,
        Double               latitude,
        Double               longitude,
        Timestamp            createAt,
        Timestamp            updateAt,
        Boolean              delFlag,
        Long                 version
    ) {
        this.id = id;
        this.memberId = memberId;
        this.birthday = birthday;
        this.province = province;
        this.area = area;
        this.city = city;
        this.address = address;
        this.email = email;
        this.nation = nation;
        this.receivingAddress = receivingAddress;
        this.permanentAddress = permanentAddress;
        this.identityDateend = identityDateend;
        this.identityDatestart = identityDatestart;
        this.identitySingorgan = identitySingorgan;
        this.identityFrontimgurl = identityFrontimgurl;
        this.identityBackimgurl = identityBackimgurl;
        this.faceImgurl = faceImgurl;
        this.identityHeadimgurl = identityHeadimgurl;
        this.marriage = marriage;
        this.latitude = latitude;
        this.longitude = longitude;
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

    public Date getBirthday() {
        return this.birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getProvince() {
        return this.province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getArea() {
        return this.area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getCity() {
        return this.city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNation() {
        return this.nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public String getReceivingAddress() {
        return this.receivingAddress;
    }

    public void setReceivingAddress(String receivingAddress) {
        this.receivingAddress = receivingAddress;
    }

    public String getPermanentAddress() {
        return this.permanentAddress;
    }

    public void setPermanentAddress(String permanentAddress) {
        this.permanentAddress = permanentAddress;
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

    public String getIdentityFrontimgurl() {
        return this.identityFrontimgurl;
    }

    public void setIdentityFrontimgurl(String identityFrontimgurl) {
        this.identityFrontimgurl = identityFrontimgurl;
    }

    public String getIdentityBackimgurl() {
        return this.identityBackimgurl;
    }

    public void setIdentityBackimgurl(String identityBackimgurl) {
        this.identityBackimgurl = identityBackimgurl;
    }

    public String getFaceImgurl() {
        return this.faceImgurl;
    }

    public void setFaceImgurl(String faceImgurl) {
        this.faceImgurl = faceImgurl;
    }

    public String getIdentityHeadimgurl() {
        return this.identityHeadimgurl;
    }

    public void setIdentityHeadimgurl(String identityHeadimgurl) {
        this.identityHeadimgurl = identityHeadimgurl;
    }

    public UcMemberInfoMarriage getMarriage() {
        return this.marriage;
    }

    public void setMarriage(UcMemberInfoMarriage marriage) {
        this.marriage = marriage;
    }

    public Double getLatitude() {
        return this.latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return this.longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
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
        StringBuilder sb = new StringBuilder("UcMemberInfo (");

        sb.append(id);
        sb.append(", ").append(memberId);
        sb.append(", ").append(birthday);
        sb.append(", ").append(province);
        sb.append(", ").append(area);
        sb.append(", ").append(city);
        sb.append(", ").append(address);
        sb.append(", ").append(email);
        sb.append(", ").append(nation);
        sb.append(", ").append(receivingAddress);
        sb.append(", ").append(permanentAddress);
        sb.append(", ").append(identityDateend);
        sb.append(", ").append(identityDatestart);
        sb.append(", ").append(identitySingorgan);
        sb.append(", ").append(identityFrontimgurl);
        sb.append(", ").append(identityBackimgurl);
        sb.append(", ").append(faceImgurl);
        sb.append(", ").append(identityHeadimgurl);
        sb.append(", ").append(marriage);
        sb.append(", ").append(latitude);
        sb.append(", ").append(longitude);
        sb.append(", ").append(createAt);
        sb.append(", ").append(updateAt);
        sb.append(", ").append(delFlag);
        sb.append(", ").append(version);

        sb.append(")");
        return sb.toString();
    }
}
