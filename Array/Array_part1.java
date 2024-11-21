public class Array_Part1 {
    public static void main(String[] args){


//******************************************************* */
//** Array Declaration                                   */
//******************************************************* */

//******************************************************* */
//** One - Dimensional Array Declaration                                  */
//******************************************************* */
        // int[]  x;
        // int  []x1;
        // int  x3[];
//******************************************************* */
//** Two - Dimensional Array Declaration                                   */
//******************************************************* */
    
       // int[][]  x;
        // int  [][]x1;
        // int  x3[][];
        // int[] []x4;
        // int[]  x5[];
        // int  []x6[];

        //?  Which of the following are valid */
    
     //  int[] x,y;
    //  int[]  x1[],y1;
    //  int[] x2[],y2[];
//Space is ignored by the compiler 
    //  int[] []x4,y4;
    //  int[] []x5,y5[];

//!  int[] []a,[]b; 

//******************************************************* */
//** Three - Dimensional Array Declaration                                    */
//******************************************************* */
 
        //  int[][][]  x;
        // int  [][][]x1;
        // int  x3[][][];
        // int[] [][]x4;
        // int[]  x5[][];
        // int[]  []x6[];
        // int[][]  []x7;
        // int[][]  x8[];
        // int  [][]x9[];
        // int []x10[][];

        
        
//******************************************************* */
//** Array Creation                                       */
//******************************************************* */

//  int[] x = new int[3];

// //! int[] x1 = new int[];

// int[] x2 = new int[0];

//******************************************************* */
//** Get Array Corresponding class                        */
//******************************************************* */

// int[] a =new int[3];
// System.out.println(a.getClass().getName());
// int[][] a1 = new int[3][2];
// System.out.println(a1.getClass().getName());
// int[][][] a3 = new int[3][2][1];
// System.out.println(a3.getClass().getName());


// short[] s = new short[3];
// System.out.println(s.getClass().getName());
// short[][] s1 = new short[3][2];
// System.out.println(s1.getClass().getName());
// short[][][] s2 = new short[3][2][1];
// System.out.println(s2.getClass().getName());

// double[] d = new double[3];
// System.out.println(d.getClass().getName());
// double[][] d1 = new double[3][2];
// System.out.println(d1.getClass().getName());
// double[][][] d2 = new double[3][2][1];
// System.out.println(d2.getClass().getName());


// byte[] b = new byte[3];
// System.out.println(b.getClass().getName());
// byte[][] b1 = new byte[3][2];
// System.out.println(b1.getClass().getName());
// byte[][][] b2 = new byte[3][2][1];
// System.out.println(b2.getClass().getName());


// boolean[] bol = new boolean[3];
// System.out.println(bol.getClass().getName());
// boolean[][] bol1 = new boolean[3][2];
// System.out.println(bol1.getClass().getName());
// boolean[][][] bol2 = new boolean[3][2][1];
// System.out.println(bol2.getClass().getName());


//******************************************************* */
//** Loop holes in Array Creation                         */
//******************************************************* */

/*At the time of array Creation compulsory we should specify the size otherwise we will get compile time error   */
int[] xx = new int[3];

//! int[] xx1 = new int[];

int[] xx2 = new int[0];

//! int[] x = new int[-3]; Runtime error: NegativeArraySizeException
    }
}
