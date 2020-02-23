/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 10.    An array is called centered-15 if some consecutive sequence of elements of the array sum to 15 and this sequence is preceded and followed by the same number of elements.  For example 
 {3, 2, 10, 4, 1, 6, 9} is centered-15 because  the sequence 10, 4, 1 sums to 15 and the sequence is preceded by two elements (3, 2) and followed by two elements(6,9).

 Write a method called isCentered15 that returns 1 if its array argument is centered-15, otherwise it returns 0.

 the function prototype is
 int isCentered15(int[ ] a)

 Examples
 if a is                  return                                               reason
 {3, 2, 10, 4, 1, 6, 9}     1           the sequence 10, 4, 1 sums to 15 and is preceded by 2 elements and followed by 2 elements. Note that there is another sequence that sums to 15 (6,9}. It is okay for the array to have more than one sequence that sums to 15 as long as at least one of them is centered.
 {2, 10, 4, 1, 6, 9}        0           (10, 4, 1) is preceded by one element but followed by two.  (9,6) is preceded by five elements but followed by none. Hence neither qualify as centered.
 {3, 2, 10, 4, 1, 6}                    (10, 4, 1) is preceded by two elements but followed by one. Note that the values 3, 2, 4, 6 sum to 15 but they are not consecutive.
 {1,1,8, 3, 1, 1}                       The entire array sums to 15, hence the sequence is preceded by zero elements and followed by zero elements.
 {9, 15, 6}                 1           the sequence (15) is preceded by one element and followed by one element.
 {1, 1, 2, 2, 1, 1}         0           no sequence sums to 15.
 {1, 1, 15 -1,-1}           1           there are three different sequences that sum to 15, the entire array, (1, 15, -1) and (15). In this case they all are centered but the requirement is that just one of them has to be.



 */
package Assignments;

/**
 *
 * @author Dell
 */
public class Question_10 {

    private int sum;

    public int isCentered15(int[] a) {
        for (int i = 0; i <= (a.length / 2); i++) {
            sum = 0;
            for (int j = i; j < (a.length - i); j++) {
                sum += a[j];
            }
            if (sum == 15) {
                return 1;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Question_10 _10 = new Question_10();
//        int a[] = {1, 1, 15 - 1, -1};
//        int a[]={3, 2, 10, 4, 1, 6, 9};
        int a[] = {2, 10, 4, 1, 6, 9};
        System.out.println(_10.isCentered15(a));
    }

}
