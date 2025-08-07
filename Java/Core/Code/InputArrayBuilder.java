import java.util.*;

public class InputArrayBuilder {

    private static final Scanner sc = new Scanner(System.in);
    private static final List<String> inputList = new ArrayList<>();

    private static void getInputArray() {
        System.out.println("Enter values one by one (type 'exit' to stop):");
        while (true) {
            String input = sc.nextLine().trim();
            if (input.equalsIgnoreCase("exit")) break;
            inputList.add(input);
        }
    }

    public static Object buildArray(String type) {
        getInputArray();
        return switch (type.toLowerCase()) {
            case "int" -> buildIntArray();
            case "double" -> buildDoubleArray();
            case "boolean" -> buildBooleanArray();
            case "long" -> buildLongArray();
            case "short" -> buildShortArray();
            case "float" -> buildFloatArray();
            case "byte" -> buildByteArray();
            case "char" -> buildCharArray();
            case "string" -> buildStringArray();
            default -> throw new IllegalArgumentException("Unsupported type: " + type);
        };
    }

    private static int[] buildIntArray() {
        int[] result = new int[inputList.size()];
        for (int i = 0; i < inputList.size(); i++) {
            result[i] = Integer.parseInt(inputList.get(i));
        }
        return result;
    }

    private static double[] buildDoubleArray() {
        double[] result = new double[inputList.size()];
        for (int i = 0; i < inputList.size(); i++) {
            result[i] = Double.parseDouble(inputList.get(i));
        }
        return result;
    }

    private static boolean[] buildBooleanArray() {
        boolean[] result = new boolean[inputList.size()];
        for (int i = 0; i < inputList.size(); i++) {
            result[i] = Boolean.parseBoolean(inputList.get(i));
        }
        return result;
    }

    private static long[] buildLongArray() {
        long[] result = new long[inputList.size()];
        for (int i = 0; i < inputList.size(); i++) {
            result[i] = Long.parseLong(inputList.get(i));
        }
        return result;
    }

    private static short[] buildShortArray() {
        short[] result = new short[inputList.size()];
        for (int i = 0; i < inputList.size(); i++) {
            result[i] = Short.parseShort(inputList.get(i));
        }
        return result;
    }

    private static float[] buildFloatArray() {
        float[] result = new float[inputList.size()];
        for (int i = 0; i < inputList.size(); i++) {
            result[i] = Float.parseFloat(inputList.get(i));
        }
        return result;
    }

    private static byte[] buildByteArray() {
        byte[] result = new byte[inputList.size()];
        for (int i = 0; i < inputList.size(); i++) {
            result[i] = Byte.parseByte(inputList.get(i));
        }
        return result;
    }

    private static char[] buildCharArray() {
        char[] result = new char[inputList.size()];
        for (int i = 0; i < inputList.size(); i++) {
            result[i] = inputList.get(i).charAt(0);
        }
        return result;
    }

    private static String[] buildStringArray() {
        return inputList.toArray(new String[0]);
    }
}
