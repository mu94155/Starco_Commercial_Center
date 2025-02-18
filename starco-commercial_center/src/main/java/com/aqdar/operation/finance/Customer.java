package com.aqdar.operation.finance;
import java.util.Objects;

public class Customer {
  private final String name;
  private final String address;
  private final String phone;
  private final String email;
  private final String dateOfBirth;
  private final String shopNumber;
  private Shop id;
  

  public Customer(String name, String address, String phone, String email, String dateOfBirth, String shopNumber) {
    this.name = name;
    this.address = address;
    this.phone = phone;
    this.email = email;
    this.dateOfBirth = dateOfBirth;
    this.shopNumber = shopNumber;
  }

  public String getName() {
    return this.name;
  }


  public String getAddress() {
    return this.address;
  }


  public String getPhone() {
    return this.phone;
  }


  public String getEmail() {
    return this.email;
  }


  public String getDateOfBirth() {
    return this.dateOfBirth;
  }


  public String getShopNumber() {
    return this.shopNumber;
  }


  @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Customer)) {
            return false;
        }
        Customer customer = (Customer) o;
        return Objects.equals(name, customer.name) && Objects.equals(address, customer.address) && Objects.equals(phone, customer.phone) && Objects.equals(email, customer.email) && Objects.equals(dateOfBirth, customer.dateOfBirth) && Objects.equals(shopNumber, customer.shopNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, address, phone, email, dateOfBirth, shopNumber);
  }

  @Override
  public String toString() {
    return "{" +
      " name='" + getName() + "'" +
      ", address='" + getAddress() + "'" +
      ", phone='" + getPhone() + "'" +
      ", email='" + getEmail() + "'" +
      ", dateOfBirth='" + getDateOfBirth() + "'" +
      ", shopNumber='" + getShopNumber() + "'" +
      "}";
  }

  public String getId(Shop shopNumber) {
    // TODO Auto-generated method stub
    this.id=shopNumber;
    throw new UnsupportedOperationException("Unimplemented method 'getId'");
  }




}
