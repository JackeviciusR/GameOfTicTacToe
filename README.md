# GameOfTicTacToe






There are two types board:

small board
0 - 3x3

![image](https://user-images.githubusercontent.com/73888905/114511718-f1975980-9c40-11eb-88c5-239f65824c34.png)


big board
1 - 9x9

![image](https://user-images.githubusercontent.com/73888905/114511607-cad92300-9c40-11eb-992b-00312a49ed62.png)


### Example

run:
first player name: 
Rokas
second player name: 

>> player name, can't be empty <<

second player name: 
Petras

Players:
> X - Petras
> O - Rokas

Select the board size: > 
0 - 3x3 
1 - 9x9
g
>> Try again! It isn't a number<<

Select the board size: > 
0 - 3x3 
1 - 9x9
 
>> Try again! It isn't a number<<

Select the board size: > 
0 - 3x3 
1 - 9x9
0
>--------------------------------------------------------<
      0     1     2    
   +  -  +  -  +  -  + 
0  |     |     |     | 
   +  -  +  -  +  -  + 
1  |     |     |     | 
   +  -  +  -  +  -  + 
2  |     |     |     | 
   +  -  +  -  +  -  + 
>--------------------------------------------------------<
Coordinates inputs
player: Petras(X)
row index: 
t
column index: 
2
>> Wrong input!!! Row or column indexes are numbers! Try again... <<

Coordinates inputs
player: Petras(X)
row index: 
 
column index: 
2
>> Wrong input!!! Row or column indexes are numbers! Try again... <<

Coordinates inputs
player: Petras(X)
row index: 
-1
column index: 
2
>> Wrong index!!! Index out range. Try again... <<

Coordinates inputs
player: Petras(X)
row index: 
3
column index: 
2
>> Wrong index!!! Index out range. Try again... <<

Coordinates inputs
player: Petras(X)
row index: 
1
column index: 
1
      0     1     2    
   +  -  +  -  +  -  + 
0  |     |     |     | 
   +  -  +  -  +  -  + 
1  |     |  X  |     | 
   +  -  +  -  +  -  + 
2  |     |     |     | 
   +  -  +  -  +  -  + 
>--------------------------------------------------------<
Coordinates inputs
player: Rokas(O)
row index: 
1
column index: 
0
      0     1     2    
   +  -  +  -  +  -  + 
0  |     |     |     | 
   +  -  +  -  +  -  + 
1  |  O  |  X  |     | 
   +  -  +  -  +  -  + 
2  |     |     |     | 
   +  -  +  -  +  -  + 
>--------------------------------------------------------<
Coordinates inputs
player: Petras(X)
row index: 
0
column index: 
1
      0     1     2    
   +  -  +  -  +  -  + 
0  |     |  X  |     | 
   +  -  +  -  +  -  + 
1  |  O  |  X  |     | 
   +  -  +  -  +  -  + 
2  |     |     |     | 
   +  -  +  -  +  -  + 
>--------------------------------------------------------<
Coordinates inputs
player: Rokas(O)
row index: 
2
column index: 
1
      0     1     2    
   +  -  +  -  +  -  + 
0  |     |  X  |     | 
   +  -  +  -  +  -  + 
1  |  O  |  X  |     | 
   +  -  +  -  +  -  + 
2  |     |  O  |     | 
   +  -  +  -  +  -  + 
>--------------------------------------------------------<
Coordinates inputs
player: Petras(X)
row index: 
2
column index: 
0
      0     1     2    
   +  -  +  -  +  -  + 
0  |     |  X  |     | 
   +  -  +  -  +  -  + 
1  |  O  |  X  |     | 
   +  -  +  -  +  -  + 
2  |  X  |  O  |     | 
   +  -  +  -  +  -  + 
>--------------------------------------------------------<
Coordinates inputs
player: Rokas(O)
row index: 
0
column index: 
2
      0     1     2    
   +  -  +  -  +  -  + 
0  |     |  X  |  O  | 
   +  -  +  -  +  -  + 
1  |  O  |  X  |     | 
   +  -  +  -  +  -  + 
2  |  X  |  O  |     | 
   +  -  +  -  +  -  + 
>--------------------------------------------------------<
Coordinates inputs
player: Petras(X)
row index: 
0
column index: 
0
      0     1     2    
   +  -  +  -  +  -  + 
0  |  X  |  X  |  O  | 
   +  -  +  -  +  -  + 
1  |  O  |  X  |     | 
   +  -  +  -  +  -  + 
2  |  X  |  O  |     | 
   +  -  +  -  +  -  + 
>--------------------------------------------------------<
Coordinates inputs
player: Rokas(O)
row index: 
2
column index: 
2
      0     1     2    
   +  -  +  -  +  -  + 
0  |  X  |  X  |  O  | 
   +  -  +  -  +  -  + 
1  |  O  |  X  |     | 
   +  -  +  -  +  -  + 
2  |  X  |  O  |  O  | 
   +  -  +  -  +  -  + 
>--------------------------------------------------------<
Coordinates inputs
player: Petras(X)
row index: 
1
column index: 
2
      0     1     2    
   +  -  +  -  +  -  + 
0  |  X  |  X  |  O  | 
   +  -  +  -  +  -  + 
1  |  O  |  X  |  X  | 
   +  -  +  -  +  -  + 
2  |  X  |  O  |  O  | 
   +  -  +  -  +  -  + 
>--------------------------------------------------------<
Board is filled! DRAW!!!

We will play a new round? (y - YES, n - NO)



### Second example

run:
first player name: 
Rokas
second player name: 
Petras

Players:
> X - Petras
> O - Rokas

Select the board size: > 
0 - 3x3 
1 - 9x9
1
>--------------------------------------------------------<
      0     1     2     3     4     5     6     7     8    
   +  -  +  -  +  -  +  -  +  -  +  -  +  -  +  -  +  -  + 
0  |     |     |     |     |     |     |     |     |     | 
   +  -  +  -  +  -  +  -  +  -  +  -  +  -  +  -  +  -  + 
1  |     |     |     |     |     |     |     |     |     | 
   +  -  +  -  +  -  +  -  +  -  +  -  +  -  +  -  +  -  + 
2  |     |     |     |     |     |     |     |     |     | 
   +  -  +  -  +  -  +  -  +  -  +  -  +  -  +  -  +  -  + 
3  |     |     |     |     |     |     |     |     |     | 
   +  -  +  -  +  -  +  -  +  -  +  -  +  -  +  -  +  -  + 
4  |     |     |     |     |     |     |     |     |     | 
   +  -  +  -  +  -  +  -  +  -  +  -  +  -  +  -  +  -  + 
5  |     |     |     |     |     |     |     |     |     | 
   +  -  +  -  +  -  +  -  +  -  +  -  +  -  +  -  +  -  + 
6  |     |     |     |     |     |     |     |     |     | 
   +  -  +  -  +  -  +  -  +  -  +  -  +  -  +  -  +  -  + 
7  |     |     |     |     |     |     |     |     |     | 
   +  -  +  -  +  -  +  -  +  -  +  -  +  -  +  -  +  -  + 
8  |     |     |     |     |     |     |     |     |     | 
   +  -  +  -  +  -  +  -  +  -  +  -  +  -  +  -  +  -  + 
>--------------------------------------------------------<
Coordinates inputs
player: Petras(X)
row index: 
7
column index: 
2
      0     1     2     3     4     5     6     7     8    
   +  -  +  -  +  -  +  -  +  -  +  -  +  -  +  -  +  -  + 
0  |     |     |     |     |     |     |     |     |     | 
   +  -  +  -  +  -  +  -  +  -  +  -  +  -  +  -  +  -  + 
1  |     |     |     |     |     |     |     |     |     | 
   +  -  +  -  +  -  +  -  +  -  +  -  +  -  +  -  +  -  + 
2  |     |     |     |     |     |     |     |     |     | 
   +  -  +  -  +  -  +  -  +  -  +  -  +  -  +  -  +  -  + 
3  |     |     |     |     |     |     |     |     |     | 
   +  -  +  -  +  -  +  -  +  -  +  -  +  -  +  -  +  -  + 
4  |     |     |     |     |     |     |     |     |     | 
   +  -  +  -  +  -  +  -  +  -  +  -  +  -  +  -  +  -  + 
5  |     |     |     |     |     |     |     |     |     | 
   +  -  +  -  +  -  +  -  +  -  +  -  +  -  +  -  +  -  + 
6  |     |     |     |     |     |     |     |     |     | 
   +  -  +  -  +  -  +  -  +  -  +  -  +  -  +  -  +  -  + 
7  |     |     |  X  |     |     |     |     |     |     | 
   +  -  +  -  +  -  +  -  +  -  +  -  +  -  +  -  +  -  + 
8  |     |     |     |     |     |     |     |     |     | 
   +  -  +  -  +  -  +  -  +  -  +  -  +  -  +  -  +  -  + 
>--------------------------------------------------------<
Coordinates inputs
player: Rokas(O)
row index: 
7
column index: 
2
>> Wrong indexes, this element isn't empty! Try again... <<

Coordinates inputs
player: Rokas(O)
row index: 
7
column index: 
1
      0     1     2     3     4     5     6     7     8    
   +  -  +  -  +  -  +  -  +  -  +  -  +  -  +  -  +  -  + 
0  |     |     |     |     |     |     |     |     |     | 
   +  -  +  -  +  -  +  -  +  -  +  -  +  -  +  -  +  -  + 
1  |     |     |     |     |     |     |     |     |     | 
   +  -  +  -  +  -  +  -  +  -  +  -  +  -  +  -  +  -  + 
2  |     |     |     |     |     |     |     |     |     | 
   +  -  +  -  +  -  +  -  +  -  +  -  +  -  +  -  +  -  + 
3  |     |     |     |     |     |     |     |     |     | 
   +  -  +  -  +  -  +  -  +  -  +  -  +  -  +  -  +  -  + 
4  |     |     |     |     |     |     |     |     |     | 
   +  -  +  -  +  -  +  -  +  -  +  -  +  -  +  -  +  -  + 
5  |     |     |     |     |     |     |     |     |     | 
   +  -  +  -  +  -  +  -  +  -  +  -  +  -  +  -  +  -  + 
6  |     |     |     |     |     |     |     |     |     | 
   +  -  +  -  +  -  +  -  +  -  +  -  +  -  +  -  +  -  + 
7  |     |  O  |  X  |     |     |     |     |     |     | 
   +  -  +  -  +  -  +  -  +  -  +  -  +  -  +  -  +  -  + 
8  |     |     |     |     |     |     |     |     |     | 
   +  -  +  -  +  -  +  -  +  -  +  -  +  -  +  -  +  -  + 
>--------------------------------------------------------<
Coordinates inputs
player: Petras(X)
row index: 
6
column index: 
1
      0     1     2     3     4     5     6     7     8    
   +  -  +  -  +  -  +  -  +  -  +  -  +  -  +  -  +  -  + 
0  |     |     |     |     |     |     |     |     |     | 
   +  -  +  -  +  -  +  -  +  -  +  -  +  -  +  -  +  -  + 
1  |     |     |     |     |     |     |     |     |     | 
   +  -  +  -  +  -  +  -  +  -  +  -  +  -  +  -  +  -  + 
2  |     |     |     |     |     |     |     |     |     | 
   +  -  +  -  +  -  +  -  +  -  +  -  +  -  +  -  +  -  + 
3  |     |     |     |     |     |     |     |     |     | 
   +  -  +  -  +  -  +  -  +  -  +  -  +  -  +  -  +  -  + 
4  |     |     |     |     |     |     |     |     |     | 
   +  -  +  -  +  -  +  -  +  -  +  -  +  -  +  -  +  -  + 
5  |     |     |     |     |     |     |     |     |     | 
   +  -  +  -  +  -  +  -  +  -  +  -  +  -  +  -  +  -  + 
6  |     |  X  |     |     |     |     |     |     |     | 
   +  -  +  -  +  -  +  -  +  -  +  -  +  -  +  -  +  -  + 
7  |     |  O  |  X  |     |     |     |     |     |     | 
   +  -  +  -  +  -  +  -  +  -  +  -  +  -  +  -  +  -  + 
8  |     |     |     |     |     |     |     |     |     | 
   +  -  +  -  +  -  +  -  +  -  +  -  +  -  +  -  +  -  + 
>--------------------------------------------------------<
Coordinates inputs
player: Rokas(O)
row index: 
8
column index: 
0
      0     1     2     3     4     5     6     7     8    
   +  -  +  -  +  -  +  -  +  -  +  -  +  -  +  -  +  -  + 
0  |     |     |     |     |     |     |     |     |     | 
   +  -  +  -  +  -  +  -  +  -  +  -  +  -  +  -  +  -  + 
1  |     |     |     |     |     |     |     |     |     | 
   +  -  +  -  +  -  +  -  +  -  +  -  +  -  +  -  +  -  + 
2  |     |     |     |     |     |     |     |     |     | 
   +  -  +  -  +  -  +  -  +  -  +  -  +  -  +  -  +  -  + 
3  |     |     |     |     |     |     |     |     |     | 
   +  -  +  -  +  -  +  -  +  -  +  -  +  -  +  -  +  -  + 
4  |     |     |     |     |     |     |     |     |     | 
   +  -  +  -  +  -  +  -  +  -  +  -  +  -  +  -  +  -  + 
5  |     |     |     |     |     |     |     |     |     | 
   +  -  +  -  +  -  +  -  +  -  +  -  +  -  +  -  +  -  + 
6  |     |  X  |     |     |     |     |     |     |     | 
   +  -  +  -  +  -  +  -  +  -  +  -  +  -  +  -  +  -  + 
7  |     |  O  |  X  |     |     |     |     |     |     | 
   +  -  +  -  +  -  +  -  +  -  +  -  +  -  +  -  +  -  + 
8  |  O  |     |     |     |     |     |     |     |     | 
   +  -  +  -  +  -  +  -  +  -  +  -  +  -  +  -  +  -  + 
>--------------------------------------------------------<
Coordinates inputs
player: Petras(X)
row index: 
7
column index: 
0
      0     1     2     3     4     5     6     7     8    
   +  -  +  -  +  -  +  -  +  -  +  -  +  -  +  -  +  -  + 
0  |     |     |     |     |     |     |     |     |     | 
   +  -  +  -  +  -  +  -  +  -  +  -  +  -  +  -  +  -  + 
1  |     |     |     |     |     |     |     |     |     | 
   +  -  +  -  +  -  +  -  +  -  +  -  +  -  +  -  +  -  + 
2  |     |     |     |     |     |     |     |     |     | 
   +  -  +  -  +  -  +  -  +  -  +  -  +  -  +  -  +  -  + 
3  |     |     |     |     |     |     |     |     |     | 
   +  -  +  -  +  -  +  -  +  -  +  -  +  -  +  -  +  -  + 
4  |     |     |     |     |     |     |     |     |     | 
   +  -  +  -  +  -  +  -  +  -  +  -  +  -  +  -  +  -  + 
5  |     |     |     |     |     |     |     |     |     | 
   +  -  +  -  +  -  +  -  +  -  +  -  +  -  +  -  +  -  + 
6  |     |  X  |     |     |     |     |     |     |     | 
   +  -  +  -  +  -  +  -  +  -  +  -  +  -  +  -  +  -  + 
7  |  X  |  O  |  X  |     |     |     |     |     |     | 
   +  -  +  -  +  -  +  -  +  -  +  -  +  -  +  -  +  -  + 
8  |  O  |     |     |     |     |     |     |     |     | 
   +  -  +  -  +  -  +  -  +  -  +  -  +  -  +  -  +  -  + 
>--------------------------------------------------------<
Coordinates inputs
player: Rokas(O)
row index: 
6
column index: 
2
      0     1     2     3     4     5     6     7     8    
   +  -  +  -  +  -  +  -  +  -  +  -  +  -  +  -  +  -  + 
0  |     |     |     |     |     |     |     |     |     | 
   +  -  +  -  +  -  +  -  +  -  +  -  +  -  +  -  +  -  + 
1  |     |     |     |     |     |     |     |     |     | 
   +  -  +  -  +  -  +  -  +  -  +  -  +  -  +  -  +  -  + 
2  |     |     |     |     |     |     |     |     |     | 
   +  -  +  -  +  -  +  -  +  -  +  -  +  -  +  -  +  -  + 
3  |     |     |     |     |     |     |     |     |     | 
   +  -  +  -  +  -  +  -  +  -  +  -  +  -  +  -  +  -  + 
4  |     |     |     |     |     |     |     |     |     | 
   +  -  +  -  +  -  +  -  +  -  +  -  +  -  +  -  +  -  + 
5  |     |     |     |     |     |     |     |     |     | 
   +  -  +  -  +  -  +  -  +  -  +  -  +  -  +  -  +  -  + 
6  |     |  X  |  O  |     |     |     |     |     |     | 
   +  -  +  -  +  -  +  -  +  -  +  -  +  -  +  -  +  -  + 
7  |  X  |  O  |  X  |     |     |     |     |     |     | 
   +  -  +  -  +  -  +  -  +  -  +  -  +  -  +  -  +  -  + 
8  |  O  |     |     |     |     |     |     |     |     | 
   +  -  +  -  +  -  +  -  +  -  +  -  +  -  +  -  +  -  + 
>--------------------------------------------------------<
WIN!
player: Rokas(O)
We will play a new round? (y - YES, n - NO)
y

Players:
> X - Petras
> O - Rokas

Select the board size: > 
0 - 3x3 
1 - 9x9






