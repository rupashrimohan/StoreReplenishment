package com.Store.com;

public class StoreClass {
	private int storenum;
    private int skeunum;
    private int shelfQty;
    private int storeQty;
    
    public StoreClass(int storenum, int skeunum, int shelfQty,int storeQty)
    {
    	this.storenum=storenum;
    	this.skeunum=skeunum;
    	this.shelfQty=shelfQty;
    	this.storeQty=storeQty;
    }
	public int getStorenum() {
		return storenum;
	}
	public void setStorenum(int storenum) {
		this.storenum = storenum;
	}
	public int getSkeunum() {
		return skeunum;
	}
	public void setSkeunum(int skeunum) {
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
