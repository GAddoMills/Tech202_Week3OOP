# SOLID Principles in Java

SOLID principles are an object-oriented approach that should be
applied to software structure design.

### Single Responsibility Principle

"A class should only have one reason to change". Each Java class must perform
a single functionality.

### Open-Closed Principle

Software entities (separate classes, modules, functions, etc.) should
be open for extension but closed for modification.

### Liskov Substitution Principle

Derived classes must be completely substitutable for their base classes.

I.e. functions that use references to base classes must be able to use
objects of the derived class without knowing it.

### Interface Segregation Principle

No code should be forced to depend on methods it does not use.

I.e. Larger interfaces should be split into smaller ones.
We don't want to force class to implement methods they don't need.

### Dependency Inversion Principle

1. High-level modules should not depend on low-level modules. 
Both should depend on abstractions.
2. Abstractions should not depend on details.
Details should depend on abstractions.

A **module** is a distinct assembly of components within a program.
It is a logical sub-set of the functionality provided by the whole program.
A "Chunk of software"

Show testing of my LightBulb example


### Extra resources I have been using:

SOLID principles with coded examples
https://www.baeldung.com/solid-principles

Resource I used for my Dependency Inversion Principle example
https://springframework.guru/principles-of-object-oriented-design/dependency-inversion-principle/