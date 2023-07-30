# UiWebTesting

# Maven

`mvn test -Dcucumber.filter.tags=”@smokeTest1” -Dbrowser=firefox`

- `mvn test`: This part of the command runs the Maven “test” goal. It tells Maven to execute the test phase of the project's life cycle. In a typical Maven project, this would mean running the unit tests and any other tests configured in the project.

- `-Dcucumber.filter.tags=”@smokeTest1”`: This is a system property (`-D`) that is passed to the Maven command. It is used to specify the Cucumber tags that should be executed during the test run. In this case, only the scenarios or features tagged with “@smokeTest1” will be executed. Cucumber tags are used to categorize and selectively execute specific scenarios or features during test runs.

- `-Dbrowser=firefox`: This is another system property (`-D`) passed to the Maven command. It is used to specify the browser in which the tests should be run. In this case, the tests will be executed in the Firefox browser.
