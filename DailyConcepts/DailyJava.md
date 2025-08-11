## 📚 Table of Contents
- [Day 1: Constructor Chaining](#day-1-constructor-chaining-vs-method-invocation)
<!--ts-->
<!--te-->

## 🌞 Day 1: Constructor Chaining vs Method Invocation

**Concept:** 
You can use `this(...)` only inside constructors.
You cannot call a constructor from a method using this(...).


**Example:**
```java
public Sample() {
    this(10); // ✅ Valid
}
public void method() {
    this(10); // ❌ Invalid
}
```

**Reference:**  [Calling a constructor from method within the same class](https://stackoverflow.com/questions/19614423/calling-a-constructor-from-method-within-the-same-class)
