FirstRestAPI Project

Overview
This project is a simple REST API built with Java and Spring Boot. It allows you to manage products by creating, reading, updating, and deleting them.

Tools Used
- Java and Spring Boot for building the API.
- H2 Database: a lightweight, in-memory database used for storing product data during development and testing.
- Postman: main tool for testing the API endpoints.
- Swagger: sometimes used to explore and test the API.

What Was Done
- Created API endpoints to:
  - Add a new product (POST)
  - Get a product by its ID (GET)
  - Update product details (PUT)
  - Delete a product by ID (DELETE)
- Configured H2 database to store products temporarily while the app runs.
- Tested each endpoint using Postman to ensure they work as expected.
- Used the H2 database console to verify data was correctly added, updated, or removed.
- Occasionally used Swagger to visualize and test the API.

How to Test
1. Run the Spring Boot application.
2. Use Postman to send HTTP requests to the API:
   - POST to create products
   - GET to retrieve them by ID
   - PUT to update product details
   - DELETE to remove products
3. Open the H2 console (at http://localhost:8080/console) to run SQL queries and check the database state.
4. Observe results of operations through the console and Postman responses.

Screenshots

1. Sending a POST request to add a new product with values.
   ![Post values](Screenshots/img1.png)
   
2. Retrieving a product by its ID using a GET request.
   ![Get ID](Screenshots/img2.png)
    
3. SQL query showing all products currently in the database.
   ![SQL](Screenshots/img3.png)
     
4. Sending a DELETE request to remove a product by ID.
   ![Delete](Screenshots/img4.png)  

5. Result confirming the product was successfully deleted on console.
    ![Delete Result](Screenshots/img5.png)  

 6.Sending a PUT request to modify/update a product.
    ![Modify](Screenshots/img6.png)  

 7.Result showing the updated product details after modification on console.
    ![Modify Result](Screenshots/img7.png)  


*Created Afreen*
