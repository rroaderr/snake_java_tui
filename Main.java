
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

        while (dead != true)
        {
            tablero[Ypos] [Xpos] = "Ö";

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
                tablero [Ypos] [Xpos] = "_";
                Ypos = Ypos - 1;
                tablero [Ypos] [Xpos] = "Ö";

            }
            if (movement.toUpperCase().equals("S"))
            {
                tablero [Ypos] [Xpos] = "_";
                Ypos = Ypos + 1;
                tablero [Ypos] [Xpos] = "Ö";

            }
            if (movement.toUpperCase().equals("A"))
            {
                tablero [Ypos] [Xpos] = "_";
                Xpos = Xpos - 1;
                tablero [Ypos] [Xpos] = "Ö";

            }
            if (movement.toUpperCase().equals("D"))
            {
                tablero [Ypos] [Xpos] = "_";
                Xpos = Xpos + 1;
                tablero [Ypos] [Xpos] = "Ö";

            }

        }

        Globals.sc.nextLine(); //Ejemplo para usar scanner, en vez de sc.nextLine es Globals.sc.nextLine()        


    }
    public static void printTablero(String[][] tablero) {

        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                System.out.print(tablero[i][j]);
            }
            System.out.println();
        }        

    }
}
