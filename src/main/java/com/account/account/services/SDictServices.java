package com.account.account.services;

import com.account.account.model.SDict;

import java.util.List;

public interface SDictServices {
    List<SDict> getSDictList();

    int addSDict(SDict sDict);

    int updSDict(SDict sDict);

    int delSDict(String id);

    int delSDictBatch(String[] ids);

    SDict getDictByCode(String code);
}
