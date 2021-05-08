/*
 * This file is generated by jOOQ.
*/
package com.jooq.domain.tables.records;


import com.jooq.domain.enums.UcShopTeacherStatus;
import com.jooq.domain.tables.UcShopTeacher;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record12;
import org.jooq.Row12;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * 教师列表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UcShopTeacherRecord extends UpdatableRecordImpl<UcShopTeacherRecord> implements Record12<Long, Long, String, String, String, UcShopTeacherStatus, String, String, Timestamp, Timestamp, Boolean, Long> {

    private static final long serialVersionUID = -1894549901;

    /**
     * Setter for <code>xbkj.uc_shop_teacher.id</code>. id
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>xbkj.uc_shop_teacher.id</code>. id
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>xbkj.uc_shop_teacher.shop_id</code>. 门店id
     */
    public void setShopId(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>xbkj.uc_shop_teacher.shop_id</code>. 门店id
     */
    public Long getShopId() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>xbkj.uc_shop_teacher.name</code>. 名字
     */
    public void setName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>xbkj.uc_shop_teacher.name</code>. 名字
     */
    public String getName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>xbkj.uc_shop_teacher.head_url</code>. 头像
     */
    public void setHeadUrl(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>xbkj.uc_shop_teacher.head_url</code>. 头像
     */
    public String getHeadUrl() {
        return (String) get(3);
    }

    /**
     * Setter for <code>xbkj.uc_shop_teacher.professional_title</code>. 职称
     */
    public void setProfessionalTitle(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>xbkj.uc_shop_teacher.professional_title</code>. 职称
     */
    public String getProfessionalTitle() {
        return (String) get(4);
    }

    /**
     * Setter for <code>xbkj.uc_shop_teacher.status</code>. 状态：保存，审核中，正常，禁用，其他
     */
    public void setStatus(UcShopTeacherStatus value) {
        set(5, value);
    }

    /**
     * Getter for <code>xbkj.uc_shop_teacher.status</code>. 状态：保存，审核中，正常，禁用，其他
     */
    public UcShopTeacherStatus getStatus() {
        return (UcShopTeacherStatus) get(5);
    }

    /**
     * Setter for <code>xbkj.uc_shop_teacher.infro</code>. 简介
     */
    public void setInfro(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>xbkj.uc_shop_teacher.infro</code>. 简介
     */
    public String getInfro() {
        return (String) get(6);
    }

    /**
     * Setter for <code>xbkj.uc_shop_teacher.detail_intro</code>. 详细介绍
     */
    public void setDetailIntro(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>xbkj.uc_shop_teacher.detail_intro</code>. 详细介绍
     */
    public String getDetailIntro() {
        return (String) get(7);
    }

    /**
     * Setter for <code>xbkj.uc_shop_teacher.create_at</code>. 创建时间
     */
    public void setCreateAt(Timestamp value) {
        set(8, value);
    }

    /**
     * Getter for <code>xbkj.uc_shop_teacher.create_at</code>. 创建时间
     */
    public Timestamp getCreateAt() {
        return (Timestamp) get(8);
    }

    /**
     * Setter for <code>xbkj.uc_shop_teacher.update_at</code>. 更新时间
     */
    public void setUpdateAt(Timestamp value) {
        set(9, value);
    }

    /**
     * Getter for <code>xbkj.uc_shop_teacher.update_at</code>. 更新时间
     */
    public Timestamp getUpdateAt() {
        return (Timestamp) get(9);
    }

    /**
     * Setter for <code>xbkj.uc_shop_teacher.del_flag</code>. 删除标志
     */
    public void setDelFlag(Boolean value) {
        set(10, value);
    }

    /**
     * Getter for <code>xbkj.uc_shop_teacher.del_flag</code>. 删除标志
     */
    public Boolean getDelFlag() {
        return (Boolean) get(10);
    }

    /**
     * Setter for <code>xbkj.uc_shop_teacher.version</code>.
     */
    public void setVersion(Long value) {
        set(11, value);
    }

    /**
     * Getter for <code>xbkj.uc_shop_teacher.version</code>.
     */
    public Long getVersion() {
        return (Long) get(11);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record12 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row12<Long, Long, String, String, String, UcShopTeacherStatus, String, String, Timestamp, Timestamp, Boolean, Long> fieldsRow() {
        return (Row12) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row12<Long, Long, String, String, String, UcShopTeacherStatus, String, String, Timestamp, Timestamp, Boolean, Long> valuesRow() {
        return (Row12) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return UcShopTeacher.UC_SHOP_TEACHER.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field2() {
        return UcShopTeacher.UC_SHOP_TEACHER.SHOP_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return UcShopTeacher.UC_SHOP_TEACHER.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return UcShopTeacher.UC_SHOP_TEACHER.HEAD_URL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return UcShopTeacher.UC_SHOP_TEACHER.PROFESSIONAL_TITLE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UcShopTeacherStatus> field6() {
        return UcShopTeacher.UC_SHOP_TEACHER.STATUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return UcShopTeacher.UC_SHOP_TEACHER.INFRO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return UcShopTeacher.UC_SHOP_TEACHER.DETAIL_INTRO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field9() {
        return UcShopTeacher.UC_SHOP_TEACHER.CREATE_AT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field10() {
        return UcShopTeacher.UC_SHOP_TEACHER.UPDATE_AT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field11() {
        return UcShopTeacher.UC_SHOP_TEACHER.DEL_FLAG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field12() {
        return UcShopTeacher.UC_SHOP_TEACHER.VERSION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component2() {
        return getShopId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getHeadUrl();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getProfessionalTitle();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UcShopTeacherStatus component6() {
        return getStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getInfro();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component8() {
        return getDetailIntro();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component9() {
        return getCreateAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component10() {
        return getUpdateAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component11() {
        return getDelFlag();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component12() {
        return getVersion();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value2() {
        return getShopId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getHeadUrl();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getProfessionalTitle();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UcShopTeacherStatus value6() {
        return getStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getInfro();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getDetailIntro();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value9() {
        return getCreateAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value10() {
        return getUpdateAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value11() {
        return getDelFlag();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value12() {
        return getVersion();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UcShopTeacherRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UcShopTeacherRecord value2(Long value) {
        setShopId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UcShopTeacherRecord value3(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UcShopTeacherRecord value4(String value) {
        setHeadUrl(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UcShopTeacherRecord value5(String value) {
        setProfessionalTitle(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UcShopTeacherRecord value6(UcShopTeacherStatus value) {
        setStatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UcShopTeacherRecord value7(String value) {
        setInfro(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UcShopTeacherRecord value8(String value) {
        setDetailIntro(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UcShopTeacherRecord value9(Timestamp value) {
        setCreateAt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UcShopTeacherRecord value10(Timestamp value) {
        setUpdateAt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UcShopTeacherRecord value11(Boolean value) {
        setDelFlag(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UcShopTeacherRecord value12(Long value) {
        setVersion(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UcShopTeacherRecord values(Long value1, Long value2, String value3, String value4, String value5, UcShopTeacherStatus value6, String value7, String value8, Timestamp value9, Timestamp value10, Boolean value11, Long value12) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        value12(value12);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached UcShopTeacherRecord
     */
    public UcShopTeacherRecord() {
        super(UcShopTeacher.UC_SHOP_TEACHER);
    }

    /**
     * Create a detached, initialised UcShopTeacherRecord
     */
    public UcShopTeacherRecord(Long id, Long shopId, String name, String headUrl, String professionalTitle, UcShopTeacherStatus status, String infro, String detailIntro, Timestamp createAt, Timestamp updateAt, Boolean delFlag, Long version) {
        super(UcShopTeacher.UC_SHOP_TEACHER);

        set(0, id);
        set(1, shopId);
        set(2, name);
        set(3, headUrl);
        set(4, professionalTitle);
        set(5, status);
        set(6, infro);
        set(7, detailIntro);
        set(8, createAt);
        set(9, updateAt);
        set(10, delFlag);
        set(11, version);
    }
}