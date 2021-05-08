/*
 * This file is generated by jOOQ.
*/
package com.jooq.domain.tables.records;


import com.jooq.domain.tables.UcMemberDegree;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record18;
import org.jooq.Row18;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * 学历表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UcMemberDegreeRecord extends UpdatableRecordImpl<UcMemberDegreeRecord> implements Record18<Long, Long, String, String, String, String, String, String, String, String, String, String, String, String, Timestamp, Timestamp, Boolean, Long> {

    private static final long serialVersionUID = 210031730;

    /**
     * Setter for <code>xbkj.uc_member_degree.id</code>. id
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>xbkj.uc_member_degree.id</code>. id
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>xbkj.uc_member_degree.member_id</code>. memberId
     */
    public void setMemberId(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>xbkj.uc_member_degree.member_id</code>. memberId
     */
    public Long getMemberId() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>xbkj.uc_member_degree.degree</code>. 学历
     */
    public void setDegree(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>xbkj.uc_member_degree.degree</code>. 学历
     */
    public String getDegree() {
        return (String) get(2);
    }

    /**
     * Setter for <code>xbkj.uc_member_degree.start_time</code>. 入学时间
     */
    public void setStartTime(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>xbkj.uc_member_degree.start_time</code>. 入学时间
     */
    public String getStartTime() {
        return (String) get(3);
    }

    /**
     * Setter for <code>xbkj.uc_member_degree.graduate_time</code>. 毕业时间
     */
    public void setGraduateTime(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>xbkj.uc_member_degree.graduate_time</code>. 毕业时间
     */
    public String getGraduateTime() {
        return (String) get(4);
    }

    /**
     * Setter for <code>xbkj.uc_member_degree.iskey_subject</code>. 是否国家重点学科
     */
    public void setIskeySubject(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>xbkj.uc_member_degree.iskey_subject</code>. 是否国家重点学科
     */
    public String getIskeySubject() {
        return (String) get(5);
    }

    /**
     * Setter for <code>xbkj.uc_member_degree.level_no</code>. 学历层次
     */
    public void setLevelNo(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>xbkj.uc_member_degree.level_no</code>. 学历层次
     */
    public String getLevelNo() {
        return (String) get(6);
    }

    /**
     * Setter for <code>xbkj.uc_member_degree.study_result</code>. 毕业结论
     */
    public void setStudyResult(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>xbkj.uc_member_degree.study_result</code>. 毕业结论
     */
    public String getStudyResult() {
        return (String) get(7);
    }

    /**
     * Setter for <code>xbkj.uc_member_degree.study_style</code>. 学习形式
     */
    public void setStudyStyle(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>xbkj.uc_member_degree.study_style</code>. 学习形式
     */
    public String getStudyStyle() {
        return (String) get(8);
    }

    /**
     * Setter for <code>xbkj.uc_member_degree.study_type</code>. 学历类别
     */
    public void setStudyType(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>xbkj.uc_member_degree.study_type</code>. 学历类别
     */
    public String getStudyType() {
        return (String) get(9);
    }

    /**
     * Setter for <code>xbkj.uc_member_degree.specialty</code>. 专业
     */
    public void setSpecialty(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>xbkj.uc_member_degree.specialty</code>. 专业
     */
    public String getSpecialty() {
        return (String) get(10);
    }

    /**
     * Setter for <code>xbkj.uc_member_degree.photo</code>. 毕业照片
     */
    public void setPhoto(String value) {
        set(11, value);
    }

    /**
     * Getter for <code>xbkj.uc_member_degree.photo</code>. 毕业照片
     */
    public String getPhoto() {
        return (String) get(11);
    }

    /**
     * Setter for <code>xbkj.uc_member_degree.photo_style</code>. 毕业照片格式
     */
    public void setPhotoStyle(String value) {
        set(12, value);
    }

    /**
     * Getter for <code>xbkj.uc_member_degree.photo_style</code>. 毕业照片格式
     */
    public String getPhotoStyle() {
        return (String) get(12);
    }

    /**
     * Setter for <code>xbkj.uc_member_degree.college</code>. 毕业院校
     */
    public void setCollege(String value) {
        set(13, value);
    }

    /**
     * Getter for <code>xbkj.uc_member_degree.college</code>. 毕业院校
     */
    public String getCollege() {
        return (String) get(13);
    }

    /**
     * Setter for <code>xbkj.uc_member_degree.create_at</code>. 创建时间
     */
    public void setCreateAt(Timestamp value) {
        set(14, value);
    }

    /**
     * Getter for <code>xbkj.uc_member_degree.create_at</code>. 创建时间
     */
    public Timestamp getCreateAt() {
        return (Timestamp) get(14);
    }

    /**
     * Setter for <code>xbkj.uc_member_degree.update_at</code>. 更新时间
     */
    public void setUpdateAt(Timestamp value) {
        set(15, value);
    }

    /**
     * Getter for <code>xbkj.uc_member_degree.update_at</code>. 更新时间
     */
    public Timestamp getUpdateAt() {
        return (Timestamp) get(15);
    }

    /**
     * Setter for <code>xbkj.uc_member_degree.del_flag</code>. 删除标志
     */
    public void setDelFlag(Boolean value) {
        set(16, value);
    }

    /**
     * Getter for <code>xbkj.uc_member_degree.del_flag</code>. 删除标志
     */
    public Boolean getDelFlag() {
        return (Boolean) get(16);
    }

    /**
     * Setter for <code>xbkj.uc_member_degree.version</code>.
     */
    public void setVersion(Long value) {
        set(17, value);
    }

    /**
     * Getter for <code>xbkj.uc_member_degree.version</code>.
     */
    public Long getVersion() {
        return (Long) get(17);
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
    // Record18 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row18<Long, Long, String, String, String, String, String, String, String, String, String, String, String, String, Timestamp, Timestamp, Boolean, Long> fieldsRow() {
        return (Row18) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row18<Long, Long, String, String, String, String, String, String, String, String, String, String, String, String, Timestamp, Timestamp, Boolean, Long> valuesRow() {
        return (Row18) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return UcMemberDegree.UC_MEMBER_DEGREE.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field2() {
        return UcMemberDegree.UC_MEMBER_DEGREE.MEMBER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return UcMemberDegree.UC_MEMBER_DEGREE.DEGREE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return UcMemberDegree.UC_MEMBER_DEGREE.START_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return UcMemberDegree.UC_MEMBER_DEGREE.GRADUATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return UcMemberDegree.UC_MEMBER_DEGREE.ISKEY_SUBJECT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return UcMemberDegree.UC_MEMBER_DEGREE.LEVEL_NO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return UcMemberDegree.UC_MEMBER_DEGREE.STUDY_RESULT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return UcMemberDegree.UC_MEMBER_DEGREE.STUDY_STYLE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field10() {
        return UcMemberDegree.UC_MEMBER_DEGREE.STUDY_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field11() {
        return UcMemberDegree.UC_MEMBER_DEGREE.SPECIALTY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field12() {
        return UcMemberDegree.UC_MEMBER_DEGREE.PHOTO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field13() {
        return UcMemberDegree.UC_MEMBER_DEGREE.PHOTO_STYLE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field14() {
        return UcMemberDegree.UC_MEMBER_DEGREE.COLLEGE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field15() {
        return UcMemberDegree.UC_MEMBER_DEGREE.CREATE_AT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field16() {
        return UcMemberDegree.UC_MEMBER_DEGREE.UPDATE_AT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field17() {
        return UcMemberDegree.UC_MEMBER_DEGREE.DEL_FLAG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field18() {
        return UcMemberDegree.UC_MEMBER_DEGREE.VERSION;
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
        return getMemberId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getDegree();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getStartTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getGraduateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getIskeySubject();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getLevelNo();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component8() {
        return getStudyResult();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component9() {
        return getStudyStyle();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component10() {
        return getStudyType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component11() {
        return getSpecialty();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component12() {
        return getPhoto();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component13() {
        return getPhotoStyle();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component14() {
        return getCollege();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component15() {
        return getCreateAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component16() {
        return getUpdateAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component17() {
        return getDelFlag();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component18() {
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
        return getMemberId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getDegree();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getStartTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getGraduateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getIskeySubject();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getLevelNo();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getStudyResult();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getStudyStyle();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value10() {
        return getStudyType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value11() {
        return getSpecialty();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value12() {
        return getPhoto();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value13() {
        return getPhotoStyle();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value14() {
        return getCollege();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value15() {
        return getCreateAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value16() {
        return getUpdateAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value17() {
        return getDelFlag();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value18() {
        return getVersion();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UcMemberDegreeRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UcMemberDegreeRecord value2(Long value) {
        setMemberId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UcMemberDegreeRecord value3(String value) {
        setDegree(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UcMemberDegreeRecord value4(String value) {
        setStartTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UcMemberDegreeRecord value5(String value) {
        setGraduateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UcMemberDegreeRecord value6(String value) {
        setIskeySubject(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UcMemberDegreeRecord value7(String value) {
        setLevelNo(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UcMemberDegreeRecord value8(String value) {
        setStudyResult(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UcMemberDegreeRecord value9(String value) {
        setStudyStyle(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UcMemberDegreeRecord value10(String value) {
        setStudyType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UcMemberDegreeRecord value11(String value) {
        setSpecialty(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UcMemberDegreeRecord value12(String value) {
        setPhoto(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UcMemberDegreeRecord value13(String value) {
        setPhotoStyle(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UcMemberDegreeRecord value14(String value) {
        setCollege(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UcMemberDegreeRecord value15(Timestamp value) {
        setCreateAt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UcMemberDegreeRecord value16(Timestamp value) {
        setUpdateAt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UcMemberDegreeRecord value17(Boolean value) {
        setDelFlag(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UcMemberDegreeRecord value18(Long value) {
        setVersion(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UcMemberDegreeRecord values(Long value1, Long value2, String value3, String value4, String value5, String value6, String value7, String value8, String value9, String value10, String value11, String value12, String value13, String value14, Timestamp value15, Timestamp value16, Boolean value17, Long value18) {
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
        value13(value13);
        value14(value14);
        value15(value15);
        value16(value16);
        value17(value17);
        value18(value18);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached UcMemberDegreeRecord
     */
    public UcMemberDegreeRecord() {
        super(UcMemberDegree.UC_MEMBER_DEGREE);
    }

    /**
     * Create a detached, initialised UcMemberDegreeRecord
     */
    public UcMemberDegreeRecord(Long id, Long memberId, String degree, String startTime, String graduateTime, String iskeySubject, String levelNo, String studyResult, String studyStyle, String studyType, String specialty, String photo, String photoStyle, String college, Timestamp createAt, Timestamp updateAt, Boolean delFlag, Long version) {
        super(UcMemberDegree.UC_MEMBER_DEGREE);

        set(0, id);
        set(1, memberId);
        set(2, degree);
        set(3, startTime);
        set(4, graduateTime);
        set(5, iskeySubject);
        set(6, levelNo);
        set(7, studyResult);
        set(8, studyStyle);
        set(9, studyType);
        set(10, specialty);
        set(11, photo);
        set(12, photoStyle);
        set(13, college);
        set(14, createAt);
        set(15, updateAt);
        set(16, delFlag);
        set(17, version);
    }
}
