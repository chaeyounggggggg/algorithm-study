## 문제 정보
- 유형: 문자열

## 문제 요약
문자열의 첫글자와 마지막 글자를 출력하기

## 접근 아이디어
charAt 함수를 사용해서 첫글자는 0으로 마지막글자는 길이-1로 출력하자

## 헷갈렸던 점
System.out.print(s.charAt(0));<br>
System.out.print(s.charAt(s.length()-1));<br>
이거를 System.out.println  한줄로 출력하려고하니 아스키코드 더하기가 되어서 print 로 분리해서 출력했다.
## 복잡도

## 회고
"" + char + char로 하면 문자열로 변환된다.