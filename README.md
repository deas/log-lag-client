# log-lag-client

SLF4J / Logback based docker image sending `Ping!` orginally built to analyze ELK stack latencies.

## Usage
`
```
kubectl run log-lag-client --image=harbor.doa.otc.hlg.de/steffanand/log-lag-client --env="LOGGER_NAME=foo" --env="TCP_ENDPOINT=a.host:3000"
```

or

```
docker run --name=log-lag-client --env="LOGGER_NAME=foo" --env="TCP_ENDPOINT=a.host:3000" --rm harbor.doa.otc.hlg.de/steffanand/log-lag-client
```
