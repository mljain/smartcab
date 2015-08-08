package com.smartcab.member.domain;

public class Member {
	private int memberId;
	private String firstName;
	private String lastName;
	private String phoneNo;
	private String email;
	private MemberType memberType;

	/**
	 * @return the memberId
	 */
	public int getMemberId() {
		return memberId;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @return the phoneNo
	 */
	public String getPhoneNo() {
		return phoneNo;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @return the memberType
	 */
	public MemberType getMemberType() {
		return memberType;
	}

	/**
	 * @param memberId
	 *            the memberId to set
	 */
	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}

	/**
	 * @param firstName
	 *            the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @param lastName
	 *            the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @param phoneNo
	 *            the phoneNo to set
	 */
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	/**
	 * @param email
	 *            the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @param memberType
	 *            the memberType to set
	 */
	public void setMemberType(MemberType memberType) {
		this.memberType = memberType;
	}
	
	public void updateMember(Member member){
		//TODO ...
		// Need to implement later 
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Member [memberId=" + memberId + ", firstName=" + firstName
				+ ", lastName=" + lastName + ", phoneNo=" + phoneNo
				+ ", email=" + email + ", memberType=" + memberType + "]";
	}

}
