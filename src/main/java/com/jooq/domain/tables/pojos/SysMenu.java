/*
 * This file is generated by jOOQ.
*/
package com.jooq.domain.tables.pojos;


import com.jooq.domain.enums.SysMenuStatus;
import com.jooq.domain.enums.SysMenuType;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.annotation.Generated;


/**
 * ่ๅ่กจ
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SysMenu implements Serializable {

    private static final long serialVersionUID = 931656598;

    private Long          id;
    private Long          parentId;
    private SysMenuType   type;
    private String        name;
    private String        href;
    private String        target;
    private String        icon;
    private Integer       sort;
    private SysMenuStatus status;
    private String        permission;
    private Timestamp     createAt;
    private Timestamp     updateAt;
    private String        remarks;
    private Boolean       delFlag;
    private Long          version;

    public SysMenu() {}

    public SysMenu(SysMenu value) {
        this.id = value.id;
        this.parentId = value.parentId;
        this.type = value.type;
        this.name = value.name;
        this.href = value.href;
        this.target = value.target;
        this.icon = value.icon;
        this.sort = value.sort;
        this.status = value.status;
        this.permission = value.permission;
        this.createAt = value.createAt;
        this.updateAt = value.updateAt;
        this.remarks = value.remarks;
        this.delFlag = value.delFlag;
        this.version = value.version;
    }

    public SysMenu(
        Long          id,
        Long          parentId,
        SysMenuType   type,
        String        name,
        String        href,
        String        target,
        String        icon,
        Integer       sort,
        SysMenuStatus status,
        String        permission,
        Timestamp     createAt,
        Timestamp     updateAt,
        String        remarks,
        Boolean       delFlag,
        Long          version
    ) {
        this.id = id;
        this.parentId = parentId;
        this.type = type;
        this.name = name;
        this.href = href;
        this.target = target;
        this.icon = icon;
        this.sort = sort;
        this.status = status;
        this.permission = permission;
        this.createAt = createAt;
        this.updateAt = updateAt;
        this.remarks = remarks;
        this.delFlag = delFlag;
        this.version = version;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getParentId() {
        return this.parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public SysMenuType getType() {
        return this.type;
    }

    public void setType(SysMenuType type) {
        this.type = type;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHref() {
        return this.href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public String getTarget() {
        return this.target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public String getIcon() {
        return this.icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public Integer getSort() {
        return this.sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public SysMenuStatus getStatus() {
        return this.status;
    }

    public void setStatus(SysMenuStatus status) {
        this.status = status;
    }

    public String getPermission() {
        return this.permission;
    }

    public void setPermission(String permission) {
        this.permission = permission;
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

    public String getRemarks() {
        return this.remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
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
        StringBuilder sb = new StringBuilder("SysMenu (");

        sb.append(id);
        sb.append(", ").append(parentId);
        sb.append(", ").append(type);
        sb.append(", ").append(name);
        sb.append(", ").append(href);
        sb.append(", ").append(target);
        sb.append(", ").append(icon);
        sb.append(", ").append(sort);
        sb.append(", ").append(status);
        sb.append(", ").append(permission);
        sb.append(", ").append(createAt);
        sb.append(", ").append(updateAt);
        sb.append(", ").append(remarks);
        sb.append(", ").append(delFlag);
        sb.append(", ").append(version);

        sb.append(")");
        return sb.toString();
    }
}
