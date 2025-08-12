# 🔥 Byte by Byte: Java Sparks for Curious Minds

## 📚 Table of Contents
- [Day 1: Constructor Chaining](#-day-1-constructor-chaining-vs-method-invocation)
- [Day 2: Integer Caching and Autoboxing](#-day-2-integer-caching-and-autoboxing)
- [Day 3: Final vs Finally vs Finalize](#-day-3-final-vs-finally-vs-finalize)


***
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

[Back to Top](#-table-of-contents)
---
## 🌞 Day 2: Integer Caching and Autoboxing

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

[Back to Top](#-table-of-contents)
---

## 🌞 Day 3: Final vs Finally vs Finalize

**Concept:**
- final: constant or non-inheritable
- finally: block after try-catch
- finalize(): deprecated cleanup method

**Reference:** [In Java, what purpose do the keywords `final`, `finally` and `finalize` fulfil?](https://stackoverflow.com/questions/7814688/in-java-what-purpose-do-the-keywords-final-finally-and-finalize-fulfil)

[Back to Top](#-table-of-contents)
---
