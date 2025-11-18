#include <stdio.h>

int main() {
    int ch, c;
    float radius, base, height, circlearea, trianglearea, length, width, rectanglearea;

menu:
    printf("\n\t----------- Menu Application ------------");
    printf("\n1 - Area of Circle");
    printf("\n2 - Area of Triangle");
    printf("\n3 - Area of Rectangle");
    printf("\nEnter your choice: ");
    scanf("%d", &ch);

    if (ch == 1) { 
        printf("Enter radius of circle: ");
        scanf("%f", &radius);
        circlearea = 3.14 * radius * radius;
        printf("\nArea of circle is: %.2f", circlearea);
    }
    else if (ch == 2) { 
        printf("Enter base and height of triangle: ");
        scanf("%f%f", &base, &height);
        trianglearea = 0.5 * base * height;
        printf("\nArea of triangle is: %.2f", trianglearea);
    }
    else if (ch == 3) { 
        printf("Enter length and width of rectangle: ");
        scanf("%f%f", &length, &width);
        rectanglearea = length * width;
        printf("\nArea of rectangle is: %.2f", rectanglearea);
    }
    else {
        printf("\nInvalid choice. Please select 1, 2, or 3.");
    }

    printf("\nDo you want to continue? Press 1 for Yes: ");
    scanf("%d", &c);

    if (c == 1) {
        goto menu;
    }

    printf("\n------------- Thank You ----------\n");
    return 0;
}
