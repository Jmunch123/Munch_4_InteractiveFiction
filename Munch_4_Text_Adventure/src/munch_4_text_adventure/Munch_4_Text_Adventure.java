package munch_4_text_adventure;

import java.util.Random;
import java.util.Scanner;
        

public class Munch_4_Text_Adventure {
    
    static String username;
    static int choice;
    static int aftermath;
    static Random random = new Random();
    static int lives = 1;
    static String imput;
     
    public static void main(String[] args) {
    //This while loop is to gain both the endings in the game//
    while(lives > 0){
        YouRememberNow();
    }
    if (lives > 0){
        YouRememberNow();
    }else{ while(lives < 1){
        GameOver();
    
    }
    }
    }
    //Each Method is the advancement in the game, and has each choice that the player is overcoming//
    static void YouRememberNow(){
       Scanner name = new Scanner(System.in);
        Scanner choice = new Scanner(System.in); 
        System.out.println("You wake up in a forest, unaware of your identity or how the hell you even got here, you try to remember your name.");
        username = name.nextLine();
        System.out.println(username + ", as you remember your name you stumble onto your feet and head down a withered down nature trail.");
        System.out.println("as you make your way down the trail you come up to three separate paths leading of deeper in the forest."
                + " The one path to the left seems to lead to a mountain(type Mountain Path)");
        System.out.println(", the path in the middle leads deeper into the forrest(type Middle Path)");
        System.out.println(", the last path toward the right leads to a river(type River Path). ");
        System.out.println(username + ", which path shall you take");
        imput = choice.nextLine();
        if("River Path".equalsIgnoreCase(imput)){
            River();
        }
        if("Mountain Path".equalsIgnoreCase(imput)){
            Mountain();
        }   
        if("Middle Path".equalsIgnoreCase(imput)){
            Cabin();
      
        }
}
    static void River(){
        Scanner choice = new Scanner(System.in);
        System.out.println("You choose to take the path leading of to the river");
        System.out.println(username + ", as you make your way through the woods to the river you see that the current is flowing \n fairly fast that and the bridge is'nt in good condition to carry anything over");
        System.out.println("Which way will you chose? the withered bridge (type Bridge) or wading through the water (type Wading)");
        imput = choice.nextLine();
    if("Wading".equalsIgnoreCase(imput)){
        Downing ();
      }
    if("Bridge".equalsIgnoreCase(imput)){
        CrossingRiver();
    } 
}
  
    static void Mountain(){
        Scanner choice = new Scanner(System.in);
        System.out.println("You choose to make your way to the distant mountain");
        System.out.println(username + ", you shove your way through the thick brush to find an entrance to a tunnel system deep inside the mountain \n but the side of the mountain looks like it could be an easy climb");
        System.out.println("Which way will you choose? Scaling the mountain (type Scaling) or enter the cave dug deep into the mountain (type Cave)");
        imput = choice.nextLine();
    if("Cave".equalsIgnoreCase(imput)){
        Tunnels();
    }
    if("Scaling".equalsIgnoreCase(imput)){
        OntopMountain();
    }
}
    static void Cabin(){
        Scanner choice = new Scanner(System.in);
        System.out.println("You choose to go deeper into the woods");
        System.out.println(username + ", as you go deeper in the woods you spot out some smoke coming from the distance, as you move towards the direction of the smoke you \n see a cabin a few paces away from you. ");
        System.out.println("You scout out the house and you see a front and back door, how will you enter the house (type Front Door) or (type Back Door) to gain entry to the house");
        imput = choice.nextLine();
    if("Back Door".equalsIgnoreCase(imput)){
        InsideHouse();
    }
    if("Front Door".equalsIgnoreCase(imput)){
        Dead();
    }
    }
    static void Downing(){
        Scanner choice = new Scanner(System.in);
        System.out.println("As you make your way through the strong current of the river, you are hit with a blast of force coming upstream knocking you under water \n you try to get above the water but the force is to great you slowly lose \n the strength to move and your vision slowly fades to darkness");
        System.out.println("Game Over");
        System.out.println("");
        System.out.println("Do You Want to Try Again?");
          imput = choice.nextLine();
    if("yes".equalsIgnoreCase(imput)){
        River();
    }
    else if("no".equalsIgnoreCase(imput)){
        GameOver();
    }

    }
    
    static void CrossingRiver(){
        Scanner choice = new Scanner(System.in);
        System.out.println("As you slowly move along the old bridge you here a loud cracking sound as you fall into the river, but you realize that you crossed to the \n other sides shallow area of the river");
        System.out.println("As you make your way out of the water you start to hear th loud rumbling of a motorcicyle, but you also notice that there is an old nature trail that might lead to a campground");
        System.out.println("Which path will you take (type SoundofaMotor) or (type NatureTrail)");
        imput = choice.nextLine();
    if("SoundofaMotor".equalsIgnoreCase(imput) ){
        Highway();
    }
    if("NatureTrail".equalsIgnoreCase(imput)){
        ForestPath();
    }
    }
    static void Tunnels(){
        Scanner choice = new Scanner(System.in);
        System.out.println("You make your way into the deep cavern under the mountain to see two diffrent tunnels branching out to two diffrent paths");
        System.out.println("you here the sound of breathing, maybe a group of miners are still carving tunnels under the mountain to the right tunnel\n, but the other you can feel air flowing from the tunnel to the left");
        System.out.println("Which tunnel will you go in to?(type Left Tunnel) or (Type Right tunnel)");
        imput = choice.nextLine();
    if("Left Tunnel".equalsIgnoreCase(imput)){
        LeftTunnel();
    }
    else if("Right Tunnel".equalsIgnoreCase(imput)){
        RightTunnel();
        
    }else{
        System.out.println("Please type right tunnel or left tunnel");
        Tunnels();
    }
    }
    
    static void OntopMountain(){
        Scanner choice = new Scanner(System.in);
        System.out.println("As you start to climb the large mountain a loud roar of thunder was heard from afar, you start to feel rain pelting at you at high speeds\n, you feel yourself losing your grip on the rocky surface, few seconds later you start plummeting to your death");
        System.out.println("Game Over");
        System.out.println("");
        System.out.println("Do You Want to Try Again?");
        imput = choice.nextLine();
    if("yes".equalsIgnoreCase(imput)){
        Mountain();
    }
    else if("no".equalsIgnoreCase(imput)){
        GameOver();
    }
    }
    static void InsideHouse(){
        Scanner choice = new Scanner(System.in);
        System.out.println("As you slide through the back door of the house, you hear people speaking outloud to each other,\n they may be able to help you, but shall you investigate the basement to make sure these people are friendly?");
        System.out.println("Which do you want to do (type ConfrontPeople) or (type Investigate)");
        imput = choice.nextLine();
    if("ConfrontPeople".equalsIgnoreCase(imput)){
        Eaten();
    }
    else if("Investigate".equalsIgnoreCase(imput)){
        Basement();
    }
    }
    static void Dead(){
        Scanner choice = new Scanner(System.in);
        System.out.println("You walk up to the front door, the door slides open as a couple invite you in to their home, as they close the door you feel a sharp pain in your back\n as you start to see they have tricked you, you slowly blled out on the creaky concret floors of the basement.");
        System.out.println("Game Over");
        System.out.println("");
        System.out.println("Do You Want to Try Again?");
        imput = choice.nextLine();
    if("yes".equalsIgnoreCase(imput)){
        Cabin();
    }
    else if("no".equalsIgnoreCase(imput)){
        GameOver();
    }
        
    }
    static void Basement(){
        Scanner choice = new Scanner(System.in);
        System.out.println("As you slide into the Basement you see several cutlaries and saws with freash blood dipping of the blades, as you slowly back away from the scene someone grabs you and all goes black");
        System.out.println("Game Over");
        System.out.println("");
        System.out.println("Do You Want to Try Again?");
        imput = choice.nextLine();
    if("yes".equalsIgnoreCase(imput)){
        YouRememberNow();
    }
    else if("no".equalsIgnoreCase(imput)){
        GameOver();
    }
    }
    static void Eaten(){
        Scanner choice = new Scanner(System.in);
        System.out.println("As you walk in to greet the seemingly friendly people someone grabs you from behind and everything goes black");
        System.out.println("Game Over");
        System.out.println("");
        System.out.println("Do You Want to Try Again?");
        imput = choice.nextLine();
    if("yes".equalsIgnoreCase(imput)){
        InsideHouse();
    }
    else if("no".equalsIgnoreCase(imput)){
        GameOver();
    }
    }
    static void LeftTunnel(){
       Scanner choice = new Scanner(System.in);
       System.out.println("As you slowly make your way down the left tunnel you fell a rush of fresh air as your greeted to a beautiful over shot of a nearby city");
       System.out.println("You make your way towards the city to see if you could find out your identity and why you are even here");
       Win();
       
    }
    static void RightTunnel(){
       Scanner choice = new Scanner(System.in); 
       System.out.println("As you make your way to the noise you enter a large cavern inside the mountain, you realize that its a bear den! As soon as you realized a bear tackeled you and pinned you on a rock\n as you struggle to break free the bear bites into your shoulder cutting deep into your body\n you die in the matter of seconds after the encounter. ");
       System.out.println("Game Over");
       System.out.println("");
       System.out.println("Do You Want to Try Again?");
       imput = choice.nextLine();
    if("yes".equalsIgnoreCase(imput)){
        Tunnels();
    }
    else if("no".equalsIgnoreCase(imput)){
        GameOver();
    }
    }
    static void Highway(){
       Scanner choice = new Scanner(System.in);  
       System.out.println("As you make your way to the motorized noise you find yourself on a highway as soon as you are on the highway you are hit by a car and you black out\n about a week later you wake up in the city hospital full of questions about your identity and how did you find yourself in the forest");
       Win();
    }
    static void ForestPath(){
       Scanner choice = new Scanner(System.in);
       System.out.println("As you make your way following the withered nature trail you here a loud howl, all of a sudden a pack of wolves surround you and start eating you alive");
       System.out.println("Game Over");
       System.out.println("");
       System.out.println("Do You Want to Try Again?");
       imput = choice.nextLine();
    if("yes".equalsIgnoreCase(imput)){
        CrossingRiver();
    }
    else if("no".equalsIgnoreCase(imput)){
        GameOver();
    }
        
    }
    static void GameOver(){
        System.out.println("Thank You for Playing my first ever game I hope you enjoyed it Good Bye");
        System.exit(0);
        
    }
    static void Win(){
        Scanner choice = new Scanner(System.in); 
        System.out.println("Bravo you successfully made your way through the forrest, but there are two endings if you have only gained one ending then go back and try again");
        imput = choice.nextLine();
    if("yes".equalsIgnoreCase(imput)){
        lives = -1;
    }    
    else if("no".equalsIgnoreCase(imput)){
        lives = 1;
    }
        
    }
}
   
  