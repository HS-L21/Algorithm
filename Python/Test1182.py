def dfs(dep, sum) :
    global cnt
    if dep == N : 
        if sum == S : 
            cnt +=1
        return
    
    dfs(dep + 1, sum + arr[dep])
    dfs(dep + 1, sum)

N, S = map(int, input().split())
arr = list(map(int, input().split()))

cnt = 0

dfs (0, 0)

print(cnt -1 if S == 0 else cnt)
