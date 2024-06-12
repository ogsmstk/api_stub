package com.myapp.api.enums;

import lombok.Getter;

/**
 * スタブ用のEnum
 * 米印列挙子のvalueは使用するJsonファイルと同じにすること
 */
@Getter
public enum StubType {
    SERVICE_LIST("1","serviceList","WEBサイト一覧");

    private final String code;
    private final String value;
    private final String label;

    private StubType(String code, String value, String label) {   //コンストラクタはprivateで宣言
        this.code = code;
        this.value = value;
        this.label = label;
    }

    /**
     * 指定されたcodeに対応したvalueを返す
     *
     * @param code
     * @return
     */
    public static String getValueByCode(String code) {
        for (StubType type: StubType.values()) {
            if (type.getCode().equals(code)) {
                return type.getValue();
            }
        }
        return null;
    }
}