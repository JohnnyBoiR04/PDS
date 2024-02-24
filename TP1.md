# Clean Code

## Clean Code Principles
- Solid
- Dry
- Boy Scout
- Refactor

### Solid
- Single Responsability
    - every class should be related to a single responsability
- Open / Closed
    - open for extencion, but closed for modification
- Liskov Substitution 
    - objects of a subclass should behave the same has its super class
- Interface Segregation 
    - instead of one large interface, multiple specific interfaces are better suited for different clients
- Dependency Inversion 
    - a high-level module should not be dependent upon a low-level module, instead of a high module depeding on a low one, they both depend on abstractions

### Dry
- Don't repeat yourself :)

### Boy Scout Rule
- Always leave code better than you found it 

### Refactoring
- Refactoring in coding is the process of restructuring existing computer code—changing the factoring—without changing its external behavior

- This practice is aimed at improving the code's structure, readability, and maintainability, often making it easier for developers to understand and modify the code. 

- Refactoring is typically done to clean up code that works but is hard to read or understand, to remove redundancy, to improve performance in a subtle way, or to make the code comply with new requirements without altering its functionality.

## Names
Method Naming -> Methods should have verbs or verb phrases names.

Use Searchable and Intention Revealing Names -> Names should be meaningfull and descriptive.

Use Pronounceable Names

## Functions
Functions should be small and atomic -> no more then 20 lines long

Blocks within *if*, *else* or *while* statements should be one ident long

If functions calls another they should be vertically close

Fewer arguments the better

## Comments
Explain yourself through code, no need to use coments

## Classes
Classes should be small and should only have one, and only one reason to change

## Other Rules
Replace *Magic numbers* with Named Constants 

Encapsulate Condicionals 

Avoid Negatice Condicionals 
