#Entrar com dois valores quaisquer. Exibir o maior deles, se existir, caso contrário, enviar mensagem avisando que os números são idênticos.

a = int(input('Digite o primeiro valor: '))
b = int(input('Digite o segundo valor: '))
if a > b : 
    print(f'O maior valor é {a}')
elif b > a : 
    print(f'O maior valor é {b}')
else: 
    print(f'Os valores digitados são idênticos')
    