import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

//        TODO 1)
//        utwórz tablicę ocen z jednego przedmiotu
//        wydrukuj tablicę
//        przypisz do kilku jej elementów oceny
//        wydruje je
//        oblicz średnią ocen nie używając funkcji wbudowanych
//        pokaż średnią ocen

        int[] grades = new int[10];
        grades[0] = 5;
        grades[1] = 3;
        grades[2] = 5;
        grades[3] = 4;
        grades[4] = 3;
        double average = 0;
        int amount = 0;
        for (int i = 0; i < grades.length; i++) {
            System.out.print(grades[i] + ", ");
            if (grades[i] != 0) {
                average += grades[i];
                amount++;
            }

        }
        System.out.println("Średnia ocen wynosi " + average/amount);
        System.out.println();

//        TODO 2)
//        utwórz tablicę ocen z 5 przedmiotów
//        wpisz przykładowe dane
//        oblicz średnie ocen z każdego przedmiotu
//        oblicz średnią ocen ze wszystkich przedmiotów

        int[][] subjectGrades = new int[5][];
        subjectGrades[0] = new int[] {3,5,2,4};
        subjectGrades[1] = new int[] {3};
        subjectGrades[2] = new int[] {5,2,4};
        subjectGrades[3] = new int[] {5,5};
        subjectGrades[4] = new int[] {3,2,4};

        double averageSub = 0;
        double averageOneSub = 0;
        int amountOneGrade = 0;
        int amountAllGrades = 0;
        for (int i = 0; i < subjectGrades.length; i++){
            for (int j = 0; j < subjectGrades[i].length; j++) {

                System.out.print(subjectGrades[i][j] + ", ");
                averageOneSub += subjectGrades[i][j];

                amountOneGrade++;
                amountAllGrades++;
            }
            averageSub += averageOneSub;
            System.out.println();
            System.out.printf("\nŚrednia ocen z %d przedmiotu wynosi %.2f\n",
                    i, averageOneSub/amountOneGrade);
            amountOneGrade = 0;
            averageOneSub = 0;
        }

        System.out.printf("\nŚrednia ocen ze wszystkich przedmiotów wynosi %.2f\n",
                averageSub/amountAllGrades);

//        TODO 3)
//        utwórz tablicę przynajmniej 6 nazwisk i miejscowości kolegów z twojej grupy
//        wydrukuj informację Uczeń ... pochodzi z ..."
//        spośród wszystkich elementów wydrukuj tylko te, które pochodzą z Tarnobrzega

        System.out.println();
        String[][] friendsLocation = {
            {"Bąk", "Żupawa"},
            {"Bukowski", "Tarnobrzeg"},
            {"Kozieł", "Żupawa"},
            {"Wasilkowski", "Tarnobrzeg"},
            {"Konieczny", "Tarnobrzeg"},
            {"Bernyś", "Tarnobrzeg"}
        };
        for (String[] student : friendsLocation){
            if(student[1].equals("Tarnobrzeg")){
                System.out.println("Uczeń " + student[0] + " pochodzi z " + student[1]);
            }
        }


//        TODO 4) biorąc pod uwagę dowolną tablicę int, wypisz ile razy w niej występuje liczba 7?

        int[] Numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 6, 7};
        int numbersCount = 0;
        for (int i = 0; i < Numbers.length; i++) {
            if (Numbers[i] == 7) {
                numbersCount++;
            }
        }
        System.out.println("Liczba 7 występuje " + numbersCount + " razy");


//        TODO 5) wypisz true, gdy w tablicy pojawi się sekwencja kolejnych liczb 1, 2, 3

        boolean sequence;
        for (int i = 0; i < Numbers.length; i++) {
            if (Numbers[i] == 1 && Numbers[i + 1] == 2 && Numbers[i + 2] == 3) {
                sequence = true;
                if (sequence = true) {
                    System.out.println("Występuje sekwencja 1, 2, 3");
                    break;
                } else {
                    System.out.println("Nie występuje sekwencja 1, 2, 3");
                }
            }
        }

//        TODO 6) wypisz true gdy tablica nie zawiera żadnych trójek identycznych liczb po kolei

        boolean identicalSequence;
        for (int i = 0; i < Numbers.length; i++) {
            if (Numbers[i] == Numbers[i+1] && Numbers[i] == Numbers[i+2]) {
                identicalSequence = true;
                System.out.println(identicalSequence);
                break;
            } else {
                identicalSequence = false;
                System.out.println(identicalSequence);
                break;
                }
            }

//        TODO 7) wypisz true, gdy jeden z pierwszych 4 elementów tablicy wynosi 5 (tablica może mieć mniejszy rozmiar)

        boolean checkForFive;
        for (int i = 0; i < 4; i++){
            if(Numbers[i] == 5){
                checkForFive = true;
                System.out.println(checkForFive);
                break;
            } else {
                checkForFive = false;
                System.out.println(checkForFive);
                break;
            }
        }
//        TODO 8) biorąc pod uwagę tablicę policz ile razy wystapi w niej sekwencja cyfry 6 i kolejnej 6 bądź 7

        int complexNumbersCount = 0;
        for (int i = 0; i < Numbers.length; i++){
            if (Numbers[i] == 6 && Numbers[i+1] == 6 || Numbers[i] == 6 && Numbers[i+1] == 7){
                complexNumbersCount++;
            }
        }
        System.out.println("Sekwencja liczb 6 i 6 lub 6 i 7 występuje " + complexNumbersCount + " razy");

    }
}
