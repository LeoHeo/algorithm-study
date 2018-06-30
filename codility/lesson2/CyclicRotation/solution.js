// you can write to stdout for debugging purposes, e.g.
// console.log('this is a debug message');

function solution(A, K) {
    // index + k < length ? index + k : (index + k) % (length + 1)
    const length = A.length - 1
    let result = []
    
    if (K < 0 || K > 100) {
      throw new Error('invalid K')    
    }
    
    A.forEach((v, i) => {
      const newIndex = i + K < length ? i + K : (i + K) % (length + 1)
      result[newIndex] = v
    })
    
    return result
}