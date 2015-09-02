####WHAT'S IN HERE

We have differnet pakcages, each of them have a class in it, will log messages with different levels: `debug`, `info`, `warn`, `error`.

```bash
$ jar -tvf log4jsamples.jar | grep com.estudio | grep .class | grep -v 'Main\|LogBase'
   350 Tue Sep 01 22:06:14 CDT 2015 com/estudio/samples/log4jsample/pkg100/Class100.class
   364 Tue Sep 01 22:06:00 CDT 2015 com/estudio/samples/log4jsample/pkg100/pkg110/Class110.class
   378 Tue Sep 01 21:50:22 CDT 2015 com/estudio/samples/log4jsample/pkg100/pkg110/pkg111/Class111.class
   364 Tue Sep 01 22:06:52 CDT 2015 com/estudio/samples/log4jsample/pkg100/pkg120/Class120.class
   378 Tue Sep 01 21:50:22 CDT 2015 com/estudio/samples/log4jsample/pkg100/pkg120/pkg121/Class121.class
   364 Tue Sep 01 21:50:22 CDT 2015 com/estudio/samples/log4jsample/pkg100/pkg130/Class130.class
   350 Tue Sep 01 21:50:22 CDT 2015 com/estudio/samples/log4jsample/pkg200/Class200.class
```


####HOW TO RUN:
```java
java -jar log4jsamples.jar -Dlog4j.config=log4j.properties
```

You can change configuration in log4j.properties, and run it again.
