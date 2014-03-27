org.jacoco.filteringsamples
===========================

This project produces class files with different Java compilers as needed as input for testing
false positives in Jacoco (https://github.com/jacoco/jacoco/wiki/FilteringOptions).

To make this project to work you have to:
* install Sun/Oracle JDKs 1.5-1.8 on your machine and
* set `toolchains` in your `~/.m2/toolchains.xml` to define the JDKs.

On MacOSX this should work:

```
<toolchains>
    <toolchain>
       <type>jdk</type>
       <provides>
           <version>1.5</version>
       </provides>
       <configuration>
          <jdkHome>/System/Library/Frameworks/JavaVM.framework/Versions/1.5.0/Home/</jdkHome>
       </configuration>
    </toolchain>
    <toolchain>
       <type>jdk</type>
       <provides>
           <version>1.6</version>
       </provides>
       <configuration>
          <jdkHome>/Library/Java/JavaVirtualMachines/1.6.0_65-b14-462.jdk/Contents/Home/</jdkHome>
       </configuration>
    </toolchain>
    <toolchain>
       <type>jdk</type>
       <provides>
           <version>1.7</version>
       </provides>
       <configuration>
          <jdkHome>/Library/Java/JavaVirtualMachines/jdk1.7.0_51.jdk/Contents/Home/</jdkHome>
       </configuration>
    </toolchain>
    <toolchain>
       <type>jdk</type>
       <provides>
           <version>1.8</version>
       </provides>
       <configuration>
          <jdkHome>/Library/Java/JavaVirtualMachines/jdk1.8.0.jdk/Contents/Home/</jdkHome>
       </configuration>
    </toolchain>
</toolchains>
```
