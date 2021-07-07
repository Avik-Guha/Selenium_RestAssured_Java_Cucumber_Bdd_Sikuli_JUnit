package utility;

import java.util.ArrayList;
import java.util.List;

import pojo.AddPlace;
import pojo.Location;
import pojo.UpdatePlace;

public class TestDataBuild {
	
	public AddPlace addPlacePayLoad() {
		
		Location l = new Location();
		l.setLat(-38.383494);
		l.setLng(33.427362);
		
		List<String> myList = new ArrayList<String>();
		myList.add("shoe park");
		myList.add("shop");
		
		AddPlace ap = new AddPlace();
		ap.setAccuracy(50);
		ap.setAddress("29, side layout, cohen 09");
		ap.setLanguage("French-IN");
		ap.setName("Frontline house");
		ap.setPhone_number("(+91) 983 893 3937");
		ap.setWebsite("http://google.com");
		ap.setLocation(l);
		ap.setTypes(myList);
		
		return ap;
	}


	public UpdatePlace updatePlacePayLoad(String recordID, String key) {
		
		UpdatePlace updatePlace = new UpdatePlace();
		updatePlace.setPlace_id(recordID);
		updatePlace.setAddress("India");
		updatePlace.setKey(key);
		
		return updatePlace;
	}

}
