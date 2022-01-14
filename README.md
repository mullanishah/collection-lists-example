# collection-lists-example
```Github Pages URL``` <a href="https://mullanishah.github.io/collection-lists-example/">https://mullanishah.github.io/collection-lists-example/</a>

<br>An assignment/task/example illustrating functionalities and usages provided by List implementation class ie. ArrayList in Java. 

In a nutshell, Collection framework provides utility classes and interfaces that are readymade implementation of various data structures and algorithms. Whereas, List interface implementation classes stores elements in ordered fashion.

In this example, I have tried to utilise capabilities and functions provided by ArrayList class in the Collection framework. Here I have considered a imaginary Customer management system with features such as register, sort and unsubscribe customers. This is a plain old Core Java application without any database, threading or file handling capabilities; intended to keep focus purely on Collection framework.

In order to execute the application, run MainTester class from com.core.tester package. Upon program execution, user will be asked to select appropriate option from the list of Menus to perform following operations:
|    |                                   | List class method used                             |
|----|-----------------------------------|----------------------------------------------------|
| 1) | Register new customer             | (ArrayList.add(Object))                            |
| 2) | Unsubscribe existing customer     | (ArrayList.remove(index))                          |
| 3) | Update password                   | (ArrayList.contains(object) and pwd setter(value)) |
| 4) | Display customer detail           | (ArrayList forEach iterator and Object.equals())   |
| 5) | Sort customers (on Email)         | (Natural sorting, Comparable interface)            |
| 6) | Sort customers (on Reg.Amount)    | (Custom Sorting, Comparator interface)             |
| 7) | Display all customers             | (forEach iterator() and object getters())          |

<b>Output:</b>
```Output
### MENU ### 
1.Register new customer       2.Unsubscibe existing 
3.Update password             4.Display details 
5.Sort(On Email)              6.Sort(on Reg.Amount) 
7.Display all customers       8.Exit
Enter your choice: 
1
Do you want to add more customer: (y/n)
y
Enter email id:
emma.watson@rediff
Enter remaining details (Name, Password, B'Date (dd/MM/yyyy), Reg.Amount): 
Emma Watson
******
12/12/1990
21000
Customer details registered successfully!!
Do you want to add more customer: (y/n)
n
==================================
### MENU ### 
1.Register new customer       2.Unsubscibe existing 
3.Update password             4.Display details 
5.Sort(On Email)              6.Sort(on Reg.Amount) 
7.Display all customers       8.Exit
Enter your choice: 
2
Enter Email Id to unsubscribe: 
test@gmail
Customer details erased successfully, 
details: Customer [custId=0, name=test, email=test@gmail, password=123456, birthdate=09/09/1999, regAmount=15000.0]
==================================
### MENU ### 
1.Register new customer       2.Unsubscibe existing 
3.Update password             4.Display details 
5.Sort(On Email)              6.Sort(on Reg.Amount) 
7.Display all customers       8.Exit
Enter your choice: 
5

Customer list before sort: 
David Darwin[davin.darwin@gmail.com, 21/01/1988, 11200.0]
Sean Bean[bean1992@yahoo.co.in, 06/08/1990, 14590.0]
Sir Paul McKellen[paul.mckellen@hotmail.com, 31/05/1987, 9210.0]
Mrs Alice Smith[iamalice@rediff.com, 17/10/1984, 11090.0]
A R Beevers[mr.beevers@yahoo.in, 09/09/1989, 17590.0]
Emma Watson[emma.watson@rediff, 12/12/1990, 21000.0]

Customer list after sort: (On email)
Sean Bean[bean1992@yahoo.co.in, 06/08/1990, 14590.0]
David Darwin[davin.darwin@gmail.com, 21/01/1988, 11200.0]
Emma Watson[emma.watson@rediff, 12/12/1990, 21000.0]
Mrs Alice Smith[iamalice@rediff.com, 17/10/1984, 11090.0]
A R Beevers[mr.beevers@yahoo.in, 09/09/1989, 17590.0]
Sir Paul McKellen[paul.mckellen@hotmail.com, 31/05/1987, 9210.0]
```

<b>Thank you.<br>
Shahrukh Mullani </b>
      


