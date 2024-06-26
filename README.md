# DesignPatterns
## Solid Principles
```agsl
    Single Responsibility Principle (SRP):
    Principle: A class should have only one reason to change, meaning that a class should only have one responsibility.
    Violation: A class is responsible for multiple unrelated functionalities.
    Correction: Refactor the class to have a single responsibility.
    E.g.: Class Doing to many things

```
```agsl
    Open/Closed Principle (OCP):

    Principle: A class should be open for extension but closed for modification. You should be able to add new features without modifying existing code.
    Violation: Modifying existing code instead of extending it for new features.
    Correction: Use abstraction, inheritance, and polymorphism to allow for extension.
    e.g: Tightly coupled Dependencies

```

```agsl
     Liskov Substitution Principle Violation:
     As we saw in this example, the method we wrote in our main class should work properly in its subclasses according to the Liskov principle,
     but when our subclass inherited from our superclass, our fly method did not work as expected.
     e.g: Bird who can't fly
     If a subclass is derived from its super class, the superclass should be replacable by the sub class

```

```agsl
    Interface Segregation Principle (ISP):
    Principle: A class should not be forced to implement interfaces it does not use. Clients should not be forced to depend on interfaces they do not use.
    Violation: A class is forced to implement methods it does not need.
    Correction: Break interfaces into smaller, more specific ones.
    e.g: Bird can fly and walk, but not all birds do the both

```

```agsl
    Dependency Inversion Principle (DIP):

    Principle: High-level modules should not depend on low-level modules. Both should depend on abstractions. Abstractions should not depend on details; details should depend on abstractions.
    Violation: High-level module depends directly on low-level module, making the system rigid and hard to change.
    Correction: Introduce abstractions (interfaces) that both high-level and low-level modules depend on.
```

## Strategy Pattern
- https://lucid.app/lucidchart/b582547b-b5ed-4681-b4b2-61380adc36cf/edit?viewport_loc=513%2C-59%2C1506%2C732%2C0_0&invitationId=inv_28046c9b-9773-4e3e-a9bc-d151eb347946

## Observer Pattern
- https://lucid.app/lucidchart/f767873a-bb65-4ded-ae95-cbdb41824554/edit?view_items=y_2IMlTnsfsG&invitationId=inv_b7ba8532-1607-471d-838a-317684abe6d9