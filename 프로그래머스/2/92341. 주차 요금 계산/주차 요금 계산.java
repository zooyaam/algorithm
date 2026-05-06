import java.util.*;

class Solution {
    class Car {
        String in; // 입차시각
        int sum; // 누적시간
        
        public Car (String in, int sum) {
            this.in = in;
            this.sum = sum;
        }
    }
    
    public int[] solution(int[] fees, String[] records) {
        Map<String, Car> map = new HashMap<>();
        
        for (String record : records) {
            String[] arr = record.split(" ");
            String time = arr[0];
            String num = arr[1];
            String inout = arr[2];
            
            if (!map.containsKey(num)) {
                map.put(num, new Car(time, 0));
                continue;
            }
            
            Car car = map.get(num);
            
            if (inout.equals("IN")) {
                car.in = time;
            } else {
                car.sum += calcTime(car.in, time);
                car.in = null;
            }
        }
        
        // 출차 안 됨 처리
        for (Car car : map.values()) {
            if (car.in != null) {
                car.sum += calcTime(car.in, "23:59");
            }
        }
        
        // 차량 번호 오름차순 정렬
        List<String> keys = new ArrayList<>(map.keySet());
        Collections.sort(keys);
        
        // 주차요금 계산
        int[] result = new int[map.size()];
        int idx = 0;
        
        for (String key : keys) {
            Car car = map.get(key);
            int time = car.sum;
            
            int fee = 0;
            if (time <= fees[0]) {
                fee = fees[1];
            } else {
                fee = fees[1] + (int)Math.ceil((time - fees[0]) / (double)fees[2]) * fees[3];
            }
            
            result[idx++] = fee;
        }
        
        return result;
    }
    
    public int calcTime(String prev, String curr) {
        String[] t1 = prev.split(":");
        String[] t2 = curr.split(":");
        
        int m = Integer.parseInt(t2[1]) - Integer.parseInt(t1[1]);
        int h = Integer.parseInt(t2[0]) - Integer.parseInt(t1[0]);
        
        if (m < 0) {
            m += 60;
            h -= 1;
        }
        
        return h * 60 + m;
    }
}