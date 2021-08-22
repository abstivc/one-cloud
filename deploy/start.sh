#!/bin/bash
# 2. 判断项目是否已经启动, 并按顺序启动所有目录
echo ">>>>>start.sh started<<<<<"

sh ./stop.sh

echo 'JAVA_HOME is' $JAVA_HOME
echo 'PATH is' $PATH

jarAppFile="one-cloud-file-1.0.0.jar"
jarAppFeignClient="one-cloud-feign-client-1.0.0.jar"

#定义启动日志目录
# 日志名称和目录
logAppFileName=service_start_${jarAppFile}_$(date "+%Y-%m-%d").log

logAppFileDir=../logs/${jarAppFile}/

if [ ! -x "${logDir}" ]; then
        mkdir -p "${logDir}"
fi

logAppFeignName=service_start_${jarAppFeignClient}_$(date "+%Y-%m-%d").log

logAppFeignDir=../logs/${jarAppFeignClient}/

if [ ! -x "${logDir}" ]; then
        mkdir -p "${logDir}"
fi


#后端启动，并打印日志
nohup java -jar ../${jarAppFile} --spring.profiles.active=stg > ${logAppFileDir}${logAppFileName} &
 #后端启动，并打印日志
nohup java -jar ../${jarAppFeignClient} --spring.profiles.active=stg > ${logAppFeignDir}${logAppFeignName} &

echo ">>>>>start.sh end<<<<<"
