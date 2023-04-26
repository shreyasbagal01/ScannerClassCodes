import java.io.*;
class Demo{
	public static void main (String[] Shreyas)throws IOException{
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter College name:");
		String Coll = br.readLine();

		System.out.println("Enter Grade Of College :");
		char grade =(char)br.read();

		br.skip(1);

		System.out.println("Branach name:");
		String Branch =br.readLine();

		System.out.println("Enter the Fees Of College:");
		int Fees =Integer.parseInt(br.readLine());


		System.out.println("College Name :"+ Coll);
		System.out.println("Grade College :"+ grade);
		System.out.println("Branch Name:"+ Branch);
                System.out.println("Fees :"+Fees);
	}
}
