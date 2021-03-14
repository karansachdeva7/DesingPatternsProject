package structural.proxy;

import java.util.ArrayList;
import java.util.List;

public class ProxyInternet implements Internet{
	private Internet internet = new RealInternet();
	private static List<String> bannedSites;
	
	static {
		bannedSites = new ArrayList<String>();
		bannedSites.add("www.abc.com");
		bannedSites.add("www.xyz.com");
		bannedSites.add("www.klm.com");
	}

	@Override
	public void connectTo(String site) throws Exception {
		if(bannedSites.contains(site.toLowerCase())) {
			throw new Exception("Access denied");
		}
			
		internet.connectTo(site);
	}

}
