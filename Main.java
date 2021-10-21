package geekbrains.JavaCore.org;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws MyArraySizeException, MyArrayDataException {

        String[][] a = new String[][]{
                {"1", "2", "4", "5"},
                {"3", "4", "1", "4"},
                {"6", "2", "5", "1"},
                {"1", "f", "f", "6s"}
        };
        try {
            System.out.println(transferToNumber(a));
        } catch (MyArrayDataException e) {
            System.out.println("Нельзя преобразовать");
        }
        catch (MyArraySizeException e) {
            System.out.println("Нельзя выходить за рамки массива");
        }
    }


    public static int transferToNumber (String[][] a) throws MyArrayDataException, MyArrayDataException{
            int num = 0;
            for (int i = 0; i < a.length; i++) {
                if (a.length != 4) {
                    throw new MyArraySizeException("Нельзя выходить за рамки массива");
                }
                for (int j = 0; j < a.length; j++) {
                    if (a.length != 4) {
                        throw new MyArraySizeException("Нельзя выходить за рамки массива");
                    }
                    try {
                        num += Integer.parseInt(a[i][j]);
                    } catch (NumberFormatException e) {
                        throw new MyArrayDataException("Нельзя преобразовать");
                    }
                }
            }
            return num;
        }
    }














