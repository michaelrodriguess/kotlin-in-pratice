#!/bin/bash


if [ -f "main.jar" ]; then
	java -jar main.jar "$@"
else 
	kotlinc main.kt -include-runtime -d main.jar
	java -jar main.jar "$@"
fi
