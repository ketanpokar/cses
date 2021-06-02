import java.util.HashSet;
import java.util.Set;

public class PossibleSubstrings {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
//        Scanner sca = new Scanner(System.in);
//        String s = sca.nextLine();
        String s = "dbabcccbcdbbbadabbdabaabcbbabaacdadcdbbbbdddbcbbbcbcabacacdaadaadcdccbacdaadadcbaacabbddabdadcabbccadacadaaacbbddaaababacaabbbacaccbcbbabddbbcccaaacbcdcabcbacdbddcdcadaaadcbccbbcabbcbdaadcbddaacacdadacbbdabcdcdadccaccdbdddddcabdbcdbaadacadadbabdcdbbadaacdbadcdabdbbcabbbdaacaaaaadcaabaaaadabaaddcaabdddcbcadcbdbbdbcbcdbadcadacbbcdccddaccccacbacaacbbdadadcacabdabadbbcdbcaaccdbdcabcadbacbccddbabbdacbcbbcbcabcacdaacccaadcdbdccabcaaacaddadcabacdccaaaddaaadbccdbbcccdddababcdbcddcbdddbbbdaadaccbcaabbcbdbadbabbacdbbbdaaccdcabddacadabcccacdabacbcdbcbdabddacacbdbcaacacaabbaaccddabaadbbaabaddbcacbacdbbbacdccabbcdbbbdbdbbcacabdddbdbaaabbcdcbabcbbbccdcdcdcaaddadccbabbacaddcaddcadcdccaccacabbaababdbbcbdcdccccccdadbdbdcdbdadcdcacdaabaacabaacdacdbaaccadbcddbdccabbcabcadcbdadbcdadbbbccacbcbbcaaaabdacbadacaadcadaacdacddcbbabdacacaabccdaccbbcbbcbcaacdabdcbcdbccdbcbcbddaacdacaaaddcaddcadccacbaddbbbccbbbcbbcbadcabbccbbaadaacacabddbdbddcadbdaaccadbcccabdcdbadbbacbcbbcdcabcddcddddabddbdabdcabdbdbbbcdbcdabbdcb";
        Set<String> subStrings = new HashSet<>();
        int count = 0;

//        int stringLength = s.length();
//        for(int i = 1 ; i <= stringLength ; i++) {
//            for(int j = 0 ; j <= stringLength - i ; j++) {
//                String curSubString = s.substring(j, j + i);
//                //System.out.println(curSubString);
//                if(i <= 2 ) {
//                    if(i == 1) {
//                        subStrings.add(curSubString);
//                        count++;
//                    } else if(curSubString.charAt(0) == curSubString.charAt(1)){
//                        subStrings.add(curSubString);
//                        count++;
//                    }
//                } else {
//                    String subSubString = curSubString.substring(1, i - 1);
//                    if(subStrings.contains(subSubString)) {
//                        if(curSubString.charAt(0) == curSubString.charAt(i - 1)){
//                            count++;
//                            subStrings.add(curSubString);
//                        }
//                    }
//                }
//            }
//        }

        int stringLength = s.length();
        for(int i = 1 ; i <= stringLength ; i++) {
            StringBuilder builderSubString = null;
            for(int j = 0 ; j <= stringLength - i ; j++) {

                if(builderSubString != null) {
                    builderSubString.deleteCharAt(0);
                    builderSubString.append(s.charAt(j + i - 1));
                } else {
                    builderSubString = new StringBuilder(s.substring(j, j + i));
                }
                //System.out.println(curSubString);
                if(i <= 2 ) {
                    if(i == 1) {
                        subStrings.add(builderSubString.toString());
                        count++;
                    } else if(builderSubString.charAt(0) == builderSubString.charAt(1)){
                        subStrings.add(builderSubString.toString());
                        count++;
                    }
                } else {
                    String subSubString = builderSubString.substring(1, i - 1);
                    if(subStrings.contains(subSubString)) {
                        if(builderSubString.charAt(0) == builderSubString.charAt(i - 1)){
                            count++;
                            subStrings.add(builderSubString.toString());
                        }
                    }
                }
            }
        }

        System.out.println("Palindrome Count : " + count + ". Time taken : " + (System.currentTimeMillis() - startTime));
    }
}
