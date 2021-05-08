/*
 * This file is generated by jOOQ.
*/
package com.jooq.domain.tables.pojos;


import com.jooq.domain.enums.UcOrganShopCooperationType;
import com.jooq.domain.enums.UcOrganShopFeeType;
import com.jooq.domain.enums.UcOrganShopItsOrganShop;
import com.jooq.domain.enums.UcOrganShopStatus;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.annotation.Generated;


/**
 * 门店表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UcOrganShop implements Serializable {

    private static final long serialVersionUID = -507256625;

    private Long                       id;
    private Long                       organId;
    private String                     yeepayId;
    private String                     name;
    private String                     organName;
    private String                     attribute;
    private String                     no;
    private Integer                    popularity;
    private String                     province;
    private String                     city;
    private String                     area;
    private String                     logoUrl;
    private String                     position;
    private Double                     longitude;
    private Double                     dimension;
    private String                     address;
    private String                     telephone;
    private Integer                    ageStart;
    private Integer                    ageEnd;
    private UcOrganShopStatus          status;
    private Timestamp                  joinDate;
    private String                     maintainer;
    private Long                       maintainerId;
    private String                     intro;
    private String                     detailIntro;
    private String                     qrcode;
    private Boolean                    isOpenPayment;
    private Boolean                    isAddBankaccount;
    private BigDecimal                 dealCount;
    private BigDecimal                 creditCount;
    private Long                       usersCount;
    private UcOrganShopCooperationType cooperationType;
    private BigDecimal                 cooperationIncome;
    private UcOrganShopFeeType         feeType;
    private UcOrganShopItsOrganShop    itsOrganShop;
    private String                     eventRecord;
    private Timestamp                  createAt;
    private Timestamp                  updateAt;
    private Boolean                    delFlag;
    private Long                       version;

    public UcOrganShop() {}

    public UcOrganShop(UcOrganShop value) {
        this.id = value.id;
        this.organId = value.organId;
        this.yeepayId = value.yeepayId;
        this.name = value.name;
        this.organName = value.organName;
        this.attribute = value.attribute;
        this.no = value.no;
        this.popularity = value.popularity;
        this.province = value.province;
        this.city = value.city;
        this.area = value.area;
        this.logoUrl = value.logoUrl;
        this.position = value.position;
        this.longitude = value.longitude;
        this.dimension = value.dimension;
        this.address = value.address;
        this.telephone = value.telephone;
        this.ageStart = value.ageStart;
        this.ageEnd = value.ageEnd;
        this.status = value.status;
        this.joinDate = value.joinDate;
        this.maintainer = value.maintainer;
        this.maintainerId = value.maintainerId;
        this.intro = value.intro;
        this.detailIntro = value.detailIntro;
        this.qrcode = value.qrcode;
        this.isOpenPayment = value.isOpenPayment;
        this.isAddBankaccount = value.isAddBankaccount;
        this.dealCount = value.dealCount;
        this.creditCount = value.creditCount;
        this.usersCount = value.usersCount;
        this.cooperationType = value.cooperationType;
        this.cooperationIncome = value.cooperationIncome;
        this.feeType = value.feeType;
        this.itsOrganShop = value.itsOrganShop;
        this.eventRecord = value.eventRecord;
        this.createAt = value.createAt;
        this.updateAt = value.updateAt;
        this.delFlag = value.delFlag;
        this.version = value.version;
    }

    public UcOrganShop(
        Long                       id,
        Long                       organId,
        String                     yeepayId,
        String                     name,
        String                     organName,
        String                     attribute,
        String                     no,
        Integer                    popularity,
        String                     province,
        String                     city,
        String                     area,
        String                     logoUrl,
        String                     position,
        Double                     longitude,
        Double                     dimension,
        String                     address,
        String                     telephone,
        Integer                    ageStart,
        Integer                    ageEnd,
        UcOrganShopStatus          status,
        Timestamp                  joinDate,
        String                     maintainer,
        Long                       maintainerId,
        String                     intro,
        String                     detailIntro,
        String                     qrcode,
        Boolean                    isOpenPayment,
        Boolean                    isAddBankaccount,
        BigDecimal                 dealCount,
        BigDecimal                 creditCount,
        Long                       usersCount,
        UcOrganShopCooperationType cooperationType,
        BigDecimal                 cooperationIncome,
        UcOrganShopFeeType         feeType,
        UcOrganShopItsOrganShop    itsOrganShop,
        String                     eventRecord,
        Timestamp                  createAt,
        Timestamp                  updateAt,
        Boolean                    delFlag,
        Long                       version
    ) {
        this.id = id;
        this.organId = organId;
        this.yeepayId = yeepayId;
        this.name = name;
        this.organName = organName;
        this.attribute = attribute;
        this.no = no;
        this.popularity = popularity;
        this.province = province;
        this.city = city;
        this.area = area;
        this.logoUrl = logoUrl;
        this.position = position;
        this.longitude = longitude;
        this.dimension = dimension;
        this.address = address;
        this.telephone = telephone;
        this.ageStart = ageStart;
        this.ageEnd = ageEnd;
        this.status = status;
        this.joinDate = joinDate;
        this.maintainer = maintainer;
        this.maintainerId = maintainerId;
        this.intro = intro;
        this.detailIntro = detailIntro;
        this.qrcode = qrcode;
        this.isOpenPayment = isOpenPayment;
        this.isAddBankaccount = isAddBankaccount;
        this.dealCount = dealCount;
        this.creditCount = creditCount;
        this.usersCount = usersCount;
        this.cooperationType = cooperationType;
        this.cooperationIncome = cooperationIncome;
        this.feeType = feeType;
        this.itsOrganShop = itsOrganShop;
        this.eventRecord = eventRecord;
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

    public Long getOrganId() {
        return this.organId;
    }

    public void setOrganId(Long organId) {
        this.organId = organId;
    }

    public String getYeepayId() {
        return this.yeepayId;
    }

    public void setYeepayId(String yeepayId) {
        this.yeepayId = yeepayId;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOrganName() {
        return this.organName;
    }

    public void setOrganName(String organName) {
        this.organName = organName;
    }

    public String getAttribute() {
        return this.attribute;
    }

    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }

    public String getNo() {
        return this.no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public Integer getPopularity() {
        return this.popularity;
    }

    public void setPopularity(Integer popularity) {
        this.popularity = popularity;
    }

    public String getProvince() {
        return this.province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return this.city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getArea() {
        return this.area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getLogoUrl() {
        return this.logoUrl;
    }

    public void setLogoUrl(String logoUrl) {
        this.logoUrl = logoUrl;
    }

    public String getPosition() {
        return this.position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Double getLongitude() {
        return this.longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Double getDimension() {
        return this.dimension;
    }

    public void setDimension(Double dimension) {
        this.dimension = dimension;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTelephone() {
        return this.telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public Integer getAgeStart() {
        return this.ageStart;
    }

    public void setAgeStart(Integer ageStart) {
        this.ageStart = ageStart;
    }

    public Integer getAgeEnd() {
        return this.ageEnd;
    }

    public void setAgeEnd(Integer ageEnd) {
        this.ageEnd = ageEnd;
    }

    public UcOrganShopStatus getStatus() {
        return this.status;
    }

    public void setStatus(UcOrganShopStatus status) {
        this.status = status;
    }

    public Timestamp getJoinDate() {
        return this.joinDate;
    }

    public void setJoinDate(Timestamp joinDate) {
        this.joinDate = joinDate;
    }

    public String getMaintainer() {
        return this.maintainer;
    }

    public void setMaintainer(String maintainer) {
        this.maintainer = maintainer;
    }

    public Long getMaintainerId() {
        return this.maintainerId;
    }

    public void setMaintainerId(Long maintainerId) {
        this.maintainerId = maintainerId;
    }

    public String getIntro() {
        return this.intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    public String getDetailIntro() {
        return this.detailIntro;
    }

    public void setDetailIntro(String detailIntro) {
        this.detailIntro = detailIntro;
    }

    public String getQrcode() {
        return this.qrcode;
    }

    public void setQrcode(String qrcode) {
        this.qrcode = qrcode;
    }

    public Boolean getIsOpenPayment() {
        return this.isOpenPayment;
    }

    public void setIsOpenPayment(Boolean isOpenPayment) {
        this.isOpenPayment = isOpenPayment;
    }

    public Boolean getIsAddBankaccount() {
        return this.isAddBankaccount;
    }

    public void setIsAddBankaccount(Boolean isAddBankaccount) {
        this.isAddBankaccount = isAddBankaccount;
    }

    public BigDecimal getDealCount() {
        return this.dealCount;
    }

    public void setDealCount(BigDecimal dealCount) {
        this.dealCount = dealCount;
    }

    public BigDecimal getCreditCount() {
        return this.creditCount;
    }

    public void setCreditCount(BigDecimal creditCount) {
        this.creditCount = creditCount;
    }

    public Long getUsersCount() {
        return this.usersCount;
    }

    public void setUsersCount(Long usersCount) {
        this.usersCount = usersCount;
    }

    public UcOrganShopCooperationType getCooperationType() {
        return this.cooperationType;
    }

    public void setCooperationType(UcOrganShopCooperationType cooperationType) {
        this.cooperationType = cooperationType;
    }

    public BigDecimal getCooperationIncome() {
        return this.cooperationIncome;
    }

    public void setCooperationIncome(BigDecimal cooperationIncome) {
        this.cooperationIncome = cooperationIncome;
    }

    public UcOrganShopFeeType getFeeType() {
        return this.feeType;
    }

    public void setFeeType(UcOrganShopFeeType feeType) {
        this.feeType = feeType;
    }

    public UcOrganShopItsOrganShop getItsOrganShop() {
        return this.itsOrganShop;
    }

    public void setItsOrganShop(UcOrganShopItsOrganShop itsOrganShop) {
        this.itsOrganShop = itsOrganShop;
    }

    public String getEventRecord() {
        return this.eventRecord;
    }

    public void setEventRecord(String eventRecord) {
        this.eventRecord = eventRecord;
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
        StringBuilder sb = new StringBuilder("UcOrganShop (");

        sb.append(id);
        sb.append(", ").append(organId);
        sb.append(", ").append(yeepayId);
        sb.append(", ").append(name);
        sb.append(", ").append(organName);
        sb.append(", ").append(attribute);
        sb.append(", ").append(no);
        sb.append(", ").append(popularity);
        sb.append(", ").append(province);
        sb.append(", ").append(city);
        sb.append(", ").append(area);
        sb.append(", ").append(logoUrl);
        sb.append(", ").append(position);
        sb.append(", ").append(longitude);
        sb.append(", ").append(dimension);
        sb.append(", ").append(address);
        sb.append(", ").append(telephone);
        sb.append(", ").append(ageStart);
        sb.append(", ").append(ageEnd);
        sb.append(", ").append(status);
        sb.append(", ").append(joinDate);
        sb.append(", ").append(maintainer);
        sb.append(", ").append(maintainerId);
        sb.append(", ").append(intro);
        sb.append(", ").append(detailIntro);
        sb.append(", ").append(qrcode);
        sb.append(", ").append(isOpenPayment);
        sb.append(", ").append(isAddBankaccount);
        sb.append(", ").append(dealCount);
        sb.append(", ").append(creditCount);
        sb.append(", ").append(usersCount);
        sb.append(", ").append(cooperationType);
        sb.append(", ").append(cooperationIncome);
        sb.append(", ").append(feeType);
        sb.append(", ").append(itsOrganShop);
        sb.append(", ").append(eventRecord);
        sb.append(", ").append(createAt);
        sb.append(", ").append(updateAt);
        sb.append(", ").append(delFlag);
        sb.append(", ").append(version);

        sb.append(")");
        return sb.toString();
    }
}