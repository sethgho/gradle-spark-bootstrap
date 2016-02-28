# gradle-spark-bootstrap
A simple [Spark Java](http://sparkjava.com/) bootstrap project using gradle as the build system.

I'm building this project as an opinionated starting point for future server-side API projects (for Android developers?).

Notable dependencies that likely feel familiar to an Android developer:
- [Dagger 2](http://google.github.io/dagger/)
- [Gson](https://github.com/google/gson)
- ... probably more to come.

# How to Use It
The project builds a fat jar using an embedded jetty server. 

##To run:
```
./gradlew run
```

## To Deploy (with docker):
```
docker build -t gradle-spark-bootstrap .
docker run -p 80:4567 gradle-spark-bootstrap
```

