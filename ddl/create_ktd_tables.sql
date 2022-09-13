
CREATE SCHEMA IF NOT EXISTS KDT;


CREATE TABLE KDT.TKDA05
(
    PRODA CHAR(1)  NOT NULL,
    PRIMA CHAR(3)  NOT NULL,
    HIST  CHAR(1)  NOT NULL,
    AWAHL CHAR(1)  NOT NULL,
    SALA  CHAR(5)  NOT NULL,
    SABEN CHAR(40) NOT NULL DEFAULT '',
    GKZ   CHAR(1)  NOT NULL DEFAULT '',
    GEHKZ CHAR(1)  NOT NULL DEFAULT ''
);

CREATE TABLE KDT.TKDA10
(
    LACK           CHAR(3)  NOT NULL,
    LART           CHAR(1)  NOT NULL DEFAULT '',
    FACOD          CHAR(2)  NOT NULL DEFAULT '',
    ANZKZ          CHAR(1)  NOT NULL DEFAULT '',
    GKZH           CHAR(1)  NOT NULL DEFAULT '',
    LBEN           CHAR(40) NOT NULL DEFAULT '',
    LACKVERWENDUNG CHAR(1)  NOT NULL DEFAULT '',
    KREIS          CHAR(1),
    LACKART_ALT    CHAR(1)  NOT NULL DEFAULT ''
);

CREATE TABLE KDT.TKDN01
(
    KMNR                    CHAR(6)    NOT NULL,
    AGBST                   DECIMAL(2) NOT NULL DEFAULT 0,
    TXTES                   CHAR(6)    NOT NULL DEFAULT '',
    KZETS                   CHAR(1)    NOT NULL DEFAULT '',
    KMPAK                   CHAR(18)   NOT NULL DEFAULT '',
    KOTXT                   CHAR(40)   NOT NULL DEFAULT '',
    KOGR                    CHAR(4)    NOT NULL DEFAULT '',
    LAEND                   DATE,
    SZ                      CHAR(1)    NOT NULL DEFAULT '',
    STAND                   CHAR(10)   NOT NULL DEFAULT '',
    ERSTL                   CHAR(8)    NOT NULL DEFAULT '',
    KMABTLUNG               CHAR(8)    NOT NULL DEFAULT '',
    DTANL                   DATE,
    DTAEN                   DATE,
    KZAUS                   CHAR(1)    NOT NULL DEFAULT '',
    ART                     CHAR(1)    NOT NULL DEFAULT '',
    JAHR                    CHAR(1)    NOT NULL DEFAULT '',
    LFD                     CHAR(4)    NOT NULL DEFAULT '',
    SOLLTT                  DECIMAL(2),
    SOLLMM                  DECIMAL(2),
    SOLLJJ                  DECIMAL(4),
    UMDREH_KZ               CHAR(1)    NOT NULL DEFAULT '',
    REAKT                   CHAR(1),
    NEUAN_UID               CHAR(8),
    DATESKZ                 CHAR(1),
    STADT                   DATE,
    ZIEL_TERMIN             DATE,
    ARCHIV_KZ               CHAR(1)    NOT NULL DEFAULT '',
    HERKU                   CHAR(2)    NOT NULL DEFAULT '',
    UIDAEN                  CHAR(8)    NOT NULL DEFAULT '',
    SYSANL                  CHAR(2)    NOT NULL DEFAULT '',
    SYSAEN                  CHAR(2)    NOT NULL DEFAULT '',
    KOST_REL_KZ             CHAR(1),
    MIG_KZ                  CHAR(1),
    PEP_PHASE               CHAR(1),
    Q_RISIKO                CHAR(1),
    PRFKZ                   CHAR(1)    NOT NULL DEFAULT '',
    PRFDAT                  TIMESTAMP,
    SE_TERMIN               CHAR(4),
    ZE_TERMIN               CHAR(4),
    ADMIN                   CHAR(1)    NOT NULL DEFAULT '',
    TELEFONNR_ANLEGER       CHAR(16),
    TELEFONNR_BEARBEITER    CHAR(16),
    PKR_KZ                  CHAR(1),
    AEABSCHLUSS             DATE,
    SOFTWARE_KZ             CHAR(1)    NOT NULL DEFAULT 'N',
    ONLINE_SYNCHRO_STATUS   CHAR(1)    NOT NULL DEFAULT '',
    ONLINE_SYNCHRO_FREIGABE CHAR(1)    NOT NULL DEFAULT ''
);

CREATE TABLE KDT.TKDY01
(
    TYPNR        CHAR(4)       NOT NULL,
    ABGAS        CHAR(3)       NOT NULL  DEFAULT '',
    ANTRI        CHAR(6)       NOT NULL  DEFAULT '',
    AUSDT        DATE,
    EINDT        DATE,
    GETRI        CHAR(4)       NOT NULL  DEFAULT '',
    HUBR         DECIMAL(3, 2) NOT NULL  DEFAULT 0,
    KAROS        CHAR(6)       NOT NULL  DEFAULT '',
    LEIST        DECIMAL(3)    NOT NULL  DEFAULT 0,
    LENK         CHAR(2)       NOT NULL  DEFAULT '',
    TSART        CHAR(3)       NOT NULL  DEFAULT '',
    TERKZ        CHAR(1)       NOT NULL  DEFAULT '',
    TUER         DECIMAL(1)    NOT NULL  DEFAULT 0,
    KZSTU        CHAR(1)       NOT NULL  DEFAULT '',
    MODEL        CHAR(8)       NOT NULL,
    BEMER        CHAR(60)      NOT NULL  DEFAULT '',
    AUSST        CHAR(8)       NOT NULL  DEFAULT '',
    ANLAG        DATE,
    GEHKZ        CHAR(1)       NOT NULL  DEFAULT '',
    EBEZD        CHAR(4)       NOT NULL  DEFAULT '',
    LAND         CHAR(3)       NOT NULL  DEFAULT '',
    AENDG        DATE,
    MODJA        CHAR(4)       NOT NULL  DEFAULT '',
    GUELT        DATE,
    MOTOR        CHAR(6)       NOT NULL,
    EBAUR        CHAR(4)       NOT NULL,
    STAR         CHAR(6),
    AUFLAD       CHAR(8)       NOT NULL  DEFAULT '',
    LEITY        CHAR(4),
    AUTTYP       CHAR(4),
    ARCHIV_KZ    CHAR(1)       NOT NULL  DEFAULT '',
    ARCHIV_DATUM DATE,
    ARCHIV_ID    CHAR(3),
    ALLTYP       CHAR(4),
    FZGTYP       CHAR(4),
    B_TYP_KZ     CHAR(1),
    PSEUDO       CHAR(1),
    MOTORVAR     CHAR(3),
    PRODART      CHAR(1),
    TYPART       CHAR(1),
    TYPHIST      CHAR(1),
    TYP_ALTV     CHAR(4),
    TYPSRT       CHAR(10),
    HYBRID       CHAR(4),
    MONTAGELAND  CHAR(3),
    ELEKTR_RW    CHAR(5),
    FAHRZEUGDIF  CHAR(2),
    BASISAUSF    CHAR(5),
    MSPORT       CHAR(2)
);

CREATE TABLE KDT.TKDY11
(
    TYPNR       CHAR(4)       NOT NULL,
    BEMER       CHAR(60)      NOT NULL  DEFAULT '',
    KZSTU       CHAR(1)       NOT NULL  DEFAULT '',
    VKBEZ       CHAR(8)       NOT NULL  DEFAULT '',
    ANLAG       DATE,
    GEHKZ       CHAR(1)       NOT NULL  DEFAULT '',
    EBEZD       CHAR(4)       NOT NULL  DEFAULT '',
    EBEZG       CHAR(4)       NOT NULL  DEFAULT '',
    LAND        CHAR(3)       NOT NULL  DEFAULT '',
    AENDG       DATE,
    MODJA       CHAR(4)       NOT NULL  DEFAULT '',
    MOTOR       CHAR(6)       NOT NULL  DEFAULT '',
    STAR        CHAR(6),
    ABGAS       CHAR(3)       NOT NULL  DEFAULT '',
    MISCH       CHAR(8)       NOT NULL  DEFAULT '',
    ANTRI       CHAR(6)       NOT NULL  DEFAULT '',
    AUSDT       DATE,
    EINDT       DATE,
    GETRI       CHAR(4)       NOT NULL  DEFAULT '',
    HUBR        DECIMAL(3, 2) NOT NULL  DEFAULT 0,
    LEIST       DECIMAL(3)    NOT NULL  DEFAULT 0,
    TSART       CHAR(3)       NOT NULL  DEFAULT '',
    TERKZ       CHAR(1)       NOT NULL  DEFAULT '',
    GUELT       DATE,
    FTYP        CHAR(4),
    BTYP        CHAR(1),
    PSEUDO      CHAR(1),
    MOTORVAR    CHAR(3),
    PRODART     CHAR(1),
    TYPART      CHAR(1),
    TYPHIST     CHAR(1),
    TYP_ALTV    CHAR(4),
    TYPSRT      CHAR(10),
    HYBRID      CHAR(4),
    LENKUNG     CHAR(2),
    MONTAGELAND CHAR(3),
    ELEKTR_RW   CHAR(5)       NOT NULL  DEFAULT '',
    FAHRZEUGDIF CHAR(2)       NOT NULL  DEFAULT '',
    BASISAUSF   CHAR(5)
);


ALTER TABLE KDT.TKDA05 ADD CONSTRAINT PK_TKDA05 PRIMARY KEY (PRODA,PRIMA,HIST);

ALTER TABLE KDT.TKDA10 ADD CONSTRAINT PK_TKDA10 PRIMARY KEY (LACK);

ALTER TABLE KDT.TKDN01 ADD CONSTRAINT PK_TKDN01 PRIMARY KEY (KMNR);

ALTER TABLE KDT.TKDY01 ADD CONSTRAINT PK_TKDY01 PRIMARY KEY (TYPNR);

ALTER TABLE KDT.TKDY11 ADD CONSTRAINT PK_TKDY11 PRIMARY KEY (TYPNR);
