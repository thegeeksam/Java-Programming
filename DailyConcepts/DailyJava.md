## 🌞 Day 1: Constructor Chaining vs Method Invocation

**Concept:** You can use `this(...)` only inside constructors, and only as the first line.

**Example:**
```java
public Sample() {
    this(10); // ✅ Valid
}
public void method() {
    this(10); // ❌ Invalid
}
