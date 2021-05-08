/*
 * This file is generated by jOOQ.
*/
package com.jooq.domain.tables;


import com.jooq.domain.Indexes;
import com.jooq.domain.Keys;
import com.jooq.domain.Xbkj;
import com.jooq.domain.tables.records.UcMemberCollegeRecord;

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
 * 毕业院校表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UcMemberCollege extends TableImpl<UcMemberCollegeRecord> {

    private static final long serialVersionUID = -185340012;

    /**
     * The reference instance of <code>xbkj.uc_member_college</code>
     */
    public static final UcMemberCollege UC_MEMBER_COLLEGE = new UcMemberCollege();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<UcMemberCollegeRecord> getRecordType() {
        return UcMemberCollegeRecord.class;
    }

    /**
     * The column <code>xbkj.uc_member_college.id</code>. id
     */
    public final TableField<UcMemberCollegeRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).identity(true), this, "id");

    /**
     * The column <code>xbkj.uc_member_college.college</code>. 毕业院校
     */
    public final TableField<UcMemberCollegeRecord, String> COLLEGE = createField("college", org.jooq.impl.SQLDataType.VARCHAR(255).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "毕业院校");

    /**
     * The column <code>xbkj.uc_member_college.academician_num</code>. 院士个数
     */
    public final TableField<UcMemberCollegeRecord, String> ACADEMICIAN_NUM = createField("academician_num", org.jooq.impl.SQLDataType.VARCHAR(255).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "院士个数");

    /**
     * The column <code>xbkj.uc_member_college.address</code>. 院校所在地
     */
    public final TableField<UcMemberCollegeRecord, String> ADDRESS = createField("address", org.jooq.impl.SQLDataType.VARCHAR(255).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "院校所在地");

    /**
     * The column <code>xbkj.uc_member_college.art_batch</code>. 文科录取批次
     */
    public final TableField<UcMemberCollegeRecord, String> ART_BATCH = createField("art_batch", org.jooq.impl.SQLDataType.VARCHAR(255).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "文科录取批次");

    /**
     * The column <code>xbkj.uc_member_college.character</code>. 办学性质
     */
    public final TableField<UcMemberCollegeRecord, String> CHARACTER = createField("character", org.jooq.impl.SQLDataType.VARCHAR(255).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "办学性质");

    /**
     * The column <code>xbkj.uc_member_college.colg_character</code>. 学校性质
     */
    public final TableField<UcMemberCollegeRecord, String> COLG_CHARACTER = createField("colg_character", org.jooq.impl.SQLDataType.VARCHAR(255).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "学校性质");

    /**
     * The column <code>xbkj.uc_member_college.colg_level</code>. 办学层次
     */
    public final TableField<UcMemberCollegeRecord, String> COLG_LEVEL = createField("colg_level", org.jooq.impl.SQLDataType.VARCHAR(255).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "办学层次");

    /**
     * The column <code>xbkj.uc_member_college.colg_type</code>. 学校类别
     */
    public final TableField<UcMemberCollegeRecord, String> COLG_TYPE = createField("colg_type", org.jooq.impl.SQLDataType.VARCHAR(255).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "学校类别");

    /**
     * The column <code>xbkj.uc_member_college.college_old_name</code>. 毕业院校原名称
     */
    public final TableField<UcMemberCollegeRecord, String> COLLEGE_OLD_NAME = createField("college_old_name", org.jooq.impl.SQLDataType.VARCHAR(255).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "毕业院校原名称");

    /**
     * The column <code>xbkj.uc_member_college.create_date</code>. 毕业院校创建时间
     */
    public final TableField<UcMemberCollegeRecord, String> CREATE_DATE = createField("create_date", org.jooq.impl.SQLDataType.VARCHAR(255).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "毕业院校创建时间");

    /**
     * The column <code>xbkj.uc_member_college.create_years</code>. 创建年限
     */
    public final TableField<UcMemberCollegeRecord, String> CREATE_YEARS = createField("create_years", org.jooq.impl.SQLDataType.VARCHAR(255).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "创建年限");

    /**
     * The column <code>xbkj.uc_member_college.doctor_degree_num</code>. 博士点个数
     */
    public final TableField<UcMemberCollegeRecord, String> DOCTOR_DEGREE_NUM = createField("doctor_degree_num", org.jooq.impl.SQLDataType.VARCHAR(255).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "博士点个数");

    /**
     * The column <code>xbkj.uc_member_college.is211</code>. 是否211院校
     */
    public final TableField<UcMemberCollegeRecord, String> IS211 = createField("is211", org.jooq.impl.SQLDataType.VARCHAR(255).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "是否211院校");

    /**
     * The column <code>xbkj.uc_member_college.key_subject_num</code>. 国家重点学科数
     */
    public final TableField<UcMemberCollegeRecord, String> KEY_SUBJECT_NUM = createField("key_subject_num", org.jooq.impl.SQLDataType.VARCHAR(255).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "国家重点学科数");

    /**
     * The column <code>xbkj.uc_member_college.manage_dept</code>. 主管教育部门
     */
    public final TableField<UcMemberCollegeRecord, String> MANAGE_DEPT = createField("manage_dept", org.jooq.impl.SQLDataType.VARCHAR(255).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "主管教育部门");

    /**
     * The column <code>xbkj.uc_member_college.master_degree_num</code>. 硕士点个数
     */
    public final TableField<UcMemberCollegeRecord, String> MASTER_DEGREE_NUM = createField("master_degree_num", org.jooq.impl.SQLDataType.VARCHAR(255).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "硕士点个数");

    /**
     * The column <code>xbkj.uc_member_college.postdoctor_num</code>. 博士后流动站数
     */
    public final TableField<UcMemberCollegeRecord, String> POSTDOCTOR_NUM = createField("postdoctor_num", org.jooq.impl.SQLDataType.VARCHAR(255).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "博士后流动站数");

    /**
     * The column <code>xbkj.uc_member_college.science_batch</code>. 理科录取批次
     */
    public final TableField<UcMemberCollegeRecord, String> SCIENCE_BATCH = createField("science_batch", org.jooq.impl.SQLDataType.VARCHAR(255).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "理科录取批次");

    /**
     * The column <code>xbkj.uc_member_college.create_at</code>. 创建时间
     */
    public final TableField<UcMemberCollegeRecord, Timestamp> CREATE_AT = createField("create_at", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "创建时间");

    /**
     * The column <code>xbkj.uc_member_college.update_at</code>. 更新时间
     */
    public final TableField<UcMemberCollegeRecord, Timestamp> UPDATE_AT = createField("update_at", org.jooq.impl.SQLDataType.TIMESTAMP, this, "更新时间");

    /**
     * The column <code>xbkj.uc_member_college.del_flag</code>. 删除标志
     */
    public final TableField<UcMemberCollegeRecord, Boolean> DEL_FLAG = createField("del_flag", org.jooq.impl.SQLDataType.BIT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("b'0'", org.jooq.impl.SQLDataType.BIT)), this, "删除标志");

    /**
     * The column <code>xbkj.uc_member_college.version</code>.
     */
    public final TableField<UcMemberCollegeRecord, Long> VERSION = createField("version", org.jooq.impl.SQLDataType.BIGINT.defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * Create a <code>xbkj.uc_member_college</code> table reference
     */
    public UcMemberCollege() {
        this(DSL.name("uc_member_college"), null);
    }

    /**
     * Create an aliased <code>xbkj.uc_member_college</code> table reference
     */
    public UcMemberCollege(String alias) {
        this(DSL.name(alias), UC_MEMBER_COLLEGE);
    }

    /**
     * Create an aliased <code>xbkj.uc_member_college</code> table reference
     */
    public UcMemberCollege(Name alias) {
        this(alias, UC_MEMBER_COLLEGE);
    }

    private UcMemberCollege(Name alias, Table<UcMemberCollegeRecord> aliased) {
        this(alias, aliased, null);
    }

    private UcMemberCollege(Name alias, Table<UcMemberCollegeRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "毕业院校表");
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
        return Arrays.<Index>asList(Indexes.UC_MEMBER_COLLEGE_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<UcMemberCollegeRecord, Long> getIdentity() {
        return Keys.IDENTITY_UC_MEMBER_COLLEGE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<UcMemberCollegeRecord> getPrimaryKey() {
        return Keys.KEY_UC_MEMBER_COLLEGE_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<UcMemberCollegeRecord>> getKeys() {
        return Arrays.<UniqueKey<UcMemberCollegeRecord>>asList(Keys.KEY_UC_MEMBER_COLLEGE_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UcMemberCollege as(String alias) {
        return new UcMemberCollege(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UcMemberCollege as(Name alias) {
        return new UcMemberCollege(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public UcMemberCollege rename(String name) {
        return new UcMemberCollege(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public UcMemberCollege rename(Name name) {
        return new UcMemberCollege(name, null);
    }
}
