# CSCI 1302 - Calculator Project (cs1302-calculator)

Skeleton code for the Caculator project

## Project Description

Your goal is to develop a calculator app in Java with a graphical user interface
(GUI) powered by Swing. You will be responsible for designing and implementing
the user interface for your project (following a few guidelines). This 
calculator app is interesting in that we will provide two different 
implementations for handling mathematical operations: a basic, iterative
implementation and a recursive implementation. This will be accomplished by 
implementing the <code>Math</code> interface in two classes, 
<code>BasicMath</code> and <code>RecursiveMath</code>. That's right, you'll be 
implementing recursive methods for addition, subtraction, multiplication, 
division, factorial, and exponentiation.

## Project Tasks

Before you submit your project, you need to perform the following tasks:

 1. Implement a basic implementation of the <code>Math</code> interface in the
    <code>BasicMath</code> class. The implementations for **all** the methods in
    this class are to be non-recursive.

 2. Implement a recursive implementation of the <code>Math</code> interface in
    the <code>RecursiveMath</code> class. the implementations for **all** the
    methods in this class are to be recursive. We will discuss how to do the
    addition operation recursively in class.

 3. Design and implement a GUI interface for your calculator app in the
    <code>Calculator</code> class using Java Swing. You may need to add methods 
    to this file as needed in order make your GUI functional. Currently, the
    skeleton code for this class contains an example of how to create a button
    in Swing and how to listen and react to it being clicked.

 4. Create JUnit tests for both the <code>BasicMath</code> and <code>RecursiveMath</code>
    classes in the <code>src/test/java/calc/1302</code> directory. This 
    directory already includes some unit tests for <code>Driver</code> and 
    <code>ReversePolishNotation</code> classes that your instructor has
    implemented.

 5. Ensure that your code is properly documented using inline comments as 
    neccessary. In general, you should describe in regular terms what it is the
    code that you are writing is doing. A small example of such comments can be
    seen in the <code>createAndShowGUI</code> method in the  <code>Calculator</code>
    class. Please note that you do not need to write JavaDoc comments for the 
    methods that implement methods in the <code>Math</code> interface as they 
    will inherit the comments from the interface. However, if you create any new
    methods or classes then they will need to be properly documented using
    JavaDoc comments and tags.

## Resources

The files for this project are hosted Github using <code>git</code>. They can be
retrieved by cloning the repository found at <code>git://github.com/mepcotterell/cs1302-calculator.git</code>. 
For example, you can issue the following command to clone the repository:

    $ git clone git://github.com/mepcotterell/cs1302-calculator.git LastName-FirstName-p2

As always, I suggest developing directly on <code>nike.cs.uga.edu</code> because
this is where your project will be run and tested. Since <code>git</code> is 
already installed on <code>nike</code>, you can clone the project directly int your 
<code>nike</code> home directory.

If any changes are made to the project description or skeleton code, they will
be announced in class. In order to incorporate such changes into your code, you 
need only do a <code>git pull</code>.

Also, since <code>git</code> is a decentralized version control system, you will
have your own local copy of the repository. This means that you can log your 
changes using commits and even revert to a previous revision if necessary.

## Build System

For this project, we will be using the Simple Build System (sbt). If you clone 
the project from the GitHub repository then everything will be setup for you. In 
order to compile your project, you can use the following command:

    $ ./sbt compile

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

## Frequently Asked Questions

 1. What do I do if the <code>sbt</code> command does not execute?

    You probably need to make the file executable. To do this, simmply make sure 
    you are in the same directory as <code>sbt</code> and issue the following
    command:

        $ chmod +x sbt

    This command updates the permissions on the file, making it executable for the
    current user.

