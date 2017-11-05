小伙伴们希望使用mqttbroker的时候加入一些定制的功能，那么moquette[https://github.com/andsel/moquette]会是个不错的选择。
本项目使用springboot去启动mqtt broker,
cd  /broker
执行gradlew build
broker/build/libs目录下会得到可执行jar文件

另外，请使用安全的方法关闭程序，否则会出现消息丢失的情况。