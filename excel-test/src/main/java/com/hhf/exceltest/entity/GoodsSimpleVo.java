package com.hhf.exceltest.entity;

import com.alibaba.excel.annotation.ExcelProperty;

import java.math.BigDecimal;

/**
 * @author 小非肥
 * @version 1.0
 * @date 2022/5/19 8:45
 */
public class GoodsSimpleVo {
    /**
     * 商品id
     */
    @ExcelProperty("ID")
    private Long id;

    /**
     * 商品名称
     */
    @ExcelProperty("商品名称")
    private String goodsName;

    /**
     * 品牌
     */
    @ExcelProperty("品牌")
    private String brand;

    /**
     * 单位
     */
    @ExcelProperty("单位")
    private String unit;

    /**
     * 价格
     */
    @ExcelProperty("价格")
    private BigDecimal price;

    /**
     * 是否包邮
     */
    @ExcelProperty("是否包邮")
    private String freeShipping;

    /**
     * 其他信息
     */
    private String other;

    public GoodsSimpleVo() {

    }

    public GoodsSimpleVo(Long id, String goodsName, String brand, String unit, BigDecimal price, String freeShipping, String other) {
        this.id = id;
        this.goodsName = goodsName;
        this.brand = brand;
        this.unit = unit;
        this.price = price;
        this.freeShipping = freeShipping;
        this.other = other;
    }
}

