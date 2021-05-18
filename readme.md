This project demonstrates a bug in [kotlinx-datetime](https://github.com/Kotlin/kotlinx-datetime).
When using the legacy compiler, kotlinx-datetime uses an old
name when referencing kotlinx-serialization.

It uses 'kotlinx-serialization-kotlinx-serialization-core-jsLegacy'

instead of 'kotlinx-serialization-kotlinx-serialization-core-js-legacy'

Run `gradlew browserDevelopmentRun` to see the error:

```
Module not found: Error: Can't resolve 'kotlinx-serialization-kotlinx-serialization-core-jsLegacy' in '<buildDir>\js\packages\serializationNameBug\kotlin-dce-dev'
```
