export CATALINA_OPTS="-DPOSTGRES_RESOURCE_NAME=$POSTGRES_RESOURCE_NAME -DPOSTGRES_URL=$POSTGRES_URL -DPOSTGRES_USERNAME=$POSTGRES_USERNAME -DPOSTGRES_PASSWORD=$POSTGRES_PASSWORD -DPOSTGRES_MAXACTIVE=$POSTGRES_MAXACTIVE -DWEBADE_USERNAME=$WEBADE_USERNAME -DWEBADE_PASSWORD=$WEBADE_PASSWORD -DWEBADE_MAXACTIVE=$WEBADE_MAXACTIVE -DWEBADE_GET_TOKEN_URL=$WEBADE_GET_TOKEN_URL -DWEBADE_CHECK_TOKEN_URL=$WEBADE_CHECK_TOKEN_URL -DCIRRAS_UNDERWRITING_REST_SECRET=$CIRRAS_UNDERWRITING_REST_SECRET -DJASPER_URL=$JASPER_URL -DJASPER_USERNAME=$JASPER_USERNAME -DJASPER_PASSWORD=$JASPER_PASSWORD $CATALINA_OPTS"