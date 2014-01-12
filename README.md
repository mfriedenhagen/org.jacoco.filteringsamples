org.jacoco.filteringsamples
===========================

This project produces class files with different Java compilers as needed as input for testing
false positives in Jacoco (https://github.com/jacoco/jacoco/wiki/FilteringOptions).

To make this project to work you have to set properties in your `~/.m2/settings.xml` to define the path to the java compilers, these are defined in the root-POM, on MacOSX this should work:

```
        <maven.compiler.executable.jdk5>/System/Library/Frameworks/JavaVM.framework/Versions/1.5.0/Commands/javac</maven.compiler.executable.jdk5>
        <maven.compiler.executable.jdk6>/Library/Java/JavaVirtualMachines/1.6.0_65-b14-462.jdk/Contents/Home/bin/javac</maven.compiler.executable.jdk6>
        <maven.compiler.executable.jdk7>/Library/Java/JavaVirtualMachines/jdk1.7.0_45.jdk/Contents/Home/bin/javac</maven.compiler.executable.jdk7>
        <maven.compiler.executable.jdk8>/Library/Java/JavaVirtualMachines/jdk1.8.0.jdk/Contents/Home/bin/javac</maven.compiler.executable.jdk8>
```
