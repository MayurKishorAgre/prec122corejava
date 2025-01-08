package in.prec.logicalprograms.pyramid;

public class Pyramids {
    int limit;

    // Default constructor
    public Pyramids() {
    }

    // Parameterized constructor
    public Pyramids(int limit) {
        this.limit = limit;
    }

    // Set limit method
    public void setLimit(int limit) {
        this.limit = limit;
    }

    // Get limit method
    public int getLimit() {
        return limit;
    }

    // Print pyramid method
    public void printPyramid() {
        int number = 1;

        // Loop through each row
        for (int row = 1; row <= limit; row++) {
            // Print spaces for pyramid alignment
            for (int space = 1; space <= limit - row; space++) {
                System.out.print("\t"); // Print tabs for spaces
            }

            // Print numbers for the current row
            for (int col = 1; col <= row; col++) {
                System.out.print(number++ + "\t"); // Print numbers and separate them with tabs
            }

            // Move to the next line after each row
            System.out.println();
        }
    }
}
							