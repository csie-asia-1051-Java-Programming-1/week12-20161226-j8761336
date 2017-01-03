package hw;
import java.util.Scanner;
public class hw03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn =new Scanner(System.in);
		String[] a=scn.nextLine().split(" ");
		System.out.print(a.length);
		for(int i=0;i<a.length-1;i++){
			for(int j=i+1;j<=a.length-1;j++){
				if(a[i]==a[j]){
					a[j]=" ";
				}
			}
		}for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
	}

}
