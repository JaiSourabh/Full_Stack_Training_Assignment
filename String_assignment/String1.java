import java.util.*;

class Task1{
	public static String finalResult(String firstString,String secondString,int index){
		String finalString=new String();
			for(int i=0;i<firstString.length();i++){
				finalString+=firstString.charAt(i);
				if(i==index){
					finalString+=secondString;
				}
			}
			return finalString;
		}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First String : ");
		String firstString=sc.nextLine();
		System.out.println("Enter second String : ");
		String secondString=sc.nextLine();
		System.out.println("Enter index : ");
		int index=sc.nextInt();
	
		System.out.print(finalResult(firstString,secondString,index));
	}
}