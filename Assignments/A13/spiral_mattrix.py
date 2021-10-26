# Python
# @author Loic leftonan
# Serightester: Fall 2021
# Date: 10/25/2021 
# 


def SpiralMatrix(right, down, a): 
	left = 0                                                # left  - start row index 
	Up = 0                                                  # right - end row index
                                                            # Up    - start column index
                                                            # down  - end column index 

	while (left < right and Up < down): 
 
		for i in range(Up, down): 
			print(a[left][i], end =" ") 

		left += 1

		for i in range(left, right): 
			print(a[i][down - 1], end =" ") 

		down -= 1

		if (left < right): 

			for i in range(down - 1, (Up - 1), -1): 
				print(a[right - 1][i], end =" ") 

			right -= 1
 
		if (Up < down): 
			for i in range(right - 1, left - 1, -1): 
				print(a[i][Up], end=" ") 

			Up += 1


# Driver Code 
array = [                                                       # My input list that we will need to perform the SpiralOrder.        
            [1, 2, 3, 4], 
	        [5, 6, 7, 8], 
	        [9, 10, 11, 12],
            [13, 14, 15, 16], 
        ] 

Rows = len(array)                                               # Assign the length of the row to the variable Rows
Columns = len(array[0])                                         # Assign the length of the columns to the variable Columns

# Function Call 
SpiralMatrix(Rows, Columns, array)