#!/bin/bash
#打包后的项目名称
#3 查找并终止所有one-cloud 项目
echo ">>>>>stop.sh started<<<<<"

jarAppFile="one-cloud-file-1.0.0.jar"
jarAppFeignClient="one-cloud-feign-client-1.0.0.jar"


count=$(ps -ef |grep ${jarAppFile} |grep -v "grep" |wc -l)

if [ ${count} -gt 0 ]; then
        echo "已存在${count}个${jarAppFile}程序在运行"
        jarPid=$(ps x |grep ${jarAppFile} | grep -v grep | awk '{print $1}')
        echo ${jarPid}
        kill -9 ${jarPid}
        output=`echo "正在关闭${jarAppFile}程序,进程id${jarPid}"`
        echo ${output}
else
        echo "没有对应的程序在运行"
fi

count=$(ps -ef |grep ${jarAppFeignClient} |grep -v "grep" |wc -l)

if [ ${count} -gt 0 ]; then
        echo "已存在${count}个${jarAppFeignClient}程序在运行"
        jarPid=$(ps x |grep ${jarAppFeignClient} | grep -v grep | awk '{print $1}')
        echo ${jarPid}
        kill -9 ${jarPid}
        output=`echo "正在关闭${jarAppFeignClient}程序,进程id${jarPid}"`
        echo ${output}
else
        echo "没有对应的程序在运行"
fi

echo ">>>>>stop.sh end<<<<<"
