# Design patterns in Java
All the design pattern in Head First - Design Patterns: Building Extensible and
maintainable Object-Oriented Software

__Design pattern is well described reusable solution to common problem in
software design and developement.__

---

> ## Design Principle
> * Program to an interface, not an implementation.
> * Identify the aspects of your application that vary and separate them from
    > what stays the same.
> * Favor composition over inheritance.

---

> Design Patterns are divided into tree parts:
> * Creational
> * Structural
> * Behavioral

---

```
Patterns aren't invented, they are discovered.
```



## Creational Design Patterns

### Singleton Pattern
The Singleton Pattern ensures a class has only one instance, and provides a
global point of access to it.

This pattern could be breaked by usage of
 * Serialization
 * Reflection
 * Multiple class loader

## Behavioral Design Patterns

### Strategy Pattern
The Strategy Pattern defines a family of algorithms, encapsulates each one, and
makes them interchangeable. Strategy lets the algorithm vary independently from
clients that use it.
