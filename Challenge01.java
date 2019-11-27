import java.io.*;

public class Challenge01 {
	public static void main (String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("四角形の底辺を入力してください");
		String baseStr = br.readLine();
		
		System.out.println("四角形の高さを入力してください");
		String heightStr = br.readLine();
		
		try{
			int base = Integer.parseInt(baseStr);
			int heght = Integer.parseInt(heightStr);
			int squareArea = base * heght;
			System.out.println("底辺：" + base + " 高さ：" + heght + " の四角形の面積は" + squareArea + "です。");
			
		}catch(NumberFormatException e){
			System.out.println("エラー：底辺と高さは整数値で入力してください。");
		}
	}
}