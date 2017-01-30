#Design Patterns

Design Patterns
Creational
Factory Method
You use the Factory design pattern when you want to define the class of an object at runtime. It also allows you to encapsulate object creation so that you can keep all object creation code in one place.
Abstract Factory
Abstract Factory patterns work around a super-factory which creates other factories. This factory is also called as factory of factories. In Abstract Factory pattern an interface is responsible for creating a factory of related objects without explicitly specifying their classes. Each generated factory can give the objects as per the Factory pattern
Singleton
This pattern involves a single class which is responsible to create an object while making sure that only single object gets created. This class provides a way to access its only object which can be accessed directly without need to instantiate the object of the class.
Builder
Builder pattern builds a complex object using simple objects and using a step by step approach. Separate the construction of a complex object from its representation so that the same construction process can create different representations.
Prototype
Prototype pattern refers to creating duplicate object while keeping performance in mind. This pattern involves implementing a prototype interface which tells to create a clone of the current object. This pattern is used when creation of object directly is costly. For example, an object is to be created after a costly database operation. We can cache the object, returns its clone on next request and update the database as and when needed thus reducing database calls.
Structural
Decorator
Decorator pattern allows a user to add new functionality to an existing object without altering its structure. This pattern acts as a wrapper to existing class. Decorator pattern allows a user to add new functionality to an existing object without altering its structure. This type of design pattern comes under structural pattern as this pattern acts as a wrapper to existing class.
Adapter
Adapter pattern works as a bridge between two incompatible interfaces. This pattern combines the capability of two independent interfaces.
Facade
Facade pattern hides the complexities of the system and provides an interface to the client using which the client can access the system.This pattern adds an interface to existing system to hide its complexities.
Bridge
Buraya dön
Composite
Composite pattern is used where we need to treat a group of objects in similar way as a single object. Composite pattern composes objects in term of a tree structure to represent part as well as whole hierarchy. This pattern creates a tree structure of group of objects.
Flyweight
Flyweight pattern is primarily used to reduce the number of objects created and to decrease memory footprint and increase performance. This pattern provides ways to decrease object count thus improving the object structure of application.
Proxy
In proxy pattern, a class represents functionality of another class. In proxy pattern, we create object having original object to interface its functionality to outer world.
Behavioral
Strategy / Policy
You use this pattern if you need to dynamically change an algorithm used by an object at run time. The pattern also allows you to eliminate code duplication. It separates behavior from super and subclasses. It is a super design pattern and is often the first one taught.
Observer
The Observer pattern is a software design pattern in which an object, called the subject (Publisher), maintains a list of its dependents, called observers (Subscribers), and notifies them automatically of any state changes, usually by calling one of their methods.
Command
The Command design pattern allows you to store a list of commands for later use. With it you can store multiple commands in a class to use over and over. A request is wrapped under an object as command and passed to invoker object. Invoker object looks for the appropriate object which can handle this command and passes the command to the corresponding object which executes the command.
Template Method
In Template pattern, an abstract class exposes defined way(s)/template(s) to execute its methods. Its subclasses can override the method implementation as per need but the invocation is to be in the same way as defined by an abstract class.
Iterator
The iterator design pattern allows you to access objects that are stored in many different collection types.You do this by creating a common interface that these classes share. Then you have them provide you with an iterator that allows you to traverse the objects they contain.
State
In State pattern a class behavior changes based on its state. In State pattern, we create objects which represent various states and a context object whose behavior varies as its state object changes
Chain of Responsibility
The chain of responsibility pattern creates a chain of receiver objects for a request. This pattern decouples sender and receiver of a request based on type of request. In this pattern, normally each receiver contains reference to another receiver. If one object cannot handle the request then it passes the same to the next receiver and so on.
Interpreter
Interpreter pattern provides a way to evaluate language grammar or expression. This pattern involves implementing an expression interface which tells to interpret a particular context. This pattern is used in SQL parsing, symbol processing engine etc.
Mediator
Memento
Visitor
Resoureces
https://www.youtube.com/watch?v=vNHpsC5ng_E&index=1&list=PLF206E906175C7E07
https://dzone.com/refcardz/design-patterns
http://www.tasarimdesenleri.com/jsp/tasdesincele/factoryMethod.jsp
https://sourcemaking.com/design_patterns
https://www.tutorialspoint.com/design_pattern/