package com.hhf.exceltest2.test;

public class Sum {
    public static void main(String[] args) {
        int n = 12398897;
        int sum = 0;
        String number = "";
        //sum求各位数和
        for (int i = n; i != 0; i/=10) {
            sum = sum + i%10;

        }
        //System.out.println(sum);

        for (int j = sum ;j!=0;j/=10){
            //temp每次除十取位
            int temp = sum;
            if(sum > 10)
                 temp = sum / 10;
            sum = sum % 10;
            //System.out.println("temp = " + temp);

            switch (temp){
                case 0:
                    number = number + "ling"+" ";
                    break;
                case 1:
                    number = number + "yi"+" ";

                    break;
                case 2:
                    number = number + "er"+" ";

                    break;

                case 3:
                    number = number + "san"+" ";

                    break;

                case 4:
                    number = number + "si"+ " ";

                    break;
                case 5:
                    number = number + "wu "+" ";

                    break;
                case 6:
                    number = number + "liu "+" ";

                    break;
                case 7:
                    number = number + "qi "+" ";

                    break;
                case 8:
                    number = number + "ba "+" ";

                    break;
                case 9:
                    number = number + "jiu "+" ";

                    break;
                default:
                    break;
            }

        }

        System.out.println(number);



    }
}
