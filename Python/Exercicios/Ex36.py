
a = int(input("Digite o primeiro valor positivo: "))

while (a<=0) : 
    print("Número inválido!")
    a = int(input("Digite um valor positivo: "))

b = int(input("Digite o início do intervalor: "))
c = int(input("Digite o final do intervalor: "))

while (b<=a):
    print("Número inválido!")
    b = int(input("Digite um valor maior que o de a: "))

for i in range (b, a-1, -1):
    t = a * i
    print(f"{a} X {i} = {t}")

