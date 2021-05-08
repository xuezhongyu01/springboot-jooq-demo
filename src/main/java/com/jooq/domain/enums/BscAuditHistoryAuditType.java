/*
 * This file is generated by jOOQ.
*/
package com.jooq.domain.enums;


import javax.annotation.Generated;

import org.jooq.Catalog;
import org.jooq.EnumType;
import org.jooq.Schema;


/**
 * 优惠券，消息模版，发送消息,机构,门店，会员，课程，教师,门店活动,礼品
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public enum BscAuditHistoryAuditType implements EnumType {

    coupons("coupons"),

    msgTempate("msgTempate"),

    sendMsg("sendMsg"),

    organ("organ"),

    shop("shop"),

    request_loan("request_loan"),

    course("course"),

    teacher("teacher"),

    activity("activity"),

    gift("gift");

    private final String literal;

    private BscAuditHistoryAuditType(String literal) {
        this.literal = literal;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Catalog getCatalog() {
        return null;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return null;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getName() {
        return "bsc_audit_history_audit_type";
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getLiteral() {
        return literal;
    }
}
