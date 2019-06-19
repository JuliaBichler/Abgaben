from sqlalchemy import Integer, String, Column, create_engine, ForeignKey, select
from sqlalchemy.orm  import sessionmaker, relationship
from sqlalchemy.ext.declarative import declarative_base



# Erzeugen der Klassenstruktur basierend auf der Datenbank Studenten

Base = declarative_base()

class Studenten(Base):
    __tablename__ = 'Studenten'
    MatrNr = Column(Integer, primary_key=True)
    Name = Column(String(255))
    Semester = Column(Integer)


class Professoren(Base):
    __tablename__ = 'Professoren'
    PersNr = Column(Integer, primary_key=True)
    Name = Column(String(255))
    Rang = Column(String(255))
    Raum = Column(String(255))

class Vorlesungen(Base):
    __tablename__ = 'Vorlesungen'
    VorlNr = Column(Integer, primary_key=True)
    Titel = Column(String(255))
    SWS = Column(Integer)
    gelesen_von = Column(Integer, ForeignKey('Professoren.PersNr'))
    gelesen = relationship("Professoren", back_populates="Vorlesungen")


Professoren.Vorlesungen = relationship("Vorlesungen", order_by=Vorlesungen.VorlNr, back_populates="gelesen")


class hoeren(Base):
    __tablename__ = 'hoeren'
    MatrNr = Column(Integer, ForeignKey('Studenten.MatrNr'), primary_key=True)
    VorlNr = Column(Integer, ForeignKey('Vorlesungen.VorlNr'), primary_key=True)
    Student = relationship("Studenten")
    Vorlesung = relationship("Vorlesungen")


#Erstellen der Engine für den Datenbankzugriff
engine = create_engine("mysql://root:root@localhost/uni")
#c = engine.connect()
Session = sessionmaker()
Session.configure(bind=engine)
session = Session()


# new_stud = Studenten(MatrNr = '111', Name='Albert Greinöcker', Semester=30)
# session.add(new_stud)
# session.commit()

erg = session.query(Studenten).all()
#print(erg)
for e in erg:
    print(e.MatrNr)


erg = session.query(Professoren).filter_by(Name="Sokrates").all()
#print(erg)
for e in erg:
    print(e.Name)


erg = session.query(Vorlesungen).all()
#print(erg)
for e in erg:
    print(e.gelesen.Name)

#erg = session.query(hoeren).all()[1:4]
erg = session.query(hoeren).limit(2).all()
for e in erg:
    print("%s liest %s" % (e.Student.Name, e.Vorlesung.Titel))