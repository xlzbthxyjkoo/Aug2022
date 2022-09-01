package kr.ac.sku.ioc;

public class TVFactory {
	public static TV getTV(String tvName) {
		TV tv = null;
		if("carami".equals(tvName))
			tv = new CaramiTV();
		else if("ding".equals(tvName))
			tv = new DingdingTV();
		
		
		return tv;
	}
}
