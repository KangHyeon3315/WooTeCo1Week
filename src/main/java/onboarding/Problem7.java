package onboarding;

import java.util.*;

public class Problem7 {

    /** 친구 관계 리스트를 각 유저를 Key로 가지는 친구 List Map으로 변환 */
    private static Map<String, List<String>> analyzeFirendsInfo(List<List<String>> friends) {
        return null;
    }

    /** 친구의 친구인 경우 친구 가산점을 추가하는 함수*/
    private static void updateFriendsScore(String user, Map<String, List<String>> friendsMap, Map<String, Integer> scoreInfo) {

    }

    /** 방문자의 방문 가산점을 추가하는 함수 */
    private static void updatVisitorScore(Map<String, Integer> scoreInfo, List<String> userFriends, List<String> visitors) {

    }

    /** 해당 점수의 유저 List를 반환하는 함수 */
    private static List<String> getScoreUserList(Map<String, Integer> scoreInfo, int score) {
        return Collections.emptyList();
    }

    /** 추천할 친구 List를 반환하는 함수 */
    private static List<String> extractSuggestionFriends(Map<String, Integer> scoreInfo) {
        return Collections.emptyList();
    }
    public static List<String> solution(String user, List<List<String>> friends, List<String> visitors) {
        List<String> answer = Collections.emptyList();
        return answer;
    }
}
