#aceitar somente F ou M

s = input("Digite o seu sexo: ")

while (s =='f') or (s == 'm'):
    print("Obrigada pelo cadastro!")
    s = input("Digite o seu sexo: ")
else:
    while (s !='f') or (s!='m'): 
        s = input("Opção inválida! Digite o seu sexo: ")
        
