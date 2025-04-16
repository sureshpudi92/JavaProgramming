Day-14
-------
Inheritance
----------
Aquiring all the properties(Variables) & behaviour(methods) from one class to another class is called inheritance.

Objective
---------
1) re-usability
2) Avoid duplication

types
-----------
1) single
2) multi level
3) hierarchy
4) multiple()-- not supported in java,but we can achieve it by using interface.


public static void main(String args[])
{

}

public - access modifier
static - directly called by JVM ( without object)
void - no returned value
String args[] --- String type array


public static void main(String a[])    // valid
{
}


public static void main(String []a)   //valid
{
}

void main(String args[]) public static   // invalid
{
}

public static void main(int a[]) //not valid
{
}

static public void main(String args[])   //valid
{
}

static void public main(String args[])   //in valid
{
}

Interview Question:
1.why we can not extends multiple classes
Ans: because of ambiguity,ambiguity means confusion, 
if we have two classes with same method name and we are trying to call that method from child class
then it will be confusion for JVM which method to call.
if we do not have any method with same name in parent class then also it will be confusion for JVM,
because Object is a default class which extends by default whcih have some common methods.

