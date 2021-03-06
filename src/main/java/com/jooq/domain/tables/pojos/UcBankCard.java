/*
 * This file is generated by jOOQ.
*/
package com.jooq.domain.tables.pojos;


import com.jooq.domain.enums.UcBankCardCardType;
import com.jooq.domain.enums.UcBankCardStatus;
import com.jooq.domain.enums.UcBankCardType;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.annotation.Generated;


/**
 * 银行卡表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UcBankCard implements Serializable {

    private static final long serialVersionUID = 1005629237;

    private Long               id;
    private Long               ucId;
    private UcBankCardType     type;
    private String             bankName;
    private UcBankCardCardType cardType;
    private String             cardNumber;
    private String             cardHolder;
    private Long               bankMobile;
    private String             bankCode;
    private String             bankProvince;
    private String             bankCity;
    private String             bankDistrict;
    private String             branchName;
    private String             cardBankCnaps;
    private Boolean            defaultIs;
    private UcBankCardStatus   status;
    private String             requestno;
    private String             remarks;
    private Timestamp          createAt;
    private Timestamp          updateAt;
    private Boolean            delFlag;
    private Long               version;
    private String             provinceCode;
    private String             cityCode;

    public UcBankCard() {}

    public UcBankCard(UcBankCard value) {
        this.id = value.id;
        this.ucId = value.ucId;
        this.type = value.type;
        this.bankName = value.bankName;
        this.cardType = value.cardType;
        this.cardNumber = value.cardNumber;
        this.cardHolder = value.cardHolder;
        this.bankMobile = value.bankMobile;
        this.bankCode = value.bankCode;
        this.bankProvince = value.bankProvince;
        this.bankCity = value.bankCity;
        this.bankDistrict = value.bankDistrict;
        this.branchName = value.branchName;
        this.cardBankCnaps = value.cardBankCnaps;
        this.defaultIs = value.defaultIs;
        this.status = value.status;
        this.requestno = value.requestno;
        this.remarks = value.remarks;
        this.createAt = value.createAt;
        this.updateAt = value.updateAt;
        this.delFlag = value.delFlag;
        this.version = value.version;
        this.provinceCode = value.provinceCode;
        this.cityCode = value.cityCode;
    }

    public UcBankCard(
        Long               id,
        Long               ucId,
        UcBankCardType     type,
        String             bankName,
        UcBankCardCardType cardType,
        String             cardNumber,
        String             cardHolder,
        Long               bankMobile,
        String             bankCode,
        String             bankProvince,
        String             bankCity,
        String             bankDistrict,
        String             branchName,
        String             cardBankCnaps,
        Boolean            defaultIs,
        UcBankCardStatus   status,
        String             requestno,
        String             remarks,
        Timestamp          createAt,
        Timestamp          updateAt,
        Boolean            delFlag,
        Long               version,
        String             provinceCode,
        String             cityCode
    ) {
        this.id = id;
        this.ucId = ucId;
        this.type = type;
        this.bankName = bankName;
        this.cardType = cardType;
        this.cardNumber = cardNumber;
        this.cardHolder = cardHolder;
        this.bankMobile = bankMobile;
        this.bankCode = bankCode;
        this.bankProvince = bankProvince;
        this.bankCity = bankCity;
        this.bankDistrict = bankDistrict;
        this.branchName = branchName;
        this.cardBankCnaps = cardBankCnaps;
        this.defaultIs = defaultIs;
        this.status = status;
        this.requestno = requestno;
        this.remarks = remarks;
        this.createAt = createAt;
        this.updateAt = updateAt;
        this.delFlag = delFlag;
        this.version = version;
        this.provinceCode = provinceCode;
        this.cityCode = cityCode;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUcId() {
        return this.ucId;
    }

    public void setUcId(Long ucId) {
        this.ucId = ucId;
    }

    public UcBankCardType getType() {
        return this.type;
    }

    public void setType(UcBankCardType type) {
        this.type = type;
    }

    public String getBankName() {
        return this.bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public UcBankCardCardType getCardType() {
        return this.cardType;
    }

    public void setCardType(UcBankCardCardType cardType) {
        this.cardType = cardType;
    }

    public String getCardNumber() {
        return this.cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getCardHolder() {
        return this.cardHolder;
    }

    public void setCardHolder(String cardHolder) {
        this.cardHolder = cardHolder;
    }

    public Long getBankMobile() {
        return this.bankMobile;
    }

    public void setBankMobile(Long bankMobile) {
        this.bankMobile = bankMobile;
    }

    public String getBankCode() {
        return this.bankCode;
    }

    public void setBankCode(String bankCode) {
        this.bankCode = bankCode;
    }

    public String getBankProvince() {
        return this.bankProvince;
    }

    public void setBankProvince(String bankProvince) {
        this.bankProvince = bankProvince;
    }

    public String getBankCity() {
        return this.bankCity;
    }

    public void setBankCity(String bankCity) {
        this.bankCity = bankCity;
    }

    public String getBankDistrict() {
        return this.bankDistrict;
    }

    public void setBankDistrict(String bankDistrict) {
        this.bankDistrict = bankDistrict;
    }

    public String getBranchName() {
        return this.branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public String getCardBankCnaps() {
        return this.cardBankCnaps;
    }

    public void setCardBankCnaps(String cardBankCnaps) {
        this.cardBankCnaps = cardBankCnaps;
    }

    public Boolean getDefaultIs() {
        return this.defaultIs;
    }

    public void setDefaultIs(Boolean defaultIs) {
        this.defaultIs = defaultIs;
    }

    public UcBankCardStatus getStatus() {
        return this.status;
    }

    public void setStatus(UcBankCardStatus status) {
        this.status = status;
    }

    public String getRequestno() {
        return this.requestno;
    }

    public void setRequestno(String requestno) {
        this.requestno = requestno;
    }

    public String getRemarks() {
        return this.remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
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

    public String getProvinceCode() {
        return this.provinceCode;
    }

    public void setProvinceCode(String provinceCode) {
        this.provinceCode = provinceCode;
    }

    public String getCityCode() {
        return this.cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("UcBankCard (");

        sb.append(id);
        sb.append(", ").append(ucId);
        sb.append(", ").append(type);
        sb.append(", ").append(bankName);
        sb.append(", ").append(cardType);
        sb.append(", ").append(cardNumber);
        sb.append(", ").append(cardHolder);
        sb.append(", ").append(bankMobile);
        sb.append(", ").append(bankCode);
        sb.append(", ").append(bankProvince);
        sb.append(", ").append(bankCity);
        sb.append(", ").append(bankDistrict);
        sb.append(", ").append(branchName);
        sb.append(", ").append(cardBankCnaps);
        sb.append(", ").append(defaultIs);
        sb.append(", ").append(status);
        sb.append(", ").append(requestno);
        sb.append(", ").append(remarks);
        sb.append(", ").append(createAt);
        sb.append(", ").append(updateAt);
        sb.append(", ").append(delFlag);
        sb.append(", ").append(version);
        sb.append(", ").append(provinceCode);
        sb.append(", ").append(cityCode);

        sb.append(")");
        return sb.toString();
    }
}
