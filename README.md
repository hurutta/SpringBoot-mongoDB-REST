
# Restaurent Management System - Backend - SpringBoot REST using mongoDB noSQL
  
  
<div id="top"></div>

<!-- TABLE OF CONTENTS -->

## Table of Contents

  <ol>
    <li>
      <a href="#about2">About The Project</a>
      <ul>
        <li><a href="#build3">Structure</a></li>
        <li><a href="#build2">Built With</a></li>
      </ul>
    </li>
    <li><a href="#usage2">Usage</a></li>
    <li><a href="#usage3">Feature</a></li>
    <li><a href="#contact2">Contact</a></li>
  </ol>



<div id="about2"></div>


<!-- ABOUT THE PROJECT -->

## About The Project

Its a springBoot REST API application for restaurent management system, which can be used for sending or receiving API containing data of orders of restaurent. I used mongoDB noSQL as database for this backend project.


<p align="right">(<a href="#top">back to top</a>)</p>


<div id="build3"></div>

## Structure
  
### Dependency
  Dependecies imported and used for SpringBoot Application -
  * Spring Data MongoDB
  * Spring Web
  * Spring Boot DevTools

### Directory
```
.
└── mongoDbProject/
    ├── MongoDbProjectApplication.java
    ├── model/
    │   └── Restaurent.java
    ├── controller/
    │   └── RestaurentController.java
    ├── repository/
    │   └── RestaurentRepository.java
    └── service/
        ├── RestaurentService.java
        └── RestaurentServiceImpl.java
```  
<p align="right">(<a href="#top">back to top</a>)</p>    

<div id="build2"></div>
  
## Built With

### Technology used

  * SpringBoot
  * java
  * mongoDB

### Software used
  
  * Postman
  * Robo 3t (mongoDB gui)
  * Editor (VScode)
  
<p align="right">(<a href="#top">back to top</a>)</p>





<div id="usage2"></div>



<!-- USAGE EXAMPLES -->
## Usage

I tested this application by postman, set server port as `8888`. Server port can be changed at this directory - `src > main > resources > application.properties`

<p align="right">(<a href="#top">back to top</a>)</p>



<div id="usage3"></div>



<!-- USAGE EXAMPLES -->
## Features

* Rest endpoints 

    * **POST:** http://localhost:8888/create : Add a new order to the database <br>  
    Sample JSON for this request:
     ```
      {
          "orderNo": 1,
          "customerName": "Mr. Cat",
          "items": "fish and water",
          "cost": 12.50,
          "paid": false
      }
     ```
    * **GET:** http://localhost:8888/all/ : Get a complete list of all order
    * **DELETE:** http://localhost:8888/remove/{orderId} : Delete an order by it's id
    * **PUT:** http://localhost:8888/ : Update an existing order by it's orderId
    Sample JSON for this request:
     ```
      {
          "orderNo": 1,
          "paid": true
      }
     ```
    * **POST:** http://localhost:8888/info/{orderId}/ : Get info of an individual order by it's specific `orderId`
    * **GET:** http://localhost:8888/info/ : Get brief info of all orders
 
  
<p align="right">(<a href="#top">back to top</a>)</p>



<div id="contact2"></div>


<!-- CONTACT -->
## Contact

You may contact with me via gmail if needed. All necessary contact info you will find at - 
<a href="https://hurutta.github.io"> my website. <a>


<p align="right">(<a href="#top">back to top</a>)</p>
