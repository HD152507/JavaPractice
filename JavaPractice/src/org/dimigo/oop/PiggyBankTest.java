/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 *  org.dimigo.oop
 *  |_PiggyBankTest
 * 1. 개요 :
 * 2. 작성일 : 2017. 4. 18.
 * </pre>
 *
 * @author JunhaKim
 * @version : 1.0
 */
public class PiggyBankTest {
	public static void main(String[] args) {
		FamilyMember[] member = { 
				new FamilyMember("아빠"), 
				new FamilyMember("엄마"), 
				new FamilyMember("나"),
				new FamilyMember("남동생") 
				};
		int[] amount = { 10000, 5000, 2000, 1000 };
		FamilyMember.printMemberCnt();
		
		for (int i = 0; i < member.length; i++)
			PiggyBank.putMoney(member[i], amount[i]);
		PiggyBank.printBalance();
		PiggyBank.putMoney(member[2], 1000);
		PiggyBank.printBalance();

	}
}