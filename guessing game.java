import java.util.*;
class Main {
    public static void main(String[] args) {
        int gen;
        Random random=new Random();
        gen=random.nextInt(100);
        Scanner sc=new Scanner(System.in);
        int attempts=0;
        char again;
        int score=100;
        while(attempts<5)
        {
            System.out.println("Guess number between 1 and 100: ");
            int guess=sc.nextInt();
            int diff=guess-gen;
            if(guess==gen)
            {
                if(attempts>0)
                {
                    System.out.println("You guessed the number");
                    System.out.println("Score:"+score);
                }
                else if(attempts==0)
                {
                    System.out.println("You guessed the number");
                    System.out.println("Score: 100");
                }
                System.out.println("Play again?(Y/N): ");
                again=sc.next().charAt(0);
                if(again=='y')
                {
                    gen=random.nextInt(100);
                    attempts=0;
                }
                else
                {
                    break;
                }
            }
            else
            {
                if(diff>10)
                {
                    System.out.println("Your guess is too high");
                    score-=15;
                }
                else if(diff<=10&&diff>0)
                {
                    System.out.println("Your guess is little high");
                    score-=5;
                }
                else if(diff>=-10&&diff<0)
                {
                    System.out.println("Your guess is little low");
                    score-=5;
                }
                else if(diff<-10)
                {
                    System.out.println("Your guess is too low");
                    score-=15;
                }
                attempts++;
            }
            if(attempts==5&&guess!=gen)
            {
                System.out.println("Correct number is "+gen);
                System.out.println("Score: 0");
                System.out.println("You couldnot guess the number\nWanna play again?(Y/N): ");
                again=sc.next().charAt(0);
                if(again=='y')
                {
                    attempts=0;
                    gen=random.nextInt(100);
                    score=100;
                }
                else
                {
                    break;
                }
            }
        }
    }
}