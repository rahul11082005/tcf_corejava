package com.tcf.encapsulation;

public class CustomerDemo {
	public class Customer {
		private int cid;
		private String name;
		private String city; 
		public int getCid(){
			return cid;
		}
		public void setCid(int cid) {
			this.cid = cid;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
	}
	}
