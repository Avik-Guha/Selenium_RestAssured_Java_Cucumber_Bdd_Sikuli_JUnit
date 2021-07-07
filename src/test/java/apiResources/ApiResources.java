package apiResources;

public enum ApiResources {
	
	//*******Resource URL*******\\
	
	addPlaceAPI("/maps/api/place/add/json"),
	getPlaceAPI("/maps/api/place/get/json"),
	deletePlaceAPI("/maps/api/place/delete/json"),
	updatePlaceAPI("/maps/api/place/update/json"),
	
	
	//******Query Parameter*******\\
	
	recordID("place_id"),
	key("qaclick123");
	
	
	private String resource;
	
	ApiResources(String resource) {
		this.resource = resource;
	}
	
	public String getResource() {
		return resource;
	} 


}
