package activity53;

import java.util.Scanner;

public class Test {
    public static Scanner scanner = new Scanner(System.in);
    public static Scanner textScan = new Scanner(System.in);

    public static void main(String[] args) {
        int n;
        System.out.println("Nhập số lượng từ trong tử điển:");
        n = scanner.nextInt();
        String keyInput;
        String valueInput;
        String typeInput;
        Word[] words = new Word[n];
        System.out.println("***************************************");
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập từ thứ " + (i + 1));
            System.out.println("Nhập từ trong từ điển: ");
            keyInput = textScan.nextLine();
            System.out.println("Nhập nghĩa của từ trong từ điển: ");
            valueInput = textScan.nextLine();
            System.out.println("Loại từ điển (chỉ nhập: AV (Anh Việt) hoặc VA (Việt Anh): ");
            typeInput = textScan.nextLine();
            words[i] = new Word(keyInput, valueInput, typeInput);
            System.out.println("***************************************");
        }
        //Tìm kiếm nghĩa của từ theo key và type
        Dictionary dictionary = new Dictionary(words);
        System.out.println("Nhập key va type tra nghĩa của từ");
        System.out.println("Nhập key: ");
        keyInput = textScan.nextLine();
        System.out.println("Nhập type: ");
        typeInput = textScan.nextLine();
        Word mean = dictionary.findWords(typeInput, keyInput);
        System.out.println("Nghĩa của từ " + mean.getKey() + " của loại tử điển " + mean.getType() + " là: " + mean.getValue());
        //Đếm số từ AV và VA
        System.out.println("***************************************");
        CountVocabulary countVocabulary = dictionary.countVocabulary();
        System.out.println("Số từ AV: " + countVocabulary.getCountAV());
        System.out.println("Số từ VA: " + countVocabulary.getCountVA());
    }
}
