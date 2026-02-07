
    public class ClassAverage {

        public static void main(String[] args) {

            double avg1 = calculateClassAverage(70, 90);
            System.out.println("Average of 2 scores: " + avg1);

            double avg2 = calculateClassAverage(60, 75, 90);
            System.out.println("Average of 3 scores: " + avg2);

            double[] scores = {80, 70, 60, 90};
            double avg3 = calculateClassAverage(scores);
            System.out.println("Average of array: " + avg3);
        }

        public static double calculateClassAverage(double a, double b) {
            return (a + b) / 2;
        }

        public static double calculateClassAverage(double a, double b, double c) {
            return (a + b + c) / 3;
        }

        public static double calculateClassAverage(double[] scores) {
            double sum = 0;
            for (double s : scores) {
                sum += s;
            }
            return sum / scores.length;
        }
    }


