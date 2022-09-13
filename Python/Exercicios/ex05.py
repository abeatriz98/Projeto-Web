#Entrar via teclado com o valor de uma temperatura em graus Celsius, calcular e exibir sua temperatura equivalente em Fahrenheit.
c = float(input('Digite o valor em Celsius na sua cidade: '))
f = (1.8*c) + 32 
print(f'O valor da temperatura em Fahrenheit será de: {f:.2f}')