package com.voucher.demo.controller.voucher;

import com.shop.admin.core.service.service.VoucherTemplateService;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author cch
 * @date 2024/5/20 22:13
 */
@Validated
@RestController
@RequestMapping("/network/voucher/template")
@RequiredArgsConstructor
public class voucherTemplateController {

    @Resource
    private  VoucherTemplateService voucherTemplateService;


    @PostMapping("/add")
    public void add() {
    voucherTemplateService.add();
    }



}
