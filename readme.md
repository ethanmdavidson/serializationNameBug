This project demonstrates a bug in [kotlinx-datetime](https://github.com/Kotlin/kotlinx-datetime).
When using the legacy compiler, kotlinx-datetime uses an old
name when referencing kotlinx-serialization.

It uses 'kotlinx-serialization-kotlinx-serialization-core-jsLegacy'

instead of 'kotlinx-serialization-kotlinx-serialization-core-js-legacy'

Run `gradlew browserDevelopmentRun` to see the error:

```
Module not found: Error: Can't resolve 'kotlinx-serialization-kotlinx-serialization-core-jsLegacy' in '<buildDir>\js\packages\serializationNameBug\kotlin-dce-dev'
```

This bug has been reported here: https://github.com/Kotlin/kotlinx-datetime/issues/118

Seems like it might also be related to https://youtrack.jetbrains.com/issue/KT-46598

## Workaround

You can work around this issue by downgrading kotlinx-serialization to 1.1.0, as 
demonstrated in the [workaround branch](https://github.com/ethanmdavidson/serializationNameBug/tree/workaround)
of this repo.
