def merge(list1, list2):
    merge_list = []
    i = 0
    j = 0
   
    while i < len(list1) and j < len(list2):
        if list1[i] < list2[j]:
            merge_list.append(list1[i])
            i += 1
        else:
            merge_list.append(list2[j])
            j += 1
           
    if i == len(list1):
        merge_list += list2[j:]
    elif j == len(list2):
        merge_list += list1[i:]
    else:
        pass
    return merge_list
  
# 합병 정렬
def merge_sort(my_list):
    # 여기에 코드를 작성하세요
    if len(my_list) <= 1:
        return my_list
    else:
        left_half = my_list[0:len(my_list)//2]
        right_half = my_list[len(my_list)//2:]
       
    return merge(sorted(left_half),sorted(right_half))
  
# 테스트 코드
print(merge_sort([1, 3, 5, 7, 9, 11, 13, 11]))
print(merge_sort([28, 13, 9, 30, 1, 48, 5, 7, 15]))
print(merge_sort([2, 5, 6, 7, 1, 2, 4, 7, 10, 11, 4, 15, 13, 1, 6, 4]))
