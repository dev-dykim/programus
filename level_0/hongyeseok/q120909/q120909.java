package level_0.hongyeseok.q120909;

/**
 * 어떤 자연수를 제곱했을 때 나오는 정수를 제곱수라고 합니다.
 * 정수 n이 매개변수로 주어질 때, n이 제곱수라면 1을 아니라면 2를 return하도록 solution 함수를 완성해주세요.
 */
public class q120909 {
    public static void main(String[] args) {

    }
}

class Solution {
    public static int solution(int n){
        //제곱근을 한 후, 소수점 이하를 (int)로 제거
        int sqrtNumber = (int) Math.sqrt(n);
        //제거된 소수점 이하의 숫자가 없다면 정수의 제곱수
        if(sqrtNumber * sqrtNumber == n){
            return 1;
        }
        return 2;
    }
}