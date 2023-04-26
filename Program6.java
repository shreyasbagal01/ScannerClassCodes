import java.io.*;
class Demo{
	public static void main(String[]Shreyas)throws IOException{
		BufferedReader br= new BufferedReader (new InputStreamReader(System.in));
		System.out.println("Enter the Building name :");
		String BName =br.readLine();

		System.out.println("Enter the flat Numbers :");
		int Flat =Integer.parseInt(br.readLine());

		System.out.println("Enter the Wing :");
		char Wing =(char)br.read();
	}
}
