# dependency-analysis-android-gradle-plugin-issue-377

Sample project that shows [Issue #377](https://github.com/autonomousapps/dependency-analysis-android-gradle-plugin/issues/377)

Clone the project, run `./gradlew :buildHealth` and check the error:

```
> Task :app:compileReleaseUnitTestKotlin FAILED
e: /Users/temporaryadmin/Developer/dependency-analysis-android-gradle-plugin-issue-377/app/src/test/java/dev/marcellogalhardo/buildhealthsample/MainFragmentTest.kt: (4, 30): Unresolved reference: testing
e: /Users/temporaryadmin/Developer/dependency-analysis-android-gradle-plugin-issue-377/app/src/test/java/dev/marcellogalhardo/buildhealthsample/MainFragmentTest.kt: (14, 9): Unresolved reference: launchFragmentInContainer
```

The problem happens because the project includes [Fragment Testing](https://developer.android.com/guide/fragments/test), which is added only to `debugImplementation` and the `MainFragmentTest` fails when running the command.
