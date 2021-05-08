/*
 * This file is generated by jOOQ.
*/
package com.jooq.domain.tables.pojos;


import java.io.Serializable;
import java.sql.Timestamp;

import javax.annotation.Generated;


/**
 * 公积金还款流水
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class FdFundLoanFlows implements Serializable {

    private static final long serialVersionUID = -68135901;

    private Long      id;
    private Long      loanId;
    private Long      accountId;
    private String    contractNo;
    private Timestamp recordDate;
    private String    type;
    private String    recordMonth;
    private String    repayPrinciple;
    private String    repayInterest;
    private String    repayAmount;
    private String    principleBalance;
    private Timestamp deductDate;
    private Timestamp createAt;
    private Timestamp updateAt;
    private Boolean   delFlag;
    private Long      version;

    public FdFundLoanFlows() {}

    public FdFundLoanFlows(FdFundLoanFlows value) {
        this.id = value.id;
        this.loanId = value.loanId;
        this.accountId = value.accountId;
        this.contractNo = value.contractNo;
        this.recordDate = value.recordDate;
        this.type = value.type;
        this.recordMonth = value.recordMonth;
        this.repayPrinciple = value.repayPrinciple;
        this.repayInterest = value.repayInterest;
        this.repayAmount = value.repayAmount;
        this.principleBalance = value.principleBalance;
        this.deductDate = value.deductDate;
        this.createAt = value.createAt;
        this.updateAt = value.updateAt;
        this.delFlag = value.delFlag;
        this.version = value.version;
    }

    public FdFundLoanFlows(
        Long      id,
        Long      loanId,
        Long      accountId,
        String    contractNo,
        Timestamp recordDate,
        String    type,
        String    recordMonth,
        String    repayPrinciple,
        String    repayInterest,
        String    repayAmount,
        String    principleBalance,
        Timestamp deductDate,
        Timestamp createAt,
        Timestamp updateAt,
        Boolean   delFlag,
        Long      version
    ) {
        this.id = id;
        this.loanId = loanId;
        this.accountId = accountId;
        this.contractNo = contractNo;
        this.recordDate = recordDate;
        this.type = type;
        this.recordMonth = recordMonth;
        this.repayPrinciple = repayPrinciple;
        this.repayInterest = repayInterest;
        this.repayAmount = repayAmount;
        this.principleBalance = principleBalance;
        this.deductDate = deductDate;
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

    public Long getLoanId() {
        return this.loanId;
    }

    public void setLoanId(Long loanId) {
        this.loanId = loanId;
    }

    public Long getAccountId() {
        return this.accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public String getContractNo() {
        return this.contractNo;
    }

    public void setContractNo(String contractNo) {
        this.contractNo = contractNo;
    }

    public Timestamp getRecordDate() {
        return this.recordDate;
    }

    public void setRecordDate(Timestamp recordDate) {
        this.recordDate = recordDate;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getRecordMonth() {
        return this.recordMonth;
    }

    public void setRecordMonth(String recordMonth) {
        this.recordMonth = recordMonth;
    }

    public String getRepayPrinciple() {
        return this.repayPrinciple;
    }

    public void setRepayPrinciple(String repayPrinciple) {
        this.repayPrinciple = repayPrinciple;
    }

    public String getRepayInterest() {
        return this.repayInterest;
    }

    public void setRepayInterest(String repayInterest) {
        this.repayInterest = repayInterest;
    }

    public String getRepayAmount() {
        return this.repayAmount;
    }

    public void setRepayAmount(String repayAmount) {
        this.repayAmount = repayAmount;
    }

    public String getPrincipleBalance() {
        return this.principleBalance;
    }

    public void setPrincipleBalance(String principleBalance) {
        this.principleBalance = principleBalance;
    }

    public Timestamp getDeductDate() {
        return this.deductDate;
    }

    public void setDeductDate(Timestamp deductDate) {
        this.deductDate = deductDate;
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
        StringBuilder sb = new StringBuilder("FdFundLoanFlows (");

        sb.append(id);
        sb.append(", ").append(loanId);
        sb.append(", ").append(accountId);
        sb.append(", ").append(contractNo);
        sb.append(", ").append(recordDate);
        sb.append(", ").append(type);
        sb.append(", ").append(recordMonth);
        sb.append(", ").append(repayPrinciple);
        sb.append(", ").append(repayInterest);
        sb.append(", ").append(repayAmount);
        sb.append(", ").append(principleBalance);
        sb.append(", ").append(deductDate);
        sb.append(", ").append(createAt);
        sb.append(", ").append(updateAt);
        sb.append(", ").append(delFlag);
        sb.append(", ").append(version);

        sb.append(")");
        return sb.toString();
    }
}
