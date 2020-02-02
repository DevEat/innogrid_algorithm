import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
소트인사이드 80ms : BufferedReader로 변경만 했을 뿐인데도 24ms 빨라짐

속도 측면에서 빠른 풀이들은 BufferedReader를 사용
Scanner와의 차이점을 알아보고 기존 코드와 비교해보자.

- 공통점
문자열을 입력 받는데 사용

- 차이점
1. Scanner의 버퍼 크기는 1024 chars, BufferedReader는 8192 chars
2. BufferReader는 문자열을 단순히 읽고 저장, Scanner는 문자열을 구분하여 분석
3. BufferReader는 동기화 된다. 반면 Scanner는 동기화가 되지 않음
4. BufferReader는 즉시 IOException 처리를 던지지만, Scanner는 숨김

- Scanner 특징
1. Scanner sc = new Scanner(System.in);
3.  java.util 패키지 내에 포함된 Class로
공란과 줄바꿈을 모두 입력값의 경계로 인식하기 때문에 좀 더 쉽게 데이터를 입력받을 수 있도록 해줌
데이터 타입이 입력 받는 시점에서 결정되므로 별도의 Casting이 필요하지 않음

- BufferedReader 특징
1. 주로 InputStreamReader와 사용됨
InputStreamReader는 문자열을 Character 단위(한 글자)로 읽으므로
길이가 긴 문자열을 읽을 땐 비효율적이라서 BufferedReader가 존재
2. 사용자의 요청이 있을 때 버퍼에서 데이터를 읽어오는 방식으로 동작
그렇기 때문에 속도가 향상되고 시간 부하가 적음
BufferedReader는 입력을 라인단위로 입력 받기 때문에 공백의 경우에도 String으로 인식하여 받아들이며,
입력받은 데이터 타입이 String 타입이므로 다른 타입의 데이터라면 이후 형변환이 필요
 */
public class Main2 {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String input = br.readLine();
        char[] chs = input.toCharArray();

        for (int i = 0; i < chs.length - 1; i++) {
            for(int j = i; j < chs.length ; j++){
                if(Character.getNumericValue(chs[i]) < Character.getNumericValue(chs[j])){
                    char temp = chs[i];
                    chs[i] = chs[j];
                    chs[j] = temp;
                }
            }
        }

        System.out.println(String.valueOf(chs));
    }
}