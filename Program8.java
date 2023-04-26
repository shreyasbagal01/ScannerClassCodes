import java.io.*;
class Demo{
	public static void main(String[] Shreyas)throws IOException{

		BufferedReader ok =new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter Dates :");
		int Date = Integer.parseInt(ok.readLine());

		System.out.println("Enter the game name:");
		String Game =ok.readLine();

		System.out.println("Enter the Grade of Game:");
		char Grade =(char)ok.read();

		ok.skip(1);

		System.out.println("Enter the Best Player name :");
		String Best = ok.readLine();

		System.out.println("Enter the player Average :");
		int avg =Integer.parseInt(ok.readLine());


	}
}


