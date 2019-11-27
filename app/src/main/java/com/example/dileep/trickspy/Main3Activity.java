package com.example.dileep.trickspy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {
    TextView tv1,tv2,tv3,tv4,tv5,tv6,tv7,tv8,tv9,tv10,tv11,tv12,tv13,tv14,tv15,tv16,tv17,tv18,tv19,
            tv20,tv21,tv22,tv23,tv24,title,ex1,ex2,ex3,ex4,ex5,ex6,ex7,ex8,ex9,ex10,ex11,ex12;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        int a=getIntent().getIntExtra("id",1);
        tv1=(TextView)findViewById(R.id.tv1);
        title=(TextView)findViewById(R.id.title);
        tv2=(TextView)findViewById(R.id.tv2);
        tv3=(TextView)findViewById(R.id.tv3);
        tv4=(TextView)findViewById(R.id.tv4);
        tv5=(TextView)findViewById(R.id.tv5);
        tv6=(TextView)findViewById(R.id.tv6);
        tv7=(TextView)findViewById(R.id.tv7);
        tv8=(TextView)findViewById(R.id.tv8);
        tv9=(TextView)findViewById(R.id.tv9);
        tv10=(TextView)findViewById(R.id.tv10);
        tv11=(TextView)findViewById(R.id.tv11);
        tv12=(TextView)findViewById(R.id.tv12);
        tv13=(TextView)findViewById(R.id.tv13);
        tv14=(TextView)findViewById(R.id.tv14);
        tv15=(TextView)findViewById(R.id.tv15);
        tv16=(TextView)findViewById(R.id.tv16);
        tv17=(TextView)findViewById(R.id.tv17);
        tv18=(TextView)findViewById(R.id.tv18);
        tv19=(TextView)findViewById(R.id.tv19);
        tv20=(TextView)findViewById(R.id.tv20);
        tv21=(TextView)findViewById(R.id.tv21);
        tv22=(TextView)findViewById(R.id.tv22);
        tv23=(TextView)findViewById(R.id.tv23);
        tv24=(TextView)findViewById(R.id.tv24);
        LinearLayout l1=(LinearLayout)findViewById(R.id.ll1);
        ex1 = findViewById(R.id.ex1);
        ex2=findViewById(R.id.ex2);
        ex3=findViewById(R.id.ex3);
        ex4=findViewById(R.id.ex4);
        ex5=findViewById(R.id.ex5);
        ex6=findViewById(R.id.ex6);
        ex7=findViewById(R.id.ex7);
        ex8=findViewById(R.id.ex8);
        ex9=findViewById(R.id.ex9);
        ex10=findViewById(R.id.ex10);
        ex11=findViewById(R.id.ex11);
        ex12=findViewById(R.id.ex12);
        switch(a){
            case 1:
                title.setText("Basic Input/Output and Typecasting");
                tv1.setText("1. Reading the Input");
                tv2.setText("input()");
                tv3.setText("2.Taking the input as different formats\n(Data Types)");
                tv4.setText("a=int(input())   #for int\nb=float(input()) #for float\nc=input()#for char and string");
                tv5.setText("3. Displaying the output");
                tv6.setText(" print('Trickspy')\n#OUTPUT: 'Trickspy");
                tv7.setText("4. Printing with a Format");
                tv8.setText("print('Hey {name},there is\n {one} website.'.\nformat(name='Users',one='Trickspy'))");
                tv9.setText("5. Using '_' as a variable in REPL shell");
                tv10.setText(">>> 23 + 3\n23\n>>> _\n23\n>>> print(_)\n23");
                tv11.setText("6. Converting number to string");
                tv12.setText("a=10\nprint(str(a))\n#OUTPUT: '10'");
                tv13.setText("7. Converting Decimal number to Binary");
                tv14.setText("a=10\nprint(bin(a))\n#OUTPUT: '0b1010'");
                tv15.setText("8. Converting Decimal number to Octa");
                tv16.setText("a=10\nprint(bin(a))    #OUTPUT: '0b1010'");
                tv17.setText("9. converting Decimal number to Hexa Decimal");
                tv18.setText("a=10\n print(hex(a))    #OUTPUT: '0xa'");
                tv19.setText("10. Declaring multiple variables\nAssigning values to them");
                tv20.setText("a,b,c=10,20,30\nprint(a,b,c,sep=' ')\n#OUTPUT:10   20   30");
                tv21.setText("11. PROGRAM:\nSwapping of two  numbers \nin just three lines");
                tv22.setText(" a,b=10,20\na,b=b,a\nprint(a,b)\n#OUTPUT: 20 10");
                tv23.setText("12. PROGRAM:\n To display the Decimal\nBinary Octal and Hexa Decimal \nnumbers");
                tv23.setMaxHeight(200);
                tv24.setText(" d,o,h,bi=[],[],[],[]\n" +
                        "      for i in range(n):\n" +
                        "            d.append(i+1)\n" +
                        "            a=oct(i+1)\n" +
                        "            o.append(int(a[2:]))\n" +
                        "            b=hex(i+1)\n" +
                        "            h.append(b[2:])\n" +
                        "            c=bin(i+1)\n" +
                        "            bi.append(int(c[2:]))\n" +
                        "        for j in range(n):\n" +
                        "           if h[j].isdigit():\n" +
                        "               h[j]=int(h[j])\n" +
                        "           elif h[j].isalpha():\n" +
                        "                h[j]=h[j].upper()\n" +
                        "        for i in range(n):\n" +
                        "            print(d[i],o[i],h[i],bi[i])");

                ex1.setText("In python the input is taken by the 'input()' function.The input taken is in the form of string");
                l1.removeView(ex2);
                ex3.setText("The OUTPUT is displayed on to the shell using print() function. ");
                ex4.setText("This is a quite powerful feature as it alows for rearranging the order of display without changing the arguments passsed to the format function.");
                ex5.setText("'_' is used as a temporary variable .It represents the result of the last expression evaluated by the interpreter.");
                ex6.setText("Here the integer number is converted into string by using str() function. ");
                ex7.setText("Here bin() is a function in python that converts the given number into binary format. ");
                ex8.setText("Here oct() is a function in python that converts the given number into octa decimal format. ");
                ex9.setText("Here the hex() function is used to convert a decimal to hexa-decimal format. ");
                ex10.setText("Here the a b c variables are created at a time and the values of the variables are assigned according to their position.\n" +
                        "Here the sep word is used so that the values are seperated using the specifier.");
                l1.removeView(ex11);
                ex12.setText("Here the a b c variables are created at a time and the values of the variables are assigned according to their position.\n" +
                        "Here the sep word is used so that the values are seperated using the specifier.");
                break;


            case 2:
                title.setText("Conditional and looping statements");
                tv1.setText("1. if statement");
                tv2.setText("x=10\n" +
                        "if x>5:\n" +
                        "  print('python')    #OUTPUT :python");
                tv3.setText("2. Taking input in a if condition");
                tv4.setText("if int(input())>10:\n" +
                        "\tprint('hello')   #OUTPUT: hello");
                tv5.setText("3. if-elif statements");
                tv6.setText("n=int(input())\n" +
                        "if(n>10):\n" +
                        "\tprint('the no is greater than 10')\n" +
                        "elif(n<10):\n" +
                        "\tprint(\"the no. is less than 10\")");
                tv7.setText("4. if-elif-else statements");
                tv8.setText("n=int(input())\n" +
                        "if(n>10):\n" +
                        "   print('the no is greater than 10')\n" +
                        "elif(n<10):\n" +
                        "   print(\"the no. is less than 10\")\n" +
                        "else:\n" +
                        "   print(\"the no is equal to 10\")");
                tv9.setText("5. for loop");
                tv10.setText("for i in range(5):\n" +
                        "   print('hello')");
                tv11.setText("6. Printing a string for n times without a variable in the loop.");
                tv12.setText("for _ in range(5):\n" +
                        "    print('hello')");
                tv13.setText("7. Taking the input directly in the for loop.");
                tv14.setText("for i in range(int(input())):\n" +
                        "    print('hello')");
                tv15.setText("8. Break statement");
                tv16.setText("for i in range(5):\n" +
                        "    if(i==3):\n" +
                        "        break\n" +
                        "    print(i)");
                tv17.setText("9. continue statement");
                tv18.setText("for i in range(5):\n" +
                        "    if(i==3):\n" +
                        "        continue\n" +
                        "    print(i)");
                tv19.setText("10. pass statement");
                tv20.setText("for i in 'prasad':\n" +
                        "        if i=='s':\n" +
                        "            pass\n" +
                        "        else:\n" +
                        "            print(i)");
                tv21.setText("11. while loop");
                tv22.setText("i=0\n" +
                        "while(i<2):\n" +
                        "\tprint(i)\n" +
                        "\ti+=1");
                tv23.setText("12. infinite while loop");
                tv24.setText("while(True):\n" +
                        "    print('**')");

                ex1.setText("The if statement is a single conditional check statement.if the given condition is satisfied then the block of code is executed.");
                ex2.setText("Here the input is directly taken from in the if condition. ");
                ex3.setText("if more than one if statement is needed then we make use of the elif statement.first it checks if condition if the condition is evaluated to false then the elif consecutive elif statement is executed. There may be any no of elif followed by a single if. NOTE:USER is not allowed to write any statements in b/w if elif and else statements. ");
                ex4.setText("if none of the conditions in the if or elif(s) are evaluated to true then the else block is executed. ");
                ex5.setText("for is a looping function.which iterates over element by element in some given data. ");
                ex6.setText("here we are using the symbol '_'(underscore) instead of using a variable.As _ serves as a temporary variable.");
                l1.removeView(ex7);
                ex8.setText("It is used to break the loop when a given condition is satisfied. ");
                ex9.setText("the 'continue' statement is used to skip all the code written below ");
                ex10.setText("The 'pass' keyword is a null statement.It is used when we want to perform nothing on any particular iteration  ");
                ex11.setText("The while loop is also used iterate but based on some condition the loop repeates until the given condition becomes false");
                ex12.setText("The condition in the while loop never gets false so the OUTPUT is printed n number of times. ");
                break;
            case 3:
                title.setText("DataStructures");
                tv1.setText("1. creating a list and entering elements to a list.");
                tv2.setText("list=[]\n" +
                        "list.append(1)\n" +
                        "list.append(2)\n" +
                        "list.append(3)");
                tv3.setText("2. Reversing a list elements with list method and without list method");
                tv4.setText("list=[1,2,3,334,55,543]\n" +
                        "'''using list method '''\n" +
                        "print(list.reverse())    #OUTPUT :[543, 55, 334, 3, 2, 1]\n" +
                        "'''without using list method'''\n" +
                        "print(list[::-1])     #OUTPUT: [543, 55, 334, 3, 2, 1]");
                tv5.setText("3. Inserting a individual character of a string to list.");
                tv6.setText("list=[]\n" +
                        "print(list.extend('python'))\n" +
                        "#OUTPUT : ['p', 'y', 't', 'h', 'o', 'n']");
                tv7.setText("4. sorting a list in ascending order.");
                tv8.setText("list=[1,3,5,2,4]\n" +
                        "print(list.sort())   #OUTPUT :[1,2,3,4,5]");
                tv9.setText("5. sorting the list of elements in the desending order");
                tv10.setText("list=[1,3,5,2,4]\n" +
                        "print(sorted(list,reverse=True))  #OUTPUT :[5,4,3,2,1]");
                tv11.setText("6. Creating a dynamic lists inside a list.");
                tv12.setText("list=[]\n" +
                        "n=int(input())\n" +
                        "for _ in range(n):\n" +
                        "    list.append([])");
                tv13.setText("7. Removing Duplicates of the list.\n");
                tv14.setText("list=[1,1,2,3,4,4,5]\n" +
                        "print(list(set(list)))   #OUTPUT: [1,2,3,4,5]");
                tv15.setText("8. creating a tuple.");
                tv16.setText("t=(1,2,3,4,)");
                tv17.setText("9. unpacking the values of a tuple.\n");
                tv18.setText("t=(1,2,3,4)\n" +
                        "a,b,c,d=t\n" +
                        "print(a,b,c,d)\n" +
                        "\n" +
                        "#OUTPUT: 1 2 3 4");
                tv19.setText("10. joining the keys of a dictionary to a string.");
                tv20.setText("e={'python':4423819,'one':1221}\n" +
                        "print(' %% '.join(e))     #Output :: python %% one");
                tv21.setText("11. copy a dictionary to a variable");
                tv22.setText("d={1:12,32:13,34.53:12345,43.2:3}\n" +
                        "w=d.copy()\n" +
                        "print(w)        #OUTPUT :: {32: 13, 34.53: 12345, 43.2: 3}");
                tv23.setText("12. merging two dictionaries");
                tv24.setText("x={'a':1,'b':2}\n" +
                        "y={'c':3,'d':4}\n" +
                        "z={**x,**y}\n" +
                        "print(z)\n" +
                        "#OUTPUT :{'a': 1, 'b': 2, 'c': 3, 'd': 4}");

                ex1.setText("Here the append() method in list is used to add the specified element at the end of the list ");
                ex2.setText("revserse() is the method in the list which is used for reversing and list can also be sliced to be reversed. ");
                ex3.setText("extend() is the method used to enter a string of elements into the list.Its a iteratable function ");
                ex4.setText("sort() is the method to sort the given list in ascending order ");
                ex5.setText("sorted() is one of the method in python that is used to sort the given items in any order specified. ");
                l1.removeView(ex6);
                ex7.setText("Here the method set is used to sort and remove the Duplicates values in a list ");
                ex8.setText("Here the tuple t is ended with a (,) to tell python that you have defined a singleton tuple. ");
                ex9.setText("Here the values of a tuple is assigned to the variables. ");
                ex10.setText("Here the keys of a dictionary are joined to a string using join function. ");
                ex11.setText("Here the copy method in dictionary copies a dictionary to a variable. ");
                l1.removeView(ex12);
                break;
            case 4:
                title.setText("Conditional and looping statements");
                tv1.setText("1. Decimals as an input");
                tv2.setText("a=str(int(input()))\n#OUTPUT: '123'");
                tv3.setText("2. Concatenation of two strings using '+' operator.");
                tv4.setText("s='python'\n" +
                        "s+=' tricks'       #OUTPUT: 'python tricks'");
                tv5.setText("3. The no of occurance's of a character in a string.");
                tv6.setText("s='python tricks'\n" +
                        "s.count('t')       #OUTPUT: 2");
                tv7.setText("4. Length of a string.");
                tv8.setText("s='python tricks'len(s)\n#OUTPUT:13");
                tv9.setText("5. Printing the given string in the Reverse order.");
                tv10.setText("s='python tricks'\n" +
                        "s[::-1] \n#OUTPUT: 'skcirt nohtyp'");
                tv11.setText("6. Removing the specified characters from begining to end in a string.");
                tv12.setText("s='abc*'\n" +
                        "s.strip('*')     #OUTPUT: 'abc'");
                tv13.setText("7. To check whether the string contains the characters other than alphabets and numbers.");
                tv14.setText("s='abc143'\n" +
                        "s.isalnum()      #OUTPUT: True");
                tv15.setText("8. To compute the Expression given in a string.");
                tv16.setText("s='2+3'\n" +
                        "print(eval(s))        #OUTPUT:  5");
                tv17.setText("9. making a string into partitions.");
                tv18.setText("s='i could work on python all day'\n" +
                        "s.partition('python')   #OUTPUT: ('i could work on ','python',' all day')");
                tv19.setText("10. joining a tuple or a list to a string.");
                tv20.setText("d=('programmers','love','python')\n" +
                        "print(' $$ '.join(d))    #OUTPUT:  programmers $$ love $$ python");
                tv21.setText("11. PROGRAM: To print a name randomly from a string using Random module.");
                tv22.setText("str='i love python programming'\n" +
                        "x=str.split()\n" +
                        "y=len(x)\n" +
                        "import random\n" +
                        "z=random.randrange(-1,y)\n" +
                        "print(x[z])");
                tv23.setText("12. PROGRAM: Reverse of a number by taking number as an input.");
                tv24.setText("print(str(int(input()))[::-1])");

                ex1.setText("In the code int type of input is taken and then typecasted to string type. ");
                ex2.setText("The given string is concated to the last of the specified string.");
                ex3.setText("If we would like to count the occurance of any character then the function 'count()' is used.");
                ex4.setText("To find the length of the string 'len()' function is used. ");
                ex5.setText("The slicing operator in python can be used to print the given string in Reverse order. ");
                ex6.setText("The 'strip()' function is used to remove the given character from the specified string. ");
                ex7.setText("The 'isalnum()' function in python returns True if the given string consists of only alphanumeric characters else returns False.");
                ex8.setText("The eval() method parses the expression passed to this method and runs python expression (code) within the program.");
                ex9.setText("The 'partition()' function is used to partition the given string to three tuple items based om the string specified in the arguments.if the specified arg is not found in the given string then it makes the last two tuple items to empty Strings. ");
                ex10.setText("The join() function is used to concat the given list or tuple of items separating by the specified characters. ");
                ex11.setText("*random.randrange() function gives a random number within the parameters specified. ");
                ex12.setText("Here the taken integer input is converted into string using str() function and slicing is applied for reversing the number.");
                break;
            case 5:
                title.setText("Modules");
                tv1.setText("1. Factorial function in math module");
                tv2.setText("import math\n" +
                        "print(math.factorial(5))\n#OUTPUT: 720");
                tv3.setText("2. finding the gcd of two given numbers");
                tv4.setText("import math\n" +
                        "print(math.gcd(10,20))\n#OUTPUT: 10");
                tv5.setText("3. picking a random of string using method");
                tv6.setText("import random\n" +
                        "s='hello python is awesome'.split(' ')\n" +
                        "print(random.choice(s))   #OUTPUT: 'python'");
                tv7.setText("4. picking a random number between two consecutive intervals");
                tv8.setText("import random\n" +
                        "a=int(input())\n" +
                        "b=int(input())\n");
                tv9.setText("5. permutations of a sequence.");
                tv10.setText("import itertools\n" +
                        "print(list(itertools.permutations('12',2)))\n#OUTPUT: [('1', '2'), ('2', '1')]");
                tv11.setText("6. combinations of a sequence");
                tv12.setText("import itertools\n" +
                        "print(list(itertools.combinations('1234',2)))\n #OUTPUT:[('1', '2'), ('1', '3'), ('1', '4'), ('2', '3'), ('2', '4'), ('3', '4')]");
                tv13.setText("7. combinations with replacement of a sequence");
                tv14.setText("import itertools\n" +
                        "print(list(itertools.combinations_with_replacement('123',2)))   \n#OUTPUT: [('1', '1'), ('1', '2'), ('1', '3'), ('2', '2'), ('2', '3'), ('3', '3')]");
                tv15.setText("8. printing a fixed no of characters from a given string.");
                tv16.setText("import textwrap\n" +
                        "textwrap.wrap('abcdefgh',4)\n#OUTPUT:['abcd', 'efgh']");
                l1.removeView(tv17);
                l1.removeView(tv18);
                l1.removeView(tv19);
                l1.removeView(tv20);
                l1.removeView(tv21);
                l1.removeView(tv22);
                l1.removeView(tv23);
                l1.removeView(tv24);


                ex1.setText("factorial is a method in math module which gives the factorial of a given number. ");
                ex2.setText("Here the gcd() function is used ");
                ex3.setText("choice is a function in random module used to pick random word. ");
                ex4.setText("uniform method used to pick a random number from two intervals ");
                ex5.setText("permutations method takes two arguments i.e; the string that is to be permuted and the no.of digits for each permutations");
                ex6.setText("combinations method takes two arguments i.e; the string that is to be combinations and the no of digits for each combination.");
                ex7.setText("combinations_with_replacement is a method that combines the elements with replacing the elements of the sequence.");
                ex8.setText("Wraps the single paragraph in text (a string) so every line is at most width characters long. Returns a list of output lines, without final newlines.");
                l1.removeView(ex9);
                l1.removeView(ex10);
                l1.removeView(ex11);
                l1.removeView(ex12);
                break;
            case 6:
                title.setText("Defining the predefined functions.");
                tv1.setText("1. Defining split function in string module");
                tv2.setText("def spli(str,sep=' '):\n" +
                        "      index=0\n" +
                        "      string=''\n" +
                        "      list=[]\n" +
                        "      while index<len(str):\n" +
                        "\tif(str[index]!=sep):\n" +
                        "\t\tstring+=str[index]\n" +
                        "\telif(str[index]==sep):\n" +
                        "\t\tlist.append(string)\n" +
                        "\t\tstring=''\n" +
                        "\tindex+=1\n" +
                        "\tif string:list.append(string)\n" +
                        "\treturn(list)");
                tv3.setText("2. Defining lstrip,rstrip fun in string module");
                tv4.setText("\"def lstrip(str):\\n\" +\n" +
                        "            \"    string=''\\n\" +\n" +
                        "            \"    for i in str:\\n\" +\n" +
                        "            \"        if ord(i) in range(32,47+1) or ord(i) in range(58,64+1) or ord(i) in range(91,96+1) or ord(i) in range(123,126+1):\\n\" +\n" +
                        "            \"            continue\\n\" +\n" +
                        "            \"        else:\\n\" +\n" +
                        "            \"            string+=i\\n\" +\n" +
                        "            \"    return string\";");
                tv5.setText("3. append function in list module");
                tv6.setText("\"def append(l,n):\\n\" +\n" +
                        "            \"    return l+[n]\";");
                tv7.setText("4. max function in list,tuple modules");
                tv8.setText("\"def maxi(l):\\n\" +\n" +
                        "            \" maxi=0\\n\" +\n" +
                        "            \" for i in l:\\n\" +\n" +
                        "            \"    if(i>maxi):\\n\" +\n" +
                        "            \"        maxi=i\\n\" +\n" +
                        "            \" return maxi\";");
                tv9.setText("5. min function in list,tuple modules");
                tv10.setText("\"def mini(l):\\n\" +\n" +
                        "            \"    mni=l[0]\\n\" +\n" +
                        "            \"    for i in l[1:]:\\n\" +\n" +
                        "            \"        if(i < mni):\\n\" +\n" +
                        "            \"            mni=i\\n\" +\n" +
                        "            \"    return mni\";");
                tv11.setText("6. length function (len()) and index function (index()) in list,tuple modules");
                tv12.setText("def length(list):\\n\" +\n" +
                        "            \"    if list:\\n\" +\n" +
                        "            \"        return 1+length(list[1:])\\n\" +\n" +
                        "            \"    else:\\n\" +\n" +
                        "            \"        return 0\\n\" +\n" +
                        "            \"def index(list,n):\\n\" +\n" +
                        "            \"    for i in range(length(list)):\\n\" +\n" +
                        "            \"        if n in list:\\n\" +\n" +
                        "            \"          a=i\\n\" +\n" +
                        "            \"    return a\";");
                tv13.setText("7. sum() function in list,tuple modules");
                tv14.setText("def sum_(ds):\\n\" +\n" +
                        "            \"    s=0\\n\" +\n" +
                        "            \"    for i in ds:\\n\" +\n" +
                        "            \"        s+=i\\n\" +\n" +
                        "            \"    return s\";");
                l1.removeView(tv15);
                l1.removeView(tv16);
                l1.removeView(tv17);
                l1.removeView(tv18);
                l1.removeView(tv19);
                l1.removeView(tv20);
                l1.removeView(tv21);
                l1.removeView(tv22);
                l1.removeView(tv23);
                l1.removeView(tv24);
                ex1.setText("Here the function named spli represents split function in string module.");
                l1.removeView(ex2);
                l1.removeView(ex3);
                ex4.setText("Here the function name is defined as maxi because max is the function in the module");
                ex5.setText("Here the function name is defined as mini because min is the function in the module");
                ex6.setText("Here length function represents the len() function.");
                ex7.setText("Here the function name is defined as sum_ because sum() is the predefined method.Implement the above functions with your own examples for better understanding.");
                l1.removeView(ex8);
                l1.removeView(ex9);
                l1.removeView(ex10);
                l1.removeView(ex11);
                l1.removeView(ex12);
                break;
            case 7:
                title.setText("data base with ORACLE");
                tv1.setText("1. installing the cx_Oracle module for python 2.7 and 3.5 or higher.\n" +
                        "open command prompt and type the following.");
                tv2.setText("pip install cx_Oracle");
                tv3.setText("2. import the module in the python script");
                tv4.setText("import cx_Oracle");
                tv5.setText("3. Make a connection to an Oracle database by passing in the appropriate user/password to the following connection string:");
                tv6.setText("connection = cx_Oracle.connect('user_name/password')");
                tv7.setText("4. Define a parameter to access the cursor method. This parameter connects to the Oracle instance:");
                tv8.setText("cursor = connection.cursor()");
                tv9.setText("5. Create a query string:");
                tv10.setText("querystring = 'pass any query that you want to execute'");
                tv11.setText("6. Pass the query string to the cursor method:");
                tv12.setText("a=cursor.execute(querystring)");
                tv13.setText("7. converting the above output to list and assigning to a variable");
                tv14.setText("d=list(a)");
                l1.removeView(tv15);
                l1.removeView(tv16);
                l1.removeView(tv17);
                l1.removeView(tv18);
                l1.removeView(tv19);
                l1.removeView(tv20);
                l1.removeView(tv21);
                l1.removeView(tv22);
                l1.removeView(tv23);
                l1.removeView(tv24);


                l1.removeView(ex1);
                ex2.setText("Ensure that you have fullfilled the prerequistics of Downloading the module. ");
                ex3.setText("If an error is returned containing the message Error: No module named cx_Oracle, verify the installation of the cx_Oracle module.");
                l1.removeView(ex4);
                ex5.setText("you can pass any DML queries on the existing tables in your database ");
                ex6.setText("This returns a output like 'cx_Oracle.Cursor on cx_Oracle.Connection to user system@local' ");
                ex7.setText("We can apply any operations on the list. ");
                l1.removeView(ex8);
                l1.removeView(ex9);
                l1.removeView(ex10);
                l1.removeView(ex11);
                l1.removeView(ex12);
                break;
            case 8:
                title.setText("MS ACCESS connection ");
                tv1.setText("1. installing pyodbc package \n" +
                        "open command prompt do the following process");
                tv2.setText("pip install pyodbc");
                tv3.setText("2. create a table in MS access and save it in any location you want.\n" +
                        "see the below image to know creating a table in ms Access.");
                tv4.setVisibility(View.INVISIBLE);
                tv5.setText("3. The Access database is stored on my under the following path (where testdb is the MS Access file name within that path, while accdb is the MS Access file type):");
                tv6.setText("c:/users/documents/Database1.accdb");
                tv7.setText("4. To connect python to ms access\n" +
                        "step 1: open IDLE type ");
                tv8.setText("import pyodbc");
                tv9.setText("5. connecting to access database in your computer");
                tv10.setText("conn = pyodbc.connect(r'Driver={Microsoft Access Driver (*.mdb, *.accdb)};DBQ= type the path of the access database along with the file name and extension.')");
                tv11.setText("6. creating a cursor for executing query");
                tv12.setText("cursor = conn.cursor()");
                tv13.setText("7. creating a query statement in cursor.");
                tv14.setText("cursor.execute('the query you want to apply on the table')");
                tv15.setText("8. collecting the data from the table and Printing.");
                tv16.setText("for row in cursor.fetchall():\n" +
                        "    print (row)");
                tv17.setText("9. complete code");
                tv18.setText("import pyodbc\n" +
                        "conn = pyodbc.connect(r'Driver={Microsoft Access Driver (*.mdb, *.accdb)};DBQ=type the path of the database with the name and extension;')\n" +
                        "cursor = conn.cursor()\n" +
                        "cursor.execute('select * from tracking_sales')\n" +
                        "for row in cursor.fetchall():\n" +
                        "    print (row)");
                l1.removeView(tv19);
                l1.removeView(tv20);
                l1.removeView(tv21);
                l1.removeView(tv22);
                l1.removeView(tv23);
                l1.removeView(tv24);


                ex1.setText("This dowloads the pyodbc package and install's it in your system");
                ex2.setText("And this is how the table would look like in Access, where the table name is username: ");
                ex3.setText("This path is only for explanation. ");
                ex4.setText("importing pyodbc package into our python .");
                ex5.setText("Modify the path name (after the syntax DBQ=) to the path where your Access file is stored.End the path with a semicolon(;)");
                ex6.setText("");
                ex7.setText("replace with query in the execute function. ");
                ex8.setText("fetchall() function collects the data from table based on the query. ");
                l1.removeView(ex9);
                l1.removeView(ex10);
                l1.removeView(ex11);
                l1.removeView(ex12);
                break;
            case 9:
                title.setText("Miscelloneous programs");
                tv1.setText("1. Printing a calendar from no of months and starting day");
                tv2.setText("n=int(input('enter no of days in a month= '))\n" +
                        "#0=sunday\n" +
                        "#1=moday\n" +
                        "#2=tuesday\n" +
                        "#3=wednesday\n" +
                        "#4=thursday\n" +
                        "#5=friday\n" +
                        "#6=saturday\n" +
                        "d=int(input('enter the starting day of month= '))\n" +
                        "print('sun','mon','tue','wed','thu','fri','sat',sep='\\t')\n" +
                        "for j in range(d):\n" +
                        "    print (' ',end='\\t')\n" +
                        "i=1\n" +
                        "while(i<=n):\n" +
                        "    print (i,end='\\t')\n" +
                        "    if(i+d)%7==0:\n" +
                        "        print('\\t')\n" +
                        "    i=i+1\n" );
                tv3.setText("2. PROGRAM: Taking the rank of a number as a input and printing that number.(using itertools module)");
                tv4.setText("import itertools as it\n" +
                        "a=list(it.permutations('0123456789',10))\n" +
                        "n=int(input())\n" +
                        "print(a[n-1])\n");
                tv5.setText("3. PROGRAM: printing a bill on purchase of the items(using dictionary in a class)");
                tv6.setText("d={1:10,10:20,11:30,100:40,101:50,110:60,111:70,1000:80,1001:90,1010:100,1011:110,1100:120,1101:130,1110:140,1111:150}\n" +
                        "class shopping:\n" +
                        " def shop(self):\n" +
                        "  lst1=[]\n" +
                        "  lst2=[]\n" +
                        "  p=0\n" +
                        "  lst3=[]\n" +
                        "  while True:\n" +
                        "    c=int(input('BARCODE : '))\n" +
                        "    lst1.append(c)\n" +
                        "    if c!=000:\n" +
                        "        q=int(input('QUANTITY : '))\n" +
                        "        lst2.append(q)\n" +
                        "        p+=1\n" +
                        "        continue\n" +
                        "    else:\n" +
                        "        a=zip(lst1,lst2)\n" +
                        "        b=list(a)\n" +
                        "        print('\\t\\t\\t----BILL----\\n')\n" +
                        "        print('--------------------------------------------------------')\n" +
                        "        print('CODE     \\t QUANTITY \\t RATE \\t\\t AMOUNT')\n" +
                        "        print('--------------------------------------------------------')\n" +
                        "        for i in range(len(b)):\n" +
                        "            s=d[b[i][0]]*b[i][1]\n" +
                        "            lst3.append(s)\n" +
                        "            print(b[i][0],' \\t\\t  ',b[i][1],' \\t\\t ',d[b[i][0]],' \\t\\t ',lst3[i])\n" +
                        "        print('--------------------------------------------------------')\n" +
                        "        print('NO OF ITEMS PURCHASED = ',p)\n" +
                        "        print('TOTAL\\t\\t\\t\\t\\t\\t ',sum(lst3))\n" +
                        "        break\n" +
                        "     \n" +
                        " def __init__(self):\n" +
                        "     self.shop()\n" +
                        "c=shopping()");
                tv7.setText("4. PROGRAM: giving discount to a person in some area.if there are many persons from that area there should be a lucky dip(using all DataStructures methods)\n");
                tv8.setText("lis1=[]\n" +
                        "lis2=[]\n" +
                        "lis3=[]\n" +
                        "lis4=[]\n" +
                        "while True:\n" +
                        "    n=input('ENTER NAME: ').upper()\n" +
                        "    lis1.append(n)\n" +
                        "    a=int(input('ENTER AMOUNT : '))\n" +
                        "    lis2.append(a)\n" +
                        "    p=input('ENTER NATIVE PLACE : ').lower()\n" +
                        "    lis3.append(p)\n" +
                        "    ch=input('Continue y/n: ')\n" +
                        "    if(ch=='y' or ch=='Y'):\n" +
                        "        continue\n" +
                        "    elif(ch=='n' or ch=='N'):\n" +
                        "        x=zip(lis1,lis2,lis3)\n" +
                        "        y=list(x)\n" +
                        "        l=len(y)\n" +
                        "        for i in range(l):\n" +
                        "              if(y[i][2]=='abc'):\n" +
                        "                lis4.append(y[i])\n" +
                        "        g=len(lis4)\n" +
                        "        import random\n" +
                        "        p=random.randrange(-1,g)\n" +
                        "        print('LUCKY DIP WINNER IS ',lis4[p][0],'SECURED 100% DISCOUNT')\n" +
                        "        m=y.index(lis4[p])\n" +
                        "        y.remove(y[m])\n" +
                        "        l=len(y)\n" +
                        "        c,v,b=zip(*y)\n" +
                        "        for i in range(l):\n" +
                        "            print('amount to be paid by',c[i],'=',v[i])\n" +
                        "        break");
                tv9.setText("5. PROGRAM: highest marks scored by the students in a exam.(using dictionaries)");
                tv10.setText("x={}\n" +
                        "lis1=[]\n" +
                        "while  True:\n" +
                        "    n=input('ENTER NAME : ').upper()\n" +
                        "    if(n!=''):\n" +
                        "        s1=int(input('MARKS OF S1 : '))\n" +
                        "        s2=int(input('MARKS of S2 : '))\n" +
                        "        s3=int(input('MARKS OF S3 : '))\n" +
                        "        x[n]=s1,s2,s3\n" +
                        "        continue\n" +
                        "    elif(n==''):\n" +
                        "       print(x)\n" +
                        "       print('\\n')\n" +
                        "       for i in x.values():\n" +
                        "         lis1.append(i)\n" +
                        "       a=max(lis1)\n" +
                        "       for n,s in x.items():\n" +
                        "          if(x[n]==a):\n" +
                        "             print(n,'is TOPPER secured',sum(s),'MARKS')\n" +
                        "       break\n");
                tv11.setText("6. PROGRAM: printing a five digit number that has second number is two less than the first number\n" +
                        "third number less than the second number\n" +
                        "fourth number is two less than fifth number and the fifth number is equal to the third number and sum of 3rd 4th 5th = 1st number,and sum of all digits =19");
                tv12.setText("s=''\n" +
                        "for i in range(6,10):\n" +
                        "    a=i-2\n" +
                        "    b=a-2\n" +
                        "    c=b-2\n" +
                        "    d=c+2\n" +
                        "    if(b==d and b+c+d==i and i+a+b+c+d==19):\n" +
                        "        s+=str(i)+str(a)+str(b)+str(c)+str(d)\n" +
                        "        print(s)\n" +
                        "        break");
                tv13.setText("7. PROGRAM: turtle program to draw Google sysmbol");
                tv14.setText("from turtle import *\n" +
                        "speed(0)\n" +
                        "pensize(20) \n" +
                        "color('blue')\n" +
                        "fd(40)\n" +
                        "rt(80)\n" +
                        "for i in range(50):\n" +
                        "    rt(1.25)\n" +
                        "    fd(1)\n" +
                        "color('green')\n" +
                        "for i in range(100):\n" +
                        "    rt(1.25)\n" +
                        "    fd(1)\n" +
                        "color('gold')\n" +
                        "for i in range(40):\n" +
                        "    rt(1.001)\n" +
                        "    fd(1)\n" +
                        "color('red')\n" +
                        "for i in range(70):\n" +
                        "    rt(1.2)\n" +
                        "    fd(1)");
                tv15.setText("8. PROGRAM: turtle program to draw playmusic symbol");
                tv16.setText("from turtle import *\n" +
                        "hideturtle()\n" +
                        "speed(0)\n" +
                        "lt(90)\n" +
                        "color('red')\n" +
                        "begin_fill()\n" +
                        "fd(200)\n" +
                        "for i in range(40):\n" +
                        "    rt(3)\n" +
                        "    fd(1)\n" +
                        "fd(200)\n" +
                        "for i in range(40):\n" +
                        "    rt(3)\n" +
                        "    fd(1)\n" +
                        "fd(200)\n" +
                        "for i in range(40):\n" +
                        "    rt(3)\n" +
                        "    fd(1)\n" +
                        "end_fill()\n" +
                        "pu()\n" +
                        "for i in range(40):\n" +
                        "    lt(3)\n" +
                        "    bk(1)\n" +
                        "bk(60)\n" +
                        "rt(45)\n" +
                        "pd()\n" +
                        "color('gold')\n" +
                        "begin_fill()\n" +
                        "for i in range(385):\n" +
                        "    rt(0.7)\n" +
                        "    fd(1)\n" +
                        "end_fill()\n" +
                        "pu()\n" +
                        "for i in range(385):\n" +
                        "    lt(0.7)\n" +
                        "    bk(1)\n" +
                        "lt(45)\n" +
                        "bk(50)\n" +
                        "rt(160)\n" +
                        "fd(30)\n" +
                        "pd()\n" +
                        "color('orange')\n" +
                        "begin_fill()\n" +
                        "circle(50)\n" +
                        "end_fill()\n" +
                        "speed(1)\n" +
                        "color('white')\n" +
                        "pu()\n" +
                        "lt(90)\n" +
                        "fd(5)\n" +
                        "lt(40)\n" +
                        "fd(40)\n" +
                        "pd()\n" +
                        "begin_fill()\n" +
                        "for i in range(55):\n" +
                        "    rt(4)\n" +
                        "    fd(1)\n" +
                        "lt(130)\n" +
                        "fd(35)\n" +
                        "rt(90)\n" +
                        "fd(15)\n" +
                        "rt(90)\n" +
                        "fd(10)\n" +
                        "rt(90)\n" +
                        "fd(10)\n" +
                        "lt(90)\n" +
                        "fd(30)\n" +
                        "for i in range(25):\n" +
                        "    rt(2.7)\n" +
                        "    fd(1)\n" +
                        "end_fill()\n" +
                        "hideturtle()\n");
                tv17.setText("9. PROGRAM: turtle program to draw whatsapp logo");
                tv18.setText("from turtle import *\n" +
                        "speed(0)\n" +
                        "bgcolor('black')\n" +
                        "color('white')\n" +
                        "begin_fill()\n" +
                        "lt(65)\n" +
                        "fd(50)\n" +
                        "lt(65)\n" +
                        "for i in range(373):\n" +
                        "    rt(0.9)\n" +
                        "    fd(2)\n" +
                        "lt(50)\n" +
                        "fd(80)\n" +
                        "rt(138)\n" +
                        "fd(25)\n" +
                        "end_fill()\n" +
                        "pu()\n" +
                        "bk(25)\n" +
                        "rt(20)\n" +
                        "fd(35)\n" +
                        "pd()\n" +
                        "color('green3')\n" +
                        "begin_fill()\n" +
                        "lt(21)\n" +
                        "fd(50)\n" +
                        "lt(65)\n" +
                        "for i in range(340):\n" +
                        "    rt(1)\n" +
                        "    fd(2)\n" +
                        "lt(53)\n" +
                        "fd(60)\n" +
                        "end_fill()\n" +
                        "color('white')\n" +
                        "pu()\n" +
                        "bk(60)\n" +
                        "rt(53)\n" +
                        "for i in range(130):\n" +
                        "    lt(0.5)\n" +
                        "    bk(1)\n" +
                        "rt(90)\n" +
                        "fd(40)\n" +
                        "lt(50)\n" +
                        "pd()\n" +
                        "begin_fill()\n" +
                        "for i in range(150):\n" +
                        "    rt(0.5)\n" +
                        "    fd(1)\n" +
                        "for i in range(43):\n" +
                        "    rt(2)\n" +
                        "    fd(1)\n" +
                        "rt(75)\n" +
                        "fd(40)\n" +
                        "rt(65)\n" +
                        "fd(20)\n" +
                        "lt(60)\n" +
                        "for i in range(70):\n" +
                        "    lt(0.5)\n" +
                        "    fd(1)\n" +
                        "lt(90)\n" +
                        "fd(25)\n" +
                        "rt(90)\n" +
                        "fd(30)\n" +
                        "rt(60)\n" +
                        "fd(10)\n" +
                        "for i in range(30):\n" +
                        "    rt(2.5)\n" +
                        "    fd(1)\n" +
                        "end_fill()\n" +
                        "hideturtle()\n");
                tv19.setText("10. PROGRAM: drawing a heart symbol and filling it with hearts");
                tv20.setText("import math\n" +
                        "\n" +
                        "c='♥'\n" +
                        "width = 40\n" +
                        "\n" +
                        "print ((c*2).center(width//2)*2)\n" +
                        "\n" +
                        "for i in range(1,width//10+1):\n" +
                        "    print (((c*int(math.sin(math.radians(i*width//2))*width//4)).rjust(width//4)+\n" +
                        "           (c*int(math.sin(math.radians(i*width//2))*width//4)).ljust(width//4))*2)\n" +
                        "\n" +
                        "for i in range(width//4,0,-1):\n" +
                        "    print ((c*i*4).center(width))\n" +
                        "print ((c*2).center(width))");
                tv21.setText("11. PROGRAM: printing the type of variable or datatype etc.");
                tv22.setText("def varObj(a):\n" +
                        "    a=str(type(a))\n" +
                        "    s=a.split(' ')\n" +
                        "    b=s[1]\n" +
                        "    print(''.join(e for e in b if e.isalnum()))\n" +
                        "varObj((1,2,3))\n");
                tv23.setText("12. Emailing through python using smtplib (simple mail transfer protocol library).\n");
                tv24.setText("import smtplib\n" +
                        "s=smtplib.SMTP('smtp.gmail.com',587)\n" +
                        "s.starttls()\n" +
                        "\n" +
                        "'''logining in to the senders gmail account\n" +
                        "before loging in make sure that your gmail account allows the low secure apps \n" +
                        " so that you can login to your account otherwise it will raise an error\n" +
                        "'''\n" +
                        "s.login(\"sender_email_id\", \"sender_email_id_password\")\n" +
                        "\n" +
                        "message = \"Message_you_need_to_send\"\n" +
                        " \n" +
                        "# sending the mail\n" +
                        "s.sendmail(\"sender_email_id\", \"receiver_email_id\", message)\n" +
                        " \n" +
                        "# terminating the session\n" +
                        "s.quit()\n");

                l1.removeView(ex1);
                l1.removeView(ex2);
                l1.removeView(ex3);
                l1.removeView(ex4);
                l1.removeView(ex5);
                l1.removeView(ex6);
                l1.removeView(ex7);
                l1.removeView(ex8);
                l1.removeView(ex9);
                l1.removeView(ex10);
                l1.removeView(ex11);
                ex12.setText("Try these programs in your python editor to get output.\n" +
                        "NOTE:Here output is not provided so that you will try it.");
                break;

        }
    }
}

