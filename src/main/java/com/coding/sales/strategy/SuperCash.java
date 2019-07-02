package com.coding.sales.strategy;

import java.math.BigDecimal;

/**
 * @author liyunze
 * @date 2019/7/2 19:56
 * @copyright Copyright © 2019 广电运通 All rights reserved.
 */
public interface SuperCash {

    //得到算过后的结账金额
    public double getcash(double cash);
}
