# CSCI 1302 - Calculator Project (cs1302-calculator)

Skeleton code for the Calculator project assigned to the students in Michael E. 
Cotterell's Spring 2013 CSCI 1302 class at the University of Georgia. Please read 
the entirety of this file before beginning your project.

## Academic Honesty

You implicitly agree to Academic Honesty policy as outlined in the course 
syllabus and course website (available at: http://cs.uga.edu/~mec/cs1302/).

In accordance with the notice above, I must caution you to **not** fork this
repository on GitHub if you have an account. Doing so will more than likely make
your copy of the project publicly visible. Please follow the instructions 
contained in the Resources section below in order to do your development on
<code>nike</code>.

## Collaboration Policy

### Pair Programming Guidelines

 * You and your partner should work together as much as possible, with the 
   stipulation that at most 25% of your total time coding, testing, and 
   debugging on the assignment can be working alone.

 * When the pair gets back together after either partner has worked on the 
   code alone, review, line by line, the work done alone before doing any new 
   work. This is really easy if each person maintains their own branch and 
   commits as they work. 

 * You and your partner should alternate driving and navigating, spending 
   roughly equal amounts of time in each role.

### Suggestions

I highly recommend that you follow the following workflow for development:

 * When working with your partner, work in the <code>master</code> branch.

 * Commit often using <code>git commit</code>.

 * Push your branches to GitHub often using <code>git push remote branch-name-here</code>.

 * When working alone, use your own _personal_ branch, committing often. When 
   you get back together with your partner, merge both personal branches into
   <code>master</code> and review the commit log. Once you've fixed merge
   conflicts, push your merged <code>master</code> branch to GitHub before
   continuing with your work.

I know some of these suggestions sound like overkill, but they will make your
life a lot easier if you learn how to take advantage of them properly.

## Project Description

![Calc!](http://i.imgur.com/1OwHxxD.png)

Your goal is to develop a calculator app in Java with a graphical user interface
(GUI) powered by Swing. You will be responsible for designing and implementing
the user interface for your project (following a few guidelines). This 
calculator app is interesting in that we will provide two different 
implementations for handling mathematical operations: an iterative
implementation and a recursive implementation. This will be accomplished by 
implementing the <code>Math</code> interface in two classes, 
<code>IterativeMath</code> and <code>RecursiveMath</code>.

## Project Tasks

Before you submit your project, you need to perform the following tasks:

 1. (10 points) Implement a iterative implementation of the <code>Math</code> interface in the
    <code>IterativeMath</code> class. The implementations for **all** the methods in
    this class are to be non-recursive. They are also to be writen using iteration/loops.

 2. (10 points) Implement a recursive implementation of the <code>Math</code> interface in
    the <code>RecursiveMath</code> class. the implementations for **all** the
    methods in this class are to be recursive. 

 3. (50 points) Design and implement a GUI interface for your calculator app in the
    <code>Calculator</code> class using Java Swing. Your GUI must include the
    following: Text field for the mathematical expressions;
    A button to switch between using "iteration" and "recursion"; 
    the ability to toggle individual bits on and off, updating the UI appropriately.
    Your GUI must make use of some of the styling facilities available in Swing. 

 4. (40 points) Write a report analyzing the time complexity of each <code>Math</code>
    implementation. Give the time function and complexity class (using Big-O) for each
    method. Compare both implementation and write a sentence or two explaining the
    trade-offs between the two implementations. This report should be formatted
    using Markdown (similar to the contents of this README file) and saved in the
    <code>REPORT.md</code> file.

 5. (10 points) Ensure that your code is properly documented using inline comments as 
    necessary. In general, you should describe in regular terms what it is the
    code that you are writing is doing. A small example of such comments can be
    seen in the <code>createAndShowGUI</code> method in the  <code>Calculator</code>
    class. Please note that you do not need to write JavaDoc comments for the 
    methods that implement methods in the <code>Math</code> interface as they 
    will inherit the comments from the interface. However, if you create any new
    methods or classes then they will need to be properly documented using
    JavaDoc comments and tags.

 6. Update the <code>README.md</code> in your project directory to contain the 
    following information at the top of the file (updating it with your own 
    information:

    ```markdown
    # Project Submission

    Author: YOUR NAME (LAST 3 DIGITS OF 810 NUMBER HERE)

    [If you did any of the exra credit then please indicate that here.]
    ```
        
## Extra Credit Project Tasks

You may earn up to 20 points extra credit for each of the tasks listed below:

 1. (20 points) When the Konami code is entered (you know the code by now), a playable game of Pong pops up, implemented in Swing.

## Note on Reverse Polish Notation (RPN)

Included with this project is an implementation of a <code>ReversePolishNotation</code>
class written by your instructor that provides a static method for converting a
mathematical expression represented in infix notation into one that is expressed 
in post-fix notation (also known as Reverse Polish Notation). There is also a 
static method provided to evaluate a mathematical expression represented in 
post-fix notation given an implementation of the <code>Math</code> interface is 
also provided. 

You do need to understand the exact details of what RPN is in order to complete
this project, however, you do need to understand what the input to the <code>infixToPostfix</code>
method needs to look like. The method takes one parameter, an array of Strings.
Each element of this array should contain the String representation of either
a number or an operator. For example, you could write something like following:

```java
// string containing a mathematical expression represented in infix notation
String expression = "4 + 2 ! / 3 - 7 * 2 ^ 3";

// convert the expression into an array by splitting it by white space
String infix[] = expression.split(" ");

// use the ReversePolishNotation class to get an array containing the expression
// in post-fix notation
String postfix[] = ReversePolishNotation.infixToPostfix(infix);

// create an instance of your BasicMath class
Math iterativeMath = new IterativeMath();

// use the ReversePolishNotation class to evaluate the expression
double result = ReversePolishNotation.evaluate(iterativeMath, postfix);
```

Note: If an element of the infix array contains a number prefixed with a minus 
sign then that number is treated as a negative number.

For more general information on RPN, you can read its' WikiPedia page here:
http://en.wikipedia.org/wiki/Reverse_Polish_notation

## Notes on Math Implementations

To make things easier, you may assume that this calculator only works for
non-negative operands. However, you still need to follow some rules when
implementing.

 1. In the <code>add</code> and <code>subtract</code> methods, you may
     only modifier any given number in the method by adding or subtracting 1.

 2. In the <code>multiply</code> and <code>divide</code> methods, if you need
    to add and subtract numbers that are greater than 1, you may do so only by
    calling your <code>add</code> and <code>subtract</code> methods.

## Design Suggestions

You may design your calculator app to look as plain or as cool as you want.
A suggested mock-up of the graphical user interface is provided below.

![Calculator UI Mock-up](http://i.imgur.com/1OwHxxD.png)

Your GUI should incorporate at least the same functionality as the one in the
above mock-up. The meaning for most of the buttons is obvious. The <code><</code> 
button means backspace. The <code>X</code> button means clear the text area.
The <code>Use Recursion</code> button should toggle between "Use Recursion" and use 
"Use Iteration", depending on which implementation of the <code>Math</code> interface
your code is using. In the mock-up above, the app is currently using the 
<code>IterativeMath</code> class as its' <code>Math</code> implementation. The 
<code>^</code> button is for exponentiation and the <code>!</code> button is for 
factorial.

## Resources

**Note:** In order to follow some of the instructions below, you'll need to generate
an SSH public for your <code>nike</code> account. You can find some instructions on that
at the following website: https://help.github.com/articles/generating-ssh-keys#platform-all.

The files for this project are hosted Github using <code>git</code>. They can be
retrieved by cloning the repository found at <code>git://github.com/mepcotterell-cs1302/cs1302-calculator.git</code>. 
For example, you can issue the following command to clone the repository:

    $ git clone git://github.com/mepcotterell-cs1302/cs1302-calculator.git LastName-Lastname-p3

Once you the skeleton code cloned, you need to set your remote origin to the 
repository provided to your group. 

    $ git remote set-url origin git@github.com:mepcotterell-cs1302/groupname.git
    $ git push -u origin master

Now you are setup to work collaboratively with your teammate via GitHub.

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

## Directory Structure and Packages

All of the non-test classes for this project should be contained in the <code>src/main/java/cs1302/calc</code>
directory. These classes are in the <code>cs1302.calc</code> package.

All of the JUnit test classes for this project should be contained in the <code>src/test/java/cs1302/calc</code>
directory. These classes are also contained in the <code>cs1302.calc</code> 
package so that you do not need to do any imports to test your own code.

## Build System

For this project, we will be using the Simple Build System (sbt). If you clone 
the project from the GitHub repository then everything will be setup for you. In 
order to compile your project, you can use the following command:

    $ ./sbt compile

To run your project, use the following command:

    $ ./sbt run

In order to clean your project (remove compiled code), use the following command:

    $ ./sbt clean

## Submission Instructions

In addition to submitting using the <code>submit</code> command below, you will also
need to push your final changes to your GitHub repository.

You will still be submitting your project via <code>nike</code>. Make sure your 
work is on <code>nike.cs.uga.edu</code> in a directory called 
<code>LastName-LastName-p3</code>, and, from within the parent directory, 
execute the following command:

    $ submit LastName_FirstName-p2 cs1302a

It is also a good idea to email a copy to yourself. To do this, simply execute 
the following command, replacing the email address with your email address:

    $ tar zcvf LastName-LastName-p3.tar.gz LastName-LastName-p2
    $ mutt -s "[cs1302] p2" -a LastName-LastName-p2.tar.gz -- your@email.com < /dev/null

## Questions

If you have any questions, please email them to Michael E. Cotterell at 
<code>mepcotterell+1302@gmail.com</code>

## Frequently Asked Questions

 1. What do I do if the <code>sbt</code> command does not execute?

    You probably need to make the file executable. To do this, simply make sure 
    you are in the same directory as <code>sbt</code> and issue the following
    command:

        $ chmod +x sbt

    This command updates the permissions on the file, making it executable for the
    current user.

 2. When I execute the <code>sbt run</code> command on <code>nike</code>, I get 
    a <code>java.awt.HeadlessException</code> that tells me no X11 DISPLAY 
    variable was set, but this program performed an operation which requires it.
    What is going on and how do I fix it?

    This exception is thrown if you are not running an X server on your computer
    or you are not telling your SSH client how to connect to the X server on
    your computer.

    If you are connecting to <code>nike</code> using a Linux or MacOS X machine
    then you probably already have an X server installed. If that is the case
    then you need to login using the following command:

        $ ssh -X username@nike.cs.uga.edu

    If you are using MacOS X and are unable to resolve your problem simply by
    issuing the above command then follow the directions [here](http://tutorialgenius.blogspot.com/2012/03/how-to-enable-x11-forwarding-with-ssh.html).
    After following the steps on that website, try logging into nike using the 
    SSH command above.

    If you are connecting to <code>nike</code> using PuTTY on Windows then you 
    need to download and install Xming. For information about how to setup Xming
    with Putty, please follow the directions [here](http://blog.nth-design.com/2010/05/19/x11-putty-xming/).
    You may skip some of the steps on that website (e.g., the section on 
    downloading and installing PuTTY), however, please read all of the sections
    related to Xming as wells the sections related to configuring PuTTY.\

