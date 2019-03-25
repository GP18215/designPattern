package com.gupaoedu.pattren.proxy.dbroute;

import com.gupaoedu.pattren.proxy.dbroute.proxy.OrderServiceDynamicProxy;
import com.gupaoedu.pattren.proxy.dbroute.proxy.OrderServiceStaticProxy;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DbRouteProxyTest {
    public static void main(String[] args) {
        try {
        Order order = new Order();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");

        Date date = sdf.parse("2016/07/01");
            System.out.println(date.getTime());
        order.setCreateTime(date.getTime());

        //order.setCreateTime(new Date().getTime());

        IOrderService orderService = new OrderServiceStaticProxy(new OrderService());
        IOrderService os = (IOrderService) new OrderServiceDynamicProxy().getInstance(new OrderService());

        //orderService.createOrder(order);
        os.createOrder(order);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
