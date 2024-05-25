package com.shop.admin.common.dal.domain.voucher;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import lombok.Builder;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.Date;

/**
 * @author cch
 * @date 2024/5/20 22:37
 */
@Data
@Builder
@Accessors(chain = true)
@TableName(value = "voucher_template")
public class VoucherTemplateDO {

    /**
     * template id
     */
    @TableId(type = IdType.AUTO)
    private Integer templateId;

    /**
     * Coupon Name - Bilingual
     */
    // @TableField(typeHandler = JacksonTypeHandler.class)
    private JSONObject voucherName;

    /**
     * Coupon Child Types (1: Full Reduction Coupon; 2: Discount Coupon)
     */
    private Integer voucherSubType;

    /**
     * Full reduction amount or discount rate
     */
    private Long amountReduce;

    /**
     * The maximum discount amount when the coupon is a discount coupon
     */
    private Long maxDiscount;

    /**
     * Voucher Sub-title
     */
    // @TableField(typeHandler = JacksonTypeHandler.class)
    private JSONObject voucherNote;

    /**
     * Card Voucher Button Description - Bilingual
     */
    // @TableField(typeHandler = JacksonTypeHandler.class)
    private JSONObject voucherButton;

    /**
     * Voucher T&C
     */
    // @TableField(typeHandler = JacksonTypeHandler.class)
    private JSONObject terms;

    /**
     * Card Details - Bilingual
     */
    // @TableField(typeHandler = JacksonTypeHandler.class)
    private JSONObject voucherDetail;

    /**
     * Display Thumbnail Asset, a picture
     */
    private String thumbImage;

    /**
     * Display banner Asset, multiple images
     */
    // @TableField(typeHandler = JacksonTypeHandler.class)
    private JSONArray bannerImages;

    /**
     * Identify three major types of coupons - 1.event 2.store voucher 3.voucher reward
     */
    private String voucherSource;

    /**
     * Three types of voucher rewards
     */
    private String issueChannel;

    /**
     * Whether to publish (0: not published; 1: published)
     */
    private Integer released;


    /**
     * Logical deletion (0, not deleted; 1, deleted)
     */
    private Integer deleted = 0;

    /**
     * Creation time
     */
    private Date createTime;

    /**
     * creator
     */
    private String createBy;

    /**
     * update time
     */
    private Date updateTime;

    /**
     * Updater
     */
    private String updateBy;



}

