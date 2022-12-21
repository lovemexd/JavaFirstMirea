package ru.mirea.task10;

import java.util.Scanner;

class Main {
    public void rec(int k, int s){
        int res = 0;
        double i = Math.pow(10,k-1);
        while (i < Math.pow(10,k)){
            int sum = 0;
            double num = i;
            while(num > 0){
                sum += num % 10;
                num /= 10;
            }
            if(sum == s){
                res +=1 ;
            }
            i++;
        }
        System.out.print(res);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число n: ");
        int n = sc.nextInt();
        System.out.print("\nВсе числа от 1 до n: \n");
        for (int i = 1; i<=n;i++){
            System.out.println(i);
        }
        System.out.print("\nВведите число A: ");
        int A = sc.nextInt();
        System.out.print("\nВведите число B: ");
        int B = sc.nextInt();
        System.out.print("\nВсе числа от A до B: \n");
        if(A > B) {
            for (int i= B;i<=A;i++){
                System.out.println(i);
            }
        }else {
            for (int i= A;i<=B;i++){
                System.out.println(i);
            }
        }
        System.out.print("\nВведите число K: ");
        int K = sc.nextInt();
        System.out.print("\nВведите число S: ");
        int S = sc.nextInt();
        System.out.print("\nКоличество K-значных натуральных чисел, сумма цифр которых равна S: ");
        Main obj = new Main();
        obj.rec(K,S);

    }
}
