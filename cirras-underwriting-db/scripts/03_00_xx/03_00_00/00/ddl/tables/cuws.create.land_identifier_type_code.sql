

CREATE TABLE cuws.land_identifier_type_code(
    land_identifier_type_code    varchar(10)     NOT NULL,
    description                  varchar(100)    NOT NULL,
    sort_order                   numeric(2, 0)   NOT NULL,
    effective_date               date            NOT NULL,
    expiry_date                  date            NOT NULL,
    create_user                  varchar(64)     NOT NULL,
    create_date                  timestamp(0)    NOT NULL,
    update_user                  varchar(64)     NOT NULL,
    update_date                  timestamp(0)    NOT NULL
) TABLESPACE pg_default
;



COMMENT ON COLUMN cuws.land_identifier_type_code.land_identifier_type_code IS 'Land Identifier Type Code is a code value that uniquely identifies a record.'
;
COMMENT ON COLUMN cuws.land_identifier_type_code.description IS 'Description is the long description associated with the code'
;
COMMENT ON COLUMN cuws.land_identifier_type_code.sort_order IS 'Sort Order is a number used to sort the land identifier type code in a specific order'
;
COMMENT ON COLUMN cuws.land_identifier_type_code.effective_date IS 'Effective Date is the date when the record was first active'
;
COMMENT ON COLUMN cuws.land_identifier_type_code.expiry_date IS 'Expiry Date is the date when the record was last active'
;
COMMENT ON COLUMN cuws.land_identifier_type_code.create_user IS 'Create User is the user id of the user that created the record'
;
COMMENT ON COLUMN cuws.land_identifier_type_code.create_date IS 'Create Date is the date when the record was created.'
;
COMMENT ON COLUMN cuws.land_identifier_type_code.update_user IS 'Update User is the user id of the user that updated the record last'
;
COMMENT ON COLUMN cuws.land_identifier_type_code.update_date IS 'Update Date is the date when the record was updated last.'
;
COMMENT ON TABLE cuws.land_identifier_type_code IS 'The table defines types of land identifiers.'
;

ALTER TABLE cuws.land_identifier_type_code ADD 
    CONSTRAINT pk_litc PRIMARY KEY (land_identifier_type_code) USING INDEX TABLESPACE pg_default 
;
