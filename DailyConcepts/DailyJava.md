## 📚 Table of Contents
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

---
##🌞 Day 2: Integer Caching and Autoboxing
**Concept:**
Java caches `Integer` values from -128 to 127. So `==` works for those values, but not beyond.

**Example:**
```java
public Sample() {
    this(10); // ✅ Valid
}
public void method() {
    this(10); // ❌ Invalid
}
```

**Reference:** [Why does Integer.valueOf(127) == Integer.valueOf(127) return true?](https://stackoverflow.com/questions/3591112/detect-series-items-of-listbox-vb6/3616756#3616756)
