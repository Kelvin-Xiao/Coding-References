//File set up
import java.util.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
public static void main(String[] args)throws IOException //Add to main method when Reading Files
Scanner input = new Scanner(System.in);					//New Scanner

//Casting
.toUpperCase()	//to Upper case
.charAt(0)		//to a Char
.toCharArray()	//to a CharrArray	

//String comparisons
str1.equals(str2) 		//not ==
str1.compareTo(str2)

//Find in String
userText.length
userText.indexOf(item) 
userText.substring(startIndex)

//Character methods return values. Each method must prepend Character., as in Character.isLetter.
isLetter() 		// true if alphabetic:a-z or A-Z
isDigit() 		//true if digit: 0-9.
isWhitespace()	//true if whitespace.
toUpperCase()	//Uppercase version
toLowerCase()	//Lowercase version

//String modify methods
concat(moreString)				//Creates a new String that appends the String moreString at the end.
replace(findStr, replaceStr)	//Returns a new String in which all occurrences of findStr have been replaced with replaceStr.
str1 + str2						//Returns a new String that is a copy of str1 with str2 appended.
str1 += str2					//Shorthand for str1 = str1 + str2.

//Math functions
Math.abs()	//absolute value

// 1-d vs 2-d vs 3-d arrays
int[ ] intArray = new int[10];
int[ ][ ] tableArray = new int [2][3];         //This creates a 2-D array with 2 rows and 3 columns.
int [] [] [] threeDArray = new int [3][4][5]; /*In the declaration, the [3] would indicate the number of
											  PAGES. On each page there would be a table with [4] ROWS, and [5] columns*/
//Ragged Array	
int[ ] [ ] raggedArray = {
						{3, 6, 7, 2, 4, 5},
						{3, 9, 2},
						{6, 2, 8, 3}
						}; //end array	
/*Here, the first row has 6 elements, the second
row has 3 elements, and the third row has 4
elements.*/
// OR
//step 1: instantiate but leave # columns blank...
int[ ] [ ] raggedArray = new int[3] [ ];
//step 2: for each row, specify how many elements the //“row array” will have...
raggedArray[0] = new int[6];
raggedArray[1] = new int[3];
raggedArray[2] = new int[4];

//Methods of ArrayList
.size(); 						 //returns number of filled elements in the ArrayList object
.ensureCapacity(int n);		 	//increases capacity to ‘n’ elements
.trimToSize(); 					//deletes empty elements on the end to save memory
.add(<Object> obj); 			//adds specified object to end of list
.add(int index, <Object> obj); 	/*inserts specified object to element at specified index. Other values will “move over” to
								let the new one in. No overwrite will occur. */
.remove(int index); 			//deletes element at this index and the		
		
//ArrayList object to hold String objects	
ArrayList <String> myStringList = new
ArrayList<String>( );	//This will create an ArrayList object that will have a default capacity of 10 values.
ArrayList <String> myStringList = new ArrayList<String>(50);  	/*we can pass the desired capacity into the argument list.
									This will create an ArrayList object with a capacity to hold 50 values.*/	
		
//Swapping Values in Arrays
if(intArray[index]>intArray[index+1]) //if true, do the swap
{
int temp = intArray[index];
intArray[index]=intArray[index + 1];
intArray[index + 1] = temp;
}

//Create an empty file	
File fileOne = new File(“C:/temp34/myFile.txt”);
fileOne.createNewFile(); //throws FileNotFoundException		

//Using getParentFile() which will read the parent element or elements of the path
File fileOne = new File(“C:/temp34/myFile.txt”);
fileOne.getParentFile().mkdirs(); //this builds the temp34 folder
//now call createNewFile()
fileOne.createNewFile(); //creates the empty .txt file in temp 34
		
	