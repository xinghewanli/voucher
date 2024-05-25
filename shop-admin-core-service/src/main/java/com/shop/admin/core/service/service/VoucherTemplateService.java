package com.shop.admin.core.service.service;

import com.baomidou.mybatisplus.service.IService;
import com.shop.admin.common.dal.domain.voucher.VoucherTemplateDO;
import com.shop.admin.common.dal.mapper.voucher.VoucherTemplateMapper;
import org.springframework.stereotype.Service;


/**
 * @author cch
 * @date 2024/5/20 23:43
 */

@Service
public interface VoucherTemplateService extends IService<VoucherTemplateDO> {
    void add();
}
