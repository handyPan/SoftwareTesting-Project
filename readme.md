# How to run


### How to compile
```cmd
mvn clean compile test-compile
```

### How to generate report by Jacoco
- QuadraticCombinatorialTest
```cmd
mvn clean jacoco:prepare-agent test -Dtest="org.example.QuadraticCombinatorialTest" -DtestFailureIgnore=true
mvn jacoco:report
```
- QuadraticZ3Test
```cmd
mvn clean jacoco:prepare-agent test -Dtest="org.example.QuadraticZ3Test" -DtestFailureIgnore=true
mvn jacoco:report
```
- DateHelperCombinatorialTest
```cmd
mvn clean jacoco:prepare-agent test -Dtest="org.example.DateHelperCombinatorialTest" -DtestFailureIgnore=true
mvn jacoco:report 
```
- DateHelperZ3Test
```cmd
mvn clean jacoco:prepare-agent test -Dtest="org.example.DateHelperZ3Test" -DtestFailureIgnore=true
mvn jacoco:report
```

### How to generate report by PITest
**Note: must run ```mvn clean compile test-compile``` first**

- QuadraticCombinatorialTest
```cmd
mvn pitest:mutationCoverage -DtargetClasses="org.example.Quadratic" -DtargetTests="org.example.QuadraticCombinatorialTest"
```
- QuadraticZ3Test
```cmd
mvn pitest:mutationCoverage -DtargetClasses="org.example.Quadratic" -DtargetTests="org.example.QuadraticZ3Test"
```
- DateHelperCombinatorialTest
```cmd
mvn pitest:mutationCoverage -DtargetClasses="org.example.DateHelper" -DtargetTests="DateHelperCombinatorialTest"
```
- DateHelperZ3Test
```cmd
mvn pitest:mutationCoverage -DtargetClasses="org.example.DateHelper" -DtargetTests="DateHelperZ3Test"
```
