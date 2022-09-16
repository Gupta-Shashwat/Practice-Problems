// Program 1: Find the highest integer in an array

// #include <stdio.h>
// #include <conio.h>

// void main() {
//     int arr[100], n, max, i;
//     printf("Enter the number of elements in the array: ");
//     scanf("%d", &n);
//     printf("Enter the elements of the array: ");
//     for (i = 0; i < n; i++) {
//         scanf("%d", &arr[i]);
//     }
//     max = arr[0];
//     for (i = 1; i < n; i++) {
//         if (max < arr[i]) 
//             max = arr[i];
//     }
//     printf("Highest element in the array = %d", max);
//     getch();
// }   


// Program 2: Linear Search

// #include <stdio.h>
// #include <conio.h>

// void main() {
//     int arr[100], n, i, x;
//     printf("Enter the number of elements in the array: ");
//     scanf("%d", &n);
//     printf("Enter the elements of the array: ");
//     for (i = 0; i < n; i++) {
//         scanf("%d", &arr[i]);
//     }
//     printf("Enter the element to be searched: ");
//     scanf("%d", &x);
//     for (i = 0; i < n; i++) {
//         if (x == arr[i]) {
//             printf("First occurence of this element was found at index = %d", i);
//             getch();
//             return;
//         }
//     }
//     printf("Element not found!!!");
//     getch();
// }  


// Program 3: Selection Sort

// #include <stdio.h>
// #include <conio.h>

// int * selectionSort(int arr[], int n) 
// {
//     int i, j, key, temp;
//     int * arrPointer = arr;
//     for (i = 0; i < n; i++) 
//     {
//         key = i;
//         j = i + 1;
//         while (j < n) 
//         {
//             if (arr[j] < arr[key]) 
//             {
//                 key = j;
//             }
//             j++;
//         }
//         temp = arr[i];
//         arr[i] = arr[key];
//         arr[key] = temp; 
//     }
//     return arrPointer;
// }

// void main() {
//     int arr[100], n, max, i;
//     printf("Enter the number of elements in the array: ");
//     scanf("%d", &n);
//     printf("Enter the elements of the array: ");
//     for (i = 0; i < n; i++) 
//     {
//         scanf("%d", &arr[i]);
//     }
//     int * arrPointer = selectionSort(arr, n);
//     printf("The sorted array (using selection sort) is: ");
//     for (i = 0; i < n; i++) 
//     {
//         printf("%d ", arrPointer[i]);
//     }
//     getch();
// }  


// Program 4: Insertion Sort

// #include <stdio.h>
// #include <conio.h>

// int * insertionSort(int arr[], int n) 
// {
//     int i, j, temp;
//     int * arrPointer = arr;
//     for (i = 0; i < n - 1; i++) 
//     {
//         for (j = i + 1; j > 0; j--) 
//         {
//             if (arr[j] < arr[j - 1]) 
//             {
//                 temp = arr[j];
//                 arr[j] = arr[j - 1];
//                 arr[j - 1] = temp;
//             }
//             else 
//             {
//                 break;
//             }
//         }
//     }
//     return arrPointer;
// }

// void main() 
// {
//     int arr[100], n, max, i;
//     printf("Enter the number of elements in the array: ");
//     scanf("%d", &n);
//     printf("Enter the elements of the array: ");
//     for (i = 0; i < n; i++) 
//     {
//         scanf("%d", &arr[i]);
//     }
//     int * arrPointer = insertionSort(arr, n);
//     printf("The sorted array (using insertion sort) is: ");
//     for (i = 0; i < n; i++) 
//     {
//         printf("%d ", arrPointer[i]);
//     }
//     getch();
// }


// Program 5: Bubble Sort

// #include <stdio.h>
// #include <conio.h>

// int * bubbleSort(int arr[], int n) 
// {
//     int i, j, temp;
//     int * arrPointer = arr;
//     for (i = 0; i < n; i++) 
//     {
//         for (j = 0; j < n - i - 1; j++) {
//             if (arr[j] > arr[j + 1])
//             {
//                 temp = arr[j];
//                 arr[j] = arr[j + 1];
//                 arr[j + 1] = temp;
//             }
//         }
//     }
//     return arrPointer;
// }

// void main() 
// {
//     int arr[100], n, max, i;
//     printf("Enter the number of elements in the array: ");
//     scanf("%d", &n);
//     printf("Enter the elements of the array: ");
//     for (i = 0; i < n; i++) 
//     {
//         scanf("%d", &arr[i]);
//     }
//     int * arrPointer = bubbleSort(arr, n);
//     printf("The sorted array (using bubble sort) is: ");
//     for (i = 0; i < n; i++) 
//     {
//         printf("%d ", arrPointer[i]);
//     }
//     getch();
// }