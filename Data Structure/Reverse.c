#include <stdio.h>

int isPalindrome(int num) {
    int original = num, reversed = 0;

    while (num > 0) {
        int digit = num % 10; 
        reversed = reversed * 10 + digit;  
        num /= 10;  
    }

    return (original == reversed);
}

int main() {
    int number = 256;

    if (isPalindrome(number)) {
        printf("%d is a Palindrome.\n", number);
    } else {
        printf("%d is NOT a Palindrome.\n", number);
    }

    return 0;
}
