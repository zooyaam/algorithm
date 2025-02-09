function solution(chicken) {
    let totalService = 0;
    let coupon = chicken;
    
    while (coupon >= 10) {
        let service = Math.floor(coupon / 10);
        totalService += service;
        coupon = service + Math.floor(coupon % 10);
    }
    
    return totalService;
}