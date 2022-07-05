class Solution {
    public long solution(long w, long h) {
        long ret =  (w * h) - (w + h - gcd(w, h));
        return ret > 0 ? ret : 0;
    }
    
    /**
    유클리드 호제법 구현
    두 양의 정수 a, b(a > b)에 대하여 a = bq + r(0 <= r < b)
    r == 0이라면, gcd(a, b) = b가 된다.
    a = bq1 + r1
    b = r1q2 + r2
    r1 = r2q3 + r3
    ...
    rn-1 = rnqn+1
    gcd(a, b) = rn
    **/
    private static long gcd(long a, long b) {
        if(a < 0 || b < 0) return 0;
        
        if(b > a) {
            a ^= b;
            b ^= a;
            a ^= b;
        }
        
        if(a % b != 0)
            return gcd(b, a % b);
        else
            return b;
    }
}
