#include <stdio.h>

void main() {
	int i, j, n;
	n = 7;
	for (i = 1; i <= n; i++) {
		for (j = 1; j <= i; j++) {
			printf("%d", j);
		}
		printf("\n");
	}
}
