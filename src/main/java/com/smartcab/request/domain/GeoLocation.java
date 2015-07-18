package com.smartcab.request.domain;

public class GeoLocation {
	/**
	 * @return the latitude
	 */
	private int latitude;
	private int longitude;
	public int getLatitude() {
		return latitude;
	}
	/**
	 * @return the longitude
	 */
	public int getLongitude() {
		return longitude;
	}
	/**
	 * @param latitude the latitude to set
	 */
	public void setLatitude(int latitude) {
		this.latitude = latitude;
	}
	/**
	 * @param longitude the longitude to set
	 */
	public void setLongitude(int longitude) {
		this.longitude = longitude;
	}

	

}
