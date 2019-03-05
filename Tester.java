
import java.util.ArrayList;
import java.util.Scanner;

public class Tester {

    public static void main(String[] args) {
        
        ArrayList <DrinkItem> drinks = new ArrayList<DrinkItem> (); 
        ArrayList <DessertItem> desserts = new ArrayList <DessertItem> ();
        boolean sale = true;
        CashRegister makeTransaction = new CashRegister();
        System.out.println("Welcome to my boba shop!\n");
        while (sale) {
            
            Scanner in = new Scanner(System.in);
            int userChoice; 
             
            System.out.println("Would you like to. . .\n\n1. Purchase a drink\n2. Purchase pastries\n3. Purchase cookies\n4. Purchase macaroons\n5. Finalize sale\n6. Close Cash Register");
            String userInput = in.next();
            //Purchasing a drink
            if (userInput.equals("1")) {
                
                boolean buyDrink = true;
                while (buyDrink) {
                    BobaDrink bobaDrink = new BobaDrink();
                    CoffeeDrink coffee = new CoffeeDrink();
                    

                    System.out.println("1. Tea\n2. Coffee\n3. Exit");
                    userInput = in.next();
                    
                    if (userInput.equals("1")) {
                        System.out.println("What kind of tea do you want?\n");
                        System.out.println("1. Green tea\n2. Black tea\n3. Jasmine green tea\n4. Rose tea\n5. Oolong tea");
                        userChoice = in.nextInt();
                        //Green tea
                        boolean addBase = true; 
                        while (addBase){
                            
                            if (userChoice >= 1 && userChoice <= 5) {
                                bobaDrink.setDrink(userChoice);
                                addBase = false; 
                               
                            }
                            //invalid input
                            else {
                                System.out.println("You entered an invalid input");
                            }
                        }
                        boolean sizing = true;
                        System.out.println("What size do you want?");
                        System.out.println("1. Small\n2. Medium\n3. Large");
                        
                        while (sizing) {
                            userChoice = in.nextInt();
                            if (userChoice >= 1 && userChoice <= 3) {
                                bobaDrink.setSize(userChoice);
                                sizing = false;
                            }

                            else {
                                System.out.println("You entered an invalid input");
                            }
                        }
                        System.out.println("You ordered a " + bobaDrink.getSize());

                        System.out.println(bobaDrink.getDrink());
                        System.out.println("What kind of toppings do you want? (You can add as many as you want)");

                        boolean addToppings = true; 
                        
                        while (addToppings) {
                            System.out.println("1. Boba\n2. Popping Boba\n3. Grass jelly\n4. Lychee jelly\n5. Coconut Jelly\n6. Mini mochi\n7. No toppings/no additional toppings");
                            userChoice = in.nextInt(); 

                            if (userChoice >= 1 && userChoice <= 6) {
                                bobaDrink.setTopping(userChoice);
                            }

                            else if (userChoice == 7) {
                                addToppings = false;
                            }

                            else {
                                System.out.println("You entered an invalid input");
                            }
                            
                            System.out.println("So far you have ordered" + bobaDrink.getTopping() );

                        }
                        boolean addMilk = true; 
                        System.out.println("What kind of milk do you want to add?");
                        while (addMilk) {
                            System.out.println("1. Whole milk\n2. Half and half\n3. Almond milk\n4. Coconut milk\n5. None");
                            userChoice = in.nextInt();

                            if (userChoice >= 1 && userChoice <= 4) {
                                bobaDrink.setMilk(userChoice);
                                addMilk = false;
                            }
                            
                            else if (userChoice == 5) {
                                addMilk = false;
                            }

                            else {
                                System.out.println("You entered an invalid input");
                            }
                        }

                        boolean addSweetness = true;
                        
                        System.out.println("How sweet do you want your drink?");
                        System.out.println("\n1. 1/4 sweet\n2. 1/2 sweet\n3. 3/4 sweet\n4. None");
                        
                        while (addSweetness) {
                            userChoice = in.nextInt();
                            
                            if (userChoice <= 3 && userChoice >= 1) {
                                bobaDrink.setSweet(userChoice);
                                addSweetness = false;

                            }
                            else if (userChoice == 4) {

                                addSweetness = false;
                            }

                            else {
                                System.out.println("You entered an invalid statement");
                            }
                            
                        }
                        //BUYING A BOBA DRINK
                        makeTransaction.addDrinkItem(bobaDrink);
                        makeTransaction.calculateSubtotal();
                       // System.out.println("SUBTOTAL BOBADRINK: " + makeTransaction.getSubtotal());
                        
                    }
                    //ORDERING COFFEE
                    else if (userInput.equals("2")) {
                        boolean addCoffee = true; 
                        System.out.println("Our menu consists of. . .\n1. Pumpkin spice latte\n2. White chocolate frapuccino");
                        
                       
                        while (addCoffee) {
                        	userChoice = in.nextInt();
                            if (userChoice == 1) {
                                coffee.setCoffee(userChoice);
                                addCoffee = false;
                            }

                            else if (userChoice == 2) {
                                coffee.setCoffee(userChoice);
                                addCoffee = false;
                            }

                            else {
                                System.out.println("You entered an invalid input");
                            }
                        }
                        addCoffee = true;
                        System.out.println("What do you want for your base?");
                        System.out.println("\n1. Water\n2. Whole milk\n3. Almond milk");
                        
                        
                        
                        while (addCoffee) {
                        	userChoice = in.nextInt();
                            if (userChoice >= 1 && userChoice <= 3) {
                                coffee.addBase(userChoice);
                                addCoffee = false;
                            }

                            else {
                                System.out.println("You entered an invalid input");
                            }
                        }
                        addCoffee =true; 
                        System.out.println("What size do you want?");
                        System.out.println("1. Small ($2.99)\n2. Medium (3.99)\n3. Large (4.99)");
                        
                        
                        while (addCoffee) {
                        	userChoice = in.nextInt();
                            if (userChoice >= 1 && userChoice <= 3) {
                                coffee.setSize(userChoice);
                                addCoffee = false;
                            }

                            else {
                                System.out.println("You entered an invalid input");
                            }
                        }

                        addCoffee = true;
                        System.out.println("How many teaspoons of sugar do you want in your coffee?");
                        while (addCoffee) {
                            userChoice = in.nextInt();
                            coffee.setSweet(userChoice);
                            addCoffee = false; 

                        }
                        //BUYING COFFEE AND ADDING TO ARRAYLIST
                        makeTransaction.addDrinkItem(coffee);
                        makeTransaction.calculateSubtotal();
                        //System.out.println("SUBTOTAL COFFEE: " + makeTransaction.getSubtotal());
                    }
                    
                    else if (userInput.equals("3")) {
                        buyDrink = false; 
                    }
                    
                    else {
                        System.out.println("You entered an invalid input");
                    }
                }
            }
            //Purchasing a pastry 
            else if (userInput.equals("2")) {
                boolean buyPastry = true; 
                Pastry pastries = new Pastry();
                
                while (buyPastry) {
                    System.out.println("We have these available pastries (Each are 3.99)");
                    System.out.println("1. Cake pops\n2. Crepes\n3. Baklava\n4. Done selecting");
                    userChoice = in.nextInt();
                    if (userChoice >= 1 && userChoice <= 3) {
                        pastries.setPastry(userChoice);

                    }

                    else if (userChoice == 4) {
                        break;
                    }
                    else {
                        System.out.println("You entered an invalid input");
                    }
                    
                    System.out.println("How many " + pastries.getPastry() + " do you want?");
                    userChoice = in.nextInt();
                    pastries.setQuantity(userChoice);

                    System.out.println("Do you want it heated?");
                    System.out.println("\n1. Yes (additional 25 cents)\n2. No");
                    userChoice = in.nextInt();
                    
                    if (userChoice == 1) {
                        System.out.println("Heated");
                        pastries.setHeated(userChoice);
                    }

                    else {
                        System.out.println("Cold");
                        pastries.setHeated(userChoice);
                    }


                }
                //SAVE THIS TO ARRAYLIST
                System.out.println("NUMBER OF PASTRIES: " + pastries.getQuantity());
                makeTransaction.addDessertItem(pastries);
                makeTransaction.calculateSubtotal();
                System.out.println("ADDING PASTRY: " + makeTransaction.getSubtotal());
                System.out.println(pastries);
                
            }
            //Purchasing a cookie
            else if (userInput.equals("3")) {
                boolean buyCookie = true; 
                Cookie cookies = new Cookie();
                
                while (buyCookie) {
                    System.out.println("Each cookie is $1, but a dozen cookies are $8\n");

                    System.out.println("What kind of cookies do you want?\n1. Chocolate Chip\n2. Red velvet");
                    userChoice = in.nextInt();
                    
                    if (userChoice == 1 || userChoice == 2) {
                        cookies.setCookie(userChoice);    
                        buyCookie = false; 
                    }
                    else {
                        System.out.println("You entered an invalid input");
                    }

                    
                }
                buyCookie = true;
                
                while (buyCookie) {
                        System.out.println("How many do you want?");
                        userChoice = in.nextInt();
                        if (userChoice > 0) {
                            cookies.addCookies(userChoice);
                            buyCookie = false;
                        }
                        else {
                            System.out.println("You entered an invalid number");
                        }
                }
                //SAVE THIS TO ARRAYLIST
                makeTransaction.addDessertItem(cookies);
                makeTransaction.calculateSubtotal();
                System.out.println("Cookie subtotal: " + makeTransaction.getSubtotal());

            }
            //BUYING A MACAROON
            else if (userInput.equals("4")) {
                boolean buyMac = true; 
                Macaroon macaroons = new Macaroon();

                while (buyMac) {
                    System.out.println("These are the macaroons we have on sale...\n1. Green tea macaroon"
                     + "\n2. Chocolate macaroon");
                    userChoice = in.nextInt(); 
                    
                    if (userChoice == 1 || userChoice == 2) {
                        macaroons.setMacaroon(userChoice);
                        buyMac = false;
                     }
                    else {
                        System.out.println("You entered an invalid input");
                    }
                }
                

                System.out.println("How many " + macaroons.getDessertName() + "do you want? (Max is 10)");
                
                
                buyMac = true;
                while (buyMac) {
                    userChoice = in.nextInt();
                    if (userChoice <= 10) {
                        macaroons.setQuantity(userChoice);
                        buyMac = false;
                    }
                    
                    else{ 
                        System.out.println("You entered an invalid input");
                    }
                }
                System.out.println(macaroons);
                makeTransaction.addDessertItem(macaroons);
                makeTransaction.calculateSubtotal();

            }
            
            else if (userInput.equals("5")) {
                double userPayment; 
                String customerPayment; 
                makeTransaction.calculateGrandTotal();
                double grandTotal = makeTransaction.getGrandTotal();
                System.out.println("Would you like to use any coupons? (Yes or No)");
                System.out.println("Here is what you ordered:\n" + makeTransaction);
                
                while (grandTotal > 0.01) {
                    
                    System.out.printf("Your grand total is %.2f%n", grandTotal);
                    System.out.println("Please enter a payment");
                    userPayment = in.nextDouble();
                    makeTransaction.takePayment(userPayment);
                    grandTotal = makeTransaction.getGrandTotal();
                }
                System.out.printf("Here is your change %.2f%n", makeTransaction.getChange());
                System.out.println("Here is your receipt");
                System.out.println(makeTransaction);
                makeTransaction.clearRegister();
               
                
            }

            else if (userInput.equals("6")) {
                sale = false;
            }

            else {
                System.out.println("You entered an invalid input");
            }
            
        }

    }
}