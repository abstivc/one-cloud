#!/bin/bash
# 2. 判断项目是否已经启动, 并按顺序启动所有目录
echo ">>>>>start.sh started<<<<<"

sh deploy/stop.sh

export BUILD_ID=dontKillMe
appSrc=/usr/local/application/one-cloud/

echo 'JAVA_HOME is' $JAVA_HOME
echo 'PATH is' $PATH

jarAppFile="one-cloud-file-1.0.0.jar"
jarAppFeignClient="one-cloud-feign-client-1.0.0.jar"

#定义启动日志目录
# 日志名称和目录
logAppFileName=service_start_one-cloud-file_$(date "+%Y-%m-%d").log

logAppFeignName=service_start_one-cloud-feign-client_$(date "+%Y-%m-%d").log


logDir=${appSrc}/logs/

if [ ! -f "${logDir}" ]; then
        mkdir -p "${logDir}"
fi

#后端启动，并打印日志
nohup java -jar ${appSrc}${jarAppFile} --spring.profiles.active=stg > ${logDir}${logAppFileName} &
echo "service启动中,对应的日志目录为${logDir}${logAppFileName}"
 #后端启动，并打印日志
nohup java -jar ${appSrc}${jarAppFeignClient} --spring.profiles.active=stg > ${logDir}${logAppFeignName} &
echo "service启动中,对应的日志目录为${logDir}${logAppFeignName}"

echo ">>>>>start.sh end<<<<<"
