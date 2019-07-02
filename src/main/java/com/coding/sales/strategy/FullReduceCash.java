package com.coding.sales.strategy;

/**
 * @author liyunze
 * @date 2019/7/2 20:00
 * @copyright Copyright © 2019 广电运通 All rights reserved.
 */
public class FullReduceCash implements SuperCash {
    private float upcash;
    private float downcash;

    public FullReduceCash(float upcash,float downcash){
        this.upcash=upcash;
        this.downcash=downcash;
    }

    @Override
    public double getcash(double cash) {
        double result=cash;
        if(cash>=upcash){
            result=cash-(Math.floor(cash/upcash)*downcash);
        }
        return result;
    }

}
