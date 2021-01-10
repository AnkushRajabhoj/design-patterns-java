# Design patterns in Java
All the design pattern in Head First - Design Patterns: Building Extensible and
maintainable Object-Oriented Software

__Design pattern is well described reusable solution to common problem in
software design and development.__

> ## Object-oriented basic
>  * Abstraction
>  * Encapsulation
>  * Polymorphism
>  * Inheritance

> ## Design Principle
> * Program to an interface, not an implementation.
> * Identify the aspects of your application that vary and separate them from
    > what stays the same (Encapsulate what varies).
> * Favor composition over inheritance.
> * Strive for loosely coupled designs between objects that interact.
> * Classes should be open for extension, but closed for modification.

---

> Design Patterns are divided into tree parts:
> * Creational
> * Structural
> * Behavioral

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

### Observer Pattern
The Observer Pattern defines a one-to-many dependency between objects so that
when one object changes state, all of its dependents are notified and updated
automatically.

When two objects are loosely coupled, they can interact, but have very little 
knowledge of each other. The Observer Pattern provides an object design where 
subjects and observers are loosely coupled.

Note: Observer Pattern is different from Publisher Subscriber Pattern

## Structural Design Patterns

## Decorator Patter
The Decorator Pattern attaches additional responsibilities to an object
dynamically. Decorators provide a flexible alternative to subclassing for
extending functionality.
