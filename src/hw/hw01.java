package hw;
import java.util.Scanner;
public class hw01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int z=scn.nextInt();
		int bus=z;
		int a []=new int[z];
		int b []=new int[z];
		for(int i=0;i<z;i++){
			a[i]=scn.nextInt();
			b[i]=scn.nextInt();
		}
		for(int i=0;i<z;i++){
			for(int j=0;j<z;j++){
			if(a[i]==b[j]){
				z--;
				}
			else if(a[i]>b[j]){
				if((b[j]-a[j])+(b[i]-a[i])<25){
					z--;
				}
			}
			}
		}
		System.out.print(z);
	}

}
