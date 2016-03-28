


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ConsoleHelper implements ConsoleInterface
{
    @Override
    public void chooseOperation()
    {
        System.out.println("Выберите операцию:");
        System.out.println("1 - создать пользователя");
        System.out.println("2 - найти пользователя");
        System.out.println("3 - обновить данные пользователя");
        System.out.println("4 - удалить пользователя");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String numberOfOperation;
        while(true)
        {
            try
            {
                numberOfOperation = reader.readLine();
                chosenOperation(Integer.parseInt(numberOfOperation));
                break;
            }
            catch (IOException e)
            {
                System.out.println("Неправильно введена операция, попробуйте снова");
            }
        }
    }

    @Override
    public void chosenOperation(int index)
    {
        CRUD crud = new CRUD();

        if(index == 1)
        {
            String name = enterName();
            System.out.println(name);
            int age = enterAge();
            System.out.println(age);
            int isAdmin = enterIsAdmin();
            crud.createUser(name,age,isAdmin);
        }
      //  else if(index == 2) findAndReadUser();
        else if (index == 3)
        {
            String name = enterName();
            System.out.println(name);
            int id = enterId();
            System.out.println(id);
            int age = enterAge();
            System.out.println(age);
            int isAdmin = enterIsAdmin();
            crud.updateUser(id,name,age,isAdmin);
        }
       // else if (index == 4) deleteUser();
       // else throw new IllegalArgumentException();
    }

    private int enterId()
    {
        int id;
        System.out.println("Enter id for search:");
        Scanner scanner = new Scanner(System.in);
        id = scanner.nextInt();
        return id;
    }


    private String enterName()
    {
        String Name;
        System.out.println("Enter Name:");
        Scanner scanner = new Scanner(System.in);
        Name = scanner.nextLine();
        return Name;
    }

    private int enterAge()
    {
        int age;
        System.out.println("Enter Age:");
        Scanner scanner = new Scanner(System.in);
        age = scanner.nextInt();
        return age;
    }

    private int enterIsAdmin(){
        int isAdmin;
        System.out.println("Enter idAdmin(1-true/0-false):");
        Scanner scanner = new Scanner(System.in);
        while(true)
        {
            try
            {
                isAdmin = scanner.nextInt();
                return isAdmin;
            }
            catch (Exception e)
            {
                System.out.println("Неправильно введена операция, попробуйте снова");
            }
        }
    }

}
