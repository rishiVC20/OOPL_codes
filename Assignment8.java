//Rishikesh Chaudhari
//E11 23304

/*File Handling
Implement a program for maintaining a database of student records using Files. Student has Student_id,name,Roll_no, Class, marks and address. Display the data for few students.
i) Create Database
ii)Display Database
iii) Delete Records
iv) Update Record
v)Search Record */

package OOPL_codes;

import java.io.*;
import java.util.Scanner;

class FileHandling{
    private int n;
    Scanner sc = new Scanner(System.in);
    File file = new File("practical.txt");

    public void createDatabase()
    {
        System.out.print("Enter no of students: ");
        n = sc.nextInt();
        try{
            FileWriter F = new FileWriter(file);
            for (int i=0; i<n; i++){
                String name;
                int marks, rollNo;
                System.out.println("Student " + (i+1));
                System.out.print("Name : ");
                name = sc.next();
                System.out.print("Roll Number : ");
                rollNo = sc.nextInt();
                System.out.print("Marks : ");
                marks = sc.nextInt();

                F.write(name + " " + rollNo + " " + marks + "\n");
            }
            F.close();
            }
            catch(IOException e){
                System.out.println("Error Occurred !!");
            }
    }

    public void displayDatabase() throws IOException
    {
        int i=1;
        BufferedReader reader = new BufferedReader(new FileReader(file));
        String line;
        while ((line=reader.readLine()) != null)
        {
            System.out.println(i + ". " + line);
            i++;
        }
        reader.close();
    }

    public void searchDatabase() throws IOException
    {
        System.out.print("Enter roll number of student to search : ");
        String rollN = sc.next();
        BufferedReader search = new BufferedReader(new FileReader(file));
        String line;
        while ((line=search.readLine()) != null)
        {
            String[] data = line.split("\\s+");
            if (data.length >= 3)
            {
                String name = data[0];
                String roll_no = data[1];
                String marks = data[2];
                if (roll_no.equals(rollN))
                {
                    System.out.println("Student Found ");
                    System.out.println("Name : " + name);
                    System.out.println("Roll number : " + roll_no);
                    System.out.println("Marks : " + marks);
                    return;
                }
            }
        }
        System.out.println("Student Not Found!!");
        search.close();
    }

    public void modifyDatabase() throws IOException
    {
        displayDatabase();
        System.out.print("Enter number of data to modify : ");
        int ch = sc.nextInt();
        File temp = new File("temp.txt");
        BufferedReader modify = new BufferedReader(new FileReader(file));
        FileWriter f = new FileWriter(temp);
        String line;
        int i=0;
        while ((line=modify.readLine()) != null)
        {
            if (i == (ch-1))
            {
                System.out.println("Enter new details");
                System.out.print("Enter name of student : ");
                String name = sc.next();
                System.out.println("Enter roll number of student : ");
                int roll = sc.nextInt();
                System.out.println("Enter marks of student : ");
                int marks = sc.nextInt();
                f.write(name + " " + roll + " " + marks);
            }
            else{
                f.write(line + "\n");
            }
            i++;
        }
        modify.close();
        f.close();
        
        BufferedReader old = new BufferedReader(new FileReader(temp));
        FileWriter w = new FileWriter(file);
        while ((line=old.readLine())!=null)
        {
            w.write(line + "\n");
        }
        old.close();
        w.close();
        temp.delete();
        displayDatabase();
    }

    public void deleteRecord() throws IOException
    {
        displayDatabase();
        System.out.print("Enter the number of record to delete : ");
        int ch = sc.nextInt();
        File temp = new File("temp.txt");
        BufferedReader del = new BufferedReader(new FileReader(file));
        FileWriter f = new FileWriter(temp);
        String line;
        int i=0;
        while ((line=del.readLine()) != null)
        {
            if (i != (ch-1))
            {
                f.write(line + "\n");
            }
            i++;
        }
        f.close();
        del.close();
        BufferedReader red = new BufferedReader(new FileReader(temp));
        FileWriter writer = new FileWriter(file);
        while ((line=red.readLine())!= null)
        {
            writer.write(line + "\n");
        }
        writer.close();
        red.close();
        temp.delete();
        n--;
        System.out.println("Record Deleted successfully!!");
        displayDatabase();
    }

    public void deleteCompleteDatabase() throws IOException
    {
        FileWriter writer = new FileWriter(file);
        writer.write("");
        System.out.println("Database deleted successfully!!");
        writer.close();
    }
}

public class Assignment8 {
    public static void main(String[] args) {
        FileHandling f = new FileHandling();
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        do
        {
            System.out.println("1. Create Database");
            System.out.println("2. Display Database");
            System.out.println("3. Search Database");
            System.out.println("4. Modify Database");
            System.out.println("5. Delete Record");
            System.out.println("6. Delete Database");
            System.out.println("7. Exit");
            System.out.print("Enter your choice : ");
            choice = sc.nextInt();
             System.out.println();
            try
            {
               
                    switch (choice) {
                        case 1 : f.createDatabase();
                                System.out.println();
                                break;

                        case 2 : f.displayDatabase();
                                 System.out.println();
                                break;
                        case 3 : f.searchDatabase();
                                System.out.println();
                                break;
                        case 4 : f.modifyDatabase();
                                System.out.println();
                                break;
                        case 5 : f.deleteRecord();
                                System.out.println();
                                break;
                        case 6 : f.deleteCompleteDatabase();
                                System.out.println();
                                break;
                        case 7 : System.out.println("Exiting the program. Goodbye!");
                                System.out.println();
                                break;
                        default : System.out.println("Invalid choice. Please enter a number between 1 and 6.");     
        
                }
            }
            catch(IOException e){
                System.out.println("Error occurred!!");
            }
        }
        while(choice != 7);
        sc.close();         
    }
}
