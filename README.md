# stream4-remote-sample-app Project

The purpose of this Application is to consume entries from kafka, log all timestamp (db, kafka app) and measure latency between these timestamps.


## Running the application in dev mode

You can run your application in dev mode that enables live coding using:
```shell script
./mvnw compile quarkus:dev
```

> **_NOTE:_**  Quarkus now ships with a Dev UI, which is available in dev mode only at http://localhost:8080/q/dev/.

## Packaging and running the application

The application can be packaged using:
```shell script
./mvnw package
```
It produces the `quarkus-run.jar` file in the `target/quarkus-app/` directory.
Be aware that it’s not an _über-jar_ as the dependencies are copied into the `target/quarkus-app/lib/` directory.

The application is now runnable using `java -jar target/quarkus-app/quarkus-run.jar`.

If you want to build an _über-jar_, execute the following command:
```shell script
./mvnw package -Dquarkus.package.type=uber-jar
```

The application, packaged as an _über-jar_, is now runnable using `java -jar target/*-runner.jar`.

## Creating a native executable

You can create a native executable using: 
```shell script
./mvnw package -Pnative
```

Or, if you don't have GraalVM installed, you can run the native executable build in a container using: 
```shell script
./mvnw package -Pnative -Dquarkus.native.container-build=true
```

You can then execute your native executable with: `./target/code-with-quarkus-1.0.0-SNAPSHOT-runner`

If you want to learn more about building native executables, please consult https://quarkus.io/guides/maven-tooling.

## Docker build
Steps for docker image build are described in the proper dockerfile files

## Kafka Configuration
Kafka configuration is set in application.properties file. Additionally, following secrets should be set e.g. as environment variables.
```
mp.messaging.incoming.kmnr.schema.registry.ssl.truststore.password
kafka.sasl.jaas.config
mp.messaging.incoming.kmnr.basic.auth.user.info
```



##Database configuration
Application is configured to work with Postgresql database. Following secret need to be set e.g. as environment variable
```aidl
quarkus.datasource.password
```

##Rest endpoints
Following rest endpoints are available

* ```/kmnr``` - list all kmnr entrys from the database
* ```/kmnr?kmnr=<kmnr_id>``` - get information about the given kmnr
* ```/filtered-list``` - get all kmnr filtered with following query
```@Query("SELECT t0 FROM Kmnr t0 where t0.stand IN ('KONZEPT', 'UNSCH', 'ABWERL', 'ANTRAG') and  t0.kmnr not like 'A%'")```

##Documentation
For more information please check [confluence documentation](https://atc.bmwgroup.net/confluence/display/BMWMFM/2.+Using+quarkus+application+as+kafka+consumer)
