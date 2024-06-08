package com.saimun.springboottesting1.response;

public enum ResponseMessage {
	SUCCESSFULLY_SAVED("Successfully Saved"),
	SUCCESSFULLY_UPDATED("Successfully Updated"),
	SUCCESSFULLY_DELETED("Successfully Deleted"),
	SUCCESSFULLY_APPROVED("Successfully Approved"),
	SUCCESSFULLY_REJECTED("Successfully Rejected"),
	SUCCESSFULLY_VERIFIED("Successfully Verified"),
	SUCCESSFULLY_COMPLETED("Successfully Completed"),
	SUCCESSFULLY_GENERATED("Successfully Generated"),
	SUCCESSFULLY_SUBMITTED("Successfully Submitted"),
	SUCCESSFULLY_DISPATCHED("Successfully Dispatched"),
	// ENTITY_NOT_UPDATED("%s Not Found"),
	ENTITY_RETRIEVED_SUCCESS("Object Retrieved Successfully"),

	ERROR_MESSAGE("Some Thing Wrong"),
	NOT_FOUND("Entity Not Found"),
	UN_AUTHORIZED_ACCESS("Un-authorized access"),
	ALREADY_EXIST("Already Exist!"),
	PURPOSE_CODE_EMPTY("Purpose Code Cannot be empty!"),
	NO_DATA_AVAILABLE("No Data Available"),
	DATA_AVAILABLE("Data Available");

	private final String label;

	ResponseMessage(String label) {
		this.label = label;
	}

	@Override
	public String toString() {
		return "ResponseMessage{" +
				"label='" + label + '\'' +
				'}';
	}
}
