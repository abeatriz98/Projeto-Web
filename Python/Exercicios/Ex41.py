#Soma dos "n" valor positivos

n = int(input("Digite o valor de n: "))
while (n>100):
    print("Valor inválido")
    n = int(input("Digite um valor menor que 100: "))

i = 2    
s = 0
while i <= n:
    s = s + i
    i = i + 1

print(f"A soma dos {n} primeiros inteiros positivos é {s}")
