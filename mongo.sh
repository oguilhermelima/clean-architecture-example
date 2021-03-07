docker run \
  --name digital-content-api  \
  -e MONGO_INITDB_ROOT_USERNAME=root \
  -e MONGO_INITDB_ROOT_PASSWORD=123456 \
  -e MONGO_INITDB_DATABASE=clean-arch-example \
  --rm \
  -p 27017:27017 \
  -v /opt/db/digital-content-api:/var/lib/mongo/data \
  -d mongo


