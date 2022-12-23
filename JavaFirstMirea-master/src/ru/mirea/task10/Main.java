package ru.mirea.task10;

import java.util.Scanner;

class Main {
    public void rec(int k, int s){
        int res = 0;
        double i = Math.pow(10,k-1);
        while (i < Math.pow(10,k)){
            if(recursion(i,0) == s){
                res+=1;
            };
            i++;
        }
        System.out.print(res);
    }
    public double recursion(double k, double sum){
        double num = k % 10;
        sum += num;
        double nom = k / 10;
        if(nom > 0) {
            recursion(nom, sum);
        }
        return sum;
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
