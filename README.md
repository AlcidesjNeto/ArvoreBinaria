# Binary Tree Project

## Description
This project is a classroom activity focused on the implementation of a binary tree in Java. It demonstrates the basic and advanced functionalities for manipulating and handling data in a binary tree. The structure allows for insertion, removal, searching, type checks (full tree, complete tree, and strictly binary tree), traversals (in-order, pre-order, and post-order), calculating the degree of a node, and determining the level of the tree.

## Functionalities
The project supports the following operations:

- **Insertion and Removal**: Recursive methods that maintain the properties of the binary search tree.
- **Element Search**: Returns true if the element is present in the tree.
- **Traversals**: Allows in-order, pre-order, and post-order traversals to traverse the tree.
- **Tree Type Checks**:
  - **Complete**: All levels except the last are completely filled.
  - **Full**: Every node has either 0 or 2 children.
  - **Strict**: Every internal node has exactly two children.
- **Node Degree**: Calculates the number of children of a given node.
- **Tree Level**: Determines the height of the tree.

## How It Works
The project consists of three main classes:

- **Node**: Represents each node of the tree, containing an integer value and references to its left and right children.
- **BinaryTree**: Contains the methods for manipulating and verifying the tree.
- **Main**: Provides a command-line interface for interacting with the user and testing the functionalities.

## Running the Project
To run the project, compile and execute the `Main.java` class. The program will prompt the user with a menu to perform various operations such as inserting, removing, or searching for nodes, as well as displaying the tree traversals.

## Testing
The following test cases were executed successfully:

- Insertion of values: 50, 30, 70, 20, 40, 60, 80
- Traversal outputs: in-order, pre-order, post-order
- Tree type checks: full, complete, and strict
- Removal of nodes: 20 (leaf), 30 (one child), 50 (two children)
- Node degree calculation: Node 70 (expected degree: 2)
- Tree level calculation (expected level: 3)

## Conclusion
This activity allowed the practical application of binary tree concepts and data structures in Java. The most challenging part was ensuring the correct functionality of the removal and tree type-check methods.

## Repository
You can find the source code and more details in the following repository:
- [GitHub Repository](https://github.com/AlcidesjNeto/ArvoreBinaria)

## Bibliography
- Jovana, M. (2019). *Data Structures in Java*.
- Geeks for Geeks. [https://www.geeksforgeeks.org](https://www.geeksforgeeks.org)
- Overleaf Team. (2025). *LaTeX Documentation*. [https://www.overleaf.com](https://www.overleaf.com)
