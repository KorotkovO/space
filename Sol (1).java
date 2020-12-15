package pack;


import java.util.Scanner;


public class Sol {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = 0; // Переменная кол-ва тортов
        int j; //Столько хочет съесть Ионел
        int  p = 2; // Площадь одного торта
        int l = 1; // Счётчик случаев

        System.out.println("Input");
        int x = scan.nextInt(); // размер массива
        int[] a = new int[x]; // наполнение массива

        for (int i = 0; i < x; i++){
            a[i] = scan.nextInt();
        }

        System.out.println(" ");
        System.out.println("Output");
        for (int m = 0; m < x; m++){
            j = a[m];

            do{
                n++;
                //System.out.println("Проверяем, корень ли площадь торта!");
                if (Math.sqrt(j) == (int)Math.sqrt(j)){
                    break;}
                else
                {
                    //System.out.println("Неуспех! Запускаем цикл вычитания!");
                    while(1==1) {
                        //System.out.println("Проверяем ближайшие корни!");
                        if (j < (p * p)) {
                            j = j - ((p - 1) * (p - 1));
                            p = 2;
                            //System.out.println("Частичный успех! Вычитаем из общей площади площадь ближайшего меньшего торта! ");
                            break;
                        } else {
                            //System.out.println("Неуспех! Увеличиваем площадь условного торта!");
                            p=p+1;
                        }
                    }
                    if(j<=0)
                        break;
                }
            }
            while(1==1);

            System.out.println("Case: " + "#" + l++ + ": " + n);
            n = 0;
        }


    }
}
