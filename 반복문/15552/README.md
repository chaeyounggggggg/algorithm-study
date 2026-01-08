## 문제 정보
- 유형: 반복문

## 문제 요약
BufferedReader, BufferedWriter 를 사용해서 빠르게 입력받고 출력하는 문제

## 접근 아이디어

## 헷갈렸던 점
BufferedReader, BufferedWriter를 잘 몰라서 어려웠다.

## 복잡도

## 회고
BufferedReader는 한 줄 단위로 문자열을 읽는 입력 클래스이다<br>
내부에 버퍼를 둬서 한꺼번에 읽어 속도가 매우 빠르고 대량 입력에 최적이다.<br>
readLine()은 항상 String 이니 변환이 필요하다는것!!<br>
<br>
StringTokenizer은 문자열을 공백 기준으로 나눠준다. BufferedReader는 줄 단위 입력이니 공백이 들어가는 입력은 String Tokenizer로 분리해야한다.<br>
<br>
BufferedWriter는 출력 내용을 모아뒀다가 한 번에 출력하는것
.flush()를 해야 출력이 나온다!!
