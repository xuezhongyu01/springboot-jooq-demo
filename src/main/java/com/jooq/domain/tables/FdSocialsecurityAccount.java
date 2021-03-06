/*
 * This file is generated by jOOQ.
*/
package com.jooq.domain.tables;


import com.jooq.domain.Indexes;
import com.jooq.domain.Keys;
import com.jooq.domain.Xbkj;
import com.jooq.domain.tables.records.FdSocialsecurityAccountRecord;

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
 * 社保数据表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class FdSocialsecurityAccount extends TableImpl<FdSocialsecurityAccountRecord> {

    private static final long serialVersionUID = -87570420;

    /**
     * The reference instance of <code>xbkj.fd_socialsecurity_account</code>
     */
    public static final FdSocialsecurityAccount FD_SOCIALSECURITY_ACCOUNT = new FdSocialsecurityAccount();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<FdSocialsecurityAccountRecord> getRecordType() {
        return FdSocialsecurityAccountRecord.class;
    }

    /**
     * The column <code>xbkj.fd_socialsecurity_account.id</code>. 主键
     */
    public final TableField<FdSocialsecurityAccountRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).identity(true), this, "主键");

    /**
     * The column <code>xbkj.fd_socialsecurity_account.member_id</code>. 关联uc_organization_info的id
     */
    public final TableField<FdSocialsecurityAccountRecord, Long> MEMBER_ID = createField("member_id", org.jooq.impl.SQLDataType.BIGINT, this, "关联uc_organization_info的id");

    /**
     * The column <code>xbkj.fd_socialsecurity_account.customer</code>. 个人编号
     */
    public final TableField<FdSocialsecurityAccountRecord, String> CUSTOMER = createField("customer", org.jooq.impl.SQLDataType.VARCHAR(64), this, "个人编号");

    /**
     * The column <code>xbkj.fd_socialsecurity_account.name</code>. 姓名
     */
    public final TableField<FdSocialsecurityAccountRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR(64), this, "姓名");

    /**
     * The column <code>xbkj.fd_socialsecurity_account.idcard</code>. 证件号码
     */
    public final TableField<FdSocialsecurityAccountRecord, String> IDCARD = createField("idcard", org.jooq.impl.SQLDataType.VARCHAR(64), this, "证件号码");

    /**
     * The column <code>xbkj.fd_socialsecurity_account.idcard_type</code>. 证件类型
     */
    public final TableField<FdSocialsecurityAccountRecord, String> IDCARD_TYPE = createField("idcard_type", org.jooq.impl.SQLDataType.VARCHAR(32), this, "证件类型");

    /**
     * The column <code>xbkj.fd_socialsecurity_account.gender</code>. 性别
     */
    public final TableField<FdSocialsecurityAccountRecord, String> GENDER = createField("gender", org.jooq.impl.SQLDataType.VARCHAR(32), this, "性别");

    /**
     * The column <code>xbkj.fd_socialsecurity_account.birth</code>. 出生日期("YYYY-MM-DD")
     */
    public final TableField<FdSocialsecurityAccountRecord, String> BIRTH = createField("birth", org.jooq.impl.SQLDataType.VARCHAR(64).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "出生日期(\"YYYY-MM-DD\")");

    /**
     * The column <code>xbkj.fd_socialsecurity_account.nation</code>. 民族
     */
    public final TableField<FdSocialsecurityAccountRecord, String> NATION = createField("nation", org.jooq.impl.SQLDataType.VARCHAR(32), this, "民族");

    /**
     * The column <code>xbkj.fd_socialsecurity_account.insured_begin_date</code>. 开始参保时间("YYYY-MM-DD")
     */
    public final TableField<FdSocialsecurityAccountRecord, String> INSURED_BEGIN_DATE = createField("insured_begin_date", org.jooq.impl.SQLDataType.VARCHAR(64).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "开始参保时间(\"YYYY-MM-DD\")");

    /**
     * The column <code>xbkj.fd_socialsecurity_account.end_date</code>. 终止年月("YYYY-MM-DD")
     */
    public final TableField<FdSocialsecurityAccountRecord, String> END_DATE = createField("end_date", org.jooq.impl.SQLDataType.VARCHAR(64).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "终止年月(\"YYYY-MM-DD\")");

    /**
     * The column <code>xbkj.fd_socialsecurity_account.insured_person_type</code>. 参保人员类别(在职/居民)
     */
    public final TableField<FdSocialsecurityAccountRecord, String> INSURED_PERSON_TYPE = createField("insured_person_type", org.jooq.impl.SQLDataType.VARCHAR(32), this, "参保人员类别(在职/居民)");

    /**
     * The column <code>xbkj.fd_socialsecurity_account.insured_status</code>. 参保状态(正常/不正常)
     */
    public final TableField<FdSocialsecurityAccountRecord, String> INSURED_STATUS = createField("insured_status", org.jooq.impl.SQLDataType.VARCHAR(32), this, "参保状态(正常/不正常)");

    /**
     * The column <code>xbkj.fd_socialsecurity_account.education</code>. 文化程度
     */
    public final TableField<FdSocialsecurityAccountRecord, String> EDUCATION = createField("education", org.jooq.impl.SQLDataType.VARCHAR(64), this, "文化程度");

    /**
     * The column <code>xbkj.fd_socialsecurity_account.account_property</code>. 户口性质(农业/城镇)
     */
    public final TableField<FdSocialsecurityAccountRecord, String> ACCOUNT_PROPERTY = createField("account_property", org.jooq.impl.SQLDataType.VARCHAR(64), this, "户口性质(农业/城镇)");

    /**
     * The column <code>xbkj.fd_socialsecurity_account.domicile_place</code>. 户口所在地
     */
    public final TableField<FdSocialsecurityAccountRecord, String> DOMICILE_PLACE = createField("domicile_place", org.jooq.impl.SQLDataType.VARCHAR(64), this, "户口所在地");

    /**
     * The column <code>xbkj.fd_socialsecurity_account.company</code>. 单位名称
     */
    public final TableField<FdSocialsecurityAccountRecord, String> COMPANY = createField("company", org.jooq.impl.SQLDataType.VARCHAR(64), this, "单位名称");

    /**
     * The column <code>xbkj.fd_socialsecurity_account.social_security_name</code>. 社保机构名称
     */
    public final TableField<FdSocialsecurityAccountRecord, String> SOCIAL_SECURITY_NAME = createField("social_security_name", org.jooq.impl.SQLDataType.VARCHAR(64), this, "社保机构名称");

    /**
     * The column <code>xbkj.fd_socialsecurity_account.address</code>. 通讯地址
     */
    public final TableField<FdSocialsecurityAccountRecord, String> ADDRESS = createField("address", org.jooq.impl.SQLDataType.VARCHAR(125), this, "通讯地址");

    /**
     * The column <code>xbkj.fd_socialsecurity_account.phone</code>. 联系电话
     */
    public final TableField<FdSocialsecurityAccountRecord, String> PHONE = createField("phone", org.jooq.impl.SQLDataType.VARCHAR(64), this, "联系电话");

    /**
     * The column <code>xbkj.fd_socialsecurity_account.monthly_income</code>. 申报月收入(单位：分)
     */
    public final TableField<FdSocialsecurityAccountRecord, String> MONTHLY_INCOME = createField("monthly_income", org.jooq.impl.SQLDataType.VARCHAR(32), this, "申报月收入(单位：分)");

    /**
     * The column <code>xbkj.fd_socialsecurity_account.payment_person_type</code>. 缴费人员类别
     */
    public final TableField<FdSocialsecurityAccountRecord, String> PAYMENT_PERSON_TYPE = createField("payment_person_type", org.jooq.impl.SQLDataType.VARCHAR(64), this, "缴费人员类别");

    /**
     * The column <code>xbkj.fd_socialsecurity_account.medicare_balance</code>. 医疗账户余额(单位：分)
     */
    public final TableField<FdSocialsecurityAccountRecord, String> MEDICARE_BALANCE = createField("medicare_balance", org.jooq.impl.SQLDataType.VARCHAR(64), this, "医疗账户余额(单位：分)");

    /**
     * The column <code>xbkj.fd_socialsecurity_account.payment_months</code>. 累计缴纳月数
     */
    public final TableField<FdSocialsecurityAccountRecord, String> PAYMENT_MONTHS = createField("payment_months", org.jooq.impl.SQLDataType.VARCHAR(64), this, "累计缴纳月数");

    /**
     * The column <code>xbkj.fd_socialsecurity_account.pension_balance</code>. 养老账户余额(单位：分)
     */
    public final TableField<FdSocialsecurityAccountRecord, String> PENSION_BALANCE = createField("pension_balance", org.jooq.impl.SQLDataType.VARCHAR(64), this, "养老账户余额(单位：分)");

    /**
     * The column <code>xbkj.fd_socialsecurity_account.create_at</code>. 创建时间
     */
    public final TableField<FdSocialsecurityAccountRecord, Timestamp> CREATE_AT = createField("create_at", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "创建时间");

    /**
     * The column <code>xbkj.fd_socialsecurity_account.update_at</code>. 更新时间
     */
    public final TableField<FdSocialsecurityAccountRecord, Timestamp> UPDATE_AT = createField("update_at", org.jooq.impl.SQLDataType.TIMESTAMP, this, "更新时间");

    /**
     * The column <code>xbkj.fd_socialsecurity_account.del_flag</code>. 删除标志
     */
    public final TableField<FdSocialsecurityAccountRecord, Boolean> DEL_FLAG = createField("del_flag", org.jooq.impl.SQLDataType.BIT.defaultValue(org.jooq.impl.DSL.inline("b'0'", org.jooq.impl.SQLDataType.BIT)), this, "删除标志");

    /**
     * The column <code>xbkj.fd_socialsecurity_account.version</code>.
     */
    public final TableField<FdSocialsecurityAccountRecord, Long> VERSION = createField("version", org.jooq.impl.SQLDataType.BIGINT.defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * Create a <code>xbkj.fd_socialsecurity_account</code> table reference
     */
    public FdSocialsecurityAccount() {
        this(DSL.name("fd_socialsecurity_account"), null);
    }

    /**
     * Create an aliased <code>xbkj.fd_socialsecurity_account</code> table reference
     */
    public FdSocialsecurityAccount(String alias) {
        this(DSL.name(alias), FD_SOCIALSECURITY_ACCOUNT);
    }

    /**
     * Create an aliased <code>xbkj.fd_socialsecurity_account</code> table reference
     */
    public FdSocialsecurityAccount(Name alias) {
        this(alias, FD_SOCIALSECURITY_ACCOUNT);
    }

    private FdSocialsecurityAccount(Name alias, Table<FdSocialsecurityAccountRecord> aliased) {
        this(alias, aliased, null);
    }

    private FdSocialsecurityAccount(Name alias, Table<FdSocialsecurityAccountRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "社保数据表");
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
        return Arrays.<Index>asList(Indexes.FD_SOCIALSECURITY_ACCOUNT_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<FdSocialsecurityAccountRecord, Long> getIdentity() {
        return Keys.IDENTITY_FD_SOCIALSECURITY_ACCOUNT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<FdSocialsecurityAccountRecord> getPrimaryKey() {
        return Keys.KEY_FD_SOCIALSECURITY_ACCOUNT_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<FdSocialsecurityAccountRecord>> getKeys() {
        return Arrays.<UniqueKey<FdSocialsecurityAccountRecord>>asList(Keys.KEY_FD_SOCIALSECURITY_ACCOUNT_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FdSocialsecurityAccount as(String alias) {
        return new FdSocialsecurityAccount(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FdSocialsecurityAccount as(Name alias) {
        return new FdSocialsecurityAccount(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public FdSocialsecurityAccount rename(String name) {
        return new FdSocialsecurityAccount(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public FdSocialsecurityAccount rename(Name name) {
        return new FdSocialsecurityAccount(name, null);
    }
}
