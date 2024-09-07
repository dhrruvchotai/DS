list = [5,1,12,-5,16,2,12,14,-1]


def selectionSort(list,n):
    for i in range(0,n-1):
        minIndex = i
        for j in range(i+1,n):
            if(list[j] < list[minIndex]):
                minIndex = j
        list[i],list[minIndex] = list[minIndex],list[i]
    return
            
    
selectionSort(list,len(list))
print("Sorted list using SelectionSort is : ",list)