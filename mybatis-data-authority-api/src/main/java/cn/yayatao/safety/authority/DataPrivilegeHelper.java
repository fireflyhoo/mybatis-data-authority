package cn.yayatao.safety.authority;

import cn.yayatao.safety.authority.model.DataPrivilegeAccessToken;

/***
 * 数据权限的操作API
 */
public class DataPrivilegeHelper {
    /**
     *
     */
    final static ThreadLocal<DataPrivilegeAccessToken> DATA_PRIVILEGE_ACCESS_TOKEN_THREAD_LOCAL = new ThreadLocal<>();


    /**
     * 设置数据权Token
     * @param accessToken
     */
    public static void setDataPrivilegeAccessToken(DataPrivilegeAccessToken accessToken) {
        DATA_PRIVILEGE_ACCESS_TOKEN_THREAD_LOCAL.set(accessToken);
    }

    /**
     * 获取数据权限Token
     * @return
     */
    public static DataPrivilegeAccessToken getDataPrivilegeAccessToken() {
        return DATA_PRIVILEGE_ACCESS_TOKEN_THREAD_LOCAL.get();
    }

    /***
     * 清空权限上下文信息
     */
    public static void clear(){
        DATA_PRIVILEGE_ACCESS_TOKEN_THREAD_LOCAL.remove();
    }

}
