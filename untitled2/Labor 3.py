from sqlalchemy import Integer, String, Column, Date, create_engine, ForeignKey, select
from sqlalchemy.orm  import sessionmaker, relationship
from sqlalchemy.ext.declarative import declarative_base
from sqlalchemy import func, and_

Base = declarative_base()

class Employees(Base):
    __tablename__ = 'employees'
    emp_no = Column(Integer, primary_key=True)
    birth_date=Column(Date)
    first_name=Column(String)
    last_name=Column(String)
    gender=Column(String(1))
    hire_date=Column(Date)

class Departments(Base):
    __tablename__ = 'departments'
    dept_no = Column(String, primary_key=True)
    dept_name = Column(String, unique=True)
    dept_emp=relationship("Dept_emp")

class Dept_emp(Base):
    __tablename__ = 'dept_emp'
    emp_no = Column(Integer,ForeignKey('employees.emp_no'), primary_key=True)
    dept_no = Column(String,ForeignKey('departments.dept_no'))
    from_date = Column(Date,primary_key=True)
    to_date = Column(Date)
    dept=relationship("Departments", back_populates="dept_emp")
    emp=relationship("Employees", back_populates="dept_emp")

Departments.dept_emp = relationship("Dept_emp", back_populates="dept")
Employees.dept_emp = relationship("Dept_emp", back_populates="emp")

class Salary(Base):
    __tablename__='salaries'
    emp_no=Column(Integer,ForeignKey('employees.emp_no'), primary_key=True)
    salary=Column(Integer)
    from_date=Column(Date)
    to_date=Column(Date, primary_key=True)
    emp=relationship("Employees",back_populates="salary")
    def __str__(self):
        return 'Salary '+str(self.emp_no) + " " +str(self.salary)
Employees.salary = relationship("Salary", back_populates="emp", cascade="delete, delete-orphan")

#Erstellen der Engine für den Datenbankzugriff
engine = create_engine("mysql://root:1009@localhost/employees")
#c = engine.connect()
Session = sessionmaker()
Session.configure(bind=engine)
session = Session()


empl=session.query(Employees).filter_by(emp_no=-70).one()
empl= None

erg = session.query(Employees).filter_by(emp_no="-70").one()
for e in erg.salary:
    print(e.salary)




print(empl.dept_emp)