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
		int sum =0;
		String a =scn.next();
		for(int i=0;i<a.length();i++){
			sum+=(int)a.charAt(i);
			System.out.println(sum);
		}
//		System.out.print(sum);
	}

}
