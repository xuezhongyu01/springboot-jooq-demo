/*
 * This file is generated by jOOQ.
*/
package com.jooq.domain.tables;


import com.jooq.domain.Indexes;
import com.jooq.domain.Keys;
import com.jooq.domain.Xbkj;
import com.jooq.domain.tables.records.SysLogRecord;

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
 * 日志表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SysLog extends TableImpl<SysLogRecord> {

    private static final long serialVersionUID = 1745375891;

    /**
     * The reference instance of <code>xbkj.sys_log</code>
     */
    public static final SysLog SYS_LOG = new SysLog();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SysLogRecord> getRecordType() {
        return SysLogRecord.class;
    }

    /**
     * The column <code>xbkj.sys_log.id</code>. 编号
     */
    public final TableField<SysLogRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).identity(true), this, "编号");

    /**
     * The column <code>xbkj.sys_log.module_name</code>. 模块名称
     */
    public final TableField<SysLogRecord, String> MODULE_NAME = createField("module_name", org.jooq.impl.SQLDataType.VARCHAR(256), this, "模块名称");

    /**
     * The column <code>xbkj.sys_log.module_desc</code>. 日志描述
     */
    public final TableField<SysLogRecord, String> MODULE_DESC = createField("module_desc", org.jooq.impl.SQLDataType.VARCHAR(1000), this, "日志描述");

    /**
     * The column <code>xbkj.sys_log.remote_addr</code>. 操作IP地址
     */
    public final TableField<SysLogRecord, String> REMOTE_ADDR = createField("remote_addr", org.jooq.impl.SQLDataType.VARCHAR(256), this, "操作IP地址");

    /**
     * The column <code>xbkj.sys_log.operate_id</code>. 操作者ID
     */
    public final TableField<SysLogRecord, Long> OPERATE_ID = createField("operate_id", org.jooq.impl.SQLDataType.BIGINT, this, "操作者ID");

    /**
     * The column <code>xbkj.sys_log.operate_name</code>. 操作者姓名
     */
    public final TableField<SysLogRecord, String> OPERATE_NAME = createField("operate_name", org.jooq.impl.SQLDataType.VARCHAR(64), this, "操作者姓名");

    /**
     * The column <code>xbkj.sys_log.operate_method</code>. 操作方法
     */
    public final TableField<SysLogRecord, String> OPERATE_METHOD = createField("operate_method", org.jooq.impl.SQLDataType.CLOB, this, "操作方法");

    /**
     * The column <code>xbkj.sys_log.request_url</code>. 请求URL
     */
    public final TableField<SysLogRecord, String> REQUEST_URL = createField("request_url", org.jooq.impl.SQLDataType.VARCHAR(3000), this, "请求URL");

    /**
     * The column <code>xbkj.sys_log.params</code>. 操作提交的数据
     */
    public final TableField<SysLogRecord, String> PARAMS = createField("params", org.jooq.impl.SQLDataType.CLOB, this, "操作提交的数据");

    /**
     * The column <code>xbkj.sys_log.result</code>. 操作返回的结果
     */
    public final TableField<SysLogRecord, String> RESULT = createField("result", org.jooq.impl.SQLDataType.CLOB, this, "操作返回的结果");

    /**
     * The column <code>xbkj.sys_log.exception</code>. 异常信息
     */
    public final TableField<SysLogRecord, String> EXCEPTION = createField("exception", org.jooq.impl.SQLDataType.CLOB, this, "异常信息");

    /**
     * The column <code>xbkj.sys_log.operate_time</code>. 操作时间
     */
    public final TableField<SysLogRecord, Timestamp> OPERATE_TIME = createField("operate_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "操作时间");

    /**
     * Create a <code>xbkj.sys_log</code> table reference
     */
    public SysLog() {
        this(DSL.name("sys_log"), null);
    }

    /**
     * Create an aliased <code>xbkj.sys_log</code> table reference
     */
    public SysLog(String alias) {
        this(DSL.name(alias), SYS_LOG);
    }

    /**
     * Create an aliased <code>xbkj.sys_log</code> table reference
     */
    public SysLog(Name alias) {
        this(alias, SYS_LOG);
    }

    private SysLog(Name alias, Table<SysLogRecord> aliased) {
        this(alias, aliased, null);
    }

    private SysLog(Name alias, Table<SysLogRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "日志表");
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
        return Arrays.<Index>asList(Indexes.SYS_LOG_PRIMARY, Indexes.SYS_LOG_SYS_LOG_CREATE_BY, Indexes.SYS_LOG_SYS_LOG_CREATE_DATE, Indexes.SYS_LOG_SYS_LOG_TYPE);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<SysLogRecord, Long> getIdentity() {
        return Keys.IDENTITY_SYS_LOG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<SysLogRecord> getPrimaryKey() {
        return Keys.KEY_SYS_LOG_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<SysLogRecord>> getKeys() {
        return Arrays.<UniqueKey<SysLogRecord>>asList(Keys.KEY_SYS_LOG_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SysLog as(String alias) {
        return new SysLog(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SysLog as(Name alias) {
        return new SysLog(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public SysLog rename(String name) {
        return new SysLog(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public SysLog rename(Name name) {
        return new SysLog(name, null);
    }
}
