public class Operator1 {
    public static void main(String[] args){

//*--------------------------Increment And Decrement-----------------------
// int x = 10;
// int y = 10;

// System.out.println("pre-increment: "+ (++x));
// System.out.println("Value of x :"+ x);

// System.out.println("post-increment: "+ (y++));
// System.out.println("Value of x :"+ y);
int x = 10;
int y = ++x;
System.out.println("pre-increment: "+ y);
//*--------------Constant Value--------------- */
//! CompileTime Error : Unexpected Type found : value Required : Variable
// int z = ++10;
// System.out.println(z);

//*--------------Nesting of increment and decrement operator are not allowed --------------- */

// int z = 10;
// System.out.println(++(++z));

        
//*--------------Final Variable--------------- */

// final int z = 10;
// System.out.println (++z); 

 //*--------------Primitive Data Type(Except Boolean) --------------- */

// int z = 10;
// ++z;
// System.out.println(z);

// float a = 10;
// ++a;
// System.out.println(a);

// char d = 'a';
// ++d;
// System.out.println(d);

// double b = 10;
// ++b;
// System.out.println(b);

//! CompileTime Error: Operators ++ cannot be applied to boolean
// boolean c = true;
// ++c;
// System.out.println(c);

    }
}



    
