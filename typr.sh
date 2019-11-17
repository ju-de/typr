#!/usr/bin/env bash

while :
do
	read IN
		for ((i=1; i<=${#IN}; ++i));
		do
			# reset
			echo -e "\033[1A"
			echo -n ${IN:0:$i}
			sleep .1
		done
	echo ""
done