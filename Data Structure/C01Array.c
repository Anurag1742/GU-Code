#include <stdio.h>
int main()
{
    int arr[] = {1, 2, 3, 4, 5};
    int n = sizeof(arr[0]);

    printf("Array Element: ");
    for (int i = 0; i <= n; i++)
    {
        printf("%d ", arr[i]);
    }
    return 0;
}


