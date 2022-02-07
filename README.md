# Sorting Project

A program that sorts array using various sorting methods.

## Description

This program specifically uses: merge and bubble sort as well Binary Search Tree to organise an array of Integers into ascending. The output of the program consists of the time taken for the sort to be completed in addition to the sorted array. Furthermore, multiple sorting methods can be selected for a given array which must be entered by the user in the console. The architecture of the program follows MVC and Factory design to promote low coupling. Lastly, log4j is used to log important aspects of the program in addition to the unit testing for the sorting methods.

## Getting Started

### Dependencies

- JUnit  Dependency (Used for testing the sorting methods)

  ```
  <dependencies>
      <dependency>
          <groupId>org.junit.jupiter</groupId>
          <artifactId>junit-jupiter</artifactId>
          <version>5.8.2</version>
      </dependency>
  ```

- Log4j Dependency (Used to important details)

  ```
  <dependency>
      <groupId>org.apache.logging.log4j</groupId>
      <artifactId>log4j-core</artifactId>
      <version>2.17.1</version>
  </dependency>
  ```

  

### Setting up the project

The repository is public on GitHub, to which the program can be downloaded as a ZIP file ,by clicking on 'Code' and opened on an appropriate IDE that supports the dependencies. 

![](\SortScreenshots\sort1.png)



After the program is extracted and opened, the Dependencies must be setup. Open the **'pom.xml'** file, right click on available space and select 'Generate' then 'Dependency'. From this point, searching  'Jupiter' and  then 'log4j' will get the results needed. Below is a screenshot of the dependency needed (highlighted in blue).

![](C:\Users\andre\Documents\GitHub\SortProject\SortScreenshots\sort2.png)

![](C:\Users\andre\Documents\GitHub\SortProject\SortScreenshots\sort3.png)

If you are unable to do this, you can copy and paste the [dependency]() code into your 'pom.xml' file and install it from there. 

After this process, you must refresh **maven** through a tool that appears after changes are made.			![](C:\Users\andre\Documents\GitHub\SortProject\SortScreenshots\sort10.png)

Finally, once the project is built, run 'SortManager'.

### Phases

This project was undertaken in 5 distinct phases

- Phase 1- Implement Bubble and Merge sort with JUnit test cases
- Phase 2- Refactor to incorporate MVC and factory design
- Phase 3- Add logs using log4j 
- Phase 4- Implement Binary Search Tree with appropriate tests
- Phase 5- Allow user to compare the different time complexity of the sorts with user input

### Testing

For each of the methods, the following was tested:

- Given an empty array

- Given only positive numbers

- Given negative numbers

- Given 0's 

- Given uneven length

  To which all passed except for BstTest, to which 3/5 tests failed as shown below. However, when the tests are run individually, they pass, which I was not able to find out why. Below is the zero array failing when the whole test is run, then the screenshot below it shows it passing when ran individually.

  ![](C:\Users\andre\Documents\GitHub\SortProject\SortScreenshots\sort5.png)

  ![](C:\Users\andre\Documents\GitHub\SortProject\SortScreenshots\sort 6.png)

  Bubble and merge tests:

  <img src="C:\Users\andre\Documents\GitHub\SortProject\SortScreenshots\bubble.png" style="zoom:67%;" />

  ![](C:\Users\andre\Documents\GitHub\SortProject\SortScreenshots\merge.png)

  These test abled me to achieve 100% coverage on the sort methods:

  ![](C:\Users\andre\Documents\GitHub\SortProject\SortScreenshots\sort6.png)

  Furthermore, precautions were taken using 'Enums' to reduce the potential for error when handling user input. As well as utilizing try catch blocks ensuring that only the appropriate input is used. These measures were taken after manually testing my program and attempting to account for user input which may cause errors.

  An example of this can be seen where user input must correspond to the value of an enum which is already set, on top of checks that the input is in range of these values, whilst having a catch in place for an exception where user hasn't entered the appropriate input. Therefore, making user input a small set of values which reduces risk when handling the data in the Controller. 

  Ultimately, the program behaves as predicted.

  ![](C:\Users\andre\Documents\GitHub\SortProject\SortScreenshots\sort7.png)

### User input

Below is an example of user input (and output) to which they will be asked:

- How big they would like the array

- Whether they want to enter the values in the array or have it randomly generated

- What method they would like to use

- Whether they would like to add more methods for comparison

  ![](C:\Users\andre\Documents\GitHub\SortProject\SortScreenshots\sort8.png)

  ![](C:\Users\andre\Documents\GitHub\SortProject\SortScreenshots\sort9.png)

  

  