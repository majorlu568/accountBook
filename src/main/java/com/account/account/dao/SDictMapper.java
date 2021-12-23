package com.account.account.dao;

import com.account.account.model.SDict;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface SDictMapper {
    public List<SDict> getSDictList();

    int addSDict(SDict sDict);

    int updSDict(SDict sDict);

    int delSDict(String id);

    int delSDictBatch(String ids);
}
