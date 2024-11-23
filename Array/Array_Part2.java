public class Array_part2
{
    public static void main (String[] args){

//******************************************************* */
//** Two Dimensional Array Creation                                 */
//******************************************************* */

//? We have to at least Specify the base Size  
// int[][] x = new int[2][];
// x[0]= new int[2];
// x[1]= new int[3];

//******************************************************* */
//** Three Dimensional Array Creation                                 
//******************************************************* */

// int[][][] x1 = new int[2][][];
// x1[0] = new int[3][];
// x1[0][0] = new int[1];
// x1[0][1]= new int [2];
// x1[0][2] = new int[3];
// x1[1] = new int[2][2];

//******************************************************* */
//** Which of the Array declaration are Valid                                */
//******************************************************* */


// //! int[] x1 = new int[];

// int[] x2 = new int[3];

// //! int[][] x3 = new int[][];

// int[][] x4 = new int[3][];

// //! int[][] x5 = new int[][4];

// int[][] x6 = new int[3][4];

// int[][][] x7 = new int[3][4][5];

// int[][][] x8 = new int[3][4][];

// //! int[][][] x10 = new int[3][][4];

// //! int[][][] x11 = new int[][4][5];

//*******************************************************   */
//** Array Initialization                                  */
//******************************************************* */

int[] x = new int[3];
System.out.println("Internally Two String Method is Called : " + x);
System.out.println("Default value of Array is Zero : "+ x[0]);


int[][] x1 = new int[2][3];
System.out.println("x1 is a Reference variable to Two dimensional array " + x1);
System.out.println("x1 is a Reference variable to One dimensional array  : "+ x1[0]);
System.out.println("Default value of Array is Zero : "+ x1[0][0]);


int[][] x2 = new int[2][];
System.out.println("x1 is a Reference variable to Two dimensional array " + x2);
System.out.println("x1 is a Reference variable to One dimensional array  : "+ x2[0]);
 //! System.out.println("Default value of Array is Zero : "+ x2[0][0]); --->java.lang.NullPointerException
    }
}
