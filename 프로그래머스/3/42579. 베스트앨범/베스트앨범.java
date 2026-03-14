import java.util.*;

class Solution {
    public int[] solution(String[] genres, int[] plays) {
        Map<String, Integer> genreTotalPlay = new HashMap<>();
        Map<String, List<int[]>> genreSongs = new HashMap<>();
        
        for (int i = 0; i < genres.length; i++) {
            genreTotalPlay.put(genres[i], genreTotalPlay.getOrDefault(genres[i], 0) + plays[i]);
            
            genreSongs.putIfAbsent(genres[i], new ArrayList<>());
            genreSongs.get(genres[i]).add(new int[]{i, plays[i]});  // [고유번호, 재생수]
        }
        
        
        // 장르 정렬 (내림차순)
        List<String> sortedGenre = new ArrayList<>(genreTotalPlay.keySet());
        sortedGenre.sort((a, b) -> genreTotalPlay.get(b) - genreTotalPlay.get(a));
        
        List<Integer> album = new ArrayList<>();
        
        for (String genre : sortedGenre) {
            List<int[]> songs = genreSongs.get(genre);
            
            songs.sort((a, b) -> {
                if (b[1] != a[1]) return b[1] - a[1];
                return a[0] - b[0];  // 재생수가 같을 경우, 고유번호 오름차순 정렬
            });
            
            for (int i = 0; i < songs.size() && i < 2; i++) {
                album.add(songs.get(i)[0]);
            }
        }
        
        return album.stream().mapToInt(i -> i).toArray();
    }
}