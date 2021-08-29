//Write a program to print following :
//i)**********    ii)*          iii)     *      
//  **********        **                **           
//  **********        ***             ***   
//  **********        ****          ****
//                            *****      *****

//iv)          1             v)         1
//            222                     212
//          33333                32123
//       4444444            4321234
//     555555555       543212345


public class PyramidPattern {
	public static void main(String args[]) {
		int i, j, k;
		for (i = 0; i < 4; i++) {
			for (j = 10; j >= 0; j--) {
				System.out.print("*");
			}
			System.out.println();
		}

		for (i = -1; i < 5; i++) {
			for (j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println();
		for (i = 5; i >= 1; i--) {
			for (j = 1; j < i; j++) {
				System.out.print(" ");
			}
			for (k = 5; k >= i; k--) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println();
		for (i = 1; i <= 5; i++) {
			for (j = 4; j >= i; j--) {
				System.out.print(" ");
			}
			for (k = 1; k <= (2 * i - 1); k++) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println();
		for (i = 1; i <= 5; i++) {
			for (j = 5 - i; j >= 1; j--) {
				System.out.print(" ");
			}
			for (j = 1; j <= 2 * i - 1; j++) {
				System.out.print(i);
			}
			System.out.println();
		}

		System.out.println();
		for (i = 1; i < 6; i++) {
			for (int s = 7 - i; s > 1; s--) {
				System.out.print(" ");
			}
			for (j = i; 1 <= j; j--) {
				System.out.print(j);
			}
			for (k = 2; k <= i; k++) {
				System.out.print(k);
			}
			System.out.println();
		}
	}
}