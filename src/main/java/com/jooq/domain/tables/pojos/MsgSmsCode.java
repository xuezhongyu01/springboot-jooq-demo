/*
 * This file is generated by jOOQ.
*/
package com.jooq.domain.tables.pojos;


import com.jooq.domain.enums.MsgSmsCodeStatus;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.annotation.Generated;


/**
 * 短信记录表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class MsgSmsCode implements Serializable {

    private static final long serialVersionUID = -564576645;

    private Long             id;
    private Long             mobile;
    private Long             msgMessageTemplateId;
    private Timestamp        receiveTime;
    private String           content;
    private MsgSmsCodeStatus status;
    private String           channel;
    private Timestamp        createAt;
    private Timestamp        updateAt;
    private Boolean          delFlag;
    private Long             version;

    public MsgSmsCode() {}

    public MsgSmsCode(MsgSmsCode value) {
        this.id = value.id;
        this.mobile = value.mobile;
        this.msgMessageTemplateId = value.msgMessageTemplateId;
        this.receiveTime = value.receiveTime;
        this.content = value.content;
        this.status = value.status;
        this.channel = value.channel;
        this.createAt = value.createAt;
        this.updateAt = value.updateAt;
        this.delFlag = value.delFlag;
        this.version = value.version;
    }

    public MsgSmsCode(
        Long             id,
        Long             mobile,
        Long             msgMessageTemplateId,
        Timestamp        receiveTime,
        String           content,
        MsgSmsCodeStatus status,
        String           channel,
        Timestamp        createAt,
        Timestamp        updateAt,
        Boolean          delFlag,
        Long             version
    ) {
        this.id = id;
        this.mobile = mobile;
        this.msgMessageTemplateId = msgMessageTemplateId;
        this.receiveTime = receiveTime;
        this.content = content;
        this.status = status;
        this.channel = channel;
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

    public Long getMobile() {
        return this.mobile;
    }

    public void setMobile(Long mobile) {
        this.mobile = mobile;
    }

    public Long getMsgMessageTemplateId() {
        return this.msgMessageTemplateId;
    }

    public void setMsgMessageTemplateId(Long msgMessageTemplateId) {
        this.msgMessageTemplateId = msgMessageTemplateId;
    }

    public Timestamp getReceiveTime() {
        return this.receiveTime;
    }

    public void setReceiveTime(Timestamp receiveTime) {
        this.receiveTime = receiveTime;
    }

    public String getContent() {
        return this.content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public MsgSmsCodeStatus getStatus() {
        return this.status;
    }

    public void setStatus(MsgSmsCodeStatus status) {
        this.status = status;
    }

    public String getChannel() {
        return this.channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
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
        StringBuilder sb = new StringBuilder("MsgSmsCode (");

        sb.append(id);
        sb.append(", ").append(mobile);
        sb.append(", ").append(msgMessageTemplateId);
        sb.append(", ").append(receiveTime);
        sb.append(", ").append(content);
        sb.append(", ").append(status);
        sb.append(", ").append(channel);
        sb.append(", ").append(createAt);
        sb.append(", ").append(updateAt);
        sb.append(", ").append(delFlag);
        sb.append(", ").append(version);

        sb.append(")");
        return sb.toString();
    }
}