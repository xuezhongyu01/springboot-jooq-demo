/*
 * This file is generated by jOOQ.
*/
package com.jooq.domain.tables.records;


import com.jooq.domain.enums.BscFileStorageWay;
import com.jooq.domain.tables.BscFile;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record12;
import org.jooq.Row12;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * 文件表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class BscFileRecord extends UpdatableRecordImpl<BscFileRecord> implements Record12<Long, String, String, Long, String, Timestamp, String, BscFileStorageWay, Timestamp, Timestamp, String, Boolean> {

    private static final long serialVersionUID = 426758145;

    /**
     * Setter for <code>xbkj.bsc_file.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>xbkj.bsc_file.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>xbkj.bsc_file.file_name</code>. 文件名字
     */
    public void setFileName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>xbkj.bsc_file.file_name</code>. 文件名字
     */
    public String getFileName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>xbkj.bsc_file.file_url</code>. 文件url
     */
    public void setFileUrl(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>xbkj.bsc_file.file_url</code>. 文件url
     */
    public String getFileUrl() {
        return (String) get(2);
    }

    /**
     * Setter for <code>xbkj.bsc_file.file_size</code>. 文件大小
     */
    public void setFileSize(Long value) {
        set(3, value);
    }

    /**
     * Getter for <code>xbkj.bsc_file.file_size</code>. 文件大小
     */
    public Long getFileSize() {
        return (Long) get(3);
    }

    /**
     * Setter for <code>xbkj.bsc_file.file_ext</code>. 文件后缀名
     */
    public void setFileExt(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>xbkj.bsc_file.file_ext</code>. 文件后缀名
     */
    public String getFileExt() {
        return (String) get(4);
    }

    /**
     * Setter for <code>xbkj.bsc_file.upload_time</code>. 上传时间
     */
    public void setUploadTime(Timestamp value) {
        set(5, value);
    }

    /**
     * Getter for <code>xbkj.bsc_file.upload_time</code>. 上传时间
     */
    public Timestamp getUploadTime() {
        return (Timestamp) get(5);
    }

    /**
     * Setter for <code>xbkj.bsc_file.file_desc</code>.
     */
    public void setFileDesc(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>xbkj.bsc_file.file_desc</code>.
     */
    public String getFileDesc() {
        return (String) get(6);
    }

    /**
     * Setter for <code>xbkj.bsc_file.storage_way</code>. 存储方式
     */
    public void setStorageWay(BscFileStorageWay value) {
        set(7, value);
    }

    /**
     * Getter for <code>xbkj.bsc_file.storage_way</code>. 存储方式
     */
    public BscFileStorageWay getStorageWay() {
        return (BscFileStorageWay) get(7);
    }

    /**
     * Setter for <code>xbkj.bsc_file.create_at</code>. 创建时间
     */
    public void setCreateAt(Timestamp value) {
        set(8, value);
    }

    /**
     * Getter for <code>xbkj.bsc_file.create_at</code>. 创建时间
     */
    public Timestamp getCreateAt() {
        return (Timestamp) get(8);
    }

    /**
     * Setter for <code>xbkj.bsc_file.update_at</code>. 更新时间
     */
    public void setUpdateAt(Timestamp value) {
        set(9, value);
    }

    /**
     * Getter for <code>xbkj.bsc_file.update_at</code>. 更新时间
     */
    public Timestamp getUpdateAt() {
        return (Timestamp) get(9);
    }

    /**
     * Setter for <code>xbkj.bsc_file.remarks</code>. 备注信息
     */
    public void setRemarks(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>xbkj.bsc_file.remarks</code>. 备注信息
     */
    public String getRemarks() {
        return (String) get(10);
    }

    /**
     * Setter for <code>xbkj.bsc_file.del_flag</code>. 删除标志
     */
    public void setDelFlag(Boolean value) {
        set(11, value);
    }

    /**
     * Getter for <code>xbkj.bsc_file.del_flag</code>. 删除标志
     */
    public Boolean getDelFlag() {
        return (Boolean) get(11);
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
    public Row12<Long, String, String, Long, String, Timestamp, String, BscFileStorageWay, Timestamp, Timestamp, String, Boolean> fieldsRow() {
        return (Row12) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row12<Long, String, String, Long, String, Timestamp, String, BscFileStorageWay, Timestamp, Timestamp, String, Boolean> valuesRow() {
        return (Row12) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return BscFile.BSC_FILE.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return BscFile.BSC_FILE.FILE_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return BscFile.BSC_FILE.FILE_URL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field4() {
        return BscFile.BSC_FILE.FILE_SIZE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return BscFile.BSC_FILE.FILE_EXT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field6() {
        return BscFile.BSC_FILE.UPLOAD_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return BscFile.BSC_FILE.FILE_DESC;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BscFileStorageWay> field8() {
        return BscFile.BSC_FILE.STORAGE_WAY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field9() {
        return BscFile.BSC_FILE.CREATE_AT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field10() {
        return BscFile.BSC_FILE.UPDATE_AT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field11() {
        return BscFile.BSC_FILE.REMARKS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field12() {
        return BscFile.BSC_FILE.DEL_FLAG;
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
    public String component2() {
        return getFileName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getFileUrl();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component4() {
        return getFileSize();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getFileExt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component6() {
        return getUploadTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getFileDesc();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BscFileStorageWay component8() {
        return getStorageWay();
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
    public String component11() {
        return getRemarks();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component12() {
        return getDelFlag();
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
    public String value2() {
        return getFileName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getFileUrl();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value4() {
        return getFileSize();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getFileExt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value6() {
        return getUploadTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getFileDesc();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BscFileStorageWay value8() {
        return getStorageWay();
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
    public String value11() {
        return getRemarks();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value12() {
        return getDelFlag();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BscFileRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BscFileRecord value2(String value) {
        setFileName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BscFileRecord value3(String value) {
        setFileUrl(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BscFileRecord value4(Long value) {
        setFileSize(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BscFileRecord value5(String value) {
        setFileExt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BscFileRecord value6(Timestamp value) {
        setUploadTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BscFileRecord value7(String value) {
        setFileDesc(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BscFileRecord value8(BscFileStorageWay value) {
        setStorageWay(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BscFileRecord value9(Timestamp value) {
        setCreateAt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BscFileRecord value10(Timestamp value) {
        setUpdateAt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BscFileRecord value11(String value) {
        setRemarks(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BscFileRecord value12(Boolean value) {
        setDelFlag(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BscFileRecord values(Long value1, String value2, String value3, Long value4, String value5, Timestamp value6, String value7, BscFileStorageWay value8, Timestamp value9, Timestamp value10, String value11, Boolean value12) {
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
     * Create a detached BscFileRecord
     */
    public BscFileRecord() {
        super(BscFile.BSC_FILE);
    }

    /**
     * Create a detached, initialised BscFileRecord
     */
    public BscFileRecord(Long id, String fileName, String fileUrl, Long fileSize, String fileExt, Timestamp uploadTime, String fileDesc, BscFileStorageWay storageWay, Timestamp createAt, Timestamp updateAt, String remarks, Boolean delFlag) {
        super(BscFile.BSC_FILE);

        set(0, id);
        set(1, fileName);
        set(2, fileUrl);
        set(3, fileSize);
        set(4, fileExt);
        set(5, uploadTime);
        set(6, fileDesc);
        set(7, storageWay);
        set(8, createAt);
        set(9, updateAt);
        set(10, remarks);
        set(11, delFlag);
    }
}