# ALTERNATIVA 1
mvnw compile jib:build -Dimage=docker.nextagilesoft.com/gt2/firma/test

docker run -p 8450:8080 --name prueba_spring_boot docker.nextagilesoft.com/gt2/firma/test

docker rm prueba_spring_boot -f

# ALTERNATIVA 2
./mvnw package
docker build -t nuestro_java -f Dockerfile .
docker rm nuestro_java -f
docker run -p 8450:8080 --name nuestro_java --rm nuestro_java

docker push docker.nextagilesoft.com/gt2/firma/test
