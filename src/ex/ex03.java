package ex;
import java.util.Scanner;
/*
 * Topic: OX 遊戲是大家小時候的童年記憶，甚至在長大後，無聊時還是會玩一下呢 ! 但當你一個人時，是否也能讓電腦跟你玩呢 ?
 * Date: 2016/12/26
 * Author: 105021026 詹佩郡
 */

public class ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int a[][]=new int[3][3];
		int sum=0;int sum1=0;int sum2=0;
		int sum3=0;int sum4=0;int sum5=0;
		int sum6=0;int sum7=0;
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				a[i][j]=scn.nextInt();
			}
		}
		for(int i=0;i<3;i++){
			sum+=a[0][i];
			}
		for(int i=0;i<3;i++){
			sum1+=a[1][i];
			}
		for(int i=0;i<3;i++){
			sum2+=a[2][i];
			}
		for(int i=0;i<3;i++){
			sum3+=a[i][0];
			}
		for(int i=0;i<3;i++){
			sum4+=a[i][1];
			}
		for(int i=0;i<3;i++){
			sum5+=a[i][2];
			}
		for(int i=0;i<3;i++){
			sum6+=a[i][i];
			}
		sum7=a[2][0]+a[1][1]+a[0][2];
		if(sum==3||sum==0){
			System.out.println("True");
		}else if(sum1==3||sum1==0){
			System.out.println("True");
		}else if(sum2==3||sum2==0){
			System.out.println("True");
		}else if(sum3==3||sum3==0){
			System.out.println("True");
		}else if(sum4==3||sum4==0){
			System.out.println("True");
		}else if(sum5==3||sum5==0){
			System.out.println("True");
		}else if(sum6==3||sum6==0){
			System.out.println("True");
		}else if(sum7==3||sum7==0){
			System.out.println("True");
		}					
		else{
			System.out.println("False");
		}
	}

}
