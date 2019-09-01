package cn.yayatao.safety.authority.model;


import java.util.List;

/***
 * 权限令牌
 */
public class DataPrivilegeAccessToken {


    /***
     * 数据权限类型
     */
    private  DataPrivilegeType type;

    /***
     * 数据权限
     */
    List<DataPrivilege> privilege;

}
