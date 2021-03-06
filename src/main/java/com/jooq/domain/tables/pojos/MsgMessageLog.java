/*
 * This file is generated by jOOQ.
*/
package com.jooq.domain.tables.pojos;


import com.jooq.domain.enums.MsgMessageLogStatus;
import com.jooq.domain.enums.MsgMessageLogType;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.annotation.Generated;


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
public class MsgMessageLog implements Serializable {

    private static final long serialVersionUID = -1026726307;

    private Long                id;
    private Long                memberId;
    private Long                msgMessageTemplateId;
    private String              subject;
    private String              content;
    private Timestamp           receiveDate;
    private Timestamp           readTime;
    private MsgMessageLogStatus status;
    private MsgMessageLogType   type;
    private String              href;
    private Timestamp           createAt;
    private Timestamp           updateAt;
    private Boolean             delFlag;
    private Long                version;

    public MsgMessageLog() {}

    public MsgMessageLog(MsgMessageLog value) {
        this.id = value.id;
        this.memberId = value.memberId;
        this.msgMessageTemplateId = value.msgMessageTemplateId;
        this.subject = value.subject;
        this.content = value.content;
        this.receiveDate = value.receiveDate;
        this.readTime = value.readTime;
        this.status = value.status;
        this.type = value.type;
        this.href = value.href;
        this.createAt = value.createAt;
        this.updateAt = value.updateAt;
        this.delFlag = value.delFlag;
        this.version = value.version;
    }

    public MsgMessageLog(
        Long                id,
        Long                memberId,
        Long                msgMessageTemplateId,
        String              subject,
        String              content,
        Timestamp           receiveDate,
        Timestamp           readTime,
        MsgMessageLogStatus status,
        MsgMessageLogType   type,
        String              href,
        Timestamp           createAt,
        Timestamp           updateAt,
        Boolean             delFlag,
        Long                version
    ) {
        this.id = id;
        this.memberId = memberId;
        this.msgMessageTemplateId = msgMessageTemplateId;
        this.subject = subject;
        this.content = content;
        this.receiveDate = receiveDate;
        this.readTime = readTime;
        this.status = status;
        this.type = type;
        this.href = href;
        this.createAt = createAt;
        this.updateAt = updateAt;
        this.delFlag = delFlag;
        this.version = version;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getMemberId() {
        return this.memberId;
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    public Long getMsgMessageTemplateId() {
        return this.msgMessageTemplateId;
    }

    public void setMsgMessageTemplateId(Long msgMessageTemplateId) {
        this.msgMessageTemplateId = msgMessageTemplateId;
    }

    public String getSubject() {
        return this.subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getContent() {
        return this.content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Timestamp getReceiveDate() {
        return this.receiveDate;
    }

    public void setReceiveDate(Timestamp receiveDate) {
        this.receiveDate = receiveDate;
    }

    public Timestamp getReadTime() {
        return this.readTime;
    }

    public void setReadTime(Timestamp readTime) {
        this.readTime = readTime;
    }

    public MsgMessageLogStatus getStatus() {
        return this.status;
    }

    public void setStatus(MsgMessageLogStatus status) {
        this.status = status;
    }

    public MsgMessageLogType getType() {
        return this.type;
    }

    public void setType(MsgMessageLogType type) {
        this.type = type;
    }

    public String getHref() {
        return this.href;
    }

    public void setHref(String href) {
        this.href = href;
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
        StringBuilder sb = new StringBuilder("MsgMessageLog (");

        sb.append(id);
        sb.append(", ").append(memberId);
        sb.append(", ").append(msgMessageTemplateId);
        sb.append(", ").append(subject);
        sb.append(", ").append(content);
        sb.append(", ").append(receiveDate);
        sb.append(", ").append(readTime);
        sb.append(", ").append(status);
        sb.append(", ").append(type);
        sb.append(", ").append(href);
        sb.append(", ").append(createAt);
        sb.append(", ").append(updateAt);
        sb.append(", ").append(delFlag);
        sb.append(", ").append(version);

        sb.append(")");
        return sb.toString();
    }
}
