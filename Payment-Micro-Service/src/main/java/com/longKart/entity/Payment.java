package com.longKart.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PAYMENT_TB")
public class Payment {

	@Id
	@GeneratedValue
	int paymentId;
	String transactionId;
	String paymentStatus;
	String orderId;
	double amount;
	
	

	@Override
	public String toString() {
		return "Payment [paymentId=" + paymentId + ", transactionId=" + transactionId + ", paymentStatus="
				+ paymentStatus + ", orderId=" + orderId + ", amount=" + amount + "]";
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public int getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(int paymentId) {
		this.paymentId = paymentId;
	}

	public String getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	public String getPaymentStatus() {
		return paymentStatus;
	}

	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

}
