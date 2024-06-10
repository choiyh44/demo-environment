#!/bin/bash

# Get the value of the host IP
HOST_IP=$(hostname -I | awk '{print $1}')

# Generate docker-compose.yml from template
sed "s/{{ENV_HOST_IP}}/$HOST_IP/" docker-compose.template.yaml > docker-compose.yaml

# Run docker-compose
docker compose up -d --no-deps --build app
