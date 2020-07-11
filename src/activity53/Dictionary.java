package activity53;

public class Dictionary {
    private Word[] words;

    public Dictionary(Word[] words) {
        this.words = words;
    }

    public Dictionary() {
    }

    public Word[] getWords() {
        return words;
    }

    public void setWords(Word[] words) {
        this.words = words;
    }

    //Tìm nghĩa của từ theo key và value
    public Word findWords(String typeInut, String keyInput) {
        Word result = words[0];
        String mean = words[0].getValue();
        for (Word word : words) {
            if ((word.getType().equals(typeInut)) && (word.getKey().equals(keyInput))) {
                result = word;
            }
        }
        return result;
    }

    //Đếm số luuwojgn từ VA và AV
    public CountVocabulary countVocabulary() {
        int numberVA = 0;
        for (Word word : words) {
            if (word.getType().equals("VA")) {
                numberVA++;
            }
        }
        int numberAV = words.length - numberVA;
        CountVocabulary result = new CountVocabulary(numberVA, numberAV);
        return result;
    }
}
