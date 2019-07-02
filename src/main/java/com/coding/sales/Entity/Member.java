package com.coding.sales.Entity;

import java.util.HashMap;

/**
 * 姓名,等级,卡号,积分
 马丁,普卡,6236609999,9860
 王立,金卡,6630009999,48860
 李想,白金卡,8230009999,98860
 张三,钻石卡,9230009999,198860
 */

/**
 * @author liyunze
 * @date 2019/7/2 15:57
 * @copyright Copyright © 2019 广电运通 All rights reserved.
 */
public class Member {
    private String name ;
    private String level;
    private String cardNo;
    private Integer points;

    public Member(String name, String level, String cardNo, Integer points) {
        this.name = name;
        this.level = level;
        this.cardNo = cardNo;
        this.points = points;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLevel() {

        if(this.points >= 0 && this.points < 10000){
            return "普卡";
        }else if(this.points >= 10000 && this.points < 50000){
            return "金卡";
        }else if(this.points >= 50000 && this.points < 100000){
            return "白金卡";
        }else if(this.points >= 10000){
            return "钻石卡";
        }else{
            return "会员点数有误！";
        }

    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public Integer getPoints() {
        return points;
    }

    public void setPoints(Integer points) {
        this.points = points;
    }

}
