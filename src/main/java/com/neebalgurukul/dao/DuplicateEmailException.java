package com.neebalgurukul.dao;

public class DuplicateEmailException extends Exception {

    public DuplicateEmailException(String msg) {
	super(msg);
    }
}
