/*
 * This file is generated by jOOQ.
*/
package com.jooq.domain.tables;


import com.jooq.domain.Indexes;
import com.jooq.domain.Keys;
import com.jooq.domain.Xbkj;
import com.jooq.domain.enums.MsgSendMessageSendStatus;
import com.jooq.domain.enums.MsgSendMessageSendType;
import com.jooq.domain.enums.MsgSendMessageStatus;
import com.jooq.domain.tables.records.MsgSendMessageRecord;

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
 * 发送消息任务
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class MsgSendMessage extends TableImpl<MsgSendMessageRecord> {

    private static final long serialVersionUID = -2145339646;

    /**
     * The reference instance of <code>xbkj.msg_send_message</code>
     */
    public static final MsgSendMessage MSG_SEND_MESSAGE = new MsgSendMessage();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<MsgSendMessageRecord> getRecordType() {
        return MsgSendMessageRecord.class;
    }

    /**
     * The column <code>xbkj.msg_send_message.id</code>.
     */
    public final TableField<MsgSendMessageRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>xbkj.msg_send_message.send_type</code>. 消息类型：1:单个用户、2:所有会员、3:自定义发送条件
     */
    public final TableField<MsgSendMessageRecord, MsgSendMessageSendType> SEND_TYPE = createField("send_type", org.jooq.impl.SQLDataType.VARCHAR(6).nullable(false).asEnumDataType(com.jooq.domain.enums.MsgSendMessageSendType.class), this, "消息类型：1:单个用户、2:所有会员、3:自定义发送条件");

    /**
     * The column <code>xbkj.msg_send_message.send_to</code>. 发送对象
     */
    public final TableField<MsgSendMessageRecord, String> SEND_TO = createField("send_to", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "发送对象");

    /**
     * The column <code>xbkj.msg_send_message.send_template</code>. 发送模板，可能有多个
     */
    public final TableField<MsgSendMessageRecord, String> SEND_TEMPLATE = createField("send_template", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "发送模板，可能有多个");

    /**
     * The column <code>xbkj.msg_send_message.status</code>. 项目状态:审核未通过、等待审核、审核通过
     */
    public final TableField<MsgSendMessageRecord, MsgSendMessageStatus> STATUS = createField("status", org.jooq.impl.SQLDataType.VARCHAR(10).defaultValue(org.jooq.impl.DSL.inline("un_audit", org.jooq.impl.SQLDataType.VARCHAR)).asEnumDataType(com.jooq.domain.enums.MsgSendMessageStatus.class), this, "项目状态:审核未通过、等待审核、审核通过");

    /**
     * The column <code>xbkj.msg_send_message.send_time</code>. 发送时间
     */
    public final TableField<MsgSendMessageRecord, Timestamp> SEND_TIME = createField("send_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "发送时间");

    /**
     * The column <code>xbkj.msg_send_message.send_status</code>. 发送状态：等待发送，发送中 ，发送成功，发送失败
     */
    public final TableField<MsgSendMessageRecord, MsgSendMessageSendStatus> SEND_STATUS = createField("send_status", org.jooq.impl.SQLDataType.VARCHAR(15).asEnumDataType(com.jooq.domain.enums.MsgSendMessageSendStatus.class), this, "发送状态：等待发送，发送中 ，发送成功，发送失败");

    /**
     * The column <code>xbkj.msg_send_message.creator_id</code>. 创建者ID
     */
    public final TableField<MsgSendMessageRecord, Long> CREATOR_ID = createField("creator_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "创建者ID");

    /**
     * The column <code>xbkj.msg_send_message.auditor_id</code>. 审核者ID
     */
    public final TableField<MsgSendMessageRecord, Long> AUDITOR_ID = createField("auditor_id", org.jooq.impl.SQLDataType.BIGINT, this, "审核者ID");

    /**
     * The column <code>xbkj.msg_send_message.remark</code>. 备注
     */
    public final TableField<MsgSendMessageRecord, String> REMARK = createField("remark", org.jooq.impl.SQLDataType.VARCHAR(255), this, "备注");

    /**
     * The column <code>xbkj.msg_send_message.create_at</code>. 创建时间
     */
    public final TableField<MsgSendMessageRecord, Timestamp> CREATE_AT = createField("create_at", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "创建时间");

    /**
     * The column <code>xbkj.msg_send_message.update_at</code>. 更新时间
     */
    public final TableField<MsgSendMessageRecord, Timestamp> UPDATE_AT = createField("update_at", org.jooq.impl.SQLDataType.TIMESTAMP, this, "更新时间");

    /**
     * The column <code>xbkj.msg_send_message.del_flag</code>. 删除标志
     */
    public final TableField<MsgSendMessageRecord, Boolean> DEL_FLAG = createField("del_flag", org.jooq.impl.SQLDataType.BIT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("b'0'", org.jooq.impl.SQLDataType.BIT)), this, "删除标志");

    /**
     * The column <code>xbkj.msg_send_message.version</code>.
     */
    public final TableField<MsgSendMessageRecord, Long> VERSION = createField("version", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * Create a <code>xbkj.msg_send_message</code> table reference
     */
    public MsgSendMessage() {
        this(DSL.name("msg_send_message"), null);
    }

    /**
     * Create an aliased <code>xbkj.msg_send_message</code> table reference
     */
    public MsgSendMessage(String alias) {
        this(DSL.name(alias), MSG_SEND_MESSAGE);
    }

    /**
     * Create an aliased <code>xbkj.msg_send_message</code> table reference
     */
    public MsgSendMessage(Name alias) {
        this(alias, MSG_SEND_MESSAGE);
    }

    private MsgSendMessage(Name alias, Table<MsgSendMessageRecord> aliased) {
        this(alias, aliased, null);
    }

    private MsgSendMessage(Name alias, Table<MsgSendMessageRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "发送消息任务");
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
        return Arrays.<Index>asList(Indexes.MSG_SEND_MESSAGE_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<MsgSendMessageRecord, Long> getIdentity() {
        return Keys.IDENTITY_MSG_SEND_MESSAGE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<MsgSendMessageRecord> getPrimaryKey() {
        return Keys.KEY_MSG_SEND_MESSAGE_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<MsgSendMessageRecord>> getKeys() {
        return Arrays.<UniqueKey<MsgSendMessageRecord>>asList(Keys.KEY_MSG_SEND_MESSAGE_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MsgSendMessage as(String alias) {
        return new MsgSendMessage(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MsgSendMessage as(Name alias) {
        return new MsgSendMessage(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public MsgSendMessage rename(String name) {
        return new MsgSendMessage(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public MsgSendMessage rename(Name name) {
        return new MsgSendMessage(name, null);
    }
}
