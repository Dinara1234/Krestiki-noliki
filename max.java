import java.util.Scanner;

public class max {
    public static void writeArray(int[] arr){
        for(int i = 0; i <= arr.length - 1; i++){
            if (i%3==2){
                System.out.print(arr[i]+ "\n" + "-----" + "\n");}
            else{System.out.print(arr[i]+"|");}
        }
    }

    public static boolean isFinished(int[] arr){
        if ((arr[0] == arr[1] && arr[2] == arr[1] && arr[0] !=0) || (arr[3] == arr[4] && arr[5] == arr[4] && arr[4] !=0) || (arr[6] == arr[7] && arr[8] == arr[7] && arr[7] !=0)){
            System.out.println("GAME OVER");
            return true;

        }
        if ((arr[0] == arr[3] && arr[6] == arr[3] && arr[3] !=0) || (arr[1] == arr[4] && arr[7] == arr[4] && arr[4] !=0) || (arr[2] == arr[5] && arr[8] == arr[5] && arr[5] !=0)){
            System.out.println("GAME OVER");
            return true;

        }
        if ((arr[0] == arr[4] && arr[8] == arr[4] && arr[4] !=0) || (arr[2] == arr[4] && arr[6] == arr[4] && arr[4] !=0)){
            System.out.println("GAME OVER");
            return true;

        }
        return false;
    }

    public static void writeField(int[] arr){
        for(int i = 0; i <= arr.length - 1; i++){
            if(arr[i] == 0){
                if (i%3==2){
                System.out.print(" "+ "\n" + "-----" + "\n");}
                else{System.out.print(" |");}

            }
            if (arr[i] == 1) {
                if (i%3==2){
                    System.out.print("O"+ "\n" + "-----" + "\n");}
                else{System.out.print("O|");}


            }
            if (arr[i] == 2) {
                if (i%3==2){
                    System.out.print("X"+ "\n" + "-----" + "\n");}
                else{System.out.print("X|");}

            }

        }
        isFinished(arr);

    }
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int[] arr = {0, 0, 0, 0, 0, 0, 0, 0, 0};
        int[] start_field = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("Привет!) Поиграем в крестики  нолики?" + "\n" + "Крестики ходят первыми. Чтобы поставить крестик, введи номер клетки, куда ты ставишь крестик" + "\n" + "Вот номера клеток:" );
        writeArray(start_field);


int i = 1;
        while (!(isFinished(arr))){
            if (i%2==1){
                System.out.println("Куда хотите поставить О");
                int pos = in.nextInt();
                arr[pos-1] = 1;
                writeField(arr);
                i++;
            }
            else{
                System.out.println("Куда хотите поставить X");
                int pos = in.nextInt();
                arr[pos-1] = 2;
                writeField(arr);
                i++;

            }
        }
    }
}