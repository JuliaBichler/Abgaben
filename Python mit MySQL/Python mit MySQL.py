import mysql.connector;

mydb = mysql.connector.connect(
    host="localhost",
    user="root",
    passwd="1009",
    database="employees"
)

def createnewemp(emp_no,birth_date,first_name,last_name,gender, hire_date):
    mycursor = mydb.cursor()
    sql = "INSERT INTO employees VALUES(%s, %s, %s, %s, %s, %s)"
    val = (emp_no,birth_date,first_name,last_name,gender,hire_date)
    mycursor.execute(sql, val)
    print("Mitarbeiter angelegt")
    mydb.commit()

def reademp(emp_no):
    mycursor = mydb.cursor()
    sql = "SELECT emp_no,birth_date,first_name,last_name,gender,hire_date FROM employees e WHERE e.emp_no = " + str(emp_no) + " Limit 1"
    try:
        mycursor.execute(sql)
        myresult = mycursor.fetchall()
        for x in myresult:
            print(x[0],x[1],x[2],x[3],x[4],x[5])
        mydb.commit()
    except:
        print("Fehler kein Mitarbeiter mit dieser Nummer gefunden")


def reademp2(first_name,last_name):
    mycursor = mydb.cursor()
    sql = "SELECT emp_no,birth_date,first_name,last_name,gender,hire_date FROM employees e WHERE e.first_name LIKE '" + first_name + "' AND e.last_name LIKE '" + last_name + "' Limit 1"
    try:
        mycursor.execute(sql)
        myresult = mycursor.fetchall()
        for x in myresult:
            print(x[0],x[1],x[2],x[3],x[4],x[5])
            mydb.commit()
    except:
        print("Fehler")


def updateemp(emp_no, last_name):
    mycursor = mydb.cursor()
    sql ="UPDATE employees e SET last_name = '" + last_name + "' WHERE e.emp_no = "+str(emp_no)
    mycursor.execute(sql)
    mydb.commit()

def deleteemp(emp_no):
    mycursor = mydb.cursor()
    try:
        sql="DELETE FROM employees WHERE emp_no =  "+ str(emp_no)
        mycursor.execute(sql)
        mydb.commit()
        print("Mitarbeiter enfernt")
    except:
        print("Fehler")

print("Wählen sie zwischen löschen, hinzufügen, suchen, verändern")
wahl=input("Was wollen Sie machen?")
if wahl=='löschen':
    x = input("Bitte die Nummer eingeben")
    deleteemp(x)
elif wahl =='hinzufügen':
    x = input ("Bitte Nummer angeben")
    y = input ("Geburtsdatum:")
    z = input ("Vorname")
    a = input ("Nachname")
    b = input ("Geschlecht")
    c = input ("Einstellungsdatum")
    createnewemp(x,y,z,a,b,c);
elif wahl == 'suchen':
    x = input("Über emp_no suchen oder über Name?")
    if x=='Name':
        y = input("Vorname")
        z = input ("Nachname")
        reademp2(y, z)
    else:
        y = input("Nummer")
        reademp(y)
elif wahl =='verändern':
    y=input("emp_no?")
    x=input("Neuer Nachname")
    updateemp(y,x)


mydb.close()