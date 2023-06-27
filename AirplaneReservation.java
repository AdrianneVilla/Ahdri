/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package airplanereservation;

import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author Adrianne Villa
 */
public class AirplaneReservation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        char[][] seats = new char[3][18];
        int ecplus = 6;
        int eco = 44;
        Arrays.fill(seats[0], 'A');
        Arrays.fill(seats[1], 'A');
        Arrays.fill(seats[2], 'A');
        while (eco > 0 && ecplus >0) {

        

        System.out.println("                          ************************* AIRLINE RESERVATION SYSTEM************************");
        System.out.println("");
        System.out.println("                     Seats Availability: Economy Plus =" + ecplus + " " + "Economy = " + eco);
        System.out.println("");
        System.out.println("                1       2       3       4       5       6       7       8       9      10      11      18      19      20      21      22      23      24");
        System.out.println("  ---------------------------------------------------------------------------------------------------------------------------------------------------------------------");

        for (int a = 0; a < 3; a++) {
            if (a == 0) {
                System.out.print("    D   |" + " ");

            } else if (a == 1) {
                System.out.print("    C   |" + " ");
            } else {
                System.out.print("    A   |" + " ");
            }

            for (int b = 0; b < 18; b++) {
                seats [0][0] = 'N';
                seats [0][1] = 'N';
                seats [1][0] = 'N';
                seats [1][1] = 'N';
                System.out.print(seats[a][b] + "   ");
            }
            if (a == 0) {
                System.out.print("|   D");
            } else if (a == 1) {
                System.out.print("|   C");
            } else {
                System.out.print("|   A");

            }
            System.out.println(" ");
        }
        System.out.println("  -------------------------------------------------------------------------------------------------------------------------------------------------------------------_-");
        System.out.println("");
        System.out.println("      Legend: A = Available  O = Occupied  N = Not Applicable");
        System.out.println("**************************************************************************************************************************************************************************");
        System.out.println(" ");
        System.out.println("Reservation System Menu");
        System.out.println("[1] Economy Plus");
        System.out.println("[2] Economy");
        System.out.println("");
        System.out.print("Type chosen menu: ");
        String menu = scn.next();

        if (menu.equalsIgnoreCase("1")) {
            System.out.println("***************************ENTER PASSENGER DETAILS**************************");
            System.out.println("SEAT TYPE: ECONOMY PLUS");
            System.out.println("");
            System.out.print("Enter Booking Number       :");
            String ebn = scn.next();
            System.out.print("Enter Passengers Last Name :");
            String epln = scn.next();
            System.out.print("Enter Passengers First Name:");
            String epfn = scn.next();
            System.out.println("****************************************************************************");
            System.out.println("");
            System.out.println("Economy Plus Seat Assignment");
            System.out.println("[1] Random Pick");
            System.out.println("[2] Manual Pick");
            System.out.println("");
            System.out.println("Enter Chosen Menu: ");
            int ecm = scn.nextInt();
            if (ecm == 2) {
                System.out.println("----------- Manual Pick-------------");
                System.out.print("Enter Row [A, C, D] : ");
                String er = scn.next();
                System.out.print("Enter Column [1, 3, 18] : ");
                int ec = scn.nextInt();
                if (er.equalsIgnoreCase("A")) {
                    switch (ec) {
                        case 1:
                            if (seats[2][0] == 'A') {
                                ecplus--;
                                seats[2][0] = 'O';
                                System.out.println("--------------------------------BOARDING PASS-------------------------------");
                                System.out.println("");
                                System.out.println("SEAT TYPE   : ECONOMY PLUS");
                                System.out.println("SEAT NUMBER : " + er.toUpperCase() + ec);
                                System.out.println("");
                                System.out.println("Enter Booking Number     : " + ebn.toUpperCase());
                                System.out.println("Enter Passengers Last Name    :" + epln.toUpperCase());
                                System.out.println("Enter Paseengers First Name    :" + epfn.toUpperCase());
                                System.out.println("  ************************* AIRLINE RESERVATION SYSTEM************************");
                                System.out.println("");
                                System.out.println("                  Seats Availability: Economy Plus =" + ecplus + " " + "Economy = " + eco);
                                System.out.println("");
                                System.out.println("                1       2       3       4       5       6       7       8       9      10      11      18      19      20      21      22      23      24");
                                System.out.println("  ---------------------------------------------------------------------------------------------------------------------------------------------------------------------");

                                for (int a = 0; a < 3; a++) {
                                    if (a == 0) {
                                        System.out.print("    D   |" + "\t");

                                    } else if (a == 1) {
                                        System.out.print("    C   |" + "\t");
                                    } else {
                                        System.out.print("    A   |" + "\t");
                                    }

                                    for (int b = 0; b < 18; b++) {
                                        System.out.print(seats[a][b] + "\t");
                                    }
                                    if (a == 0) {
                                        System.out.print("|   D");
                                    } else if (a == 1) {
                                        System.out.print("|   C");
                                    } else {
                                        System.out.print("|   A");

                                    }
                                    System.out.println(" ");
                                }
                                System.out.println("  -------------------------------------------------------------------------------------------------------------------------------------------------------------------_-");
                                break;
                            }

                        case 18:
                            if (seats[2][11] == 'A') {
                                ecplus--;
                                seats[2][11] = 'O';
                                System.out.println("--------------------------------BOARDING PASS-------------------------------");
                                System.out.println("");
                                System.out.println("SEAT TYPE   : ECONOMY PLUS");
                                System.out.println("SEAT NUMBER : " + er.toUpperCase() + ec);
                                System.out.println("");
                                System.out.println("Enter Booking Number     : " + ebn.toUpperCase());
                                System.out.println("Enter Passengers Last Name    :" + epln.toUpperCase());
                                System.out.println("Enter Paseengers First Name    :" + epfn.toUpperCase());
                                System.out.println("  ************************* AIRLINE RESERVATION SYSTEM************************");
                                System.out.println("");
                                System.out.println("                  Seats Availability: Economy Plus =" + ecplus + " " + "Economy = " + eco);
                                System.out.println("");
                                System.out.println("                1       2       3       4       5       6       7       8       9      10      11      18      19      20      21      22      23      24");
                                System.out.println("  ---------------------------------------------------------------------------------------------------------------------------------------------------------------------");

                                for (int a = 0; a < 3; a++) {
                                    if (a == 0) {
                                        System.out.print("    D   |" + "\t");

                                    } else if (a == 1) {
                                        System.out.print("    C   |" + "\t");
                                    } else {
                                        System.out.print("    A   |" + "\t");
                                    }

                                    for (int b = 0; b < 18; b++) {
                                        System.out.print(seats[a][b] + "\t");
                                    }
                                    if (a == 0) {
                                        System.out.print("|   D");
                                    } else if (a == 1) {
                                        System.out.print("|   C");
                                    } else {
                                        System.out.print("|   A");

                                    }
                                    System.out.println(" ");
                                }
                                System.out.println("  -------------------------------------------------------------------------------------------------------------------------------------------------------------------_-");
                                break;
                            }
                    }

                } else if (er.equalsIgnoreCase("C")) {
                    switch (ec) {
                        case 3:
                            if (seats[1][2] == 'A') {
                                ecplus--;
                                seats[1][2] = 'O';
                                System.out.println("--------------------------------BOARDING PASS-------------------------------");
                                System.out.println("");
                                System.out.println("SEAT TYPE   : ECONOMY PLUS");
                                System.out.println("SEAT NUMBER : " + er.toUpperCase() + ec);
                                System.out.println("");
                                System.out.println("Enter Booking Number     : " + ebn.toUpperCase());
                                System.out.println("Enter Passengers Last Name    :" + epln.toUpperCase());
                                System.out.println("Enter Paseengers First Name    :" + epfn.toUpperCase());
                                System.out.println("");
                                System.out.println("                                    ************************* AIRLINE RESERVATION SYSTEM************************");
                                System.out.println("");     
                                System.out.println("                            Seats Availability: Economy Plus =" + ecplus + " " + "Economy = " + eco);
                                System.out.println("");
                                System.out.println("                1       2       3       4       5       6       7       8       9      10      11      18      19      20      21      22      23      24");
                                System.out.println("  ---------------------------------------------------------------------------------------------------------------------------------------------------------------------");

                                for (int a = 0; a < 3; a++) {
                                    if (a == 0) {
                                        System.out.print("    D   |" + "\t");

                                    } else if (a == 1) {
                                        System.out.print("    C   |" + "\t");
                                    } else {
                                        System.out.print("    A   |" + "\t");
                                    }

                                    for (int b = 0; b < 18; b++) {
                                        System.out.print(seats[a][b] + "\t");
                                    }
                                    if (a == 0) {
                                        System.out.print("|   D");
                                    } else if (a == 1) {
                                        System.out.print("|   C");
                                    } else {
                                        System.out.print("|   A");

                                    }
                                    System.out.println(" ");
                                }
                                System.out.println("  -------------------------------------------------------------------------------------------------------------------------------------------------------------------_-");
                                break;
                            }
                        case 18:
                            if (seats[1][11] == 'A') {
                                ecplus--;
                                seats[1][11] = 'O';
                                System.out.println("--------------------------------BOARDING PASS-------------------------------");
                                System.out.println("");
                                System.out.println("SEAT TYPE   : ECONOMY PLUS");
                                System.out.println("SEAT NUMBER : " + er.toUpperCase() + ec);
                                System.out.println("");
                                System.out.println("Enter Booking Number     : " + ebn.toUpperCase());
                                System.out.println("Enter Passengers Last Name    :" + epln.toUpperCase());
                                System.out.println("Enter Paseengers First Name    :" + epfn.toUpperCase());
                                System.out.println("");
                                System.out.println("                                       ************************* AIRLINE RESERVATION SYSTEM************************");
                                System.out.println("");
                                System.out.println("                         Seats Availability: Economy Plus =" + ecplus + " " + "Economy = " + eco);
                                System.out.println(""); 
                                System.out.println("                1       2       3       4       5       6       7       8       9      10      11      18      19      20      21      22      23      24");
                                System.out.println("  ---------------------------------------------------------------------------------------------------------------------------------------------------------------------");

                                for (int a = 0; a < 3; a++) {
                                    if (a == 0) {
                                        System.out.print("    D   |" + "\t");

                                    } else if (a == 1) {
                                        System.out.print("    C   |" + "\t");
                                    } else {
                                        System.out.print("    A   |" + "\t");
                                    }

                                    for (int b = 0; b < 18; b++) {
                                        System.out.print(seats[a][b] + "\t");
                                    }
                                    if (a == 0) {
                                        System.out.print("|   D");
                                    } else if (a == 1) {
                                        System.out.print("|   C");
                                    } else {
                                        System.out.print("|   A");

                                    }
                                    System.out.println(" ");
                                }
                                System.out.println("  -------------------------------------------------------------------------------------------------------------------------------------------------------------------_-");
                                break;
                            }

                    }

                } else if (er.equalsIgnoreCase("D")) {
                    switch (ec) {
                        case 3:
                            if (seats[0][2] == 'A') {
                                ecplus--;
                                seats[0][2] = 'O';
                                System.out.println("--------------------------------BOARDING PASS-------------------------------");
                                System.out.println("");
                                System.out.println("SEAT TYPE   : ECONOMY PLUS");
                                System.out.println("SEAT NUMBER : " + er.toUpperCase() + ec);
                                System.out.println("");
                                System.out.println("Enter Booking Numb System.out.println(\"--------------------------------BOARDING PASS-------------------------------\");\n" +
"                                Systeer     : " + ebn.toUpperCase());
                                System.out.println("Enter Passengers Last Name    :" + epln.toUpperCase());
                                System.out.println("Enter Paseengers First Name    :" + epfn.toUpperCase());
                                System.out.println("");
                                System.out.println("                                     ************************* AIRLINE RESERVATION SYSTEM************************");
                                System.out.println("");
                                System.out.println("                             Seats Availability: Economy Plus =" + ecplus + " " + "Economy = " + eco);
                                System.out.println("");
                                System.out.println("                1       2       3       4       5       6       7       8       9      10      11      18      19      20      21      22      23      24");
                                System.out.println("  ---------------------------------------------------------------------------------------------------------------------------------------------------------------------");

                                for (int a = 0; a < 3; a++) {
                                    if (a == 0) {
                                        System.out.print("    D   |" + "\t");

                                    } else if (a == 1) {
                                        System.out.print("    C   |" + "\t");
                                    } else {
                                        System.out.print("    A   |" + "\t");
                                    }

                                    for (int b = 0; b < 18; b++) {
                                        System.out.print(seats[a][b] + "\t");
                                    }
                                    if (a == 0) {
                                        System.out.print("|   D");
                                    } else if (a == 1) {
                                        System.out.print("|   C");
                                    } else {
                                        System.out.print("|   A");

                                    }
                                    System.out.println(" ");
                                }
                                System.out.println("  -------------------------------------------------------------------------------------------------------------------------------------------------------------------_-");
                                break;
                                
                                
                            }
                        case 18:
                            if (seats[0][11] == 'A') {
                                ecplus--;
                                seats[10][11] = 'O';
                                System.out.println("--------------------------------BOARDING PASS-------------------------------");
                                System.out.println("");
                                System.out.println("SEAT TYPE   : ECONOMY PLUS");
                                System.out.println("SEAT NUMBER : " + er.toUpperCase() + ec);
                                System.out.println("");
                                System.out.println("Enter Booking Number     : " + ebn.toUpperCase());
                                System.out.println("Enter Passengers Last Name    :" + epln.toUpperCase());
                                System.out.println("Enter Paseengers First Name    :" + epfn.toUpperCase());
                                System.out.println("");
                                System.out.println("  ************************* AIRLINE RESERVATION SYSTEM************************");
                                System.out.println("");
                                System.out.println("                  Seats Availability: Economy Plus =" + ecplus + " " + "Economy = " + eco);
                                System.out.println("");
                                System.out.println("                1       2       3       4       5       6       7       8       9      10      11      18      19      20      21      22      23      24");
                                System.out.println("  ---------------------------------------------------------------------------------------------------------------------------------------------------------------------");

                                for (int a = 0; a < 3; a++) {
                                    if (a == 0) {
                                        System.out.print("    D   |" + "\t");

                                    } else if (a == 1) {
                                        System.out.print("    C   |" + "\t");
                                    } else {
                                        System.out.print("    A   |" + "\t");
                                    }

                                    for (int b = 0; b < 18; b++) {
                                        System.out.print(seats[a][b] + "\t");
                                    }
                                    if (a == 0) {
                                        System.out.print("|   D");
                                    } else if (a == 1) {
                                        System.out.print("|   C");
                                    } else {
                                        System.out.print("|   A");

                                    }
                                    System.out.println(" ");
                                }
                                System.out.println("  -------------------------------------------------------------------------------------------------------------------------------------------------------------------_-");
                                break;
                            }
                            
                    }
                }
            }
        } else if (menu.equalsIgnoreCase("2")) {
            
            

        }
    }
}
}
