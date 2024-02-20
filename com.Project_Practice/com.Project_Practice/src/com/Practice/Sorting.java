package com.Practice;

public class Sorting {

	public static void main(String[] args) {
		int arg [] = {5,12,3,1,4,33,6,9};
		int [] ar = BubbleSort(arg);	
		
		System.out.println();
		for(int i=0;i<arg.length-1;i++){
			System.out.print(ar[i] + "  ");
		}
	}

	private static int [] BubbleSort(int [] arg) {	
		 int l = arg.length;
		 int k;
		
		 for(int i=0;i<l-1;i++){
			 for(int j=i+1;j<l-1;j++){
				 if(arg[i] > arg[j]){
					k = arg[i]; 
					arg[i] = arg[j];
					arg[j] = k;
				 }
			 }
		 }
		 
		for(int i=0;i<l-1;i++){
			System.out.print(arg[i] + "  ");
		}
		return arg;
		 
	}
}


