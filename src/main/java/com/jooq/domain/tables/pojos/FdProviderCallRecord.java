/*
 * This file is generated by jOOQ.
*/
package com.jooq.domain.tables.pojos;


import com.jooq.domain.enums.FdProviderCallRecordStartMode;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.annotation.Generated;


/**
 * 通话记录表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class FdProviderCallRecord implements Serializable {

    private static final long serialVersionUID = 1914823956;

    private Long                          id;
    private Long                          accountId;
    private String                        phone;
    private String                        opposite;
    private String                        place;
    private String                        nation;
    private String                        province;
    private String                        city;
    private String                        callBegin;
    private String                        callUsed;
    private String                        actualExpenses;
    private String                        chargeMode;
    private FdProviderCallRecordStartMode startMode;
    private Timestamp                     createAt;
    private Timestamp                     updateAt;
    private Boolean                       delFlag;
    private Long                          version;

    public FdProviderCallRecord() {}

    public FdProviderCallRecord(FdProviderCallRecord value) {
        this.id = value.id;
        this.accountId = value.accountId;
        this.phone = value.phone;
        this.opposite = value.opposite;
        this.place = value.place;
        this.nation = value.nation;
        this.province = value.province;
        this.city = value.city;
        this.callBegin = value.callBegin;
        this.callUsed = value.callUsed;
        this.actualExpenses = value.actualExpenses;
        this.chargeMode = value.chargeMode;
        this.startMode = value.startMode;
        this.createAt = value.createAt;
        this.updateAt = value.updateAt;
        this.delFlag = value.delFlag;
        this.version = value.version;
    }

    public FdProviderCallRecord(
        Long                          id,
        Long                          accountId,
        String                        phone,
        String                        opposite,
        String                        place,
        String                        nation,
        String                        province,
        String                        city,
        String                        callBegin,
        String                        callUsed,
        String                        actualExpenses,
        String                        chargeMode,
        FdProviderCallRecordStartMode startMode,
        Timestamp                     createAt,
        Timestamp                     updateAt,
        Boolean                       delFlag,
        Long                          version
    ) {
        this.id = id;
        this.accountId = accountId;
        this.phone = phone;
        this.opposite = opposite;
        this.place = place;
        this.nation = nation;
        this.province = province;
        this.city = city;
        this.callBegin = callBegin;
        this.callUsed = callUsed;
        this.actualExpenses = actualExpenses;
        this.chargeMode = chargeMode;
        this.startMode = startMode;
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

    public Long getAccountId() {
        return this.accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getOpposite() {
        return this.opposite;
    }

    public void setOpposite(String opposite) {
        this.opposite = opposite;
    }

    public String getPlace() {
        return this.place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getNation() {
        return this.nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public String getProvince() {
        return this.province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return this.city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCallBegin() {
        return this.callBegin;
    }

    public void setCallBegin(String callBegin) {
        this.callBegin = callBegin;
    }

    public String getCallUsed() {
        return this.callUsed;
    }

    public void setCallUsed(String callUsed) {
        this.callUsed = callUsed;
    }

    public String getActualExpenses() {
        return this.actualExpenses;
    }

    public void setActualExpenses(String actualExpenses) {
        this.actualExpenses = actualExpenses;
    }

    public String getChargeMode() {
        return this.chargeMode;
    }

    public void setChargeMode(String chargeMode) {
        this.chargeMode = chargeMode;
    }

    public FdProviderCallRecordStartMode getStartMode() {
        return this.startMode;
    }

    public void setStartMode(FdProviderCallRecordStartMode startMode) {
        this.startMode = startMode;
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
        StringBuilder sb = new StringBuilder("FdProviderCallRecord (");

        sb.append(id);
        sb.append(", ").append(accountId);
        sb.append(", ").append(phone);
        sb.append(", ").append(opposite);
        sb.append(", ").append(place);
        sb.append(", ").append(nation);
        sb.append(", ").append(province);
        sb.append(", ").append(city);
        sb.append(", ").append(callBegin);
        sb.append(", ").append(callUsed);
        sb.append(", ").append(actualExpenses);
        sb.append(", ").append(chargeMode);
        sb.append(", ").append(startMode);
        sb.append(", ").append(createAt);
        sb.append(", ").append(updateAt);
        sb.append(", ").append(delFlag);
        sb.append(", ").append(version);

        sb.append(")");
        return sb.toString();
    }
}
