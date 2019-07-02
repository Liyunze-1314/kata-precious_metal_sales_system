package com.coding.sales.strategy;

/**
 * @author liyunze
 * @date 2019/7/2 19:58
 * @copyright Copyright © 2019 广电运通 All rights reserved.
 */
public class DiscountCash implements SuperCash {


        private float moneyRebate;//打折的折扣

	    public DiscountCash(float moneyRebate){
            this.moneyRebate=moneyRebate;
        }

        @Override
        public double getcash(double cash) {
            return moneyRebate * cash;
        }

    }
