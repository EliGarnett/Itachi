package priv.eli.Itachi.demo;

import com.alibaba.fastjson.JSON;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author Eli
 * @date 2020/9/3
 */
public class Demo {


    private static final List<String> MENUS_WHITE_CODE = Arrays.asList(
            TaxWhiteListEnums.TAX_NEW_BD_WHITE_LIST.getCode(),
            TaxWhiteListEnums.TAX_NEW_APPOINTMENT_WHITE_LIST.getCode(),
            TaxWhiteListEnums.TAX_NEW_SETTLEMENT_WHITE_LIST.getCode(),
            TaxWhiteListEnums.TAX_FINANCIAL_FAST_WHITE_LIST.getCode(),
            TaxWhiteListEnums.TAX_NEW_ZERO_WHITE_LIST.getCode(),
            TaxWhiteListEnums.MANAGE_5_0_WHITE.getCode(),
            TaxWhiteListEnums.TAX_NEW_CREDIT_WHITE_LIST.getCode(),
            TaxWhiteListEnums.TAX_NEW_INTEGRATION_GUARD.getCode(),
            TaxWhiteListEnums.TAX_BOSS_REPORT.getCode(),
            TaxWhiteListEnums.TAX_CREDIT_PRE.getCode(),
            TaxWhiteListEnums.MANAGE_CORPORATION_WHITE.getCode()
    );

    private static final List<String> FUNC_WHITE_CODE = Arrays.asList(
            TaxWhiteListEnums.TAX_NEW_APPOINTMENT_WHITE_LIST.getCode(),
            TaxWhiteListEnums.TAX_NEW_SETTLEMENT_AUTH_WHITE_LIST.getCode(),
            TaxWhiteListEnums.TAX_NEW_AI_TAX_WHITE_LIST.getCode(),
            TaxWhiteListEnums.TAX_VERIFY_CODE_FORWARD.getCode(),
            TaxWhiteListEnums.TAX_SCREEN_SHOT.getCode(),
            TaxWhiteListEnums.MANAGE_5_0_WHITE.getCode(),
            TaxWhiteListEnums.MANAGE_CORPORATION_WHITE.getCode(),
            TaxWhiteListEnums.NEW_BATCH_DECLARE.getCode(),
            TaxWhiteListEnums.NEW_PARAM_SETTING.getCode()
    );

    public static void main(String[] args) {
        Set<String> codeSet = new HashSet<>();
        codeSet.addAll(MENUS_WHITE_CODE);
        codeSet.addAll(FUNC_WHITE_CODE);
        System.out.println(JSON.toJSONString(codeSet));
    }


}
