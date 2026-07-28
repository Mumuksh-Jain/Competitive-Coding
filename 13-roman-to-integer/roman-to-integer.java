class Solution {
    public int romanToInt(String s) {
        char[] arr = s.toCharArray();
        int result = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == 'I') {
                if (i < arr.length - 1 && (arr[i + 1] == 'V' || arr[i + 1] == 'X'))
                    result -= 1;
                else
                    result += 1;
            }

            if (arr[i] == 'V')
                result += 5;

            if (arr[i] == 'X') {
                if (i < arr.length - 1 && (arr[i + 1] == 'L' || arr[i + 1] == 'C'))
                    result -= 10;
                else
                    result += 10;
            }

            if (arr[i] == 'L')
                result += 50;

            if (arr[i] == 'C') {
                if (i < arr.length - 1 && (arr[i + 1] == 'D' || arr[i + 1] == 'M'))
                    result -= 100;
                else
                    result += 100;
            }

            if (arr[i] == 'D')
                result += 500;

            if (arr[i] == 'M')
                result += 1000;
        }

        return result;
    }
}