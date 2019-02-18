package com.capgemini.main;

import java.math.BigDecimal;

import com.capgemini.exceptions.DuplicateMobileNumberException;
import com.capgemini.exceptions.InsufficientAmountException;
import com.capgemini.exceptions.InvalidInputException;
import com.capgemini.exceptions.MobileNumberDoesNotExistException;
import com.capgemini.repo.WalletRepoImpl;
import com.capgemini.service.WalletServiceImpl;

public class CustomerMain {
	public static void main(String[] args) throws Exception {

		WalletRepoImpl walletRepo = new WalletRepoImpl();

		WalletServiceImpl walletService = new WalletServiceImpl(walletRepo);

		try {
			if (walletService.ValidateMobNo("9854121412")) {
				if (walletService.ValidateName("Sushil")) {
					if (walletService.ValidateAmount(new BigDecimal("100.00"))) {
						System.out.println("CREATE ACCOUNT\n"
								+ walletService.createAccount("Chirag", "9854121419", new BigDecimal("100.00")) + "\n");

					} else
						System.out.println("Enter money greater than zero \n");
				} else
					System.out.println("Enter Valid Name with only aplhabets and Name Starting with Capital Letter \n");

			}

			else {
				System.out.println("Enter Valid 10 digit number starting with 6/7/8/9\n");
			}
			if (walletService.ValidateMobNo("9854121412")) {
				System.out.println("SHOW BALANCE\nCustomer Name: " + walletService.showBalance("9854121412").getCustomerName()+"\nBalance: "+walletService.showBalance("9854121412").getWallet() + "\n");

			} else {
				System.out.println("Enter Ten Digit Number starting with 6/7/8/9\n  ");
			}
			/*
			 * System.out.println("CREATE ACCOUNT\n" + walletService.createAccount("Raj",
			 * "9854121415", new BigDecimal("500.00")) + "\n");
			 * System.out.println("CREATE ACCOUNT\n" + walletService.createAccount("Suraj",
			 * "9854121413", new BigDecimal("500.00")) + "\n");
			 */
			System.out.println(
					"DEPOSIT AMOUNT\n" + walletService.depositAmount("9854121413", new BigDecimal("500.00")) + "\n");
			System.out.println(
					"WITHDRAW AMOUNT\n" + walletService.withdrawAmount("9854121413", new BigDecimal("100.00")) + "\n");
			System.out.println("FUND TRANSFER\n"
					+ walletService.fundTransfer("9854121413", "9854121412", new BigDecimal("200.00")) + "\n");

		} catch (DuplicateMobileNumberException duplicateMobileException) {
			System.out.println("Duplicate Mobile Number Found : " + duplicateMobileException);
		} catch (InsufficientAmountException insufficientAmountException) {
			System.out.println("Insufficient Amount in Wallet : " + insufficientAmountException);
		} catch (MobileNumberDoesNotExistException mobileNumberDoesNotExist) {
			System.out.println("Mobile Number Doesn't Exist : " + mobileNumberDoesNotExist);
		} catch (InvalidInputException invalidInputException) {
			System.out.println(" " + invalidInputException);
		}

	}
}
