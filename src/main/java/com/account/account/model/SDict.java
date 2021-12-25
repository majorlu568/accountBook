package com.account.account.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

/**
 * @Descrption:数据字典
 * @author major
 * @date 2021/12/22
 */


@Data
@NoArgsConstructor
@AllArgsConstructor
@ApiModel("数据字典")
public class SDict {
    /**
     * 字典编码，唯一
     */
    @NonNull
    @ApiModelProperty("字典编码")
    private String code;
    /**
     * 字典名称
     */
    @ApiModelProperty("字典名称")
    private String name;
    /**
     * 排序字段
     */
    @ApiModelProperty("排序")
    private int orderNumber;
}
