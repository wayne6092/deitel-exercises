/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OrderOfCatch1118;

/**
 *
 * @author Wayne
 */
public class OrderOfCatchBlocks {

	public static void main(String[] args) {
		try {
			int n = 10 / 0;
		} catch (ArithmeticException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

//		Unreachable catch block for ArithmeticException. It is already handled by the catch block for Exception
		try {
			int n = 10 / 0;
		} catch (Exception e) {
			e.printStackTrace();
		} catch (ArithmeticException e) {
		e.printStackTrace();
		}
	}

}