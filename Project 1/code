/**
 * Creating commands like write undo and redo in order to create
 * my own program to write text
 *
 * @author (Yamaç Özcan) (Did some co-working with moncler 1 and moncler 2)
 * @version (8/10/2026)
 */

import java.util.Scanner;

public class Project1
{
    public static void main(String[] args)
    {
        // These are outside main so run() can access them
        static Scanner input = new Scanner(System.in);
   
        static String text = "";
        static String undo = "";
        static String redo = "";
        System.out.println("Enter commands");

        run();
        run();
        run();
        run();
        run();
        run();
        run();
        run();
   
    // running the method 8 times
    }

    public static void run()
    {
        String cmd = input.next();

        if (cmd.equals("W")) {

            String word = input.next();
            String last = text.substring(text.lastIndexOf(" ") + 1);

            if (word.indexOf("#") != -1) {
                System.out.print("Word cannot contain #. ");
            }
            else if (word.equals(last)) {
                System.out.print("Repeated word not added. ");
            }
            else {
                undo = text + "#" + undo;

                if (text.length() == 0) {
                    text = word;
                }
                else {
                    text = text + " " + word;
                }

                redo = "";
            }
        }

        else if (cmd.equals("U")) {

            if (undo.length() == 0) {
                System.out.print("Nothing to undo. ");
            }
            else {
                redo = text + "#" + redo;

                int i = undo.indexOf("#");

                text = undo.substring(0, i);
                undo = undo.substring(i + 1);
            }
        }

        else if (cmd.equals("R")) {

            if (redo.length() == 0) {
                System.out.print("Nothing to redo. ");
            }
            else {
                undo = text + "#" + undo;

                int i = redo.indexOf("#");

                text = redo.substring(0, i);
                redo = redo.substring(i + 1);
            }
        }

        else {
            System.out.print("Invalid command. ");
        }

        System.out.println("Text: [" + text + "]");
    }
}
