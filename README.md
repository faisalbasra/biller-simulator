Biller Simulator
================


Description
----------------

This application is used in ArtiVisi simulator to test the application of our payment gateway.
This application features:

* Customer management
* Data management dummy bill
* Gateway [ISO-8583] (http://en.wikipedia.org/wiki/ISO_8583) to make bill payments to existing customers in the database.


The technology used
------------------------

* Java SDK 1.6
* Spring Framework 3.0.5
* Hibernate 3.6.0
* MySQL 5.1
* Jetty 6.1.26
* Maven 2.2.1
* JPOS 1.7.0

How to set up a database
-----------------------------
This application uses Hibernate, so theoretically support [all databases supported by Nevertheless, the development and the tests carried out using MySQL.

Configuring the database connection done in some places, namely:
* Pom.xml in the root folder: it is used to drop and create the database, run the automated test execution time
* Jdbc.properties biller-simulator-config/src/main/resources folder: it is used by applications at run time

For configuration in pom.xml, give MySQL username that has privileges to drop and create the database. Usually I use the root user to be an easy course.
For configuration jdbc.properties, usernamenya enough to have access to a database that is used in the application only.

The following SQL syntax to create a username, password, and database in MySQL. The command is run as root

`` `Sql
create database ppob_simulator;
grant all on ppob_simulator. * to simulators identified by 'simulator';
`` `

How to run a web application
-----------------------------

The web application is used to manage customer data and billing.

1. Open a command prompt and go to the folder where the application source code
2. Run mvn clean install
3. Go to the folder biller-simulator-ui-JSF
4. Run mvn clean jetty: run
5. Point your browser to http://localhost:8080/biller-simulator-ui-jsf/faces/index.xhtml

How to run the gateway pln
-----------------------------

Gateway PLN used to conduct inquiry and payment transactions electricity bills through the ISO-8583 protocol

1. Open a command prompt and go to the folder where the application source code
2. Run mvn clean install
3. Go to the folder biller-simulator-gateway-pln
4. Run mvn exec: java-Dexec.mainClass = "com.artivisi.biller.simulator.gateway.pln.Launcher"
5. ISO-8583 gateway is ready to wait in port 11 111

How to contribute
---------------
You want to contribute? Good for you.

There are several contributions that you can do, including:

* Perform testing
* Make documentation
* Edit the source code, either to fix bugs or add features

For contributions to testing, here's how:

1. Run the application, the web or the ISO-8583 is up.
2. Test its features.
3. If there are errors / bugs found, please direct [create a new issue] (https://github.com/artivisi/biller-simulator/issues/new).
We follow [your bug report] (http://endy.artivisi.com/blog/java/tips-melaporkan-error/), so easily acted on by the programmer.
Bug reports and feature requests should be written in Indonesian or English.

For contributions to the documentation, while we will prepare the first template documentation.
When you are there, we will update this section with steps to contribute.

To contribute source code, here's how:

1. Fork this repository into your own repository
2. Clone to the local for editing
3. Edit your heart
4. Commit and push to the repository on your own
5. Send pull request to me so I can merge into my repository
