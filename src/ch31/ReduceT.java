package ch31;

import java.util.Arrays;
import java.util.List;

public class ReduceT {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);


        System.out.println(
                numbers.stream()
                        .reduce(0, (i1, i2) -> i1 + i2));
        // reduce는 default값을 줄 수 있다.
        // 내 코드에 문제가 생기면 (왼쪽)0을 리턴해라.

        // 연산한 결과를 앞에 넣어서 누적시킨다.

        List<String> strs = Arrays.asList("안녕하세요", "Hello", "good morning");
        var maxLengthStr = strs.stream().reduce((s1, s2) -> {
            return s1.length() > s2.length() ? s1 : s2;
        });

    maxLengthStr.ifPresent(System.out::println);
    // ifPresent = 있으면출력해라.

        }
    }

