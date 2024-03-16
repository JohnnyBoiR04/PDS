# Software Design

## What is it?
- Design bridges the gap between knowing what is needed from the software to enter the contruction phase knowing what makes the code work and what is needed from it.
- During the design phase we aply our knowledge of the problem fomain and implementation technologies ir order to translate any system specifications into plans for technical implementation.
- The result expresses an overall structure and organization of the planned implementation. 
- The objective of the design of a software is to capture the essence of the solution independent of any implementation language.

### Notes
- There is a process for design but not an algorithm.
- Software design is a heuristic process rather than a deterministic one.
- Design is needed at several different levels of detail in a system.

## Importance of Software Design
- Poorly designed programs are difficult to understand and modify.
- Design is the primary tool dor managing essential and accidental complexities in software.
    - *Essential complexities*: complexities that are inherent in the problem
    - *Accidental complexities*: complexities that are artifacts of the solution

## Dealing with Software Complexity
- *Modularity*: Divide and Conquer
- *Abstraction*: Suppress details where they aren't necessary
- *Information Hiding*: Hide details and complexity behind simple interfaces
- *Inheritance*: General components may be reused to define more specific elements
- *Composition*: Reuse of other components to build a new solution

## Why is it hard?
- Design is an abstraction of the solution which has yet to be created.
- Diferent implementations can lead to the same results.
- Design techniques tend to rely on heuristics and rules-of-thumb rather than a repeatable process.
- It is an iteratice and incremental process where the final design evolves from experience and feedback.

## Generic Design Process
- Understand the problem;
- Construct a "black-box" (model of solution);
- Look for existing solutions (e.g., architecture and design patterns);
- Consider buiding prototypes;
- Document and review design;
- Refactor

### Inputs to Design Process
- *User requirements and system specification*
- *Domain knowledge*
    - e.g., if it's a healthcare application the designer will need to know some healthcare terms and concepts
- *Implementation knowledge*
    - capabilities and limitations of eventual execution enviroment

## Design Characteristics
- Minimal complexity;
- Loose coupling / Minimal dependencies;
- Ease of maintenance;
- Extensibility - Easy to expand from;
- Reusability;
- Portability - Easy to make work in other environments;
- Stratification - Layered system;
- Standard techniques - Boring is good;

### Characteristics of a Bad Design
- Rigidity:
    - Hard to change because every change affects too many other parts;
- Fragility:
    - When we make a change everything breaks;
- Immobility:
    - It's hard to reuse in another application;
- Viscosity:
    - The law of least resistance when faced with a choice;
