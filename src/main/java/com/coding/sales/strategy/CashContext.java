package com.coding.sales.strategy;

import java.math.BigDecimal;

/**
 * @author liyunze
 * @date 2019/7/2 20:02
 * @copyright Copyright © 2019 广电运通 All rights reserved.
 */
public class CashContext {
    private SuperCash supercash;
    public CashContext(String type){

        if("".equals(type)){
            supercash=new NormalCash();
        }else {
            supercash = new DiscountCash(Float.parseFloat(type));
        }
    }
    public double getResult(double cash){
        return supercash.getcash(cash);
    }

}
