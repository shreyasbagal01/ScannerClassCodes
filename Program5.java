import java.io.*;
class Demo{
	public static void main(String[] Shreyas)throws IOException{
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the Batsman Name :");
		String name1 =br.readLine();
		System.out.println("enter the Bowler Name :");
		String name2 =br.readLine();
		System.out.println("Batsman Name :" + name1);
		System.out.println("Bowler Name :"+name2);
	}
}
