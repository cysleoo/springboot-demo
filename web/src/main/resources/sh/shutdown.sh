#!/usr/bin/env bash

cd "$(dirname "$0")"
source ./config.sh

PID=$(ps -ef | grep ${APP_JAR} | grep -v grep | awk '{ print $2 }')
if [ -z "$PID" ]
then
	echo ${APP_JAR} is already stopped
else
	echo kill ${APP_JAR}
	echo kill -15 ${PID}
	kill -15 ${PID}
fi