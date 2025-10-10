
public class Main {
    public static void main(String[] args) {
        String[][] tablero = new String [17][27];

        tablero[0]  = new String[] {"#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#"};
        tablero[1]  = new String[] {"#", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "#"};
        tablero[2]  = new String[] {"#", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "#"};
        tablero[3]  = new String[] {"#", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "#"};
        tablero[4]  = new String[] {"#", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "#"};
        tablero[5]  = new String[] {"#", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "#"};
        tablero[6]  = new String[] {"#", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "#"};
        tablero[7]  = new String[] {"#", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "#"};
        tablero[8]  = new String[] {"#", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "#"};
        tablero[9]  = new String[] {"#", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "#"};
        tablero[10] = new String[] {"#", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "#"};
        tablero[11] = new String[] {"#", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "#"};
        tablero[12] = new String[] {"#", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "#"};
        tablero[13] = new String[] {"#", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "#"};
        tablero[14] = new String[] {"#", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "#"};
        tablero[15] = new String[] {"#", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "#"};
        tablero[16] = new String[] {"#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#"};

        int Xpos = 13;
        int Ypos = 7;
        boolean dead = false;
        boolean food = false;
        int Yfood;
        int Xfood;
        int score = 1;

        while (dead != true)
        {
            tablero[Ypos] [Xpos] = "Ö";
            
            while (food == false)
            {
                do
                {
                    Yfood = YposFood();
                    Xfood = XposFood();
                } 
                while (tablero[Yfood][Xfood] == "Ö");

                tablero[Yfood][Xfood] = "*";
                food = true;
            }
           
            
           
            printTablero(tablero);

            String movement = "0";

            while (!(movement.toUpperCase().equals("W") ||
                     movement.toUpperCase().equals("A") ||
                     movement.toUpperCase().equals("S") ||
                     movement.toUpperCase().equals("D"))) 
            {

                System.out.println("Move with WASD:");
                movement = Globals.sc.nextLine();

                if (!(movement.toUpperCase().equals("W") ||
                     movement.toUpperCase().equals("A") ||
                     movement.toUpperCase().equals("S") ||
                     movement.toUpperCase().equals("D"))) {
                     System.out.println("Use W, A, S, or D");
                }
            }
            
            if (movement.toUpperCase().equals("W"))
            {
                tablero[Ypos][Xpos] = "_";
                Ypos = Ypos - 1;
                if (tablero[Ypos][Xpos].equals("*"))
                {
                    score++;
                    food = false;
                }

                if (tablero[Ypos][Xpos].equals("#")) dead = true;

                tablero[Ypos][Xpos] = "Ö";

            }
            if (movement.toUpperCase().equals("S"))
            {
                tablero[Ypos][Xpos] = "_";
                Ypos = Ypos + 1;
                if (tablero[Ypos][Xpos].equals("*"))
                {
                    score++;
                    food = false;
                }

                if (tablero[Ypos][Xpos].equals("#")) dead = true;

                tablero[Ypos][Xpos] = "Ö";

            }
            if (movement.toUpperCase().equals("A"))
            {
                tablero [Ypos][Xpos] = "_";
                Xpos = Xpos - 1;
                if (tablero[Ypos][Xpos].equals("*"))
                {
                    score++;
                    food = false;
                }

                if (tablero[Ypos][Xpos].equals("#")) dead = true;

                tablero [Ypos][Xpos] = "Ö";

            }
            if (movement.toUpperCase().equals("D"))
            {
                tablero [Ypos][Xpos] = "_";
                
                Xpos = Xpos + 1;
                if (tablero[Ypos][Xpos].equals("*"))
                {
                    score++;
                    food = false;
                }

                if (tablero[Ypos][Xpos].equals("#")) dead = true;

                tablero [Ypos][Xpos] = "Ö";

            }

        }

        System.out.println("You died");      
        System.out.println("score: " + score);

    }

 public static void printTablero(String[][] tablero) {

        final String RESET = "\u001B[0m";
        final String GREEN = "\u001B[32m"; // Snake
        final String RED   = "\u001B[31m"; // Food
        final String GREY  = "\u001B[90m"; // Background
        final String WHITE = "\u001B[37m"; // Walls

        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                String cell = tablero[i][j];

                if (cell.equals("Ö")) { // Snake
                    System.out.print(GREEN + "Ö" + RESET);
                } else if (cell.equals("*")) { // Food
                    System.out.print(RED + "*" + RESET);
                } else if (cell.equals("_")) { // Background
                    System.out.print(GREY + "_" + RESET);
                } else if (cell.equals("#")) { // Walls
                    System.out.print(WHITE + "#" + RESET);
                } else {
                    System.out.print(cell);
                }
            }
            System.out.println();
        }
    }

    public static int XposFood()
    {
        int Xfood = (int)(Math.random() * 25 + 1);
        return(Xfood);
    }

    public static int YposFood()
    {
        int Yfood = (int)(Math.random() * 15 + 1);
        return(Yfood);
    }
}
