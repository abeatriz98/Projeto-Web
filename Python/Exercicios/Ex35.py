
num = int(input("Digite um valor positivo: "))
while (num<0):
    num=int(input("Por favor, digite um valor positivo: "))
    if (num>0):
        break
for i in range (1,11,1):
    r = num*i
    print(f'{num} X {i} = {r}')