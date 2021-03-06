/*
 * This file is generated by jOOQ.
*/
package com.jooq.domain;


import com.jooq.domain.tables.BscAuditHistory;
import com.jooq.domain.tables.BscDistricts;
import com.jooq.domain.tables.BscFile;
import com.jooq.domain.tables.BscFileBelongToOwner;
import com.jooq.domain.tables.CmsBanner;
import com.jooq.domain.tables.FdBankAccounts;
import com.jooq.domain.tables.FdBankBills;
import com.jooq.domain.tables.FdBankFlows;
import com.jooq.domain.tables.FdBankLimits;
import com.jooq.domain.tables.FdBankPositionFinance;
import com.jooq.domain.tables.FdBankPositionFixed;
import com.jooq.domain.tables.FdBankPositionFund;
import com.jooq.domain.tables.FdEbusinessAccounts;
import com.jooq.domain.tables.FdEbusinessAddress;
import com.jooq.domain.tables.FdEbusinessBillItems;
import com.jooq.domain.tables.FdEbusinessBills;
import com.jooq.domain.tables.FdEbusinessCards;
import com.jooq.domain.tables.FdEbusinessCreditLimit;
import com.jooq.domain.tables.FdEbusinessFlows;
import com.jooq.domain.tables.FdEbusinessPositionFinance;
import com.jooq.domain.tables.FdEbusinessPositionFixed;
import com.jooq.domain.tables.FdEbusinessPositionFund;
import com.jooq.domain.tables.FdEbusinessUnfinishedBillItems;
import com.jooq.domain.tables.FdFundAccounts;
import com.jooq.domain.tables.FdFundFlows;
import com.jooq.domain.tables.FdFundLoanFlows;
import com.jooq.domain.tables.FdFundLoans;
import com.jooq.domain.tables.FdOrganizationInfo;
import com.jooq.domain.tables.FdProviderBill;
import com.jooq.domain.tables.FdProviderCallCitys;
import com.jooq.domain.tables.FdProviderCallClassify;
import com.jooq.domain.tables.FdProviderCallRecord;
import com.jooq.domain.tables.FdProviderCallTimes;
import com.jooq.domain.tables.FdProviderCalledCitys;
import com.jooq.domain.tables.FdProviderCalledClassify;
import com.jooq.domain.tables.FdProviderCalledTimes;
import com.jooq.domain.tables.FdProviderConsumeRecords;
import com.jooq.domain.tables.FdProviderFrequentCalls;
import com.jooq.domain.tables.FdProviderHourCounts;
import com.jooq.domain.tables.FdProviderHourTimes;
import com.jooq.domain.tables.FdProviderInfo;
import com.jooq.domain.tables.FdProviderLoanCalls;
import com.jooq.domain.tables.FdProviderPhonalyzr;
import com.jooq.domain.tables.FdProviderPositions;
import com.jooq.domain.tables.FdProviderRegisterInfo;
import com.jooq.domain.tables.FdProviderSilentInfos;
import com.jooq.domain.tables.FdProviderSocialConnections;
import com.jooq.domain.tables.FdProviderSocialConnectionsPic;
import com.jooq.domain.tables.FdProviderTripInfo;
import com.jooq.domain.tables.FdReportEbusinessAddress;
import com.jooq.domain.tables.FdReportEbusinessCards;
import com.jooq.domain.tables.FdReportEbusinessConsumeClassify;
import com.jooq.domain.tables.FdReportEbusinessConsumeRecords;
import com.jooq.domain.tables.FdReportEbusinessCredit;
import com.jooq.domain.tables.FdReportEbusinessInfo;
import com.jooq.domain.tables.FdReportEbusinessUnusualTrans;
import com.jooq.domain.tables.FdReportFundCompanys;
import com.jooq.domain.tables.FdReportFundFlows;
import com.jooq.domain.tables.FdReportFundInfo;
import com.jooq.domain.tables.FdReportFundLoans;
import com.jooq.domain.tables.FdSocialsecurityAccount;
import com.jooq.domain.tables.FdSocialsecurityCustomer;
import com.jooq.domain.tables.FdSocialsecurityFlows;
import com.jooq.domain.tables.FdSocialsecurityInsurances;
import com.jooq.domain.tables.FinBalance;
import com.jooq.domain.tables.FinPopularityInOutLog;
import com.jooq.domain.tables.McCoupon;
import com.jooq.domain.tables.McCouponTemplate;
import com.jooq.domain.tables.McGift;
import com.jooq.domain.tables.McGiftTemplate;
import com.jooq.domain.tables.McMemberGift;
import com.jooq.domain.tables.MsgMessageLog;
import com.jooq.domain.tables.MsgMessageTemplate;
import com.jooq.domain.tables.MsgSendMessage;
import com.jooq.domain.tables.MsgSmsCode;
import com.jooq.domain.tables.OauthAccessToken;
import com.jooq.domain.tables.OauthClientDetails;
import com.jooq.domain.tables.OauthCode;
import com.jooq.domain.tables.SchemaVersion;
import com.jooq.domain.tables.SysDict;
import com.jooq.domain.tables.SysLog;
import com.jooq.domain.tables.SysMenu;
import com.jooq.domain.tables.SysRole;
import com.jooq.domain.tables.SysRoleMenu;
import com.jooq.domain.tables.SysUser;
import com.jooq.domain.tables.SysUserRole;
import com.jooq.domain.tables.TcContract;
import com.jooq.domain.tables.TcOrder;
import com.jooq.domain.tables.TcOrderComments;
import com.jooq.domain.tables.TcOrderInterest;
import com.jooq.domain.tables.UcAuditions;
import com.jooq.domain.tables.UcAuditionsBaby;
import com.jooq.domain.tables.UcBankCard;
import com.jooq.domain.tables.UcCourseShopCollect;
import com.jooq.domain.tables.UcCourseTeachers;
import com.jooq.domain.tables.UcFamilyIdcard;
import com.jooq.domain.tables.UcFeedback;
import com.jooq.domain.tables.UcMember;
import com.jooq.domain.tables.UcMemberApprove;
import com.jooq.domain.tables.UcMemberApproveOpenId;
import com.jooq.domain.tables.UcMemberBabyInfo;
import com.jooq.domain.tables.UcMemberCollege;
import com.jooq.domain.tables.UcMemberContact;
import com.jooq.domain.tables.UcMemberCoupon;
import com.jooq.domain.tables.UcMemberDegree;
import com.jooq.domain.tables.UcMemberEmergencyContact;
import com.jooq.domain.tables.UcMemberFamilyInfo;
import com.jooq.domain.tables.UcMemberInfo;
import com.jooq.domain.tables.UcMemberLogin;
import com.jooq.domain.tables.UcMemberRefer;
import com.jooq.domain.tables.UcMemberRequestLoan;
import com.jooq.domain.tables.UcMemberWorkInfo;
import com.jooq.domain.tables.UcOpenPay;
import com.jooq.domain.tables.UcOrganQuality;
import com.jooq.domain.tables.UcOrganShop;
import com.jooq.domain.tables.UcOrganization;
import com.jooq.domain.tables.UcShopActivity;
import com.jooq.domain.tables.UcShopCourse;
import com.jooq.domain.tables.UcShopQuality;
import com.jooq.domain.tables.UcShopTeacher;
import com.jooq.domain.tables.UcTag;
import com.jooq.domain.tables.UcTagLink;
import com.jooq.domain.tables.UcYeepayRequestId;
import com.jooq.domain.tables.YeepayPayOrder;
import com.jooq.domain.tables.YeepayTransferOrder;
import com.jooq.domain.tables.YeepayZgtTransfer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Catalog;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Xbkj extends SchemaImpl {

    private static final long serialVersionUID = -1550599046;

    /**
     * The reference instance of <code>xbkj</code>
     */
    public static final Xbkj XBKJ = new Xbkj();

    /**
     * ???????????????
     */
    public final BscAuditHistory BSC_AUDIT_HISTORY = com.jooq.domain.tables.BscAuditHistory.BSC_AUDIT_HISTORY;

    /**
     * ????????????
     */
    public final BscDistricts BSC_DISTRICTS = com.jooq.domain.tables.BscDistricts.BSC_DISTRICTS;

    /**
     * ?????????
     */
    public final BscFile BSC_FILE = com.jooq.domain.tables.BscFile.BSC_FILE;

    /**
     * ?????????????????????
     */
    public final BscFileBelongToOwner BSC_FILE_BELONG_TO_OWNER = com.jooq.domain.tables.BscFileBelongToOwner.BSC_FILE_BELONG_TO_OWNER;

    /**
     * banner??????
     */
    public final CmsBanner CMS_BANNER = com.jooq.domain.tables.CmsBanner.CMS_BANNER;

    /**
     * ???????????????
     */
    public final FdBankAccounts FD_BANK_ACCOUNTS = com.jooq.domain.tables.FdBankAccounts.FD_BANK_ACCOUNTS;

    /**
     * ???????????????(??????)
     */
    public final FdBankBills FD_BANK_BILLS = com.jooq.domain.tables.FdBankBills.FD_BANK_BILLS;

    /**
     * ??????(??????)
     */
    public final FdBankFlows FD_BANK_FLOWS = com.jooq.domain.tables.FdBankFlows.FD_BANK_FLOWS;

    /**
     * ???????????????(??????)
     */
    public final FdBankLimits FD_BANK_LIMITS = com.jooq.domain.tables.FdBankLimits.FD_BANK_LIMITS;

    /**
     * ????????????(??????)
     */
    public final FdBankPositionFinance FD_BANK_POSITION_FINANCE = com.jooq.domain.tables.FdBankPositionFinance.FD_BANK_POSITION_FINANCE;

    /**
     * ????????????(??????)
     */
    public final FdBankPositionFixed FD_BANK_POSITION_FIXED = com.jooq.domain.tables.FdBankPositionFixed.FD_BANK_POSITION_FIXED;

    /**
     * ????????????(??????)
     */
    public final FdBankPositionFund FD_BANK_POSITION_FUND = com.jooq.domain.tables.FdBankPositionFund.FD_BANK_POSITION_FUND;

    /**
     * ??????????????????
     */
    public final FdEbusinessAccounts FD_EBUSINESS_ACCOUNTS = com.jooq.domain.tables.FdEbusinessAccounts.FD_EBUSINESS_ACCOUNTS;

    /**
     * ??????????????????
     */
    public final FdEbusinessAddress FD_EBUSINESS_ADDRESS = com.jooq.domain.tables.FdEbusinessAddress.FD_EBUSINESS_ADDRESS;

    /**
     * ??????????????????(??????)(??????)
     */
    public final FdEbusinessBills FD_EBUSINESS_BILLS = com.jooq.domain.tables.FdEbusinessBills.FD_EBUSINESS_BILLS;

    /**
     * ???????????????????????????????????? ??????(??????)(??????)
     */
    public final FdEbusinessBillItems FD_EBUSINESS_BILL_ITEMS = com.jooq.domain.tables.FdEbusinessBillItems.FD_EBUSINESS_BILL_ITEMS;

    /**
     * ????????????????????? ?????????
     */
    public final FdEbusinessCards FD_EBUSINESS_CARDS = com.jooq.domain.tables.FdEbusinessCards.FD_EBUSINESS_CARDS;

    /**
     * ????????????????????????(??????),???????????????
     */
    public final FdEbusinessCreditLimit FD_EBUSINESS_CREDIT_LIMIT = com.jooq.domain.tables.FdEbusinessCreditLimit.FD_EBUSINESS_CREDIT_LIMIT;

    /**
     * ????????????
     */
    public final FdEbusinessFlows FD_EBUSINESS_FLOWS = com.jooq.domain.tables.FdEbusinessFlows.FD_EBUSINESS_FLOWS;

    /**
     * ????????????????????????????????????
     */
    public final FdEbusinessPositionFinance FD_EBUSINESS_POSITION_FINANCE = com.jooq.domain.tables.FdEbusinessPositionFinance.FD_EBUSINESS_POSITION_FINANCE;

    /**
     * ???????????????????????????
     */
    public final FdEbusinessPositionFixed FD_EBUSINESS_POSITION_FIXED = com.jooq.domain.tables.FdEbusinessPositionFixed.FD_EBUSINESS_POSITION_FIXED;

    /**
     * ?????????????????????????????????
     */
    public final FdEbusinessPositionFund FD_EBUSINESS_POSITION_FUND = com.jooq.domain.tables.FdEbusinessPositionFund.FD_EBUSINESS_POSITION_FUND;

    /**
     * ????????????????????? ??????(??????)(??????)
     */
    public final FdEbusinessUnfinishedBillItems FD_EBUSINESS_UNFINISHED_BILL_ITEMS = com.jooq.domain.tables.FdEbusinessUnfinishedBillItems.FD_EBUSINESS_UNFINISHED_BILL_ITEMS;

    /**
     * ?????????????????????
     */
    public final FdFundAccounts FD_FUND_ACCOUNTS = com.jooq.domain.tables.FdFundAccounts.FD_FUND_ACCOUNTS;

    /**
     * ?????????????????????
     */
    public final FdFundFlows FD_FUND_FLOWS = com.jooq.domain.tables.FdFundFlows.FD_FUND_FLOWS;

    /**
     * ?????????????????????
     */
    public final FdFundLoans FD_FUND_LOANS = com.jooq.domain.tables.FdFundLoans.FD_FUND_LOANS;

    /**
     * ?????????????????????
     */
    public final FdFundLoanFlows FD_FUND_LOAN_FLOWS = com.jooq.domain.tables.FdFundLoanFlows.FD_FUND_LOAN_FLOWS;

    /**
     * ?????????????????????
     */
    public final FdOrganizationInfo FD_ORGANIZATION_INFO = com.jooq.domain.tables.FdOrganizationInfo.FD_ORGANIZATION_INFO;

    /**
     * ??????????????????
     */
    public final FdProviderBill FD_PROVIDER_BILL = com.jooq.domain.tables.FdProviderBill.FD_PROVIDER_BILL;

    /**
     * ????????????????????????????????????
     */
    public final FdProviderCalledCitys FD_PROVIDER_CALLED_CITYS = com.jooq.domain.tables.FdProviderCalledCitys.FD_PROVIDER_CALLED_CITYS;

    /**
     * ????????????????????????????????????
     */
    public final FdProviderCalledClassify FD_PROVIDER_CALLED_CLASSIFY = com.jooq.domain.tables.FdProviderCalledClassify.FD_PROVIDER_CALLED_CLASSIFY;

    /**
     * ??????????????????
     */
    public final FdProviderCalledTimes FD_PROVIDER_CALLED_TIMES = com.jooq.domain.tables.FdProviderCalledTimes.FD_PROVIDER_CALLED_TIMES;

    /**
     * ????????????????????????????????????
     */
    public final FdProviderCallCitys FD_PROVIDER_CALL_CITYS = com.jooq.domain.tables.FdProviderCallCitys.FD_PROVIDER_CALL_CITYS;

    /**
     * ????????????????????????????????????
     */
    public final FdProviderCallClassify FD_PROVIDER_CALL_CLASSIFY = com.jooq.domain.tables.FdProviderCallClassify.FD_PROVIDER_CALL_CLASSIFY;

    /**
     * ???????????????
     */
    public final FdProviderCallRecord FD_PROVIDER_CALL_RECORD = com.jooq.domain.tables.FdProviderCallRecord.FD_PROVIDER_CALL_RECORD;

    /**
     * ?????????????????????
     */
    public final FdProviderCallTimes FD_PROVIDER_CALL_TIMES = com.jooq.domain.tables.FdProviderCallTimes.FD_PROVIDER_CALL_TIMES;

    /**
     * ??????????????????
     */
    public final FdProviderConsumeRecords FD_PROVIDER_CONSUME_RECORDS = com.jooq.domain.tables.FdProviderConsumeRecords.FD_PROVIDER_CONSUME_RECORDS;

    /**
     * ???????????????????????????????????????
     */
    public final FdProviderFrequentCalls FD_PROVIDER_FREQUENT_CALLS = com.jooq.domain.tables.FdProviderFrequentCalls.FD_PROVIDER_FREQUENT_CALLS;

    /**
     * 24????????????????????????(????????????)???
     */
    public final FdProviderHourCounts FD_PROVIDER_HOUR_COUNTS = com.jooq.domain.tables.FdProviderHourCounts.FD_PROVIDER_HOUR_COUNTS;

    /**
     * 24????????????????????????(????????????)???
     */
    public final FdProviderHourTimes FD_PROVIDER_HOUR_TIMES = com.jooq.domain.tables.FdProviderHourTimes.FD_PROVIDER_HOUR_TIMES;

    /**
     * ??????????????????
     */
    public final FdProviderInfo FD_PROVIDER_INFO = com.jooq.domain.tables.FdProviderInfo.FD_PROVIDER_INFO;

    /**
     * ?????????????????????(?????????????????????????????????????????????)???
     */
    public final FdProviderLoanCalls FD_PROVIDER_LOAN_CALLS = com.jooq.domain.tables.FdProviderLoanCalls.FD_PROVIDER_LOAN_CALLS;

    /**
     * ???????????????
     */
    public final FdProviderPhonalyzr FD_PROVIDER_PHONALYZR = com.jooq.domain.tables.FdProviderPhonalyzr.FD_PROVIDER_PHONALYZR;

    /**
     * ????????????(???????????????????????????)???
     */
    public final FdProviderPositions FD_PROVIDER_POSITIONS = com.jooq.domain.tables.FdProviderPositions.FD_PROVIDER_POSITIONS;

    /**
     * ???????????????
     */
    public final FdProviderRegisterInfo FD_PROVIDER_REGISTER_INFO = com.jooq.domain.tables.FdProviderRegisterInfo.FD_PROVIDER_REGISTER_INFO;

    /**
     * ???????????????
     */
    public final FdProviderSilentInfos FD_PROVIDER_SILENT_INFOS = com.jooq.domain.tables.FdProviderSilentInfos.FD_PROVIDER_SILENT_INFOS;

    /**
     * ???????????????
     */
    public final FdProviderSocialConnections FD_PROVIDER_SOCIAL_CONNECTIONS = com.jooq.domain.tables.FdProviderSocialConnections.FD_PROVIDER_SOCIAL_CONNECTIONS;

    /**
     * ??????????????????
     */
    public final FdProviderSocialConnectionsPic FD_PROVIDER_SOCIAL_CONNECTIONS_PIC = com.jooq.domain.tables.FdProviderSocialConnectionsPic.FD_PROVIDER_SOCIAL_CONNECTIONS_PIC;

    /**
     * ???????????????
     */
    public final FdProviderTripInfo FD_PROVIDER_TRIP_INFO = com.jooq.domain.tables.FdProviderTripInfo.FD_PROVIDER_TRIP_INFO;

    /**
     * ????????????????????????
     */
    public final FdReportEbusinessAddress FD_REPORT_EBUSINESS_ADDRESS = com.jooq.domain.tables.FdReportEbusinessAddress.FD_REPORT_EBUSINESS_ADDRESS;

    /**
     * ??????????????????????????????
     */
    public final FdReportEbusinessCards FD_REPORT_EBUSINESS_CARDS = com.jooq.domain.tables.FdReportEbusinessCards.FD_REPORT_EBUSINESS_CARDS;

    /**
     * ??????????????????????????????
     */
    public final FdReportEbusinessConsumeClassify FD_REPORT_EBUSINESS_CONSUME_CLASSIFY = com.jooq.domain.tables.FdReportEbusinessConsumeClassify.FD_REPORT_EBUSINESS_CONSUME_CLASSIFY;

    /**
     * ??????????????????????????????
     */
    public final FdReportEbusinessConsumeRecords FD_REPORT_EBUSINESS_CONSUME_RECORDS = com.jooq.domain.tables.FdReportEbusinessConsumeRecords.FD_REPORT_EBUSINESS_CONSUME_RECORDS;

    /**
     * ????????????????????????
     */
    public final FdReportEbusinessCredit FD_REPORT_EBUSINESS_CREDIT = com.jooq.domain.tables.FdReportEbusinessCredit.FD_REPORT_EBUSINESS_CREDIT;

    /**
     * ??????????????????????????????
     */
    public final FdReportEbusinessInfo FD_REPORT_EBUSINESS_INFO = com.jooq.domain.tables.FdReportEbusinessInfo.FD_REPORT_EBUSINESS_INFO;

    /**
     * ??????????????????????????????
     */
    public final FdReportEbusinessUnusualTrans FD_REPORT_EBUSINESS_UNUSUAL_TRANS = com.jooq.domain.tables.FdReportEbusinessUnusualTrans.FD_REPORT_EBUSINESS_UNUSUAL_TRANS;

    /**
     * ?????????????????????????????????
     */
    public final FdReportFundCompanys FD_REPORT_FUND_COMPANYS = com.jooq.domain.tables.FdReportFundCompanys.FD_REPORT_FUND_COMPANYS;

    /**
     * ?????????????????????????????????
     */
    public final FdReportFundFlows FD_REPORT_FUND_FLOWS = com.jooq.domain.tables.FdReportFundFlows.FD_REPORT_FUND_FLOWS;

    /**
     * ?????????????????????????????????
     */
    public final FdReportFundInfo FD_REPORT_FUND_INFO = com.jooq.domain.tables.FdReportFundInfo.FD_REPORT_FUND_INFO;

    /**
     * ???????????????????????????
     */
    public final FdReportFundLoans FD_REPORT_FUND_LOANS = com.jooq.domain.tables.FdReportFundLoans.FD_REPORT_FUND_LOANS;

    /**
     * ???????????????
     */
    public final FdSocialsecurityAccount FD_SOCIALSECURITY_ACCOUNT = com.jooq.domain.tables.FdSocialsecurityAccount.FD_SOCIALSECURITY_ACCOUNT;

    /**
     * ???????????????
     */
    public final FdSocialsecurityCustomer FD_SOCIALSECURITY_CUSTOMER = com.jooq.domain.tables.FdSocialsecurityCustomer.FD_SOCIALSECURITY_CUSTOMER;

    /**
     * ???????????????
     */
    public final FdSocialsecurityFlows FD_SOCIALSECURITY_FLOWS = com.jooq.domain.tables.FdSocialsecurityFlows.FD_SOCIALSECURITY_FLOWS;

    /**
     * ???????????????
     */
    public final FdSocialsecurityInsurances FD_SOCIALSECURITY_INSURANCES = com.jooq.domain.tables.FdSocialsecurityInsurances.FD_SOCIALSECURITY_INSURANCES;

    /**
     * ?????????????????????
     */
    public final FinBalance FIN_BALANCE = com.jooq.domain.tables.FinBalance.FIN_BALANCE;

    /**
     * ?????????????????????
     */
    public final FinPopularityInOutLog FIN_POPULARITY_IN_OUT_LOG = com.jooq.domain.tables.FinPopularityInOutLog.FIN_POPULARITY_IN_OUT_LOG;

    /**
     * ?????????
     */
    public final McCoupon MC_COUPON = com.jooq.domain.tables.McCoupon.MC_COUPON;

    /**
     * ???????????????
     */
    public final McCouponTemplate MC_COUPON_TEMPLATE = com.jooq.domain.tables.McCouponTemplate.MC_COUPON_TEMPLATE;

    /**
     * ????????????
     */
    public final McGift MC_GIFT = com.jooq.domain.tables.McGift.MC_GIFT;

    /**
     * ??????
     */
    public final McGiftTemplate MC_GIFT_TEMPLATE = com.jooq.domain.tables.McGiftTemplate.MC_GIFT_TEMPLATE;

    /**
     * ?????????????????????????????????
     */
    public final McMemberGift MC_MEMBER_GIFT = com.jooq.domain.tables.McMemberGift.MC_MEMBER_GIFT;

    /**
     * ????????????
     */
    public final MsgMessageLog MSG_MESSAGE_LOG = com.jooq.domain.tables.MsgMessageLog.MSG_MESSAGE_LOG;

    /**
     * ????????????
     */
    public final MsgMessageTemplate MSG_MESSAGE_TEMPLATE = com.jooq.domain.tables.MsgMessageTemplate.MSG_MESSAGE_TEMPLATE;

    /**
     * ??????????????????
     */
    public final MsgSendMessage MSG_SEND_MESSAGE = com.jooq.domain.tables.MsgSendMessage.MSG_SEND_MESSAGE;

    /**
     * ???????????????
     */
    public final MsgSmsCode MSG_SMS_CODE = com.jooq.domain.tables.MsgSmsCode.MSG_SMS_CODE;

    /**
     * The table <code>xbkj.oauth_access_token</code>.
     */
    public final OauthAccessToken OAUTH_ACCESS_TOKEN = com.jooq.domain.tables.OauthAccessToken.OAUTH_ACCESS_TOKEN;

    /**
     * The table <code>xbkj.oauth_client_details</code>.
     */
    public final OauthClientDetails OAUTH_CLIENT_DETAILS = com.jooq.domain.tables.OauthClientDetails.OAUTH_CLIENT_DETAILS;

    /**
     * ???????????????
     */
    public final OauthCode OAUTH_CODE = com.jooq.domain.tables.OauthCode.OAUTH_CODE;

    /**
     * The table <code>xbkj.schema_version</code>.
     */
    public final SchemaVersion SCHEMA_VERSION = com.jooq.domain.tables.SchemaVersion.SCHEMA_VERSION;

    /**
     * ?????????
     */
    public final SysDict SYS_DICT = com.jooq.domain.tables.SysDict.SYS_DICT;

    /**
     * ?????????
     */
    public final SysLog SYS_LOG = com.jooq.domain.tables.SysLog.SYS_LOG;

    /**
     * ?????????
     */
    public final SysMenu SYS_MENU = com.jooq.domain.tables.SysMenu.SYS_MENU;

    /**
     * ?????????
     */
    public final SysRole SYS_ROLE = com.jooq.domain.tables.SysRole.SYS_ROLE;

    /**
     * ??????-??????
     */
    public final SysRoleMenu SYS_ROLE_MENU = com.jooq.domain.tables.SysRoleMenu.SYS_ROLE_MENU;

    /**
     * ?????????
     */
    public final SysUser SYS_USER = com.jooq.domain.tables.SysUser.SYS_USER;

    /**
     * ??????-??????
     */
    public final SysUserRole SYS_USER_ROLE = com.jooq.domain.tables.SysUserRole.SYS_USER_ROLE;

    /**
     * ?????????
     */
    public final TcContract TC_CONTRACT = com.jooq.domain.tables.TcContract.TC_CONTRACT;

    /**
     * ???????????????
     */
    public final TcOrder TC_ORDER = com.jooq.domain.tables.TcOrder.TC_ORDER;

    /**
     * The table <code>xbkj.tc_order_comments</code>.
     */
    public final TcOrderComments TC_ORDER_COMMENTS = com.jooq.domain.tables.TcOrderComments.TC_ORDER_COMMENTS;

    /**
     * ?????????????????????
     */
    public final TcOrderInterest TC_ORDER_INTEREST = com.jooq.domain.tables.TcOrderInterest.TC_ORDER_INTEREST;

    /**
     * ??????????????????
     */
    public final UcAuditions UC_AUDITIONS = com.jooq.domain.tables.UcAuditions.UC_AUDITIONS;

    /**
     * ???????????????-?????????
     */
    public final UcAuditionsBaby UC_AUDITIONS_BABY = com.jooq.domain.tables.UcAuditionsBaby.UC_AUDITIONS_BABY;

    /**
     * ????????????
     */
    public final UcBankCard UC_BANK_CARD = com.jooq.domain.tables.UcBankCard.UC_BANK_CARD;

    /**
     * ??????????????????????????????
     */
    public final UcCourseShopCollect UC_COURSE_SHOP_COLLECT = com.jooq.domain.tables.UcCourseShopCollect.UC_COURSE_SHOP_COLLECT;

    /**
     * ??????????????????
     */
    public final UcCourseTeachers UC_COURSE_TEACHERS = com.jooq.domain.tables.UcCourseTeachers.UC_COURSE_TEACHERS;

    /**
     * ??????????????????
     */
    public final UcFamilyIdcard UC_FAMILY_IDCARD = com.jooq.domain.tables.UcFamilyIdcard.UC_FAMILY_IDCARD;

    /**
     * ????????????
     */
    public final UcFeedback UC_FEEDBACK = com.jooq.domain.tables.UcFeedback.UC_FEEDBACK;

    /**
     * ?????????
     */
    public final UcMember UC_MEMBER = com.jooq.domain.tables.UcMember.UC_MEMBER;

    /**
     * ???????????????
     */
    public final UcMemberApprove UC_MEMBER_APPROVE = com.jooq.domain.tables.UcMemberApprove.UC_MEMBER_APPROVE;

    /**
     * ?????????????????????
     */
    public final UcMemberApproveOpenId UC_MEMBER_APPROVE_OPEN_ID = com.jooq.domain.tables.UcMemberApproveOpenId.UC_MEMBER_APPROVE_OPEN_ID;

    /**
     * ???????????????
     */
    public final UcMemberBabyInfo UC_MEMBER_BABY_INFO = com.jooq.domain.tables.UcMemberBabyInfo.UC_MEMBER_BABY_INFO;

    /**
     * ???????????????
     */
    public final UcMemberCollege UC_MEMBER_COLLEGE = com.jooq.domain.tables.UcMemberCollege.UC_MEMBER_COLLEGE;

    /**
     * ??????????????????
     */
    public final UcMemberContact UC_MEMBER_CONTACT = com.jooq.domain.tables.UcMemberContact.UC_MEMBER_CONTACT;

    /**
     * ?????????
     */
    public final UcMemberCoupon UC_MEMBER_COUPON = com.jooq.domain.tables.UcMemberCoupon.UC_MEMBER_COUPON;

    /**
     * ?????????
     */
    public final UcMemberDegree UC_MEMBER_DEGREE = com.jooq.domain.tables.UcMemberDegree.UC_MEMBER_DEGREE;

    /**
     * ??????????????????
     */
    public final UcMemberEmergencyContact UC_MEMBER_EMERGENCY_CONTACT = com.jooq.domain.tables.UcMemberEmergencyContact.UC_MEMBER_EMERGENCY_CONTACT;

    /**
     * ???????????????
     */
    public final UcMemberFamilyInfo UC_MEMBER_FAMILY_INFO = com.jooq.domain.tables.UcMemberFamilyInfo.UC_MEMBER_FAMILY_INFO;

    /**
     * ???????????????
     */
    public final UcMemberInfo UC_MEMBER_INFO = com.jooq.domain.tables.UcMemberInfo.UC_MEMBER_INFO;

    /**
     * ???????????????
     */
    public final UcMemberLogin UC_MEMBER_LOGIN = com.jooq.domain.tables.UcMemberLogin.UC_MEMBER_LOGIN;

    /**
     * ???????????????
     */
    public final UcMemberRefer UC_MEMBER_REFER = com.jooq.domain.tables.UcMemberRefer.UC_MEMBER_REFER;

    /**
     * ?????????????????????????????????
     */
    public final UcMemberRequestLoan UC_MEMBER_REQUEST_LOAN = com.jooq.domain.tables.UcMemberRequestLoan.UC_MEMBER_REQUEST_LOAN;

    /**
     * ???????????????
     */
    public final UcMemberWorkInfo UC_MEMBER_WORK_INFO = com.jooq.domain.tables.UcMemberWorkInfo.UC_MEMBER_WORK_INFO;

    /**
     * ?????????????????? ??????????????????????????????
     */
    public final UcOpenPay UC_OPEN_PAY = com.jooq.domain.tables.UcOpenPay.UC_OPEN_PAY;

    /**
     * ?????????
     */
    public final UcOrganization UC_ORGANIZATION = com.jooq.domain.tables.UcOrganization.UC_ORGANIZATION;

    /**
     * ???????????????
     */
    public final UcOrganQuality UC_ORGAN_QUALITY = com.jooq.domain.tables.UcOrganQuality.UC_ORGAN_QUALITY;

    /**
     * ?????????
     */
    public final UcOrganShop UC_ORGAN_SHOP = com.jooq.domain.tables.UcOrganShop.UC_ORGAN_SHOP;

    /**
     * ???????????????
     */
    public final UcShopActivity UC_SHOP_ACTIVITY = com.jooq.domain.tables.UcShopActivity.UC_SHOP_ACTIVITY;

    /**
     * ????????????
     */
    public final UcShopCourse UC_SHOP_COURSE = com.jooq.domain.tables.UcShopCourse.UC_SHOP_COURSE;

    /**
     * ???????????????
     */
    public final UcShopQuality UC_SHOP_QUALITY = com.jooq.domain.tables.UcShopQuality.UC_SHOP_QUALITY;

    /**
     * ????????????
     */
    public final UcShopTeacher UC_SHOP_TEACHER = com.jooq.domain.tables.UcShopTeacher.UC_SHOP_TEACHER;

    /**
     * ?????????
     */
    public final UcTag UC_TAG = com.jooq.domain.tables.UcTag.UC_TAG;

    /**
     * ???????????????
     */
    public final UcTagLink UC_TAG_LINK = com.jooq.domain.tables.UcTagLink.UC_TAG_LINK;

    /**
     * The table <code>xbkj.uc_yeepay_request_id</code>.
     */
    public final UcYeepayRequestId UC_YEEPAY_REQUEST_ID = com.jooq.domain.tables.UcYeepayRequestId.UC_YEEPAY_REQUEST_ID;

    /**
     * ???????????????
     */
    public final YeepayPayOrder YEEPAY_PAY_ORDER = com.jooq.domain.tables.YeepayPayOrder.YEEPAY_PAY_ORDER;

    /**
     * ???????????????
     */
    public final YeepayTransferOrder YEEPAY_TRANSFER_ORDER = com.jooq.domain.tables.YeepayTransferOrder.YEEPAY_TRANSFER_ORDER;

    /**
     * ????????????????????????
     */
    public final YeepayZgtTransfer YEEPAY_ZGT_TRANSFER = com.jooq.domain.tables.YeepayZgtTransfer.YEEPAY_ZGT_TRANSFER;

    /**
     * No further instances allowed
     */
    private Xbkj() {
        super("xbkj", null);
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Table<?>> getTables() {
        List result = new ArrayList();
        result.addAll(getTables0());
        return result;
    }

    private final List<Table<?>> getTables0() {
        return Arrays.<Table<?>>asList(
            BscAuditHistory.BSC_AUDIT_HISTORY,
            BscDistricts.BSC_DISTRICTS,
            BscFile.BSC_FILE,
            BscFileBelongToOwner.BSC_FILE_BELONG_TO_OWNER,
            CmsBanner.CMS_BANNER,
            FdBankAccounts.FD_BANK_ACCOUNTS,
            FdBankBills.FD_BANK_BILLS,
            FdBankFlows.FD_BANK_FLOWS,
            FdBankLimits.FD_BANK_LIMITS,
            FdBankPositionFinance.FD_BANK_POSITION_FINANCE,
            FdBankPositionFixed.FD_BANK_POSITION_FIXED,
            FdBankPositionFund.FD_BANK_POSITION_FUND,
            FdEbusinessAccounts.FD_EBUSINESS_ACCOUNTS,
            FdEbusinessAddress.FD_EBUSINESS_ADDRESS,
            FdEbusinessBills.FD_EBUSINESS_BILLS,
            FdEbusinessBillItems.FD_EBUSINESS_BILL_ITEMS,
            FdEbusinessCards.FD_EBUSINESS_CARDS,
            FdEbusinessCreditLimit.FD_EBUSINESS_CREDIT_LIMIT,
            FdEbusinessFlows.FD_EBUSINESS_FLOWS,
            FdEbusinessPositionFinance.FD_EBUSINESS_POSITION_FINANCE,
            FdEbusinessPositionFixed.FD_EBUSINESS_POSITION_FIXED,
            FdEbusinessPositionFund.FD_EBUSINESS_POSITION_FUND,
            FdEbusinessUnfinishedBillItems.FD_EBUSINESS_UNFINISHED_BILL_ITEMS,
            FdFundAccounts.FD_FUND_ACCOUNTS,
            FdFundFlows.FD_FUND_FLOWS,
            FdFundLoans.FD_FUND_LOANS,
            FdFundLoanFlows.FD_FUND_LOAN_FLOWS,
            FdOrganizationInfo.FD_ORGANIZATION_INFO,
            FdProviderBill.FD_PROVIDER_BILL,
            FdProviderCalledCitys.FD_PROVIDER_CALLED_CITYS,
            FdProviderCalledClassify.FD_PROVIDER_CALLED_CLASSIFY,
            FdProviderCalledTimes.FD_PROVIDER_CALLED_TIMES,
            FdProviderCallCitys.FD_PROVIDER_CALL_CITYS,
            FdProviderCallClassify.FD_PROVIDER_CALL_CLASSIFY,
            FdProviderCallRecord.FD_PROVIDER_CALL_RECORD,
            FdProviderCallTimes.FD_PROVIDER_CALL_TIMES,
            FdProviderConsumeRecords.FD_PROVIDER_CONSUME_RECORDS,
            FdProviderFrequentCalls.FD_PROVIDER_FREQUENT_CALLS,
            FdProviderHourCounts.FD_PROVIDER_HOUR_COUNTS,
            FdProviderHourTimes.FD_PROVIDER_HOUR_TIMES,
            FdProviderInfo.FD_PROVIDER_INFO,
            FdProviderLoanCalls.FD_PROVIDER_LOAN_CALLS,
            FdProviderPhonalyzr.FD_PROVIDER_PHONALYZR,
            FdProviderPositions.FD_PROVIDER_POSITIONS,
            FdProviderRegisterInfo.FD_PROVIDER_REGISTER_INFO,
            FdProviderSilentInfos.FD_PROVIDER_SILENT_INFOS,
            FdProviderSocialConnections.FD_PROVIDER_SOCIAL_CONNECTIONS,
            FdProviderSocialConnectionsPic.FD_PROVIDER_SOCIAL_CONNECTIONS_PIC,
            FdProviderTripInfo.FD_PROVIDER_TRIP_INFO,
            FdReportEbusinessAddress.FD_REPORT_EBUSINESS_ADDRESS,
            FdReportEbusinessCards.FD_REPORT_EBUSINESS_CARDS,
            FdReportEbusinessConsumeClassify.FD_REPORT_EBUSINESS_CONSUME_CLASSIFY,
            FdReportEbusinessConsumeRecords.FD_REPORT_EBUSINESS_CONSUME_RECORDS,
            FdReportEbusinessCredit.FD_REPORT_EBUSINESS_CREDIT,
            FdReportEbusinessInfo.FD_REPORT_EBUSINESS_INFO,
            FdReportEbusinessUnusualTrans.FD_REPORT_EBUSINESS_UNUSUAL_TRANS,
            FdReportFundCompanys.FD_REPORT_FUND_COMPANYS,
            FdReportFundFlows.FD_REPORT_FUND_FLOWS,
            FdReportFundInfo.FD_REPORT_FUND_INFO,
            FdReportFundLoans.FD_REPORT_FUND_LOANS,
            FdSocialsecurityAccount.FD_SOCIALSECURITY_ACCOUNT,
            FdSocialsecurityCustomer.FD_SOCIALSECURITY_CUSTOMER,
            FdSocialsecurityFlows.FD_SOCIALSECURITY_FLOWS,
            FdSocialsecurityInsurances.FD_SOCIALSECURITY_INSURANCES,
            FinBalance.FIN_BALANCE,
            FinPopularityInOutLog.FIN_POPULARITY_IN_OUT_LOG,
            McCoupon.MC_COUPON,
            McCouponTemplate.MC_COUPON_TEMPLATE,
            McGift.MC_GIFT,
            McGiftTemplate.MC_GIFT_TEMPLATE,
            McMemberGift.MC_MEMBER_GIFT,
            MsgMessageLog.MSG_MESSAGE_LOG,
            MsgMessageTemplate.MSG_MESSAGE_TEMPLATE,
            MsgSendMessage.MSG_SEND_MESSAGE,
            MsgSmsCode.MSG_SMS_CODE,
            OauthAccessToken.OAUTH_ACCESS_TOKEN,
            OauthClientDetails.OAUTH_CLIENT_DETAILS,
            OauthCode.OAUTH_CODE,
            SchemaVersion.SCHEMA_VERSION,
            SysDict.SYS_DICT,
            SysLog.SYS_LOG,
            SysMenu.SYS_MENU,
            SysRole.SYS_ROLE,
            SysRoleMenu.SYS_ROLE_MENU,
            SysUser.SYS_USER,
            SysUserRole.SYS_USER_ROLE,
            TcContract.TC_CONTRACT,
            TcOrder.TC_ORDER,
            TcOrderComments.TC_ORDER_COMMENTS,
            TcOrderInterest.TC_ORDER_INTEREST,
            UcAuditions.UC_AUDITIONS,
            UcAuditionsBaby.UC_AUDITIONS_BABY,
            UcBankCard.UC_BANK_CARD,
            UcCourseShopCollect.UC_COURSE_SHOP_COLLECT,
            UcCourseTeachers.UC_COURSE_TEACHERS,
            UcFamilyIdcard.UC_FAMILY_IDCARD,
            UcFeedback.UC_FEEDBACK,
            UcMember.UC_MEMBER,
            UcMemberApprove.UC_MEMBER_APPROVE,
            UcMemberApproveOpenId.UC_MEMBER_APPROVE_OPEN_ID,
            UcMemberBabyInfo.UC_MEMBER_BABY_INFO,
            UcMemberCollege.UC_MEMBER_COLLEGE,
            UcMemberContact.UC_MEMBER_CONTACT,
            UcMemberCoupon.UC_MEMBER_COUPON,
            UcMemberDegree.UC_MEMBER_DEGREE,
            UcMemberEmergencyContact.UC_MEMBER_EMERGENCY_CONTACT,
            UcMemberFamilyInfo.UC_MEMBER_FAMILY_INFO,
            UcMemberInfo.UC_MEMBER_INFO,
            UcMemberLogin.UC_MEMBER_LOGIN,
            UcMemberRefer.UC_MEMBER_REFER,
            UcMemberRequestLoan.UC_MEMBER_REQUEST_LOAN,
            UcMemberWorkInfo.UC_MEMBER_WORK_INFO,
            UcOpenPay.UC_OPEN_PAY,
            UcOrganization.UC_ORGANIZATION,
            UcOrganQuality.UC_ORGAN_QUALITY,
            UcOrganShop.UC_ORGAN_SHOP,
            UcShopActivity.UC_SHOP_ACTIVITY,
            UcShopCourse.UC_SHOP_COURSE,
            UcShopQuality.UC_SHOP_QUALITY,
            UcShopTeacher.UC_SHOP_TEACHER,
            UcTag.UC_TAG,
            UcTagLink.UC_TAG_LINK,
            UcYeepayRequestId.UC_YEEPAY_REQUEST_ID,
            YeepayPayOrder.YEEPAY_PAY_ORDER,
            YeepayTransferOrder.YEEPAY_TRANSFER_ORDER,
            YeepayZgtTransfer.YEEPAY_ZGT_TRANSFER);
    }
}
