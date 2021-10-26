# Python
# @author Loic leftonan
# Serightester: Fall 2021
# Date: 10/25/2021 
# 


def SpiralMatrix(right, down, array): 
	left = 0                                                # left  - start row index 
	Up = 0                                                  # right - end row index
                                                            # Up    - start column index
                                                            # down  - end column index 

    # While the pointer that point to the left index is less than the right index
    # and the pointer that point to the Up index is less than the bottom index
    # Perform those for loops.
	while (left < right and Up < down): 
 
                                                            # Display the first column from the remaining columns 
		for i in range(Up, down): 
			print(array[left][i], end =" ") 

		left += 1                                           # Here we increment the left variable by 1.               

		for i in range(left, right): 
			print(array[i][down - 1], end =" ") 

		down -= 1                                           # Here we decrement the down variable by 1.

		if (left < right): 

			for i in range(down - 1, (Up - 1), -1): 
				print(array[right - 1][i], end =" ") 

			right -= 1                                      # Here we decrement the right variable by 1.
 
		if (Up < down): 
			for i in range(right - 1, left - 1, -1): 
				print(array[i][Up], end=" ") 

			Up += 1                                         # Here we increment the Up variable by 1.


# Driver Code 
array = [                                                   # My input list that we will need to perform the SpiralOrder.        
            [1, 2, 3, 4], 
	        [5, 6, 7, 8], 
	        [9, 10, 11, 12],
            [13, 14, 15, 16], 
        ] 

Rows = len(array)                                           # Assign the length of the row to the variable Rows
Columns = len(array[0])                                     # Assign the length of the columns to the variable Columns

# Function Call 
SpiralMatrix(Rows, Columns, array)