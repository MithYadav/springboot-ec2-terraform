#!/bin/bash

# Download latest JAR from S3
aws s3 cp s3:/mithaws-bucket/springboot-app-0.0.1-SNAPSHOT.jar springboot-app.jar

# Kill existing app if running
sudo pkill -f springboot-app.jar

# Run the app in background
nohup java -jar springboot-app.jar > app.log 2>&1 &


