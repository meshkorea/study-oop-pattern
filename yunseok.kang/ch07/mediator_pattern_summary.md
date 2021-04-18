# Mediator Pattern

Used to handle communication between related objects ("colleagues")

All communication is handled by the Mediator, and the colleagues do not need to know anything about each other

GOF: Allows loose coupling by encapsulating the way disparate sets of objects interact and communicate with each other. Allows for the actions of each object set to vary independently of one another.

> Without this pattern, all of the Colleagues would know about each other, leading to high coupling. By having all colleagues communicate through one central point we have a decoupled system while maintaining control on the object's interactions.

The mediator is a good choice of pattern when the communication between objects is complicated, but well defined.
