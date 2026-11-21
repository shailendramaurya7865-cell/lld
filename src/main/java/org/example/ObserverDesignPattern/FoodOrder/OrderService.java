package org.example.ObserverDesignPattern.FoodOrder;

public class OrderService {
    SampleOrder sampleOrder;

    public OrderService(SampleOrder sampleOrder) {
        this.sampleOrder = sampleOrder;
        EmailObserver observer = new EmailObserver(sampleOrder.order);
        sampleOrder.addObserver(observer);
    }

    public void doPayment(SampleOrder sampleOrder) {
        sampleOrder.order.status = "paid";
        notifyObservers(sampleOrder);

    }

    private void notifyObservers(SampleOrder sampleOrder) {
        this.sampleOrder.updateOrder(sampleOrder.order);
    }
}
