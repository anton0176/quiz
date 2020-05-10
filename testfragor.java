package quiz;

import java.util.Scanner;

public class testfragor {

    public static void main(String[] args){

        String fraga1="Vilken bilmärke är bäst\n" + "(a)volvo/\n(b)BMW\n(c)Audi\n";

        String fraga2="Vilken dricka är bäst\n" + "(a)Fanta/\n(b)Sprite\n(c)Cola\n";

        testquiz [] questions = {
                new testquiz(fraga1, "a"),
                new testquiz(fraga2, "c")

        };

        Test(questions);


        }

        public static void Test(testquiz[] question){
        int score = 0;
            Scanner Input = new Scanner(System.in);
        for(int i = 0; i < question.length; i++){
            System.out.println(question[i].fraga);
            String svar = Input.nextLine();
            if(svar.equals(question[i].svar)){
                score++;

            }



        }
            System.out.println("du fick" + score);

        }



    }

