package com.account.account;

import com.account.account.model.SDict;
import com.account.account.services.SDictServices;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SDictTest {
    @Autowired
    private SDictServices sDictServices;

    @Test
    public void SDictList(){
        List<SDict> dictList = sDictServices.getSDictList();
        dictList.stream().forEach(sDict -> System.out.println(sDict.toString()));
    }

    @Test
    public void getDictByCode(){
        SDict sDict = sDictServices.getDictByCode("channel");
        System.out.println(sDict.toString());
    }

    @Test
    public void addSDict(){
        SDict sDict = new SDict();
        sDict.setCode("test3");
        sDict.setName("测试数据3");
        sDict.setOrderNumber(5);

        int a = sDictServices.addSDict(sDict);
        System.out.println("插入" + a + "条数据");
    }


    @Test
    public void updSDict(){
        SDict sDict = new SDict("test", "测试数据1", 3);
        sDictServices.updSDict(sDict);
        System.out.println(sDictServices.getDictByCode("test"));
    }

    @Test
    public void delSDict(){
        int res = sDictServices.delSDict("test");
        System.out.println("删除了" + res + "条数据");
    }

    @Test
    public void delSDictBatch(){
        String[] ids = {"test2","test3"};
        int res = sDictServices.delSDictBatch(ids);
        System.out.println("删除了" + res + "条数据");
    }
}
