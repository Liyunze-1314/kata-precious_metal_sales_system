package com.coding.sales.strategy;

/**
 * @author liyunze
 * @date 2019/7/2 19:57
 * @copyright Copyright © 2019 广电运通 All rights reserved.
 */
public class NormalCash implements SuperCash {
    @Override
    public double getcash(double cash) {
        return cash;

    }
}
