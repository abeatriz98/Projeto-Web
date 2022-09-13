# Entrar com o peso e a altura de uma determinada pessoa. Após a digitação, exibir se esta pessoa está ou não com seu peso ideal. Fórmula: peso/altura².

p = float(input('Digite o seu peso: '))
a = float(input('Digite a sua altura no formato x.xx: '))

imc = p/(a*a)

if (imc < 20):
	print(f'Você está abaixo do peso, pois seu imc deu {imc:.2f}')

elif (imc > 20) and (imc < 25): 
	print(f'Você está com peso ideal, pois seu imc deu {imc:.2f}')

else :
	print(f'Você está acima do peso, pois seu imc deu {imc:.2f}')
