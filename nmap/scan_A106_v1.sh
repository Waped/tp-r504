#!/bin/bash

network="172.16.0.0/24"



csv="scan-result_1.csv"



touch $csv

echo "IP;TCP ports" > "$csv"

echo "Scanning the network... This may take a while."
nmap -sS -p- --open -n -Pn localhost -oG - | awk '/Ports:/{
    ip=$2;
    gsub(/Ports: /, "", $0);
    split($0, ports, ", ");
    count=0;
    for (i in ports) {
        if (ports[i] ~ /open/) count++;
    }
    print ip ";" count;
}' >> "$csv"

echo "Scan terminé. Résultats enregistrés dans $csv"