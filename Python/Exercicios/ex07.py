#Entrar via teclado com o valor de cinco produtos. Após as entradas, digitar um valor referente ao pagamento da somatória destes valores. Calcular e exibir o troco que deverá ser devolvido.
a = float(input('Digite o valor do produto a R$ '))
b = float(input('Digite o valor do produto b R$ '))
c = float(input('Digite o valor do produto c R$'))
d = float(input('Digite o valor do produto d R$ '))
valor = float(input('Digite o valor a ser pago: R$ '))
total = a+b+c+d 
troco = valor - total
print(f'O total dos produtos foi de R$ {total:.2f} e o valor de troco será de R$ {troco:.2f}')
