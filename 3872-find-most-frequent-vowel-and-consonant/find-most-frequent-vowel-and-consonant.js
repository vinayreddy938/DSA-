var maxFreqSum = function(s) {
    const hmap = new Map();
    let maxVowel = 0;
    let maxCons = 0;

    // Count frequencies
    for (let i = 0; i < s.length; i++) {
        const ch = s[i];
        if (hmap.has(ch)) {
            hmap.set(ch, hmap.get(ch) + 1);
        } else {
            hmap.set(ch, 1);
        }
    }

    // Check max vowel and consonant
    for (let [ch, freq] of hmap.entries()) {
        if (ch === 'a' || ch === 'e' || ch === 'i' || ch === 'o' || ch === 'u') {
            if (freq > maxVowel) {
                maxVowel = freq;
            }
        } else {
            if (freq > maxCons) {
                maxCons = freq;
            }
        }
    }

    return maxCons + maxVowel;
};
