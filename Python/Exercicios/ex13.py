#Entrar via teclado com três valores distintos. Exibir o maior deles.
a = int(input('Digite o primeiro valor: '))
b = int(input('Digite o segundo valor: '))
c = int(input('Digite o terceiro valor: '))

if a > b > c : 
    print(f"O maior valor é {a}")
elif b > a > c :
    print(f"O maior valor é {b}")
else : 
    print (f"O maior valor digitado é {c}")
    