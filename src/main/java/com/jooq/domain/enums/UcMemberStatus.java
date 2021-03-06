/*
 * This file is generated by jOOQ.
*/
package com.jooq.domain.enums;


import javax.annotation.Generated;

import org.jooq.Catalog;
import org.jooq.EnumType;
import org.jooq.Schema;


/**
 * 未申请，申请中，待激活，激活中，已激活，提额激活中，已提额,注销,禁用
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public enum UcMemberStatus implements EnumType {

    un_apply("un_apply"),

    applying("applying"),

    un_activate("un_activate"),

    activating("activating"),

    activated("activated"),

    limiting("limiting"),

    limited("limited"),

    cancelled("cancelled"),

    disable("disable");

    private final String literal;

    private UcMemberStatus(String literal) {
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
        return "uc_member_status";
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getLiteral() {
        return literal;
    }
}
