package cn.yayatao.safety.authority.model;

import java.util.List;

/***
 * 数据权限项(最小的授权单位)
 */
public class DataPrivilege {

    /**
     * 权限项的ID
     */
    private int id;

    /***
     * 权重 如果某个人拥有某个数据权限的多个项,将权限高的生效 //TODO 此处需要考虑是否 求两个权限的并集
     */
    private int weight;

    /**
     * 数据权限项名称
     */
    private String name;

    /***
     * 权限项的说明
     */
    private String note;

    /***
     * 行过滤规则
     */
    private DataRowRule rowRule;

    /**
     * 列过滤规则
     */
    private List<DataFieldRule> fieldRules;
}
