package priv.eli.Itachi.demo;

import org.apache.commons.lang3.StringUtils;

/**
 * @author Eli
 * @date 2020/9/3
 */
public enum TaxWhiteListEnums {

    TAX_NT_COMPANY_WHITE_LIST(1, "TAX_NT_COMPANY_WHITE_LIST"),//小规模机构白名单
    TAX_NT_TAX_NO_WHITE_LIST(2, "TAX_NT_TAX_NO_WHITE_LIST"),//小规模税号白名单
    TAX_NT_EXP_COMPANY_WHITE_LIST(3, "TAX_NT_EXP_COMPANY_WHITE_LIST"),
    TAX_COMPANY_WHITE_LIST_FOR_BASIC(4, "TAX_COMPANY_WHITE_LIST_FOR_BASIC"), //机构白明单针对Basic服务
    TAX_COMPANY_WHITE_LIST_FOR_TMC(5, "TAX_COMPANY_WHITE_LIST_FOR_TMC"), //机构白明单针对TMC服务
    TAX_NT_OT_COMPANY_WHITE_LIST(6, "TAX_NT_OT_COMPANY_WHITE_LIST"), //广东一般纳税人机构白名单key
    TAX_COMPANY_WHITE_LIST_FOR_SITCH_DATE(7, "TAX_COMPANY_WHITE_LIST_FOR_SITCH_DATE"), //机构白明单针对可切换所属期
    TAX_NT_OT_OUTPUT_IMPORT_WHITE_LIST(8, "TAX_NT_OT_OUTPUT_IMPORT_WHITE_LIST"), //广东一般纳税人销项提取白名单key
    TAX_NT_OT_MODIFY_WHITE_LIST(9, "TAX_NT_OT_MODIFY_WHITE_LIST"), //广东一般纳税人销项提取白名单key
    TAX_SHEN_ZHEN_BD_WHITE_LIST(10, "TAX_SHEN_ZHEN_BD_WHITE_LIST"), //深圳批量申报机构白名单
    TAX_SS_BATCH_DECLARATION_LIST(11, "TAX_SS_BATCH_DECLARATION_LIST"), //广东小规模批量申报机构白名单key
    TAX_NT_OT_INDEPENDENT_WHITE_LIST(12, "TAX_NT_OT_INDEPENDENT_WHITE_LIST"), //广东一般纳税人自主申报白名单
    TAX_NT_OT_UNCERTIFICATE_WHITE_LIST(13, "TAX_NT_OT_UNCERTIFICATE_WHITE_LIST"), //广东一般纳税人未认证发票白名单
    TAX_RISK_WHITE_LIST(14, "TAX_RISK_WHITE_LIST"), //风险预警白名单
    TAX_CREDIT_WHITE_LIST(15, "TAX_CREDIT_WHITE_LIST"), //信用查询白名单
    TAX_NT_SS_OUTPUT_IMPORT_WHITE_LIST(16, "TAX_NT_SS_OUTPUT_IMPORT_WHITE_LIST"),//广东小规模销项发票白名单key
    TAX_FINAL_SETTLEMENT_WHITE_LIST(17, "TAX_FINAL_SETTLEMENT_WHITE_LIST"), //汇算清缴白名单
    TAX_HSQJ_INTERNAL_COMPANY_LIST(18, "TAX_HSQJ_INTERNAL_COMPANY_LIST"),//风险守护内部机构名单
    TAX_XSB_WHITE_LIST(19, "TAX_XSB_WHITE_LIST"),//新申报白名单
    TAX_SN_XGM_WHITE_LIST(20, "TAX_SN_XGM_WHITE_LIST"),//陕西小规模白名单
    TAX_AREA_SSO_WHITE_LIST(21, "TAX_AREA_SSO_WHITE_LIST"),//单点登录免校验白名单
    TAX_INTEGRATION_GUARD_WHITE_LIST(22, "TAX_INTEGRATION_GUARD_WHITE_LIST"),//集成税险卫士白名单
    TAX_BATCH_PRINT_EXPORT_WHITE_LIST(23, "TAX_BATCH_PRINT_EXPORT_WHITE_LIST"),//批量导出打印
    AI_TAX_WHITE_LIST(24, "AI_TAX_WHITE_LIST"),//智能版税机构白名单
    AI_TAX_BLACK_LIST(25, "AI_TAX_BLACK_LIST"),//智能版税企业黑名单
    ZJ_WHITE_LIST(26, "ZJ_WHITE_LIST"),//浙江白名单
    APPOINTMENT_WHITE_LIST(27, "APPOINTMENT_WHITE_LIST"),//预约白名单
    //以下名单是接了运营平台的白名单系统
    TAX_NEW_BD_WHITE_LIST(28, "tax_new_bd_white_list"), //深圳批量申报机构白名单_白名单系统
    TAX_NEW_ZERO_WHITE_LIST(29, "tax_new_zero_white_list"), //零申报白名单_白名单系统
    TAX_NEW_APPOINTMENT_WHITE_LIST(30, "tax_new_appointment_white_list"),//预约白名单_白名单系统
    TAX_NEW_INTEGRATION_GUARD(31, "tax_new_integration_guard"),//集成税险卫士_白名单系统
    TAX_NEW_AI_TAX_WHITE_LIST(32, "tax_new_ai_tax_white_list"),//智能版税机构白名单_白名单系统
    TAX_NEW_SETTLEMENT_WHITE_LIST(33, "tax_new_settlement_white_list"),//汇算清缴机构白名单_白名单系统
    TAX_NEW_SETTLEMENT_AUTH_WHITE_LIST(34, "tax_new_settlement_auth_white_list"),//汇算清缴机构白名单_白名单系统
    TAX_FINANCIAL_FAST_WHITE_LIST(35, "tax_financial_fast_white_list"),//财务报表急速申报_白名单系统
    TAX_NEW_CREDIT_WHITE_LIST(15, "tax_new_credit_white_list"), //信用查询白名单
    TAX_BOSS_REPORT(15, "tax_boss_report"), //老板报告白名单
    TAX_VERIFY_CODE_FORWARD(37, "tax_verify_code_forward"), // 验证码转发白名单
    TAX_TASK_NEW_FRAMEWORK(38, "tax_task_new_framework"),//任务新框架
    TAX_CREDIT_PRE(39, "tax_credit_pre"), // 风控代账信用预评
    TAX_HB_DECLARE_WHITE(40, "tax_hb_declare_white_list"),//河北申报机构白名单
    TAX_IN_NEW_API_ROLL(41, "tax_gd_new_api"),//广东新API白名单
    TAX_IN_SIMPLE_FUNCTION_ROLL(42, "tax_simple_function"),//功能简化白名单
    TAX_HB_DECLARE_WHITE_LIST(43, "tax_hb_declare_white_list"),//河北申报授权白名单
    TAX_CUSTOMER_AUTH(44, "tax_customer_auth"),//企业安全中心认证
    TAX_SCREEN_SHOT(45, "tax_screen_shot"),//智能截图
    TAX_OT_NEW_CALCULATE(46, "tax_ot_new_calculate"),//一般纳税人新计税框架白名单
    MANAGE_CORPORATION_WHITE(48, "manage_corporation_white"),//代账大企业白名单，控制菜单屏蔽
    MANAGE_5_0_WHITE(49, "manage_5_0_White"),//代账5.0白名单，传给前端用来判断新旧风格的代账
    NEW_BATCH_DECLARE(50, "tax_newBatchDeclare"),//新批量申报白名单
    NEW_PARAM_SETTING(51,"tax_newParamSetting"),//新报税设置白名单
    COMBINE_DECLARE(52, "tax_combine_declare"),//组合申报白名单
    ;

    /**
     * 主键
     */
    private int id;

    /**
     * nosql代码
     */
    private String code;

    TaxWhiteListEnums(int id, String code) {
        this.id = id;
        this.code = code;
    }

    public static TaxWhiteListEnums getByCode(String code) {
        if (StringUtils.isBlank(code)) {
            return null;
        }
        for (TaxWhiteListEnums tempEnum : values()) {
            if (StringUtils.equals(tempEnum.getCode(), code)) {
                return tempEnum;
            }
        }
        return null;

    }

    public static boolean isNewWhiteList(String functionKey) {
        TaxWhiteListEnums taxWhiteListEnums = getByCode(functionKey);
        if (taxWhiteListEnums == TAX_INTEGRATION_GUARD_WHITE_LIST
                || taxWhiteListEnums == ZJ_WHITE_LIST
                || taxWhiteListEnums == APPOINTMENT_WHITE_LIST
                || taxWhiteListEnums == TAX_SHEN_ZHEN_BD_WHITE_LIST) {
            return true;
        }
        return false;
    }

    public static TaxWhiteListEnums getNewCode(String functionKey) {
        TaxWhiteListEnums taxWhiteListEnums = getByCode(functionKey);
        if (taxWhiteListEnums == TAX_INTEGRATION_GUARD_WHITE_LIST) {
            return TAX_NEW_INTEGRATION_GUARD;
        }
        if (taxWhiteListEnums == ZJ_WHITE_LIST) {
            return TAX_NEW_ZERO_WHITE_LIST;
        }
        if (taxWhiteListEnums == APPOINTMENT_WHITE_LIST) {
            return TAX_NEW_APPOINTMENT_WHITE_LIST;
        }
        if (taxWhiteListEnums == TAX_SHEN_ZHEN_BD_WHITE_LIST) {
            return TAX_NEW_BD_WHITE_LIST;
        }
        return taxWhiteListEnums;
    }

    public int getId() {
        return id;
    }


    public String getCode() {
        return code;
    }

}