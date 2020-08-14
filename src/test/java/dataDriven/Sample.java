package dataDriven;

import java.io.IOException;
import java.util.ArrayList;

public class Sample {
	
	public static void main(String[] args) throws IOException {
		DataDriven d = new DataDriven();
		ArrayList<String> ad = d.getData("Username");
		System.out.println(ad.get(0));
		System.out.println(ad.get(1));
		System.out.println(ad.get(2));
	}

}
