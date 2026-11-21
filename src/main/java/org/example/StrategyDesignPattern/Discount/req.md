# Practice Question - Strategy Design Pattern

## Problem Statement

You are developing an e-commerce application similar to Amazon or Flipkart.

The system currently supports multiple discount calculation methods:

- Regular Customer Discount (5%)
- Premium Customer Discount (10%)
- Festival Discount (15%)
- Employee Discount (20%)

Whenever an order is placed, the system must calculate the final payable amount based on the selected discount type.

### Current Issue

The existing implementation uses multiple if-else conditions:

```java
if(discountType.equals("REGULAR")) {
    // calculate 5% discount
} else if(discountType.equals("PREMIUM")) {
    // calculate 10% discount
} else if(discountType.equals("FESTIVAL")) {
    // calculate 15% discount
} else if(discountType.equals("EMPLOYEE")) {
    // calculate 20% discount
}
```

The business team frequently introduces new discount schemes. Each time a new discount type is added, developers must modify the existing code, increasing maintenance effort and violating the Open/Closed Principle.

---

## Requirement

Design the solution using the **Strategy Design Pattern**.

### Functional Requirements

1. Create a common strategy interface for discount calculation.
2. Implement separate strategies for:
    - Regular Customer Discount
    - Premium Customer Discount
    - Festival Discount
    - Employee Discount
3. Create a context class that can accept any discount strategy at runtime.
4. The client should be able to switch discount strategies dynamically without changing existing code.
5. The system should be easily extensible so that future discount types can be added without modifying existing classes.

---

## Input Example

```text
Order Amount = ₹10,000
Discount Type = Premium
```

## Expected Output

```text
Original Amount : ₹10,000
Discount Applied : 10%
Final Amount : ₹9,000
```

---

## Bonus Requirements

Implement the following additional strategies:

- FirstPurchaseDiscount (25%)
- DiwaliDiscount (18%)
- NewYearDiscount (12%)

The context class should work without any modification after adding these strategies.

---

## UML Hint

```
                  +----------------------+
                  |   DiscountStrategy   |
                  +----------------------+
                  | + applyDiscount()    |
                  +----------+-----------+
                             |
        -----------------------------------------
        |           |            |             |
        |           |            |             |
+---------------+ +---------------+ +---------------+
| Regular       | | Premium       | | Festival      |
| Discount      | | Discount      | | Discount      |
+---------------+ +---------------+ +---------------+
        |
        |
+----------------------+
| DiscountContext      |
+----------------------+
| strategy             |
| setStrategy()        |
| calculateDiscount()  |
+----------------------+

Client ----> DiscountContext ----> DiscountStrategy
```

---

## Interview Follow-up Questions

1. Why is Strategy Pattern preferred over if-else conditions?
2. Which SOLID principle does Strategy Pattern support?
3. How is Strategy different from Factory Pattern?
4. Can Strategy be changed at runtime? Explain with an example.
5. Where have you used or seen Strategy Pattern in real projects?
6. How is Spring Security authentication mechanism an example of the Strategy Pattern?