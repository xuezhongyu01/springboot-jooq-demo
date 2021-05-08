/*
 * This file is generated by jOOQ.
*/
package com.jooq.domain.tables.pojos;


import java.io.Serializable;
import java.sql.Timestamp;

import javax.annotation.Generated;


/**
 * 电商电商绑定银 卡信息
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class FdEbusinessCards implements Serializable {

    private static final long serialVersionUID = -330678283;

    private Long      id;
    private Long      accountId;
    private String    cardType;
    private String    openDate;
    private String    bank;
    private String    card;
    private String    name;
    private String    fastPaymentFlag;
    private String    phone;
    private Timestamp createAt;
    private Timestamp updateAt;
    private Boolean   delFlag;
    private Long      version;

    public FdEbusinessCards() {}

    public FdEbusinessCards(FdEbusinessCards value) {
        this.id = value.id;
        this.accountId = value.accountId;
        this.cardType = value.cardType;
        this.openDate = value.openDate;
        this.bank = value.bank;
        this.card = value.card;
        this.name = value.name;
        this.fastPaymentFlag = value.fastPaymentFlag;
        this.phone = value.phone;
        this.createAt = value.createAt;
        this.updateAt = value.updateAt;
        this.delFlag = value.delFlag;
        this.version = value.version;
    }

    public FdEbusinessCards(
        Long      id,
        Long      accountId,
        String    cardType,
        String    openDate,
        String    bank,
        String    card,
        String    name,
        String    fastPaymentFlag,
        String    phone,
        Timestamp createAt,
        Timestamp updateAt,
        Boolean   delFlag,
        Long      version
    ) {
        this.id = id;
        this.accountId = accountId;
        this.cardType = cardType;
        this.openDate = openDate;
        this.bank = bank;
        this.card = card;
        this.name = name;
        this.fastPaymentFlag = fastPaymentFlag;
        this.phone = phone;
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

    public String getCardType() {
        return this.cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public String getOpenDate() {
        return this.openDate;
    }

    public void setOpenDate(String openDate) {
        this.openDate = openDate;
    }

    public String getBank() {
        return this.bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public String getCard() {
        return this.card;
    }

    public void setCard(String card) {
        this.card = card;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFastPaymentFlag() {
        return this.fastPaymentFlag;
    }

    public void setFastPaymentFlag(String fastPaymentFlag) {
        this.fastPaymentFlag = fastPaymentFlag;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
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
        StringBuilder sb = new StringBuilder("FdEbusinessCards (");

        sb.append(id);
        sb.append(", ").append(accountId);
        sb.append(", ").append(cardType);
        sb.append(", ").append(openDate);
        sb.append(", ").append(bank);
        sb.append(", ").append(card);
        sb.append(", ").append(name);
        sb.append(", ").append(fastPaymentFlag);
        sb.append(", ").append(phone);
        sb.append(", ").append(createAt);
        sb.append(", ").append(updateAt);
        sb.append(", ").append(delFlag);
        sb.append(", ").append(version);

        sb.append(")");
        return sb.toString();
    }
}
