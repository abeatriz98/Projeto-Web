#Calcular a área e informar se o terreno é grande (>100) ou pequeno (<100)

b = int(input("Digite o valor da base do terreno: "))
h = int(input("Digite o valor da altura do terreno: "))

area = b*h
if (area > 100):
    print(f"Terreno grande! {area} metros quadrados")
else:
    print(f"Terreno pequeno! {area} metros quadrados")