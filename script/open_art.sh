#!/bin/bash

art=$1

echo $art

if [[ $art =~ "\"" ]]; then
  group_art=`echo $art|awk -F '\"' '{print $2}'`
  echo "1>> $group_art"
elif [[ $art =~ "\'" ]]; then
  group_art=`echo $art|awk -F '\"' '{print $2}'`
  echo "2>> $group_art"
else
  group_art=$art
  echo "3>> $group_art"
fi

group_id=`echo $group_art|awk -F ':' '{print $1}'`
arts_id=`echo $group_art|awk -F ':' '{print $2}'`

open "https://mvnrepository.com/artifact/$group_id/$arts_id"


#var1=`echo "\"com.tencent:mmkv:1.2.11\""|awk -F '\"' '{print $2}'`
#echo $var1

#strA="\"abc:111:cc"
#strB="\""
#if [[ $strA =~ $strB ]]
#then
#    echo "包含"
#else
#    echo "不包含"
#fi