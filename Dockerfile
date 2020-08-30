FROM openjdk:8-jre-slim
WORKDIR /usr/share/tag
ADD  target/libs libs
ADD  target/pragra-docker.jar pragra-docker.jar
ADD  target/pragra-docker-tests.jar pragra-docker-tests.jar
ADD  src/main/java/com/pragra src/main/java/com/pragra/config
ADD  src/test/resources/features src/test/resources/features
ADD  pragra-sample-tests.xml pragra-sample-tests.xml
ADD  target/test-classes target/test-classes
#ENTRYPOINT java -cp airasia-docker.jar:airasia-docker-tests.jar:libs/* -DseleniumHubHost=$SELENIUM_HUB -DBROWSER=$BROWSER docker $MODULE
ENTRYPOINT java -cp pragra-docker.jar:pragra-docker-tests.jar:libs/* -DHUB_HOST=$HUB_HOST -DBROWSER=$BROWSER org.testng.TestNG $MODULE