package lec05;

public class Lec05Main {

    public static void main(String[] args) {
    }

    private void validateScoreIsNotNegative(int score) {
        if (score < 0) {
            throw new IllegalArgumentException(String.format("%s cannot be less than 0.", score));
        }
    }

    private String getPassOrFail(int score) {
        if (score >= 50) {
            return "P";
        } else {
            return "F";
        }
    }

    // 3항연산자 방식
    private String getPassOrFail2(int score) {
        return score >= 50 ? "P" : "F";
    }

    private String getGrade(int score) {
        if (score >= 90) {
            return "A";
        } else if (score >= 80) {
            return "B";
        } else if (score >= 70) {
            return "C";
        } else {
            return "D";
        }
    }

    private String getGradeWithSwitch(int score) {
        switch (score / 10) {
            case 9:
                return "A";
            case 8:
                return "B";
            case 7:
                return "C";
            default:
                return "D";
        }
    }

    private boolean startsWithA(Object obj) {
        if (obj instanceof String) {
            return ((String) obj).startsWith("A");
        } else {
            return false;
        }
    }

    private void judgeNumber(int number) {
        if (number == 1 || number == 0 || number == -1) {
            System.out.println("1, 0, -1");
        } else {
            System.out.println("Not 1, 0, -1");
        }
    }

    private void judgeNumber2 (int number) {
        if (number == 0) {
            System.out.println("0");
            return;
        }

        if (number % 2 == 0) {
            System.out.println("even");
            return;
        }
        System.out.println("add");
    }
}