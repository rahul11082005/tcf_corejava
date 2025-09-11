package com.tcf.shopping;

public class Food implements ShoppingMall{
	@Override
	public void purchase() {
		System.out.println("Buying Lunch...");		
	}
}
