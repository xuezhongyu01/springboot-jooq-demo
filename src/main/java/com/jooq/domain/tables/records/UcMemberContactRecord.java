/*
 * This file is generated by jOOQ.
*/
package com.jooq.domain.tables.records;


import com.jooq.domain.tables.UcMemberContact;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Record1;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * 会员通讯录表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UcMemberContactRecord extends UpdatableRecordImpl<UcMemberContactRecord> {

    private static final long serialVersionUID = 1693404240;

    /**
     * Setter for <code>xbkj.uc_member_contact.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>xbkj.uc_member_contact.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>xbkj.uc_member_contact.member_id</code>. 用户id
     */
    public void setMemberId(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>xbkj.uc_member_contact.member_id</code>. 用户id
     */
    public Long getMemberId() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>xbkj.uc_member_contact.prefix</code>. 人名前的称谓
     */
    public void setPrefix(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>xbkj.uc_member_contact.prefix</code>. 人名前的称谓
     */
    public String getPrefix() {
        return (String) get(2);
    }

    /**
     * Setter for <code>xbkj.uc_member_contact.firstName</code>. 姓
     */
    public void setFirstname(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>xbkj.uc_member_contact.firstName</code>. 姓
     */
    public String getFirstname() {
        return (String) get(3);
    }

    /**
     * Setter for <code>xbkj.uc_member_contact.middleName</code>. 中间名
     */
    public void setMiddlename(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>xbkj.uc_member_contact.middleName</code>. 中间名
     */
    public String getMiddlename() {
        return (String) get(4);
    }

    /**
     * Setter for <code>xbkj.uc_member_contact.lastname</code>. 名
     */
    public void setLastname(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>xbkj.uc_member_contact.lastname</code>. 名
     */
    public String getLastname() {
        return (String) get(5);
    }

    /**
     * Setter for <code>xbkj.uc_member_contact.suffix</code>. 名后缀
     */
    public void setSuffix(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>xbkj.uc_member_contact.suffix</code>. 名后缀
     */
    public String getSuffix() {
        return (String) get(6);
    }

    /**
     * Setter for <code>xbkj.uc_member_contact.phoneticFirstName</code>. 手机姓
     */
    public void setPhoneticfirstname(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>xbkj.uc_member_contact.phoneticFirstName</code>. 手机姓
     */
    public String getPhoneticfirstname() {
        return (String) get(7);
    }

    /**
     * Setter for <code>xbkj.uc_member_contact.phoneticMiddleName</code>. 手机中间名
     */
    public void setPhoneticmiddlename(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>xbkj.uc_member_contact.phoneticMiddleName</code>. 手机中间名
     */
    public String getPhoneticmiddlename() {
        return (String) get(8);
    }

    /**
     * Setter for <code>xbkj.uc_member_contact.phoneticLastName</code>. 手机名
     */
    public void setPhoneticlastname(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>xbkj.uc_member_contact.phoneticLastName</code>. 手机名
     */
    public String getPhoneticlastname() {
        return (String) get(9);
    }

    /**
     * Setter for <code>xbkj.uc_member_contact.mobile</code>. 手机
     */
    public void setMobile(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>xbkj.uc_member_contact.mobile</code>. 手机
     */
    public String getMobile() {
        return (String) get(10);
    }

    /**
     * Setter for <code>xbkj.uc_member_contact.homeNum</code>. 住宅电话
     */
    public void setHomenum(String value) {
        set(11, value);
    }

    /**
     * Getter for <code>xbkj.uc_member_contact.homeNum</code>. 住宅电话
     */
    public String getHomenum() {
        return (String) get(11);
    }

    /**
     * Setter for <code>xbkj.uc_member_contact.jobNum</code>. 单位电话
     */
    public void setJobnum(String value) {
        set(12, value);
    }

    /**
     * Getter for <code>xbkj.uc_member_contact.jobNum</code>. 单位电话
     */
    public String getJobnum() {
        return (String) get(12);
    }

    /**
     * Setter for <code>xbkj.uc_member_contact.workFax</code>. 单位传真
     */
    public void setWorkfax(String value) {
        set(13, value);
    }

    /**
     * Getter for <code>xbkj.uc_member_contact.workFax</code>. 单位传真
     */
    public String getWorkfax() {
        return (String) get(13);
    }

    /**
     * Setter for <code>xbkj.uc_member_contact.homeFax</code>. 住宅传真
     */
    public void setHomefax(String value) {
        set(14, value);
    }

    /**
     * Getter for <code>xbkj.uc_member_contact.homeFax</code>. 住宅传真
     */
    public String getHomefax() {
        return (String) get(14);
    }

    /**
     * Setter for <code>xbkj.uc_member_contact.pager</code>. 寻呼机
     */
    public void setPager(String value) {
        set(15, value);
    }

    /**
     * Getter for <code>xbkj.uc_member_contact.pager</code>. 寻呼机
     */
    public String getPager() {
        return (String) get(15);
    }

    /**
     * Setter for <code>xbkj.uc_member_contact.quickNum</code>. 回拨号码
     */
    public void setQuicknum(String value) {
        set(16, value);
    }

    /**
     * Getter for <code>xbkj.uc_member_contact.quickNum</code>. 回拨号码
     */
    public String getQuicknum() {
        return (String) get(16);
    }

    /**
     * Setter for <code>xbkj.uc_member_contact.carNum</code>. 车载电话
     */
    public void setCarnum(String value) {
        set(17, value);
    }

    /**
     * Getter for <code>xbkj.uc_member_contact.carNum</code>. 车载电话
     */
    public String getCarnum() {
        return (String) get(17);
    }

    /**
     * Setter for <code>xbkj.uc_member_contact.jobTel</code>. 公司总机
     */
    public void setJobtel(String value) {
        set(18, value);
    }

    /**
     * Getter for <code>xbkj.uc_member_contact.jobTel</code>. 公司总机
     */
    public String getJobtel() {
        return (String) get(18);
    }

    /**
     * Setter for <code>xbkj.uc_member_contact.isdn</code>. ISDN
     */
    public void setIsdn(String value) {
        set(19, value);
    }

    /**
     * Getter for <code>xbkj.uc_member_contact.isdn</code>. ISDN
     */
    public String getIsdn() {
        return (String) get(19);
    }

    /**
     * Setter for <code>xbkj.uc_member_contact.tel</code>. 总机
     */
    public void setTel(String value) {
        set(20, value);
    }

    /**
     * Getter for <code>xbkj.uc_member_contact.tel</code>. 总机
     */
    public String getTel() {
        return (String) get(20);
    }

    /**
     * Setter for <code>xbkj.uc_member_contact.wirelessDev</code>. 无线装置
     */
    public void setWirelessdev(String value) {
        set(21, value);
    }

    /**
     * Getter for <code>xbkj.uc_member_contact.wirelessDev</code>. 无线装置
     */
    public String getWirelessdev() {
        return (String) get(21);
    }

    /**
     * Setter for <code>xbkj.uc_member_contact.telegram</code>. 电报
     */
    public void setTelegram(String value) {
        set(22, value);
    }

    /**
     * Getter for <code>xbkj.uc_member_contact.telegram</code>. 电报
     */
    public String getTelegram() {
        return (String) get(22);
    }

    /**
     * Setter for <code>xbkj.uc_member_contact.tty_tdd</code>. tty_tdd
     */
    public void setTtyTdd(String value) {
        set(23, value);
    }

    /**
     * Getter for <code>xbkj.uc_member_contact.tty_tdd</code>. tty_tdd
     */
    public String getTtyTdd() {
        return (String) get(23);
    }

    /**
     * Setter for <code>xbkj.uc_member_contact.jobMobile</code>. 单位手机
     */
    public void setJobmobile(String value) {
        set(24, value);
    }

    /**
     * Getter for <code>xbkj.uc_member_contact.jobMobile</code>. 单位手机
     */
    public String getJobmobile() {
        return (String) get(24);
    }

    /**
     * Setter for <code>xbkj.uc_member_contact.jobPager</code>. 单位寻呼机
     */
    public void setJobpager(String value) {
        set(25, value);
    }

    /**
     * Getter for <code>xbkj.uc_member_contact.jobPager</code>. 单位寻呼机
     */
    public String getJobpager() {
        return (String) get(25);
    }

    /**
     * Setter for <code>xbkj.uc_member_contact.assistantNum</code>. 助理
     */
    public void setAssistantnum(String value) {
        set(26, value);
    }

    /**
     * Getter for <code>xbkj.uc_member_contact.assistantNum</code>. 助理
     */
    public String getAssistantnum() {
        return (String) get(26);
    }

    /**
     * Setter for <code>xbkj.uc_member_contact.mms</code>. 彩信
     */
    public void setMms(String value) {
        set(27, value);
    }

    /**
     * Getter for <code>xbkj.uc_member_contact.mms</code>. 彩信
     */
    public String getMms() {
        return (String) get(27);
    }

    /**
     * Setter for <code>xbkj.uc_member_contact.homeEmail</code>. 住宅邮件地址
     */
    public void setHomeemail(String value) {
        set(28, value);
    }

    /**
     * Getter for <code>xbkj.uc_member_contact.homeEmail</code>. 住宅邮件地址
     */
    public String getHomeemail() {
        return (String) get(28);
    }

    /**
     * Setter for <code>xbkj.uc_member_contact.jobEmail</code>. 单位邮件地址
     */
    public void setJobemail(String value) {
        set(29, value);
    }

    /**
     * Getter for <code>xbkj.uc_member_contact.jobEmail</code>. 单位邮件地址
     */
    public String getJobemail() {
        return (String) get(29);
    }

    /**
     * Setter for <code>xbkj.uc_member_contact.mobileEmail</code>. 手机邮件地址
     */
    public void setMobileemail(String value) {
        set(30, value);
    }

    /**
     * Getter for <code>xbkj.uc_member_contact.mobileEmail</code>. 手机邮件地址
     */
    public String getMobileemail() {
        return (String) get(30);
    }

    /**
     * Setter for <code>xbkj.uc_member_contact.birthday</code>. 生日
     */
    public void setBirthday(String value) {
        set(31, value);
    }

    /**
     * Getter for <code>xbkj.uc_member_contact.birthday</code>. 生日
     */
    public String getBirthday() {
        return (String) get(31);
    }

    /**
     * Setter for <code>xbkj.uc_member_contact.anniversary</code>. 周年纪念日
     */
    public void setAnniversary(String value) {
        set(32, value);
    }

    /**
     * Getter for <code>xbkj.uc_member_contact.anniversary</code>. 周年纪念日
     */
    public String getAnniversary() {
        return (String) get(32);
    }

    /**
     * Setter for <code>xbkj.uc_member_contact.workMsg</code>. 即时消息类型
     */
    public void setWorkmsg(String value) {
        set(33, value);
    }

    /**
     * Getter for <code>xbkj.uc_member_contact.workMsg</code>. 即时消息类型
     */
    public String getWorkmsg() {
        return (String) get(33);
    }

    /**
     * Setter for <code>xbkj.uc_member_contact.remark</code>. 备注
     */
    public void setRemark(String value) {
        set(34, value);
    }

    /**
     * Getter for <code>xbkj.uc_member_contact.remark</code>. 备注
     */
    public String getRemark() {
        return (String) get(34);
    }

    /**
     * Setter for <code>xbkj.uc_member_contact.nickName</code>. 昵称
     */
    public void setNickname(String value) {
        set(35, value);
    }

    /**
     * Getter for <code>xbkj.uc_member_contact.nickName</code>. 昵称
     */
    public String getNickname() {
        return (String) get(35);
    }

    /**
     * Setter for <code>xbkj.uc_member_contact.street</code>. 街道
     */
    public void setStreet(String value) {
        set(36, value);
    }

    /**
     * Getter for <code>xbkj.uc_member_contact.street</code>. 街道
     */
    public String getStreet() {
        return (String) get(36);
    }

    /**
     * Setter for <code>xbkj.uc_member_contact.jobTitle</code>. jobTitle
     */
    public void setJobtitle(String value) {
        set(37, value);
    }

    /**
     * Getter for <code>xbkj.uc_member_contact.jobTitle</code>. jobTitle
     */
    public String getJobtitle() {
        return (String) get(37);
    }

    /**
     * Setter for <code>xbkj.uc_member_contact.company</code>. 公司
     */
    public void setCompany(String value) {
        set(38, value);
    }

    /**
     * Getter for <code>xbkj.uc_member_contact.company</code>. 公司
     */
    public String getCompany() {
        return (String) get(38);
    }

    /**
     * Setter for <code>xbkj.uc_member_contact.department</code>. 部门
     */
    public void setDepartment(String value) {
        set(39, value);
    }

    /**
     * Getter for <code>xbkj.uc_member_contact.department</code>. 部门
     */
    public String getDepartment() {
        return (String) get(39);
    }

    /**
     * Setter for <code>xbkj.uc_member_contact.homepage</code>. 主页
     */
    public void setHomepage(String value) {
        set(40, value);
    }

    /**
     * Getter for <code>xbkj.uc_member_contact.homepage</code>. 主页
     */
    public String getHomepage() {
        return (String) get(40);
    }

    /**
     * Setter for <code>xbkj.uc_member_contact.city</code>. 单位城市
     */
    public void setCity(String value) {
        set(41, value);
    }

    /**
     * Getter for <code>xbkj.uc_member_contact.city</code>. 单位城市
     */
    public String getCity() {
        return (String) get(41);
    }

    /**
     * Setter for <code>xbkj.uc_member_contact.box</code>. box
     */
    public void setBox(String value) {
        set(42, value);
    }

    /**
     * Getter for <code>xbkj.uc_member_contact.box</code>. box
     */
    public String getBox() {
        return (String) get(42);
    }

    /**
     * Setter for <code>xbkj.uc_member_contact.area</code>. 区域
     */
    public void setArea(String value) {
        set(43, value);
    }

    /**
     * Getter for <code>xbkj.uc_member_contact.area</code>. 区域
     */
    public String getArea() {
        return (String) get(43);
    }

    /**
     * Setter for <code>xbkj.uc_member_contact.state</code>. 洲
     */
    public void setState(String value) {
        set(44, value);
    }

    /**
     * Getter for <code>xbkj.uc_member_contact.state</code>. 洲
     */
    public String getState() {
        return (String) get(44);
    }

    /**
     * Setter for <code>xbkj.uc_member_contact.zip</code>. 邮编
     */
    public void setZip(String value) {
        set(45, value);
    }

    /**
     * Getter for <code>xbkj.uc_member_contact.zip</code>. 邮编
     */
    public String getZip() {
        return (String) get(45);
    }

    /**
     * Setter for <code>xbkj.uc_member_contact.country</code>. 国家
     */
    public void setCountry(String value) {
        set(46, value);
    }

    /**
     * Getter for <code>xbkj.uc_member_contact.country</code>. 国家
     */
    public String getCountry() {
        return (String) get(46);
    }

    /**
     * Setter for <code>xbkj.uc_member_contact.homeStreet</code>. 家庭地址
     */
    public void setHomestreet(String value) {
        set(47, value);
    }

    /**
     * Getter for <code>xbkj.uc_member_contact.homeStreet</code>. 家庭地址
     */
    public String getHomestreet() {
        return (String) get(47);
    }

    /**
     * Setter for <code>xbkj.uc_member_contact.homeCity</code>. 家庭城市
     */
    public void setHomecity(String value) {
        set(48, value);
    }

    /**
     * Getter for <code>xbkj.uc_member_contact.homeCity</code>. 家庭城市
     */
    public String getHomecity() {
        return (String) get(48);
    }

    /**
     * Setter for <code>xbkj.uc_member_contact.homeBox</code>. 家庭box
     */
    public void setHomebox(String value) {
        set(49, value);
    }

    /**
     * Getter for <code>xbkj.uc_member_contact.homeBox</code>. 家庭box
     */
    public String getHomebox() {
        return (String) get(49);
    }

    /**
     * Setter for <code>xbkj.uc_member_contact.homeArea</code>. 家庭区域
     */
    public void setHomearea(String value) {
        set(50, value);
    }

    /**
     * Getter for <code>xbkj.uc_member_contact.homeArea</code>. 家庭区域
     */
    public String getHomearea() {
        return (String) get(50);
    }

    /**
     * Setter for <code>xbkj.uc_member_contact.homeState</code>. 家庭洲省
     */
    public void setHomestate(String value) {
        set(51, value);
    }

    /**
     * Getter for <code>xbkj.uc_member_contact.homeState</code>. 家庭洲省
     */
    public String getHomestate() {
        return (String) get(51);
    }

    /**
     * Setter for <code>xbkj.uc_member_contact.homeZip</code>. 家庭邮编
     */
    public void setHomezip(String value) {
        set(52, value);
    }

    /**
     * Getter for <code>xbkj.uc_member_contact.homeZip</code>. 家庭邮编
     */
    public String getHomezip() {
        return (String) get(52);
    }

    /**
     * Setter for <code>xbkj.uc_member_contact.homeCountry</code>. 家庭国家
     */
    public void setHomecountry(String value) {
        set(53, value);
    }

    /**
     * Getter for <code>xbkj.uc_member_contact.homeCountry</code>. 家庭国家
     */
    public String getHomecountry() {
        return (String) get(53);
    }

    /**
     * Setter for <code>xbkj.uc_member_contact.otherStreet</code>. 其他地址
     */
    public void setOtherstreet(String value) {
        set(54, value);
    }

    /**
     * Getter for <code>xbkj.uc_member_contact.otherStreet</code>. 其他地址
     */
    public String getOtherstreet() {
        return (String) get(54);
    }

    /**
     * Setter for <code>xbkj.uc_member_contact.otherCity</code>. 其他城市
     */
    public void setOthercity(String value) {
        set(55, value);
    }

    /**
     * Getter for <code>xbkj.uc_member_contact.otherCity</code>. 其他城市
     */
    public String getOthercity() {
        return (String) get(55);
    }

    /**
     * Setter for <code>xbkj.uc_member_contact.otherBox</code>. 其他box
     */
    public void setOtherbox(String value) {
        set(56, value);
    }

    /**
     * Getter for <code>xbkj.uc_member_contact.otherBox</code>. 其他box
     */
    public String getOtherbox() {
        return (String) get(56);
    }

    /**
     * Setter for <code>xbkj.uc_member_contact.otherArea</code>. 其他区域
     */
    public void setOtherarea(String value) {
        set(57, value);
    }

    /**
     * Getter for <code>xbkj.uc_member_contact.otherArea</code>. 其他区域
     */
    public String getOtherarea() {
        return (String) get(57);
    }

    /**
     * Setter for <code>xbkj.uc_member_contact.otherState</code>. 其他洲省
     */
    public void setOtherstate(String value) {
        set(58, value);
    }

    /**
     * Getter for <code>xbkj.uc_member_contact.otherState</code>. 其他洲省
     */
    public String getOtherstate() {
        return (String) get(58);
    }

    /**
     * Setter for <code>xbkj.uc_member_contact.otherZip</code>. 其他邮编
     */
    public void setOtherzip(String value) {
        set(59, value);
    }

    /**
     * Getter for <code>xbkj.uc_member_contact.otherZip</code>. 其他邮编
     */
    public String getOtherzip() {
        return (String) get(59);
    }

    /**
     * Setter for <code>xbkj.uc_member_contact.otherCountry</code>. 其他国家
     */
    public void setOthercountry(String value) {
        set(60, value);
    }

    /**
     * Getter for <code>xbkj.uc_member_contact.otherCountry</code>. 其他国家
     */
    public String getOthercountry() {
        return (String) get(60);
    }

    /**
     * Setter for <code>xbkj.uc_member_contact.workPage</code>. 工作主页
     */
    public void setWorkpage(String value) {
        set(61, value);
    }

    /**
     * Getter for <code>xbkj.uc_member_contact.workPage</code>. 工作主页
     */
    public String getWorkpage() {
        return (String) get(61);
    }

    /**
     * Setter for <code>xbkj.uc_member_contact.home</code>. 主页
     */
    public void setHome(String value) {
        set(62, value);
    }

    /**
     * Getter for <code>xbkj.uc_member_contact.home</code>. 主页
     */
    public String getHome() {
        return (String) get(62);
    }

    /**
     * Setter for <code>xbkj.uc_member_contact.instantsMsg</code>. 沟通
     */
    public void setInstantsmsg(String value) {
        set(63, value);
    }

    /**
     * Getter for <code>xbkj.uc_member_contact.instantsMsg</code>. 沟通
     */
    public String getInstantsmsg() {
        return (String) get(63);
    }

    /**
     * Setter for <code>xbkj.uc_member_contact.create_at</code>. 创建时间
     */
    public void setCreateAt(Timestamp value) {
        set(64, value);
    }

    /**
     * Getter for <code>xbkj.uc_member_contact.create_at</code>. 创建时间
     */
    public Timestamp getCreateAt() {
        return (Timestamp) get(64);
    }

    /**
     * Setter for <code>xbkj.uc_member_contact.update_at</code>. 更新时间
     */
    public void setUpdateAt(Timestamp value) {
        set(65, value);
    }

    /**
     * Getter for <code>xbkj.uc_member_contact.update_at</code>. 更新时间
     */
    public Timestamp getUpdateAt() {
        return (Timestamp) get(65);
    }

    /**
     * Setter for <code>xbkj.uc_member_contact.del_flag</code>. 删除标志
     */
    public void setDelFlag(Boolean value) {
        set(66, value);
    }

    /**
     * Getter for <code>xbkj.uc_member_contact.del_flag</code>. 删除标志
     */
    public Boolean getDelFlag() {
        return (Boolean) get(66);
    }

    /**
     * Setter for <code>xbkj.uc_member_contact.version</code>.
     */
    public void setVersion(Long value) {
        set(67, value);
    }

    /**
     * Getter for <code>xbkj.uc_member_contact.version</code>.
     */
    public Long getVersion() {
        return (Long) get(67);
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
     * Create a detached UcMemberContactRecord
     */
    public UcMemberContactRecord() {
        super(UcMemberContact.UC_MEMBER_CONTACT);
    }

    /**
     * Create a detached, initialised UcMemberContactRecord
     */
    public UcMemberContactRecord(Long id, Long memberId, String prefix, String firstname, String middlename, String lastname, String suffix, String phoneticfirstname, String phoneticmiddlename, String phoneticlastname, String mobile, String homenum, String jobnum, String workfax, String homefax, String pager, String quicknum, String carnum, String jobtel, String isdn, String tel, String wirelessdev, String telegram, String ttyTdd, String jobmobile, String jobpager, String assistantnum, String mms, String homeemail, String jobemail, String mobileemail, String birthday, String anniversary, String workmsg, String remark, String nickname, String street, String jobtitle, String company, String department, String homepage, String city, String box, String area, String state, String zip, String country, String homestreet, String homecity, String homebox, String homearea, String homestate, String homezip, String homecountry, String otherstreet, String othercity, String otherbox, String otherarea, String otherstate, String otherzip, String othercountry, String workpage, String home, String instantsmsg, Timestamp createAt, Timestamp updateAt, Boolean delFlag, Long version) {
        super(UcMemberContact.UC_MEMBER_CONTACT);

        set(0, id);
        set(1, memberId);
        set(2, prefix);
        set(3, firstname);
        set(4, middlename);
        set(5, lastname);
        set(6, suffix);
        set(7, phoneticfirstname);
        set(8, phoneticmiddlename);
        set(9, phoneticlastname);
        set(10, mobile);
        set(11, homenum);
        set(12, jobnum);
        set(13, workfax);
        set(14, homefax);
        set(15, pager);
        set(16, quicknum);
        set(17, carnum);
        set(18, jobtel);
        set(19, isdn);
        set(20, tel);
        set(21, wirelessdev);
        set(22, telegram);
        set(23, ttyTdd);
        set(24, jobmobile);
        set(25, jobpager);
        set(26, assistantnum);
        set(27, mms);
        set(28, homeemail);
        set(29, jobemail);
        set(30, mobileemail);
        set(31, birthday);
        set(32, anniversary);
        set(33, workmsg);
        set(34, remark);
        set(35, nickname);
        set(36, street);
        set(37, jobtitle);
        set(38, company);
        set(39, department);
        set(40, homepage);
        set(41, city);
        set(42, box);
        set(43, area);
        set(44, state);
        set(45, zip);
        set(46, country);
        set(47, homestreet);
        set(48, homecity);
        set(49, homebox);
        set(50, homearea);
        set(51, homestate);
        set(52, homezip);
        set(53, homecountry);
        set(54, otherstreet);
        set(55, othercity);
        set(56, otherbox);
        set(57, otherarea);
        set(58, otherstate);
        set(59, otherzip);
        set(60, othercountry);
        set(61, workpage);
        set(62, home);
        set(63, instantsmsg);
        set(64, createAt);
        set(65, updateAt);
        set(66, delFlag);
        set(67, version);
    }
}
