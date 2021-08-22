#!/bin/bash
# 1. 将项目从打包目录移动到启动目录
echo ">>>>>move.sh started<<<<<"

version=1.0.0

appSrc=/usr/local/application/one-cloud/
jarAppFile="one-cloud-file-${version}.jar"
jarAppFeignClient="one-cloud-feign-client-${version}.jar"

if [ ! -x "${appSrc}" ]; then
        mkdir -p "${appSrc}"
fi
echo ">>>>>move.sh pwd<<<<<"
pwd

rm -rf ${appSrc}

cp one-cloud-file/target/${jarAppFile} ${appSrc}
cp one-cloud-feign-client/target/${jarAppFeignClient} ${appSrc}

echo ">>>>>move.sh finished<<<<<"


