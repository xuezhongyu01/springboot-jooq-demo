/*
 * This file is generated by jOOQ.
*/
package com.jooq.domain.tables.records;


import com.jooq.domain.enums.SysMenuStatus;
import com.jooq.domain.enums.SysMenuType;
import com.jooq.domain.tables.SysMenu;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record15;
import org.jooq.Row15;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * 菜单表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SysMenuRecord extends UpdatableRecordImpl<SysMenuRecord> implements Record15<Long, Long, SysMenuType, String, String, String, String, Integer, SysMenuStatus, String, Timestamp, Timestamp, String, Boolean, Long> {

    private static final long serialVersionUID = -910236657;

    /**
     * Setter for <code>xbkj.sys_menu.id</code>. 编号
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>xbkj.sys_menu.id</code>. 编号
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>xbkj.sys_menu.parent_id</code>. 父级编号
     */
    public void setParentId(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>xbkj.sys_menu.parent_id</code>. 父级编号
     */
    public Long getParentId() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>xbkj.sys_menu.type</code>. 类型一级菜单，页面，功能按钮
     */
    public void setType(SysMenuType value) {
        set(2, value);
    }

    /**
     * Getter for <code>xbkj.sys_menu.type</code>. 类型一级菜单，页面，功能按钮
     */
    public SysMenuType getType() {
        return (SysMenuType) get(2);
    }

    /**
     * Setter for <code>xbkj.sys_menu.name</code>. 菜单名称
     */
    public void setName(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>xbkj.sys_menu.name</code>. 菜单名称
     */
    public String getName() {
        return (String) get(3);
    }

    /**
     * Setter for <code>xbkj.sys_menu.href</code>. 链接
     */
    public void setHref(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>xbkj.sys_menu.href</code>. 链接
     */
    public String getHref() {
        return (String) get(4);
    }

    /**
     * Setter for <code>xbkj.sys_menu.target</code>. 目标
     */
    public void setTarget(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>xbkj.sys_menu.target</code>. 目标
     */
    public String getTarget() {
        return (String) get(5);
    }

    /**
     * Setter for <code>xbkj.sys_menu.icon</code>. 图标
     */
    public void setIcon(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>xbkj.sys_menu.icon</code>. 图标
     */
    public String getIcon() {
        return (String) get(6);
    }

    /**
     * Setter for <code>xbkj.sys_menu.sort</code>. 排序（升序）
     */
    public void setSort(Integer value) {
        set(7, value);
    }

    /**
     * Getter for <code>xbkj.sys_menu.sort</code>. 排序（升序）
     */
    public Integer getSort() {
        return (Integer) get(7);
    }

    /**
     * Setter for <code>xbkj.sys_menu.status</code>. 状态
     */
    public void setStatus(SysMenuStatus value) {
        set(8, value);
    }

    /**
     * Getter for <code>xbkj.sys_menu.status</code>. 状态
     */
    public SysMenuStatus getStatus() {
        return (SysMenuStatus) get(8);
    }

    /**
     * Setter for <code>xbkj.sys_menu.permission</code>. 权限标识
     */
    public void setPermission(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>xbkj.sys_menu.permission</code>. 权限标识
     */
    public String getPermission() {
        return (String) get(9);
    }

    /**
     * Setter for <code>xbkj.sys_menu.create_at</code>. 创建时间
     */
    public void setCreateAt(Timestamp value) {
        set(10, value);
    }

    /**
     * Getter for <code>xbkj.sys_menu.create_at</code>. 创建时间
     */
    public Timestamp getCreateAt() {
        return (Timestamp) get(10);
    }

    /**
     * Setter for <code>xbkj.sys_menu.update_at</code>. 更新时间
     */
    public void setUpdateAt(Timestamp value) {
        set(11, value);
    }

    /**
     * Getter for <code>xbkj.sys_menu.update_at</code>. 更新时间
     */
    public Timestamp getUpdateAt() {
        return (Timestamp) get(11);
    }

    /**
     * Setter for <code>xbkj.sys_menu.remarks</code>. 备注信息
     */
    public void setRemarks(String value) {
        set(12, value);
    }

    /**
     * Getter for <code>xbkj.sys_menu.remarks</code>. 备注信息
     */
    public String getRemarks() {
        return (String) get(12);
    }

    /**
     * Setter for <code>xbkj.sys_menu.del_flag</code>. 删除标记
     */
    public void setDelFlag(Boolean value) {
        set(13, value);
    }

    /**
     * Getter for <code>xbkj.sys_menu.del_flag</code>. 删除标记
     */
    public Boolean getDelFlag() {
        return (Boolean) get(13);
    }

    /**
     * Setter for <code>xbkj.sys_menu.version</code>.
     */
    public void setVersion(Long value) {
        set(14, value);
    }

    /**
     * Getter for <code>xbkj.sys_menu.version</code>.
     */
    public Long getVersion() {
        return (Long) get(14);
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
    // Record15 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row15<Long, Long, SysMenuType, String, String, String, String, Integer, SysMenuStatus, String, Timestamp, Timestamp, String, Boolean, Long> fieldsRow() {
        return (Row15) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row15<Long, Long, SysMenuType, String, String, String, String, Integer, SysMenuStatus, String, Timestamp, Timestamp, String, Boolean, Long> valuesRow() {
        return (Row15) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return SysMenu.SYS_MENU.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field2() {
        return SysMenu.SYS_MENU.PARENT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<SysMenuType> field3() {
        return SysMenu.SYS_MENU.TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return SysMenu.SYS_MENU.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return SysMenu.SYS_MENU.HREF;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return SysMenu.SYS_MENU.TARGET;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return SysMenu.SYS_MENU.ICON;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field8() {
        return SysMenu.SYS_MENU.SORT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<SysMenuStatus> field9() {
        return SysMenu.SYS_MENU.STATUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field10() {
        return SysMenu.SYS_MENU.PERMISSION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field11() {
        return SysMenu.SYS_MENU.CREATE_AT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field12() {
        return SysMenu.SYS_MENU.UPDATE_AT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field13() {
        return SysMenu.SYS_MENU.REMARKS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field14() {
        return SysMenu.SYS_MENU.DEL_FLAG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field15() {
        return SysMenu.SYS_MENU.VERSION;
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
        return getParentId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SysMenuType component3() {
        return getType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getHref();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getTarget();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getIcon();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component8() {
        return getSort();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SysMenuStatus component9() {
        return getStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component10() {
        return getPermission();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component11() {
        return getCreateAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component12() {
        return getUpdateAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component13() {
        return getRemarks();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component14() {
        return getDelFlag();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component15() {
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
        return getParentId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SysMenuType value3() {
        return getType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getHref();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getTarget();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getIcon();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value8() {
        return getSort();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SysMenuStatus value9() {
        return getStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value10() {
        return getPermission();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value11() {
        return getCreateAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value12() {
        return getUpdateAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value13() {
        return getRemarks();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value14() {
        return getDelFlag();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value15() {
        return getVersion();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SysMenuRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SysMenuRecord value2(Long value) {
        setParentId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SysMenuRecord value3(SysMenuType value) {
        setType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SysMenuRecord value4(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SysMenuRecord value5(String value) {
        setHref(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SysMenuRecord value6(String value) {
        setTarget(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SysMenuRecord value7(String value) {
        setIcon(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SysMenuRecord value8(Integer value) {
        setSort(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SysMenuRecord value9(SysMenuStatus value) {
        setStatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SysMenuRecord value10(String value) {
        setPermission(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SysMenuRecord value11(Timestamp value) {
        setCreateAt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SysMenuRecord value12(Timestamp value) {
        setUpdateAt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SysMenuRecord value13(String value) {
        setRemarks(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SysMenuRecord value14(Boolean value) {
        setDelFlag(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SysMenuRecord value15(Long value) {
        setVersion(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SysMenuRecord values(Long value1, Long value2, SysMenuType value3, String value4, String value5, String value6, String value7, Integer value8, SysMenuStatus value9, String value10, Timestamp value11, Timestamp value12, String value13, Boolean value14, Long value15) {
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
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached SysMenuRecord
     */
    public SysMenuRecord() {
        super(SysMenu.SYS_MENU);
    }

    /**
     * Create a detached, initialised SysMenuRecord
     */
    public SysMenuRecord(Long id, Long parentId, SysMenuType type, String name, String href, String target, String icon, Integer sort, SysMenuStatus status, String permission, Timestamp createAt, Timestamp updateAt, String remarks, Boolean delFlag, Long version) {
        super(SysMenu.SYS_MENU);

        set(0, id);
        set(1, parentId);
        set(2, type);
        set(3, name);
        set(4, href);
        set(5, target);
        set(6, icon);
        set(7, sort);
        set(8, status);
        set(9, permission);
        set(10, createAt);
        set(11, updateAt);
        set(12, remarks);
        set(13, delFlag);
        set(14, version);
    }
}
