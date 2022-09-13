#A partir de três valores que serão digitados, verificar se formam ou não um triângulo. Em caso positivo, exibir sua classificação: “Isósceles, escaleno ou eqüilátero”. Um triângulo escaleno possui todos os lados diferentes, o isósceles, dois lados iguais e o eqüilátero, todos os lados iguais. Para existir triângulo é necessário que a soma de dois lados quaisquer seja maior que o outro, isto, para os três lados.

a = int(input('Digite o valor de um lado do triângulo: '))
b = int(input('Digite o valor de outro lado do triângulo: '))
c = int(input('Digite o valor do terceiro lado do triângulo: '))

if (a+b > c) and (a+c > b) and (b+c>a):
	print('Isso é um triângulo')
	if (a == b == c) : 
		print ('É  um triângulo equilátero')
	elif ( a != b) and ( a !=c ) and (b != c) : 
		print ('É um triângulo escaleno')
	else: 
		print('É um triângulo isósceles')
else: 
	print('Não é um triângulo')