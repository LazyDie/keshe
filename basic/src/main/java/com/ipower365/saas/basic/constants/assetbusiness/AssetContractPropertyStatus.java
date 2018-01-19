package com.ipower365.saas.basic.constants.assetbusiness;

import java.util.ArrayList;
import java.util.List;

/**
 * 电费运营合同物业关联状态
 * @author anker
 */
public enum AssetContractPropertyStatus {
    // 1未关联；2已关联待交割；3已交割；4取消关联
    INIT(1), RELATED(2), DELIVERD(3), CANCEL_RELATION(4);

    AssetContractPropertyStatus(Integer code) {
        this.code = code;
    }

    private final Integer code;

    private static AssetContractPropertyStatus[] relatedStatus = {RELATED, DELIVERD};

    public Integer getCode() {
        return code;
    }

    public static List<Integer> getRelatedStatusValue() {
        List<Integer> results = new ArrayList<>();
        for (AssetContractPropertyStatus status : relatedStatus) {
            results.add(status.code.intValue());
        }
        return results;
    }

}
