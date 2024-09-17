arr = [21,38,29,17,4,25,11,32,9]

def shellSort(arr,n):
    gap = n // 2

    while gap > 0:

        for i in range(gap,n):#start the loop from gap like in insertionSort u start from index 1.
            anchor = arr[i] 
            j = i

            while j >= gap and arr[j-gap] > anchor:
                arr[j] = arr[j-gap]
                j = j - gap
            arr[j] = anchor
            
        gap = gap // 2

    return arr

ans = shellSort(arr,len(arr))
print(ans)
