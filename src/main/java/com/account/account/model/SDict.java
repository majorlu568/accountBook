package com.account.account.model;

import lombok.Data;
import lombok.NonNull;

/**
 * @Descrption:数据字典
 * @author major
 * @date 2021/12/22
 */


@Data
public class SDict {
    /**
     * 字典编码，唯一
     */
    @NonNull
    private String code;
    /**
     * 字典名称
     */
    private String name;
    /**
     * 排序字段
     */
    private int order;
}
