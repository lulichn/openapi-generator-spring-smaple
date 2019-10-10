client_url="https://raw.githubusercontent.com/OpenAPITools/openapi-generator/master/bin/utils/openapi-generator-cli.sh"
cli="openapi-generator-cli.sh"

prepare:
	curl -LO $(client_url)
	chmod +x $(cli)

gen:
	./$(cli) generate -i spec.yaml -g spring -o out  -c ./generator.conf