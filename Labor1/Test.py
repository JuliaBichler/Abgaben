import random

#x = [1,2,3,4,5,6,7,8,9,10]
#y = len(x)
#for i in range(1,2):        #Zweiter Wert
 #   print(x[i])
#for i in range(8,9):        #Vorletzter Wert
  #  print(x[i])
#for i in range(1,y):        #Alle Werte bis auf den letzten
 #   print(x[i])
#firstname = "Julia"
#secondname = "Bichler"
#alter = "17"
#print('{} {} {}'.format(firstname,secondname,alter))


zahlen = []
ziehung = []
zusatz=0
zusatzr=0
u=0

while (len(zahlen) != 6):                   #Eingabe der 6 Zahlen
    zahl = int(input())

    if zahl in zahlen:
        print("Zahl bereits vorhanden!")
        continue
    elif zahl < 0 or zahl > 46:
        print ("Zahl entspricht nicht den Vorgaben,erneute Eingabe:")
    else:
        zahlen.append(zahl)

print("Zusatzzahl: ")
zusatz = int(input())
if zusatz < 0 or zusatz > 46:
    print ("Zahl entspricht nicht den Vorgaben")

while (len(ziehung) != 6):                  #legt 6 Zufallszahlen fest
    zahl = random.randint(1,46)

    if zahl in ziehung:
        continue
    else:
        ziehung.append(zahl)


zusatzr=random.randint(1,46)
ziehung.sort()
zahlen.sort()

for a in range(6):
    print(ziehung[a],end=" ")

print()
for a in range(6):
    print(zahlen[a],end=" ")

print()

for j in range(6):
    for k in range(6):
        if(zahlen[j]==ziehung[k]):
            u=u+1

if(zusatzr==zusatz):
    print("Zusatzzahl richtig")
else:
    print("Zusatzzahl falsch")

print("Anzahl der Richtigen:", end=" ")
print(u)