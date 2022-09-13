#Exibir o seguinte seletor de opções e em função de uma escolha, solicitar os dados necessários para o cálculo da respectiva área. Enviar mensagem de erro se o usuário escolher uma opção inexistente.

#Encerrar o programa somente quando selecionada a opção de finalização. (Fazer esse exercício utilizando If..Else e/ou Case)

#1 – Triângulo 2 – Quadrado 3 – Retângulo 4 – Círculo 5 – Fim de processo


print('Escolha uma das opções abaixo: ')
print('\n 1 - Triângulo ')
print('\n 2 - Quadrado ')
print('\n 3 - Retângulo ')
print('\n 4 - Círculo ')
print('\n 5 - Fim de processo: ')
num = int(input('Digite a opção desejada: '))

if (num == 1):
    b = int(input('Digite a base do triângulo: '))
    h = int(input('Digite a altura do triângulo: '))
    area = (b*h)/2
    print(f'A aréa do triângulo é {area:.2f}')
if (num == 2):
    l = int(input('Digite o lado do quadrado: '))
    area = l*l
    print(f'A aréa do triângulo é {area:.2f}')
if (num == 3):
    b = int(input('Digite a base do retângulo: '))
    h = int(input('Digite a altura do retângulo: '))
    area = (b*h)
    print(f'A aréa do triângulo é {area:.2f}')
if (num == 4):
    r = int(input('Digite o raio do círculo: '))
    area = (r*r)*3.141592653589793
    print(f'A aréa do círculo é {area:.2f}')
elif (num == 5): 
    print('O programa será encerrado')
else: 
    print('Erro! Opção digitada não encontrada.')
