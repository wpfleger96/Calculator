# CSCI 1302 - Calculator Project (cs1302-calculator)

Skeleton code for the Calculator project assigned to the students in Michael E. 
Cotterell's Fall 2014 CSCI 1302 class at the University of Georgia. **Please read 
the entirety of this file before beginning your project.**

## Academic Honesty

You implicitly agree to Academic Honesty policy as outlined in the course 
syllabus.

In accordance with the notice above, I must caution you to **not** fork this
repository on GitHub if you have an account. Doing so will more than likely make
your copy of the project publicly visible. Please follow the instructions 
contained in the Resources section below in order to do your development on
<code>nike</code>.

## Collaboration Policy

Students are required to work in groups of two for this project. Furthermore, 
each group needs to engage in pair programming. Pair programming is an agile 
software development technique in which two programmers work together at one 
workstation. One, the driver, writes code while the other, the navigator, 
reviews each line of code as it is typed in. The two programmers switch roles 
frequently.

Yes, this involves physically meeting with your partner. Not being able to find 
time is NOT an excuse for not participating. If you need a place to meet and 
work on the project then I suggest the 307 lab in Boyd. The iMacs are already 
setup with everything you need. You login to them with your <code>nike</code>
account, open up the terminal application and SSH into your <code>nike</code>
account.

Furthermore, we will track your progress using Git commit logs. You will be 
required to use Git for this project. A portion of your grade will be determined 
based on you and your partner's Git log. Please follow the directions outlined in
the resources section carefully in order to make sure and your partner have this 
setup properly.

### Some Pair Programming Guidelines

 * You and your partner should work together as much as possible, with the 
   stipulation that at most 25% of your total time coding, testing, and 
   debugging on the assignment can be done alone.

 * When the pair gets back together after either partner has worked on the 
   code alone, review, line by line, the work done alone before doing any new 
   work. This is really easy if each person maintains their own branch and 
   commits as they work. 

 * You and your partner should alternate driving and navigating, spending 
   roughly equal amounts of time in each role.

 * After the project is completed, a pair programming survey will be made
   available for both partners to complete.

### Suggestions

I highly recommend that you follow the following workflow for development:

 * When working with your partner, work in the <code>master</code> branch.

 * Commit often using <code>git commit -am "place log message here"</code>.

 * Push your branches to GitHub often using <code>git push remote origin</code>.
   You will need to follow the GitHub handout linked below in order for this
   to work correctly.

 * When working alone, use your own _personal_ branch, committing often. When 
   you get back together with your partner, merge both personal branches into
   <code>master</code> and review the commit log. Once you've fixed merge
   conflicts, push your merged <code>master</code> branch to GitHub before
   continuing with your work.

I know some of these suggestions sound like overkill, but they will make your
life a lot easier if you learn how to take advantage of them properly. 

## Project Description

![Calc!](http://i.imgur.com/1K8mRIZ.png)

Your goal is to develop a calculator app in Java 7 or 8 with a graphical user interface
(GUI) powered by JavaFX. You will be responsible for designing and implementing
the user interface for your project (following a few guidelines). This 
calculator app is interesting in that we will provide two different 
implementations for handling mathematical operations: an iterative
implementation (loops) and a recursive implementation. This will be accomplished by 
implementing the <code>Math</code> interface in two classes, 
<code>IterativeMath</code> and <code>RecursiveMath</code>.

**Note:** If you choose to use Java 7 instead of Java 8, you will need to make sure
that <code>jfxrt.jar</code> is in your class path when compiling and running your
program. The easiest way to do this is to create a directory called <code>lib</code>
within your project directory (same directory as SBT) and place the 
<code>jfxrt.jar</code> there. This file is platform dependent. If you're using Java 8,
then you don't need to worry about this.

## Project Tasks

Before you submit your project, you need to perform the following tasks:

 1. (2014-11-04-TUE) (10 points) Implement a iterative implementation of the <code>Math</code> 
    interface in the <code>IterativeMath</code> class. The implementations for 
    **all** the methods in this class are to be non-recursive. They are to be 
    writen using iteration/loops. Just to be clear, you are NOT allowed to
    implement these functions the naive way. For example, you cannot implement
    addition as <code>return lhs + rhs</code>. You must implement it using a
    loop. In fact, here is an example of how to implement the 
    <code>add</code> method:
    ```java
    public int add(int lhs, int rhs) {
        int sum = lhs;    
        while (rhs > 0) {
            sum = inc(sum);
            rhs = dec(rhs);
        } // while
        return sum;
    } // add
    ```
    There are some more notes on implementing math functions in another
    section below. **You need to have this part committed to your git repository
    before 2014-11-04 @ 11:55 PM** The grader will deduct 5 points if your
    Git log does not reflect this upon submission.

 2. (2014-11-04-TUE) (10 points) Implement a recursive implementation of the <code>Math</code> 
    interface in the <code>RecursiveMath</code> class. the implementations for 
    **all** the methods in this class are to be recursive. You are not required
    to use accumulator recursion, however, doing so will make the transition
    from iteration to recursion a lot easier, especially for the math methods
    we haven't explicitly covered in class. There are some more notes on 
    implementing math functions in another section below. **You need to have 
    this part committed to your git repository before 2014-11-04 @ 11:55 PM** 
    The grader will deduct 5 points if your Git log does not reflect this upon 
    submission.

 3. (2014-11-11-TUE) (20 points) Design your calculator's GUI interface. You can use 
    a mock-up tool such as [Creately](http://creately.com/Online-UI-Mockups-and-Wireframes) 
    or [Pencil](http://pencil.evolus.vn/) (or similar) to make this 
    easier. Your GUI should allow users to take advantage of all of the
    operators defined in the <code>Math</code> interface. You mockup and final
    program need to contain the following elements: 

     * Text field for the mathematical expressions and the computed numbers; 
     * A button to switch between using "iteration" and "recursion," updating the UI appropriately;
     * The ability to toggle individual bits on and off, updating the UI appropriately.

    Your GUI must make use of some of the styling facilities available in JavaFX. 
    You will include your mockups in the <code>MOCKUP.md</code> file. **You need to 
    have this part committed to your git repository before 2014-11-11 @ 11:55 PM** 
    The grader will deduct 5 points if your Git log does not reflect this upon 
    submission.

 4. (2014-11-18-TUE) (50 points) Implement a GUI interface for your calculator app
    using JavaFX. 
    Your GUI must include the elements you described in your mockups. 
    The skeleton code is already setup for a basic JavaFX FXML application.
    I reccommend styling your app using CSS.
    **You need to 
    have this part committed to your git repository before 2014-11-18 @ 11:55 PM** 
    The grader will deduct 5 points if your git log does not reflect this upon 
    submission.

 5. (10 points) Ensure that your code is properly documented using inline comments as 
    necessary. In general, you should describe in regular terms what it is the
    code that you are writing is doing. A small example of such comments can be
    <code>Calculator</code> class. Please note that you do not need to write 
    JavaDoc comments for the methods that implement methods in the 
    <code>Math</code> interface as they will inherit the comments from the 
    interface. However, if you create any new
    methods or classes then they will need to be properly documented using
    JavaDoc comments and tags. We will be using <code>sbt doc</code> in order to
    check that you've properly written JavaDoc comments for all of your methods.

 6. Update the <code>README.md</code> in your project directory to contain the 
    following information at the top of the file (updating it with your own 
    information:

    ```markdown
    # Project Submission

    Author1: YOUR NAME (LAST 3 DIGITS OF 810/811 NUMBER HERE)
    Author2: PARTNER'S NAME (LAST 3 DIGITS of 810/811)

    [If you did any of the exra credit then please indicate that here.]
    ```

## Extra Credit Project Tasks

You may earn up to 20 points extra credit for each of the tasks listed below:

 1. (20 points) When the Konami code is entered (you know the code by now), 
    a playable game of Pong pops up, implemented in either JavaFX or Swing.
    If you do this extra credit, please indicate that in your
    <code>README.md</code> file.

## Note on Reverse Polish Notation (RPN)

Included with this project is an implementation of a <code>ReversePolishNotation</code>
class written by your instructor that provides a static method for converting a
mathematical expression represented in infix notation into one that is expressed 
in post-fix notation (also known as Reverse Polish Notation). There is also a 
static method provided to evaluate a mathematical expression represented in 
post-fix notation given an implementation of the <code>Math</code> interface is 
also provided. 

You do not need to understand the exact details of what RPN is in order to complete
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
int result = ReversePolishNotation.evaluate(iterativeMath, postfix);
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
    These implementations will be similar to the examples provided
    in lecture, except that the successor and predecessor methods have
    been renamed to <code>inc</code> (increment) and <code>dec</code>
    (decrement). 

 2. In the <code>multiply</code> and <code>divide</code> methods, if you need
    to add and subtract numbers that are greater than 1, you may do so only by
    calling your <code>add</code> and <code>subtract</code> methods.


## Design Suggestions

You may design your calculator app to look as plain or as cool as you want.
A suggested mock-up of the graphical user interface is provided below.

![Calculator UI Mock-up](http://i.imgur.com/1K8mRIZ.png)

Your GUI should incorporate at least the same functionality as the one in the
above mock-up. The meaning for most of the buttons is obvious. The <code><</code> 
button means backspace. The <code>X</code> button means clear the text area.
The <code>Use Recursion</code> button should toggle between "Use Recursion" and use 
"Use Iteration", depending on which implementation of the <code>Math</code> interface
your code is using. In the mock-up above, the app is currently using the 
<code>IterativeMath</code> class as its' <code>Math</code> implementation. The 
<code>^</code> button is for exponentiation and the <code>!</code> button is for 
factorial. There are also buttons displayed for the left shift and right shift
operators.

## Resources

**Note:** In order to follow some of the instructions below, you'll need to generate
an SSH public for your <code>nike</code> account. You can find some instructions on that
at the following website: https://help.github.com/articles/generating-ssh-keys#platform-all.

The files for this project are hosted Github using <code>git</code>. They can be
retrieved by cloning the repository found at <code>git://github.com/mepcotterell-cs1302/cs1302-calculator.git</code>. 

You should receive an eamil that explains what you need to do
in order to set everything up. Additionally, I've created a
handout that describes how to use Git with this project. It is available 
[here](https://www.dropbox.com/s/26p93krfyqgm3e1/GitHubStuff.pdf?dl=0).

--> https://www.dropbox.com/s/26p93krfyqgm3e1/GitHubStuff.pdf?dl=0

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
need to push your final changes to your GitHub repository. The grader will be cloning
your GitHub repository and testing your code that way. The submission instructions
presented below will be used as a backup in case something goes wrong.

You will still be submitting your project via <code>nike</code>. Make sure your 
work is on <code>nike.cs.uga.edu</code> in a directory called 
<code>LastName1-LastName2-p3</code>, and, from within the parent directory, 
execute the following command:

    $ submit LastName1-LastName2-p3 cs1302b

It is also a good idea to email a copy to yourself. To do this, simply execute 
the following command, replacing the email address with your email address:

    $ tar zcvf LastName1-LastName2-p3.tar.gz LastName1-LastName2-p3
    $ mutt -s "[cs1302] p3" -a LastName1-LastName2-p3.tar.gz -- your@email.com < /dev/null

## Questions

If you have any questions, please email them to Michael E. Cotterell at 
<code>mepcott@uga.edu</code>

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

    Alternatively, you may trying logging in with unsecured X11 forwarding using the
    following command:

        $ ssh -Y username@nike.cs.uga.edu

    If you are connecting to <code>nike</code> using PuTTY on Windows then you 
    need to download and install Xming. For information about how to setup Xming
    with Putty, please follow the directions [here](http://blog.nth-design.com/2010/05/19/x11-putty-xming/).
    You may skip some of the steps on that website (e.g., the section on 
    downloading and installing PuTTY), however, please read all of the sections
    related to Xming as wells the sections related to configuring PuTTY.\

 3. I tried working on this project on my own computer, but the program
    won't start. What gives?

    You're probably using Java 7 instead of Java 8. This problem occurs because
    the <code>jfxrt.jar</code> file (JavaFX library) is not included in the
    class path by default in Java 7. The easiest way to fix this problem is to
    update to Java 8. 

    If you don't want to upgrade to Java 8, then to fix this, you'll need to
    create a <code>lib</code> directory inside of your project directory
    (same directory as SBT) and place your <code>jfxrt.jar</code> in there.
    Then, SBT should be able to compile and run your project. 

    **NOTE:** The <code>jfxrt.jar</code> file is platform dependent. This
    means that it's different for Mac, Linux, and Windows. To find your
    version of the file, you will need to go into the <code>lib</code>
    directory of your JDK or JRE installation and copy it to the <code>lib</code>
    directory you created for your project. 

    **NOTE:** If you follow the steps above to make your project work with Java 7,
    you will need to make sure that you remove the <code>lib</code> directory
    when compiling and running your program on Nike, since the
    <code>jfxrt.jar</code> file you placed in the <code>lib</code> directory
    will conflict with Java 8's version of the file.

