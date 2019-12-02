import java.util.Arrays;


public class ArraysLec {
    public static void main(String[] args) {
//        //lecture
//        int num = 4;
//        //declare variable array with length
//        String[] cheeses = new String[num];
//        cheeses[0]= "Muenster";
//        cheeses[1]= "Swiss";
//        cheeses[2]= "Cheddar";
//        cheeses[3]= "Brie";
//        //or declare this way
//        //String[] cheeses = new String[]{"Muenster","Swiss", "Cheddar", "Brie"};
//
//
//        //for of loop
//        for (String cheese : cheeses){
//            System.out.println(cheese);
//        }
//
//        //for loop
//        String[] languages = {"html", "css", "javascript", "java"};
//
//        for (int i = 0; i < languages.length; i += 1) {
//            System.out.println(languages[i]);
//        }
//
//        //ARRAYS CLASS. import at top
//        int[] nums = new int [6];
//
//        //filling in the rest of nums with placeholder to prevent null
//        Arrays.fill(nums, 7);
//        //setting nums at specific index
//        nums[3] = 9;
//        for (int n: nums){
//            System.out.println(n);
//        }
//
//        //test if arrays are equal in value and length
//        int[] nums2 = {7,7,7,9,7,7};
//        System.out.println(Arrays.equals(nums,nums2));
//
//        //copyof recreate array at any length
//        int[] nums3 = Arrays.copyOf(nums,3);
//
//        //Arrays.toString method
//        System.out.println(Arrays.toString(nums));
//
//        //sort array in ascending order
//        //void method. no return so does not need assignment
//        Arrays.sort(nums);
//        System.out.println(nums);
//
//        //two dimensional array
//        int[][] matrix = {
//                {1, 2, 3},
//                {4, 5, 6},
//                {7, 8, 9}
//        };
//
//// access the first element in the second row
//        System.out.println(matrix[1][0]); // 4
//// the last element in the first row
//        System.out.println(matrix[0][2]); // 3
//// the first element in the last row
//        System.out.println(matrix[2][0]); // 7
//
////  We can also iterate over the rows in a matrix, and, within the loop iterating over the rows, iterate over each element in each row with a nested loop:
//
//        for (int[] row : matrix) {
//            System.out.println("+---+---+---+");
//
//            System.out.print("| ");
//
//            for (int n : row) {
//                System.out.print(n + " | ");
//            }
//
//            System.out.println();
//        }
//
//        System.out.println("+---+---+---+");


        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));

        int num = 4;
//        //declare variable array with length
        String[] persons = new String[num];
        persons[0]= "Roger";
        persons[1]= "Katie";
        persons[2]= "Riley";
        persons[3]= "Asher";


    }
}
