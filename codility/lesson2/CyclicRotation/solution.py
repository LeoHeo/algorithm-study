# you can write to stdout for debugging purposes, e.g.
# print("this is a debug message")

def solution(A, K):
    length = len(A) - 1
    result = []
    
    if (K < 0 or K > 100):
        raise ValueError('invalid K')
    
    for (i, v) in enumerate(A):
        newIndex = i + K < length and i +K or (i + K) % (length + 1)
        result.insert(newIndex, v)
        
    return result