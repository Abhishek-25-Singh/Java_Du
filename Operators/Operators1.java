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


//*-------------Difference Between b++ and b= b+1 */
// byte a = 10;
// byte b = 20;
// byte c= a+b;
//? We Apply any arithmetic operator between two variables a and b */
//? the Result type is always max(int,type of a , type of b) */
//!byte c = a+b; ---> max(int,byte,byte) = int type
// System.out.println(c);
//?We can handel this Exception Using Typecasting
// byte c = (byte)(a+b);
// System.out.println(c);        

    }
}



    
