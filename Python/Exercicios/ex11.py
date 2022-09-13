#Calcular e exibir a área de um retângulo, a partir dos valores da base e altura que serão digitados. Se a área for maior que 100, exibir a mensagem “Terreno grande”.
b = int(input("Digite a base do retângulo: "))
h = int(input("Digite a altura do retângulo: "))
area = b*h 
if area > 100: 
    print(f'Terreno grande, {area}m^2')
else : 
    print(f"{area}m^2")