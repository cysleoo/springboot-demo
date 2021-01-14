#!/usr/bin/env bash

cd "$(dirname "$0")"
source ./config.sh
CONFIG=../config/application.yml
PID=$(ps -ef | grep ${APP_JAR} | grep -v grep | awk '{ print $2 }')
if [ -z "$PID" ]
then
	nohup java -Xms2g -Xmx2g -Dspring.config.location=${CONFIG} -jar ${APP_JAR} &
else
	echo ${APP_JAR} is already running
fi
