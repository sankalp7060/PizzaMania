Pizza Mania is a fun and interactive console-based Java application that simulates a pizza ordering system. Users can choose from a variety of pizzas, customize their orders with optional extras like cheese and toppings, and even select takeaway options. The program calculates the total cost and generates a detailed bill, making it a delightful and educational project for learning Java programming concepts.

Features 🎉
Four Pizza Options:

Veg Pizza: ₹300
Non-Veg Pizza: ₹400
Deluxe Veg Pizza: ₹550
Deluxe Non-Veg Pizza: ₹650
Customizable Add-ons:

Extra Cheese: ₹100
Extra Toppings: ₹150
Takeaway Charges: ₹20
Dynamic User Interaction:

Users can continue adding pizzas to their order.
Input validation ensures smooth operation with clear prompts for invalid inputs.
Detailed Billing:

Displays a summary of all charges, including itemized costs for add-ons.
Includes a friendly thank-you message upon completion of the order.
How to Run 🛠️
Clone the repository or download the source code.
Open the project in your favorite Java IDE (e.g., IntelliJ IDEA, Eclipse) or compile and run it directly using the terminal.
Follow the on-screen prompts to customize and place your pizza order.
Code Highlights 🖥️
Modular Design: The program uses separate methods (vegPizza(), nonVegPizza(), cheeseCharges(), etc.) to handle various functionalities, improving readability and maintainability.

Dynamic Input Handling: The application uses a Scanner object to capture user input and dynamically updates order details based on selections.

Error Handling: Prompts the user for valid inputs to avoid runtime errors and ensures a smooth user experience.

Example Output 📋
plaintext
Copy
Edit
--------------------------------------Welcome To PizzaMania--------------------------------------
Which pizza would you like to have:-
1. Veg Pizza                        300
2. Non-Veg Pizza                    400
3. Deluxe Veg Pizza                 550
4. Deluxe Non-Veg Pizza             650

Press 1 for Veg Pizza
Press 2 for Non-Veg Pizza
Press 3 for Deluxe Veg Pizza
Press 4 for Deluxe Non-Veg Pizza
If you don't want any pizza, then press any number.
1
You choose veg pizza

The extra cheese will be an additional 100. Would you like to include it? (Y/N):- Y
The extra toppings will be an additional 150. Would you like to include it? (Y/N):- N
Will this order be for takeaway, or would you like to dine in? (Y/N):- Y
If you want more pizzas, you can still choose.
Do you want another pizza? (Y/N):- N

Your Bill:
ExtraCheese:               100
TakeAway:                 20
Veg Pizza                 300
Total Amount:             420

--------------------Thank you for visiting PizzaMania. Have a great day ahead!--------------------
Future Enhancements 🚀
Implement a graphical user interface (GUI) for a more user-friendly experience.
Add more pizza varieties and customization options.
Introduce combo offers and discounts.
Store order history for future analysis.
License 📜
This project is open-source and available under the MIT License.
