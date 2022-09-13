#Criar um programa para analisar a velocidade de um automóvel. Solicitar via teclado os valores da aceleração (a em m/s2), velocidade inicial (v0 em m/s) e o tempo de percurso (t em s). Calcular e exibir a velocidade final do automóvel em km/h. E exibir mensagem de acordo com a tabela abaixo:

a = float(input('Digite a aceleração: '))
v1 = float(input('Digite o valor da velocidade inicial: '))
t = float(input('Digite o tempo do percurso: '))

vf = (v1 + (a*t)) * 36/10  

if (vf <=40):
    print (f'O veículo está muito lento, velocidade: {vf:.2f} km/h')
elif (vf>40) and (vf<=60):
    print (f'O veículo está na velocidade permitida, velocidade: {vf:.2f} km/h')
elif (vf>60) and (vf <=80):
    print (f'O veículo está com velocidade de cruzeiro, velocidade: {vf:.2f} km/h')
elif (vf >80) and (vf <=120):
    print (f'O veículo está rápido, velocidade: {vf:.2f} km/h')
else: 
    print (f'O veículo está muito rápido, velocidade: {vf:.2f} km/h')