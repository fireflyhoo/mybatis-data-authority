package cn.yayatao.safety.authority.model;

public enum  RowRuleType {
    /**
     * 某一列匹配什么值的表达式  a = b
     */
    EXP_RULE("exp","表达式规则"),

    /***
     * 逻辑表达式  r1  and  r2
     */
    LOGIC_RULE("logic","逻辑规则");

    /**
     * 行规则类型码
     */
    private  String code;

    /**
     * 行规则类型说明
     */
    private  String note;

    RowRuleType(String code, String note) {
        this.code = code;
        this.note = note;
    }
}
