package staticKeyword;

public class Friend {
    String name;
    static int numberFoFriends;
    Friend(String name){
        this.name = name;
        numberFoFriends++;
    }
    static void displayFriends(){
        System.out.println("You have " + numberFoFriends+ " friends.");
    }
}
