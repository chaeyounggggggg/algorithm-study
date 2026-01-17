## 문제 정보
- 유형: 심화1

## 문제 요약
단어가 주어졌을때 몇개의 크로아티아 알파벳으로 이루어져있는지 출력

## 접근 아이디어
조건문으로 다음 문자를 확인해서 개수 세기

## 헷갈렸던 점
문자열 범위 체크를 하지 않았다

## 복잡도

## 회고
항상 범위와 경계값을 생각하자<br>
좀더 쉽고 간단한 풀이<br>
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        String[] cro = {"dz=", "c=", "c-", "d-", "lj", "nj", "s=", "z="};

        for (String p : cro) {
            s = s.replace(p, "A"); // 아무 한 글자로 치환
        }

        System.out.println(s.length());
        sc.close();
    }
}
