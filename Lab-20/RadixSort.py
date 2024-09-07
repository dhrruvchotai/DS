def radixSort(arr,n,place):
    output = [0] * n
    count = [0] * 10

    for i in range(0,n):
        count[(arr[i] // place)%10] += 1
    
    for i in range(1,10):
        count[i] += count[i-1]
    
    for i in range(n-1,-1,-1):
        output[count[(arr[i] // place) % 10] - 1] = arr[i]
        count[(arr[i] // place) % 10] -= 1
    
    return output

arr = [121,432,564,23,1,45,788]
m = max(arr)
place = 1

while(m // place > 0):
    arr = radixSort(arr,len(arr),place)
    place *= 10

print(arr)


