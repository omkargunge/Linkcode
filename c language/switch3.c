#include <stdio.h>

int main() {
    int ch, c, ct;
    int total = 0;
    float cgst, sgst, finaltotal;
    int cnt = 0;
    int repeatMainMenu = 1;

    do {
        printf("\n------------- MAIN MENU -------------");
        printf("\n1 - Starter\n2 - Veg\n3 - Non-Veg\n0 - Exit & Generate Bill");
        printf("\nEnter your choice: ");
        scanf("%d", &ch);

        switch (ch) {
            case 1: // Starter Menu
                do {
                    printf("\n--------- STARTER MENU ---------");
                    printf("\n1 - Manchurian         : 150");
                    printf("\n2 - Paneer Chilli      : 250");
                    printf("\n3 - Soya Chilli        : 300");
                    printf("\nEnter your order number: ");
                    scanf("%d", &c);

                    switch (c) {
                        case 1: total += 150; break;
                        case 2: total += 250; break;
                        case 3: total += 300; break;
                        default: printf("\nInvalid order number"); continue;
                    }

                    cnt++;
                    printf("Order #%d placed", cnt);

                    printf("\nDo you want to add another starter? (1-Yes / 0-No): ");
                    scanf("%d", &ct);
                } while (ct == 1);
                break;

            case 2: // Veg Menu
                do {
                    printf("\n----------- VEG MENU -----------");
                    printf("\n1 - Paneer Butter Masala : 200");
                    printf("\n2 - Veg Biryani          : 180");
                    printf("\n3 - Dal Tadka            : 150");
                    printf("\nEnter your order number: ");
                    scanf("%d", &c);

                    switch (c) {
                        case 1: total += 200; break;
                        case 2: total += 180; break;
                        case 3: total += 150; break;
                        default: printf("\nInvalid order number"); continue;
                    }

                    cnt++;
                    printf("Order #%d placed", cnt);

                    printf("\nDo you want to add another veg item? (1-Yes / 0-No): ");
                    scanf("%d", &ct);
                } while (ct == 1);
                break;

            case 3: // Non-Veg Menu
                do {
                    printf("\n--------- NON-VEG MENU ----------");
                    printf("\n1 - Chicken Curry       : 250");
                    printf("\n2 - Mutton Biryani      : 300");
                    printf("\n3 - Fish Fry            : 220");
                    printf("\nEnter your order number: ");
                    scanf("%d", &c);

                    switch (c) {
                        case 1: total += 250; break;
                        case 2: total += 300; break;
                        case 3: total += 220; break;
                        default: printf("\nInvalid order number"); continue;
                    }

                    cnt++;
                    printf("Order #%d placed", cnt);

                    printf("\nDo you want to add another non-veg item? (1-Yes / 0-No): ");
                    scanf("%d", &ct);
                } while (ct == 1);
                break;

            case 0:
                repeatMainMenu = 0;
                break;

            default:
                printf("\nInvalid main menu choice.");
                break;
        }
    } while (repeatMainMenu == 1);

    // Bill Summary
    cgst = total * 0.09; // 9% CGST
    sgst = total * 0.09; // 9% SGST
    finaltotal = total + cgst + sgst;

    printf("\n------------- BILL SUMMARY -------------");
    printf("\nItems Ordered      : %d", cnt);
    printf("\nSubtotal           : %.2f", (float)total);
    printf("\nCGST @9%%           : %.2f", cgst);
    printf("\nSGST @9%%           : %.2f", sgst);
    printf("\nTotal Bill Amount  : %.2f", finaltotal);
    printf("\n----------------------------------------");
    printf("\nThank you! Visit again!\n");

    
}