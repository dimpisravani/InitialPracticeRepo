package com.n2services;

/**
 * @author srava
 *
 */
public class StringBuffers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// **********************************append**********************
		StringBuffer sBuffer = new StringBuffer(" do your best ");
		sBuffer.append(",God will do the rest");
		System.out.println(sBuffer);

		// *****************************insert************************

		sBuffer.insert(13, " and");
		System.out.println(sBuffer);

		// **********************delete **********************

		sBuffer.delete(17, 18);
		System.out.println(sBuffer);

		// ********************reverse****************

		sBuffer.reverse();
		System.out.println(sBuffer);

		// *********************replace******************
		sBuffer.reverse();
		sBuffer.replace(13, 17, "  much");
		System.out.println(sBuffer);

	}

}
