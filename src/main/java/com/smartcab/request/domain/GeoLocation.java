package com.smartcab.request.domain;

public class GeoLocation {
	/**
	 * @return the latitude
	 */
	private double latitude;
	private double longitude;
	public double getLatitude() {
		return latitude;
	}
	/**
	 * @return the longitude
	 */
	public double getLongitude() {
		return longitude;
	}
	/**
	 * @param d the latitude to set
	 */
	public void setLatitude(double d) {
		this.latitude = d;
	}
	/**
	 * @param longitude the longitude to set
	 */
	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "GeoLocation [latitude=" + latitude + ", longitude=" + longitude
				+ "]";
	}

	

}
