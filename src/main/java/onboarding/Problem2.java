package onboarding;

public class Problem2 {

    /**
     * 연속되는 중복 문자의 idx 반환
     */
    private static int getDuplicateCharIdx(String cryptogram) {
        for (int i = 0; i < cryptogram.length() - 1; i++) {
            char left = cryptogram.charAt(i);
            char right = cryptogram.charAt(i + 1);

            if (left == right) {
                return i;
            }
        }
        return -1;
    }

    /**
     * 연속되는 중복 문자의 갯수 반환
     */
    private static int getDuplicateCharCount(String cryptogram, int idx) {
        char checkChar = cryptogram.charAt(idx);
        int duplicateCount = 0;
        for (int i = idx; i < cryptogram.length(); i++) {
            char ch = cryptogram.charAt(i);
            if (checkChar == ch) {
                duplicateCount++;
            } else {
                break;
            }
        }
        return duplicateCount;
    }

    /**
     * 주어진 범위의 문제열을 제거하는 함수
     */
    private static String removeStringRange(String cryptogram, int idx, int count) {
        return cryptogram.substring(0, idx) + cryptogram.substring(idx + count);
    }


    public static String solution(String cryptogram) {
        String processedCryptogram = cryptogram;

        int idx = getDuplicateCharIdx(processedCryptogram);
        while (idx >= 0) {
            int duplicateCount = getDuplicateCharCount(processedCryptogram, idx);

            processedCryptogram = removeStringRange(processedCryptogram, idx, duplicateCount);

            idx = getDuplicateCharIdx(processedCryptogram);
        }

        return processedCryptogram;
    }
}
