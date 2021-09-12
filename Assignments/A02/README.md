## Program 01 - Array Problems (Spiral Matrix)

### Loic Konan

<img src ="pic.png">

#### Description

Spiral Matrix Problem

### Instructions

- First, 4 variables containing the indices for the corner points of the array are initialized.<br>
- The algorithm starts from the top left corner of the array, and traverses the first row from left to right. Once it traverses the whole row it does not need to revisit it, thus, it increments the top corner index.
Once complete, it traverses the rightmost column top to bottom. Again, once this completes, there is no need to revisit the rightmost column, thus, it decrements the right corner index.<br>
- Next, the algorithm traverses the bottommost row and decrements the bottom corner index afterward.<br>
- Lastly, the algorithm traverses the leftmost column, incrementing the left corner index once it’s done.<br>
This continues until the left index is **greater** than the right index, and the top index is **greater** than the bottom index.
