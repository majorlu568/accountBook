package com.account.account.controller;

import com.account.account.common.Consts;
import com.account.account.common.Result;
import com.account.account.model.SDict;
import com.account.account.services.SDictServices;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
    @PostMapping("/sDictList")
    public Result SDictList(){
        List<SDict> dictList = sDictServices.getSDictList();
        return new Result(Consts.SUCCESS, Consts.SUCCESS, dictList);
    }

    /**
     * @param sDict
     * @return 添加后的id值
     * @Description 添加一个数据字典
     */
    @PostMapping("/addSDict")
    public Result addSDict(SDict sDict){
        int addAccount = sDictServices.addSDict(sDict);
        return new Result(Consts.SUCCESS, Consts.SUCCESS, addAccount);
    }

    /**
     * @param sDict
     * @return 更新的结果
     * @Description 更新数据字典信息
     */
    @PostMapping("/updSDict")
    public Result updSDict(SDict sDict){
        int updSDict = sDictServices.updSDict(sDict);
        return new Result(Consts.SUCCESS, Consts.SUCCESS, updSDict);
    }

    /**
     * @param id 数据字典的id值
     * @return 删除的结果
     * @Description 删除单条数据字典
     */
    @PostMapping("/delSDict")
    public Result delSDict(String id){
        int delSDict = sDictServices.delSDict(id);
        return new Result(Consts.SUCCESS, Consts.SUCCESS, delSDict);
    }

    /**
     * @param ids 用逗号隔开的id们
     * @return 批量删除的结果
     * @Description 批量删除数据字典
     */
    @PostMapping("/delSDictBatch")
    public Result delSDictBatch(String ids){
        int delSDictBatch = sDictServices.delSDictBatch(ids);
        return new Result(Consts.SUCCESS, Consts.SUCCESS, delSDictBatch);
    }
}
