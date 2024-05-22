# Lead Mobile Developer Take-Home Test

## Overview

Welcome to the take-home test for the Lead Mobile Developer position at our company. This test is designed to evaluate your skills and approach to mobile development, as well as your ability to lead a team. You will be tasked with developing a mobile application based on the provided requirements. Please complete the tasks outlined below and submit your solution within the specified timeframe.

## Task

Your task is to develop a mobile application for a fictitious e-commerce platform called "Shopify." The application should allow users to browse products, add them to their cart, and complete purchases. Additionally, the application should include user authentication and basic account management functionalities.

## Requirements

1. **User Authentication:**
   - Implement a secure user authentication system.
   - Users should be able to register an account, log in, and log out.
   - Passwords should be securely hashed and stored.

2. **Product Catalog:**
   - Fetch a list of products from a mock API (provided below).
   - Display the list of products in a visually appealing and user-friendly manner.
   - Include features such as sorting and filtering (e.g., by category, price).

3. **Shopping Cart:**
   - Allow users to add products to their shopping cart.
   - Display the contents of the shopping cart, including product details and total price.
   - Enable users to adjust the quantity of items in the cart or remove items entirely.

4. **Checkout Process:**
   - Implement a checkout process that allows users to enter shipping and payment information.
   - Validate user inputs and display appropriate error messages.
   - Upon successful completion of the purchase, display a confirmation message to the user.

5. **Account Management:**
   - Allow users to view and edit their account information (e.g., name, email, shipping address).
   - Provide options for users to update their password or delete their account.

## Mock API

Use the following mock API endpoints to fetch product data:

- **Base URL:** `https://api.shopify.com`
- **GET /products:** Retrieve a list of products.
  - Example Response:
    ```json
    {
      "products": [
        {
          "id": 1,
          "name": "Product 1",
          "description": "Description of Product 1",
          "price": 19.99,
          "category": "Electronics"
        },
        {
          "id": 2,
          "name": "Product 2",
          "description": "Description of Product 2",
          "price": 29.99,
          "category": "Clothing"
        },
        ...
      ]
    }
    ```

## Submission Guidelines

- Fork this repository and work on your solutions there.
- You can use either Android or IOS native
- Ensure your code is well-structured, documented, and follows best practices.
- Include instructions for running the application locally.
- Submit your solutions via email, including a link to your repository.

## Evaluation Criteria

Your submission will be evaluated based on the following criteria:

- **Functionality:** Does the application meet all the specified requirements?
- **Code Quality:** Is the code well-organized, readable, and maintainable?
- **User Experience:** Is the application intuitive and user-friendly?
- **Security:** Are proper security measures implemented, especially regarding user authentication and data handling?
- **Scalability:** Is the architecture scalable and able to handle potential future enhancements?

## Deadline

Please submit your solution before <b>26 May 23:59</b> to finish this task.

## Contact Information

If you have any questions or need clarification on any aspect of the task, please don't hesitate to reach out to us.

Good luck, and happy coding!
