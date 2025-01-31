#!/bin/bash

network="172.16.0.0/24"



csv="scan-result_2.csv"



touch $csv

echo "IP;TCP ports" > "$csv"

echo "Scanning the network... This may take a while."
nmap -sS -p- --open -n -Pn localhost -oG $csv
echo $(awk '/Up$/{print $2}' scan-result_1.csv),";" >> $csv

echo "Scan terminé. Résultats enregistrés dans $csv"