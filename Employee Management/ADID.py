import sys

class Employee:  ## defined class employee
    def __init__(self):  ##defined inbuilt consructor
        pass
    def Add_Emp(self,Empid,Ename,sal,Deptno):  ## adding employees using the ofject reference self and other parameter Id name salary and departmeant
        self.Empid = Empid   #setting id acc to user
        self.Ename = Ename   #setting name acc to user
        self.sal = sal       #setting salary acc to user
        self.Deptno =Deptno  #setting department acc to user
        f = open("emp.txt","a+")  #open the file for appending won't use write as previous data need to be stored
        f1 = open("emp.txt","r")  #open the file for reading the data
        list1 = [] #creating a list
        lines = [line.rstrip() for line in f1] # accesing different lines of the file
        ##print(lines)
        for i in range(0,len(lines)):    #reading every line
            list1 = lines[i].split(" ")  #Reading every word
            if list1[0]==Empid:          #Checking if employee id exists in the system
                return ("Employee ID already existes") #asking user to choose an alternate id
        f.write('\n')  #Writing values in the file
        f.write(Empid)
        f.write(" ")
        f.write(Ename)
        f.write(" ")
        f.write(sal)
        f.write(" ")
        f.write(DeptNo)
        return "Employee added successfully"
    def Display_Emp(self):
        f = open("emp.txt","r")  #Printing the employee details
        print(f.read())
    def Seprate_Data(self):
        f = open("emp.txt","r")  #reading employee file
        e10 = open("emp_10.txt","w") #write 10 file
        e20 = open("emp_20.txt", "w") #write e20 dile
        e30 = open("emp_30.txt", "w") #write e30 file
        lines = [line.rstrip() for line in f]
        for i in range(0, len(lines)):
            list2 = lines[i].split(" ")
            if(int(list2[3])==10):
                for i in range (0,len(list2)):
                    e10.write(list2[i]+" ")
                e10.write('\n')
            elif(int(list2[3])==20):
                for i in range(0, len(list2)):
                    e20.write(list2[i] + " ")
                e20.write('\n')
            else:
                for i in range(0, len(list2)):
                    e30.write(list2[i] + " ")
                e30.write('\n')
        return "Data Seprated"
class digLim(Exception): #Exception for min 3 digit of employee id
    pass
class deptWr(Exception): #Checking if department id dosen't accept any valus other than 10,20 and 30
    pass
class salary(Exception):#Salary should be gretaer than 3000
    pass
while(True):
    print("\n Select the desired option: ")
    print("1. Add Employee")
    print("2. Display Employee")
    print("3. Seprate Date")
    print("4. Exit")
    num = input("\n")
    num=int(num)
    emp = Employee()
    if num==1:
        try:
            EmpId = input("Enter Employee Id ")
            if len(EmpId)<3:
                raise digLim
            Ename = input("Enter Employee Name ")
            sal = input("Enter Employee Salary ")
            if int(sal)<3000:
                raise salary
            DeptNo = input("Enter Department Number ")
            if DeptNo=='10' or DeptNo=='20' or DeptNo=='30':
                pass
            else:
                raise deptWr
            print(emp.Add_Emp(EmpId,Ename,sal,DeptNo))
        except digLim:
            print("Employee Id consists of minimum 3 digits")
        except salary:
            print("Minimum Salary: 3000")
        except deptWr:
            print("Department Numers: 10,20,30")
    elif num==2:
        emp.Display_Emp()
    elif num==3:
        print(emp.Seprate_Data())
    elif num==4:
        print("Thank you for using the Employee Management System")
        exit(0)
    else:
        print("Enter Correct Option")