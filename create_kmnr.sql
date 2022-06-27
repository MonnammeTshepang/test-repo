CREATE TABLE public.kmnr
(
    art               varchar(8)  NULL,
    dtaen             date        NULL,
    dtanl             date        NULL,
    kmabtlung         varchar(8)  NULL,
    kmnr              varchar(6)  NOT NULL,
    kmpak             varchar(18) NULL,
    kogr              varchar(4)  NULL,
    kotxt             varchar(40) NULL,
    se_termin         varchar(8)  NULL,
    stand             varchar(10) NULL,
    txtes             varchar(6)  NULL,
    ze_termin         varchar(8)  NULL,
    ziel_termin       date        NULL,
    db2_timestamp     timestamptz NULL,
    kafka_timestamp   timestamptz NULL,
    app_timestamp     timestamptz NULL,
    db2_app_latency   int8        NULL,
    kafka_app_latency int8        NULL,
    CONSTRAINT kmnr_pkey PRIMARY KEY (kmnr)
);