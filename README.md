To run, execute in project folder:
```
$ mvn clean install
$ java -jar target/benchmarks.jar
```

## Results

### Java 1.8.0_45

```
$ java -version
java version "1.8.0_45"
Java(TM) SE Runtime Environment (build 1.8.0_45-b14)
Java HotSpot(TM) 64-Bit Server VM (build 25.45-b02, mixed mode)


$ java -jar target/benchmarks.jar
<...>

Benchmark                             Mode  Cnt      Score     Error  Units
MyBenchmark.testMethod_GetChars      thrpt  100  64300.594 ± 579.241  ops/s
MyBenchmark.testMethod_StringBulder  thrpt  100  64278.834 ± 520.280  ops/s
```
