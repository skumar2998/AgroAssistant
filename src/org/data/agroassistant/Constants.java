package org.data.agroassistant;

import android.provider.BaseColumns;

public interface Constants extends BaseColumns {
	
	public static final int FARMER_SEARCH = 0;
	public static final int FARM_SEARCH = 1;
	public static final int CROP_SEARCH = 2;
	public static final int PRICE_SEARCH = 3;
	
	/*====DATABASE CONSTANTS======================
	 * Constants used by the database adapter class
	 */
	public static final String DATABASE_NAME = "agroassistant.db";
	public static final String QUERY_TABLE= "queries";
	public static final String FARMERS_TABLE= "farmers";
	public static final String FARMS_TABLE= "farms";
	public static final String CROPS_TABLE= "crops";
	public static final String PRICES_TABLE= "prices";
	
	//Columns in the Query table
	public static final String QUERY_DATE = "date";
	public static final String QUERY_URL = "url";
	public static final String QUERY_COUNT = "count";
	public static final String QUERY_PAGE = "page";
	
	//Columns in the Farmers table
	public static final String FARMER_ID = "farmerid";
	public static final String FARMER_FNAME = "firstname";
	public static final String FARMER_LNAME = "lastname";
	public static final String FARMER_SIZE = "farmersize";
	
	//Columns in the Farms table
	public static final String FARM_ID = "farmid";
	public static final String FARM_FARMER_ID = "farmerid";
	public static final String FARM_SIZE = "propertysize";
	public static final String FARM_PARISH = "parish";
	public static final String FARM_EXTENSION = "extension";
	public static final String FARM_DISTRICT = "district";
	public static final String FARM_LAT = "xcoord";
	public static final String FARM_LONG = "ycoord";
	
	//Columns in the Crops table
	public static final String CROPS_ID = "cropid";
	public static final String CROPS_PROPERTY_ID = "propertyid";
	public static final String CROPS_GROUP = "cropgroup";
	public static final String CROPS_TYPE = "croptype";
	public static final String CROPS_AREA = "croparea";
	public static final String CROPS_COUNT = "cropcount";
	public static final String CROPS_DATE = "cropdate";
	public static final String CROP_LAT = "xcoord";
	public static final String CROP_LONG = "ycoord";
	
	public static final String[] FROM_FARMERS = {_ID, FARMER_ID, FARMER_FNAME, FARMER_LNAME, FARMER_SIZE};
	public static final String[] FROM_FARMS = {_ID, FARM_ID, FARM_FARMER_ID, FARM_SIZE, FARM_PARISH, FARM_EXTENSION, FARM_DISTRICT, FARM_LAT, FARM_LONG};
	
	public static final String FROM_S_FARMERS = _ID + ", " + FARMER_ID + ", " + FARMER_FNAME + ", " + FARMER_LNAME + ", " + FARMER_SIZE;
	public static final String FROM_S_FARMS = _ID + ", " + FARM_ID + ", " + FARM_FARMER_ID + ", " + FARM_SIZE + ", " + FARM_PARISH + ", " + FARM_EXTENSION + ", " + FARM_DISTRICT + ", " + FARM_LAT + ", " + FARM_LONG;
	
}