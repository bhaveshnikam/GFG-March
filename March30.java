public static int minimumInteger(int N, int[] A) {

        // code here

        // Initialize minimum value to the maximum possible value

    int minVal = Integer.MAX_VALUE;

    long sum = 0; // Initialize sum to zero

    for (int val : A) {

        sum += val; // Calculate the sum of all values in the array

    }

    for (int val : A) {

        // Calculate N multiplied by each value in the array

        long product = (long) N * val;

        // Check if the product is greater than or equal to the sum of all values

        if (product >= sum) {

            // Update the minimum value if the condition is met

            minVal = Math.min(minVal, val);

        }

    }

    return minVal; // Return the minimum value

    }
