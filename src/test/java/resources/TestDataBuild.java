package resources;

import java.util.ArrayList;
import java.util.List;

import pojo.AddPlace;
import pojo.Location;

public class TestDataBuild {
	
	
	public AddPlace addPlacePayload(String name, String language, String address) {
		
		
		AddPlace add = new AddPlace();
		add.setAccuracy(50);
		add.setAddress(address);
		add.setLanguage(language);
		add.setName(name);
		add.setPhone_number("(+91) 983 893 3937");
		add.setWebsite("http://google.com");
		
		List<String> myList = new ArrayList<>();
		myList.add("shoe park");
		myList.add("shop");
		add.setTypes(myList);
		Location l = new Location();
		l.setLat(-38.383494);
		l.setLng(33.427362);
		
		add.setLocation(l);
		
		return add;
	}
	
	public String deletePlacePayload(String placeId)
	{
		
		return "{\"place_id\":\""+placeId+"\"}";
	}
}
