# Given a number, this challenge is to print 'Weird' if it is odd
# or even and inclusive between 5 and 20, and 'Not Weird' if it is 
# even and inclusive between 2 and 5, or even and over 20.

if __name__ == '__main__':
    n = int(raw_input().strip())

if (n % 2 != 0) or (n % 2 == 0 and n >= 6 and n <= 20):
    print ("Weird")
    
elif (n % 2 == 0 and n >= 2 and n <= 5) or (n % 2 == 0 and n >20):
    print ("Not Weird")
