package ca.bc.gov.mal.cirras.underwriting.api.rest.v1.endpoints;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import ca.bc.gov.nrs.common.wfone.rest.resource.HeaderConstants;
import ca.bc.gov.nrs.common.wfone.rest.resource.MessageListRsrc;
import ca.bc.gov.nrs.wfone.common.rest.endpoints.BaseEndpoints;
import ca.bc.gov.mal.cirras.underwriting.api.rest.v1.endpoints.security.Scopes;
import ca.bc.gov.mal.cirras.underwriting.api.rest.v1.resource.SyncCommodityVarietyRsrc;
import ca.bc.gov.mal.cirras.underwriting.model.v1.SyncCommodityVariety;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.extensions.Extension;
import io.swagger.v3.oas.annotations.extensions.ExtensionProperty;
import io.swagger.v3.oas.annotations.headers.Header;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;

@Path("/synccommodityvariety")
public interface SyncCommodityVarietyEndpoint extends BaseEndpoints {
	
	@Operation(operationId = "Insert or Update a commodity or variety", summary = "Insert or Update a commodity or variety", security = @SecurityRequirement(name = "Webade-OAUTH2", scopes = {Scopes.UPDATE_SYNC_UNDERWRITING}),  extensions = {@Extension(properties = {@ExtensionProperty(name = "auth-type", value = "#{wso2.x-auth-type.none}"), @ExtensionProperty(name = "throttling-tier", value = "Unlimited") })})
	@Parameters({
		@Parameter(name = HeaderConstants.REQUEST_ID_HEADER, description = HeaderConstants.REQUEST_ID_HEADER_DESCRIPTION, required = false, schema = @Schema(implementation = String.class), in = ParameterIn.HEADER),
		@Parameter(name = HeaderConstants.VERSION_HEADER, description = HeaderConstants.VERSION_HEADER_DESCRIPTION, required = false, schema = @Schema(implementation = Integer.class), in = ParameterIn.HEADER),
		@Parameter(name = HeaderConstants.CACHE_CONTROL_HEADER, description = HeaderConstants.CACHE_CONTROL_DESCRIPTION, required = false, schema = @Schema(implementation = String.class), in = ParameterIn.HEADER),
		@Parameter(name = HeaderConstants.PRAGMA_HEADER, description = HeaderConstants.PRAGMA_HEADER_DESCRIPTION, required = false, schema = @Schema(implementation = String.class), in = ParameterIn.HEADER),
		@Parameter(name = HeaderConstants.AUTHORIZATION_HEADER, description = HeaderConstants.AUTHORIZATION_HEADER_DESCRIPTION, required = false, schema = @Schema(implementation = String.class), in = ParameterIn.HEADER) 
	})
	@ApiResponses(value = {
		@ApiResponse(responseCode = "204", description = "No Content"),	
		@ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(schema = @Schema(implementation = MessageListRsrc.class))),
		@ApiResponse(responseCode = "403", description = "Forbidden"),
		@ApiResponse(responseCode = "404", description = "Not Found"),
		@ApiResponse(responseCode = "409", description = "Conflict", content = @Content(schema = @Schema(implementation = MessageListRsrc.class))),
		@ApiResponse(responseCode = "412", description = "Precondition Failed"),
		@ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(schema = @Schema(implementation = MessageListRsrc.class))) })
	@POST
	@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public Response synchronizeCommodityVariety(
		@Parameter(name = "crop", description = "The commodity variety resource containing the values from CIRRAS.", required = true) SyncCommodityVarietyRsrc crop
	);

	
	@Operation(operationId = "Delete commodity or variety record", summary = "Delete commodity or variety record", security = @SecurityRequirement(name = "Webade-OAUTH2", scopes = {Scopes.DELETE_SYNC_UNDERWRITING}), extensions = {@Extension(properties = {@ExtensionProperty(name = "auth-type", value = "#{wso2.x-auth-type.none}"), @ExtensionProperty(name = "throttling-tier", value = "Unlimited") })})
	@Parameters({
		@Parameter(name = HeaderConstants.REQUEST_ID_HEADER, description = HeaderConstants.REQUEST_ID_HEADER_DESCRIPTION, required = false, schema = @Schema(implementation = String.class), in = ParameterIn.HEADER),
		@Parameter(name = HeaderConstants.VERSION_HEADER, description = HeaderConstants.VERSION_HEADER_DESCRIPTION, required = false, schema = @Schema(implementation = Integer.class), in = ParameterIn.HEADER),
		@Parameter(name = HeaderConstants.CACHE_CONTROL_HEADER, description = HeaderConstants.CACHE_CONTROL_DESCRIPTION, required = false, schema = @Schema(implementation = String.class), in = ParameterIn.HEADER),
		@Parameter(name = HeaderConstants.PRAGMA_HEADER, description = HeaderConstants.PRAGMA_HEADER_DESCRIPTION, required = false, schema = @Schema(implementation = String.class), in = ParameterIn.HEADER),
		@Parameter(name = HeaderConstants.AUTHORIZATION_HEADER, description = HeaderConstants.AUTHORIZATION_HEADER_DESCRIPTION, required = false, schema = @Schema(implementation = String.class), in = ParameterIn.HEADER),
		@Parameter(name = HeaderConstants.IF_MATCH_HEADER, description = HeaderConstants.IF_MATCH_DESCRIPTION, required = true, schema = @Schema(implementation = String.class), in = ParameterIn.HEADER)
	})
	@ApiResponses(value = { @ApiResponse(responseCode = "204", description = "No Content"),
		@ApiResponse(responseCode = "403", description = "Forbidden"),
		@ApiResponse(responseCode = "404", description = "Not Found"),
		@ApiResponse(responseCode = "409", description = "Conflict"),
		@ApiResponse(responseCode = "412", description = "Precondition Failed"),
		@ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(schema = @Schema(implementation = MessageListRsrc.class))) })
	@DELETE
	public Response deleteSyncCommodityVariety(
		@Parameter(description = "The id of the crop type in CIRRAS.") @QueryParam("crptId") String crptId
	);

	
	@Operation(operationId = "Get a commodity or variety", summary = "Get a commodity or variety", security = @SecurityRequirement(name = "Webade-OAUTH2", scopes = {Scopes.GET_COMMODITY_VARIETY}), extensions = {@Extension(properties = {@ExtensionProperty(name = "auth-type", value = "#{wso2.x-auth-type.none}"), @ExtensionProperty(name = "throttling-tier", value = "Unlimited") })})
	@Parameters({
		@Parameter(name = HeaderConstants.REQUEST_ID_HEADER, description = HeaderConstants.REQUEST_ID_HEADER_DESCRIPTION, required = false, schema = @Schema(implementation = String.class), in = ParameterIn.HEADER),
		@Parameter(name = HeaderConstants.VERSION_HEADER, description = HeaderConstants.VERSION_HEADER_DESCRIPTION, required = false, schema = @Schema(implementation = Integer.class), in = ParameterIn.HEADER),
		@Parameter(name = HeaderConstants.CACHE_CONTROL_HEADER, description = HeaderConstants.CACHE_CONTROL_DESCRIPTION, required = false, schema = @Schema(implementation = String.class), in = ParameterIn.HEADER),
		@Parameter(name = HeaderConstants.PRAGMA_HEADER, description = HeaderConstants.PRAGMA_HEADER_DESCRIPTION, required = false, schema = @Schema(implementation = String.class), in = ParameterIn.HEADER),
		@Parameter(name = HeaderConstants.AUTHORIZATION_HEADER, description = HeaderConstants.AUTHORIZATION_HEADER_DESCRIPTION, required = false, schema = @Schema(implementation = String.class), in = ParameterIn.HEADER) 
	})
	@ApiResponses(value = {
		@ApiResponse(responseCode = "200", description = "OK", content = @Content(schema = @Schema(implementation = SyncCommodityVariety.class)), headers = @Header(name = HeaderConstants.ETAG_HEADER, schema = @Schema(implementation = String.class), description = HeaderConstants.ETAG_DESCRIPTION)),
		@ApiResponse(responseCode = "404", description = "Not Found"),
		@ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(schema = @Schema(implementation = MessageListRsrc.class))) })
	@GET
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	Response getSyncCommodityVariety(
		@Parameter(description = "The id of the commodity or variety in CIRRAS.") @QueryParam("crptId") String crptId
	);
}
