/*
 * This file is generated by jOOQ.
*/
package com.jooq.domain.enums;


import javax.annotation.Generated;

import org.jooq.Catalog;
import org.jooq.EnumType;
import org.jooq.Schema;


/**
 * 领取条件:消费满多少，累计消费满多少,登录领取,用户手动领取,试听课报名,分期消费满多少
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public enum McCouponTemplateDrawCondition implements EnumType {

    spend_up("spend_up"),

    sum_spend_up("sum_spend_up"),

    register("register"),

    pick_up("pick_up"),

    sign_up("sign_up"),

    xbcredit_spend_up("xbcredit_spend_up");

    private final String literal;

    private McCouponTemplateDrawCondition(String literal) {
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
        return "mc_coupon_template_draw_condition";
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getLiteral() {
        return literal;
    }
}
