Dish Rating Application

Problem
-------
This problem was inspired by a pair programming exercise I encountered at an interview. 

The interview exercise was based on a different subject, I have changed the subject to rating meals at a restaurant, and made some other modifications.

Requirements
------------
- Given a file of ratings for dishes at a restaurant, output a list of the rated dishes in descending order.

Instructions
------------
- 45 minutes (do not necessarily need to fully complete implementation)
- Read from file, parse each line, produce sorted list of dishes at restaurant as rated by customers

Tips
----
- Perhaps do some quick design first on paper i.e. UML class diagram
    * Pay attention to the data contained in the file we need to read and parse, and the output required.
- Approach problem using TDD
    * Have design in mind prior to writing tests. Otherwise if you design on the fly and write the tests will likely end up with poor solution.
- SOLID principles
    * Interviewers like self-documenting code. Readable code can reduce need for comments by upto 90%.
- Interviewer may only share IDE window if done remotely (for privacy reasons). Do not expect access to menubar if interviewer
  is running on a Mac. You may have to search the web on your own machine. Unlikely you can copy and paste in this situation.
- I decided to use Lombok for getter and setter annotations. Wasted a little bit of time importing Lombok in Maven,
  most IDE's usually have an option to select variables in a Plain Old Java Object (POJO) and create getter and setter methods in the class.
- Make sure to talk about what you are doing as you go along.
