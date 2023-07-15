# Coffee Machine

This is a virtual coffee machine simulation written in Java. It allows users to buy different types of coffee, refill the machine, take cash, and view the remaining resources.

## Features

1. Buy Coffee: Users can choose from three types of coffee (Espresso, Latte, and Cappuccino) and purchase them. The machine checks the availability of resources (water, milk, coffee beans, and cups) and provides the coffee if the resources are sufficient.

2. Refill: Users can add more water, milk, coffee beans, and disposable cups to the machine to replenish the resources.

3. Take Cash: Users can collect the cash from the machine, which represents the money earned from selling coffee.

4. View Remaining Resources: Users can check the current status of the machine, including the amount of water, milk, coffee beans, disposable cups, and cash available.

5. Exit: Users can exit the program.

## Running the Coffee Machine

To run the Coffee Machine program, follow these steps:

1. Ensure you have Java installed on your system.

2. Download or clone the repository containing the code.

3. Compile the `CoffeeMachine.java` file using the Java compiler:
   ```
   javac CoffeeMachine.java
   ```

4. Run the compiled code:
   ```
   java CoffeeMachine
   ```

5. The program will start, and you can follow the prompts on the command line to interact with the coffee machine.

## Usage

1. Upon running the program, the coffee machine menu will be displayed. The available options are:
   - **Buy**: Choose a coffee type to purchase.
   - **Fill**: Add resources (water, milk, coffee beans, and cups) to the machine.
   - **Take**: Collect the cash from the machine.
   - **Remaining**: View the remaining resources in the machine.
   - **Exit**: Terminate the program.

2. Select the desired option by entering the corresponding keyword or number.

3. Follow the instructions provided by the system to complete the chosen action.

4. You can continue to interact with the coffee machine until you choose the **Exit** option.

## Example

Here's an example interaction with the Coffee Machine:

```
Write action (buy, fill, take, remaining, exit):
remaining

The coffee machine has:
400 ml of water
540 ml of milk
120 g of coffee beans
9 disposable cups
$550 of money

Write action (buy, fill, take, remaining, exit):
buy
What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:
2
I have enough resources, making you a coffee!

Write action (buy, fill, take, remaining, exit):
take
I gave you $550

Write action (buy, fill, take, remaining, exit):
remaining

The coffee machine has:
350 ml of water
465 ml of milk
100 g of coffee beans
8 disposable cups
$0 of money

Write action (buy, fill, take, remaining, exit):
fill
Write how many ml of water you want to add:
2000
Write how many ml of milk you want to add:
500
Write how many grams of coffee you want to add:
300
Write how many disposable cups of coffee you want to add:
10

Write action (buy, fill, take, remaining, exit):
remaining

The coffee machine has:
2350 ml of water
965 ml of milk
400 g of coffee beans
18 disposable cups
$0 of money

Write action (buy, fill, take, remaining, exit):
exit
```

## Contributions

Contributions to this Coffee Machine simulation are welcome. If you find any issues or have suggestions for improvements, feel free to create a pull request or submit an issue in the repository.

## License

This project is licensed under the [MIT License](LICENSE). Feel free to modify and distribute the code as per the terms of the license.

## Author

This Coffee Machine simulation was developed by Guy Kogan.
