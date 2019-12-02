package com.Store.com;

public class StoreClass {
	private String storenum;
    private String skeunum;
    private int shelfQty;
    private int storeQty;
    
    public StoreClass(String storenum, String skeunum, int shelfQty,int storeQty)
    {
    	this.storenum=storenum;
    	this.skeunum=skeunum;
    	this.shelfQty=shelfQty;
    	this.storeQty=storeQty;
    }
	public String getStorenum() {
		return storenum;
	}
	public void setStorenum(String storenum) {
		this.storenum = storenum;
	}
	public String getSkeunum() {
		return skeunum;
	}
	public void setSkeunum(String skeunum) {
		this.skeunum = skeunum;
	}
	public int getShelfQty() {
		return shelfQty;
	}
	public void setShelfQty(int shelfQty) {
		this.shelfQty = shelfQty;
	}
	public int getStoreQty() {
		return storeQty;
	}
	public void setStoreQty(int storeQty) {
		this.storeQty = storeQty;
	}
	@Override
	public String toString()
	{
		return "Store [Number=" + storenum + ", SKEUnum=" + skeunum + ",ShelfQTY= " + shelfQty
                + ",StoreQTY="+storeQty+"]";
	}
	
}
