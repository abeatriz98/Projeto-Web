# Dobro do número se for positivo, e triplo do numero se for negativo

a = int(input("Digite um numero: "))

if (a > 0):
    res = a * 2
    print(f"O dobro do numero digitado é {res}")
else :
    res = a * 3
    print(f"O triplo do numero digitado é {res}")