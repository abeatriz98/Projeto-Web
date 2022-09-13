# Aceitar somente valor positivo 

a = int(input("Digite um valor de entrada: "))

while (a>0):
    a = int(input("Digite um valor de entrada: "))
if (a<0):
    while (a<0):
        print("\n Opção inválida!!")
        a = int(input("Digite um valor de entrada aceito: "))
    else:
        while(a>0):
            a = int(input("Digite um valor de entrada: "))