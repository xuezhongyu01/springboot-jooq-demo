/*
 * This file is generated by jOOQ.
*/
package com.jooq.domain.tables;


import com.jooq.domain.Indexes;
import com.jooq.domain.Keys;
import com.jooq.domain.Xbkj;
import com.jooq.domain.tables.records.FdFundLoansRecord;

import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * 公积金贷款信息
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class FdFundLoans extends TableImpl<FdFundLoansRecord> {

    private static final long serialVersionUID = -1538771355;

    /**
     * The reference instance of <code>xbkj.fd_fund_loans</code>
     */
    public static final FdFundLoans FD_FUND_LOANS = new FdFundLoans();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<FdFundLoansRecord> getRecordType() {
        return FdFundLoansRecord.class;
    }

    /**
     * The column <code>xbkj.fd_fund_loans.id</code>. 贷款 ID
     */
    public final TableField<FdFundLoansRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).identity(true), this, "贷款 ID");

    /**
     * The column <code>xbkj.fd_fund_loans.account_id</code>. 账户 ID
     */
    public final TableField<FdFundLoansRecord, Long> ACCOUNT_ID = createField("account_id", org.jooq.impl.SQLDataType.BIGINT, this, "账户 ID");

    /**
     * The column <code>xbkj.fd_fund_loans.contract_no</code>. 合同号
     */
    public final TableField<FdFundLoansRecord, String> CONTRACT_NO = createField("contract_no", org.jooq.impl.SQLDataType.VARCHAR(32), this, "合同号");

    /**
     * The column <code>xbkj.fd_fund_loans.name</code>. 姓名
     */
    public final TableField<FdFundLoansRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR(32), this, "姓名");

    /**
     * The column <code>xbkj.fd_fund_loans.idcard</code>. 身份证号码
     */
    public final TableField<FdFundLoansRecord, String> IDCARD = createField("idcard", org.jooq.impl.SQLDataType.VARCHAR(32), this, "身份证号码");

    /**
     * The column <code>xbkj.fd_fund_loans.phone</code>. 手机号
     */
    public final TableField<FdFundLoansRecord, String> PHONE = createField("phone", org.jooq.impl.SQLDataType.VARCHAR(16), this, "手机号");

    /**
     * The column <code>xbkj.fd_fund_loans.address</code>. 客户地址
     */
    public final TableField<FdFundLoansRecord, String> ADDRESS = createField("address", org.jooq.impl.SQLDataType.VARCHAR(128), this, "客户地址");

    /**
     * The column <code>xbkj.fd_fund_loans.bank</code>. 贷款银行名称
     */
    public final TableField<FdFundLoansRecord, String> BANK = createField("bank", org.jooq.impl.SQLDataType.VARCHAR(64), this, "贷款银行名称");

    /**
     * The column <code>xbkj.fd_fund_loans.status</code>. 贷款状态
     */
    public final TableField<FdFundLoansRecord, String> STATUS = createField("status", org.jooq.impl.SQLDataType.VARCHAR(32), this, "贷款状态");

    /**
     * The column <code>xbkj.fd_fund_loans.limit</code>. 贷款额度
     */
    public final TableField<FdFundLoansRecord, String> LIMIT = createField("limit", org.jooq.impl.SQLDataType.VARCHAR(20), this, "贷款额度");

    /**
     * The column <code>xbkj.fd_fund_loans.balance</code>. 贷款余额
     */
    public final TableField<FdFundLoansRecord, String> BALANCE = createField("balance", org.jooq.impl.SQLDataType.VARCHAR(20), this, "贷款余额");

    /**
     * The column <code>xbkj.fd_fund_loans.period</code>. 贷款期限
     */
    public final TableField<FdFundLoansRecord, String> PERIOD = createField("period", org.jooq.impl.SQLDataType.VARCHAR(16), this, "贷款期限");

    /**
     * The column <code>xbkj.fd_fund_loans.begin_date</code>. 贷款发放日
     */
    public final TableField<FdFundLoansRecord, Timestamp> BEGIN_DATE = createField("begin_date", org.jooq.impl.SQLDataType.TIMESTAMP, this, "贷款发放日");

    /**
     * The column <code>xbkj.fd_fund_loans.end_date</code>. 贷款到期日
     */
    public final TableField<FdFundLoansRecord, Timestamp> END_DATE = createField("end_date", org.jooq.impl.SQLDataType.TIMESTAMP, this, "贷款到期日");

    /**
     * The column <code>xbkj.fd_fund_loans.loan_rate</code>. 贷款利率
     */
    public final TableField<FdFundLoansRecord, String> LOAN_RATE = createField("loan_rate", org.jooq.impl.SQLDataType.VARCHAR(11).defaultValue(org.jooq.impl.DSL.inline("0.00", org.jooq.impl.SQLDataType.VARCHAR)), this, "贷款利率");

    /**
     * The column <code>xbkj.fd_fund_loans.penalty_rate</code>.  贷款罚息利率
     */
    public final TableField<FdFundLoansRecord, String> PENALTY_RATE = createField("penalty_rate", org.jooq.impl.SQLDataType.VARCHAR(11).defaultValue(org.jooq.impl.DSL.inline("0.00", org.jooq.impl.SQLDataType.VARCHAR)), this, " 贷款罚息利率");

    /**
     * The column <code>xbkj.fd_fund_loans.refund</code>. 还款方式
     */
    public final TableField<FdFundLoansRecord, String> REFUND = createField("refund", org.jooq.impl.SQLDataType.VARCHAR(32), this, "还款方式");

    /**
     * The column <code>xbkj.fd_fund_loans.create_at</code>. 创建时间
     */
    public final TableField<FdFundLoansRecord, Timestamp> CREATE_AT = createField("create_at", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "创建时间");

    /**
     * The column <code>xbkj.fd_fund_loans.update_at</code>. 更新时间
     */
    public final TableField<FdFundLoansRecord, Timestamp> UPDATE_AT = createField("update_at", org.jooq.impl.SQLDataType.TIMESTAMP, this, "更新时间");

    /**
     * The column <code>xbkj.fd_fund_loans.del_flag</code>. 删除标志
     */
    public final TableField<FdFundLoansRecord, Boolean> DEL_FLAG = createField("del_flag", org.jooq.impl.SQLDataType.BIT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("b'0'", org.jooq.impl.SQLDataType.BIT)), this, "删除标志");

    /**
     * The column <code>xbkj.fd_fund_loans.version</code>.
     */
    public final TableField<FdFundLoansRecord, Long> VERSION = createField("version", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * Create a <code>xbkj.fd_fund_loans</code> table reference
     */
    public FdFundLoans() {
        this(DSL.name("fd_fund_loans"), null);
    }

    /**
     * Create an aliased <code>xbkj.fd_fund_loans</code> table reference
     */
    public FdFundLoans(String alias) {
        this(DSL.name(alias), FD_FUND_LOANS);
    }

    /**
     * Create an aliased <code>xbkj.fd_fund_loans</code> table reference
     */
    public FdFundLoans(Name alias) {
        this(alias, FD_FUND_LOANS);
    }

    private FdFundLoans(Name alias, Table<FdFundLoansRecord> aliased) {
        this(alias, aliased, null);
    }

    private FdFundLoans(Name alias, Table<FdFundLoansRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "公积金贷款信息");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Xbkj.XBKJ;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.FD_FUND_LOANS_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<FdFundLoansRecord, Long> getIdentity() {
        return Keys.IDENTITY_FD_FUND_LOANS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<FdFundLoansRecord> getPrimaryKey() {
        return Keys.KEY_FD_FUND_LOANS_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<FdFundLoansRecord>> getKeys() {
        return Arrays.<UniqueKey<FdFundLoansRecord>>asList(Keys.KEY_FD_FUND_LOANS_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FdFundLoans as(String alias) {
        return new FdFundLoans(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FdFundLoans as(Name alias) {
        return new FdFundLoans(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public FdFundLoans rename(String name) {
        return new FdFundLoans(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public FdFundLoans rename(Name name) {
        return new FdFundLoans(name, null);
    }
}
