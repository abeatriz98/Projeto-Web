a = 1
b = 1
c = 1
f = a+b+c

for i in range (1, 31,1):
    print(f)
    c = b
    b = a
    a = f
    f = a+b+c
    
