package com.shop.admin.core.service.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.shop.admin.common.dal.domain.voucher.VoucherTemplateDO;
import com.shop.admin.common.dal.mapper.voucher.VoucherTemplateMapper;
import com.shop.admin.core.service.service.VoucherTemplateService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

/**
 * @author cch
 * @date 2024/5/20 23:40
 */
@Slf4j
@RequiredArgsConstructor
public class VoucherTemplateImpl extends ServiceImpl<VoucherTemplateMapper, VoucherTemplateDO> implements VoucherTemplateService {


    private final VoucherTemplateMapper voucherTemplateMapper;

    @Override
    public void add() {

        VoucherTemplateDO voucherTemplateDO = VoucherTemplateDO.builder()
                .voucherSubType(1)
                .amountReduce(20L)
                .maxDiscount(30L)
                .build();

        voucherTemplateMapper.insert(voucherTemplateDO);
    }
}
