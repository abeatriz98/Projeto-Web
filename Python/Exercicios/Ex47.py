#Calcular fatorial 

from re import A

a = int(input("Digite o valor: "))

def main():
    while (a < 0): 
        print("Valor inválido!")
        a = int(input("Digite um valor positivo: "))
fat = 1
i = 2
while (i <= a) :
    fat = fat*i
    i = i + 1

print(f"O valor de {a} fatorial é {fat}")
r = input("Deseja refazer o calculo? (s/n): ")

if (r =='s'): 
    d = int(input("Digite o valor: "))
    while (d < 0): 
        print("Valor inválido!")
        d = int(input("Digite um valor positivo: "))
    ft = 1
    o = 2
    while (o <= a) :
        ft = ft*o
        o = o + 1
    print(f"O valor de {d} fatorial é {ft}")

if (r =='n'): 
    print("Fim do programa. Obrigada!")

