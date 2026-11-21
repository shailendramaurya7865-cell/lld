# Food Delivery Application - Observer Design Pattern

## Objective

Design a Food Delivery system that follows the **Observer Design Pattern** to handle activities that occur after a customer successfully places and pays for an order.

The goal is to achieve **loose coupling**, **extensibility**, and **maintainability**.

---

## Business Scenario

A customer places an order through the Food Delivery application and completes the payment successfully.

Once the order is confirmed, multiple independent actions need to be performed.

These actions should be executed without tightly coupling them to the Order Service.

---

## Functional Requirements

### FR-1: Place Order

The system shall allow a customer to place a food order.

### FR-2: Process Payment

The system shall verify that payment has been completed successfully before triggering any post-order actions.

### FR-3: Trigger Order Success Event

After successful payment, the system shall notify all registered observers about the order confirmation.

### FR-4: Send Email Notification

An email notification shall be sent to the customer containing order details.

### FR-5: Send Push Notification

A push notification shall be sent to the customer's mobile application.

### FR-6: Update Restaurant Statistics

The restaurant dashboard statistics shall be updated to reflect the new order.

### FR-7: Create Audit Log

The system shall create an audit log entry for compliance and tracking purposes.

### FR-8: Award Loyalty Points

The customer shall receive loyalty points based on the order amount.

---

## Non-Functional Requirements

### NFR-1: Loose Coupling

The Order Service must not directly depend on Email, Notification, Audit, Loyalty, or Statistics services.

### NFR-2: Extensibility

New business actions should be added without modifying existing Order Service code.

Example:

- WhatsApp Notification
- Coupon Generation
- Recommendation Engine
- Analytics Tracking

### NFR-3: Maintainability

Each business action should be implemented in its own independent class.

### NFR-4: Testability

Each observer should be testable independently.

---

## Constraints

- Use Java.
- Follow Object-Oriented Principles.
- Follow the Observer Design Pattern.
- Avoid hardcoded dependencies inside OrderService.

---

## Domain Model

### Order

| Field | Type |
|---------|---------|
| id | Long |
| customerId | Long |
| amount | Double |
| status | String |

---

## Expected Components

### Subject (Publisher)

Responsible for notifying all interested observers.

Example:

- OrderPublisher

Responsibilities:

- Register Observer
- Remove Observer
- Notify Observers

---

### Observer Interface

Common contract for all observers.

Example methods:

```java
void update(Order order);
```

---

### Concrete Observers

#### EmailObserver

Responsibilities:

- Send order confirmation email

#### PushNotificationObserver

Responsibilities:

- Send mobile push notification

#### StatisticsObserver

Responsibilities:

- Update restaurant dashboard statistics

#### AuditObserver

Responsibilities:

- Create audit logs

#### LoyaltyPointsObserver

Responsibilities:

- Award loyalty points

---

### OrderService

Responsibilities:

- Validate order
- Process payment
- Save order
- Trigger notification process via publisher

Responsibilities that should NOT exist here:

- Sending emails
- Sending push notifications
- Updating analytics
- Awarding loyalty points

---

## Expected Flow

```text
Customer Places Order
            |
            v
      OrderService
            |
            v
      Save Order
            |
            v
      Notify Publisher
            |
    ---------------------
    |    |    |    |    |
    v    v    v    v    v
 Email Push Stats Audit Loyalty
```

---

## Deliverables

1. UML Class Diagram
2. Java Classes
3. Observer Interface
4. Publisher Implementation
5. Five Observer Implementations
6. Order Service Implementation
7. Sequence Flow Explanation
8. Spring Boot Version using:
    - ApplicationEventPublisher
    - @EventListener

---

## Bonus Requirements

### BR-1: Async Processing

Make notifications asynchronous so that email delays do not impact order processing.

Example:

```java
@Async
@EventListener
public void handleOrderCreated(OrderCreatedEvent event) {
}
```

---

### BR-2: Failure Handling

If EmailObserver fails:

- Order should remain successful.
- Error should be logged.
- Retry mechanism may be applied.

---

### BR-3: Scalability

Explain how this design would evolve when:

- Loyalty Service becomes a separate microservice.
- Notification Service becomes a separate microservice.

Discuss whether Kafka or RabbitMQ should replace the in-memory observer implementation.

---

## Evaluation Criteria

The solution will be evaluated on:

- Correct application of Observer Pattern
- Adherence to SOLID principles
- Code readability
- Proper separation of concerns
- Extensibility
- Spring Boot best practices
- Ability to explain real-world production usage