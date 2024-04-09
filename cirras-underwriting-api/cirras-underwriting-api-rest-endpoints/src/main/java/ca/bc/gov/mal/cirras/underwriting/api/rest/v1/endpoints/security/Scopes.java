package ca.bc.gov.mal.cirras.underwriting.api.rest.v1.endpoints.security;

public class Scopes {
	public static final String GET_TOP_LEVEL = "CIRRAS_UNDERWRITING.GET_TOP_LEVEL";
	
	public static final String GET_CODE_TABLES = "CIRRAS_UNDERWRITING.GET_CODE_TABLES";

	public static final String SEARCH_UWCONTRACTS = "CIRRAS_UNDERWRITING.SEARCH_UWCONTRACTS";
	public static final String GET_UWCONTRACT = "CIRRAS_UNDERWRITING.GET_UWCONTRACT";
	
	public static final String CREATE_INVENTORY_CONTRACT = "CIRRAS_UNDERWRITING.CREATE_INVENTORY_CONTRACT";
	public static final String GET_INVENTORY_CONTRACT = "CIRRAS_UNDERWRITING.GET_INVENTORY_CONTRACT";
	public static final String UPDATE_INVENTORY_CONTRACT = "CIRRAS_UNDERWRITING.UPDATE_INVENTORY_CONTRACT";
	public static final String DELETE_INVENTORY_CONTRACT = "CIRRAS_UNDERWRITING.DELETE_INVENTORY_CONTRACT";
	public static final String PRINT_INVENTORY_CONTRACT = "CIRRAS_UNDERWRITING.PRINT_INVENTORY_CONTRACT";

	public static final String SEARCH_ANNUAL_FIELDS = "CIRRAS_UNDERWRITING.SEARCH_ANNUAL_FIELDS";

	public static final String CREATE_LEGAL_LAND = "CIRRAS_UNDERWRITING.CREATE_LEGAL_LAND";
	public static final String GET_LEGAL_LAND = "CIRRAS_UNDERWRITING.GET_LEGAL_LAND";
	public static final String UPDATE_LEGAL_LAND = "CIRRAS_UNDERWRITING.UPDATE_LEGAL_LAND";
	public static final String DELETE_LEGAL_LAND = "CIRRAS_UNDERWRITING.DELETE_LEGAL_LAND";

	public static final String GET_SEEDING_DEADLINES = "CIRRAS_UNDERWRITING.GET_SEEDING_DEADLINES";
	public static final String SAVE_SEEDING_DEADLINES = "CIRRAS_UNDERWRITING.SAVE_SEEDING_DEADLINES";

	public static final String CREATE_UNDERWRITING_YEAR = "CIRRAS_UNDERWRITING.CREATE_UNDERWRITING_YEAR";
	public static final String GET_UNDERWRITING_YEAR = "CIRRAS_UNDERWRITING.GET_UNDERWRITING_YEAR";
	public static final String DELETE_UNDERWRITING_YEAR = "CIRRAS_UNDERWRITING.DELETE_UNDERWRITING_YEAR";

	//Data Sync Scopes
	public static final String CREATE_SYNC_UNDERWRITING = "CIRRAS_UNDERWRITING.CREATE_SYNC_UNDERWRITING";
	public static final String UPDATE_SYNC_UNDERWRITING = "CIRRAS_UNDERWRITING.UPDATE_SYNC_UNDERWRITING";
	public static final String DELETE_SYNC_UNDERWRITING = "CIRRAS_UNDERWRITING.DELETE_SYNC_UNDERWRITING";

	public static final String GET_GROWER = "CIRRAS_UNDERWRITING.GET_GROWER";
	public static final String GET_POLICY = "CIRRAS_UNDERWRITING.GET_POLICY";
	public static final String GET_LAND = "CIRRAS_UNDERWRITING.GET_LAND";
	public static final String GET_COMMODITY_VARIETY = "CIRRAS_UNDERWRITING.GET_COMMODITY_VARIETY";

	public static final String GET_CONTACT = "CIRRAS_UNDERWRITING.GET_CONTACT";
	public static final String GET_GROWER_CONTACT = "CIRRAS_UNDERWRITING.GET_GROWER_CONTACT";
	public static final String GET_CONTACT_EMAIL = "CIRRAS_UNDERWRITING.GET_CONTACT_EMAIL";
	public static final String GET_CONTACT_PHONE = "CIRRAS_UNDERWRITING.GET_CONTACT_PHONE";
	
	public static final String GET_COMMODITY_TYPE_CODE = "CIRRAS_UNDERWRITING.GET_COMMODITY_TYPE_CODE";
	public static final String GET_COMMODITY_TYPE_VARIETY_XREF = "CIRRAS_UNDERWRITING.GET_COMMODITY_TYPE_VARIETY_XREF";

	//Yield
	public static final String CREATE_DOP_YIELD_CONTRACT = "CIRRAS_UNDERWRITING.CREATE_DOP_YIELD_CONTRACT";
	public static final String GET_DOP_YIELD_CONTRACT = "CIRRAS_UNDERWRITING.GET_DOP_YIELD_CONTRACT";
	public static final String UPDATE_DOP_YIELD_CONTRACT = "CIRRAS_UNDERWRITING.UPDATE_DOP_YIELD_CONTRACT";
	public static final String DELETE_DOP_YIELD_CONTRACT = "CIRRAS_UNDERWRITING.DELETE_DOP_YIELD_CONTRACT";
	public static final String PRINT_DOP_YIELD_CONTRACT = "CIRRAS_UNDERWRITING.PRINT_DOP_YIELD_CONTRACT";
	
	public static final String GET_YIELD_MEAS_UNIT_TYPE_CODES = "CIRRAS_UNDERWRITING.GET_YIELD_MEAS_UNIT_TYPE_CODES";
	
	public static final String GET_CROP_VARIETY_INSURABILITIES = "CIRRAS_UNDERWRITING.GET_CROP_VARIETY_INSURABILITIES";
	public static final String SAVE_CROP_VARIETY_INSURABILITIES = "CIRRAS_UNDERWRITING.SAVE_CROP_VARIETY_INSURABILITIES";

	public static final String GET_GRADE_MODIFIERS = "CIRRAS_UNDERWRITING.GET_GRADE_MODIFIERS";
	public static final String SAVE_GRADE_MODIFIERS = "CIRRAS_UNDERWRITING.SAVE_GRADE_MODIFIERS";
	
	public static final String GET_YIELD_MEAS_UNIT_CONVERSIONS = "CIRRAS_UNDERWRITING.GET_YIELD_MEAS_UNIT_CONVERSIONS";
	public static final String SAVE_YIELD_MEAS_UNIT_CONVERSIONS = "CIRRAS_UNDERWRITING.SAVE_YIELD_MEAS_UNIT_CONVERSIONS";
	
	//Comments
	public static final String DELETE_COMMENTS = "CIRRAS_UNDERWRITING.DELETE_COMMENTS";

}
