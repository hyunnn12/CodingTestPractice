class Solution {
    public String solution(String s) {
        String answer = "";
        String[] A=s.split(" ");
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<A.length;i++){
            if(Integer.parseInt(A[i])>max) max=Integer.parseInt(A[i]);
            if(Integer.parseInt(A[i])<min) min=Integer.parseInt(A[i]);
        }
        answer=min+" "+max;
        return answer;
    }
}

//answer라는 문자열을 받고 split(" ")으로 바로 나눌 수 있다. 그럼 문자열 배열을 새로 초기화를 시키지 않고
//바로 문자열 배열로 만들 수 있음. 

//Integer.MIN_VALUE, Integer.MAX_VALUE는 각각 최소값, 최대값이다.

//String배열을 바로 정수형인 배열로 바꾸려면 Integer.parseInt를 사용하여 바로 정수형으로 바꿀 수 있음.