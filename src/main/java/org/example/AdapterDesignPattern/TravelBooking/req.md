# Adapter Design Pattern Practice Question

## Problem Statement

You are developing a **Travel Booking Platform** that supports multiple payment providers.

Currently, your application has been integrated with a new payment service called **FastPay**. However, the payment module of your application expects all payment providers to implement the following interface:

```java
public interface PaymentGateway {
    String pay(double amount);
}
```

The existing application code works only with implementations of `PaymentGateway`.

### Existing FastPay Library (Cannot Be Modified)

```java
public class FastPayClient {

    public String makePayment(double amount) {
        return "FastPay payment successful: " + amount;
    }
}
```

Unfortunately, `FastPayClient` does not implement `PaymentGateway`, and since it comes from a third-party library, you cannot modify its code.

---

## Business Requirements

1. The existing application should continue using the `PaymentGateway` interface.
2. The third-party `FastPayClient` must be integrated without changing its source code.
3. Client code should not be aware of `FastPayClient`.
4. Future payment providers with incompatible APIs should be easy to integrate.
5. Follow SOLID principles as much as possible.

---

## Tasks

### Task 1
Identify the design problem in the current implementation.

---

### Task 2
Which design pattern would you use to solve this problem and why?

---

### Task 3
Create the required classes/interfaces.

Expected components:

- `PaymentGateway`
- `FastPayClient`
- Adapter class
- Client/Application class

---

### Task 4
Draw the class relationship using PlantUML.

Expected output should clearly show:

- Target Interface
- Adaptee
- Adapter
- Client

---

### Task 5
Implement a solution where the following client code works:

```java
PaymentGateway paymentGateway =
        new FastPayAdapter(new FastPayClient());

System.out.println(paymentGateway.pay(5000));
```

Expected Output:

```text
FastPay payment successful: 5000.0
```

---

## Follow-up Interview Questions

### Easy

1. What problem does the Adapter Pattern solve?
2. What is the Target interface?
3. What is the Adaptee?
4. Why can't we directly use `FastPayClient`?
5. Is Adapter a structural or behavioral design pattern?

---

### Intermediate

1. Difference between Adapter and Strategy Pattern?
2. Difference between Adapter and Facade Pattern?
3. Can one Adapter adapt multiple classes?
4. Can an Adapter be implemented using inheritance?
5. What are Object Adapter and Class Adapter?

---

### Advanced

1. How does Adapter Pattern support the Open/Closed Principle?
2. In Spring Boot, where have you seen Adapter Pattern being used?
3. How is `HandlerAdapter` in Spring MVC related to Adapter Pattern?
4. What are the drawbacks of excessive Adapter usage?
5. When would you choose Adapter over rewriting an existing integration?

---

## Bonus Extension

The business now wants to support another third-party provider:

```java
public class RazorPaymentApi {

    public boolean process(double amount) {
        return true;
    }
}
```

### Challenge

Without modifying existing client code:

```java
PaymentGateway gateway = getPaymentGateway("RAZOR");
gateway.pay(1000);
```

Integrate `RazorPaymentApi` using the same design pattern.

Think about:

- Reusability
- Extensibility
- Factory + Adapter combination
- Open/Closed Principle