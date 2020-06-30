# HiberusCodingTest

First, i see that in your test you dont specify what must to do the LogisticService so i decide to do in this service create a .txt that prints the receipt of the order and leave in a specify path. With the BillService only do the sum of all the products in the order. And checkout receive the order and do the calls to the other services.
 
I decide separate in 3 layer for all the projects that are: controller for the endpoints, service for each specify service and entities for the objects that i decide to use in java. 

There are another layer for the configuration but its only for swagger configuration.

The framework that i choose was spring boot because its a easy, usefull and provide a lot of tools for build rest endpoints.

Also im new in swagger so i do a basic configuration and import two libraries: swagger and springfox for build the default apidocs that the libraries generate.

¿How to build/run/use the app?

To build the app the only command that you need to do is: docker-compose up -d with that command the app is gonna compile all the wars and deploy into 3 different containers so when its finish, the containers are ready to use. To run the app im gonna leave 3 postmans with petitions that i use for run the app so you can use it for test all the wars.

I decide pick a DockerFile and build with maven in the dockerfile all the warse and later deploy in a tomcat server with a image of tomcat.
