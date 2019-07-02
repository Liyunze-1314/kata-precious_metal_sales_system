package com.coding.sales.Entity;

import java.lang.reflect.Proxy;
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
    public static HashMap<String ,Product> productInfoHashMap = new HashMap<String, Product>();

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


    public static HashMap<String ,Product> initProductInfo(){
        Product p1 =  new Product("世园会五十国钱币册","001001","册",998.00,"","");
        Product p2 =  new Product("2019北京世园会纪念银章大全40g","001002","盒",1380.00,"0.9","");
        Product p3 =  new Product("招财进宝","003001","条",1580.0,"0.95","");
        Product p4 =  new Product("水晶之恋","003002","条",980.00,"","第3件半价，满3送1");
        Product p5 =  new Product("中国经典钱币套装","002002","套",998.00,"","每满2000减30，每满1000减10");
        Product p6 =  new Product("守扩之羽比翼双飞4.8g","002001","条",1080.00,"0.95","第3件半价，满3送1");
        Product p7 =  new Product("中国银象棋12g","002003","套",698.00,"0.9","每满3000元减350, 每满2000减30，每满1000减10");
        productInfoHashMap.put("001001",p1);
        productInfoHashMap.put("001002",p2);
        productInfoHashMap.put("003001",p3);
        productInfoHashMap.put("003002",p4);
        productInfoHashMap.put("002002",p5);
        productInfoHashMap.put("002001",p6);
        productInfoHashMap.put("002003",p7);
        return productInfoHashMap;
    }


    public static Product getProduct(String number) {
        return productInfoHashMap.get(number);
    }
}
