# dependency-analysis-android-gradle-plugin-issue-377

Sample project that shows [Issue #377](https://github.com/autonomousapps/dependency-analysis-android-gradle-plugin/issues/377)

Clone the project, run the following commands:

- `./gradlew app:testDebugUnitTest`

```
marcello@macbook dependency-analysis-android-gradle-plugin-issue-377 % ./gradlew app:testDebugUnitTest

BUILD SUCCESSFUL in 1s
```

- `./gradlew buildHealth`

```
marcello@macbook dependency-analysis-android-gradle-plugin-issue-377 % ./gradlew :buildHealth

> Task :app:compileReleaseUnitTestKotlin FAILED
e: /Users/marcello/Developer/dependency-analysis-android-gradle-plugin-issue-377/app/src/test/java/dev/marcellogalhardo/buildhealthsample/MainFragmentTest.kt: (4, 30): Unresolved reference: testing
e: /Users/marcello/Developer/dependency-analysis-android-gradle-plugin-issue-377/app/src/test/java/dev/marcellogalhardo/buildhealthsample/MainFragmentTest.kt: (14, 9): Unresolved reference: launchFragmentInContainer

FAILURE: Build failed with an exception.

* What went wrong:
Execution failed for task ':app:compileReleaseUnitTestKotlin'.
> Compilation error. See log for more details

* Try:
Run with --stacktrace option to get the stack trace. Run with --info or --debug option to get more log output. Run with --scan to get full insights.

* Get more help at https://help.gradle.org

BUILD FAILED in 6s
```

The problem happens because the project includes [Fragment Testing](https://developer.android.com/guide/fragments/test), which is added only to `debugImplementation` and the `MainFragmentTest` fails when running the command.
