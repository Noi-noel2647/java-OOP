import java.io.*;

public class Challenge02 {
	public static void main (String[] args) throws IOException {
		
		int num1,num2,answer;
		String operator,str1,str2;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("[+,-,*,/]の中から１つ演算子を入力してください: ");
		operator = br.readLine();
		
		System.out.print("1つ目の数値を入力してください: ");
		str1 = br.readLine();
		
		System.out.print("2つ目の数値を入力してください: ");
		str2 = br.readLine();
		
		try{
			num1 = Integer.parseInt(str1);
			num2 = Integer.parseInt(str2);
			
			if(operator.equals("+")){
				answer = num1+num2;
				
			}else if(operator.equals("-")){
				answer = num1-num2;
				
			}else if(operator.equals("*")){
				answer = num1*num2;
				
			}else if(operator.equals("/")){
				if(num2 == 0){
					answer = 0;
				
				}else{
					answer = num1/num2;
				
				}
			
			}else{
				System.out.println("エラー： [+,-,*,/]の中から１つ演算子を入力してください");
				answer = 0;
				System.exit(0);
			
			}

			System.out.println(num1 + operator + num2 + "=" + answer);
			
		}catch(NumberFormatException e){
			System.out.println("エラー： 数値を入力してください");
			System.exit(0);
		
		}
	}
}