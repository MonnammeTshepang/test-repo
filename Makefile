build-RemoteApplicationLite:
  mvn clean package -Pnative -Dquarkus.native.container-build=true -Dquarkus.native.builder-image=quay.io/quarkus/ubi-quarkus-mandrel:21.3-java11
  @ unzip ./target/function.zip -d $(ARTIFACTS_DIR)