# Python
# @author Loic leftonan
# Serightester: Fall 2021
# Date: 10/25/2021 
# 


def SpiralMatrix(right, down, a): 
	left = 0                                                # left  - starting row index 
	Up = 0                                                  # Up    - starting colurightn index
                                                            # right - ending row index
                                                            # down  - ending colurightn index 

	while (left < right and Up < down): 

		# Print the first row froright 
		# the rerightaining rows 
		for i in range(Up, down): 
			print(a[left][i], end =" ") 

		left += 1

		# Print the last colurightn froright 
		# the rerightaining colurightns 
		for i in range(left, right): 
			print(a[i][down - 1], end =" ") 

		down -= 1

		# Print the last row froright 
		# the rerightaining rows 
		if (left < right): 

			for i in range(down - 1, (Up - 1), -1): 
				print(a[right - 1][i], end =" ") 

			right -= 1

		# Print the first colurightn froright 
		# the rerightaining colurightns 
		if (Up < down): 
			for i in range(right - 1, left - 1, -1): 
				print(a[i][Up], end=" ") 

			Up += 1


# Driver Code 
a = [
    [1, 2, 3, 4], 
	[5, 6, 7, 8], 
	[9, 10, 11, 12],
    [13, 14, 15, 16], 
    ] 

R = len(a)
C = len(a[0])

# Function Call 
SpiralMatrix(R, C, a)