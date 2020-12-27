#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#define W 0
#define V 1
#define N 5
#define MAX_CAPACITY 1000
#define MAX(a,b) a>b ? a:b;

int dp[N][MAX_CAPACITY];
int items[N][2] = {
    {5,8},
    {8,11},
    {3,3},
    {4,6},
    {2,4}
};

int knapsack(int pos, int capacity) {
    if (pos == N) return 0;

    int ret = dp[pos][capacity];
    if (ret != -1) return ret;
    if (items[pos][W] <= capacity)
        ret = knapsack(pos + 1, capacity - items[pos][W])
        + items[pos][V];
    ret = MAX(ret, knapsack(pos + 1, capacity));
    return dp[pos][capacity] = ret;
}
int main() {
    int capacity = 15;
    memset(dp, -1, sizeof(dp));

    printf("knapsack(%d,%d)=%d\n", 0, capacity, knapsack(0, capacity));
    return 0;
}