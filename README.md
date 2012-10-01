cs1302-calculator
=================

Skeleton code for Caculator Project

## Project Description

Your goal is to develop a calculator app in Java with a graphical user interface
(GUI) powered by Swing. You will be responsible for designing and implementing
the user interface for your project (following a few guidelines). This 
calculator app is interesting in that we will provide two different 
implementations for handling mathematical operations: a basic, iterative
implementation and a recursive implementation. This will be accomplished by 
implementing the <code>Math</code> interface in two classes, 
<code>BasicMath</code> and <code>RecursiveMath</code>.

That's right, you'll be implementing recursive methods for addition, 
subtraction, multiplication, division, factorial, and exponentiation.

## Resources

Skeleton code for this project can be retrieved via 
<code>git://github.com/mepcotterell/cs1302-calculator.git</code>. For example, 
you can issue the following command to clone the repository.

    $ git clone git://github.com/mepcotterell/cs1302-calculator.git LastName-FirstName-p2

## Build System

For this project, we will be using the Simple Build System (sbt). If you clone 
the project from the GitHub repository then everything will be setup for you. In 
order to compile your project, you can use the following command:

    $ ./sbt compile

In order to generate the documentation for your project, use the following command:

    $ ./sbt doc

To run your JUnit tests, you may use the following command:

    $ ./sbt test

To run your project, use the following command:

    $ ./sbt run

In order to clean your project (remove compiled code), use the following command:

    $ ./sbt clean

## Submission Instructions

You will still be submitting your project via <code>nike</code>. Make sure your 
work is on <code>nike.cs.uga.edu</code> in a directory called 
<code>LastName-FirstName-p2</code>, and, from within the parent directory, 
execute the following command:

    $ submit LastName_FirstName-p2 cs1302a

It is also a good idea to email a copy to yourself. To do this, simply execute 
the following command, replacing the email address with your email address:

    $ tar zcvf LastName-FirstName-p2.tar.gz LastName-FirstName-p2
    $ mutt -s "[cs1302] p2" -a LastName-FirstName-p2.tar.gz -- your@email.com < /dev/null

## Questions

If you have any questions, please email them to Michael E. Cotterell at 
<code>mepcotterell+1302@gmail.com</code>


