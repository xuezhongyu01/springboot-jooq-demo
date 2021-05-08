/*
 * This file is generated by jOOQ.
*/
package com.jooq.domain.tables;


import com.jooq.domain.Indexes;
import com.jooq.domain.Keys;
import com.jooq.domain.Xbkj;
import com.jooq.domain.tables.records.UcOrganQualityRecord;

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
 * 机构资质表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UcOrganQuality extends TableImpl<UcOrganQualityRecord> {

    private static final long serialVersionUID = 735618234;

    /**
     * The reference instance of <code>xbkj.uc_organ_quality</code>
     */
    public static final UcOrganQuality UC_ORGAN_QUALITY = new UcOrganQuality();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<UcOrganQualityRecord> getRecordType() {
        return UcOrganQualityRecord.class;
    }

    /**
     * The column <code>xbkj.uc_organ_quality.id</code>.
     */
    public final TableField<UcOrganQualityRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>xbkj.uc_organ_quality.organ_id</code>. 机构id
     */
    public final TableField<UcOrganQualityRecord, Long> ORGAN_ID = createField("organ_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "机构id");

    /**
     * The column <code>xbkj.uc_organ_quality.id_card_front</code>. 身份证正面
     */
    public final TableField<UcOrganQualityRecord, String> ID_CARD_FRONT = createField("id_card_front", org.jooq.impl.SQLDataType.VARCHAR(255), this, "身份证正面");

    /**
     * The column <code>xbkj.uc_organ_quality.id_card_back</code>. 身份证背面
     */
    public final TableField<UcOrganQualityRecord, String> ID_CARD_BACK = createField("id_card_back", org.jooq.impl.SQLDataType.VARCHAR(255), this, "身份证背面");

    /**
     * The column <code>xbkj.uc_organ_quality.bank_card_front</code>. 银行卡正面
     */
    public final TableField<UcOrganQualityRecord, String> BANK_CARD_FRONT = createField("bank_card_front", org.jooq.impl.SQLDataType.VARCHAR(255), this, "银行卡正面");

    /**
     * The column <code>xbkj.uc_organ_quality.bank_card_back</code>. 银行卡背面
     */
    public final TableField<UcOrganQualityRecord, String> BANK_CARD_BACK = createField("bank_card_back", org.jooq.impl.SQLDataType.VARCHAR(255), this, "银行卡背面");

    /**
     * The column <code>xbkj.uc_organ_quality.person_photo</code>. 手持身份证照片
     */
    public final TableField<UcOrganQualityRecord, String> PERSON_PHOTO = createField("person_photo", org.jooq.impl.SQLDataType.VARCHAR(255), this, "手持身份证照片");

    /**
     * The column <code>xbkj.uc_organ_quality.bussiness_license</code>. 营业执照
     */
    public final TableField<UcOrganQualityRecord, String> BUSSINESS_LICENSE = createField("bussiness_license", org.jooq.impl.SQLDataType.VARCHAR(255), this, "营业执照");

    /**
     * The column <code>xbkj.uc_organ_quality.bussiness_certificates</code>. 工商证
     */
    public final TableField<UcOrganQualityRecord, String> BUSSINESS_CERTIFICATES = createField("bussiness_certificates", org.jooq.impl.SQLDataType.VARCHAR(255), this, "工商证");

    /**
     * The column <code>xbkj.uc_organ_quality.organization_code</code>. 组织机构代码证
     */
    public final TableField<UcOrganQualityRecord, String> ORGANIZATION_CODE = createField("organization_code", org.jooq.impl.SQLDataType.VARCHAR(255), this, "组织机构代码证");

    /**
     * The column <code>xbkj.uc_organ_quality.tax_registration</code>. 税务登记证
     */
    public final TableField<UcOrganQualityRecord, String> TAX_REGISTRATION = createField("tax_registration", org.jooq.impl.SQLDataType.VARCHAR(255), this, "税务登记证");

    /**
     * The column <code>xbkj.uc_organ_quality.inside_img</code>. 店内环境
     */
    public final TableField<UcOrganQualityRecord, String> INSIDE_IMG = createField("inside_img", org.jooq.impl.SQLDataType.VARCHAR(255), this, "店内环境");

    /**
     * The column <code>xbkj.uc_organ_quality.front_img</code>. 门前环境
     */
    public final TableField<UcOrganQualityRecord, String> FRONT_IMG = createField("front_img", org.jooq.impl.SQLDataType.VARCHAR(255), this, "门前环境");

    /**
     * The column <code>xbkj.uc_organ_quality.bankaccount_licence</code>. 银行开户许可证
     */
    public final TableField<UcOrganQualityRecord, String> BANKACCOUNT_LICENCE = createField("bankaccount_licence", org.jooq.impl.SQLDataType.VARCHAR(255), this, "银行开户许可证");

    /**
     * The column <code>xbkj.uc_organ_quality.create_at</code>. 创建时间
     */
    public final TableField<UcOrganQualityRecord, Timestamp> CREATE_AT = createField("create_at", org.jooq.impl.SQLDataType.TIMESTAMP.defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "创建时间");

    /**
     * The column <code>xbkj.uc_organ_quality.update_at</code>. 更新时间
     */
    public final TableField<UcOrganQualityRecord, Timestamp> UPDATE_AT = createField("update_at", org.jooq.impl.SQLDataType.TIMESTAMP, this, "更新时间");

    /**
     * The column <code>xbkj.uc_organ_quality.del_flag</code>. 删除标志
     */
    public final TableField<UcOrganQualityRecord, Boolean> DEL_FLAG = createField("del_flag", org.jooq.impl.SQLDataType.BIT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("b'0'", org.jooq.impl.SQLDataType.BIT)), this, "删除标志");

    /**
     * The column <code>xbkj.uc_organ_quality.version</code>.
     */
    public final TableField<UcOrganQualityRecord, Long> VERSION = createField("version", org.jooq.impl.SQLDataType.BIGINT.defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * Create a <code>xbkj.uc_organ_quality</code> table reference
     */
    public UcOrganQuality() {
        this(DSL.name("uc_organ_quality"), null);
    }

    /**
     * Create an aliased <code>xbkj.uc_organ_quality</code> table reference
     */
    public UcOrganQuality(String alias) {
        this(DSL.name(alias), UC_ORGAN_QUALITY);
    }

    /**
     * Create an aliased <code>xbkj.uc_organ_quality</code> table reference
     */
    public UcOrganQuality(Name alias) {
        this(alias, UC_ORGAN_QUALITY);
    }

    private UcOrganQuality(Name alias, Table<UcOrganQualityRecord> aliased) {
        this(alias, aliased, null);
    }

    private UcOrganQuality(Name alias, Table<UcOrganQualityRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "机构资质表");
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
        return Arrays.<Index>asList(Indexes.UC_ORGAN_QUALITY_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<UcOrganQualityRecord, Long> getIdentity() {
        return Keys.IDENTITY_UC_ORGAN_QUALITY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<UcOrganQualityRecord> getPrimaryKey() {
        return Keys.KEY_UC_ORGAN_QUALITY_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<UcOrganQualityRecord>> getKeys() {
        return Arrays.<UniqueKey<UcOrganQualityRecord>>asList(Keys.KEY_UC_ORGAN_QUALITY_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UcOrganQuality as(String alias) {
        return new UcOrganQuality(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UcOrganQuality as(Name alias) {
        return new UcOrganQuality(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public UcOrganQuality rename(String name) {
        return new UcOrganQuality(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public UcOrganQuality rename(Name name) {
        return new UcOrganQuality(name, null);
    }
}
