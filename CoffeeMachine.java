import java.util.Scanner;


enum coffeeType {
    ESPRESSO, LATTE, CAPPUCCINO;
}

public class CoffeeMachine {

    public static class CoffeeMachineCreator {
        String coffeeMachine;
        String decision = "";
        coffeeType coffee;
        final String reply = "I have enough resources, making you a coffee!\n";
        int mlOfWater = 400;
        int mlOfMilk = 540;
        int coffeeBeans = 120;
        int disposableCups = 9;
        int cashStart = 550;
        final int espressoOfWaterPerCup = 250;
        final int latteOfWaterPerCup = 350;
        final int cappuccinoOfWaterPerCup = 200;
        final int latteOfMilkPerCup = 75;
        final int cappuccinoOfMilkPerCup = 100;
        final int espressoOfBeansPerCup = 16;
        final int latteOfBeansPerCup = 20;
        final int cappuccinoOfBeansPerCup = 12;
        final int costEspresso = 4;
        final int costLatte = 7;
        final int costCappuccino = 6;

        public String inputProcessing() {
            Scanner scanner = new Scanner(System.in);
            this.decision = scanner.nextLine();
            return decision;
        }

        public void buyEspresso() {
            if (mlOfWater - espressoOfWaterPerCup >= 0 && coffeeBeans - espressoOfBeansPerCup >= 0 && disposableCups - 1 >= 0) {
                mlOfWater -= espressoOfWaterPerCup;
                coffeeBeans -= espressoOfBeansPerCup;
                cashStart += costEspresso;
                disposableCups -= 1;
                System.out.println(reply);
            } else {
                if (mlOfWater - espressoOfWaterPerCup < 0) {
                    System.out.println("Sorry, not enough water!");
                } else if (coffeeBeans - espressoOfBeansPerCup < 0) {
                    System.out.println("Sorry, not enough coffee!");
                } else if (disposableCups - 1 < 0) {
                    System.out.println("Sorry, not enough cups!");
                }
            }
        }

        public void buyLatte() {
            if (mlOfWater - latteOfWaterPerCup >= 0 && coffeeBeans - latteOfBeansPerCup >= 0 && disposableCups - 1 >= 0 && mlOfMilk - latteOfMilkPerCup >= 0) {
                mlOfWater -= latteOfWaterPerCup;
                coffeeBeans -= latteOfBeansPerCup;
                cashStart += costLatte;
                mlOfMilk -= latteOfMilkPerCup;
                disposableCups -= 1;
                System.out.println(reply);
            } else {
                if (mlOfWater - latteOfWaterPerCup < 0) {
                    System.out.println("Sorry, not enough water!");
                } else if (coffeeBeans - latteOfBeansPerCup < 0) {
                    System.out.println("Sorry, not enough coffee!");
                } else if (mlOfMilk - latteOfMilkPerCup < 0) {
                    System.out.println("Sorry, not enough milk!");
                } else if (disposableCups - 1 < 0) {
                    System.out.println("Sorry, not enough cups!");
                }
            }
        }
        public void buyCappuccino() {
            if (mlOfWater - cappuccinoOfWaterPerCup >= 0 && mlOfMilk - cappuccinoOfMilkPerCup >= 0 && coffeeBeans - cappuccinoOfBeansPerCup >= 0 && disposableCups - 1 >= 0) {
                mlOfWater -= cappuccinoOfWaterPerCup;
                coffeeBeans -= cappuccinoOfBeansPerCup;
                cashStart += costCappuccino;
                mlOfMilk -= cappuccinoOfMilkPerCup;
                disposableCups -= 1;
                System.out.println(reply);
            } else {
                if (mlOfWater - cappuccinoOfWaterPerCup < 0) {
                    System.out.println("Sorry, not enough water!");
                } else if (coffeeBeans - cappuccinoOfBeansPerCup < 0) {
                    System.out.println("Sorry, not enough coffee!");
                } else if (mlOfMilk - cappuccinoOfMilkPerCup < 0) {
                    System.out.println("Sorry, not enough milk!");
                } else if (disposableCups - 1 < 0) {
                    System.out.println("Sorry, not enough cups!");
                }
            }
        }
        public void action() {
            Scanner scanner = new Scanner(System.in);
            while(!decision.contentEquals("exit")){
                System.out.println("Write action (buy, fill, take, remaining, exit):");
                decision = inputProcessing();
                if (decision.contentEquals("buy")) {
                    System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
                    decision = inputProcessing();
                    if (decision.contentEquals("back")) {
                        continue;
                    } else {
                        coffee = coffeeType.values()[Integer.parseInt(decision) - 1];
                    }
                    switch (coffee) {
                        case ESPRESSO:
                            buyEspresso();
                            break;
                        case LATTE:
                            buyLatte();
                            break;
                        case CAPPUCCINO:
                            buyCappuccino();
                            break;
                    }
                } else if (decision.contentEquals("take")) {
                    String cash = String.format("I gave you $%d", cashStart);
                    System.out.println(cash);
                    cashStart = 0;
                } else if (decision.contentEquals("fill")) {
                    System.out.println("Write how many ml of water you want to add:");
                    mlOfWater += scanner.nextInt();
                    System.out.println("Write how many ml of milk you want to add:");
                    mlOfMilk += scanner.nextInt();
                    System.out.println("Write how many grams of coffee you want to add:");
                    coffeeBeans += scanner.nextInt();
                    System.out.println("Write how many disposable cups of coffee you want to add:");
                    disposableCups += scanner.nextInt();
                    System.out.println();
                } else if (decision.contentEquals("remaining")) {
                    coffeeMachine = String.format("\n"+"The coffee machine has:\n" +
                            "%d ml of water\n" +
                            "%d ml of milk\n" +
                            "%d g of coffee beans\n" +
                            "%d disposable cups\n" +
                            "$%d of money\n", mlOfWater, mlOfMilk, coffeeBeans, disposableCups, cashStart);
                    System.out.println(coffeeMachine);
                }
            }
            }
        }

    public static void main(String[] args) {
        CoffeeMachineCreator machineFirst = new CoffeeMachineCreator();
        machineFirst.action();
    }
}
