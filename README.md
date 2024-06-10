# demo-environment
- host ip주소를 docker container에 전달하는 샘플입니다.
- docker-compose.yaml 파일은 static 설정파일이므로 host ip를 조회하는 기능을 넣을 수 없습니다.
- 대신 docker-compose.template.yaml 을 만들고 generate-compose.sh 쉘스크립트를 실행해서 동적으로 docker-compose.yaml 파일을 생성합니다.
- 이후 docker compose up 명령을 실행하면 생성된 docker-compose.yaml 파일내의 environment 설정값이 docker container에 전달됩니다. 
