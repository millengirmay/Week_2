package Day3;

import java.util.Scanner;

class Position {
    int x;
    public Position(int x){
        this.x = x;
    }
    public void moveForward(){
        this.x++;
}
        }
        class Entity {
    String name;
    char symbol;
    Position position;
    boolean visible;

    Entity(String name, char symbol, Position position){
        this.name = name;
        this.symbol = symbol;
        this.position = position;
    }
    public boolean checkCollision(Entity otherEntity){
        if(otherEntity.position.x == this.position.x){
            this.visible = false;
            return true;
        }
        return false;
    }
        }
        class Hero extends Entity{
    int health;
    Hero(){
        super("Max", '@', new Position(0));
        this.health = 100;
    }
        }
        class Board{
    int size;
    Entity[] entities;

    Board(int size, Entity[] entites){
        this.size = size;
        this.entities = entites;
    }
    void render(){
        for (int x = 0; x < this.size; x++){
            Entity floorTile = new Entity("floor", '.', new Position(x));
            for (Entity e : this.entities){
                if(floorTile.checkCollision(e)){
                    floorTile = e;
                }
            }
            System.out.println(floorTile.symbol);
        }
        System.out.print("\n");
    }
        }
        class Game{
     Board board;
     Entity[] entities;
     String[] messages;
     Scanner scanner;
     Hero hero;
     boolean playing;

     Game(){
         this.hero = new Hero();
         this.entities = new Entity[]{
                 this.hero,
                 new Entity("Zombie", 'Z', new Position(4)),
                 new Entity("Treasure", '$', new Position(7))

         };
         this.board = new Board(8, this.entities);
         this.messages = new String[]{"Enter to push forward."};
         this.scanner = new Scanner(System.in);
     }
     void displayStatus(){
         for(String m : this.messages){
             System.out.println(m);
         }
         this.board.render();
     }
     void play(){
         this.playing = true;
         while(playing){
             displayStatus();
             String input = this.scanner.nextLine();
             updateStatus(input);
         }
     }
     void updateStatus(String input){
         this.hero.position.moveForward();
         for(Entity e: this.entities){
             if(e != this.hero){
                 boolean collided = e.checkCollision(this.hero);
                 if(collided && e.symbol =='$'){
                     this.messages = new String[]{"Treasure collected"};
                     this.playing = false;
                 }
             }
         }
     }
        }
public class Game1 {
    public static void main(String[] args) {
        System.out.println("WELCOME !!!");
        Game game = new Game();
        game.play();
        System.out.println("GAME OVER !!!");
    }

}
