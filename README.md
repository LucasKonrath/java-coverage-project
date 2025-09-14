# Java Coverage Project

This is a sample Java project with JaCoCo integration for code coverage.

## How to use

- Build the project with Maven:
  ```sh
  mvn clean install
  ```
- Run JaCoCo coverage report:
  ```sh
  mvn test
  ```
- Coverage reports will be generated in `target/site/jacoco`.

## Sample Classes
- `UnusedClass`: Contains a method not covered by any tests.
- `Helper`: Contains methods not covered by any tests.
- `App`: Main entry point.

## Note
No test classes are provided, so JaCoCo will show 0% coverage for the sample classes.
