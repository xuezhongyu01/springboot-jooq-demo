/*
 * This file is generated by jOOQ.
*/
package com.jooq.domain.tables.records;


import com.jooq.domain.enums.BscFileBelongToOwnerOwnerType;
import com.jooq.domain.tables.BscFileBelongToOwner;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record7;
import org.jooq.Row7;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * 文件所属关系表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class BscFileBelongToOwnerRecord extends UpdatableRecordImpl<BscFileBelongToOwnerRecord> implements Record7<Long, Long, String, BscFileBelongToOwnerOwnerType, Timestamp, Timestamp, Boolean> {

    private static final long serialVersionUID = -1554872735;

    /**
     * Setter for <code>xbkj.bsc_file_belong_to_owner.id</code>. id
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>xbkj.bsc_file_belong_to_owner.id</code>. id
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>xbkj.bsc_file_belong_to_owner.bsc_file_id</code>. 文件表id
     */
    public void setBscFileId(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>xbkj.bsc_file_belong_to_owner.bsc_file_id</code>. 文件表id
     */
    public Long getBscFileId() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>xbkj.bsc_file_belong_to_owner.owner_id</code>. 此文件拥有者ID
     */
    public void setOwnerId(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>xbkj.bsc_file_belong_to_owner.owner_id</code>. 此文件拥有者ID
     */
    public String getOwnerId() {
        return (String) get(2);
    }

    /**
     * Setter for <code>xbkj.bsc_file_belong_to_owner.owner_type</code>. 拥有者类型
     */
    public void setOwnerType(BscFileBelongToOwnerOwnerType value) {
        set(3, value);
    }

    /**
     * Getter for <code>xbkj.bsc_file_belong_to_owner.owner_type</code>. 拥有者类型
     */
    public BscFileBelongToOwnerOwnerType getOwnerType() {
        return (BscFileBelongToOwnerOwnerType) get(3);
    }

    /**
     * Setter for <code>xbkj.bsc_file_belong_to_owner.create_at</code>. 创建时间
     */
    public void setCreateAt(Timestamp value) {
        set(4, value);
    }

    /**
     * Getter for <code>xbkj.bsc_file_belong_to_owner.create_at</code>. 创建时间
     */
    public Timestamp getCreateAt() {
        return (Timestamp) get(4);
    }

    /**
     * Setter for <code>xbkj.bsc_file_belong_to_owner.update_at</code>. 更新时间
     */
    public void setUpdateAt(Timestamp value) {
        set(5, value);
    }

    /**
     * Getter for <code>xbkj.bsc_file_belong_to_owner.update_at</code>. 更新时间
     */
    public Timestamp getUpdateAt() {
        return (Timestamp) get(5);
    }

    /**
     * Setter for <code>xbkj.bsc_file_belong_to_owner.del_flag</code>. 删除标志
     */
    public void setDelFlag(Boolean value) {
        set(6, value);
    }

    /**
     * Getter for <code>xbkj.bsc_file_belong_to_owner.del_flag</code>. 删除标志
     */
    public Boolean getDelFlag() {
        return (Boolean) get(6);
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
    // Record7 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<Long, Long, String, BscFileBelongToOwnerOwnerType, Timestamp, Timestamp, Boolean> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<Long, Long, String, BscFileBelongToOwnerOwnerType, Timestamp, Timestamp, Boolean> valuesRow() {
        return (Row7) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return BscFileBelongToOwner.BSC_FILE_BELONG_TO_OWNER.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field2() {
        return BscFileBelongToOwner.BSC_FILE_BELONG_TO_OWNER.BSC_FILE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return BscFileBelongToOwner.BSC_FILE_BELONG_TO_OWNER.OWNER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BscFileBelongToOwnerOwnerType> field4() {
        return BscFileBelongToOwner.BSC_FILE_BELONG_TO_OWNER.OWNER_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field5() {
        return BscFileBelongToOwner.BSC_FILE_BELONG_TO_OWNER.CREATE_AT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field6() {
        return BscFileBelongToOwner.BSC_FILE_BELONG_TO_OWNER.UPDATE_AT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field7() {
        return BscFileBelongToOwner.BSC_FILE_BELONG_TO_OWNER.DEL_FLAG;
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
        return getBscFileId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getOwnerId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BscFileBelongToOwnerOwnerType component4() {
        return getOwnerType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component5() {
        return getCreateAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component6() {
        return getUpdateAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component7() {
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
    public Long value2() {
        return getBscFileId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getOwnerId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BscFileBelongToOwnerOwnerType value4() {
        return getOwnerType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value5() {
        return getCreateAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value6() {
        return getUpdateAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value7() {
        return getDelFlag();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BscFileBelongToOwnerRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BscFileBelongToOwnerRecord value2(Long value) {
        setBscFileId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BscFileBelongToOwnerRecord value3(String value) {
        setOwnerId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BscFileBelongToOwnerRecord value4(BscFileBelongToOwnerOwnerType value) {
        setOwnerType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BscFileBelongToOwnerRecord value5(Timestamp value) {
        setCreateAt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BscFileBelongToOwnerRecord value6(Timestamp value) {
        setUpdateAt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BscFileBelongToOwnerRecord value7(Boolean value) {
        setDelFlag(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BscFileBelongToOwnerRecord values(Long value1, Long value2, String value3, BscFileBelongToOwnerOwnerType value4, Timestamp value5, Timestamp value6, Boolean value7) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached BscFileBelongToOwnerRecord
     */
    public BscFileBelongToOwnerRecord() {
        super(BscFileBelongToOwner.BSC_FILE_BELONG_TO_OWNER);
    }

    /**
     * Create a detached, initialised BscFileBelongToOwnerRecord
     */
    public BscFileBelongToOwnerRecord(Long id, Long bscFileId, String ownerId, BscFileBelongToOwnerOwnerType ownerType, Timestamp createAt, Timestamp updateAt, Boolean delFlag) {
        super(BscFileBelongToOwner.BSC_FILE_BELONG_TO_OWNER);

        set(0, id);
        set(1, bscFileId);
        set(2, ownerId);
        set(3, ownerType);
        set(4, createAt);
        set(5, updateAt);
        set(6, delFlag);
    }
}
