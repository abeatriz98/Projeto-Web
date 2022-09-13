# Entrar com o peso, o sexo e a altura de uma determinada pessoa. Após a digitação, exibir se esta pessoa está ou não com seu peso ideal. Fórmula: peso/altura².

p = float(input('Digite o seu peso: '))
a = float(input('Digite a sua altura: '))
sexo = input( 'Digite M para masculino e F para feminino: ')

imc = p/(a * a) 

if sexo == 'f':
    if (imc < 19):
        print(f'Você está abaixo do peso, pois seu imc deu {imc:.2f}')
    if (imc >= 19) and (imc <= 24): 
        print(f'Você está com peso ideal, pois seu imc deu {imc:.2f}')
    if (imc > 25):
    	print(f'Você está acima do peso, pois seu imc deu {imc:.2f}')
else:
    if (imc < 20):
        print(f'Você está abaixo do peso, pois seu imc deu {imc:.2f}')
    if (imc > 20) and (imc <= 25): 
        print(f'Você está com peso ideal, pois seu imc deu {imc:.2f}')
    if (imc > 25) :
        print(f'Você está acima do peso, pois seu imc deu {imc:.2f}')
