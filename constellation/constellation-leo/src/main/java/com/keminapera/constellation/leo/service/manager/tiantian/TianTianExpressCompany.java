package com.keminapera.constellation.leo.service.manager.tiantian;

import com.keminapera.constellation.leo.entity.LogisticsVo;
import com.keminapera.constellation.leo.pojo.LogisticsInfo;
import org.jetbrains.annotations.NotNull;

import java.util.List;

/**
 * 天天快递公司接口的具体实现类
 *
 * @author KeminaPera
 * @date 2019/10/2 8:49
 */
public class TianTianExpressCompany implements ITianTianExpressCompany {
    @Override
    public LogisticsVo queryLogistics(@NotNull String number) {
        return null;
    }

    @Override
    public List<LogisticsInfo> queryLogisticsInfoList(@NotNull String number) {
        return null;
    }
}
