# Game of life Kata## TaskYour task is to write a program to calculate the next generation of Conway's game of life, given any starting position. You will test drive this code, mutation testing after each step with```mvn -Ppitest test```Concentrate on* Following the TDD process* Keeping your tests clean and readable* Understanding what the mutation testing results are telling you## Game of life backgroundYou start with a two dimensional grid of cells, where each cell is either alive or dead. The grid is finite, and no life can exist off the edges. When calculating the next generation of the grid, follow these four rules:1. Any live cell with fewer than two live neighbours dies,   as if caused by underpopulation.2. Any live cell with more than three live neighbours dies,   as if by overcrowding.3. Any live cell with two or three live neighbours lives   on to the next generation.4. Any dead cell with exactly three live neighbours becomes   a live cell.A neighbour is any cell that is adjacent horizontally, vertically or diagonally.In the representation below squares with a () are live. The number in the cell shows how many live neighbours each cell has.```| 0 | 1 | 1 | 1 | 0 || 0 | 2 |(1)| 2 | 0 || 0 | 3 |(2)| 3 | 0 || 0 | 2 |(1)| 2 | 0 || 0 | 1 | 1 | 1 | 0 |```Examples: * indicates live cell, . indicates dead cellExample input: (4 x 8 grid)```............*......**...........```Example output:```...........**......**...........```## Starter projectSome starter code is provided. Some decisions have been made for you about how the grid is represented, and some supporting test code is provided.You are free to re-factor any aspect of this code you wish, including the interface to the game of life class, or throw it away and start from scratch if you prefer. Also provided is a JUnit "test" that can be used to drive the finished code through several generations displaying the output in the console. This will not display correctly from an IDE. To run it remove the `@Ignore` annotation and launch the tests from a console with```mvn test```