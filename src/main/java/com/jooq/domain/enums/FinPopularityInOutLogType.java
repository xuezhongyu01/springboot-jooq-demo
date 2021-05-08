/*
 * This file is generated by jOOQ.
*/
package com.jooq.domain.enums;


import javax.annotation.Generated;

import org.jooq.Catalog;
import org.jooq.EnumType;
import org.jooq.Schema;


/**
 * 推荐好友；平台活动；平台派送；兑换现金券；补发积分；提现手续费；兑换收益券；兑吧；
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public enum FinPopularityInOutLogType implements EnumType {

    recommend("recommend"),

    platform_activity("platform_activity"),

    platform_give("platform_give"),

    exchange_coupon("exchange_coupon"),

    popularity_compensation("popularity_compensation"),

    withdraw_fee("withdraw_fee"),

    exchange_profit_coupon("exchange_profit_coupon"),

    duiba("duiba");

    private final String literal;

    private FinPopularityInOutLogType(String literal) {
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
        return "fin_popularity_in_out_log_type";
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getLiteral() {
        return literal;
    }
}
