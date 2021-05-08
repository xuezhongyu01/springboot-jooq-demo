/*
 * This file is generated by jOOQ.
*/
package com.jooq.domain.tables.records;


import com.jooq.domain.enums.MsgMessageLogStatus;
import com.jooq.domain.enums.MsgMessageLogType;
import com.jooq.domain.tables.MsgMessageLog;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record14;
import org.jooq.Row14;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * 消息日志
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class MsgMessageLogRecord extends UpdatableRecordImpl<MsgMessageLogRecord> implements Record14<Long, Long, Long, String, String, Timestamp, Timestamp, MsgMessageLogStatus, MsgMessageLogType, String, Timestamp, Timestamp, Boolean, Long> {

    private static final long serialVersionUID = -1956251604;

    /**
     * Setter for <code>xbkj.msg_message_log.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>xbkj.msg_message_log.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>xbkj.msg_message_log.member_id</code>. 用户编号
     */
    public void setMemberId(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>xbkj.msg_message_log.member_id</code>. 用户编号
     */
    public Long getMemberId() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>xbkj.msg_message_log.msg_message_template_id</code>. 消息模板内容编号
     */
    public void setMsgMessageTemplateId(Long value) {
        set(2, value);
    }

    /**
     * Getter for <code>xbkj.msg_message_log.msg_message_template_id</code>. 消息模板内容编号
     */
    public Long getMsgMessageTemplateId() {
        return (Long) get(2);
    }

    /**
     * Setter for <code>xbkj.msg_message_log.subject</code>. 标题
     */
    public void setSubject(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>xbkj.msg_message_log.subject</code>. 标题
     */
    public String getSubject() {
        return (String) get(3);
    }

    /**
     * Setter for <code>xbkj.msg_message_log.content</code>. 内容
     */
    public void setContent(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>xbkj.msg_message_log.content</code>. 内容
     */
    public String getContent() {
        return (String) get(4);
    }

    /**
     * Setter for <code>xbkj.msg_message_log.receive_date</code>. 接收时间
     */
    public void setReceiveDate(Timestamp value) {
        set(5, value);
    }

    /**
     * Getter for <code>xbkj.msg_message_log.receive_date</code>. 接收时间
     */
    public Timestamp getReceiveDate() {
        return (Timestamp) get(5);
    }

    /**
     * Setter for <code>xbkj.msg_message_log.read_time</code>. 阅读时间
     */
    public void setReadTime(Timestamp value) {
        set(6, value);
    }

    /**
     * Getter for <code>xbkj.msg_message_log.read_time</code>. 阅读时间
     */
    public Timestamp getReadTime() {
        return (Timestamp) get(6);
    }

    /**
     * Setter for <code>xbkj.msg_message_log.status</code>. 状态：未读，已读
     */
    public void setStatus(MsgMessageLogStatus value) {
        set(7, value);
    }

    /**
     * Getter for <code>xbkj.msg_message_log.status</code>. 状态：未读，已读
     */
    public MsgMessageLogStatus getStatus() {
        return (MsgMessageLogStatus) get(7);
    }

    /**
     * Setter for <code>xbkj.msg_message_log.type</code>. 类型 '普通','紧急'
     */
    public void setType(MsgMessageLogType value) {
        set(8, value);
    }

    /**
     * Getter for <code>xbkj.msg_message_log.type</code>. 类型 '普通','紧急'
     */
    public MsgMessageLogType getType() {
        return (MsgMessageLogType) get(8);
    }

    /**
     * Setter for <code>xbkj.msg_message_log.href</code>. 消息链接
     */
    public void setHref(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>xbkj.msg_message_log.href</code>. 消息链接
     */
    public String getHref() {
        return (String) get(9);
    }

    /**
     * Setter for <code>xbkj.msg_message_log.create_at</code>. 创建时间
     */
    public void setCreateAt(Timestamp value) {
        set(10, value);
    }

    /**
     * Getter for <code>xbkj.msg_message_log.create_at</code>. 创建时间
     */
    public Timestamp getCreateAt() {
        return (Timestamp) get(10);
    }

    /**
     * Setter for <code>xbkj.msg_message_log.update_at</code>. 更新时间
     */
    public void setUpdateAt(Timestamp value) {
        set(11, value);
    }

    /**
     * Getter for <code>xbkj.msg_message_log.update_at</code>. 更新时间
     */
    public Timestamp getUpdateAt() {
        return (Timestamp) get(11);
    }

    /**
     * Setter for <code>xbkj.msg_message_log.del_flag</code>. 删除标志
     */
    public void setDelFlag(Boolean value) {
        set(12, value);
    }

    /**
     * Getter for <code>xbkj.msg_message_log.del_flag</code>. 删除标志
     */
    public Boolean getDelFlag() {
        return (Boolean) get(12);
    }

    /**
     * Setter for <code>xbkj.msg_message_log.version</code>.
     */
    public void setVersion(Long value) {
        set(13, value);
    }

    /**
     * Getter for <code>xbkj.msg_message_log.version</code>.
     */
    public Long getVersion() {
        return (Long) get(13);
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
    // Record14 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row14<Long, Long, Long, String, String, Timestamp, Timestamp, MsgMessageLogStatus, MsgMessageLogType, String, Timestamp, Timestamp, Boolean, Long> fieldsRow() {
        return (Row14) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row14<Long, Long, Long, String, String, Timestamp, Timestamp, MsgMessageLogStatus, MsgMessageLogType, String, Timestamp, Timestamp, Boolean, Long> valuesRow() {
        return (Row14) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return MsgMessageLog.MSG_MESSAGE_LOG.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field2() {
        return MsgMessageLog.MSG_MESSAGE_LOG.MEMBER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field3() {
        return MsgMessageLog.MSG_MESSAGE_LOG.MSG_MESSAGE_TEMPLATE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return MsgMessageLog.MSG_MESSAGE_LOG.SUBJECT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return MsgMessageLog.MSG_MESSAGE_LOG.CONTENT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field6() {
        return MsgMessageLog.MSG_MESSAGE_LOG.RECEIVE_DATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field7() {
        return MsgMessageLog.MSG_MESSAGE_LOG.READ_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<MsgMessageLogStatus> field8() {
        return MsgMessageLog.MSG_MESSAGE_LOG.STATUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<MsgMessageLogType> field9() {
        return MsgMessageLog.MSG_MESSAGE_LOG.TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field10() {
        return MsgMessageLog.MSG_MESSAGE_LOG.HREF;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field11() {
        return MsgMessageLog.MSG_MESSAGE_LOG.CREATE_AT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field12() {
        return MsgMessageLog.MSG_MESSAGE_LOG.UPDATE_AT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field13() {
        return MsgMessageLog.MSG_MESSAGE_LOG.DEL_FLAG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field14() {
        return MsgMessageLog.MSG_MESSAGE_LOG.VERSION;
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
    public Long component3() {
        return getMsgMessageTemplateId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getSubject();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getContent();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component6() {
        return getReceiveDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component7() {
        return getReadTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MsgMessageLogStatus component8() {
        return getStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MsgMessageLogType component9() {
        return getType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component10() {
        return getHref();
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
    public Boolean component13() {
        return getDelFlag();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component14() {
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
    public Long value3() {
        return getMsgMessageTemplateId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getSubject();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getContent();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value6() {
        return getReceiveDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value7() {
        return getReadTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MsgMessageLogStatus value8() {
        return getStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MsgMessageLogType value9() {
        return getType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value10() {
        return getHref();
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
    public Boolean value13() {
        return getDelFlag();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value14() {
        return getVersion();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MsgMessageLogRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MsgMessageLogRecord value2(Long value) {
        setMemberId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MsgMessageLogRecord value3(Long value) {
        setMsgMessageTemplateId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MsgMessageLogRecord value4(String value) {
        setSubject(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MsgMessageLogRecord value5(String value) {
        setContent(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MsgMessageLogRecord value6(Timestamp value) {
        setReceiveDate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MsgMessageLogRecord value7(Timestamp value) {
        setReadTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MsgMessageLogRecord value8(MsgMessageLogStatus value) {
        setStatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MsgMessageLogRecord value9(MsgMessageLogType value) {
        setType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MsgMessageLogRecord value10(String value) {
        setHref(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MsgMessageLogRecord value11(Timestamp value) {
        setCreateAt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MsgMessageLogRecord value12(Timestamp value) {
        setUpdateAt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MsgMessageLogRecord value13(Boolean value) {
        setDelFlag(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MsgMessageLogRecord value14(Long value) {
        setVersion(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MsgMessageLogRecord values(Long value1, Long value2, Long value3, String value4, String value5, Timestamp value6, Timestamp value7, MsgMessageLogStatus value8, MsgMessageLogType value9, String value10, Timestamp value11, Timestamp value12, Boolean value13, Long value14) {
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
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached MsgMessageLogRecord
     */
    public MsgMessageLogRecord() {
        super(MsgMessageLog.MSG_MESSAGE_LOG);
    }

    /**
     * Create a detached, initialised MsgMessageLogRecord
     */
    public MsgMessageLogRecord(Long id, Long memberId, Long msgMessageTemplateId, String subject, String content, Timestamp receiveDate, Timestamp readTime, MsgMessageLogStatus status, MsgMessageLogType type, String href, Timestamp createAt, Timestamp updateAt, Boolean delFlag, Long version) {
        super(MsgMessageLog.MSG_MESSAGE_LOG);

        set(0, id);
        set(1, memberId);
        set(2, msgMessageTemplateId);
        set(3, subject);
        set(4, content);
        set(5, receiveDate);
        set(6, readTime);
        set(7, status);
        set(8, type);
        set(9, href);
        set(10, createAt);
        set(11, updateAt);
        set(12, delFlag);
        set(13, version);
    }
}
