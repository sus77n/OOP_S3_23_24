/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package cse203.lab3;

import java.util.Scanner;

/**
 *
 * @author haing
 */
public class Lab3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ManageCD mCD = new ManageCD();
        System.out.println("Input number of CDs: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            mCD.AddCD();
        }
        int command ;
        do{
            System.out.println("1. Add CD (ArrayList)\n"
                    + "2. Search CD by CD title\n"
                    + "3. Search CDs by collection (game/movie/music)\n"
                    + "4. Search CDs by type (audio/video)\n"
                    + "5. Delete CD by CD Id\n"
                    + "6. Edit CD information by Id\n"
                    + "7. Display all CDs\n"
                    + "8. Sort the CD list ascending by year of release\n"
                    + "9. Exit \n"
                    + "Enter your command: ");
            command = sc.nextInt();
            switch (command) {
                case 1:
                    mCD.AddCD();
                    break;
                case 2:
                    mCD.SearchByTitle();
                    break;
                case 3:
                    mCD.SearchByCollection();
                    break;
                case 4:
                    mCD.SearchByType();
                    break;
                case 5:
                    mCD.Delete();
                    break;
                case 6:
                    mCD.Edit();
                    break;
                case 7:
                    mCD.DisplayAll();
                    break;
                case 8:
                    mCD.sortCD();
                    break;
            }
        } while(command!=9);
    }
}
