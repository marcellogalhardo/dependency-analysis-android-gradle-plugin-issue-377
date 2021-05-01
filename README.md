# dependency-analysis-android-gradle-plugin-issue-377

Sample project that shows [Issue #377](https://github.com/autonomousapps/dependency-analysis-android-gradle-plugin/issues/377)

Clone the project, run `./gradlew :buildHealth` and check the error:

```
e: /Users/marcellogalhardo/AndroidStudioProjects/dependency-analysis-android-gradle-plugin-issue-377/app/src/test/java/dev/marcellogalhardo/buildhealthsample/MainFragmentTest.kt: (5, 22): Unresolved reference: ext
e: /Users/marcellogalhardo/AndroidStudioProjects/dependency-analysis-android-gradle-plugin-issue-377/app/src/test/java/dev/marcellogalhardo/buildhealthsample/MainFragmentTest.kt: (9, 10): Unresolved reference: AndroidJUnit4
e: /Users/marcellogalhardo/AndroidStudioProjects/dependency-analysis-android-gradle-plugin-issue-377/app/src/test/java/dev/marcellogalhardo/buildhealthsample/MainFragmentTest.kt: (9, 10): An annotation argument must be a compile-time constant
```

The problem happens because the project includes [Fragment Testing](https://developer.android.com/guide/fragments/test), which is added only to `debugImplementation` and the `MainFragmentTest` fails when running the command.
