create schema DBT;

create table DBT.TDBDDC
(
    PNUM            INTEGER   not null,
    CNUM            INTEGER   not null,
    TIMESTAMP       TIMESTAMP not null default current_timestamp,
    PLEXMEM         CHAR(8)   not null,
    UPDATECOLC      INTEGER   not null default 0,
    db2_timestamp   timestamptz,
    kafka_timestamp timestamptz,
    change_tist     timestamptz,
    primary key (PNUM, CNUM)
);

CREATE TABLE DBT.TDBDDP
(
    PNUM            INTEGER   NOT NULL,
    TIMESTAMP       TIMESTAMP NOT NULL default current_timestamp,
    PLEXMEM         CHAR(8)   NOT NULL,
    UPDATECOLP      INTEGER   NOT NULL default 0,
    db2_timestamp   timestamptz,
    kafka_timestamp timestamptz,
    change_tist     timestamptz,
    PRIMARY KEY (PNUM)
);

CREATE OR REPLACE FUNCTION update_change_tist()
RETURNS TRIGGER AS $$
BEGIN
    NEW.change_tist = now();
RETURN NEW;
END;
$$ language 'plpgsql';

CREATE TRIGGER update_change_tist
    BEFORE UPDATE ON dbt.tdbddp
    FOR EACH ROW
    EXECUTE PROCEDURE update_change_tist();

CREATE TRIGGER insert_change_tist
    BEFORE INSERT ON dbt.tdbddp
    FOR EACH ROW
    EXECUTE PROCEDURE update_change_tist();

CREATE TRIGGER update_change_tist
    BEFORE UPDATE ON dbt.tdbddc
    FOR EACH ROW
    EXECUTE PROCEDURE update_change_tist();

CREATE TRIGGER insert_change_tist
    BEFORE INSERT ON dbt.tdbddc
    FOR EACH ROW
    EXECUTE PROCEDURE update_change_tist();
