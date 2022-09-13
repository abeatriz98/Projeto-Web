#Entrar via teclado com o valor da cotação do dólar e uma certa quantidade de dólares. Calcular e exibir o valor correspondente em Reais (R$).
c = float(input('Digite a cotação do dólar: '))
q = float(input('Digite a quantidade de dólares que possui:U$ '))
reais = q*c
print(f'O valor que você possui em reais será de: R$ {reais:.2f}')