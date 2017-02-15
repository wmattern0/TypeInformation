#Type Information

Fork this repository to begin your work. Submit your code via a pull request. Your submission must include at least four meaningful commits.

## Summary

In this lab you will practice examining type information using instances of the `Class` class. You will also gain experience using the java reflection API to manipulate your classes and underlying class members.

### Testing

You must produce unit tests for all components of this lab. You should be following the principles of Test Driven Development.


### Instructions

- `classImplementsInterface()` - Take two arguments: **1)** a class, speicfied by an object, Class object, or class name, and **2)** an interface name. Return true if the specified class implements the specified interface
- `listAllMembers()` - Take an object and list all declared members (Fields, Constructors, and Methods) of its class, as well as those of each superclass, all the way to `Object`. This method should return a string containing each declared member listed on a separate line as follows:
  - The member name, preceded with the name of the declaring class, and any modifiers (`static`, `private` etc.)
  - Within each class, members should be listed in the order: Fields, Constructors, Methods
  - Each group of members (fields, constructors, or methods) should be listed alphabetically
  - The first line should start with the members declared by the given object type; the last line should be the last method defined by `Object`
- `getClassHierarchy()` - take an object and produce an indented class hierarchy with one class per line. Each line should be indented two spaces more than the previous one. The first line should be `java.lang.Object`
- `instantiateClassHierarchy()` - take an object and return a List containing instances of every concrete class in its hierarchy. Handle classes without a no-argument constructor gracefully (your program should not crash, but may not be able to instantiate these classes). *Note: Your test should confirm that each list item is an instance of a different class.*
