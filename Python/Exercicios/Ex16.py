#Verificar se três valores quaisquer (A, B, C) que serão digitados formam ou não um triângulo retângulo. Lembre-se que o quadrado da hipotenusa é igual a soma dos quadrados dos catetos

a = int(input('Digite o primeiro número: '))
b = int(input('Digite o segundo número: '))
c = int(input('Digite o terceiro número: '))

if (a == 90) or ( b == 90) or (c == 90):
    print('Os valores digitados formam um triângulo retângulo')

else:
	print('Os valores digitados não formam um triângulo retângulo')

