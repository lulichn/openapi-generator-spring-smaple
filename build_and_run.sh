#!/bin/sh

CLI_URL="https://raw.githubusercontent.com/OpenAPITools/openapi-generator/master/bin/utils/openapi-generator-cli.sh"
GEN="openapi-generator-cli.sh"

if [ ! -e $GEN ]; then
    curl -LO $CLI_URL
    chmod +x $GEN
fi

rm -rf out/src
./$GEN generate -i spec.yaml -g spring -o out

cd out
mvn spring-boot:run
