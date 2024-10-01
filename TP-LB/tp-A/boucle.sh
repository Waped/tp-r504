#!/bin/bash

for ((i=0 ; i<500;i++))
do
    resp = $(curl localhost:83)
    if [$resp = "Hello 1"];
    then
    ((c+=1))
    fi

done

echo $c