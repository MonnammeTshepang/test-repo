create table health_data(
                            id bigint  GENERATED  BY DEFAULT  AS IDENTITY,
                            create_timestamp timestamp,
                            receive_timestamp timestamp,
                            hdata varchar(50000)
);
