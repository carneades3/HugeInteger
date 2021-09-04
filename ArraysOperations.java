/* 
 *  utility class for operations on the arrays
 */

public class ArraysOperations {
   public static int getMismatchValueIndex(final byte[] ARRAY, int fromIndex, byte value) {
      if (null == ARRAY) {
         throw new NullPointerException("Requirement: reference to array can not be null");
      }

      for (int index = fromIndex; index < ARRAY.length; index++) {
         if (value != ARRAY[index]) {
            return index;
         }
      }

      return -99;
   }
}
