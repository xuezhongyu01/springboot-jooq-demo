/*
 * This file is generated by jOOQ.
*/
package com.jooq.domain.tables.pojos;


import com.jooq.domain.enums.FinBalanceBalanceType;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.annotation.Generated;


/**
 * 成长基金总额度
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class FinBalance implements Serializable {

    private static final long serialVersionUID = 218880205;

    private Long                  id;
    private FinBalanceBalanceType balanceType;
    private BigDecimal            creditTotalAmount;
    private BigDecimal            creditFrozenAmount;
    private BigDecimal            creditAvailableAmount;
    private BigDecimal            useAmount;
    private Long                  sourceId;
    private Timestamp             createAt;
    private Timestamp             updateAt;
    private Boolean               delFlag;
    private Long                  version;

    public FinBalance() {}

    public FinBalance(FinBalance value) {
        this.id = value.id;
        this.balanceType = value.balanceType;
        this.creditTotalAmount = value.creditTotalAmount;
        this.creditFrozenAmount = value.creditFrozenAmount;
        this.creditAvailableAmount = value.creditAvailableAmount;
        this.useAmount = value.useAmount;
        this.sourceId = value.sourceId;
        this.createAt = value.createAt;
        this.updateAt = value.updateAt;
        this.delFlag = value.delFlag;
        this.version = value.version;
    }

    public FinBalance(
        Long                  id,
        FinBalanceBalanceType balanceType,
        BigDecimal            creditTotalAmount,
        BigDecimal            creditFrozenAmount,
        BigDecimal            creditAvailableAmount,
        BigDecimal            useAmount,
        Long                  sourceId,
        Timestamp             createAt,
        Timestamp             updateAt,
        Boolean               delFlag,
        Long                  version
    ) {
        this.id = id;
        this.balanceType = balanceType;
        this.creditTotalAmount = creditTotalAmount;
        this.creditFrozenAmount = creditFrozenAmount;
        this.creditAvailableAmount = creditAvailableAmount;
        this.useAmount = useAmount;
        this.sourceId = sourceId;
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

    public FinBalanceBalanceType getBalanceType() {
        return this.balanceType;
    }

    public void setBalanceType(FinBalanceBalanceType balanceType) {
        this.balanceType = balanceType;
    }

    public BigDecimal getCreditTotalAmount() {
        return this.creditTotalAmount;
    }

    public void setCreditTotalAmount(BigDecimal creditTotalAmount) {
        this.creditTotalAmount = creditTotalAmount;
    }

    public BigDecimal getCreditFrozenAmount() {
        return this.creditFrozenAmount;
    }

    public void setCreditFrozenAmount(BigDecimal creditFrozenAmount) {
        this.creditFrozenAmount = creditFrozenAmount;
    }

    public BigDecimal getCreditAvailableAmount() {
        return this.creditAvailableAmount;
    }

    public void setCreditAvailableAmount(BigDecimal creditAvailableAmount) {
        this.creditAvailableAmount = creditAvailableAmount;
    }

    public BigDecimal getUseAmount() {
        return this.useAmount;
    }

    public void setUseAmount(BigDecimal useAmount) {
        this.useAmount = useAmount;
    }

    public Long getSourceId() {
        return this.sourceId;
    }

    public void setSourceId(Long sourceId) {
        this.sourceId = sourceId;
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
        StringBuilder sb = new StringBuilder("FinBalance (");

        sb.append(id);
        sb.append(", ").append(balanceType);
        sb.append(", ").append(creditTotalAmount);
        sb.append(", ").append(creditFrozenAmount);
        sb.append(", ").append(creditAvailableAmount);
        sb.append(", ").append(useAmount);
        sb.append(", ").append(sourceId);
        sb.append(", ").append(createAt);
        sb.append(", ").append(updateAt);
        sb.append(", ").append(delFlag);
        sb.append(", ").append(version);

        sb.append(")");
        return sb.toString();
    }
}
