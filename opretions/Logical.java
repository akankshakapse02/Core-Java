package opretions;

public class Logical {
	public static void main(String[] args) {
		boolean check = true;
		System.out.println(10 > 45 && 20 < 9 || check && true);
		/*
		 * (false && false || true && true) (false || true) true
		 */

		System.out.println("*****************************************");

		System.out.println((true) || 0 < 9 || check || 0 > 0);
		/*
		 * (true || false || true || false) (true || true) (true)
		 */

		System.out.println("***********************************************");

		System.out.println(1 > 5 || 2 < 9 || check || 0 > 0);
		/*
		 * (false || false || true || false) (false || true) true
		 */
		System.out.println("***************************************");

		System.out.println(check && (20 < 9) || 45 != 0 && true);
		/*
		 * (true && true || true && true) (true || true) true
		 */

	}
}
