package com.gupaoedu.pattren.proxy.dbroute.proxy;

import com.gupaoedu.pattren.proxy.dbroute.IOrderService;
import com.gupaoedu.pattren.proxy.dbroute.Order;
import com.gupaoedu.pattren.proxy.dbroute.db.DynamicDataSourceEntity;

import java.text.SimpleDateFormat;
import java.util.Date;

public class OrderServiceStaticProxy implements IOrderService {
    //持有被代理对象的引用
    private IOrderService orderService ;

    private SimpleDateFormat sdf = new SimpleDateFormat("yyyy");

    public OrderServiceStaticProxy(IOrderService orderService){
        this.orderService = orderService;
    }



    @Override
    public int createOrder(Order order) {
        Long time = order.getCreateTime();
        Integer dbRoute = Integer.valueOf(sdf.format(new Date(time)));
        DynamicDataSourceEntity.set(dbRoute);
        System.out.println("数据源从ThreadLocal中获取："+DynamicDataSourceEntity.get());
        System.out.println("静态代理自动分配到【DB"+dbRoute+"】数据源");
        DynamicDataSourceEntity.restore();
        int count = orderService.createOrder(order);
        return count;
    }
}
