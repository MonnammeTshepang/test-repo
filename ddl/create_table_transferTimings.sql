create table transfer_timings(
                            id bigint  GENERATED  BY DEFAULT  AS IDENTITY,
                            db2_timestamp     timestamptz ,
                            kafka_timestamp   timestamptz ,
                            app_timestamp     timestamptz ,
                            db2_app_latency   int8        ,
                            kafka_app_latency int8        ,
                            remote_app_latency int8        ,
                            entity_name varchar(340)
);
