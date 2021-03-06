/*
 * This file is generated by jOOQ.
*/
package com.jooq.domain.tables.records;


import com.jooq.domain.enums.FdProviderInfoIsidentify;
import com.jooq.domain.tables.FdProviderInfo;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Record1;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * 运营商数据表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class FdProviderInfoRecord extends UpdatableRecordImpl<FdProviderInfoRecord> {

    private static final long serialVersionUID = -42132094;

    /**
     * Setter for <code>xbkj.fd_provider_info.id</code>. 主键
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>xbkj.fd_provider_info.id</code>. 主键
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>xbkj.fd_provider_info.member_id</code>. 用户id
     */
    public void setMemberId(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>xbkj.fd_provider_info.member_id</code>. 用户id
     */
    public Long getMemberId() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>xbkj.fd_provider_info.name</code>. 姓名
     */
    public void setName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>xbkj.fd_provider_info.name</code>. 姓名
     */
    public String getName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>xbkj.fd_provider_info.phone</code>. 手机号
     */
    public void setPhone(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>xbkj.fd_provider_info.phone</code>. 手机号
     */
    public String getPhone() {
        return (String) get(3);
    }

    /**
     * Setter for <code>xbkj.fd_provider_info.provider</code>. 运营商（指移动/联通/电信）
     */
    public void setProvider(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>xbkj.fd_provider_info.provider</code>. 运营商（指移动/联通/电信）
     */
    public String getProvider() {
        return (String) get(4);
    }

    /**
     * Setter for <code>xbkj.fd_provider_info.isidentify</code>. 是否实名认证(中文，枚举 是、否)
     */
    public void setIsidentify(FdProviderInfoIsidentify value) {
        set(5, value);
    }

    /**
     * Getter for <code>xbkj.fd_provider_info.isidentify</code>. 是否实名认证(中文，枚举 是、否)
     */
    public FdProviderInfoIsidentify getIsidentify() {
        return (FdProviderInfoIsidentify) get(5);
    }

    /**
     * Setter for <code>xbkj.fd_provider_info.register_date</code>. 入网时间("YYYY-MM-DD")
     */
    public void setRegisterDate(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>xbkj.fd_provider_info.register_date</code>. 入网时间("YYYY-MM-DD")
     */
    public String getRegisterDate() {
        return (String) get(6);
    }

    /**
     * Setter for <code>xbkj.fd_provider_info.net_age</code>. 网龄
     */
    public void setNetAge(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>xbkj.fd_provider_info.net_age</code>. 网龄
     */
    public String getNetAge() {
        return (String) get(7);
    }

    /**
     * Setter for <code>xbkj.fd_provider_info.idcard</code>. 证件号码
     */
    public void setIdcard(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>xbkj.fd_provider_info.idcard</code>. 证件号码
     */
    public String getIdcard() {
        return (String) get(8);
    }

    /**
     * Setter for <code>xbkj.fd_provider_info.idcard_type</code>. 证件类型
     */
    public void setIdcardType(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>xbkj.fd_provider_info.idcard_type</code>. 证件类型
     */
    public String getIdcardType() {
        return (String) get(9);
    }

    /**
     * Setter for <code>xbkj.fd_provider_info.status</code>. 账户状态(中文，例如：“正常”/“停机”)
     */
    public void setStatus(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>xbkj.fd_provider_info.status</code>. 账户状态(中文，例如：“正常”/“停机”)
     */
    public String getStatus() {
        return (String) get(10);
    }

    /**
     * Setter for <code>xbkj.fd_provider_info.balance</code>. 当前余额(单位：分)
     */
    public void setBalance(String value) {
        set(11, value);
    }

    /**
     * Getter for <code>xbkj.fd_provider_info.balance</code>. 当前余额(单位：分)
     */
    public String getBalance() {
        return (String) get(11);
    }

    /**
     * Setter for <code>xbkj.fd_provider_info.monetary</code>. 当前消费金额(单位：分)
     */
    public void setMonetary(String value) {
        set(12, value);
    }

    /**
     * Getter for <code>xbkj.fd_provider_info.monetary</code>. 当前消费金额(单位：分)
     */
    public String getMonetary() {
        return (String) get(12);
    }

    /**
     * Setter for <code>xbkj.fd_provider_info.province</code>. 所在省份
     */
    public void setProvince(String value) {
        set(13, value);
    }

    /**
     * Getter for <code>xbkj.fd_provider_info.province</code>. 所在省份
     */
    public String getProvince() {
        return (String) get(13);
    }

    /**
     * Setter for <code>xbkj.fd_provider_info.city</code>. 所在城市
     */
    public void setCity(String value) {
        set(14, value);
    }

    /**
     * Getter for <code>xbkj.fd_provider_info.city</code>. 所在城市
     */
    public String getCity() {
        return (String) get(14);
    }

    /**
     * Setter for <code>xbkj.fd_provider_info.address</code>. 账单地址
     */
    public void setAddress(String value) {
        set(15, value);
    }

    /**
     * Getter for <code>xbkj.fd_provider_info.address</code>. 账单地址
     */
    public String getAddress() {
        return (String) get(15);
    }

    /**
     * Setter for <code>xbkj.fd_provider_info.location</code>. 归属地
     */
    public void setLocation(String value) {
        set(16, value);
    }

    /**
     * Getter for <code>xbkj.fd_provider_info.location</code>. 归属地
     */
    public String getLocation() {
        return (String) get(16);
    }

    /**
     * Setter for <code>xbkj.fd_provider_info.user_name</code>. 用户填写姓名
     */
    public void setUserName(String value) {
        set(17, value);
    }

    /**
     * Getter for <code>xbkj.fd_provider_info.user_name</code>. 用户填写姓名
     */
    public String getUserName() {
        return (String) get(17);
    }

    /**
     * Setter for <code>xbkj.fd_provider_info.user_idcard</code>. 用户填写身份证
     */
    public void setUserIdcard(String value) {
        set(18, value);
    }

    /**
     * Getter for <code>xbkj.fd_provider_info.user_idcard</code>. 用户填写身份证
     */
    public String getUserIdcard() {
        return (String) get(18);
    }

    /**
     * Setter for <code>xbkj.fd_provider_info.user_phone</code>. 用户填写手机号
     */
    public void setUserPhone(String value) {
        set(19, value);
    }

    /**
     * Getter for <code>xbkj.fd_provider_info.user_phone</code>. 用户填写手机号
     */
    public String getUserPhone() {
        return (String) get(19);
    }

    /**
     * Setter for <code>xbkj.fd_provider_info.location_match_idcardaddress</code>. 手机归属地是否与身份证户籍地址相同（比对省市；户籍地址:身份证前4位）
     */
    public void setLocationMatchIdcardaddress(String value) {
        set(20, value);
    }

    /**
     * Getter for <code>xbkj.fd_provider_info.location_match_idcardaddress</code>. 手机归属地是否与身份证户籍地址相同（比对省市；户籍地址:身份证前4位）
     */
    public String getLocationMatchIdcardaddress() {
        return (String) get(20);
    }

    /**
     * Setter for <code>xbkj.fd_provider_info.location_match_billaddress</code>. 手机归属地是否与账单地址相同（比对省市）
     */
    public void setLocationMatchBilladdress(String value) {
        set(21, value);
    }

    /**
     * Getter for <code>xbkj.fd_provider_info.location_match_billaddress</code>. 手机归属地是否与账单地址相同（比对省市）
     */
    public String getLocationMatchBilladdress() {
        return (String) get(21);
    }

    /**
     * Setter for <code>xbkj.fd_provider_info.idcardaddress_match_billaddress</code>. 身份证户籍地址是否与账单地址相同（比对省市；户籍地址:身份证前4位）
     */
    public void setIdcardaddressMatchBilladdress(String value) {
        set(22, value);
    }

    /**
     * Getter for <code>xbkj.fd_provider_info.idcardaddress_match_billaddress</code>. 身份证户籍地址是否与账单地址相同（比对省市；户籍地址:身份证前4位）
     */
    public String getIdcardaddressMatchBilladdress() {
        return (String) get(22);
    }

    /**
     * Setter for <code>xbkj.fd_provider_info.common_city</code>. 最近一个月的天数最大的常用通话地
     */
    public void setCommonCity(String value) {
        set(23, value);
    }

    /**
     * Getter for <code>xbkj.fd_provider_info.common_city</code>. 最近一个月的天数最大的常用通话地
     */
    public String getCommonCity() {
        return (String) get(23);
    }

    /**
     * Setter for <code>xbkj.fd_provider_info.average_consume_amount_permonth</code>. 近半年月均消费金额(分)
     */
    public void setAverageConsumeAmountPermonth(String value) {
        set(24, value);
    }

    /**
     * Getter for <code>xbkj.fd_provider_info.average_consume_amount_permonth</code>. 近半年月均消费金额(分)
     */
    public String getAverageConsumeAmountPermonth() {
        return (String) get(24);
    }

    /**
     * Setter for <code>xbkj.fd_provider_info.exceed_plan_count</code>. 近半年超出套餐次数
     */
    public void setExceedPlanCount(String value) {
        set(25, value);
    }

    /**
     * Getter for <code>xbkj.fd_provider_info.exceed_plan_count</code>. 近半年超出套餐次数
     */
    public String getExceedPlanCount() {
        return (String) get(25);
    }

    /**
     * Setter for <code>xbkj.fd_provider_info.exceed_plan_rate</code>. 近半年超出套餐金额占比
     */
    public void setExceedPlanRate(String value) {
        set(26, value);
    }

    /**
     * Getter for <code>xbkj.fd_provider_info.exceed_plan_rate</code>. 近半年超出套餐金额占比
     */
    public String getExceedPlanRate() {
        return (String) get(26);
    }

    /**
     * Setter for <code>xbkj.fd_provider_info.remission_count</code>. 近半年费用减免次数
     */
    public void setRemissionCount(String value) {
        set(27, value);
    }

    /**
     * Getter for <code>xbkj.fd_provider_info.remission_count</code>. 近半年费用减免次数
     */
    public String getRemissionCount() {
        return (String) get(27);
    }

    /**
     * Setter for <code>xbkj.fd_provider_info.remission_rate</code>. 近半年费用减免金额占比
     */
    public void setRemissionRate(String value) {
        set(28, value);
    }

    /**
     * Getter for <code>xbkj.fd_provider_info.remission_rate</code>. 近半年费用减免金额占比
     */
    public String getRemissionRate() {
        return (String) get(28);
    }

    /**
     * Setter for <code>xbkj.fd_provider_info.average_call_seconds_permonth</code>. 月均主叫时长
     */
    public void setAverageCallSecondsPermonth(String value) {
        set(29, value);
    }

    /**
     * Getter for <code>xbkj.fd_provider_info.average_call_seconds_permonth</code>. 月均主叫时长
     */
    public String getAverageCallSecondsPermonth() {
        return (String) get(29);
    }

    /**
     * Setter for <code>xbkj.fd_provider_info.average_called_seconds_permonth</code>. 月均被叫时长
     */
    public void setAverageCalledSecondsPermonth(String value) {
        set(30, value);
    }

    /**
     * Getter for <code>xbkj.fd_provider_info.average_called_seconds_permonth</code>. 月均被叫时长
     */
    public String getAverageCalledSecondsPermonth() {
        return (String) get(30);
    }

    /**
     * Setter for <code>xbkj.fd_provider_info.special_number_dial_count</code>. 近半年特殊号码联系次数(110/119/120)
     */
    public void setSpecialNumberDialCount(String value) {
        set(31, value);
    }

    /**
     * Getter for <code>xbkj.fd_provider_info.special_number_dial_count</code>. 近半年特殊号码联系次数(110/119/120)
     */
    public String getSpecialNumberDialCount() {
        return (String) get(31);
    }

    /**
     * Setter for <code>xbkj.fd_provider_info.score</code>. 信用评分
     */
    public void setScore(String value) {
        set(32, value);
    }

    /**
     * Getter for <code>xbkj.fd_provider_info.score</code>. 信用评分
     */
    public String getScore() {
        return (String) get(32);
    }

    /**
     * Setter for <code>xbkj.fd_provider_info.average_call_number</code>. 月均对方号码数
     */
    public void setAverageCallNumber(String value) {
        set(33, value);
    }

    /**
     * Getter for <code>xbkj.fd_provider_info.average_call_number</code>. 月均对方号码数
     */
    public String getAverageCallNumber() {
        return (String) get(33);
    }

    /**
     * Setter for <code>xbkj.fd_provider_info.average_interphone_count</code>. 月均互通电话号码数
     */
    public void setAverageInterphoneCount(String value) {
        set(34, value);
    }

    /**
     * Getter for <code>xbkj.fd_provider_info.average_interphone_count</code>. 月均互通电话号码数
     */
    public String getAverageInterphoneCount() {
        return (String) get(34);
    }

    /**
     * Setter for <code>xbkj.fd_provider_info.average_interphone_rate</code>. 月均互通电话号码占比
     */
    public void setAverageInterphoneRate(String value) {
        set(35, value);
    }

    /**
     * Getter for <code>xbkj.fd_provider_info.average_interphone_rate</code>. 月均互通电话号码占比
     */
    public String getAverageInterphoneRate() {
        return (String) get(35);
    }

    /**
     * Setter for <code>xbkj.fd_provider_info.average_calling_count</code>. 月均主叫对方号码数
     */
    public void setAverageCallingCount(String value) {
        set(36, value);
    }

    /**
     * Getter for <code>xbkj.fd_provider_info.average_calling_count</code>. 月均主叫对方号码数
     */
    public String getAverageCallingCount() {
        return (String) get(36);
    }

    /**
     * Setter for <code>xbkj.fd_provider_info.average_calling_rate</code>. 月均主叫对方号码占比
     */
    public void setAverageCallingRate(String value) {
        set(37, value);
    }

    /**
     * Getter for <code>xbkj.fd_provider_info.average_calling_rate</code>. 月均主叫对方号码占比
     */
    public String getAverageCallingRate() {
        return (String) get(37);
    }

    /**
     * Setter for <code>xbkj.fd_provider_info.average_called_count</code>. 月均被叫对方号码数
     */
    public void setAverageCalledCount(String value) {
        set(38, value);
    }

    /**
     * Getter for <code>xbkj.fd_provider_info.average_called_count</code>. 月均被叫对方号码数
     */
    public String getAverageCalledCount() {
        return (String) get(38);
    }

    /**
     * Setter for <code>xbkj.fd_provider_info.average_called_rate</code>. 月均被叫对方号码占比
     */
    public void setAverageCalledRate(String value) {
        set(39, value);
    }

    /**
     * Getter for <code>xbkj.fd_provider_info.average_called_rate</code>. 月均被叫对方号码占比
     */
    public String getAverageCalledRate() {
        return (String) get(39);
    }

    /**
     * Setter for <code>xbkj.fd_provider_info.average_count</code>. 月均通话次数
     */
    public void setAverageCount(String value) {
        set(40, value);
    }

    /**
     * Getter for <code>xbkj.fd_provider_info.average_count</code>. 月均通话次数
     */
    public String getAverageCount() {
        return (String) get(40);
    }

    /**
     * Setter for <code>xbkj.fd_provider_info.average_morning_count</code>. 月均凌晨通话次数(00-06)
     */
    public void setAverageMorningCount(String value) {
        set(41, value);
    }

    /**
     * Getter for <code>xbkj.fd_provider_info.average_morning_count</code>. 月均凌晨通话次数(00-06)
     */
    public String getAverageMorningCount() {
        return (String) get(41);
    }

    /**
     * Setter for <code>xbkj.fd_provider_info.average_morning_call_rate</code>. 月均凌晨通话次数占比
     */
    public void setAverageMorningCallRate(String value) {
        set(42, value);
    }

    /**
     * Getter for <code>xbkj.fd_provider_info.average_morning_call_rate</code>. 月均凌晨通话次数占比
     */
    public String getAverageMorningCallRate() {
        return (String) get(42);
    }

    /**
     * Setter for <code>xbkj.fd_provider_info.idno_hit_court_black</code>. 身份证是否法院失信名单
     */
    public void setIdnoHitCourtBlack(String value) {
        set(43, value);
    }

    /**
     * Getter for <code>xbkj.fd_provider_info.idno_hit_court_black</code>. 身份证是否法院失信名单
     */
    public String getIdnoHitCourtBlack() {
        return (String) get(43);
    }

    /**
     * Setter for <code>xbkj.fd_provider_info.idno_hit_finance_black</code>. 身份证是否金融机构黑名单
     */
    public void setIdnoHitFinanceBlack(String value) {
        set(44, value);
    }

    /**
     * Getter for <code>xbkj.fd_provider_info.idno_hit_finance_black</code>. 身份证是否金融机构黑名单
     */
    public String getIdnoHitFinanceBlack() {
        return (String) get(44);
    }

    /**
     * Setter for <code>xbkj.fd_provider_info.phone_hit_finance_black</code>. 手机号是否金融机构黑名单
     */
    public void setPhoneHitFinanceBlack(String value) {
        set(45, value);
    }

    /**
     * Getter for <code>xbkj.fd_provider_info.phone_hit_finance_black</code>. 手机号是否金融机构黑名单
     */
    public String getPhoneHitFinanceBlack() {
        return (String) get(45);
    }

    /**
     * Setter for <code>xbkj.fd_provider_info.create_at</code>. 创建时间
     */
    public void setCreateAt(Timestamp value) {
        set(46, value);
    }

    /**
     * Getter for <code>xbkj.fd_provider_info.create_at</code>. 创建时间
     */
    public Timestamp getCreateAt() {
        return (Timestamp) get(46);
    }

    /**
     * Setter for <code>xbkj.fd_provider_info.update_at</code>. 更新时间
     */
    public void setUpdateAt(Timestamp value) {
        set(47, value);
    }

    /**
     * Getter for <code>xbkj.fd_provider_info.update_at</code>. 更新时间
     */
    public Timestamp getUpdateAt() {
        return (Timestamp) get(47);
    }

    /**
     * Setter for <code>xbkj.fd_provider_info.del_flag</code>. 删除标志
     */
    public void setDelFlag(Boolean value) {
        set(48, value);
    }

    /**
     * Getter for <code>xbkj.fd_provider_info.del_flag</code>. 删除标志
     */
    public Boolean getDelFlag() {
        return (Boolean) get(48);
    }

    /**
     * Setter for <code>xbkj.fd_provider_info.version</code>.
     */
    public void setVersion(Long value) {
        set(49, value);
    }

    /**
     * Getter for <code>xbkj.fd_provider_info.version</code>.
     */
    public Long getVersion() {
        return (Long) get(49);
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
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached FdProviderInfoRecord
     */
    public FdProviderInfoRecord() {
        super(FdProviderInfo.FD_PROVIDER_INFO);
    }

    /**
     * Create a detached, initialised FdProviderInfoRecord
     */
    public FdProviderInfoRecord(Long id, Long memberId, String name, String phone, String provider, FdProviderInfoIsidentify isidentify, String registerDate, String netAge, String idcard, String idcardType, String status, String balance, String monetary, String province, String city, String address, String location, String userName, String userIdcard, String userPhone, String locationMatchIdcardaddress, String locationMatchBilladdress, String idcardaddressMatchBilladdress, String commonCity, String averageConsumeAmountPermonth, String exceedPlanCount, String exceedPlanRate, String remissionCount, String remissionRate, String averageCallSecondsPermonth, String averageCalledSecondsPermonth, String specialNumberDialCount, String score, String averageCallNumber, String averageInterphoneCount, String averageInterphoneRate, String averageCallingCount, String averageCallingRate, String averageCalledCount, String averageCalledRate, String averageCount, String averageMorningCount, String averageMorningCallRate, String idnoHitCourtBlack, String idnoHitFinanceBlack, String phoneHitFinanceBlack, Timestamp createAt, Timestamp updateAt, Boolean delFlag, Long version) {
        super(FdProviderInfo.FD_PROVIDER_INFO);

        set(0, id);
        set(1, memberId);
        set(2, name);
        set(3, phone);
        set(4, provider);
        set(5, isidentify);
        set(6, registerDate);
        set(7, netAge);
        set(8, idcard);
        set(9, idcardType);
        set(10, status);
        set(11, balance);
        set(12, monetary);
        set(13, province);
        set(14, city);
        set(15, address);
        set(16, location);
        set(17, userName);
        set(18, userIdcard);
        set(19, userPhone);
        set(20, locationMatchIdcardaddress);
        set(21, locationMatchBilladdress);
        set(22, idcardaddressMatchBilladdress);
        set(23, commonCity);
        set(24, averageConsumeAmountPermonth);
        set(25, exceedPlanCount);
        set(26, exceedPlanRate);
        set(27, remissionCount);
        set(28, remissionRate);
        set(29, averageCallSecondsPermonth);
        set(30, averageCalledSecondsPermonth);
        set(31, specialNumberDialCount);
        set(32, score);
        set(33, averageCallNumber);
        set(34, averageInterphoneCount);
        set(35, averageInterphoneRate);
        set(36, averageCallingCount);
        set(37, averageCallingRate);
        set(38, averageCalledCount);
        set(39, averageCalledRate);
        set(40, averageCount);
        set(41, averageMorningCount);
        set(42, averageMorningCallRate);
        set(43, idnoHitCourtBlack);
        set(44, idnoHitFinanceBlack);
        set(45, phoneHitFinanceBlack);
        set(46, createAt);
        set(47, updateAt);
        set(48, delFlag);
        set(49, version);
    }
}
