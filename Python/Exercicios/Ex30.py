#Quanto que será pago -> Valor da etiqueta 
#A vista - 10%

a = int(input("Digite o valor do produto R$ "))

print("Escolha a sua forma de pagamento")
print("\n 1 - A vista em dinheiro ou cheque com 10% de desconto")
print("\n 2 - A vista com cartão de crédito, com 15% de desconto")
print("\n 3 - Em duas vezes, com o preço do produto (sem juros)")
print("\n 4 - Em quatro vezes com juros de 10%")

t = int(input("\n Digite a opção desejada: "))

if (t == 1):
    total = a*(90/100)
    print(f"O valor a ser pago pelo produto será de: R$ {total}")
elif (t == 2):
    total = a*(85/100)
    print(f"O valor a ser pago pelo produto será de: R$ {total}")
elif (t == 3):
    print(f"O valor a ser pago pelo produto será de: R$ {a}")
elif (t == 4):
    total = a*(110/100)
    total = total/4
    print(f"O valor a ser pago pelo produto será de 4x de: R$ {total}")
else: 
    print("Opção inválida!!")
