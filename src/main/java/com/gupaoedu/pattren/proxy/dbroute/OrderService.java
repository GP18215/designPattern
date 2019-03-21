package com.gupaoedu.pattren.proxy.dbroute;

public class OrderService implements IOrderService {
    private OrderDao orderDao;

    public OrderService() {
        //如果使用spring应该是自动注入
       orderDao = new OrderDao();
    }

    @Override
    public int createOrder(Order order) {
        System.out.println("OrderService调用了OrderDao创建了一条记录");
        return orderDao.inster(order);
    }
}
