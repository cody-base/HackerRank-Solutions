# This challenge is to print the square of all non-negative numbers
# less than the given number n.

if __name__ == '__main__':
    n = int(raw_input())

i = 0
while (i < n):
    print (i*i)
    i += 1
