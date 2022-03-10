package com.Lockeddme;

import com.Lockeddme.FileOperation.FileOperations;

public class LockedmeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FileOperations.createMainFolderIfNotPresent("main");

		MenuOption.printWelcomeScreen("LockedMe", "Manish Reddy");

		HandleOptions.handleWelcomeScreenInput();
	}

}
