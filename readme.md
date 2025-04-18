# Software Testing Project

## 📁 Project Structure
```
project-root/
├── lib/
│   └── com.microsoft.z3.jar # z3 library
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── org/
│   │   │       └── example/
│   │   │           └── DateHelper.java # case 2
│   │   │           └── DateHelperTestCaseGeneratorByZ3.java # generate test cases by Z3
│   │   │           └── DateHelperTestFileGeneratorByCombinatorial.java # generate test file by ACTS test cases
│   │   │           └── DateHelperTestFileGeneratorByZ3.java # generate test file by Z3 test cases
│   │   │           └── Quadratic.java # case 1
│   │   │           └── QuadraticTestCaseGeneratorByZ3.java # generate test cases by Z3
│   │   │           └── QuadraticTestFileGeneratorByCombinatorial.java # generate test file by ACTS test cases
│   │   │           └── QuadraticTestFileGeneratorByZ3.java # generate test file by Z3 test cases 
│   │   └── resources/
│   │       └── DateHelper-Pairwise-output.csv # test cases by ACTS (acts_3.3.jar) "before" re-generation
│   │       └── DateHelper-Pairwise-output-after.csv # test cases by ACTS (acts_3.3.jar) "after" re-generation
│   │       └── DateHelperZ3.csv # test cases by Z3 (DateHelperTestCaseGeneratorByZ3.java) "after" re-generation
│   │       └── Quadratic-3way-output.csv # test cases by ACTS (acts_3.3.jar) "after" re-generation
│   │       └── Quadratic-Pairwise-output.csv # test cases by ACTS (acts_3.3.jar) "before" re-generation
│   │       └── QuadraticZ3-after.csv # test cases by Z3(QuadraticTestCaseGeneratorByZ3.java) "after" re-generation
│   └── test/
│       └── java/
│           └── org/
│               └── example/
│                   └── DateHelperCombinatorialTest.java # test file generated by DateHelperTestFileGeneratorByCombinatorial.java
│                   └── DateHelperTestMethods.java # contains the commonly used test methods by DateHelperCombinatorialTest.java and DateHelperZ3Test.java
│                   └── DateHelperZ3Test.java # test file generated by DateHelperTestFileGeneratorByZ3.java
│                   └── QuadraticCombinatorialTest.java # test file generated by QuadraticTestFileGeneratorByCombinatorial.java
│                   └── QuadraticZ3Test.java # test file generated by QuadraticTestFileGeneratorByZ3.java
└── .gitignore
└── .pom.xml # dependencies, configuration of the project, plugins
└── .gitignore

```
## 📄 Key Files and Folders

- `pom.xml`: Maven build file — defines dependencies, plugins, and build configuration.
- `src/main/java/`: contains the class file to test, the source files to generate z3 test cases and test files
- `src/main/resources/`: the the cases are saved here in csv files
- `src/test/java/`: contains the test files.


## 🚀 Generation of test cases
- ACTS GUI

<img src="img/ACTS.PNG" alt="ACTS" width="100%"/>



- Z3 (*TestCaseGeneratorByZ3.java)

<img src="img/Z3.PNG" alt="ACTS" width="100%"/>


## 💡 Generation of test files
In `*FileGenerator*.java`, make sure the following input and output file paths are correctly configured.
```java
public static void main(String[] args){
    String inputFilePath="src\\main\\resources\\DateHelper-Pairwise-output-after.csv";
    String outputFilePath="src\\test\\java\\org\\example\\DateHelperCombinatorialTest.java";
}
```
Run ```main()```

## 🛠️ How to run
### Compile
```cmd
mvn clean compile test-compile
```

### Generate report by Jacoco
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

### Generate report by PITest
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
