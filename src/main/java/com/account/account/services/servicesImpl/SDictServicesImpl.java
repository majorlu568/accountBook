package com.account.account.services.servicesImpl;

import com.account.account.dao.SDictMapper;
import com.account.account.model.SDict;
import com.account.account.services.SDictServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SDictServicesImpl implements SDictServices {

    @Autowired
    private SDictMapper sDictMapper;

    @Override
    public List<SDict> getSDictList() {
        return sDictMapper.getSDictList();
    }

    @Override
    public int addSDict(SDict sDict) {
        return sDictMapper.addSDict(sDict);
    }

    @Override
    public int updSDict(SDict sDict) {
        return sDictMapper.updSDict(sDict);
    }

    @Override
    public int delSDict(String id) {
        return sDictMapper.delSDict(id);
    }

    @Override
    public int delSDictBatch(String[] ids) {
        return sDictMapper.delSDictBatch(ids);
    }
}
