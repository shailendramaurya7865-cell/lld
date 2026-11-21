package org.example.ObserverDesignPattern.FoodOrder;

public class OrderPublisher {
    static void main(String[] args) {
        Order order = new Order("Burger", 35, "unpaid");

        SampleOrder sampleOrder = new SampleOrder(order);
        OrderService orderService = new OrderService(sampleOrder);
        orderService.doPayment(sampleOrder);
    }
}
