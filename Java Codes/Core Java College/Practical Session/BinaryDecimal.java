import java.util.*;
import java.io.*;

class BinaryDecimal {
	public static void main(String[] args) throws IOException {
		int decimal_num,i,decimal;
		long binary_num;
		Scanner src = new Scanner(System.in);
		System.out.println("Enter a decimal number: ");
		decimal_num = src.nextInt();
		int binary[] = BinaryDecimal.convertDecimalToBinary(decimal_num);
		System.out.println("Its equivalent binary number is: ");
		for(i=binary.length-1;i>=0;i--){
			System.out.print(binary[i]);
		}
		System.out.println();
		System.out.println("Enter a binary number: ");
		binary_num = src.nextLong();
		decimal = BinaryDecimal.convertBinaryToDecimal(binary_num);
		System.out.println("Its equivalent decimal number is: "+decimal);
	}

	public static int[] convertDecimalToBinary(int num){
		int bin[] = new int[30];
		int i = 0;

		while(num>0){
			bin[i++] = num % 2;
			num = num/2;
		}

		return bin;
	}

	public static int convertBinaryToDecimal(long num) {
			int decimalNumber = 0,i = 0;
			long remainder;
			while(num != 0 ){
				remainder = num % 10;
				num = num / 10;
				decimalNumber = decimalNumber + (int)(remainder * Math.pow(2,i));
				++i;
			}
			return decimalNumber;
	}
}