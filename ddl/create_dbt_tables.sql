create schema dbt;

create table dbt.tdbddp
(
    pnum      bigint PRIMARY KEY,
    timestamp timestamptz,
    plexmem   varchar(500)
);

create table dbt.tdbddc
(
    pnum      bigint PRIMARY KEY,
    timestamp timestamptz,
    plexmem   varchar(500)
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
