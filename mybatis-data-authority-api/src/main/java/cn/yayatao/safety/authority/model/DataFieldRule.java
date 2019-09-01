package cn.yayatao.safety.authority.model;

import java.lang.reflect.Field;

public interface DataFieldRule {
    /**
     * 获取数据列明
     * @return
     */
    String getField();


    /**
     * 该列是否展示 如果某个人有相同的 列的权限, 一个是展示 一个是不展示,那么该列展示
     * @return
     */
    boolean isShow();
}
