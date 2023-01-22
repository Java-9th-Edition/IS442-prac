javac -classpath ./classes/ -d ./classes/ ./src/farming/app/AnimalFarmTest.java ./src/farming/AnimalFarm.java ./src/farming/type/*.java

-classpath flag specifies the location of the class files that are required to compile the source code
It tells the compiler where to look for th classes that are referenced by the source code being compiled.

If the -classpath is not specified, the compiler will use the default classpaht which is the current directory
