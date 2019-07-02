package com.coding.sales.Entity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @author liyunze
 * @date 2019/7/2 17:18
 * @copyright Copyright © 2019 广电运通 All rights reserved.
 */
public class Commons {
    public static HashMap<String ,Member> memberHashMap = new HashMap<String, Member>();
    public static HashMap<String ,String> pointCoefficientHashMap = new HashMap<String, String>();

    public static HashMap<String ,Member> initMembers(){
        Member member1 = new Member("马丁", "普卡", "6236609999", 9860);
        Member member2 = new Member("王立", "金卡", "6630009999", 48860);
        Member member3 = new Member("李想","白金卡","8230009999",98860);
        Member member4 = new Member("张三","钻石卡","9230009999",198860);
        memberHashMap.put("6236609999",member1);
        memberHashMap.put("6630009999",member2);
        memberHashMap.put("8230009999",member3);
        memberHashMap.put("9230009999",member4);
        return memberHashMap;
    }

    public static Member getMember(String memberId) {
        return memberHashMap.get(memberId);
    }
    public static HashMap<String ,String> IntegralCoefficient(){
        pointCoefficientHashMap.put("普卡","1");
        pointCoefficientHashMap.put("金卡","1.5");
        pointCoefficientHashMap.put("白金卡","1.8");
        pointCoefficientHashMap.put("钻石卡","2");
        return pointCoefficientHashMap;
    }

    public static String getCoefficient(String level) {
        return pointCoefficientHashMap.get(level);
    }
}
