package data_structure_mini_projects;
import java.util.Scanner;

public class Big_num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] numbers = new int[3];
        Scanner read = new Scanner(System.in);
        System.out.println("Enter 3 integers");

        for(int i = 0; i < 3; i++){
            int num = read.nextInt();
            numbers[i] = num;
        }
        int big = mthd(numbers[0], numbers[1], numbers[2]);
        System.out.println("Biggest number of the three is " + big);
    }

    //template to compute biggest number
     static int mthd(int x, int y, int z){
        int big = (x > y) ? x : y;
        int res = (big > z) ? big : z;
        return res;
	}

}
