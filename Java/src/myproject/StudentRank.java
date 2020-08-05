package myproject;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Student {
    private int stdNo;
    private int midtermMath;
    private int midtermEnglish;
    private int midtermKorean;

    private int finalsMath;
    private int finalsEnglish;
    private int finalsKorean;

    public void setStdNo(int stdNo) {
        this.stdNo = stdNo;
    }

    public void setMidtermEnglish(int midtermEnglish) {
        this.midtermEnglish = midtermEnglish;
    }

    public void setMidtermKorean(int midtermKorean) {
        this.midtermKorean = midtermKorean;
    }

    public void setMidtermMath(int midtermMath) {
        this.midtermMath = midtermMath;
    }

    public void setFinalsEnglish(int finalsEnglish) {
        this.finalsEnglish = finalsEnglish;
    }

    public void setFinalsKorean(int finalsKorean) {
        this.finalsKorean = finalsKorean;
    }

    public void setFinalsMath(int finalsMath) {
        this.finalsMath = finalsMath;
    }


    public int getStdNo() {
        return stdNo;
    }

    public int getMidtermEnglish() {
        return midtermEnglish;
    }

    public int getMidtermKorean() {
        return midtermKorean;
    }

    public int getMidtermMath() {
        return midtermMath;
    }

    public int getFinalsEnglish() {
        return finalsEnglish;
    }

    public int getFinalsKorean() {
        return finalsKorean;
    }

    public int getFinalsMath() {
        return finalsMath;
    }

    public int getMidtermAverage() {
        return (midtermEnglish + midtermKorean + midtermMath) / 3;
    }

    public int getFinalsAverage() {
        return (finalsEnglish + finalsKorean + finalsMath) / 3;
    } // 사용 안함

    public int getSemesterAverage() {
        return (getMidtermAverage() + getFinalsAverage()) / 2; //사용 안함
    }
}

public class StudentRank {

    static Student[] stdArr = new Student[30];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cnt = 0;
        try {
            while (true) {
                System.out.println("1 : 점수 입력, 2 : 출력 및 종료");
                int input = scanner.nextInt();
                if (input == 1) {
                    System.out.print("학번을 입력해주세요: ");
                    stdArr[cnt] = new Student();
                    stdArr[cnt].setStdNo(scanner.nextInt());
                    inputMidtermData("영어점수를 입력해주세요: ", "english", cnt);
                    inputMidtermData("수학점수를 입력해주세요:", "math", cnt);
                    inputMidtermData("국어점수를 입력해주세요:", "korean", cnt);

                } else if (input == 2) {
                    for (int i = 0; i < stdArr.length; i++) {
                        if (stdArr[i] == null) {
                            break;
                        }
                        System.out.println(stdArr[i].getStdNo() + "번 님의");
                        System.out.println("중간 고사 평균 점수: " + stdArr[i].getMidtermAverage());
                        System.out.println("중간 고사 순위: ");
                    }
                    break;
                }
                cnt++;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            scanner.close();
        }
    }

    public static void inputMidtermData(String text, String subject, int cnt) {
        try {
            InputStreamReader inputReader = new InputStreamReader(System.in);
            BufferedReader bufferedReader = new BufferedReader(inputReader);
            System.out.println(text);
            if ("english".equals(subject)) {
                stdArr[cnt].setMidtermEnglish(Integer.parseInt(bufferedReader.readLine()));
            } else if ("math".equals(subject)) {
                stdArr[cnt].setMidtermMath(Integer.parseInt(bufferedReader.readLine()));
            } else if ("korean".equals(subject)) {
                stdArr[cnt].setMidtermKorean(Integer.parseInt(bufferedReader.readLine()));
            }
            System.out.println(subject + "의 점수가 입력되었습니다.");
        } catch (Exception e) {
            e.printStackTrace();
//            JOptionPane.showMessageDialog(null, "에러가 발생하였습니다.", "에러", JOptionPane.ERROR_MESSAGE);
        }
    }
}
