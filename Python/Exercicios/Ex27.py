# somar 5 se for par ou somar 8 se for impar

a = int(input("Digite um valor: "))

if (a % 2 == 0):
    res = a + 5
    print(f"O número digitado é par, somado com cindo dá : {res}")
else :
    res = a + 8
    print(f"O número digitado é ímpar, somado com oito dá : {res}")