    #include <stdio.h>

int main() {
    int ch1, ch2, ct;
    float input, result;

    printf("\nCurrency Conversion");
    printf("\n1 - Rupee\n2 - Dollar\n3 - Euro");
    printf("\nEnter your base currency choice: ");
    scanf("%d", &ch1);

    switch (ch1) {
        case 1:  // Rupee to other currencies
        rupee:
            printf("Enter amount in Rupees: ");
            scanf("%f", &input);

            printf("\nConvert Rupees to:");
            printf("\n1 - Rupee\n2 - Dollar\n3 - Euro");
            printf("\nEnter your choice: ");
            scanf("%d", &ch2);

            switch (ch2) {
                case 1: // Rupee to Rupee
                    result = input;
                    printf("\n%.2f Rupee = %.2f Rupee", input, result);
                    break;
                case 2: // Rupee to Dollar
                    result = input / 85.75;
                    printf("\n%.2f Rupee = %.2f Dollar", input, result);
                    break;
                case 3: // Rupee to Euro
                    result = input / 100.29;
                    printf("\n%.2f Rupee = %.2f Euro", input, result);
                    break;
                default:
                    printf("\nInvalid choice for conversion.");
            }

            printf("\nDo you want to convert Rupees again? Press 1 for Yes: ");
            scanf("%d", &ct);
            if (ct == 1) {
                goto rupee;
            }
            break;

        case 2:
            // Placeholder for Dollar conversion logic
            printf("\nDollar conversion not yet implemented.");
            break;

        case 3:
            // Placeholder for Euro conversion logic
            printf("\nEuro conversion not yet implemented.");
            break;

        default:
            printf("\nInvalid base currency choice.");
    }

    return 0;
}
