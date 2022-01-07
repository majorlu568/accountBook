package com.account.account.controller;

import com.account.account.common.Consts;
import com.account.account.common.Result;
import com.account.account.model.SDict;
import com.account.account.services.SDictServices;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Description 数据字典相关操作
 * @author major
 */
@Slf4j
@RestController
@RequestMapping(value = "//sDict")
@Api(value = "字典接口", tags = "数据字典相关的接口")
public class SDictController {

    @Autowired
    private SDictServices sDictServices;

    /**
     * @param
     * @return 所有数据字典列表
     * @Description 查询所有数据字典列表
     */
    @GetMapping(value = "/getDictList")
    @ApiOperation(value = "查询数据字典列表")
    public List<SDict> getDictList(){
        List<SDict> dictList = sDictServices.getSDictList();
        return dictList;
    }

    /**
     *
     * @param code 字典编码
     * @return 一条数据字典
     * @Description 根据编码获取数据字典信息
     */
    @PostMapping("/getDictByCode")
    @ApiOperation(value = "根据code获取数据字典")
    public SDict getDictByCode(String code){
        SDict sDict = sDictServices.getDictByCode(code);
        return sDict;
    }

    /**
     * @param sDict
     * @return 添加后的id值
     * @Description 添加一个数据字典
     */
    @PostMapping("/addSDict")
    @ApiOperation(value = "添加数据字典")
    public int addSDict(SDict sDict){
        int addAccount = sDictServices.addSDict(sDict);
        return addAccount;
    }

    /**
     * @param sDict
     * @return 更新的结果
     * @Description 更新数据字典信息
     */
    @PutMapping("/updSDict")
    @ApiOperation(value = "更新数据字典")
    public int updSDict(SDict sDict){
        int updSDict = sDictServices.updSDict(sDict);
        return updSDict;
    }

    /**
     * @param id 数据字典的id值
     * @return 删除的结果
     * @Description 删除单条数据字典
     */
    @DeleteMapping("/delSDict")
    @ApiOperation(value = "删除数据字典")
    public int delSDict(String id){
        int delSDict = sDictServices.delSDict(id);
        return delSDict;
    }

    /**
     * @param ids 用逗号隔开的id们
     * @return 批量删除的结果
     * @Description 批量删除数据字典
     */
    @DeleteMapping("/delSDictBatch")
    @ApiOperation(value = "批量删除数据字典")
    public int delSDictBatch(String[] ids){
        int delSDictBatch = sDictServices.delSDictBatch(ids);
        return delSDictBatch;
    }
}
