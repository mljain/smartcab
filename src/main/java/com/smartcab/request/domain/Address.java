package com.smartcab.request.domain;

public class Address {
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Address [sourceAddrsss=" + sourceAddrsss
				+ ", destinationAddrsss=" + destinationAddrsss
				+ ", addressType=" + addressType + "]";
	}

	private String sourceAddrsss;
	private String destinationAddrsss;
	private String addressType;

	/**
	 * @return the sourceAddrsss
	 */
	public String getSourceAddrsss() {
		return sourceAddrsss;
	}

	/**
	 * @return the destinationAddrsss
	 */
	public String getDestinationAddrsss() {
		return destinationAddrsss;
	}

	/**
	 * @return the addressType
	 */
	public String getAddressType() {
		return addressType;
	}

	/**
	 * @param sourceAddrsss
	 *            the sourceAddrsss to set
	 */
	public void setSourceAddrsss(String sourceAddrsss) {
		this.sourceAddrsss = sourceAddrsss;
	}

	/**
	 * @param destinationAddrsss
	 *            the destinationAddrsss to set
	 */
	public void setDestinationAddrsss(String destinationAddrsss) {
		this.destinationAddrsss = destinationAddrsss;
	}

	/**
	 * @param addressType
	 *            the addressType to set
	 */
	public void setAddressType(String addressType) {
		this.addressType = addressType;
	}

}
