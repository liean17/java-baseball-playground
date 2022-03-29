import java.util.Scanner;

public class Calculator {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String value = scanner.nextLine();
        int answer = 0;

        String[] values = value.split(" ");

        //숫자 크기만큼의 배열생성
        int[] numbers = new int[((values.length)/2)+1];

        String[] cals = new String[((values.length)/2)];

        //배열만들기 단순화
        makeArray(values, numbers, cals);

        //for switch 중첩으로 계산
        for (int i = 0; i < cals.length; i++) {
            switch (cals[i]){
                case "+" :
                    numbers[i+1] = numbers[i] + numbers[i+1];
                    break;
                case "-" :
                    numbers[i+1] = numbers[i] - numbers[i+1];
                    break;
                case "*" :
                    numbers[i+1] = numbers[i] * numbers[i+1];
                    break;
                case "/" :
                    numbers[i+1] = numbers[i] / numbers[i+1];
                    break;

                }
            }
        answer = numbers[numbers.length-1];

        System.out.println("answer = " + answer);
    }


    private static void makeArray(String[] values, int[] numbers, String[] cals) {
        //배열에 숫자 넣기
        int j = 0;
        for (int i = 0; i < values.length; i = i+2) {
            numbers[j++] += Integer.parseInt(values[i]);
        }
        //배열에 연산자 넣기
        int l = 0;
        for (int k = 1; k < values.length; k = k+2) {
            cals[l++] = values[k];
        }
    }

}
