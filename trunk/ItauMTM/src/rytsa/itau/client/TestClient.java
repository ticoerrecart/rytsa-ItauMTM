package rytsa.itau.client;

import client.ws.rytsa.Test;
import client.ws.rytsa.TestService;

public class TestClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			TestService ts = new TestService();
			Test t = ts.getTestPort();
			t.calcularMTMNdf("03/06/2010");
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}

}
