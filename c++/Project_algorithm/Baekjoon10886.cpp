#include <stdio.h>

int main() {
	int input = 0;
	scanf("%d", &input);
	int ycnt = 0, ncnt = 0;
	for (int i = 0; i < input; i++) {
		int n = 0;
		scanf("%d", &n);
		if (n == 0) ycnt++;
		else ncnt++;
	}
	printf(ncnt > ycnt ? "Junhee is cute!" : "Junhee is not cute!");
	return 0;
}