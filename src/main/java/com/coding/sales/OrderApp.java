package com.coding.sales;

import com.coding.sales.Entity.Commons;
import com.coding.sales.Entity.Member;
import com.coding.sales.Entity.Product;
import com.coding.sales.input.OrderCommand;
import com.coding.sales.input.OrderItemCommand;
import com.coding.sales.output.OrderRepresentation;
import com.coding.sales.strategy.CashContext;
import com.coding.sales.strategy.DiscountCash;
import com.coding.sales.strategy.FullReduceCash;
import com.sun.org.apache.regexp.internal.REUtil;
import com.sun.org.apache.xpath.internal.functions.FuncUnparsedEntityURI;
import jdk.nashorn.internal.objects.PrototypeObject;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 销售系统的主入口
 * 用于打印销售凭证
 */
public class OrderApp {

    public static void main(String[] args) {
        if (args.length != 2) {
            throw new IllegalArgumentException("参数不正确。参数1为销售订单的JSON文件名，参数2为待打印销售凭证的文本文件名.");
        }

        String jsonFileName = args[0];
        String txtFileName = args[1];

        String orderCommand = FileUtils.readFromFile(jsonFileName);
        OrderApp app = new OrderApp();
        String result = app.checkout(orderCommand);
        FileUtils.writeToFile(result, txtFileName);
    }

    public String checkout(String orderCommand) {
        OrderCommand command = OrderCommand.from(orderCommand);
        OrderRepresentation result = checkout(command);
        
        return result.toString();
    }

    OrderRepresentation checkout(OrderCommand command) {
        OrderRepresentation result = null;


        //TODO: 请完成需求指定的功能

        //会员id
        String memberId = command.getMemberId();
        // 根据会员Id获取会员信息
        Member member = Commons.getMember(memberId);
        String level = member.getLevel();
        //积分系数
        String coefficient = Commons.getCoefficient(level);
        //产品信息
        List<OrderItemCommand> items = command.getItems();

        for (OrderItemCommand item : items) {
            //获取商品信息
            Product product = Commons.getProduct(item.getProduct());
            // 计算满减金额
            int amount = item.getAmount().intValue();
            double subTotal = product.getPrice() * amount;

            String fullReduction = product.getFullReduction();
            if(!"".equals(fullReduction)){
                //判断是否可以参加满3
                String[] split = fullReduction.split(",");

            }




            //判断商品是否有活动信息 如果有活动的信息，计算每种活动个折扣金额，取折扣最大的
            // 计算折扣金额
            double discountCash = getDiscountCash(product, subTotal);

            //计算满减金额

            getFullReduceCash(product,subTotal);


        }



        return result;
    }

    private void getFullReduceCash(Product product, double subTotal) {
        String[] split = product.getFullReduction().split(",");


    }

    private double getDiscountCash(Product product, double subTotal) {

        String discountCard = product.getDiscountCard();
        CashContext cashContext = new CashContext(discountCard);
        double discountCash = cashContext.getResult(subTotal);
        return discountCash ;

    }


}
