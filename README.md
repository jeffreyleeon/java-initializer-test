java-initializer-test
==================

Introduction
------------------
A test about static and non-static initializer block

Output
------------------
```
This is a static initializer
This is the main function
This is a non-static initialize
This is a public constructor
```

Lesson Learnt
------------------
1. static block is a class initializer and will be called ONCE, when the class is created. Good to initialize static params.</br>
```
static {
  ...
}
```
2. non-static block is an object initializer and will be called whenever a new object is instantiated, it is good to initialize non-static params. </br>
```
{
  ...
}
```
3. non-static block and public constructor will be merged</br>

  ```java
  {
      System.out.println("This is a non-static initializer");
  }
  
  public Test() {
      System.out.println("This is a public constructor");
  }
  ```
  Will be merged to
  
  ```java
  public Test() {
    super();
    {
      System.out.println("This is a non-static initializer");
    }
      System.out.println("This is a public constructor");
  }
  ```

