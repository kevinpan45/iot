# IoT Platform
 ![Build and Deploy](https://github.com/kevinpan45/iot/workflows/Build%20and%20Deploy/badge.svg)
 
 A simple IoT platform base on open source project:
![Arch](docs/img/arch.png)

 * MQTT Broker : [EMQX Broker](https://github.com/emqx/emqx)
 * Message Proxy And Router : [Node-Red](https://github.com/node-red/node-red)
 * Database : [TDengine](https://github.com/taosdata/TDengine)
 * Data Visualization : [Grafana](https://github.com/grafana/grafana)

## Quick Start
### Start project
```
docker-compose up
```
### Configure Node-Red
* To view the Node-Red dashboard after running, use your browser to open: http://localhost:1880
* Install node-red-contrib-kafka-client
* Import flow file nodered-flow.json and deploy.
See [Node-Red docs](https://nodered.org/docs) here.

### Test
* Send MQTT msg, use client like [MQTTX](https://mqttx.app/cn/)
* Iot-Biz service instance console will log received data