function solution(my_string) {
    return my_string.trim().split(' ').filter(word => word !== "");
}