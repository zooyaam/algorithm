function solution(today, terms, privacies) {
    const termObj = {};
    terms.forEach((term) => {
        const [type, period] = term.split(' ');
        termObj[type] = Number(period);
    });

    const getExpirationDate = (date, period) => {
        let expiration = new Date(date);
        expiration.setMonth(expiration.getMonth() + period);
        
        if (expiration.getDate() === 1) {
            expiration.setMonth(expiration.getMonth() - 1);
            expiration.setDate(28);
        } else {
            expiration.setDate(expiration.getDate() - 1);   
        }
        
        return expiration;
    }
    
    const result = [];
    for (let i = 0; i < privacies.length; i++) {
        let [collectDate, type] = privacies[i].split(' ');
        const period = termObj[type];
        
        const expirationDate = getExpirationDate(collectDate, period);
        const todayDate = new Date(today);
        
        if (expirationDate < todayDate) {
            result.push(i + 1);
        }
    }
    return result;
}