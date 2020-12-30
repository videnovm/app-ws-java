package com.app.ws.ui.model.response;

public class AddressesRest {
	private String addressId;
	private String city;
	private String country;
	private String streetName;
	private String postalCode;
	private String type;

	public String getAddressId() {
		return addressId;
	}

	public String getCity() {
		return city;
	}

	public String getCountry() {
		return country;
	}

	public String getStreetName() {
		return streetName;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public String getType() {
		return type;
	}

	public void setAddressId(String addressId) {
		this.addressId = addressId;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public void setType(String type) {
		this.type = type;
	}
}
