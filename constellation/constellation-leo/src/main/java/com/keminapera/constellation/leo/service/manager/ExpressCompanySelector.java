package com.keminapera.constellation.leo.service.manager;

import com.keminapera.constellation.leo.service.manager.kusaidi100.IKuaiDi100;
import com.keminapera.constellation.leo.service.manager.zhongtong.IZhongTongExpressCompany;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 快递公司选择器
 *
 * @author KeminaPera
 * @date 2019/10/3 10:56
 */
@Component
public class ExpressCompanySelector {
    @Autowired
    private IZhongTongExpressCompany zhongTongExpressCompany;
    @Autowired
    private IKuaiDi100 kuaiDi100;

    public IExpressCompany select(int company) {
        switch (company) {
            case 4:
                return zhongTongExpressCompany;
            default:
                return kuaiDi100;
        }
    }
}
