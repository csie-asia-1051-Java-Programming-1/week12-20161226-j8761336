package ex;
/*
 * Topic: 輸入一整數 N 及 N 個整數，請依照十進位中各位數字和由小到大排序輸出。如果各位數字和相等則比較數值由小到大排列。
 例如: 9122 的各位數字和為 9+1+2+2=14、3128 的各位數字和為 3+1+2+8=14 而 5112 的各位數字和為 5+1+1+2=9。
 所以輸入 9122 3128 5112 需輸出 5112 3128 9122 ，這是因為 5112(9) < 3128(14) < 9122(14)，其中又因為 3128 與 9122 兩者的各位數字和都是 14，所以將 數值小的 3128 放前面。則經由計算可得其識別碼為 165 ，乃是 11 之倍數，故此為一合法之 ISBN 碼。輸入一串 ISBN 碼，以空格隔開。
 * Date: 2016/12/26
 * Author: 1050210XX 周永振老師
 */

import java.util.Arrays;
import java.util.Scanner;

public class ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn =new Scanner(System.in);
		System.out.println("輸入有幾個數值:");
		int m1=0;int m2=0;int m3=0;int m4=0;
		int a =scn.nextInt();
		int sum[]=new int[a];
		int b[]=new int[a];
		for(int i=0;i<a;i++){
			b[i]=scn.nextInt();
		}
		for(int i=0;i<a;i++){
			m1=b[i]/1000;
			m2=(b[i]-m1*1000)/100;
			m3=(b[i]-m1*1000-m2*100)/10;
			m4=(b[i]-m1*1000-m2*100-m3*10);
			sum[i]=m1+m2+m3+m4;
		}
		for(int i=0;i<a;i++){
			b[i]=b[i]+sum[i];
		}
		Arrays.sort(sum);
		
	}

}