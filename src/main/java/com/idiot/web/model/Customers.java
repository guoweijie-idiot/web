package com.idiot.web.model;

import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 顾客信息表
 * </p>
 *
 * @author guoweijie
 * @since 2021-01-16 下午10:20
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("Customers")
public class Customers implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 唯一的顾客ID
     */
    private String customId;

    /**
     * 顾客名
     */
    private String customName;

    /**
     * 顾客的地址
     */
    private String customAddress;

    /**
     * 顾客所在城市
     */
    private String customCity;

    /**
     * 顾客所在州
     */
    private String customState;

    /**
     * 顾客地址邮政编码
     */
    private String customZip;

    /**
     * 顾客所在国家
     */
    private String customCountry;

    /**
     * 顾客的联系名
     */
    private String customContact;

    /**
     * 顾客的电子邮件地址
     */
    private String customEmail;


}
