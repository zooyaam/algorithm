function solution(video_len, pos, op_start, op_end, commands) {
    pos = transTime(pos);
    video_len = transTime(video_len);
    op_start = transTime(op_start);
    op_end = transTime(op_end);
    
    for (let command of commands) {
        pos = opening(pos, op_start, op_end);
        
        if (command === "next"){
            pos = next(pos, video_len);
        } else {
            pos = prev(pos);
        }
    }
    
    pos = opening(pos, op_start, op_end);
    return output(pos);
    
   function next(time,video_len){
       time += 10;
       if (time > video_len) return video_len;
       else return time;
   }
    
   function prev(time){
       time -= 10;
       if (time < 0) return 0;
       else return time;
   }
    
   function opening(time, op_start, op_end){
       if(time >= op_start && time <= op_end) return op_end;
       else return time;
   }
    
   function transTime(str){
      let [mm, ss] = str.split(":"); 
      let amount =  mm * 60 + ss * 1;
      return amount;
   }
    
   function output(time){
       let mm = parseInt(time / 60);
       let ss = time % 60;
       mm = String(mm).padStart(2, 0);
       ss = String(ss).padStart(2, 0);
       return `${mm}:${ss}`;
   }
}