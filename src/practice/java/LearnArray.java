package practice.java;

public class LearnArray {

	public static void main(String[] args) {
		/*int[] number = {1,2,3,4,5,5};
				for(int i=0; i<number.length;i++){
			System.out.println(number[i]);
		}*/
		int first = 0;
		int second = 1;
		int next;
		for(int i =0; i<=10;i++)
		{
			if(i<=1){
			next = i;
		}else{
		
			next = first + second;
			first = second;
			second = next;
			}
			System.out.println(next);
			}
		}
}
