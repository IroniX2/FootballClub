public class Main {

    public static void main(String[] args)
    {
        Menu mainMenu = new Menu();

        //testing
        LinkedListTest list = new LinkedListTest();
        list.add(new Player ("s", "ds", "da", 3));
        list.add(new Player ("4", "ds", "da", 3));
        list.add(new Player ("5", "ds", "da", 3));
        list.add(new Player ("6", "ds", "da", 3));
        list.add(new Player ("7", "ds", "da", 3));

        list.add(new Player ("s", "dasdasdad", "da", 5), 3);



        //testing end

        //Populate the LinkedLists from a text file here?
        mainMenu.display(list);
        list.printList();
        //Save the LinkedList contents to file here?
    }
}
