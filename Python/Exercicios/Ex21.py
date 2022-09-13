# Entrar via teclado com dois valores quaisquer. Após a digitação, exibir um seletor de opções (“menu”) com as seguintes opções: (Fazer esse exercício utilizando If..Else e/ou Case)

# 1 – Multiplicação 2 – Adição 3 – Divisão 4 – Subtração 5 – Fim de processo (sair do programa)
#Solicitar uma opção por parte do usuário, verificar se é ou não uma opção válida (letras ou números) e processar a respectiva operação. Enviar mensagem de erro se a opção escolhida não existir no seletor.

#Encerrar o programa somente quando o usuário escolher a opção de finalização. Repare que a opção de número três é de divisão e o programa deverá enviar mensagem de erro, (somente nesta opção) se o denominador for zero.
a = float(input('Digite o primeiro valor: '))
b = float(input('Digite o segundo valor: '))

print('Escolha uma das opções abaixo: ')
print('\n 1 - Multiplicação ')
print('\n 2 - Adição: ')
print('\n 3 - Divisão: ')
print('\n 4 - Subtração ')
print('\n 5 - Fim de processo: ')
num = int(input('Digite a opção desejada: '))

if (num == 1): 
    final = a * b 
    print(f'o valor da multiplicação dos números digitados é de: {final:.2f}')
elif (num == 2): 
    final = a + b 
    print(f'o valor da adição dos números digitados é de: {final:.2f}')
elif (num == 3): 
    if (b == 0):
        print ('Subtração inválida')
    else:
        final = a / b 
        print(f'o valor da divisão dos números digitados é de: {final:.2f}')
elif (num == 4): 
    final = a - b
    print(f'o valor da subtração dos números digitados é de: {final:.2f}')
elif (num == 5): 
    print('O programa será encerrado')
else: 
    print('Erro! Opção digitada não encontrada.')

