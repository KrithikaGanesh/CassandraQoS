javac Hello.java
javah -jni Hello
gcc -I$JAVA_HOME/include -o libhello.so -shared hello.c;
java -Djava.library.path=. Hello
