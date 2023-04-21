package clgprogramspracs;

import java.util.Scanner;

public class LoadBalance {
    static void printLoad(int servers , int processes) {
        
        int each = processes / servers;
        int extra = processes % servers;
System.out.println(each+"  "+extra);
System.out.println("Servers :"+servers+" Process  "+processes);
        // int total  = 0;
        int i = 0;
int j =i;
        for (i = 0; i < extra; i++)
        {  System.out.println("Server " + (i + 1) + " has " + (each + 1) + "processes");
        j=i+1;
        }
// 4 +4+3+3+3
        for (i = 0; i < servers-extra; i++)
        {   System.out.println("Server " + (j+1) + " has " + (each) + "processes");
        j++;}
    }


    static void menu() {
        System.out.println("1. Add Server ");
        System.out.println("2. Remove Server ");
        System.out.println("3. Add Processes ");
        System.out.println("4. Remove Processes ");
        System.out.println(". Exit ");
    }


public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Enter number of servers : ");
        int servers = console.nextInt();
        System.out.println("Enter number of processes : ");
        int processes = console. nextInt();
        
        while (true) {
        
            printLoad(servers, processes);
            menu();
        
            System.out.print("> ");
            int choice = console.nextInt();
            int temp; 
            switch (choice) {
        
               case 1:
                   System.out.println("How many more servers to add ?");
                   temp = console.nextInt();
                   servers += temp;
                   break;
        
                case 2:
                    System.out.println("How magny more severs to remove");
                    temp = console.nextInt();
                    servers -= temp;
                    break;
        
                case 3:
                    System.out.println("How many processes to add ?");
                    temp = console.nextInt();
                    processes += temp;
                    break;
        
                case 4:
                    System.out.println("How many processes to remove");
                    temp = console.nextInt();
                    processes -= temp;
                    break;
        
                case 5:
                    console.close();
                    return;
    
            }
        }    
   }
}    