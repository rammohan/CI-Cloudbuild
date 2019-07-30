# CI-Cloudbuild
Sample app for testing GCP cloud build

#### Running high priority test cases
```sh
mvn -Dtest=TestHighPriorityFix test
```

#### Running low priority test cases
```sh
mvn -Dtest=TestLowPriorityFix test
```

#### creating jar
```sh
mvn package
```
