public class ArrayDemo{
public static void printArray(int[] ary){//prints the array between brackets and separated by commas
  String values= "[";
  for (int a = 0; a < ary.length-1; a++){
    values+=ary[a]+",";
    }
    System.out.println( values+ary[ary.length-1]+"]");
  }
public static void printArray(int [][] ary){
  //prints the array with index followed by
  //colon and then values of the 1D array, all between brackets
  String values="[";
  for (int a =0; a<ary.length; a++){
    values+=a+":";
    for (int i = 0; i<ary[a].length; i++){
      values+=ary[a][i]+" ";
    }
  }
  values+="]";
  System.out.println(values);
}
public static int countZeros2D(int [][] nums){
  //returns number of zeros in any 2D array
  int counter=0;
  int currentnum=5;
  for (int i= 0; i<nums.length;i++){
    for (int a=0; a<nums[i].length;a++){
      currentnum=nums[i][a];
      if (currentnum==0){
        counter++;
      }
    }
  }
  return counter;
}
public static void fill2D(int[][] vals){
  //prints the new filled array in the established format
  for (int i= 0; i<vals.length;i++){
    for (int a=0; a<vals[i].length;a++){
      if (a==i){
        vals[i][a]=3;
      }
      else
      vals[i][a]=1;
    }
  }
  printArray(vals);
}
public static int[][] fill2DCopy(int[][] vals){//need to change to int and make it so each inner array can be a different
  //length
  //prints new array with established format
  int[][] newbie= new int[vals.length][vals[0].length];
  for (int i= 0; i<vals.length;i++){
    for (int a=0; a<vals[i].length;a++){
    //  System.out.println(vals[i][a]);
      if (vals[i][a]<0){
        newbie[i][a]=3;
      //  System.out.println("hey");
      }
      else{
      newbie[i][a]=1;
    }
    }
  }
  return newbie;
}
public static void main(String[] args){
  //Defining test arrays
  int[] arrayname= {1,2,3,4};
  int[] arrayname2={100,200,400,600};
  int[][] arrayname3= new int[][]{
  {1,-2,3,4},
  {5,6,7,-8},
  {9,10,-11,12}
  };
  int[][] arrayname4 = new int[][]{
    {0,4,0,-6},
    {1,2,-3,4},
    {-9,7,0,1}
  };

  //PROBLEM 0a
    //Test Case #1
  printArray(arrayname);
    //Test case #2
  printArray(arrayname2);

  //Problem 0b
    //Test case #1
  printArray(arrayname3);

  //Problem 1
    //Test case #1
  System.out.println(countZeros2D(arrayname3));//should print 0

    //Test case #2
  System.out.println(countZeros2D(arrayname4));//should print 3

  //Problem 2a
    //Test case #1
  fill2D(arrayname3);

  //Problem 2b
    //Test case #2
  System.out.println(fill2DCopy(arrayname4));
}
}
